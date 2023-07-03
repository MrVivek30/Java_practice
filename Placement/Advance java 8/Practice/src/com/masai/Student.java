package com.masai;

public class Student {
private int id;

public Student(int id) {
	super();
	this.id = id;
}

public boolean equals(Object obj) {
	Student s=(Student) obj;
	if(id!=s.id) {
		return  false;
	}
	return true;
}
public static void main(String[] args) {
	
	Student s=new Student(2);
	Student s2=new Student(2);
	
	System.out.println(s.equals(s2));
	
}
}
