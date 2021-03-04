package com.java;

public class Encapsulation {
	private int emp_id;
private	String name;
private String address;
public int getEmp_id() {
	return emp_id;
}
public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
} 
	public static void main(String[] args) {
		Encapsulation t=new Encapsulation ();
		t.setEmp_id(102);
		t.setName("Aamir");
		t.setAddress("sakinaka");
		System.out.println(t.getEmp_id()+"\n"+t.getName()+"\n"+t.getAddress());
	}

}
