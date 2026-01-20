package com.keshav.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Environment;

public class EmpConfiguration {

	public static SessionFactory getSessionFactory() {

		Properties properties = new Properties();

		properties.put(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQLDialect");
		properties.put(AvailableSettings.JAKARTA_JDBC_DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(AvailableSettings.JAKARTA_JDBC_URL, "jdbc:mysql://localhost:3306/hibernate");
		properties.put(AvailableSettings.JAKARTA_JDBC_USER, "root");
		properties.put(AvailableSettings.JAKARTA_JDBC_PASSWORD, "root");
		properties.put(AvailableSettings.HBM2DDL_AUTO, "create");
		properties.put(AvailableSettings.SHOW_SQL, "true");
//		properties.put(Environment.FORMAT_SQL, "true");

//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(properties).build();
//		Metadata metaData = new MetadataSources(ssr).addAnnotatedClass(com.keshav.entity.Employee.class).getMetadataBuilder().build();
//		SessionFactory sessionFactory = metaData.buildSessionFactory();

		return new MetadataSources(new StandardServiceRegistryBuilder().applySettings(properties).build())
				.addAnnotatedClasses(com.keshav.entity.Employee.class,com.keshav.entity.Address.class)
				.getMetadataBuilder().build().buildSessionFactory();

	}

}
