package com.RestAssured.Basics;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.RestAssured.Payloads.Payload;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class AddPlaceFromExternalFile {

	public static void main(String[] args) throws IOException {
		// When we to send data from external file, first we need to convert the file into bytes and then into string
		//bcoz body method will accept only string
		
		
RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		String response = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\Ragavendran.v\\eclipse-workspace\\RestAssuredwithJava\\src\\test\\java\\com\\RestAssured\\Data\\ExternalPayload.json"))))
		.when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
		.header("Server","Apache/2.4.52 (Ubuntu)").extract().response().asString();
		
		JsonPath js = new JsonPath(response);
		String placeID = js.getString("place_id");
		
		System.out.println(placeID);

	}

}
