package com.keshav.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.keshav.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args)   {
		
		
		Employee emp = new Employee(1, "Vinod", "Male", 33333);
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(emp);
		tx.commit();
	}

}
