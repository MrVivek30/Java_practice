package com.practice.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;
public class InsertStudentWithInputdata {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	//	code to load Driver class------------------------------
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		System.out.println("driver class not found,check jar file");
		e.printStackTrace();
		return;
	}
//	code to take input details of students =-=-=-=-=-=-=-=-=-=-=-=-=--------------=-=
	System.out.println("plz enter rollno,name,cgpa and registarion date");
	
	String rollno=sc.next();
	String name=sc.next();
	double cgpa=sc.nextDouble();
	LocalDate regdate=LocalDate.parse(sc.next());
	
//	ypu are here means Driver class  is loaded-----------------------------------
	
	String url="jdbc:mysql://localhost/practice";
	String username="root";
	String pss="root";
	
	String insertStatement="Insert into student1 (roll_no,name,cgpa, registration_date) values ('"+rollno+"','"+name+"','"+cgpa+"','"+regdate+"')";
	
	
	
	try(Connection con =DriverManager.getConnection(url,username,pss)) {

	//you are here means connection is successful
		
		Statement st=con.createStatement();
		if(st.executeUpdate(insertStatement)>0) {
			System.out.println("student added.....");
		}else {
			System.out.println("somthing went wrong.....");
		}
		//once execution of try block is over then connection will be released automatically, no need of finally block
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	
}
	sc.close();
}
}