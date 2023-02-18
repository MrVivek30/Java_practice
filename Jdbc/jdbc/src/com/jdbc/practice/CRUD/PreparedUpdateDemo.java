package com.jdbc.practice.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedUpdateDemo {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the grace marks: ");
	int marks=sc.nextInt();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String url="jdbc:mysql://localhost:/jdbcdemo";
	
	try (Connection con=DriverManager.getConnection(url,"root","root")){
		
		
		String update="update student set marks=marks+? where marks<60";
		PreparedStatement p=con.prepareStatement(update);
		p.setInt(1, marks);
		if(p.executeUpdate()>0) {
			System.out.println("Record updated");
		}else {
			System.out.println("no Record uodated");
			
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
