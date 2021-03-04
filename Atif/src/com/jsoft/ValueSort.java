package com.jsoft;
import java.util.*;
public class ValueSort {
public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	map.put(32, "junaid");
	map.put(56, "zaid");
	map.put(88, "naseem");
	map.put(45, "sakib");
	map.put(1, "bold");
	System.out.println(map.size());
	Set set=map.entrySet();
	Iterator itr=set.iterator();
	while(itr.hasNext()) {
		Map.Entry sum=(Map.Entry)itr.next();
		System.out.println(sum.getKey()+" : "+sum.getValue());
	
	}
}
}
