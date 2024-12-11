package com.selenium.testngpractice;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class AlwaysRunExampleinDependsOnMethod {
	
	//testng will skip the test which is having depends on methods tag, if the respective 
	//method throws exception. to handle use always run = true

	
	@Test(dependsOnMethods = {"b"})
	public void F() {
		System.out.println("From method F");
	}
	
	@Test(dependsOnMethods = "d", alwaysRun = true)
	public void E() {
		System.out.println("From method E");
	}
	
	@Test
	public void b() {
		System.out.println("from method b");
	}
	
	@Test
	public void C() {
		System.out.println("from method C");
	}
	
	@Test 
	  public void d() {
	  throw new SkipException("Skip exception");
	  }
	
	
}
