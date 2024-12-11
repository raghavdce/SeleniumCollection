package com.selenium.testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners({Utility.Listeners.class})
public class Parameters {
	
	
	@Test//(dataProvider = "data")
	@org.testng.annotations.Parameters({"username","password"})
	public void parametersExample(String username, String password) {
		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
	}
	
	@DataProvider(name="data")
	public Object[][] datafromexternalmethod(){
		
		Object[][] obj = {{"standard_user","secret_sauce"},{"locked_out_user","secret_sauce"},{"problem_user","secret_sauce"}};
		return obj;
		
	}
	
	
	@DataProvider(name="data1")
	public Object[][] datafromexternalmethod1(){
		
		Object[][] obj = {{"secret_sauce"},{"secret_sauce"},{"secret_sauce"}};
		return obj;
		
	}

}
