package com.jsoft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;



public class Text {
public static void main(String[] args) {
	List<Employee> list=new ArrayList<>();
	HashMap<String,List<Employee>> map=new HashMap<>();
	/*
	 * System.out.println("max salary"); Scanner sc =new Scanner(System.in);
	 * System.out.println("name"); String name=sc.nextLine();
	 * System.out.println("salary"); int salary=sc.nextInt();
	 */
	
	Employee e=new Employee("Atif", 50000);
	Employee e1=new Employee("Atif1", 11000);
	Employee e2=new Employee("Atif2", 9000);
	Employee e3=new Employee("Atif3", 20000);
	Employee e4=new Employee("Atif4", 10000);
	
	list.add(e);
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	map.put("Jsoft", list);
	
	Set<Entry<String, List<Employee>>> entrySet = map.entrySet();
	
	Iterator<Entry<String, List<Employee>>> iterator = entrySet.iterator();
                           while(iterator.hasNext())
                           {
                        	   Entry<String, List<Employee>> next = iterator.next();
                        	   String key = next.getKey();
                        	             List<Employee> value = next.getValue();
                        	             Iterator<Employee> iterator2 = value.iterator();
                        	                while(iterator2.hasNext())
                        	                {
                        	                	Employee next2 = iterator2.next();
                        	                	if(next2.salary>10000)
                        	                	{
                        	                		System.out.println(key+" "+next2);
                        	                	}
                        	                }
                           }
                            
}
}
