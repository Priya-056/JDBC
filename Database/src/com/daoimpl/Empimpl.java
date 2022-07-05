package com.daoimpl;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Model.*;
import com.dao.Employeeintf;
public class Empimpl implements Employeeintf {

	@Override
	public int save(Object object) {
		int row=0;
		Employee emp=(Employee)object;
		Dbconnection db=new Dbconnection();
		try {
			PreparedStatement s1=db.getConnection().prepareStatement("insert into employee values(?,?,?)");
			s1.setInt(1, emp.getEmp_id());
			s1.setString(2, emp.getE_name());
			s1.setDouble(3, emp.getE_sal());
			row=s1.executeUpdate();
			db.closeConnection();
}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub
		return row;
	}

}
