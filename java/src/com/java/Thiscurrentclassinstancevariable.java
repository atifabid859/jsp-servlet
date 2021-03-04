package com.java;

public class Thiscurrentclassinstancevariable {
	int i;
	Thiscurrentclassinstancevariable(int i){
		this.i=i;
		//System.out.println(i);
	}
	void show() {
		System.out.println(i);
	}

	
	public static void main(String[] args) {
		Thiscurrentclassinstancevariable b=new Thiscurrentclassinstancevariable(20);
		b.show();

	}

}
