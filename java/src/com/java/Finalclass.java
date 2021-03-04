package com.java;

public  class Finalclass {  //final class can not extends compile time error;
void show() {
	System.out.println("aamir");
}
}
class  Final extends Finalclass{
	void display() {
		System.out.println("atif");
	}
	public static void main(String[] args) {
		Final f=new Final();
		f.show();
		f.display();
	}
}
