package com.selenium.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CssSelectorExample {

	public static void main(String[] args) {


		WebDriver driver  = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		driver.navigate().to("https://help.blazemeter.com/docs/guide/getting-started-continuous-testing-journey.html");

		//using id - tagname#value of id attribute or #value of Id attribute
		//using class - tagname.classnamevalue or .classname value
		//cascaded class or class with spaces- tagname.classname1.classname2 or .classname1.classname2
		//with one tag = input[id='username']
		//with two attributes - input[id='usernmae'][type='email']
		//id = test_123
		//to handle this, let use contains with format similar to xpath
		//input[id*=test]
		
		
		

	}

}
