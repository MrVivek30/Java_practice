package com.ui;

import java.util.Scanner;

import com.dao.UniversityDao;
import com.dao.UniversityUtil;
import com.dto.Student;

public class OrmMain {
public static void main(String[] args) {
	
	Scanner scanner=new Scanner(System.in);
	UniversityDao uDao=UniversityUtil.getInstance("orm");
	int choice =0;
	
	do {
		System.out.println("1.find student by id");
		System.out.println("2.saved student");
		System.out.println("3.delete student by id");
		System.out.println("4.update student cgpa");
		System.out.println("0.Exit");
		System.out.println("enter choice");
		choice=scanner.nextInt();
		
		if (choice==1) {
			System.out.println("enter id");
			int id=scanner.nextInt();
			System.out.println(uDao.findStudentById(id));
		}else if (choice==2) {
			System.out.println("enter id");
			int id=scanner.nextInt();
			System.out.println("enter email");
			String email=scanner.next();
			System.out.println("enter address");
			String address=scanner.next();
			System.out.println("enter cgpa");
			int cgpa=scanner.nextInt();
			System.out.println(uDao.saveStudent(new Student(id,email,address,cgpa)));
		}else if (choice==3) {
			System.out.println("enter id");
			int id=scanner.nextInt();
			System.out.println(uDao.deleteStudentById(id));
		}else if (choice==4) {
			System.out.println("enter id");
			int id=scanner.nextInt();
			System.out.println("enter cgpa");
			int cgpa=scanner.nextInt();
			System.out.println(uDao.updateStudentCGPA(id, cgpa));
		}
		
	} while (choice!=0);
	System.out.println("Exited");
	scanner.close();
}
}
