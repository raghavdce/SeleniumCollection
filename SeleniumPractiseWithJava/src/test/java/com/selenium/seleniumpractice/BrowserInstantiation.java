package com.selenium.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInstantiation {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		
	
		 
		
		//To launch a browser using firefox
		driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/");
		Thread.sleep(2000);
		driver.quit();
		
		 
		
		//To launch a browser using Ms Edge
		driver = new EdgeDriver();
		driver.navigate().to("https://demo.nopcommerce.com/");
		Thread.sleep(2000);
		driver.quit();
		

	}

}
