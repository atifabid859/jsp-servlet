package com.java;



public class ScondLargetnumber {

	public static void main(String[] args) {
	
int max;
int a[]= {5,8,6,9,4,12};
for(int i=0;i<a.length;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]>a[j]) {
			max=a[i];
			a[i]=a[j];
			a[j]=max;
		}
}
	}
for(int i=0;i<a.length;i++) {

System.out.println(a[i]+""+a[i]);

	}

}
}
