package com.java;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
        System.out.println("Enter the number");
        int num=sc.nextInt();
        System.out.println("even number");
        for(int i=0; i<=num;i+=2) {
        	System.out.println(i+"");
        }
        System.out.println("odd number");
        for(int i=1;i<=num;i+=2) {
        	System.out.println(i);
        	
        }
	}

}
