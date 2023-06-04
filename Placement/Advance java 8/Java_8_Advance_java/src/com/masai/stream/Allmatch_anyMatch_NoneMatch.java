package com.masai.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.masai.LambdaExpression.Student;

public class Allmatch_anyMatch_NoneMatch {

	
	
	public static void main(String[] args) {
		
		List<Student>list=new ArrayList<>();
		list.add(new Student(10, "n1", 852));
		list.add(new Student(12, "n2", 854));
		list.add(new Student(13, "n3", 851));
		list.add(new Student(14, "n4", 856));
		list.add(new Student(15, "n5", 858));
		
		
// adding all the marks
		
		int v=list.stream().collect(Collectors.summingInt(i->i.getMarks()));
		System.out.println(v);
		
//		/ AllMathc, NoneMathc, AnyMathc----------------------------
		System.out.println(list.stream().allMatch(i->i.getMarks()>900));
		
		System.out.println(list.stream().anyMatch(i->i.getRoll()==15));
		
		System.out.println(list.stream().noneMatch(i->i.getName()=="Vivek"));
	}
}
