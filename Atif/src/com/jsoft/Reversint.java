package com.jsoft;

public class Reversint {
public static void main(String[] args) {
 	/*int a=1234,c,revers = 0;
	
	while(a>0) {
		c=a%10;
	revers= revers*10+c;
		a=a/10;
		System.out.println(revers);
		
	}*/
	String str="Asadullah";
	String ch[] =str.split("");
	for(int i=ch.length-1;i>=0;i--) {
		System.out.println(ch[i]);
		
	}
}
}
