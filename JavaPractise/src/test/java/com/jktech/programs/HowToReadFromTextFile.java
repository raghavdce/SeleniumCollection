package com.jktech.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class HowToReadFromTextFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\Ragavendran.v\\eclipse-workspace\\JavaPractise\\ReadFile.txt");
		Scanner scan = new Scanner(file);
		
		String fileContent="";
		
		while(scan.hasNextLine()) {
			
			fileContent = fileContent.concat(scan.nextLine()+"\n");
			
		}
		
		//to print on console
		System.out.println(fileContent);
		
		// to print on a new file
		
		FileWriter writer = new FileWriter("C:\\Users\\Ragavendran.v\\eclipse-workspace\\JavaPractise\\WriteFile.txt");
		writer.write(fileContent);
		writer.close();
		
		//to get the count of a particular word
		int count=0;
		String word[] = fileContent.split("\n");
		for(int i=0;i<word.length;i++) {
			String newWord[] = word[i].split(" ");
			for(int j=0;j<newWord.length;j++) {
				if(newWord[j].equalsIgnoreCase("Selenium")) {
					count++;
				}
			}
			
		}
		System.out.println("The number of times the word selenium displayed is : "+count);
		
	}

}
