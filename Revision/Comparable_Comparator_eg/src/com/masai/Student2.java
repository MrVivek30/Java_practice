package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student2 {

	 int rollNo;
	 String name;
	 int age;
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student2(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return " rollNo=" + rollNo + ", name=" + name + ", age=" + age +"\n";
	}
	
	
	public static void main(String[] args) {
		
		List<Student2>studentsList=new ArrayList<>();
		
		studentsList.add(new Student2(1,"vivek",22));
		studentsList.add(new Student2(2,"ekta",20));
		studentsList.add(new Student2(3,"raj",23));
		studentsList.add(new Student2(5,"kamlesh",24));
		
		
		// age------------
	Collections.sort(studentsList,new AgeComparator());
		
		System.out.println(studentsList);
		
		Collections.sort(studentsList,new NameComparator());
		
		System.out.println(studentsList);
	}
}
