package com.selenium.seleniumpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllCellValues {

	public static void main(String[] args) {
		// To  find the max value of a particular cell from the dynamic table
		float max=0;
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
		int rowCount = rows.size();
		for(int i=0; i<rowCount;i++) {
			
			List<WebElement> col = driver.findElements(By.xpath("//tbody/tr["+i+"]/td[4]"));
			
			for(int j=0; j<col.size(); j++) {
				System.out.println("Current value of J is : "+col.get(j).getText());
				if(max<Float.parseFloat(col.get(j).getText())) {
					max = Float.parseFloat(col.get(j).getText());
				}
				
			}
			
		}
		System.out.println("The max value of the 4th column is : " + max);
		driver.quit();

	}

}
