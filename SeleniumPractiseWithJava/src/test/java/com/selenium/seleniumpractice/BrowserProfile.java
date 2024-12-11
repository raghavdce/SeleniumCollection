package com.selenium.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

public class BrowserProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +
		  "//Drivers//geckodriver.exe"); 
		  ProfilesIni profile = new ProfilesIni();
		  FirefoxProfile myprofile = profile.getProfile("Rumble"); 
		  FirefoxOptions ffoptions = new FirefoxOptions(); 
		  ffoptions.setProfile(myprofile); 
		  //Initialize Firefox ffdriver 
		  WebDriver driver1 = new FirefoxDriver(ffoptions);
		  driver1.get("https://demo.guru99.com/test/web-table-element.php");*/
		 
		
		//MS Edgeprofile
		
		  System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") +
		  "//Drivers//msedgedriver.exe"); EdgeOptions options = new EdgeOptions();
		  options.setCapability("--user-data-dir",
		  "C:\\Users\\Ragavendran.v\\AppData\\Local\\Microsoft\\Edge\\User Data");
		  options.setCapability("--profile-directory", "Profile 3"); 
		  // Here you set  the path of the profile ending with User Data not the profile folder
		  WebDriver driver = new EdgeDriver(options);
		  driver.get("https://demo.guru99.com/test/web-table-element.php");
		 

	}

}
