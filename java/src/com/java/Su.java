package com.java;

public class Su {
int a=10;
}
class Chil extends Su{
	int a=20;
	void show(int a) {
		System.out.println(a+"\n"+this.a+"\n"+super.a+"\n");
	}
	
	public static void main(String[] args) {
		Chil t=new Chil();
t.show(30);
	}

}
