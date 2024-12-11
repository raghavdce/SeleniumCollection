package com.jkteh.selenium4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TakeScreenShot {
	
	
	@Test
	public void takescreen() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]"));
		File src = logo.getScreenshotAs(OutputType.FILE);
		//File dest = new File(".\\Screenshots\\Logo.png");
		File dest = new File(".\\Screenshots\\Logo2.jpg");
		FileUtils.copyFile(src, dest);
		driver.quit();
	}
	
	




}