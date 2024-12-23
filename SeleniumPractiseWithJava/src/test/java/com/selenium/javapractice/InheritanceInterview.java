package com.selenium.javapractice;

class A {

	public  void man() {
		System.out.println("A Man walks");
	}
}

class B extends A {

	public  void man() {
		System.out.println("B Man walks");
	}
}

public class InheritanceInterview {

	public static void main(String[] args) {
		// Run the code with man method as static and not static

		A obj = new A();
		obj.man();		//static method and non-static --> A Man Walks
		A obj1 = new B();
		obj1.man();	//static method --> A Man Walk and non-static method --> B man Walks
		
		//https://www.geeksforgeeks.org/can-we-overload-or-override-static-methods-in-java/

	}

}
