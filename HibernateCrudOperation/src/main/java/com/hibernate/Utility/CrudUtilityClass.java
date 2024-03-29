package com.hibernate.Utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class CrudUtilityClass {
	private static SessionFactory sessionFactory;

	private static SessionFactory buildSessionFactory() {
		try {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			System.out.println("Hibernate Annotation Configuration loaded");
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			return sessionFactory;
		}
		catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) 
			sessionFactory = buildSessionFactory();
		return sessionFactory;
	}
}
