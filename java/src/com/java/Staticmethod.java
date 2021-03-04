package com.java;

public class Staticmethod {
	static void show() {
		System.out.println("Aamir");
	}
	static void display() {
		System.out.println("Atif");
	}

	public static void main(String[] args) {
		//show();
		//display();
		Staticmethod.show();
		Staticmethod.display();
		A.mugic();
	}

}
class A{
	static void mugic() {
		System.out.println("Asad");
	}
}
