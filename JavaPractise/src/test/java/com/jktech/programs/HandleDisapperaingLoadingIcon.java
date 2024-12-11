package com.jktech.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 * This program is to resolve the issue that occurs due to disappearing web element like loading icon
 * In general, IRCTC Website when you click modify search, you can see a loading icon followed
 * by that when you click any other icon (like next day button) via selenium, it will give you error
 * So, identify the disappearing icon by moving to source tab and press f8 as soon as user clicks the modify
 * search icon which put the screen on debugger mode and pause the action
 */
public class HandleDisapperaingLoadingIcon {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ragavendran.v\\eclipse-workspace\\JavaPractise\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/booking/train-list");
		driver.findElement(By.xpath("//form/div[2]/button")).click();
		//form/div[2]/button
		driver.findElement(By.xpath("//input[@aria-controls=\"pr_id_1_list\"]")).sendKeys("MGR CHENNAI CTL - MAS");
		driver.findElement(By.xpath("//input[@aria-controls=\"pr_id_2_list\"]")).sendKeys("KALYAN JN - KYN");
		driver.findElement(By.xpath("//button[text()=\"Search\"]")).click();
		driver.findElement(By.xpath("//p-sidebar/div/div/app-modify-search/div/form/div/button/span[text()='Modify Search']")).click();
		List<WebElement> loadingIcon = driver.findElements(By.xpath("//span[text()=\"Please Wait...\"]"));
		int count=0;
		while(loadingIcon.size()!=0 && count<10) {
			Thread.sleep(1000);
			count++;
		}
		driver.findElement(By.xpath("//button[text()=\" Next Day \"]")).click();
		Thread.sleep(3000);
		
		driver.quit();
	}

}
