package com.array;

public class Dublicatfind1 {
	
	public static void main(String[] args) {
int [] number= {2,5,7,8,9,3,4,3,4,7,2};
System.out.println("dublicate Element");
for(int i=0;i<number.length;i++) {
	for(int j=i+1;j<number.length;j++) {
		if(number[i]==number[j]) {
		System.out.println(number[j]);
	}
	
}

	}

	}
}
