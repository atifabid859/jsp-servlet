package com.collection.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Addition {
public static void main(String[] args) {
ArrayList<String> list=new ArrayList<String>();
	list.add("Atif");
	list.add("sakib");
	list.add("Aamir");
	System.out.println(list);
	list.add("Asadullah");
	System.out.println("1 element adding"+list);
	List<String> list1=new ArrayList<String>(Arrays.asList("umar,saif"));
	list.addAll(list1);
	System.out.println("addAllmethods element add"+list);
}
}
