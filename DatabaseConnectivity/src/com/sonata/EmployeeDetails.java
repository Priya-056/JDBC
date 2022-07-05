package com.sonata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Priya056*");
		Statement st=con.createStatement();
		ResultSet res=st.executeQuery("Select * from employee");
		while(res.next()) {
			System.out.println(res.getInt(1));
			System.out.println(res.getString(2));
		}
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		catch(SQLException e1) {
			System.out.println(e1);
		}

}
}
