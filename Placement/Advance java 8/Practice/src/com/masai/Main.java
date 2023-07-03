package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main implements Comparable<Main>{

	private int id;
	private String name;
	
	public Main(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Main() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int compareTo(Main m) {
		if(id>m.id) {
			return 1;
		}else if(id<m.id) {
			return -1;
		}else return 0;
	}
	
	@Override
	public String toString() {
		return "Main [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		
		
	List<Main>list=new ArrayList<>();
	
	list.add(new Main(5,"ramu"));
	list.add(new Main(55,"patil"));
	list.add(new Main(8,"rajesh"));
	list.add(new Main(23,"sonu"));
	list.add(new Main(7,"kamlesh"));
		
//		Collections.sort(list);
	Collections.sort(null);
		System.out.println(list);
		
		
//		List<String> numbers = new ArrayList<String>();
//		numbers.add("one");
//		numbers.add("two");
//		numbers.add("three");
//		numbers.add("four");
//		System.out.println(numbers);//[one, two, three, four]
//
//		//Strings - By Default - are sorted alphabetically
//		Collections.sort(numbers);
//		System.out.println(numbers);
		
	}
}
