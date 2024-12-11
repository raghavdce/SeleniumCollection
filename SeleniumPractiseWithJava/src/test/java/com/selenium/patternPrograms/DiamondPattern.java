package com.selenium.patternPrograms;

public class DiamondPattern {

	public static void main(String[] args) {
		
		//Increasing hill and followed by decreasing hill pattern. in the first hill decrease the 
		//rown count by changing the condition from <=n to <n.

		int n = 5;

		for (int i = 1; i <n; i++) {

			for (int j = i; j <= n; j++) {
				System.out.print("  ");
			}
			
			for(int j=1;j<i;j++) {
				System.out.print("* ");
			}
			
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}			
			
			System.out.println(" ");
		}
		
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("  ");
			}
			
			for(int j=i;j<n;j++) {
				System.out.print("* ");
			}
			
			for(int j=i;j<=n;j++) {
				System.out.print("* ");
			}			
			
			System.out.println(" ");
		}

	}

}
