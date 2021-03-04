package com.java8;
 interface Parent{
	 void say(String msg);
 }

public class FunctionnalExample1 implements Parent{

	@Override
	public void say(String msg) {
		
		
		System.out.println(msg);
	}
	public static void main(String[] args) {
		FunctionnalExample1  example=new FunctionnalExample1();
		example.say("java");
	}

}
