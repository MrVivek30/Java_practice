package com.jdbc.practice.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDemo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter theb roll no you wnst rop delete");
	int rollno=sc.nextInt();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String url="jdbc:mysql://localhost:/jdbcdemo";
	
	try (Connection con=DriverManager.getConnection(url,"root","root")){
		String delete="delete from student where rollno=?";
		
		PreparedStatement p=con.prepareStatement(delete) ;
	p.setInt(1, rollno);
		if(	p.executeUpdate()>0) {
		System.out.println("Deleted !!!");
		
	}else {
		System.out.println("Something wnet wrong");
	}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
