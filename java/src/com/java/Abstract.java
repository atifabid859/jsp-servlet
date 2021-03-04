package com.java;

public abstract class Abstract {
	abstract void show();
}
class Child extends Abstract{

	@Override
	void show() {
	System.out.println("abstact class");
		
	}
	public static void main(String[] args) {
		 Child t=new  Child();
		 t.show();
	}
	


}
