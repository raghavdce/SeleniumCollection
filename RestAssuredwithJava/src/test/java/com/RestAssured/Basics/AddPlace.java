package com.RestAssured.Basics;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;

import com.RestAssured.Payloads.Payload;

public class AddPlace {

	public static void main(String[] args) {
		
		// Add place
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String response = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(Payload.addPlacePayload())
		.when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("Server","Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		JsonPath js = new JsonPath(response);
		String placeID = js.getString("place_id");
		
		System.out.println(placeID);
		
		//Update Place using place id from add place api
		
		String updateAdd = "70 Summer walk, USA";
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeID+"\",\r\n"
				+ "\"address\":\""+updateAdd+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "")
		.when().put("/maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated"));
		
		//get place api // header is not required when there is no body
		
		String getResponse = given().log().all().queryParam("key", "qaclick123").queryParam("place_id",placeID)
		.when().get("/maps/api/place/get/json")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js1 = new JsonPath(getResponse);
		String newAddress = js1.getString("address");
		
		Assert.assertEquals(newAddress, updateAdd);

	}

}
