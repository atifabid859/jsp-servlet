package com.java;

public class Finalmethod {
 void show() {   //final methods can not overridding :compile time error; 
	System.out.println("Aamir");
}
}
class Text extends Finalmethod{
	  void show() {
			System.out.println("Aamir");
		}
	 public static void main(String[] args) {
		Text t=new Text();
		t.show();
	}
}
