package com.collection.java;

import java.util.ArrayList;
import java.util.Collections;

public class Revers {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

	}

}
