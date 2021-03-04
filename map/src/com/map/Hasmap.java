package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hasmap {

	
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(2, "ftif");
		map.put(1, "damir");
		map.put(4, "qrshad");
		map.put(5, "wnas");
		map.put(3, "Asadullah");
		System.out.println(map);
		System.out.println(map.values());
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+""+m.getValue());
			
		} 
		Set set1=map.entrySet();
		Iterator itr1=set1.iterator();
		while(itr1.hasNext()) {
			Map.Entry sum=(Map.Entry)itr1.next();
			System.out.println(sum.getKey()+" : "+sum.getValue());
		
		}
	}
		}
/*map.put(6,"sakib" );

System.out.println(map.keySet());
System.out.println(map.entrySet());
		for(Map.Entry m:map.entrySet()) {
	
		System.out.println(m.getKey()+""+m.getValue());
	}*/

	



	



