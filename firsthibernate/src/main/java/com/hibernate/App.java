package com.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Start the project");
     Configuration cfg=new Configuration();
     cfg.configure("com/hibernate/hibernate.cfg.xml");
     SessionFactory factory=cfg.buildSessionFactory();
     System.out.println(factory);
     factory.close();

   
  
    }
    
}
