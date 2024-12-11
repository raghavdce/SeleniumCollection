package com.selenium.seleniumpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {
		// TO fetch a particular cell value

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractice2106\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		
		  //to print a particular cell value
		  String text = driver.findElement(By.xpath("//table/tbody/tr[1]/td[3]")).getText();
		  System.out.println(text);
		 
	}

}
