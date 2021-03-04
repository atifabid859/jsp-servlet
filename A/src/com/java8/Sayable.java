package com.java8;

public interface Sayable {
public String say();
}
class LambdaExample1{
	public static void main(String[] args) {
		Sayable s=()->{
			return "hello welcome";
			
		};
		System.out.println(s.say());
	}
}
