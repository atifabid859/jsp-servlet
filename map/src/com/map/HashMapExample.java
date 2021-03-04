package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
	//Map map=new HashMap();
		Map<Integer,String>map=new HashMap<>();
	map.put(1, "Atif");
	map.put(2, "Aamir");
	map.put(3, "Asad");
	map.put(4, "Arshad");
	map.put(5, "Anas");
	map.put(6, "sakib");
	map.putIfAbsent(1, "Ozair");
	map.replace(1, "Atif", "ramzan");
	System.out.println(map.get(1));

	Map<Integer,String>map1=new HashMap<>();
	map1.put(2, "saleem");
	map1.put(4, "khan");
	map.putAll(map1);
	System.out.println(map);

	
	for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());

/*Set set=map.entrySet();
Iterator itr=set.iterator();
while(itr.hasNext()) {
	Map.Entry m=(Map.Entry)itr.next();
	
		System.out.println(m.getKey()+"="+m.getValue());*/
}
	
	
	

	}

}
