package com.jktech.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Parameters {
	
	
	@Test
	@org.testng.annotations.Parameters({"username","password"})
	public void testparameters(String username, String password) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//Chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("login-button")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@DataProvider(name = "data")
	public Object[][] values() {
		Object[][] values = null;
		values = new Object[][]{{"standard_user","secret_sauce"},{"locked_out_user","secret_sauce"}};
		return values;

		
	}

}
