package com.selenium.seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorScroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement> amount = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		int sum = 0;
		for(int i=0; i<amount.size(); i++) {
			sum = sum+Integer.parseInt(amount.get(i).getText());
		}
		System.out.println("Total sum is : " + sum);
		
		String webAmount = driver.findElement(By.xpath("//div[@class='totalAmount']")).getText();
		
		String amounts[] = webAmount.split(" ");
		int webSum = Integer.parseInt(amounts[amounts.length-1]);
		System.out.println("The web sum is : "+ webSum);
		
		
		driver.quit();


	}

}
