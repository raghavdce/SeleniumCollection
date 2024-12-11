package com.selenium.seleniumpractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * driver.navigate().back(); try { Thread.sleep(2000); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } driver.navigate().forward(); try { Thread.sleep(2000);
		 * } catch (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		driver.navigate().refresh();
		driver.manage().window().minimize();
		//driver.manage().
	/*	Point p = driver.manage().window().getPosition();
		Dimension d = driver.manage().window().getSize();
		driver.manage().window().setPosition(new Point((d.getHeight()-p.getX()), (d.getWidth()-p.getY())));
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
		

	}
}
