package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class ArraySysch {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("Atif");
		list.add("sakib");
		list.add("Aamir");
		list.add("Naseem");
		list.add("Ehtesham");
		System.out.println(list);
		list=Collections.synchronizedList(list);
		synchronized (list) {
			Iterator<String> my=list.iterator();
			while (my.hasNext()) {
				System.out.println(my.next());
				
			}
		}
	}

}
