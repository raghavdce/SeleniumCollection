package BrowserAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.edge.EdgeDriver;
//import com.kms.katalon.core.webui.driver.DriverFactory;

@SuppressWarnings("deprecation")
public class BrowserProfileChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//Chromedriver.exe");
		//DesiredCapabilities SSL = DesiredCapabilities.chrome();
		//SSL.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		String chromeProfilePath = "C:\\Users\\Ragavendran.v\\AppData\\Local\\Google\\Chrome\\User Data\\";
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] { "enable-automation" });
		options.addArguments("user-data-dir=" + chromeProfilePath); // options.addArguments("profile-directory=Profile
																	// 2");
		options.addArguments("--user-data-dir=C:\\Selenium\\SeleniumProfile");
		options.addArguments("--start-maximized");
		//options.merge(SSL);
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/web-table-element.php");

		// for firefox browser
//			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
//			ProfilesIni profile = new ProfilesIni();
//			FirefoxProfile myprofile = profile.getProfile("Rumble");
//			FirefoxOptions ffoptions = new FirefoxOptions();
//			ffoptions.setProfile(myprofile);
//			// Initialize Firefox ffdriver
//			WebDriver driver1 = new FirefoxDriver(ffoptions);
//			driver1.get("https://demo.guru99.com/test/web-table-element.php");
//		 

		// MS Edge browser

		/*
		 * System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") +
		 * "//Drivers//msedgedriver.exe"); EdgeOptions myoptions = new EdgeOptions();
		 * myoptions.setCapability("user-data-dir",
		 * "C:\\Users\\Ragavendran.v\\AppData\\Local\\Microsoft\\Edge\\User Data");
		 * myoptions.setCapability("profile-directory", "Profile 3"); // Here you set
		 * the path of the profile ending with User Data not the profile folder
		 * WebDriver driver = new EdgeDriver(myoptions);
		 * driver.get("https://demo.guru99.com/test/web-table-element.php");
		 */

	}

}
