package com.RestAssured.Basics;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.RestAssured.Payloads.Payload;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class AddBook {
	
	//@Test   we can not run this more than once bcoz it will fail with reason as book exists
	public void addBookTestWoParameter() {
		RestAssured.baseURI = "http://216.10.245.166";
		
		String addBookresponse = given().header("Content-Type","application/json")
		.body(Payload.addBookWoParameter())			
		.when().post("/Library/Addbook.php")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = Payload.rawToJson(addBookresponse);
		String bookID = js.get("ID");
		System.out.println(bookID);
	}
	
	//dynamically passing value from test case
	
	@Test
	public void addBookTest() {
		RestAssured.baseURI = "http://216.10.245.166";
		
		String addBookresponse = given().header("Content-Type","application/json")
		.body(Payload.addBook("abcd","1234"))			
		.when().post("/Library/Addbook.php")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		JsonPath js = Payload.rawToJson(addBookresponse);
		String bookID = js.get("ID");
		System.out.println(bookID);
	}
	
	@Test(dataProvider = "addBookData")
	public void addBookusingDataprovider(String isbn, String aisle) {
		
RestAssured.baseURI = "http://216.10.245.166";
		
		String addBookresponse = given().header("Content-Type","application/json")
		.body(Payload.addBook(isbn, aisle))			
		.when().post("/Library/Addbook.php")
		.then().assertThat().statusCode(200).extract().response().asString();
		JsonPath js = Payload.rawToJson(addBookresponse);
		String bookID = js.get("ID");
		System.out.println(bookID);
		
	}
	
	
	@DataProvider(name="addBookData")
	public Object[][] addBookDP(){
		
		return new Object[][] {{"xxxx","1245"},{"ssss","2233"},{"erdf","3412"}};
		
	}

}
