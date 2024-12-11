package com.jktech.programs;

public class IrreugalarSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I     am      Raga";
		String str2=str.replaceAll("\\s+", " ");
	
		System.out.println(str2);

	}

}
