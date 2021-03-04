package com.jsoft;

public class MethodChaining {
	
	MethodChaining  show() {
		System.out.println("Atif");
		return this;
	}
	void display() {
		System.out.println("Aamir");
	}
	MethodChaining(){
		System.out.println("Asad");
	}

	public static void main(String[] args) {
	new	MethodChaining().show().display();

	}

}
