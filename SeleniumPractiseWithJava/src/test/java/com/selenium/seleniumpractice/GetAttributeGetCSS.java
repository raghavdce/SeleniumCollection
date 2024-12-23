package com.selenium.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetAttributeGetCSS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		WebDriver driver = new ChromeDriver(options);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String attri = driver.findElement(By.name("q")).getAttribute("class");
		String css = driver.findElement(By.name("q")).getCssValue("font-size");
		String css1 = driver.findElement(By.name("q")).getDomAttribute("role");
		String css4 = driver.findElement(By.name("q")).getDomProperty("title");
		String css2 = driver.findElement(By.name("q")).getDomProperty("value");
		driver.findElement(By.name("q")).sendKeys("Ragavendran V");
		String css3 = driver.findElement(By.name("q")).getDomProperty("value");
		System.out.println(attri);
		System.out.println(css);
		System.out.println(css1);
		System.out.println(css2);// no value will be capture bcoz the field is yet to filled
		System.out.println(css3);// returns what we types in the textbox and it will work only when the field has "value" as attribute
		System.out.println(css4);
		driver.quit();
	}

}
