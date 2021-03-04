package com.b;


class Singleton 
{ 
 private static Singleton single_instance = new Singleton(); 
 public String s; 

 private Singleton() 
 { 
      
 } 
 public static Singleton getInstance() 
 { 
     return single_instance; 
 } 
} 

class Mains 
{ 
	public static void main(String args[]) 
 { 
	 
     Singleton x = Singleton.getInstance(); 
     Singleton y = Singleton.getInstance();      
     Singleton z = Singleton.getInstance(); 
     y.s="Helllo Atif";
     System.out.println(z.s);
     System.out.println(y.s);
     System.out.println(x.s);

   
 } 
} 