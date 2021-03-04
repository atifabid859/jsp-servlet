package com.jsoft;

public class Count {

	public static void main(String[] args) {
int [] arr= {1,2,3,4,5,4,3,6,3,6,7};
int count=0,ok=0;
for (int i =0; i < arr.length; i++) {
	
	for (int j =1+i; j < arr.length; j++) {
		if(arr[i]==arr[j]) {
			count++;
			//System.out.println(arr[i]+" coun value"+ count);
		
		}
	}
	if(count>1) {
		if(count<=arr[i]) {
			System.out.println(arr[i]+""+count);
		}
			
		
	}
}
	}

}
