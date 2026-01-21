package com.keshav.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.keshav.config.EmpConfiguration;
import com.keshav.entity.Address;
import com.keshav.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args)   {
		
		
		Employee emp1 = new Employee();
		emp1.setName("Vinay");
		emp1.setGender("M");
		emp1.setSalary(400000);
		
		
		Address add1 = new Address();
		add1.setCity("Noida");
		add1.setState("UP");
		add1.setEmployee(emp1);
		
		emp1.setAddress(add1);
		
		
		Session session =  EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.persist(add1);
		session.persist(emp1);
		tx.commit();
		
		Employee employee = session.find(Employee.class, 1);
		System.out.println(employee);
		System.out.println(employee.getAddress());
		
		Address address = session.find(Address.class, 1);
		System.out.println(address);
		System.out.println(address.getEmployee());

		
		
	}

}
