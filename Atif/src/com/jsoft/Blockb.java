package com.jsoft;


public class Blockb {
	static {System.out.println("parent static ");}

	Blockb(){
		System.out.println("parent constructor");
	}
	{System.out.println("parent inslizer");}
	}
	class Cons extends Blockb{
		static {System.out.println("child static  ");}

	Cons(){
		System.out.println("child cons");
	}
	{System.out.println("child inslizer");}

	public static void main(String []args) {
		Cons c=new Cons();
		
	}
	}
