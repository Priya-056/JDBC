package com.sonata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertValues {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Priya056*");
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?)");//?are placeholder
			ps.setInt(1, 8451);
			ps.setString(2, "Appa");
			ps.setDouble(3, 1000000.00);
			int a=ps.executeUpdate();
			System.out.println("The no of updated recods are: "+a);
	}
		catch(Exception e){
			
			System.out.print(e);
		}

}
}
