package com.masai.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.masai.LambdaExpression.Student;

public class Filter {

	
	public static void main(String[] args) {
		
		List<Student>students=new ArrayList<>();
		
		students.add(new Student(10,"Name1",850));
		students.add(new Student(12,"Name2",750));
		students.add(new Student(13,"Name3",650));
		students.add(new Student(14,"Name4",950));
		students.add(new Student(15,"Name5",750));
		
		
		//------filter----forEach--------------------
		students.stream().filter(i->i.getMarks()>800).forEach(s->System.out.println(s.getName()));
		
//		-----------------Stream obj-----------
		Stream<Student>st=students.stream().filter(i->i.getRoll()>12);
		
		
		// collect--------------------------
		
		List<Student>list=st.collect(Collectors.toList());
		
		System.out.println(list);
		
		// filter ----collect----collectors.toList------------------
	List<Student>l=	students.stream().filter(i->i.getMarks()>700).collect(Collectors.toList());
		System.out.println(l);
		
	}
}
