import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenPageInBrowser {

	public static void main(String[] args) {
		/*
		 * //Chrome System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\BrowserInstantiation\\Drivers\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.amazon.in/");
		 */
		
		/*
		 * //firefox System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\Ragavendran.v\\eclipse-workspace\\BrowserInstantiation\\Drivers\\geckodriver.exe"
		 * ); WebDriver driver1 = new FirefoxDriver();
		 * driver1.get("https://www.amazon.in/");
		 */
		
		
		  //MS Edge 
		System.setProperty("webdriver.edge.driver",
		  "C:\\Users\\Ragavendran.v\\eclipse-workspace\\BrowserInstantiation\\Drivers\\msedgedriver.exe"
		  ); WebDriver driver2 = new EdgeDriver();
		  driver2.get("https://www.amazon.in/");
		 
	}

}
