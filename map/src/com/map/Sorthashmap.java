package com.map;

import java.util.LinkedHashMap;

public class Sorthashmap {
public static void main(String[] args) {
	LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>(); 
	map.put(1, "Atif");
	map.put(2, "anas");
	map.put(3, "hashim");
	map.put(4, "sakib");
	map.remove(3);
System.out.println(map);
System.out.println(map.entrySet());
map.put(5, "Ehtesham");

System.out.println(map.keySet());
System.out.println(map.values());

}
}

