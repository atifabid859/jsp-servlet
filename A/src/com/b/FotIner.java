package com.b;

public class FotIner {
	

	public static void main(String[] args) {
		
		int[] a = { 1,2,3,4,6 };
		int num=a[0];
		for (int i = 0; i < a.length; i++) {
			
				if (a[i] < num) {
					num=a[i];
				}
			}
		System.out.println(num);

	}}
	

