package com.hibernate.Dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.hibernate.model.Passport;
import com.hibernate.model.Person;
public class DaoClass {
	private static SessionFactory factory;

	public static SessionFactory getFactory ()
	{
		Configuration cfg = new Configuration().configure();
		factory = cfg.buildSessionFactory();
		return factory;
	}
	public static void getPersonDetails(int id)
	{
		Session session = factory.openSession();        
		Person person = (Person)session.get(Person.class,id);        
		Passport passport  = person.getPassport();

		String name = person.getName();
		String number=passport.getNumber();
		System.out.println("Person Name =" +  name);
		System.out.println("Passport Number = " + number);
	}
}

