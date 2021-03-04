package com.java;

public class Staticb {
	static {
		System.out.println("parent static ");
	}

	Staticb() {
		System.out.println("parent constructor");
	}

	{
		System.out.println("parent inslizer");
	}
}

class Bolck extends Staticb {
	static {
		System.out.println("child static ");
	}

	Bolck() {
		System.out.println("child constructor");
	}

	{
		System.out.println("child inslizer");
	}

	public static void main(String[] args) {
		Bolck b = new Bolck();
		Bolck b1 = new Bolck();
	}
}
