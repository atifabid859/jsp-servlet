package com.java;

import java.util.Scanner;

public class Peactic1 {
public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
System.out.println("Enter the number");
int no=sc.nextInt();
/*int num=no;
while(no>0) {
	no=no-2;
}
if(no==0) {
	System.out.println(num+"even number");
}
else {
	System.out.println(num+"odd number");
}*/
if((no & 1)==1){
	System.out.println(no+"odd number");
	
}
else {
	System.out.println(no+"even number");
}
}
}

