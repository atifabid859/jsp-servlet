package com.java;

public class FindNum {
	public static void main(String[] args) {
		String str="12345";
		String val=str;
		char a;
		int num=0;
		int d=0;
		int n;
		for(int i=0;i<=str.length()/2;i++) {
			a=str.charAt(i);
			num=num*10+Character.getNumericValue(a);
			if(Integer.parseInt(str)!=0) {
				d=Integer.parseInt(str)%10;
				num=num*10+d;
				n=Integer.parseInt(str)/10;
				str=Integer.toString(n);
						
		}
	}
		System.out.println(num);

	}
}
