package com.jktech.TestNG;

import org.testng.annotations.Test;

public class Priority {
	
	//Default priority A-Z and a-z and if priority set externally then -value to +Value
	//Priority can be set using priority attribute
	
	@Test
	public void beforeSuite() {
		System.out.println("From BeforeSuite");
	}
	
	@Test
	public void AfterSuite() {
		System.out.println("From AfterSuite");
	}
	
		//with priority
		
		@Test(priority=0)
		public void b() {
			System.out.println("From method b");
		}
		
		@Test(priority=10)
		public void A() {
			System.out.println("From method A");
		}
			
			@Test(priority=-10, enabled=false)
			public void Z() {
				System.out.println("From method Z");}
				
				@Test(priority=-3, dependsOnMethods = "A")
				public void Y() {
					System.out.println("From method Y");
		
	}

}
