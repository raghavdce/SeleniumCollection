package com.jktech.programs;

public class ReverseAString {

	public static void main(String[] args) {

		//1. Using ToChar method
		String name = "My Name is Ragavendran";
		String[] newName=name.split(" ");
		for(int i=0;i<newName.length;i++) {
			char[] a = newName[i].toCharArray();
			for(int j=a.length-1;j>=0;j--) {
				System.out.print(a[j]);
			}
			System.out.print(" ");
		}
		
		System.out.println();
		
		//2. Using Stringbuffer method
		String name1 = "Chocolate";
		StringBuffer sb = new StringBuffer(name1);
		System.out.println(sb.reverse());
		
		
		//3. Using charAt method
		String name2 = "Color";
		String rev="";
		for(int i=name2.length()-1;i>=0;i--) {
			rev = rev+name2.charAt(i);
		}
		System.out.println(rev);
		
	}

}
