package com.java8;
interface Print{
	void say();
}
public class MethodRefrence {
	public static void display() {
		System.out.println("hello world");
	}
public static void main(String[] args) {
	Print print=MethodRefrence::display;
	print.say();
	
}
}
