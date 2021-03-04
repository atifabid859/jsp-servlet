package com.maping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Text {

	public static void main(String[] args) {
	
SessionFactory Factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
Persion persion=new Persion(101,"skib","sakinaka","9565552012");
Session session=Factory.openSession();
Transaction tr=session.beginTransaction();
session.save(persion);
tr.commit();
session.close();
Factory.close();
	}

}
