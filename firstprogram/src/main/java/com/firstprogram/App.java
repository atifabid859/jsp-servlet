package com.firstprogram;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Starat the program" );
        
        Configuration cfg=new Configuration().configure("com/firstprogram/hibernate.cfg.xml").addAnnotatedClass(Student.class);
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        Student stu=new Student();
		/*
		 * stu.setId(5); stu.setName("Atif");
		 */
      
      
      //session.save(stu);
      Student student = session.get(Student.class, 1);
      Student student2=session.get(Student.class, 2);
      System.out.println(student2);
      System.out.println(student);
      
       
        tr.commit();
        session.close();
        factory.close();
       
       
    }
}
