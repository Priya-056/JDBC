package com.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbconnection {
	
	Connection con;
	public Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Priya056*");
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		catch(SQLException e1) {
			System.out.println(e1);
		}
		return con;
		
	}
	
	public void closeConnection() {
		try {
			if(con !=null) {
				con.close();
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
