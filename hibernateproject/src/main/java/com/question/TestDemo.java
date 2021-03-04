package com.question;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

//		Question q = new Question();
//		q.setQuestionid(106);
//		q.setQuestion("what is java");
//		Answer answer = new Answer();
//		answer.setAnswerid(4);
//		answer.setAnswer("java is programming language");
//		answer.setQuestion(q);
//
//		Answer answer1 = new Answer();
//		answer1.setAnswerid(9);
//		answer1.setAnswer("with the help can create software");
//		answer1.setQuestion(q);
//		Answer answer2 = new Answer();
//		answer2.setAnswerid(5);
//		answer2.setAnswer("java is palatform indepedent");
//		answer2.setQuestion(q);
//
//		List<Answer> list = new ArrayList<Answer>();
//		list.add(answer);
//		list.add(answer1);
//		list.add(answer2);
//		q.setAnswer(list);

		Session sessio = factory.openSession();
		Transaction tr = sessio.beginTransaction();

		                    Question q= (Question)sessio.get(Question.class,106);
		                    System.out.println(q.getQuestionid());
		                    System.out.println(q.getQuestion());
		                    System.out.println(q.getAnswer().size());

//		sessio.save(q);
//		sessio.save(answer);
//		sessio.save(answer1);
//		sessio.save(answer2);

		tr.commit();
		sessio.close();
		factory.close();

	}

}
