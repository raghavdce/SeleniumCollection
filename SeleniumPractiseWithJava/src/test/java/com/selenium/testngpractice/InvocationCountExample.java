package com.selenium.testngpractice;

import org.testng.annotations.Test;

public class InvocationCountExample {
	
	
	@Test(invocationCount = 10)
	public void A() {
		System.out.println("From A");
	}
	
	
}
