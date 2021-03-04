package com.map;

import java.util.LinkedHashMap;

public class LinkedListExample {
public static void main(String[] args) {
	
	    LinkedHashMap<Integer,String>list=new LinkedHashMap<>();
	    
	    list.put(1, "arshad");
	    list.put(2,"sakib");
	    list.put(3, "Arman");
	    list.put(4, "zaid");
	    System.out.println(list.keySet());
	    System.out.println(list.values());
	    System.out.println(list.entrySet());
}
}
