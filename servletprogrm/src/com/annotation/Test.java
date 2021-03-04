package com.annotation;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<?> t  = Class.forName("java.util.Date");
		System.out.println(t.getName());
	}
}
