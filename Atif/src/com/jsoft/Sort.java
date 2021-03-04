package com.jsoft;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

public class Sort {
	public static void main(String[] args) {
		Map<Integer,String> mat= new TreeMap<Integer,String>();
		mat.put(1,"Atif");
		mat.put(15,"jsad");
		mat.put(8,"wnas");
		mat.put(5,"damir");
		mat.put(9,"Sakib");
		mat.put(50,"grshad");
		System.out.println("befoe Sorting");
		Set set=mat.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			Map.Entry nem=(Map.Entry)itr.next();
			System.out.println(nem.getKey()+": "+nem.getValue());
		}
		Map<Integer,String> map= new TreeMap<Integer,String>(mat);
		 
		System.out.println("After Sorting");
		Set set1=map.entrySet();
		Iterator itr1=set1.iterator();
		while(itr1.hasNext()) {
			Map.Entry nem1=(Map.Entry)itr1.next();
			System.out.println(nem1.getKey()+": ");
			System.out.println(nem1.getValue());
			
		/*Map<Integer, String> map = new TreeMap<Integer, String>(mat); 
        System.out.println("After Sorting:");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
             Map.Entry me2 = (Map.Entry)iterator2.next();
             System.out.print(me2.getKey() + ": ");
             System.out.println(me2.getValue());*/
	}

}
}
