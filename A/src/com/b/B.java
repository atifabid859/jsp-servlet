package com.b;

public class B {
	int a;

	B() {
		a = 10;
	}

	public static void main(String[] args) {
		B o = new B();
		B K = o;
		o.a = 20;
		System.out.println(o.a + "" + K.a);
	}

}
