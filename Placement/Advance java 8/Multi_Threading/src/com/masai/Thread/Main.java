package com.masai.Thread;

import java.util.Iterator;

class A implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++){
			System.out.println("inside A "+i);
		}
		System.out.println("End opf thread a======");
	} 

}
 class B implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=10;i<=20;i++){
			System.out.println("inside B "+i);
		}
		System.out.println("End opf thread b ======");
	} 

}
 class C implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=20;i<=30;i++){
			System.out.println("inside C "+i);
		}
		System.out.println("End opf thread c=====");
	} 

}
 class D implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=30;i<=40;i++){
			System.out.println("inside D "+i);
		}
		System.out.println("End opf thread d=====");
	} 

	

}
public  class Main{
	
	public static void main(String[] args) {
		
		A a=new A();
		B b=new B();
		C c=new C();
		D d=new D();
		
		
		Thread t1=new Thread(a);
		Thread t2=new Thread(b);
		Thread t3=new Thread(c);
		Thread t4=new Thread(d);
		
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		for(int i=50;i<60;i++) {
			System.out.println("Inside Main "+i);
		}
		
		System.out.println("End of Main-----------");
		
	}
}
 
 
 