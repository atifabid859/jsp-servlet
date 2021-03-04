package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.map.Question;
import com.map.Answer;

import com.SecondAnnotation.Student1;

public class HQLExample {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		
		//delete Student
		/*
		 * Transaction transaction=s.beginTransaction(); Query
		 * q2=s.createQuery("delete from Student1  where id=13"); int
		 * i=q2.executeUpdate(); System.out.println(i);
		 */
		//String query="from Student1 where city='luck'";
		/*String query="from Student1 as s where s.city=:x and s.name=:n";
		Query  q=  s.createQuery(query);
		q.setParameter("x","luck");
		q.setParameter("n", "sakib");
		List<Student1> list=q.list();
		for(Student1 stu:list){
			System.out.println(stu.getName());
		}
		System.out.println("_________________________________________________________");
		Transaction tr=s.beginTransaction();
		  String str="delete from student s where s.city=:a";
		   Query q2= s.createQuery(str);
		   
		   q2.setParameter("a", "Nak");
		   int i=q2.executeUpdate();
		   System.out.println("delete");
		   System.out.println(i);
		   */
		Transaction tr=s.beginTransaction();
		
		
		Query q2=s.createQuery("update Student1  set name=:c where city=:n");
		q2.setParameter("c", "Shubham");
		q2.setParameter("n", "Gora");
		int a=q2.executeUpdate();
		System.out.println(a+"object update");
		tr.commit();
		
		 Query<Object[]> w=s.createQuery("select q.question,q.questionid,a.answer from Question as q INNER JOIN q.answer as a");
		 
		 List<Object []> list3=w.getResultList();
		 
		 for(Object [] arr:list3) {
			 System.out.println(Arrays.toString(arr));
		 }
		
		   
		s.close();
		factory.close();
	
	

}}
