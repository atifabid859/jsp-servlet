package com.java8;
interface Constructor{
	Message getMessage(String msg);
}
 public class Message {
	Message(String msg){
		System.out.println(msg);
	}

public static void main(String[] args) {
	Constructor con= Message::new;
	con.getMessage("welcome");
}
}
