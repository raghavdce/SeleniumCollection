package com.selenium.testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTipTextExample {
	
	@Test
	public void tooltip() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		String title = driver.findElement(By.id("toolTipButton")).getAttribute("title");
		System.out.println(title);
		//Actions action = new Actions(driver);
		//action.moveToElement(driver.findElement(By.id("toolTipButton"))).get
	}

}
