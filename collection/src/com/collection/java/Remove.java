package com.collection.java;

import java.util.ArrayList;
import java.util.Arrays;


public class Remove {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>(Arrays.asList("Atif","Atif","Aamir","Asadullah","Anas"));
	
	System.out.println(list);
	list.add("sakib");
	list.add("umar");
	System.out.println("Add 2 element"+list);
	list.remove(3);
	System.out.println("remove 3 index"+list);
	list.remove("sakib");
	System.out.println(list);
	ArrayList<String> list1=new ArrayList<String>(Arrays.asList("tufail","suhail"));
	//list.addAll(list1);
	list.removeAll(list1);
	System.out.println(list);
}
}
