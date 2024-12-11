package BrowserAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("119");
		WebDriver driver = new ChromeDriver(options); // Ctrl+sft+o --> to import a package
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");
		driver.findElement(By.id("droppableExample-tab-preventPropogation")).click();
		WebElement drag = driver.findElement(By.id("dragBox"));
		WebElement drop = driver.findElement(By.id("notGreedyInnerDropBox"));
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		
		

	}

}
