package com.RestAssured.Utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {

	public static RequestSpecification req;
	public static JsonPath js ;

	public RequestSpecification addPlaceSpec() throws IOException {

		if (req == null) {
			PrintStream stream = new PrintStream(new FileOutputStream("log.txt"));
			req = new RequestSpecBuilder().addFilter(RequestLoggingFilter.logRequestTo(stream))
					.addFilter(ResponseLoggingFilter.logResponseTo(stream))
					.setBaseUri(ReadProperty.readDataFromProperty("baseuri")).addQueryParam("key", "qaclick123")
					.build();
			return req;
		}
		//this returns is for the method return type and code inside if block will get executed when it is not null
		return req;
	}

	
		
		public String getJsonPath(Response response, String key) {
			
			js = new JsonPath(response.asString());
			return js.get(key).toString();
			
		}

	
}
