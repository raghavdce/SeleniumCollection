package com.selenium.seleniumpractice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDown {

	public static void main(String[] args) {


		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * ".\\Drivers\\chromedriver.exe"); WebDriver driver = new ChromeDriver();
		 * //Ctrl+sft+o --> to import a package driver.manage().window().maximize();
		 * driver.get("https://www.amazon.in/"); WebElement element =
		 * driver.findElement(By.id("searchDropdownBox")); Select dropdown = new
		 * Select(element); //dropdown.selectByIndex(1);
		 * //dropdown.selectByValue("search-alias=amazon-pharmacy");
		 * //dropdown.selectByVisibleText("Books"); List<WebElement> dopdownlist =
		 * dropdown.getOptions(); for(WebElement element1 : dopdownlist) {
		 * if(element1.getText().equals("Bos")) {
		 * driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java Books");
		 * driver.findElement(By.id("nav-search-submit-button")).click();
		 * 
		 * } else System.out.println("No such options available in the dropdown");
		 * 
		 * }
		 */
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Ctrl+sft+o --> to import a package
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		//WebElement element1 = driver.findElement(By.id("cars"));
		/*
		 * WebDriverWait expwait = new WebDriverWait(driver,15);
		 * expwait.until(ExpectedConditions.visibilityOf(element1));
		 */
		
		
		driver.get("https://demoqa.com/select-menu");
		Select element = new Select(driver.findElement(By.id("cars")));
		System.out.println(element.isMultiple());
		element.selectByIndex(0);
		element.selectByIndex(1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		element.deselectByValue("saab");
		
		

	}

}
