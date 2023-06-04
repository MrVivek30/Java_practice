package com.masai.innerClass;

class Main{
	public static void main(String[] args) {
		
		AnonymousInnerClass aI=new AnonymousInnerClass() {
			
			public void sayHello(String name) {
				System.out.println("Welcome mumbai "+name);
			}
		};
		
		aI.sayHello("Vivek");
	}
}