package com.RestAssured.Basics;

import java.util.ArrayList;
import java.util.List;

import com.RestAssued.pojo.AddPlacePOJO;
import com.RestAssued.pojo.LocationForAddPlace;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class AddPlaceSpecBuilder {
	

	public static void main(String[] args) {

		//here we are going to send the json body as a java object which can be constructed using pojo
		
		AddPlacePOJO add = new AddPlacePOJO();
		add.setAccuracy(50);
		add.setAddress("29, side layout, cohen 09");
		add.setLanguage("French-IN");
		add.setName("Frontline house");
		add.setPhone_number("(+91) 983 893 3937");
		add.setWebsite("http://google.com");
		
		List<String> li = new ArrayList<>();
		li.add("shoe park");
		li.add("shop");
		add.setTypes(li);
		
		LocationForAddPlace loc = new LocationForAddPlace();
		loc.setLat(-38.383494);
		loc.setLng(33.427362);
		add.setLocation(loc);
		
		//gouping all common steps in request
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key","qaclick123")
								   .build();
		
		//Separating request from group
		RequestSpecification reqSpec = given().spec(req).body(add);
		
		//separating commong steps in then()
		ResponseSpecification resSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		//entire test case can be rewritten with reusable method as
		Response res = reqSpec.when().post("/maps/api/place/add/json").then().log().all().spec(resSpec).extract().response();
		
		

	}

}
