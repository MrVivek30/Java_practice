//package com.jdbc.practice.CRUD;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
////Update, Delete and Select statement, Dynamic Query: PreparedStatement
//public class CRUDusingStatic {
//	//you are here means driver is loaded
//	static final String url="jdbc:mysql://localhost:/jdbc";
//	static final String username="root";
//	static final String password="root";
//	
//	
//	static {
////		code to load Driver class
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
////	connectTodatabsee------------------------------------------
//	static Connection connectToDatabse() throws SQLException {
//	return DriverManager.getConnection(url,username,password);	
//	}
////	close connection----------------------------------
//	static void CloseConnection (Connection con) throws SQLException {
//		if(con!=null) {
//			con.close();
//		}
//	}
//	
//	
//	public static void main(String[] args) {
//		
//	}
//}
// 
