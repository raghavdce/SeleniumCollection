package com.jktech.programs;
import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter a number");
		int num = scan.nextInt();
		int temp=num;
		int b=0; int sum=0;
		while(num>0) {
			b=num%10;
			sum=sum+(b*b*b);
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("Armstrong number");
		}
		else
			System.out.println("Not Armstrong number");
		
		scan.close();
	}
	

}
