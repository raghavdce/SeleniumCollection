import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Interview {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ragavendran.v\\eclipse-workspace\\JavaPractise\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		Thread.sleep(5000);
		
		  //WebElement ele = driver.findElement(By.xpath("//*[@id=\"demo\"]"));
		  
		  WebDriverWait wait = new WebDriverWait(driver, 15);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
		  "//p[text()=\"WebDriver\"]")));
		 
		String text = driver.findElement(By.xpath("//p[text()=\"WebDriver\"]")).getText();
		System.out.println(text);
		driver.quit();

	}
}
