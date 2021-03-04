package com.java;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int num=sc.nextInt();
int i=0;
System.out.println("even number");
while(i<=num) {
	System.out.println(i);
	i+=2;
}
i=1;
System.out.println("odd number");
while(i<=num) {
	System.out.println(i);
	i+=2;
}
	}

}
