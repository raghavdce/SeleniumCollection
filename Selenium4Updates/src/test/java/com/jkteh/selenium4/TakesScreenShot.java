package com.jkteh.selenium4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenShot {
	
	static WebDriver driver;
	
	@Test
	public void sampleTest() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		String title = driver.getTitle();
		if(title.equals("google")) {
			System.out.println("TC is passed");
		}
		else {
			System.out.println("TC is failed");
			takescreenshot();
			
		}
		
	}
	
	
	
	public static void takescreenshot() throws Exception {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(".\\Screenshots\\TC1.png");
		FileUtils.copyFile(src, dest);
		
	}

}
