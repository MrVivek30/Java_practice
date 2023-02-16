package com.practice.connection;



public class A {
	static {
	System.out.println("inside static -1...........");
	}
	static {
	System.out.println("inside static-2 ...........");
	}
	
	{
		System.out.println("inside non-static..........");
	}
	A(){
		System.out.println(" inside constructor=,.......");
	}
	void fun() {
		System.out.println("inside fun");
	}
	
	public static void main(String[] args) {
		System.out.println("inside main................");
	A a=new A();
	a.fun();
	
	System.out.println("=-=-==-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-");
	A a1=new A();
	}
}
