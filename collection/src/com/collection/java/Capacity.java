package com.collection.java;

import java.util.ArrayList;

public class Capacity {

	public static void main(String[] args) {
		ArrayList<Integer> list=new 	ArrayList<Integer>(5);
		System.out.println("intial size"+list.size());
		list.add(4);
		list.add(10);
		list.add(8);
		list.add(12);
		
		System.out.println(list);
		System.out.println("intial size"+list.size());
list.ensureCapacity(10);
list.add(20);
list.add(44);
System.out.println("intial size"+list.size());
list.trimToSize();
System.out.println("intial size"+list.size());
for(int num:list) {
	System.out.println(num+" ");
}
}
}