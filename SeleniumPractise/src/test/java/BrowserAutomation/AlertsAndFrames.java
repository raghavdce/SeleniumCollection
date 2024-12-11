package BrowserAutomation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AlertsAndFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//Chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		 //Before using Iframe
		 //driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		 //After using iframe
		 driver.switchTo().frame("iframeResult");
		 driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		a.sendKeys("Ragavendran V");
		a.accept();
		driver.quit();
	}

}
