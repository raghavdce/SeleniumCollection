package com.jktech.jenkins;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class validLoginTest {
	
	// ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF.
	
	
	Logger log = org.apache.logging.log4j.LogManager.getLogger(validLoginTest.class.getName());
	
	@Test
	public void openABrowser() {
		
		WebDriverManager.chromedriver().setup();
		log.info("Setting the driver path");
		WebDriver driver = new ChromeDriver();
		log.info("Setting the browser");
		driver.manage().window().maximize();
		log.warn("set the browser to maximize mode");
		driver.get("https://www.saucedemo.com/");
		log.debug("Check the browser opened in maximized mode with correct url");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		log.error("Enter the user name");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		log.fatal("Enter the password");
		driver.findElement(By.id("login-button")).click();
		log.error("clicked the login button");
		driver.quit();
		log.info("closed the browser");
		
		
	}

}
