package com.collection.java;

import java.util.ArrayList;

public class Mixsiser {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("Atif");
	list.add("sakib");
	list.add("Aamir");
	list.add("Khan");
	list.add("Altaf");
	System.out.println(list);
	
	System.out.println(list.get(3));
	list.set(4,"Asadullah");
	System.out.println(list);
	list.clear();
	System.out.println(list);
	
}
}
