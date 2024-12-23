package com.selenium.testngpractice;

import org.testng.annotations.*;

public class OrderOfExecution {
	
	// 	https://www.youtube.com/watch?v=B7M3DdZIN6I
	
		


		@BeforeSuite
		public void beforeSuite() {
			System.out.println("From before suite");
		}

		@BeforeTest
		public void beforetest() {
			System.out.println("From before test");
		}
		
		@BeforeClass
		public void beforeclass() {
			System.out.println("From before class");
		}
		
		
		@BeforeMethod
		public void beforemethod() {
			System.out.println("From before method");
		}
		
		@Test
		public void atest() {
			System.out.println("From a test");
		}
		
		@Test
		public void btest() {
			System.out.println("From b test");
		}
		
		@AfterMethod
		public void aftermethod() {
			System.out.println("From after method");
		}
		
		@AfterClass
		public void afterclass() {
			System.out.println("From after class");
		}
		
		@AfterTest
		public void aftertest() {
			System.out.println("From after test");
		}
		
		@AfterSuite
		public void afterSuite() {
			System.out.println("From after suite");
		}

		
		
		
		
	

}
