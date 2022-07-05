package com.insert;

import com.Model.Employee;
import com.daoimpl.Empimpl;

public class InsertDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em=new Employee();
		em.setEmp_id(4512);
		em.setE_name("Sundar");
		em.setE_sal(45612.00);
		
		Empimpl e=new Empimpl();
		int a=e.save(em);
		
		System.out.println(a);

	}

}
