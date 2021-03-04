package com.question;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
	@Id
	@Column(name="answer_id")
	private int answerid;
	private String answer;
	@ManyToOne
	private Question question;
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int answerid, String answer) {
		super();
		this.answerid = answerid;
		this.answer = answer;
	}
	public int getAnswerid() {
		return answerid;
	}
	public void setAnswerid(int answerid) {
		this.answerid = answerid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	
	

}
