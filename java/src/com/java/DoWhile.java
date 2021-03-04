package com.java;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
int i=0;
System.out.println("even number");
do {
	System.out.println(i+"");
	i+=2;
	
}while(i<=num);
i=1;
System.out.println("odd number");
do {
	System.out.println(i+"");
	i+=2;
}while(i<=num);
	}

}
