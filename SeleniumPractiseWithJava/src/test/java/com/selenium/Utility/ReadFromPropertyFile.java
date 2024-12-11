package com.selenium.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadFromPropertyFile {

	public static void main(String[] args) throws Exception {


		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"//Utility\\constantValues.properties");
		Properties prop = new Properties();
		prop.load(file);
		System.out.println(prop.get("URL"));
		
		
	}

}
