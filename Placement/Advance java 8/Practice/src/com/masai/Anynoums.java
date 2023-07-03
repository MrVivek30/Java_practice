package com.masai;

public class Anynoums {
public void go() {
	System.out.println("Ready to go");
}

public static void main(String[] args) {
	Anynoums a=new Anynoums() {
		
		
		public void go() {
			super.go();
			System.out.println("From an-------go");
			
		}
	};

	a.go();


	
}
}
