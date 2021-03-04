package com.jsoft;
import java.util.*;
public class Allkey {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1,"Atif");
		map.put(2,"Aamir");
		map.put(3,"Asad");
		map.put(4,"Anas");
		map.put(5,"Arbaz");
		map.put(6,"Altaf");
		
				
		System.out.println(map);
		Set<Integer> keys=map.keySet();
		for(Integer key:keys) {
			System.out.println(key);

	
		}
		
	}

}
