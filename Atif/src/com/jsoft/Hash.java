package com.jsoft;
import java.util.*;
public class Hash {
	public static void main(String[] args) {
		  
		Map<Integer,String>map=new TreeMap<Integer,String>();  
		map.put(15,"Zaid");
		map.put(56,"Sameer");
		map.put(98,"Raheem");
		map.put(20,"zaid");
		System.out.println(( map).getOrDefault(98,"not implement"));
		map.remove(15);
	    map.putIfAbsent(100,"Gaurav");
		System.out.println(map);
		Set<Integer> set=map.keySet();
		Iterator itr=set.iterator();
	 while(itr.hasNext()){
		// System.out.println(itr.next());
		 Map.Entry num=(Map.Entry)itr.next();
		System.out.println(num.getKey()+""+num.getValue());
		}
	}
}

