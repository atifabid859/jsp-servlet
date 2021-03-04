package com.SecondAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Student1 student1=new Student1();
		student1.setId(11);
		student1.setName("Asadullah");
		student1.setCity("luck");
		
		Certificate1 certificate1= new Certificate1();
		certificate1.setCourse("javascript");
		certificate1.setDuration("1.6 month");
		student1.setCert(certificate1);
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		session.save(student1);
		tr.commit();
		session.close();
		factory.close();
		System.out.println("done");

	}

}
