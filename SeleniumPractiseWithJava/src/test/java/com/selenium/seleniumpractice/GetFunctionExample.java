package com.selenium.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFunctionExample {

	public static void main(String[] args) throws InterruptedException {
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
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		String page = driver.getPageSource();
		String msg = driver.findElement(By.xpath("//h3[contains(text(),'Basic Auth')]")).getText();
		
		System.out.println("The title of the page is : "+title);
		System.out.println("The url of the page is : "+url);
		System.out.println("The msg displayed is : "+ msg);
		System.out.println("The page source displayed is : \n"+ page);
		driver.quit();


	}

}
