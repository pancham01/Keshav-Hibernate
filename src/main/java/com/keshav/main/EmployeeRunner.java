package com.keshav.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.keshav.config.EmpConfiguration;
import com.keshav.entity.Employee;

public class EmployeeRunner {

	public static void delById(int id, Session session) {
//		HQL delete query
		MutationQuery query = session.createMutationQuery("delete from empp where id = :id");
		query.setParameter("id", id);
		query.executeUpdate();
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee("Avya", "FeMale", 64548, "IND");
		Employee emp2 = new Employee("Nitin", "FeMale", 64548, "IND");
		Employee emp3 = new Employee("Neelam", "FeMale", 64548, "IND");
		Employee emp4 = new Employee("Jack", "Male", 64548, "IND");
		Employee emp5 = new Employee("Atharv", "Male", 64548, "IND");
		Employee emp6 = new Employee("Naitik", "Male", 64548, "IND");

		Session session = EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

//		session.persist(emp1);
//		session.persist(emp2);
//		session.persist(emp3);
//		session.persist(emp4);
//		session.persist(emp5);
//		session.persist(emp6);

//		Example of HQL to get all the records
//		Query query1=session.createQuery("from empp",Employee.class);
//		List list=query1.list();  
//		System.out.println(list);
//		
//		HQL to get records with pagination
//		query1.setFirstResult(2);
//		query1.setMaxResults(5);
//		System.out.println(query1.list());

//		Query q=session.createQuery("select max(name) from empp");  
//		List list1=q.list();  
//		System.out.println(list1);  

//		HQL update query Using Named Parameters
//		MutationQuery mutationQuery = session.createMutationQuery("update empp set name=:n where id=:i");  
//		mutationQuery.setParameter("n","Pankaj");  
//		mutationQuery.setParameter("i",4);  
//		System.out.println("status: "+mutationQuery.executeUpdate());  

//		HQL delete query
//		MutationQuery query=session.createMutationQuery("delete from empp where id = 17");  
//		query.executeUpdate();  
//		
//		Query query1=session.createQuery("from empp",Employee.class);
//		List list=query1.list();  
//		System.out.println(list);

		tx.commit();
		session.close();
	}

}
