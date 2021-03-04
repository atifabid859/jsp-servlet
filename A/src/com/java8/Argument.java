package com.java8;

public interface Argument {
	public String say(String name);
	
}
class Argument1{
	public static void main(String[] args) {
		Argument a=(name)->{
			return "hello"+name;
			
		};
		System.out.println(a.say(" "+"Atif"));
		Argument b=(name)->{
			return "welcome"+name;
	};
	System.out.println(b.say(" "+"Rezwan"));
}}