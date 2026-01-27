package com.keshav.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.keshav.config.EmpConfiguration;
import com.keshav.entity.Address;
import com.keshav.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) {

//		Employee emp1 = new Employee();
//		emp1.setName("Vinay");
//		emp1.setGender("M");
//		emp1.setSalary(400000);
//
//		Address add1 = new Address();
//		add1.setCity("Noida");
//		add1.setState("UP");
//		Address add2 = new Address();
//		add2.setCity("GZB");
//		add2.setState("UP");
//		Address add3 = new Address();
//		add3.setCity("Lucknow");
//		add3.setState("UP");
//		
//		
//		ArrayList<Address> listOfAddresses = new ArrayList<>();
//		listOfAddresses.add(add1);
//		listOfAddresses.add(add2);
//		listOfAddresses.add(add3);
//		
//		emp1.setAddresses(listOfAddresses);

		Session session = EmpConfiguration.getSessionFactory().openSession();
//		Transaction tx = session.beginTransaction();
//		session.persist(add1);
//		session.persist(add2);
//		session.persist(add3);
//		session.persist(emp1);
//		tx.commit();
		
		
		Employee employee = session.find(Employee.class, 1);
		System.out.println(employee);
		System.out.println(employee.getAddresses());

	}

}
