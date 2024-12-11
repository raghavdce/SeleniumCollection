package com.selenium.testngpractice;
import org.testng.annotations.Test;

public class groups {
	
	@Test(groups="A")
	public void A() {
		System.out.println("from method A");
	}
	
	@Test(groups="B")
	public void B() {
		System.out.println("from method B");
	}
	
	@Test(groups="A")
	public void C() {
		System.out.println("from method C");
	}

}
