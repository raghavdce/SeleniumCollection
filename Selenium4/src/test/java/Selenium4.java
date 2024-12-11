import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4 {

	//Without drivers downloaded
		@Test
	public void openBrowser() {
		//Without drivers downloaded		
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				//driver.
				driver.quit();
		
	}
		
		//minimize the window is available only from selenium 4
		//@Test
		public void minimize() throws Exception {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().minimize();
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.quit();
		}
				
		//Taking screen shot at element level
		
		//@Test
		public void takeScreenShotOfAnElement() throws Exception {
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
			File src = logo.getScreenshotAs(OutputType.FILE);
			//File dest = new File(".\\Screenshots\\Logo.jpg");
			File dest = new File(".\\Screenshots\\Logo1.png");
			FileUtils.copyFile(src, dest);
			driver.quit();
			
		}
		
		//How to open a new tab
		@Test
		public void openTab() throws Exception {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			String parent = driver.getWindowHandle().toString();
			Thread.sleep(3000);
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://www.saucedemo.com/");
			Thread.sleep(3000);
			driver.switchTo().window(parent);
			Thread.sleep(3000);
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://demoqa.com/checkbox");
			driver.switchTo().window(parent);
			Thread.sleep(3000);
			driver.quit();
		}
		
		
		
		
		
		
		
		
		
		
		

	

}
