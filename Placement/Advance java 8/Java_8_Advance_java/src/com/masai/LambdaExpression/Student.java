package com.masai.LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
private int roll;
private String name;
private int marks;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int roll, String name, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
}




public static void main(String[] args) {
	
	List<Student>students=new ArrayList<>();
	
//	Student s=n
	students.add(new Student(1,"kali",442));
	students.add(new Student(2,"nabi",464));
	students.add(new Student(3,"avi",561));
	students.add(new Student(4,"kamelsh",757));
	students.add(new Student(5,"visahla",231));
	
	Collections.sort(students,(t1,t2)->t1.getMarks()>t2.getMarks()?1:-1);
	System.out.println(students);
}
}
