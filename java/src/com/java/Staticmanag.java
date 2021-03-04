package com.java;

public class Staticmanag {
	int emp_id;
	String name;
	static String company="jsoft";
	Staticmanag(int emp_id,String name ){
		this.emp_id=emp_id;
		this.name=name;
		System.out.println(emp_id+""+name+""+company);
	}
	//void show() {
		//System.out.println(emp_id+""+name+""+company);
	//}
	
	public static void main(String[] args) {
		Staticmanag sm=new Staticmanag(101,"Atif");
		Staticmanag sm1=new Staticmanag(101,"Aamir");
		//sm.show();
		//sm1.show();
	}

}
