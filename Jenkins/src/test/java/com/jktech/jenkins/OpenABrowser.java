package com.jktech.jenkins;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenABrowser {
	
	// ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF.
	
	Logger log = org.apache.logging.log4j.LogManager.getLogger(OpenABrowser.class.getName());
	
	
	@Test
	public void openABrowser() {
		
		WebDriverManager.chromedriver().setup();
		log.info("Setting the driver path");
		WebDriver driver = new ChromeDriver();
		log.error("Setting the browser");
		driver.manage().window().maximize();
		log.fatal("Setting the browser");
		driver.get("https://www.saucedemo.com/");
		log.warn("Setting the browser");
		driver.quit();
		log.debug("Setting the browser");
		
	}

}
