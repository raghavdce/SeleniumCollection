package BrowserAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
				  +"//Drivers//Chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		  driver.get("http://the-internet.herokuapp.com/basic-auth");
		  //to handle the auth popup, modify the url as below and it works for all
		 // driver.get("http:/admin:admin@/the-internet.herokuapp.com/basic-auth");
	}

}
