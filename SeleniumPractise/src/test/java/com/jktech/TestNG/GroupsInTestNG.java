package com.jktech.TestNG;

import org.testng.SkipException;
import org.testng.annotations.*;

public class GroupsInTestNG {
	
	@Test(dependsOnGroups = "A")
	public void method1() {
		System.out.println("from method 1");
	}
	
	@Test(groups = "A") // run this method with skip exception first
	public void method2() {
		//throw new SkipException("method 2 is skipped");
		System.out.println("from group A and method 2");
	}
	
	
	  @Test(groups = "B") 
	  public void method3() {
	  System.out.println("from method 3"); }
	 
}
