package com.selenium.testngpractice;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=1)
	public void A() {
		System.out.println("From A");
	}
	
	@Test(priority=0)
	public void Z() {
		System.out.println("From Z");
	}

	
	@Test(priority=-1)
	public void G() {
		System.out.println("From G");
	}

	
	@Test(priority=-10)
	public void d() {
		System.out.println("From d");
	}

	
	@Test
	public void a() {
		System.out.println("From a");
	}


}
