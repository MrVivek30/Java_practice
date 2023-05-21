package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{

	private int rollNo;
	private String name;
	private int age;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNo, String name, int age) {
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
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		
//-----------------------//age------------------------------
//		if(age==o.age)
//		return 0;
//		else if(age<o.age)
//			return 1;
//		else
//			return -1;
		
		//---------------------using name-----------------------
//		return this.name.compareTo(o.name);
		
//----------reverse use(-)---------------------		
		return -this.name.compareTo(o.name);
		
		
	}
	
	public static void main(String[] args) {
		
		List<Student>studentsList=new ArrayList<>();
		
		studentsList.add(new Student(1,"vivek",22));
		studentsList.add(new Student(2,"ekta",20));
		studentsList.add(new Student(3,"raj",23));
		studentsList.add(new Student(5,"kamlesh",24));
		
		Collections.sort(studentsList);
		
		System.out.println(studentsList);
	}
}
