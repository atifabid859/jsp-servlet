package com.collection.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Iteratilist {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<String>();

		  llist.add("Hi");

		  llist.add("I");

		  llist.add("Love");

		  llist.add("java");

		  llist.add("Hi");
		  
		  System.out.println(llist);
		  ListIterator<String> str=llist.listIterator(2);
		  while(str.hasNext()) {
			  
		  
		  System.out.println(str.next());
		  }
		  

	}

}
