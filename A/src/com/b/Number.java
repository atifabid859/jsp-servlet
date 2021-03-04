package com.b;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number {
public static void main(String[] args) {
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number ");
	name=sc.nextLine();
	System.out.println("Length:"+name.length());
	 Pattern p = Pattern.compile( "^[a-zA-Z0-9_]*$");
	 Matcher m=p.matcher(name);
	 if(m.find())
	 {
		 System.out.println("number is valid");
	 }
	 else {
		 System.out.println("number is Invalid ");
	 }
	
	
}







}
