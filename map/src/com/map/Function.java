package com.map;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.List;

public class Function {

	static void addList(List<Integer>list) {
		int result=list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(result);
		
	}
	
	/*
	 * List<Integer> list = new ArrayList<>(); list.add(8); list.add(6);
	 * list.add(3); list.add(5); list.add(1); list.add(2);
	 */
	
	//list.forEach(a ->{System.out.println(a);});
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(6);
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(2);
		
		Consumer<List<Integer>> consumer= Function::addList;
		consumer.accept(list);
			

}
}
