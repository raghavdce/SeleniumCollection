package com.jktech.programs;

import java.util.Scanner;

public class JavaAssesment {

	public static double modus(int a, int b, int c) {
		  double d,e;
		d = Math.pow(a,b);
		e=d%c;
		return e;
	  }
	 
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scan.nextInt();
		System.out.println("Enter the number");
		int b = scan.nextInt();
		System.out.println("Enter the number");
		int c = scan.nextInt();
		System.out.println(modus(a,b,c));
		scan.close();
	}

}
