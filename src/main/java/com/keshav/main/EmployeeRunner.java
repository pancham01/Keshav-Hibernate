package com.keshav.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.keshav.config.EmpConfiguration;
import com.keshav.entity.Address;
import com.keshav.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args)   {
		
		
		Employee emp1 = new Employee("Shivam", "FeMale", 64548);
		Address add1 = new Address("Noida", "UP");
		
		emp1.setAddress(add1);
		
		
		Session session =  EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(add1);
		session.persist(emp1);
		tx.commit();
		
		
//		Query<Employee> query = session.createQuery("from empp",Employee.class);
//		System.out.println(query.list());
		
	}

}
