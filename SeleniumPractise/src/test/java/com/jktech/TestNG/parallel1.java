package com.jktech.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class parallel1 {
	
	@Test
	public void chrome() {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Reporter.log("Browser instantiated");
		driver.manage().window().maximize();
		//Reporter.log("Window maximized");
		driver.get("https://www.saucedemo.com/");
		//Reporter.log("URl opened");
		
		
	}
	
	
	/*
	 * @Test public void edge() { System.setProperty("webdriver.edge.driver",
	 * ".\\Drivers\\msedgedriver.exe"); WebDriver driver1 = new EdgeDriver();
	 * driver1.manage().window().maximize();
	 * driver1.get("https://www.saucedemo.com/");
	 * 
	 * }
	 */

}
