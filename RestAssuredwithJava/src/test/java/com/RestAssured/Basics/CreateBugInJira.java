package com.RestAssured.Basics;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class CreateBugInJira {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://raapi.atlassian.net/";
		
		String createResponse = given().header("Content-Type","application/json")
		.header("Authorization","Basic cmFnaGF2ZGNlQGdtYWlsLmNvbTpBVEFUVDN4RmZHRjAxOFhGd05ua3liMVk2dFk0a3NJa2o2SzdXVDMzRzF4bjYyelFvdEhoVkE0NzV2S1lCbzc4SG1rUHRBTGh1ckVfdnlNaWJsZlZ3WkZEZ01rdEJhcmRpZ1BjQ0hyRTVTWU5mckNQaUlfSDZSMHdENVYzeGVFMFY0Y1pHYzRuVThHci1KQWVyVE8yTU5lUFpYeDhmRkJzN3B5Sk1RaUlPOTNYUkwyVWc4SGhIM009NDBBMDM0QTU=")
		.body("{\r\n"
				+ "    \"fields\": {\r\n"
				+ "       \"project\":\r\n"
				+ "       {\r\n"
				+ "          \"key\": \"SCRUM\"\r\n"
				+ "       },\r\n"
				+ "       \"summary\": \"My first API Defect.\",\r\n"
				+ "       \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
				+ "       \"issuetype\": {\r\n"
				+ "          \"name\": \"Bug\"\r\n"
				+ "       }\r\n"
				+ "   }\r\n"
				+ "}\r\n"
				+ "").log().all()
		.when().post("/rest/api/2/issue")
		.then().log().all().assertThat().statusCode(201).extract().response().asString();
		
		JsonPath js = new JsonPath(createResponse);
		String issueID = js.get("id");
		System.out.println(issueID);

	}

}
