package com.b;

public class Constructorch {
int id;
String name;
void show(int id,String name) {
	this.id=id;
	this.name=name;
}
	void display() {
		System.out.println(id+""+name);
}

public static void main(String []args) {
	Constructorch t=new Constructorch();
	t.show(101,"Atif");
	t.display();
	
}
}