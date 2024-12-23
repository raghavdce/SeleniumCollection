package com.selenium.testngpractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CreateAPopUp {
	
	
	@Test
	public void jsExample() {
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("alert('Welcome To Sotware testing help');");
		String Text = js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(Text);
		
	}

}
