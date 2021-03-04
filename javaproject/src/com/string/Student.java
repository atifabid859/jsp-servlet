package com.string;



public abstract class Student {
	abstract void show();
    
}
class A extends Student{

	@Override
	void show() {
		System.out.println("nhsg");
	}
	public static void main(String[] args) {
		A a=new A();
		a.show();
	}
}