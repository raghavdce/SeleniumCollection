package com.selenium.patternPrograms;

public class SquareShape {

	public static void main(String[] args) {
		// Square shape
		int n = 5;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

	}

}
