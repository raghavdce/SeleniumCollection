package com.selenium.testngpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertsExample {
	
	//@Test
	public void hardAssert() {

		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		String browser = "ajdkashasd";
		Assert.assertEquals(driver.getTitle(), browser); 		//it is failed here hence the later code does not get executed
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		 
	}
	
	
	@Test
	public void softAssert() {

		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://phptravels.net/");
		String browser = "PHPTRAVELS | Travel";
		SoftAssert myassert = new SoftAssert();
		myassert.assertEquals(driver.getTitle(), browser);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		myassert.assertAll();
		
	}

}
