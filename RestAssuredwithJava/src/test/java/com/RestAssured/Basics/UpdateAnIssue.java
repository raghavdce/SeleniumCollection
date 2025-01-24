package com.RestAssured.Basics;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


//this is not working
public class UpdateAnIssue {
	
	@Test
	public void updateIssue() {
		
		RestAssured.baseURI = "https://raapi.atlassian.net/";
		
		String createResponse = given().header("Content-Type","application/json").pathParam("key", "10009")
		.header("Accept","application/json")		
		.header("Authorization","Basic cmFnaGF2ZGNlQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjAxOFhGd05ua3liMVk2dFk0a3NJa2o2SzdXVDMzRzF4bjYyelFvdEhoVkE0NzV2S1lCbzc4SG1rUHRBTGh1ckVfdnlNaWJsZlZ3WkZEZ01rdEJhcmRpZ1BjQ0hyRTVTWU5mckNQaUlfSDZSMHdENVYzeGVFMFY0Y1pHYzRuVThHci1KQWVyVE8yTU5lUFpYeDhmRkJzN3B5Sk1RaUlPOTNYUkwyVWc4SGhIM009NDBBMDM0QTU=")
		.body("{\r\n"
				+ "   \"update\": {\r\n"
				+ "       \"summary\": \"[{\"set\" : \"Big block Chevy\"}]\",\r\n"
				+ "   }\r\n"
				+ "}").log().all()
		.when().post("/rest/api/2/issue/{key}")
		.then().log().all().assertThat().statusCode(200).extract().response().asString();
		
	}

}
