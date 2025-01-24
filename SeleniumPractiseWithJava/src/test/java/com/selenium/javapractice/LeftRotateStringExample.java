package com.selenium.javapractice;

public class LeftRotateStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "GeeksforGeeks";
		int d = 2;
		String ans = str.substring(d)+ str.substring(0, d) ;
		System.out.println(ans);
		
		String ans1 = str.substring(str.length()-2)+str.substring(0);
		System.out.println(ans1);
		
		

	}

}
