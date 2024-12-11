package com.selenium.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SSLCertificate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  //Chrome 
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * ".\\Drivers\\chromedriver.exe"); ChromeOptions options = new ChromeOptions();
			 * options.setAcceptInsecureCerts(true); WebDriver driver = new
			 * ChromeDriver(options); driver.get("https://expired.badssl.com/");
			 */
		 
		
		//Firefox
		
		  System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		  FirefoxOptions options = new FirefoxOptions();
		  options.setAcceptInsecureCerts(true);
		  WebDriver ffdriver = new FirefoxDriver();
		  ffdriver.get("https://v1.hdfcbank.com/assets/popuppages/netbanking.htm");
		 
		
		/*
		 * //MS Edge System.setProperty("webdriver.edge.driver",
		 * ".\\Drivers\\msedgedriver.exe"); EdgeOptions options1 = new EdgeOptions();
		 * options1.setAcceptInsecureCerts(true); WebDriver edriver = new
		 * EdgeDriver(options1); edriver.get("https://expired.badssl.com/");
		 */
		

	}

}
