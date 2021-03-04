package com.hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
       
        Student student=new Student();
     
        student.setName("sakib");
        student.setCity("Gorak");
        student.setAddress("semariyawan");
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        session.save(student);
        tr.commit();
        session.close();
        factory.close();
        
    }
}
