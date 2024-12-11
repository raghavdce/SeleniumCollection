package com.selenium.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://demoqa.com/text-box"); String name =
		 * driver.findElement(By.id("userName")).getAccessibleName();
		 * System.out.println(name);
		 */
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://demoqa.com/radio-button"); String name =
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label")).getAriaRole();
		 * System.out.println(name);
		 */

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://demoqa.com/radio-button"); String name =
		 * driver.findElement(By.
		 * xpath("//div[contains(text(),'Do you like the site?')]//following::label[1]")
		 * ).getAttribute("for"); System.out.println(name);
		 */

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.saucedemo.com/"); String name =
		 * driver.findElement(By.id("login-button")).getCssValue("background-color");
		 * System.out.println(name);
		 */
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://demoqa.com/text-box"); String name =
		 * driver.findElement(By.id("currentAddress-label")).getText();
		 * System.out.println(name);
		 */
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://demoqa.com/radio-button"); Boolean name =
		 * driver.findElement(By.
		 * xpath("//div[contains(text(),'Do you like the site?')]//following::input[3]")
		 * ).isEnabled(); System.out.println(name);
		 */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		driver.findElement(By.xpath("//div[contains(text(),'Do you like the site?')]//following::label[1]")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Boolean name = driver.findElement(By.xpath("//div[contains(text(),'Do you like the site?')]//following::input[1]")).isSelected();
		System.out.println(name);

		

	}

}
