package com.selenium.javapractice;

import java.util.Arrays;
import java.util.List;

public class StringMethods {

	public static void main(String[] args) {
		// Join method joins all string with the given delimiters
		
		 String languages = String.join("_", "Java", "HTML", "Python", "CSS", "PHP");
         
	        System.out.println(languages);     //Java_HTML_Python_CSS_PHP
	         
	        List<String> languageList = Arrays.asList("Java", "HTML", "Python", "CSS", "PHP");
	         
	        languages = String.join(", ", languageList);
	         
	        System.out.println(languages);  //Java, HTML, Python, CSS, PHP
	        
	        System.out.println("".isBlank());                  //Output : true
	        System.out.println("   ".isBlank());               //Output : true
	        System.out.println("\t \t".isBlank());             //Output : true
	        System.out.println("\n \n".isBlank());             //Output : true
	        System.out.println("STRING".isBlank());            //Output : false
	        System.out.println("String \t \n".isBlank());      //Output : false
	        
	        System.out.println("\n\n".lines().count());                //Output : 2
	        System.out.println("abc \n xyz".lines().count());          //Output : 2
	        System.out.println("123 \n 456 \n".lines().count());       //Output : 2
	        System.out.println("abc \n 123 \n xyz".lines().count());   //Output : 3
	        
	        System.out.println("1".repeat(5));		//11111
	        System.out.println("abc".repeat(3));	//abcabcabc
	        System.out.println("1a2b3c".repeat(3));	//1a2b3c1a2b3c1a2b3c
	        
	        System.out.println("   1   ".strip());	//1 without leading and trailing space
	        
	        System.out.println("    1".stripLeading()); //1 without leading space
	        
	        System.out.println("   1    ".stripTrailing());//     1 without trainling pace
	        
	        System.out.println("1) %s 2) %s 3) %s ".formatted("Java", "Python", "JavaScript"));
	        //1) Java 2) Python 3) JavaScript
	        
	        

	}

}
