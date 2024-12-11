package com.selenium.testngpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class MethodsRunInParallel {
	
	@Test
	public void chromeTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		System.out.println("Current Thread is : "+Thread.currentThread().getId());
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	@Test
	public void EdgeTest() throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		System.out.println("Current Thread is : "+Thread.currentThread().getId());
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
