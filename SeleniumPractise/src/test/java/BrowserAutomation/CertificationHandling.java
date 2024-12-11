package BrowserAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CertificationHandling {

	public static void main(String[] args) {
		// For Chrome... 2 ways to achieve this
		//1. Since it is selenium 3.X version we are using both desired cap and chrome option and merging it
		//2. If it is selenium 4, then we can simply use chrome options with options.setAcceptInsecureCerts(true);
		//with desired cap and chrome option
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
				  +"//Drivers//Chromedriver.exe"); 
				 // DesiredCapabilities SSL = DesiredCapabilities.chrome();       
				  //SSL.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
				  ChromeOptions options = new ChromeOptions();
				  options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
				  options.addArguments("--user-data-dir=C:\\Selenium\\SeleniumProfile"); 
				  options.addArguments("--start-maximized"); 
				  options.setAcceptInsecureCerts(true);
				  //options.merge(SSL);
				  //without desired cap
				  //options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				  //options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
				  WebDriver driver = new ChromeDriver(options);
				  driver.get("https://cacert.org/");
				  
		// For Firefox
				  
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")
						  +"//Drivers//geckodriver.exe"); 
		//ProfilesIni profile = new ProfilesIni();
		// FirefoxProfile myprofile = profile.getProfile("Rumble"); 
		 FirefoxOptions options1 = new FirefoxOptions(); 
		// options1.setProfile(myprofile);
		 //options1.setAcceptInsecureCerts(true);
		 //options1.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		//WebDriver driver1 = new FirefoxDriver(options1);
		//driver1.get("https://cacert.org/");
		
		

	}

}
