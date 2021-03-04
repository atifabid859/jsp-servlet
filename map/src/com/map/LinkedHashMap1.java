package com.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1<Book> {
int id;
String name;


public LinkedHashMap1(int id,String name) {
	this.id=id;
	this.name=name;
	
}
}
class Book{  
	public static void main(String[] args) {
		
	

LinkedHashMap<Integer,LinkedHashMap1> map=new LinkedHashMap<Integer,LinkedHashMap1>();    
LinkedHashMap1 l1=new LinkedHashMap1(102,"Atif");
LinkedHashMap1 l2=new LinkedHashMap1(101,"Ehtesham");
LinkedHashMap1 l3=new LinkedHashMap1(103,"Aamir");
map.put(1,l1);
map.put(2,l2);
map.put(3,l3);
for(Map.Entry<Integer,LinkedHashMap1 > entry:map.entrySet()){    
    int key=entry.getKey();  
    LinkedHashMap1 b=entry.getValue();  
    System.out.println(key+" Details:");  
    System.out.println(b.id+" "+b.name);

}
}}