package com.jdbc.practice.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//Example: Inserting the record into the Student table using PreparedStatement 

public class PreparedInsertDemo {
public static void main(String[] args) {
//	taking input form user-------------------------------------------------------------
//	int i=0;
//	while(i<10) {
//		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter rollno: ");
	int rollno=sc.nextInt();
	System.out.println("enter name: ");
	String name=sc.next();
	System.out.println("enter adress: ");
	String add=sc.next();
	System.out.println("enter marks: ");
	int marks=sc.nextInt();
	
	
//	loding driver---------------------------------------------
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	connecting to database(Mysql)--------------------------------------------------
	
	String url="jdbc:mysql://localhost/jdbcdemo";
	
	try(Connection con=DriverManager.getConnection(url,"root","root")) {
		
		String insert="insert into student values(?,?,?,?)";
		
		PreparedStatement p=con.prepareStatement(insert);
		p.setInt(1, rollno);
		p.setString(2, name);
		p.setString(3, add);
		p.setInt(4, marks);
		
		if(p.executeUpdate()>0) {
			System.out.println("Added successfully..........");
		}else {
			System.out.println("Something went wrong.......");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//	i++;
//	}
	
	
}
}
