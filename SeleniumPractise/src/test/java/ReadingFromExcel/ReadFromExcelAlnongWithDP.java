package ReadingFromExcel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadFromExcelAlnongWithDP {
	
	@Test(dataProvider="data")
	public void login(String username, String password) {
		
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	@DataProvider(name = "data")
	public Object[][] passData() throws Exception {

		String path = "C:\\Users\\Ragavendran.v\\eclipse-workspace\\SeleniumPractise\\TestData\\WriteToExcel.xlsx";
		int row = ReadingFromExcel.getRowCount(path, "Sheet2");
		int col = ReadingFromExcel.getCellCount(path, "Sheet2", 1);
		String empData[][] = new String[row][col];
		for (int i = 1; i <= row; i++) {
			for (int j = 0; j < col; j++) {
				empData[i-1][j] = ReadingFromExcel.getCellData(path, "Sheet2", i, j);
			}

		}
		return (empData);

	}
	

}
