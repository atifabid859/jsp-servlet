package com.java;

public abstract class Abstractcons {
	 
	Abstractcons(){
		System.out.println("Abstract constructor");
	}
	abstract void show();
	void display() {
		System.out.println("non abstract method");
	}

}
class Parent extends Abstractcons{

	void show() {
		System.out.println("Abstract method ");
		
	}
	public static void main(String[] args) {
		Abstractcons p=new Parent();
		p.show();
		p.display();
	}
	
}
