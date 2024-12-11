package ReadingFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadAllRowsFromExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File fl = new File(".\\TestData\\WriteToExcel.xlsx");
		FileInputStream fis;
		XSSFWorkbook wb;
		XSSFSheet ws;
		/*
		 * String username=null,password=null; try { fis = new FileInputStream(fl); wb =
		 * new XSSFWorkbook(fis); ws = wb.getSheet("Sheet2"); int rowCount =
		 * ws.getLastRowNum(); for(int i=1;i<rowCount;i++) { username =
		 * ws.getRow(i).getCell(0).getStringCellValue(); password =
		 * ws.getRow(i).getCell(1).getStringCellValue(); System.out.println(username);
		 * System.out.println(password); }
		 * 
		 * } catch (Exception e) { System.out.println(e.getMessage()); }
		 */
		
		//You  can remove the dataformatter from the excel utility
		String username=null,password=null;
			fis = new FileInputStream(fl);
			wb = new XSSFWorkbook(fis);
			ws = wb.getSheet("Sheet2");
			XSSFCell cell = ws.getRow(1).getCell(0);
			DataFormatter formatter = new DataFormatter();
			String data = formatter.formatCellValue(cell);
			//System.out.println(data);
			System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
			//create chrome instance
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.findElement(By.id("user-name")).sendKeys(data.trim());
			
			
		
		
		

	}

}
