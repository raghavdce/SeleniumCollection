package BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ManuallyOpenedBrowser {
	
	/* this program helps us to perform operation on a manually opened 
	 * browser. Open a browser, perform some operation and run a code as shown below
	 * No need to mention the url.. port number must be same. The path mentioned for user dir will be auto created
	 * command to run in command prompt 
	 * chrome.exe -remote-debugging-port=9090 --user-data-dir="C:\Selenium\SeleniumProfile
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To make this work we need to add chrome path in environment variable. In my case it is
		//C:\Program Files\Google\Chrome\Application
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//Chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		//options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		options.setExperimentalOption("debuggerAddress","localhost:9090");
		WebDriver driver = new ChromeDriver(options);
		//driver.get("https://demo.guru99.com/test/web-table-element.php");
		String element = driver.findElement(By.linkText("4.2.2")).getText();
		System.out.println(element);

	}

}
