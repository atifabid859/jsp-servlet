package com.b;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
public static void main(String[] args) {
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name");
	name=sc.nextLine();
	System.out.println("Length:"+name.length());
	 Pattern p = Pattern.compile( "^([A-Za-z])+( [A-Za-z]+)$");
	 Matcher m=p.matcher(name);
	 if(m.find())
	 {
		 System.out.println("name is valid");
	 }
	 else {
		 System.out.println("name is Invalid ");
	 }
}
}

