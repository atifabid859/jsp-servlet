package com.jsoft;

public class Withoutloop {
public static void main(String[] args) {
	int number=1;
	printNumberes(number);
}

public static void printNumberes(int num) {

	
	if(num<=100) {
		System.out.println(num+"");
		printNumberes(num+1);
		
	}
		
}
}
