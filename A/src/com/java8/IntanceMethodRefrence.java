package com.java8;
interface Sub{
	void say();
}
public class IntanceMethodRefrence {
public void saysomething() {
	System.out.println("hello program");
}
public static void main(String[] args) {
	IntanceMethodRefrence methodReference=new IntanceMethodRefrence();
	Sub sub=methodReference::saysomething;
	sub.say();
	
	Sub methodReference1=new IntanceMethodRefrence()::saysomething;
	
	methodReference1.say();
}
}
