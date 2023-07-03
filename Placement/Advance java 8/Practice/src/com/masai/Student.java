package com.masai;

import java.util.Objects;

public class Student {
private int id;

public Student(int id) {
	super();
	this.id = id;
}


@Override
public int hashCode() {
final	int i=31;
	int res=1;
	return res*i+id;
}


@Override
public boolean equals(Object obj) {
	
	Student other = (Student) obj;
	if(id!=other.id) return false;
	return true;
}


public static void main(String[] args) {
	
	Student s=new Student(2);
	Student s2=new Student(2);
	
	System.out.println(s.equals(s2));
	System.out.println(s.hashCode());
	System.out.println(s2.hashCode());
	
}
}
