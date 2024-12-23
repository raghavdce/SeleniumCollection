package com.selenium.javaprogram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromText {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//File file = new File("D:\\Batch061223\\SeleniumTraining\\SeleniumPractiseWithJava\\ReadText.txt");
		File file = new File(".//ReadText.txt");
		Scanner scan = new Scanner(file);
		String filecontent = "";
		while(scan.hasNextLine()) {
			filecontent = filecontent.concat(scan.nextLine())+"\n";
		}
		System.out.println(filecontent);
		
		
		

	}

}
