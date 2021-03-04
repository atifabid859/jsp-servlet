package com.jsoft;

import java.util.*;

public class Concate {
public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.put(1,"Saif");
	map.put(3,"Atif");
	map.put(2,"Hleem");
	map.put(1,"kareem");
	System.out.println(map);
	
	  map.put(5,"bakwas"); map.get(1); map.remove(1); map.replace(2, "Asad");
	 
	System.out.println(map.clone());
	System.out.println(map);
	System.out.println(map);
}
	
}
