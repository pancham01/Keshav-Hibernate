package com.keshav.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.keshav.config.EmpConfiguration;
import com.keshav.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args)   {
		
		
		Employee emp1 = new Employee("Shivam", "FeMale", 64548,"IND");
		Employee emp2 = new Employee("Vimla", "FeMale", 64548,"IND");
		Employee emp3 = new Employee("Keshav", "FeMale", 64548,"IND");
		

		
		Session session =  EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
//		session.persist(emp1);
//		session.persist(emp2);
//		session.persist(emp3);
//		tx.commit();
		
		
		Query<Employee> query = session.createQuery("from empp",Employee.class);
		
		System.out.println(query.list());
		
	}

}
