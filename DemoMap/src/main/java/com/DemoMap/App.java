package com.DemoMap;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Emp e1=new Emp();
        Emp e2=new Emp();
        e1.setEid(40);
        e1.setName("Atif");
        e2.setEid(31);
        e2.setName("Aamir");
        Project p1=new Project();
        Project p2=new Project();
        p1.setPid(15);
        p1.setProjectName("Library Management");
        p2.setPid(20);
        p2.setProjectName("Room Management");
        
        List<Emp>list1=new ArrayList<Emp>();
        List<Project>list2=new ArrayList<Project>();
        list1.add(e1);
        list1.add(e2);
        
        list2.add(p1);
        list2.add(p2);
        //
       
        e1.setProject(list2);
        p2.setEmp(list1);
       
        
     Session session=factory.openSession();
     Transaction tr=session.beginTransaction();
     session.save(e1);
     session.save(e2); 
     session.save(p1);
     session.save(p2);
     tr.commit();
        factory.close();
        session.close();
    }
}
