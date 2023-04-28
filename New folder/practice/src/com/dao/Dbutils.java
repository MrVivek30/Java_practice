package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Dbutils {

	final static String url;
	final static String username;
	final static String password;
	
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResourceBundle bundle= ResourceBundle.getBundle("db");
		url=bundle.getString("url");
		username=bundle.getString("username");
		password=bundle.getString("password");
		
		
	}
	static Connection conTodb() throws SQLException {
		return DriverManager.getConnection(url,username,password);
	}
	static void closecon(Connection con) throws SQLException {
	if(con!=null) {
		con.close();
	}
	}
}
