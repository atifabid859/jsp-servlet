package com.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import com.SecondAnnotation.Student1;
public class SQLExample {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		//sql query
		String s="select * from student1";
		NativeQuery qu = session.createSQLQuery(s);
		List<Object []>list=qu.list();
		for(Object[] str:list) {
			System.out.println(Arrays.toString(str));
			
			
	
		}
	}
	
}
