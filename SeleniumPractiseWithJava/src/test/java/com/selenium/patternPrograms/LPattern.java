package com.selenium.patternPrograms;

public class LPattern {

	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=i;j++) {
				if(i==j) {
				System.out.print("* ");}
				
				if(i==n)
					System.out.print("* ");
			}
			
			
			System.out.println();
		}

	}

}
