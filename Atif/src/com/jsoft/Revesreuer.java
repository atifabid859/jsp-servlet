package com.jsoft;
import java.util.Scanner;

public class Revesreuer {
public static void main(String[] args) {
	Scanner str=new Scanner(System.in);
	System.out.println("Enter name");
	String num=str.nextLine();
	String n[]=num.split("");
	for(int i=n.length-1;i>=0;i--) {
		
		System.out.println(n[i]);
		
	}
}
}
