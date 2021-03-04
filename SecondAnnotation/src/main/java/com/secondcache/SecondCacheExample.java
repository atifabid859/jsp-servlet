package com.secondcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import com.SecondAnnotation.Student1;

public class SecondCacheExample {
public static void main(String[] args) {
	
SessionFactory Factory = new Configuration().configure().buildSessionFactory();
Session session1=Factory.openSession();
//first
Student1 student1 = session1.get(Student1.class, 11);
System.out.println(student1);
session1.close();
Session session2=Factory.openSession();
Student1 student2 = session2.get(Student1.class, 11);
System.out.println(student2);
//second
session2.close();
}
}
