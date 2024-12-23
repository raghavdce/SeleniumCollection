package com.selenium.javapractice;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s1 = "ONE";
        
        s1.concat("TWO");
         
        s1.concat("THREE");
         
        System.out.println(s1);
        
      String s2 = "Two";
      s1.concat(s2);
      System.out.println(s1);
      System.out.println(s1.concat(s2));
      
      //https://javaconceptoftheday.com/when-to-use-equals-hashcode-on-strings/


	}

}
