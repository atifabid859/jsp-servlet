package com.b;

import java.util.Scanner;

public class Aramstrong {

	public static void main(String[] args) {
		int num=0,str,sum = 0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	num=n;
	while(n>0) {
		str=n%10;
		sum=sum+(str*str*str);
		n=n/10;	
	}
	if(num==sum) {
		System.out.println("Armstrong no");
	}
	else {
		System.out.println("not Armstrong ");
	
	}
	}

}
