package com.jktech.POMExample;

import org.testng.annotations.Test;

import com.jktech.POM.pages.HomePage;
import com.jktech.POM.pages.LoginPageClass;

public class HomePageTest extends BaseClass{
	
	
	
	LoginTest test;
	HomePage home;
	
	@Test
	public void clickAddCartFromHomePage() throws Exception {
		test = new LoginTest();
		test.validLoginTest();
		home = new HomePage(driver);
		home.clickAddCart();
		Thread.sleep(3000);
	}

}
