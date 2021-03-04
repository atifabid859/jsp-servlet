package com.string;

public class Equals {

	public static void main(String[] args) {
		String s1="Atif";
		
		
		String s2=s1.intern();
		String s3=new String("Atif");
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));

	}

}
