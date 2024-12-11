package com.jktech.TestNG;

import org.junit.Assert;
import org.testng.annotations.*;

@Listeners({com.jktech.Utility.Listeners.class})
public class Annotations {
	
	@Test
	public void A() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void B() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void D() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void c() {
		Assert.assertTrue(true);
	}
	
	
	
	@Test
	public void E() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void F() {
		Assert.assertTrue(false);
	}
	
}
