package BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FetchAValueFromTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"//Drivers//Chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		WebElement row = driver.findElement(By.xpath("//table//tr[3]"));
		System.out.println(row.getText());
		WebElement cell = row.findElement(By.xpath("//tbody/tr[3]/td[4]"));
		System.out.println(cell.getText());
		
	}

}
