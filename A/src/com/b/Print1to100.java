package com.b;

public class Print1to100 {

	public static void main(String[] args) {
		int number=1;
		printNumber(number);
	}
	private static void printNumber(int num) {
		
		if(num<=100) {
		System.out.println(num+"");
		printNumber(num+1);
	}
	}

}
