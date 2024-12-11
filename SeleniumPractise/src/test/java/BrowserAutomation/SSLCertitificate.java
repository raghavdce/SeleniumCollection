package BrowserAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertitificate {

	public static void main(String[] args) {
		// Chrome
		//driver.get("cacert.com");
		
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		//options.setAcceptInsecureCerts(true);
		options.addArguments("--start-maximized");
		options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		//DesiredCapabilities cap = DesiredCapabilities.chrome();
		//options.merge(cap);

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
			/*
			 * //Firefox System.setProperty("webdriver.gecko.driver",
			 * System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
			 * FirefoxOptions options1 = new FirefoxOptions();
			 * options1.setAcceptInsecureCerts(true); WebDriver driver1 = new
			 * FirefoxDriver(options1); driver1.get("https://expired.badssl.com/");
			 * 
			 * //edge System.setProperty("webdriver.edge.driver",
			 * System.getProperty("user.dir") + "//Drivers//msedgedriver.exe"); EdgeOptions
			 * options2 = new EdgeOptions();
			 * options2.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true); WebDriver
			 * driver2 = new EdgeDriver(options2);
			 * driver2.get("https://expired.badssl.com/");
			 */
	}

}
