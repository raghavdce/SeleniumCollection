package com.selenium.testngpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class OrderOfExecutionOne {
	
	@Test
	public void ctest() {
		System.out.println("From c test");
	}
	
	@Test
	public void dtest() {
		System.out.println("From d test");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("From after class");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("From after test");
	}
}
