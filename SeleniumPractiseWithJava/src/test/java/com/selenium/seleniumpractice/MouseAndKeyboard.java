package com.selenium.seleniumpractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Mouse and keyboard event
		 * System.setProperty("webdriver.chrome.driver",
		 * ".\\Drivers\\chromedriver.exe"); WebDriver driver = new ChromeDriver();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 * driver.manage().window().maximize();
		 * driver.get("https://www.saucedemo.com/");
		 * //driver.findElement(By.id("user-name")).sendKeys("Selenium"); WebElement
		 * username = driver.findElement(By.id("user-name")); Actions action = new
		 * Actions(driver);
		 * action.click(username).sendKeys("standard_user").sendKeys(Keys.TAB).sendKeys(
		 * "secret_sauce") .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		 */
		
		/* double click and right click example
		 * System.setProperty("webdriver.chrome.driver",
		 * ".\\Drivers\\chromedriver.exe"); WebDriver driver = new ChromeDriver();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 * driver.manage().window().maximize();
		 * driver.get("https://demoqa.com/buttons"); Actions action = new
		 * Actions(driver); //WebElement doubleclick =
		 * driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		 * //action.doubleClick(doubleclick).perform(); //WebElement rightClick =
		 * driver.findElement(By.id("rightClickBtn"));
		 * //action.contextClick(rightClick).perform(); WebElement clickme =
		 * driver.findElement(By.xpath(
		 * "//button[@id='doubleClickBtn']/following::div[2]"));
		 * 
		 * action.moveToElement(clickme).contextClick().perform(); Point p =
		 * clickme.getLocation(); action.moveByOffset(p.getX(),
		 * p.getY()).click().perform();
		 */
		 
		/* drag and drop example
		 * System.setProperty("webdriver.chrome.driver",
		 * ".\\Drivers\\chromedriver.exe"); WebDriver driver = new ChromeDriver();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		 * driver.manage().window().maximize();
		 * driver.get("https://demoqa.com/droppable"); Actions action = new
		 * Actions(driver); WebElement drag = driver.findElement(By.id("draggable"));
		 * WebElement drop = driver.findElement(By.id("droppable"));
		 * action.dragAndDrop(drag, drop).build().perform();
		 */
		
		
		// move to a element based on X and Y co-ordinates
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement userName = driver.findElement(By.id("user-name"));
		Point p = userName.getLocation();
		System.out.println(p.x);
		System.out.println(p.getX());
		Actions action = new Actions(driver);
		action.moveByOffset(p.getX(), p.getY()).click().sendKeys("Selenium").perform();
		
		

	}

}
