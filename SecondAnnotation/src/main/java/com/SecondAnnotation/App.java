package com.SecondAnnotation;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "welcome program" );
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Student1 stu=new Student1();
        stu.setId(101);
        stu.setName("sakib");
        stu.setCity("khalilabad");
        System.out.println(stu);
        
        Address ad=(Address) new Address();
        ad.setAddressid(101);
        ad.setStreet("Street2");
        ad.setCity("Bagh nagar");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(1245.2334);
        System.out.println(ad);
      Session session=factory.openSession();
      Transaction tr=session.beginTransaction();
      session.save(stu);
      session.save(ad);
    tr.commit();
      session.close();
      factory.close();
      System.out.println("successfull program");
        
        
    }
}
