package com.RestAssured.Basics;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import com.RestAssued.pojo.GetCourses;
import com.RestAssued.pojo.WebAutomation;

import io.restassured.path.json.JsonPath;

public class OAuthExampleWithPOJO {

	public static void main(String[] args) {
		
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
		
		GetCourses gc= given()
				.queryParams("access_token", accessToken)
				.when()
				.get("https://rahulshettyacademy.com/oauthapi/getCourseDetails")
				.then().log().all().extract().response().as(GetCourses.class);

		System.out.println(gc.getInstructor());
		System.out.println(gc.getLinkedIn());
		
		//to get the title of api course
		System.out.println(gc.getCourses().getApi().get(1).getCourseTitle());
		
		//to get the price of Protractor course from web ui automation
		
		List<WebAutomation> webUI = gc.getCourses().getWebAutomation();
		
		for(int i=0; i<webUI.size(); i++) {
			if(webUI.get(i).getCourseTitle().equalsIgnoreCase("Protractor")) {
				System.out.println(webUI.get(i).getPrice());
			}
		}
		
		//to get all course title of web automation
		
		List<WebAutomation> web = gc.getCourses().getWebAutomation();
		
		for(int i=0;i<web.size();i++) {
			System.out.println("The course title at " + i +"th index is : " + web.get(i).getCourseTitle());
		}
		
		//to compare the course title are matching with a array
		
		String a[]= {"Selenium Webdriver Java","Cypress","Protractor"};
		List<String> expectedList = Arrays.asList(a);
		
		//creating a new list to store the captured content from the for loop
		List<String> actual = new ArrayList<>();
		
		
		for(int i=0;i<web.size();i++) {
			actual.add(web.get(i).getCourseTitle());
		}
		
		Assert.assertEquals(expectedList, actual);

	}

}
