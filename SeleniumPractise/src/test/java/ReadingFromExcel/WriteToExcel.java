package ReadingFromExcel;

import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteToExcel {
	

	public static void main(String[] args) throws IOException {
		String xlPath = "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractise\\TestData\\WriteToExcel.xlsx";
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> company = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/td[1]"));
		List<WebElement> contact = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/td[2]"));
		List<WebElement> country = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/td[3]"));
		for(int i=1;i<=company.size();i++) {
			ReadingFromExcel.setCellData(xlPath,"Sheet1", i, 0, company.get(i-1).getText());
			ReadingFromExcel.setCellData(xlPath,"Sheet1", i, 1, contact.get(i-1).getText());
			ReadingFromExcel.setCellData(xlPath,"Sheet1", i, 2, country.get(i-1).getText());
		}
		
		driver.quit();
		
	}

}
