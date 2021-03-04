package com.criteria;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.SecondAnnotation.Student1;
public class CriteriaExample {
public static void main(String[] args) {
	Session s=new Configuration().configure().buildSessionFactory().openSession();
	//Student1 st=new Student1();
	Criteria cr=s.createCriteria(Student1.class);
	//cr.add(Restrictions.eq("name","Asadullah"));
	//cr.add(Restrictions.gt("id", 11));
	cr.add(Restrictions.lt("id", 11));
	List<Student1>list =cr.list();
	for(Student1 stu:list) {
		System.out.println(stu);
		
	}
}
}
