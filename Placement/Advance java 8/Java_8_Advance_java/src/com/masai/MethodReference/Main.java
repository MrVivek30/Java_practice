package com.masai.MethodReference;

public class Main {
 
	 static void getAllDOuble(int n) {
		System.out.println("the double .is   "+n);
	}
	
	
	public static void main(String[] args) {
		A a=Main::getAllDOuble;
		
		a.getAllDOuble(5);
		System.out.println("njjnm    ");
	}
}
