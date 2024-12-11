package com.selenium.testngpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void parametersExample(String browser) throws InterruptedException {
		if(browser.equalsIgnoreCase("Chrome")) {
			//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		else if(browser.equalsIgnoreCase("edge")) {
			//System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			
		}
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.quit();
	}

}
