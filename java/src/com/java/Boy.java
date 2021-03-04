package com.java;

public interface Boy {
	void show();


}
interface Lion extends Boy{
	void bark();
	
}
class Elephant implements Boy{

	public void bark() {
		System.out.println("hello");
	}

	@Override
	public void show() {
		System.out.println("program");
		
	}
	public static void main(String[] args) {
		Elephant e=new Elephant();
		e.bark();
		e.show();
	}
	
	
}
