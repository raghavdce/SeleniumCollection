package com.selenium.testngpractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryClassLevel {
	
	@Test(retryAnalyzer = com.selenium.Analyzer.RetryAnalyzer.class)
	public void failTest() {
		System.out.println("Hello");
		Assert.assertEquals(false, true);
	}

}
