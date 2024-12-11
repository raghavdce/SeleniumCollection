package com.jktech.pattern;

public class ReverseHillPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		//to print the number of rows
		for(int i=1;i<=n;i++) {
			
			//to print the increasing triangle of spaces
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			
			//to print the decreasing triangle of stars with one less column hence j<n
			for(int j=i;j<n;j++) {
				System.out.print("* ");
			}
			
			//to print the decreasing triangle of stars 
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}
			
			
			System.out.println();
		}

	}

}
