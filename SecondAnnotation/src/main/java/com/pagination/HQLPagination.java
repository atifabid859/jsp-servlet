package com.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.SecondAnnotation.Student1;
//pegination program
public class HQLPagination {
 public static void main(String[] args) {
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	Session session=factory.openSession();
	Query query=session.createQuery("from Student1");
	query.setFirstResult(1);
	query.setMaxResults(4);
	List<Student1> list=query.list();
	for(Student1 str:list) {
		System.out.println(str.getId()+""+str.getCity()+""+str.getName());
	}
	
	factory.close();
	session.close();
}
}
