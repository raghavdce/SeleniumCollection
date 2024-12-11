package com.jktech.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingFromPropertyFile {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File f = new File(System.getProperty("user.dir")+"//Property.file");
		Properties prop= new Properties();
		FileInputStream fis = new FileInputStream(f);
		prop.load(fis);
		System.out.println(prop.getProperty("username"));

	}

}
