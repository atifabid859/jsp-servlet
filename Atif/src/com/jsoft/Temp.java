package com.jsoft;
class Aamir{
	void show() {
		System.out.println("showing");
	}
}
class Aasim extends Aamir{
	void show() {
		System.out.println("child class");
	}
	void run() {
		System.out.println("running");
	}
}

public class Temp {
	public static void main(String[] args) {
		Aamir a=new Aasim();
		((Aasim)a).run();
	}

}
