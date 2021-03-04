package com.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class StreamApi {
	public static void main(String[] args) {
		
			
		Consumer<Integer> display= a  ->System.out.println(a);
		display.accept(10);
		
		Consumer<List<Integer>> modify= list ->{
			for(int i=0;i<list.size();i++)
				list.set(i,2 * list.get(i));
			
		};
	Consumer<List<Integer>> displayList= list -> list.stream().forEach(a ->System.out.println(a+" "));		
		 // Collections.sort(list); list.forEach(a->{ System.out.println(a); });
	List<Integer> list = new ArrayList<>();
	list.add(8);
	list.add(6);
	list.add(3);
	list.add(5);
	list.add(1);
	list.add(2);
	modify.accept(list);
	displayList.accept(list);
		
	}

	
		
	}

