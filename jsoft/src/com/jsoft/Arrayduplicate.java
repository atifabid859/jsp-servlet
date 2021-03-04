package com.jsoft;

import java.util.HashMap;

public class Arrayduplicate {

	public static void main(String[] args) 
	{
	    int [] names = {1,3,5,7,8,1,1,2,5,6,7,9};
	    HashMap<Integer,Integer > repeatNames = new HashMap< Integer,Integer>();
	    int repeatCount = 0;

	    for (int i = 0; i < names.length; i++) {
	        int count = 0;
	        for (int k = 0; k < names.length; k++) {
	            if (names[i] == names[k]) {
	                count++;
	            }
	        }

	        if (count > 1) {
	            if (!repeatNames.containsKey(names[i])) {
	                System.out.println(names[i] + ":" + count);
	                repeatNames.put(names[i], count);
	                repeatCount = repeatCount+count;
	            }
	        
	    }}
	    System.out.println("Total Count:" + repeatCount);
	}}