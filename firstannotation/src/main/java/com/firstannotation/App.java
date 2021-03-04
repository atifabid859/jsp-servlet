package com.firstannotation;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();
		
		 
		Employee emp=session.get(Employee.class, 1);
		System.out.println(emp);
		tr.commit();
		session.close();
		factory.close();
		System.out.println("successfully save");

	}
}
