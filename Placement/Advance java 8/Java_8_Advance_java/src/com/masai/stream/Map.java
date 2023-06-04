package com.masai.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("ram");
		list.add("kalesh");
		list.add("valmeki");
		list.add("kanncha");
		list.add("lowrence");

		System.out.println(list.stream().map(i -> "welcome to uttar pradesh " + i).collect(Collectors.toList()));
		
		List<String> l = list.stream().map(i -> "welcome to uttar pradesh " + i).collect(Collectors.toList());
		
		System.out.println(l);

		list.stream().map(i -> "Namste welcome to iNdia " + i).forEach(i -> System.out.println(i));

//		-----------------
		List<String>cList=Arrays.asList("Mumbai","Kolkata","Delhi","Banglore","Lucknow");
		
		
		//maping to uppercase---------------------
		cList.stream().map(i->i.toUpperCase()).forEach(i->System.out.println(i));
		
		
		
		
		
		
		
		
		
		
		//****************************************************************
		
		
		List<Integer>integers=cList.stream().map(i->i.length()).toList();
		System.out.println(integers);
	}
}
