package com.collection.java;

import java.util.ArrayList;

public class ArrayIndexof {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
	      list.add(1);
	      list.add(1);
	      list.add(2);
	      list.add(3);
	      list.add(5);
	      list.add(3);
	      list.add(2);
	      list.add(1);
	      list.add(1);
	       System.out.println(list);
	       System.out.println(list.lastIndexOf(3));
	       System.out.println(list.indexOf(1));

	}
}
