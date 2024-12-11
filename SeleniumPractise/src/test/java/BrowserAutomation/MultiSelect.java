package BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement element = driver.findElement(By.id("cars"));
		Select dropdown = new Select(element);
		if(dropdown.isMultiple()==true) {
			dropdown.selectByIndex(0);
			dropdown.selectByIndex(1);
		}
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.deselectByIndex(1);

	}

}
