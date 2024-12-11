package BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OpenaBrowser {

	@Test
	public void open() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//Chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.seleniumeasy.com/");
		
		//driver.na
		driver.findElement(By.id("edit-search-block-form--2")).sendKeys("Radhika");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Point p = driver.manage().window().getPosition();
		Dimension d = driver.manage().window().getSize();
		driver.manage().window().setPosition(new Point((d.getHeight()-p.getX()), (d.getWidth()-p.getY())));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		//driver.manage().window().
	}
	
}
