package com.fibonacci;

public class Fibonacci {
public static void main(String[] args) {
	int n=0,n2=1,n3,i,count=10;
	System.out.println(n+""+n2);
	for(i=2;i<10;i++);
	{
		n3=n+n2;
		System.out.println(n3);
		n=n2;
		n2=n3;
	}
}
}
