package com.RestAssured.Basics;

import org.testng.Assert;

import com.RestAssured.Payloads.MockPayload;

import io.restassured.path.json.JsonPath;

public class MockResponseExample {

	public static void main(String[] args) {

		JsonPath js = new JsonPath(MockPayload.mock());

		// 1. Print No of courses returned by API
		int coursesCount = js.getInt("courses.size()");
		System.out.println(coursesCount);

		// 2.Print Purchase Amount
		int purchaseAmt = js.getInt("dashboard.purchaseAmount");
		System.out.println(purchaseAmt);

		// 3. Print Title of the first course
		String coursename = js.getString("courses[0].title");
		System.out.println(coursename);

		// 4. Print All course titles and their respective Prices
		String title = "";
		int prices = 0;
		for (int i = 0; i < coursesCount; i++) {
			title = js.getString("courses["+i+"].title");
			prices = js.getInt("courses["+i+"].price");
			System.out.println(title+"-->"+prices);
		}

		// 5. Print no of copies sold by RPA Course
		for (int i = 0; i < coursesCount; i++) {
			if(js.getString("courses["+i+"].title").equalsIgnoreCase("RPA")) {
				int rpaCopies = js.getInt("courses["+i+"].copies");
				System.out.println("Rpa copies are : "+rpaCopies);
				break;
			}
			
		}

		// 6. Verify if Sum of all Course prices matches with Purchase Amount
		int sumOfPurchaseAmt=0;
		int purchaseAmount = js.getInt("dashboard.purchaseAmount");
		for (int i = 0; i < coursesCount; i++) {
			int amount = js.getInt("courses["+i+"].copies")*js.getInt("courses["+i+"].price");
			sumOfPurchaseAmt = sumOfPurchaseAmt+amount;
				
			}
		System.out.println(sumOfPurchaseAmt);
		Assert.assertEquals(purchaseAmount, sumOfPurchaseAmt);
			
		}
		
	}


