package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        //creating question
        Question q1=new Question();
        q1.setQuestionid(564);
        
        q1.setQuestion("where are going");
      //creating question2
        
        
        //create answer
        Answer ans=new Answer();
        ans.setAnswerid(111);
        ans.setAnswer("I am going to marked");
        ans.setQuestion(q1);
        q1.setAnswer(ans);
  
        
        
        //session
        Session session=factory.openSession();
        Transaction tr=session.beginTransaction();
        //save
        session.save(q1);
        
        session.save(ans);
       
        tr.commit();
        session.close();
        factory.close();
       
       
        
	}

}
