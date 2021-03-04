package com.b;

public class Static1 {
int emp_id;
String name;
static String company="jsoft"; 

Static1(int emp_id,String name){
	this.emp_id=emp_id;
	this.name=name;
}
void show () {
	System.out.println(emp_id+""+name+""+company);
}
public static void main(String[] args) {
	Static1 s=new Static1(102,"Atif");
	Static1 s1=new Static1(104,"Aamir");
	s.show();
	s1.show();
}
}

