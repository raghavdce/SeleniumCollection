package ReadingFromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadOneParticularCell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File fl = new File(".\\TestData\\WriteToExcel.xlsx");
		FileInputStream fis;
		XSSFWorkbook wb;
		String username=null,password=null;
		try {
			fis = new FileInputStream(fl);
			wb = new XSSFWorkbook(fis);
			username = wb.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
			password = wb.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(username);
		System.out.println(password);

	}

}
