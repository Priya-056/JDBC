package com.sonata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SearchValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila","root","Priya056*");
			PreparedStatement ps=con.prepareStatement("select * from employee where emp_id=(?)");//?are placeholder
			ps.setInt(1, 123);
			ResultSet res=ps.executeQuery();
			while(res.next()) {
				System.out.println(res.getInt(1));
			}
	}
		catch(Exception e){
			System.out.println(e);
		}

}
}
