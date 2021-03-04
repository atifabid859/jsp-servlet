package com.java;

public interface Cat {
	void show();

}
interface Dog{
	void eat();
	
}
class Animal implements Cat,Dog{


	public void show() {
		System.out.println("Atif Aamir Asad,Arshad,Anas,Sakib");
		
	}
public void eat() {
	System.out.println("second abstract method");
		
	}
	public static void main(String[] args) {
		Animal c= new Animal();
		c.show();
		c.eat();
	}
	
	}
	
	

