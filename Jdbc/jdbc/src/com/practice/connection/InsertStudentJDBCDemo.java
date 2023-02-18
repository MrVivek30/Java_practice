package com.practice.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class InsertStudentJDBCDemo {
public static void main(String[] args) throws SQLException {
	Connection con=null;
	try {
		// write code to load the driver class
		
		Class.forName("com.mysql.cj.jdbc.Driver");//----1
		//call the getConnection method using DriverMangaer class
		
		String url="jdbc:mysql://localhost/practice";
		String username="root";
		String pass="root";
		 con=DriverManager.getConnection(url,username,pass);//---2
	System.out.println("concetion successful");
	
	//Create SQl query for inserting the record
	String insertStatement="Insert into student1(roll_no,name,cgpa, registration_date) values('sb101','vivek',8.0,curdate())";
	
	//get object of statement for the connection
	Statement state=con.createStatement();
	if(state.executeUpdate(insertStatement)>0) {
		System.out.println("student added succesfully");
	}else {
		System.out.println("student added went wrong");
	}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
	}finally {
		if(con!=null) {
			//means connection was established
//			try {
//			con.close();
//			System.out.println("connection closed");
//		}catch(SQLException ex){
//			ex.printStackTrace();
//		}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("connection closed");
	}
	
}
}
}