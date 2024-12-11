package com.jktech.programs;

public class IrregularSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abc";
		String s2 = "def";
		char s3[]=s1.toCharArray();
		char s4[]=s2.toCharArray();
		
		for(int i=0;i<s3.length;i++) {
			
			System.out.print(s3[i]);
			System.out.print(s4[i]);
		}
	}

}
