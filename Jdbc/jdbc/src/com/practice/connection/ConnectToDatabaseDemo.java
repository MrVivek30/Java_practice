package com.practice.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDatabaseDemo {
public static void main(String[] args) throws SQLException  {
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
	} catch (ClassNotFoundException | SQLException e) {
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
			con.close();
			System.out.println("connection closed");
	}
	
}
}
}
