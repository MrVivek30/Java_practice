package com.masai;

import java.util.Comparator;

public class AgeComparator  implements Comparator<Student2>{

	@Override
	public int compare(Student2 o1, Student2 o2) {
		// TODO Auto-generated method stub
		
		if (o1.age>o2.age) {
			return 1;
		}else if(o1.age<o2.age) {
			return -1;
		}else {
		return 0;
		}
	}

}


