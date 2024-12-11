package com.jktech.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Asserts {
	
	//@Test
	public void hardAssert() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//Chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		String actualText = driver.getTitle();
		Assert.assertEquals(actualText, "Google");
		System.out.println("After Hardassert");
		
	}
	
	@Test
	public void softAssert() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//Chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		String actualText = driver.getTitle();
		SoftAssert myassert = new SoftAssert();
		myassert.assertEquals(actualText, "Google");
		System.out.println("From SoftAssert");
		myassert.assertAll();
		
		
	}

}
