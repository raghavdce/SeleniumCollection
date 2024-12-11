package BrowserAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//Chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.get("https://www.w3schools.com/jsref/met_win_prompt.asp");
		 driver.findElement(By.linkText("Try it Yourself »")).click();
		 String parent = driver.getWindowHandle().toString();
		 String child = driver.getWindowHandles().toArray()[1].toString();
		 driver.switchTo().window(child);
		 driver.switchTo().frame("iframeResult");
		 driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("Ragavendran V");
		a.accept();
		driver.switchTo().parentFrame();
		//driver.switchTo().defaultContent();
		driver.findElement(By.id("runbtn")).click();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//*[@class='w3-btn']//following::span[contains(text(),'Next')][2]")).click();

	}

}
