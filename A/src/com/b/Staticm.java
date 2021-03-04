package com.b;



public class Staticm {
static void show() {
	System.out.println("Aamir");
}
public static void main(String[] args) {

       show();
       A.display();
}
}
class A{
	static void display() {
		System.out.println("Atif");
	}
}