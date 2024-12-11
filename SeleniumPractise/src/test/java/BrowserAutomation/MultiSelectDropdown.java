package BrowserAutomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//Chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
	      //identify dropdown
	      WebElement d= driver.findElement(By.xpath("//select[@name='selenium_commands']"));

	      //object of Select class
	      Select s=new Select(d);
	      //get options of drop down in list
	      List<WebElement> t =s.getOptions();
	      System.out.println("Options are: ");
	      for (WebElement i: t){
	         System.out.println(i.getText());
	      }
	      //return true if multi-select dropdown
	      Boolean b=s.isMultiple();
	      System.out.println("Boolen value for drodown: "+ b);
	      
	}

}
