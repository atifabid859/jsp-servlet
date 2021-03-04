package com.hibernate;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
@Entity
@Table(name="student_address")
public class Student1 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="student_id")
private int studentid;
@Column(name="City")
private String city;
@Column(name="Street")
private String street;
@Column(name="is_open")
private boolean isOpen;
@Transient
private Double x;
@Temporal(TemporalType.DATE)
@Column(name="added_date")
private Date addedDate;
@Lob
private byte [] image;
public Student1() {
	super();
	
}
public Student1(int studentid, String city, String street, boolean isOpen, Double x, Date addedDate, byte[] image) {
	super();
	this.studentid = studentid;
	this.city = city;
	this.street = street;
	this.isOpen = isOpen;
	this.x = x;
	this.addedDate = addedDate;
	this.image = image;
}
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public boolean isOpen() {
	return isOpen;
}
public void setOpen(boolean isOpen) {
	this.isOpen = isOpen;
}
public Double getX() {
	return x;
}
public void setX(Double x) {
	this.x = x;
}
public Date getAddedDate() {
	return addedDate;
}
public void setAddedDate(Date addedDate) {
	this.addedDate = addedDate;
}
public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}
@Override
public String toString() {
	return "Student1 [studentid=" + studentid + ", city=" + city + ", street=" + street + ", isOpen=" + isOpen + ", x="
			+ x + ", addedDate=" + addedDate + ", image=" + Arrays.toString(image) + "]";
}



}