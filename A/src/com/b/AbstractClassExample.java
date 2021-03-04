package com.b;

abstract class MyClass {
	   public abstract void display();
	}
	public class AbstractClassExample extends MyClass{
	   public void display(){
	      System.out.println("subclass implementation of the display method");
	   }
	   public static void main(String args[]) {
	      new AbstractClassExample().display();
	   }
	}
