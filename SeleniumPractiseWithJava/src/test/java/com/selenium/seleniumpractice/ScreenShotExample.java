package com.selenium.seleniumpractice;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotExample {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		// screenshot of a page
		/*
		 * TakesScreenshot ts = (TakesScreenshot) driver; File src =
		 * ts.getScreenshotAs(OutputType.FILE); File trg = new
		 * File(".\\Screenshots\\fullpage.png"); FileUtils.copyFile(src, trg);
		 */

		// screen shot of a section of a page using locator for a particular section
		WebElement element = driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		File src = element.getScreenshotAs(OutputType.FILE);
		File trg = new File(".\\Screenshots\\sectionOfPage.png");
		FileUtils.copyFile(src, trg);

		// screen shot of a section of a page using locator for a particular section
		WebElement element1 = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File src1 = element1.getScreenshotAs(OutputType.FILE);
		File trg1 = new File(".\\Screenshots\\element1.png");
		FileUtils.copyFile(src1, trg1);

		driver.quit();

	}

}
