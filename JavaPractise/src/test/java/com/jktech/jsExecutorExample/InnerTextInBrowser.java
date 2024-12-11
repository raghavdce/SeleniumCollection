package com.jktech.jsExecutorExample;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class InnerTextInBrowser {
	
	@Test
	public void jsExample() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String Text = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(Text);
		Thread.sleep(3000);
		
		//to reload a webpage
		js.executeScript("location.reload()");
		
		//to get the document title
		String titleText = js.executeScript("return document.title;").toString();
		System.out.println(titleText);
		
	}

}
