package com.b;

import java.util.Scanner;

public class Soulation {
	static int solvemefirst(int a,int b) {
		return a+b;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int num;
		num=solvemefirst(a,b);
System.out.println(num);
	}

}
