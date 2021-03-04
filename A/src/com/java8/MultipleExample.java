package com.java8;
@FunctionalInterface
interface Multiple{
	String say(String message);
}
public class MultipleExample {

	public static void main(String[] args) {
		Multiple m=(message)->{
		String s="hello";
		String s2=s+message;
		return s2;
		};
		System.out.println(m.say(" "+"good morning"));
	}

}
