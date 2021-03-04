package com.SecondAnnotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StatesDemo {

	public static void main(String[] args) {
		//practical of hibernate object
		//1 Transient
		//persisent
		//Detached
		//Remove
		System.out.println("Example");
		SessionFactory f=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		//create object 
		Student1 student1=new Student1();
		student1.setId(14);
		student1.setName("Aamir khan");
		student1.setCity("Nak");
		student1.setCert(new Certificate1("java hibernate Course","4 month"));
		//student Transient
		Session s=f.openSession();
		Transaction tr=s.beginTransaction();
		s.save(student1);
		//student persistent_session database
		//student1.setName("sakib");
		tr.commit();
		s.close();
		//student detached
		student1.setName("Atif");
		System.out.println(student1);
		f.close();

	}

}
