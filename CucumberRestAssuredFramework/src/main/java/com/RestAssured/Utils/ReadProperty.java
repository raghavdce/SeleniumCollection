package com.RestAssured.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	
	
	public static String readDataFromProperty(String key) throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\StaticData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		return prop.getProperty(key);
		
		
	}

}
