package com.jktech.POMExample;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jktech.POM.pages.LoginPageClass;

public class LoginTest extends BaseClass{

	LoginPageClass page;
	
	@Test(priority=0)
	public void validLoginTest() {
		page = new LoginPageClass(driver);
		page.setUserName("standard_user");
		page.setPassword("secret_sauce");
		page.clickLogin();
		String title = "Swag Labs";
		if(page.homepage()==true) {
			Assert.assertEquals(page.pageTitle(), title);
		}
		else {
			Assert.assertFalse(true);
		}
	}
	
	//@Test(priority=1)
	public void invalidLoginTest() {
		page = new LoginPageClass(driver);
		page.setUserName("locked_out_user");
		page.setPassword("secret_sauce");
		page.clickLogin();
		
		if(page.errorMessage()==true) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertFalse(true);
		}
	}
	
	
	
}
