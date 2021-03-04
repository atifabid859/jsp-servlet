package com.question;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	@Column(name="question_id")
	private int questionid;
	private String question;
	@OneToMany(mappedBy = "question",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	private List<Answer> answer;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int questionid, String question, List<Answer> answer) {
		super();
		this.questionid = questionid;
		this.question = question;
		this.answer = answer;
	}
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer> getAnswer() {
		return answer;
	}
	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}	

}
