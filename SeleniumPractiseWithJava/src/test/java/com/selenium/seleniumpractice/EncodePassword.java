package com.selenium.seleniumpractice;

import java.util.Base64;

public class EncodePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password = "Welcome@123";
		byte[] encoded = Base64.getEncoder().encode(password.getBytes());
		System.out.println("Encoded password is : "+ new String(encoded));
		byte[] decoded = Base64.getDecoder().decode(encoded);
		System.out.println("The decoded password is : "+new String(decoded));

	}

}
