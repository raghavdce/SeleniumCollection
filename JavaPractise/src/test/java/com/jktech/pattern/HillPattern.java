package com.jktech.pattern;

public class HillPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		//to print the number of rows
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			
			for(int j=i;j<n;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		
		

	}

}
