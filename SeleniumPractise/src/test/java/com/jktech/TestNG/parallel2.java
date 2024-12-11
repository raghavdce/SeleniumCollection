package com.jktech.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class parallel2 {
	
	@Test
	public void chrome() {
		System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//Reporter.log("Browser instantiated");
		driver.manage().window().maximize();
		//Reporter.log("Window maximized");
		driver.get("https://www.saucedemo.com/");
		//Reporter.log("url is opened");
		
	}

}
