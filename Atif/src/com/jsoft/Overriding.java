package com.jsoft;

class Arshad{
	static void show() {
		System.out.println("Atif");
	}
}
public class Overriding extends Arshad{
	static void show() {
		System.out.println("Overriding");
	}
	public static void main(String[] args) {
	
		Arshad.show();
	}
}



