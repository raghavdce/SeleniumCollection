package BrowserAutomation;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Ctrl+sft+o --> to import a package
		driver.manage().window().maximize();
		/*
		 * driver.get("https://www.saucedemo.com/"); WebElement UN =
		 * driver.findElement(By.id("user-name")); WebElement PW =
		 * driver.findElement(By.id("password")); WebElement button =
		 * driver.findElement(By.id("login-button")); Dimension d = button.getSize();
		 * Actions action = new Actions(driver);
		 * action.click(UN).sendKeys("standard_user").click(PW).sendKeys("secret_sauce")
		 * .perform(); //action.moveByOffset(45, 91).contextClick().build().perform();
		 * action.moveByOffset((d.getHeight()/4),
		 * (d.getWidth())/4).click().build().perform(); Thread.sleep(5000); WebElement
		 * addCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		 * Dimension d1 = addCart.getSize(); action.moveByOffset((d1.getHeight()/2),
		 * (d1.getWidth())/2).contextClick().build().perform(); //driver.quit();
		 */		
		
		//movebyoffset click
		driver.get("https://www.saucedemo.com/inventory.html");
		driver.manage().deleteAllCookies();
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement element = driver.findElement(By.id("login-button"));
		
		Robot robot = new Robot();
		
		
		//Dimension d = element.getSize();
		Point pUN = userName.getLocation();
		Point pPW = password.getLocation();
		Point pBT = element.getLocation();
		
		robot.mouseMove(pUN.getX(),pUN.getY()); // move mouse point to specific location	
        robot.delay(1500); 
		Actions action = new Actions(driver);
		action.moveByOffset(pUN.getX(),pUN.getY()).click().sendKeys("standard_user").sendKeys(Keys.TAB)
		.sendKeys("secret_sauce").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.RETURN).build().perform();
		//action.moveToElement(password, 0, 0).perform();
		//action.moveByOffset(pPW.getX(),pPW.getY()).click().sendKeys("secret_sauce").perform();
		//action.moveByOffset(pBT.getX(),pBT.getY()).click().perform();

	}

}
