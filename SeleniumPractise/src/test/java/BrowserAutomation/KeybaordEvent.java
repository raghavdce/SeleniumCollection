package BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KeybaordEvent {
	
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//Chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/text-box");
		WebElement current = driver.findElement(By.id("currentAddress"));
		current.sendKeys("Ragavendran V");
		current.sendKeys(Keys.CONTROL);
		current.sendKeys("C");
		
	}

}
