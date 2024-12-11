package com.selenium.seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// I want to select Sep 28
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://phptravels.net/");
		driver.findElement(By.name("checkin")).click();
		String month = "September 2022";
		int day = 2;
		while (true) {

			String checkMonth = driver
					.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[2]")).getText();
			if (checkMonth.equals(month)) {
				break;
			} else
				driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[3]/i")).click();
		}
		
			driver.findElement(
					By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/tbody/tr/td[@class=\"day \" and contains(text(),"+day+")]"))
					.click();
		//driver.quit();

	}

}
