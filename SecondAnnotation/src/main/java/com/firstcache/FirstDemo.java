package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.SecondAnnotation.Student1;
public class FirstDemo {
	public static void main(String[] args) {
		
	
	SessionFactory factory=new Configuration().configure().buildSessionFactory();
	Session session=factory.openSession();
	Student1 student= (Student1)session.get(Student1.class, 11);
	System.out.println(student);
	System.out.println("working something");
	Student1 student1= (Student1)session.get(Student1.class, 11);
	System.out.println(student1);
	session.close();
	factory.close();
}
}