package com.jsoft;
import java.util.*;



public class MAp {

	public static void main(String[] args) {
   Map<Integer,String> map=new HashMap<Integer,String>();
   map.put(1, "Sakib");
   map.put(null, "Aslam");
   map.put(3, "Atif");
   map.put(4, "Arshad");
   System.out.println(map);
  for(Map.Entry m:map.entrySet()) {
	  System.out.println(m.getKey()+""+m.getValue());
	  
	  }
  Map<Integer,String> hm=new HashMap<Integer,String>();
  hm.put(5, "Samer");
  map.putAll(hm);
  for(Map.Entry m:map.entrySet()) {
	  System.out.println(m.getKey()+""+ m.getValue());
	 // System.out.println();
  }
	
	}

	
	}


