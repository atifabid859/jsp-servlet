package com.embdedd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
     
    System.out.println( "Hello World!" );
    
    Configuration cfg=new Configuration();
    cfg.configure("com/embdedd/hibernate.cfg.xml");
    SessionFactory factory=cfg.buildSessionFactory();
    Session session=factory.openSession();
    Transaction tr=session.beginTransaction();
Student2 stu=new Student2();
stu.setId(101);
stu.setName("Atif");
stu.setCity("luck");
Certificate certificate=new Certificate();
certificate.setCourse("javascript");
certificate.setDuration("1.8 Month");
stu.setCerti(certificate);
session.save(stu);
factory.close();

session.close();
    }
}
