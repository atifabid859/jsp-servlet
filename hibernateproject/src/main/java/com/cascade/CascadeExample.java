package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.question.Answer;
import com.question.Question;
public class CascadeExample {

	public static void main(String[] args) {

             SessionFactory Factory = new Configuration().configure().buildSessionFactory();
             Session session=Factory.openSession();
             Question que=new Question();
             que.setQuestionid(11101);
             que.setQuestion("what is your name");
             Answer answer1=new Answer(12222,"my name is Aamir");
             Answer answer2=new Answer(1009088,"my name is asadullah");
             Answer answer3=new Answer(1808,"my name is sakib");
                         List<Answer> list= new ArrayList<Answer>(); 
                         list.add(answer1);
                         list.add(answer2);
                         list.add(answer3);
                         que.setAnswer(list);
                         Transaction tr=session.beginTransaction();
                         session.save(que);
                         
                         tr.commit();
                         Factory.close();
                         session.close();

	}

}
