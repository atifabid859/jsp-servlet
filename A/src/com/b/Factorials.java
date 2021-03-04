package com.b;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		int num=0,str,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		 num=n;
		 while(n>0) {
			 str=n%10;
			 sum=(sum*10)+str;
			 n=n/10;
		 }
		 if(num==sum) {
			 System.out.println("palindrom no");
		 }
		 else {
			 System.out.println("not palindrom no");
		 }
		

	}

}
