package com.SecondAnnotation;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity
@Table(name="student_address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="address_id")
private int Addressid;
	@Column(length = 50,name="STREET")
private String street;
	@Column(length = 50,name="CITY")
private String city;
	@Column(name="is_open")
private boolean isOpen;
	@Transient
private Double x;
	@Column(name="added_date")
private Date addedDate;
	@Lob
private byte [] image;
public Address() {
		super();
		// TODO Auto-generated constructor stub
}
public Address(int addressid, String street, String city, boolean isOpen, Double x, Date addedDate, byte[] image) {
	super();
	Addressid = addressid;
	this.street = street;
	this.city = city;
	this.isOpen = isOpen;
	this.x = x;
	this.addedDate = addedDate;
	this.image = image;
}
public int getAddressid() {
	return Addressid;
}
public void setAddressid(int addressid) {
	Addressid = addressid;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
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
	return "Address [Addressid=" + Addressid + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen + ", x="
			+ x + ", addedDate=" + addedDate + ", image=" + Arrays.toString(image) + "]";
}

}