package com.selenium.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropInDiffFrames {
	
	public static void switchToFrame(WebDriver driver, String frameName) {
		driver.switchTo().frame(frameName);
	}
	
	public static void dragAndDrop(WebDriver driver, String srcFrame, String trgFrame, WebElement srcElement, WebElement trgElement) {
		Actions action = new Actions(driver);
		switchToFrame(driver, srcFrame);
		action.moveToElement(srcElement).clickAndHold().build().perform();
		switchToFrame(driver, trgFrame);
		action.moveToElement(trgElement).release().build().perform();
		driver.switchTo().defaultContent();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String srcFrame = "b";
		String trgFrame = "c";
		driver.get("https://www.ankur.com/projects/FrameGlider/demo/simple/a.html");
		switchToFrame(driver, srcFrame);
		WebElement srcElement = driver.findElement(By.id("Dra1"));
		switchToFrame(driver, trgFrame);
		WebElement trgElement = driver.findElement(By.id("Dro2"));
		driver.switchTo().defaultContent();
		dragAndDrop(driver, srcFrame, trgFrame, srcElement, trgElement);
		String msg = driver.findElement(By.xpath("//span[normalize-space() = 'Mouse up on Dro2 . Dropped Dra1 on it']")).getText();
		System.out.println(msg);
		Thread.sleep(5000);
		driver.quit();

	}

}
