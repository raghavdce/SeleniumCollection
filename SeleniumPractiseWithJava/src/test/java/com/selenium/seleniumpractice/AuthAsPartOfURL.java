package com.selenium.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthAsPartOfURL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//to pass credentials the syntax is
		//http://username:password@[url]
		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(1000);
		driver.quit();

	}

}
