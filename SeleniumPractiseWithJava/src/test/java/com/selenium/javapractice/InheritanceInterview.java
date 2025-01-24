package com.selenium.javapractice;

class A {

	public  void man() {
		System.out.println("From Parent");
	}
}

class B extends A {

	public  void man() {
		System.out.println("From Child");
	}
}

public class InheritanceInterview {

	public static void main(String[] args) {
		// Run the code with man method as static and not static

		A obj = new A();
		obj.man();		//static method and non-static --> From Parent
		A obj1 = new B();
		obj1.man();	//static method --> From parent and non-static method --> From Child
		
		//https://www.geeksforgeeks.org/can-we-overload-or-override-static-methods-in-java/

	}

}
