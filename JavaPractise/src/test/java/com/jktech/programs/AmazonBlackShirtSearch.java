package com.jktech.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBlackShirtSearch {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/s?k=black+casual+shirt+for+men&page=7&qid=1662440471&ref=sr_pg_7");
		Thread.sleep(10000);
		//span[@class='a-price-symbol']
		
		driver.quit();
		
	}

}
