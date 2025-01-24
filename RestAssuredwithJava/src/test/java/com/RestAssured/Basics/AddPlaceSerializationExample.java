package com.RestAssured.Basics;

import java.util.ArrayList;
import java.util.List;

import com.RestAssued.pojo.AddPlacePOJO;
import com.RestAssued.pojo.LocationForAddPlace;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;

public class AddPlaceSerializationExample {
	

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
		
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		given().log().all().header("Content-Type","application/json").queryParam("key", "qaclick123")
		.body(add)
		.when().post("/maps/api/place/add/json")
		.then().log().all().assertThat().statusCode(200);

	}

}
