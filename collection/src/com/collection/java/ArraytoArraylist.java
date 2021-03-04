package com.collection.java;

import java.util.ArrayList;
import java.util.Collections;

public class ArraytoArraylist {

	

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Atif");
		list.add("sakib");
		list.add("saleem");
		System.out.println(list);
		String[] str=new String[] {"umar","Asadullah"};
	Collections.addAll(list, str);
	System.out.println(list);

	}

}
