package com.collection.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dublicatefind {

	public static void main(String[] args) {
		// Create an ArrayList of numbers
        ArrayList<Integer> list = new ArrayList<>
        (Arrays.asList(1, 2, 3, 1, 3, 5, 5, 6, 6, 7, 7, 8, 8));
          
        //print the original ArrayList
        System.out.println("Original ArrayList:" + list);
  
        //Use Java 8 stream().distinct()  method to remove duplicates from the list
        List<Integer> list1 = list.stream().distinct().collect(Collectors.toList());
        //print the new list         
        System.out.println("ArrayList without duplicates:" + list1);

	}

}
