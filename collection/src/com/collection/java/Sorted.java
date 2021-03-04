package com.collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sorted {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(6);
	list.add(12);
	list.add(5);
	list.add(2);
	list.add(1);
	list.add(7);
	list.add(13);
	System.out.println(list);
	Collections.sort(list, Collections.reverseOrder());
	Iterator it=list.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	Collections.sort(list);
	Iterator str=list.iterator();
	while(str.hasNext()) {
		System.out.println(str.next());
	}
}
}
