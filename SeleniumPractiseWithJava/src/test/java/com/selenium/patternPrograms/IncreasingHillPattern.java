package com.selenium.patternPrograms;

public class IncreasingHillPattern {

	public static void main(String[] args) {
		
		//Decreasing triangle of space, followed by 2 increasing triangle of stars
		//in the first increasing triangle change condition from <=i to <i.
		
		int n = 5;

		for (int i = 1; i <= n; i++) {

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

	}

}
