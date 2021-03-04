package com.jsoft;

public class reverseString {
public static void main(String[] args) {
	String str="Atif Abid";
	char c[] =str.toCharArray();
	
	for(int i=c.length-1;i>=0;i--) {
		System.out.println(c[i]);
		
	}
}
}
