package com.selenium.javapractice;

public class CountOfObject {
	
	static int count=0;
	
	public CountOfObject() {
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfObject obj = new CountOfObject();
		CountOfObject obj2 = new CountOfObject();
		CountOfObject obj1 = new CountOfObject();
		System.out.println(count);

	}

}
