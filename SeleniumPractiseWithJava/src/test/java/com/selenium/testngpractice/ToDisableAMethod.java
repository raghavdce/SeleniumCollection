package com.selenium.testngpractice;

import org.testng.annotations.Test;

public class ToDisableAMethod {
	
	@Test(enabled = false)
	public void A() {
		System.out.println("From A");
	}

	@Test
	public void B() {
		System.out.println("From B");
	}
}
