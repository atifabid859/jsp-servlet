package com.jsoft;
import java.util.*;
public class Value {
public static void main(String[] args) {
	HashMap map=new HashMap();
	map.put(101,"Hashim");
	map.put(102,"Asad");
	map.put(103,"Atif");
	map.put(104,"Anas");
	map.put(105,"Aamir");
	System.out.println(map.keySet());
	System.out.println(map.values());
	Set keys=map.keySet();
	Iterator i=keys.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	Collection getValues=map.values();
	i=getValues.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
		
	}
}
}
