package com.java;

public class Superconstructor {

	protected Superconstructor(){
		 System.out.println("parent class constructor");
	 }
}
class Superc extends Superconstructor{
private	Superc(){
	
		System.out.println("child class constructor");
	}
	public static void main(String[] args) {
		Superc su=new Superc();
	}
}
