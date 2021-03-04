package com.java8;
interface Default{
	
	default void show() {
		System.out.println("do it now");
	}
}
@FunctionalInterface
interface Super extends Default {
	
	void display(String msg);
}

public class DefaultExample implements Super {

	@Override
	public void display(String msg) {
		System.out.println(msg);
		
	}
	public static void main(String[] args) {
		DefaultExample example=new DefaultExample();
		example.display("java program");
		example.show();
	}

}
