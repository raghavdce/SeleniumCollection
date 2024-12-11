package com.selenium.testngpractice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test(dependsOnMethods = {"b","d"})
	public void F() {
		System.out.println("From method A");
	}
	
	@Test(dependsOnMethods = "b")
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
	  System.out.println("from method d"); }
	 
}
