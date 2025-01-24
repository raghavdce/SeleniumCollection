package com.RestAssured.Basics;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.RestAssued.pojo.ECommerceOrder;
import com.RestAssued.pojo.EcommerceResponsePOJO;
import com.RestAssued.pojo.EcommerceTokenPOJO;
import com.RestAssued.pojo.OrderDetails;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class EcommerceWithToken {

	public static void main(String[] args) {
		
		
		RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
								   .setContentType(ContentType.JSON).build();
		
		EcommerceTokenPOJO obj = new EcommerceTokenPOJO();
		obj.setUserEmail("raghavdce@gmail.com");
		obj.setUserPassword("Rahulshetty@123");
		
		RequestSpecification reqSpec = given().spec(req).body(obj);

		EcommerceResponsePOJO res = reqSpec.when().post("/api/ecom/auth/login")
		.then().extract().response().as(EcommerceResponsePOJO.class);
		String token = res.getToken();
		System.out.println(res.getToken());
		String userId = res.getUserId();
		System.out.println(res.getUserId());
		
		//to add a product
		
		RequestSpecification addProdReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				   .addHeader("authorization",token).build();
		
		RequestSpecification actualAddProdReq = given().log().all().spec(addProdReq).param("productName","Laptop")
		.param("productAddedBy",userId).param("productCategory", "fashion")
		.param("productSubCategory", "shirts").param("productPrice","10000")
		.param("productDescription", "Lenova").param("productFor", "men")
		.multiPart("productImage",new File("D:\\Laptop.jpg"));
		
		String product = actualAddProdReq.when().post("/api/ecom/product/add-product").
		then().log().all().extract().response().asString();
		
		JsonPath js = new JsonPath(product);
		String productId = js.getString("productId");
		System.out.println(productId);
		
		//create order
		
		RequestSpecification createOrderReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				   .addHeader("authorization",token).setContentType(ContentType.JSON).build();
		
		//first setting the value for the keys in the sub json
		OrderDetails obj1 = new OrderDetails();
		obj1.setCountry("India");
		obj1.setProductOrderedId(productId);
		
		//creating a list as the ecommerce order class variable is of type list and passing the obj1 so that it will 
		//understand what keys to be added
		List<OrderDetails> list = new ArrayList<OrderDetails>();
		list.add(obj1);
		
		ECommerceOrder order = new ECommerceOrder();
		order.setOrders(list);
		
		RequestSpecification createOrderReqSpec = given().log().all().spec(createOrderReq).body(order);
		
		
		String responseOrder = createOrderReqSpec.when().post("/api/ecom/order/create-order").then().log().all()
				.extract().response().asString();
		System.out.println(responseOrder);
		
		//Delete Product
		
		RequestSpecification deleteReq = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
				   .addHeader("authorization",token).setContentType(ContentType.JSON).build();
		
		RequestSpecification deleteOrderReq=given().log().all().spec(deleteReq).pathParam("productId",productId);
		
		String deleteMsg = deleteOrderReq.when().delete("/api/ecom/product/delete-product/{productId}").then().log().all().extract().response()
		.asString();
		
		JsonPath js1 = new JsonPath(deleteMsg);
		System.out.println(js1.getString("message"));
	}
	

}
