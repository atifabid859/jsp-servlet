package com.array;

public class Arraymissingnumber {

	public static void main(String[] args) {
		
	
		int [] a= {1,2,3,5};
		int missingnumber=a.length+1;
		int total_sum=missingnumber*(missingnumber+1)/2;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];

}
		System.out.println(total_sum-sum);
}}