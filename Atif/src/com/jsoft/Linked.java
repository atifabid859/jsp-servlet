package com.jsoft;
import java.util.*;
public class Linked {
public static void main(String[] args) {
	LinkedHashMap<Integer,String> link=new LinkedHashMap <Integer,String>();
	link.put(3, "zaid");
	link.put(1, "Aasa");
	link.put(2, "kareem");
	
	System.out.println(link);
	 link.put(null, "Atif");
	for(Map.Entry m:link.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
		
	}
}
}
