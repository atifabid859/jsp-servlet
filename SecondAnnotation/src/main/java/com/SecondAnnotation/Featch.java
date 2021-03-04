package com.SecondAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Featch {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tr = session.beginTransaction();

		/*
		 * Address add=session.load(Address.class, 3); System.out.println(add);
		 * 
		 * Address add1=session.load(Address.class, 1); Address
		 * add2=session.load(Address.class, 1);
		 * System.out.println(add1.getStreet()+""+add1.getCity());
		 * System.out.println(add2.getStreet()+""+add2.getCity());
		 * 
		 */

		Student1 stu = (Student1) session.get(Student1.class, 103);
		System.out.println(stu);
		Student1 stu1 = (Student1) session.get(Student1.class, 101);
		Student1 stu2 = (Student1) session.get(Student1.class, 101);
		System.out.println(stu1.getCity() + "" + stu1.getName());
		System.out.println(stu2.getCity() + "" + stu2.getName());

		session.close();
		factory.close();

	}

}
