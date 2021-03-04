package com.java;

public class Supermethod {
void m() {
	System.out.println("parent class ");
}
}
class Super extends Supermethod{
	void m() {
		System.out.println("child class");
	}
	void show() {
	
		super.m();
		m();
	}
	public static void main(String[] args) {
		Super s=new Super();
		s.show();
	}
}

