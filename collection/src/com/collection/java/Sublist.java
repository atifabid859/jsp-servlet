package com.collection.java;

import java.util.ArrayList;
import java.util.Iterator;

public class Sublist {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
	     intList.add(5);
	     intList.add(10);
	     intList.add(15);
	     intList.add(20);
	     intList.add(25);
	     intList.add(30);
	     intList.add(35);
	     intList.add(40);
	     intList.add(45);
	     intList.add(50);
	      System.out.println(intList);
	      System.out.println(intList.subList(1, 8));
	      Iterator str=intList.iterator();
	      while(str.hasNext()) {
	    	  System.out.println(str.next());
	    	  
	      }
	}

}
