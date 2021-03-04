package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.question.Question;

public class FirstDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		Question answer= (Question)session.get(Question.class, 10);
		System.out.println(answer);

	}

}
