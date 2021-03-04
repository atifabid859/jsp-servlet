package com.b;

public class Print1to2 {

	public static void main(String[] args) {
		PrintNumbers(100);

	}

	private static void PrintNumbers(int i) {
		if(i>0) {
			System.out.println(i);
			PrintNumbers(i-1);
			
		}
		
	}

}
