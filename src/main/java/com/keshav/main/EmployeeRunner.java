package com.keshav.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.keshav.config.EmpConfiguration;
import com.keshav.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args)   {
		
		
		Employee emp = new Employee("Renu", "FeMale", 64548);
		

		
		Session session =  EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		
		
		session.persist(emp);
		tx.commit();
		
		
//		Employee employee = session.find(Employee.class, 3);
//		System.out.println(employee);
//		Employee employee = new Employee();
//		session.load(employee, 15);
//		System.out.println(employee);
	}

}
