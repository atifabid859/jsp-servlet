package com.b;

public class palindrome {

	public static void main(String[] args) {
		int num=212, rem,rev=0;
		int temp=0;
		temp=num;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			temp=num/10;
		}
		if(rev==temp) {
			
			System.out.println("palindrome number");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
