package com.masai.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.masai.LambdaExpression.Student;

public class ForEach {

	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(1,5,8,6,9,2,7,2,1,6);
		
		list.stream().forEach(i->System.out.println(i));
		
		
		List<Student>students=new ArrayList<>();
		
		students.add(new Student(10,"Name1",850));
		students.add(new Student(12,"Name2",750));
		students.add(new Student(13,"Name3",650));
		students.add(new Student(14,"Name4",950));
		students.add(new Student(15,"Name5",750));
		
		students.stream().forEach(i->System.out.println(i.getMarks()));
		students.stream().forEach(i->System.out.println(i.getName()));
	}
}
