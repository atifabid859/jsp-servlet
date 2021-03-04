package com.jsoft;

public class Defauld {  
	      
	Defauld(){
		System.out.println("constructor is invoked");}  
	   
	    {System.out.println(" initializer block invoked");}  
	    static {
	    	System.out.println("static block");
	    }
	       
	    public static void main(String args[]){  
	    	Defauld b1=new Defauld();  
	    	Defauld b2=new Defauld();   
	    }      
	}  

