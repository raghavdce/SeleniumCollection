package com.selenium.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Ctrl+sft+o --> to import a package
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		
		/*
		 * Alert alert = driver.switchTo().alert(); alert.sendKeys("Selenium");
		 * alert.dismiss(); try { Thread.sleep(2000); } catch (InterruptedException e) {
		 * }
		 */
		  // TODO Auto-generated catch block e.printStackTrace(); }
		 // driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		  Alert alert1 = driver.switchTo().alert();
		  alert1.sendKeys("Selenium");
		  alert1.accept();
		  driver.switchTo().defaultContent();
		  driver.findElement(By.xpath("//button[@id='runbtn']")).click();
		 

	}

}
