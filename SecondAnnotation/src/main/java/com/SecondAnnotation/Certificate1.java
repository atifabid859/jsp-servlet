package com.SecondAnnotation;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate1 {

	private String course;
	private String duration;
	public Certificate1() {
		super();
		
	}
	public Certificate1(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Certificate1 [course=" + course + ", duration=" + duration + "]";
	}
	
	
}
