package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraylistReverse {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println(list);
		Collections.reverse(list);
		Iterator<Integer> str=list.iterator();
		while (str.hasNext()) {
			System.out.println(str.next());
			
		}
		
	}

}
