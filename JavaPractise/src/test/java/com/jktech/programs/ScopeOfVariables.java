package com.jktech.programs;

public class ScopeOfVariables {

	
	public int a;
	
	public void initialize() {
		a=10;
	}
	
	public void output() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ScopeOfVariables variable = new ScopeOfVariables();
		variable.output();

	}

}
