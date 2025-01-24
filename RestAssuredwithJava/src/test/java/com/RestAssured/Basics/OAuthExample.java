package com.RestAssured.Basics;

import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class OAuthExample {

	public static void main(String[] args) {
		// since oauth is secured one, we are making use of formparams instead of query or path param. Again this can
		//be different based on project basis, so we need to check with dev team

		String response =

				given()
						.formParams("client_id",
								"692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
						.formParams("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
						.formParams("grant_type", "client_credentials")
						.formParams("scope", "trust")
						.when().log().all()
						.post("https://rahulshettyacademy.com/oauthapi/oauth2/resourceOwner/token")
						.then().extract().response().asString();

		System.out.println(response);

		JsonPath jsonPath = new JsonPath(response);
		String accessToken = jsonPath.getString("access_token");
		System.out.println(accessToken);
		
		//we can directly call asString method in when() also instead of in then() as shown above when there are 
		//no activity with assertion
		
		//to get the output in string format, store the response as String else just response with return type as Response
		// we can print the response as it is without converting it into string. both will work
		//Response res = given()
			//	.queryParams("access_token", accessToken)
				//.when()
				//.get("https://rahulshettyacademy.com/oauthapi/getCourseDetails")
				//.then().log().all().extract().response();
		
		String res = given()
				.queryParams("access_token", accessToken)
				.when()
				.get("https://rahulshettyacademy.com/oauthapi/getCourseDetails")
				.then().log().all().extract().response().asString();

		System.out.println(res);
	}

}
