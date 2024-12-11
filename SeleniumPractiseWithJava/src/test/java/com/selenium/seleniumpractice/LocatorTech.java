package com.selenium.seleniumpractice;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatorTech {

	public static void main(String[] args) throws IOException {
		
		/*
		 * System.setProperty("webdriver.edge.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\msedgedriver.exe"
		 * ); WebDriver driver = new EdgeDriver();
		 * driver.navigate().to("https://www.rpachallenge.com/");
		 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
		 * //driver.findElement(By.id("user-name")).clear();
		 * //driver.findElement(By.id("gAzxM")).sendKeys("selenium");
		 * driver.findElement(By.
		 * xpath("//label[contains(text(),'Role in Company')]/following::input[1]")).
		 * sendKeys("selenium");
		 */
		
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.saucedemo.com/");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.partialLinkText("No")).click();
		 */
		
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.saucedemo.com/");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.cssSelector("input#user-name")).sendKeys("selenium");
		 */
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://demoqa.com/text-box");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.cssSelector("textarea.form-control")).sendKeys(
		 * "selenium");
		 */
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.google.com/"); driver.manage().window().maximize();
		 * driver.findElement(By.tagName("input")).sendKeys("selenium");
		 */
		
		//xpath with attribute key and its values
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.google.com/"); driver.manage().window().maximize();
		 * driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium")
		 * ;
		 */
		
		//xpath with contains
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://demo.guru99.com/test/selenium-xpath.html");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.xpath("//*[contains(@value,'LOGINsk')]")).click();
		 */
			
		
		//Xpath with starts-with
				/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://demoqa.com/text-box");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[starts-with(@class,' mr-sm-2')]")).sendKeys("Selenium");*/
			
				
				/*
				 * System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe"
				 * ); WebDriver driver = new ChromeDriver();
				 * driver.get("https://www.saucedemo.com/");
				 * driver.manage().window().maximize(); File source =
				 * driver.findElement(By.id("user-name")).getScreenshotAs(OutputType.FILE); File
				 * dest = new File(".\\Screenshots\\web.png");
				 * org.openqa.selenium.io.FileHandler.copy(source, dest);
				 */
				  //System.out.println(rect.getX());
				 		
		
		
					/*
					 * System.setProperty("webdriver.chrome.driver",
					 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe"
					 * ); WebDriver driver = new ChromeDriver();
					 * driver.get("https://demoqa.com/text-box");
					 * driver.manage().window().maximize();
					 * driver.findElement(By.xpath("//input[starts-with(@placeholder,'name')]")).
					 * sendKeys("Selenium");
					 */
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Ctrl+sft+o --> to import a package
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/checkbox");
		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		
		
		
		
				
	}
	
	
	

}
