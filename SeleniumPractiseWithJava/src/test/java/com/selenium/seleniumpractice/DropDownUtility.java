package com.selenium.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtility {
	
	static WebDriver driver;
	static By dropdown = By.id("oldSelectMenu");
	
	public static WebElement getElement(By loc) {
		return driver.findElement(loc);
	}
	
	public static void selectDropDown(String value, By loc, String txt) {
		Select element = new Select(getElement(dropdown));
		
		switch (txt) {
		case "value":
			element.selectByValue(txt);
			break;
		case "index":
			element.selectByIndex(Integer.parseInt(value));
			break;
		case "VisibleText":
			element.selectByVisibleText(txt);
			break;

		default:
			System.out.println("Please pass correct selection criteria");
			break;
		}
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		selectDropDown("2", dropdown, "index");
		Thread.sleep(2000);
		driver.quit();
	}

}
