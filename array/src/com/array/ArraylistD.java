package com.array;

import java.util.ArrayList;
import java.util.List;

public class ArraylistD {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(3);
		list.add(2);
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).equals(list.get(j))) {
					list.remove(j);
					
				}
				
			}
			
			
		}
		System.out.println(list);
		
		
	}

}
