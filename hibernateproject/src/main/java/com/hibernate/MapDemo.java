package com.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {

        System.out.println( "Hello World!" );
        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Student1 student1=new Student1();
        student1.setCity("Basti");
        student1.setStreet("street3");
        student1.setX(121.6777);
        student1.setAddedDate(new Date());
        student1.setOpen(true);
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        session.save(student1);
        tr.commit();
        factory.close();
        session.close();
        

	}

}
