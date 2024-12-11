package com.selenium.testngpractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\Ragavendran.v\\eclipse-workspace\\TestNGExample\\TestData\\WriteToExcel.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet("Sheet2");
		String userName = ws.getRow(1).getCell(0).getStringCellValue();
		String password = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println(userName);
		System.out.println(password);

	}

}
