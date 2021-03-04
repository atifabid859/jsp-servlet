package com.map;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack <Integer>stack=new Stack();
		boolean result = stack.empty();  
		System.out.println("Is the stack empty? " + result);  
		// pushing elements into stack  
		stack.push(78);  
		stack.push(113);  
		stack.push(90);  
		stack.push(120);  
		System.out.println(stack.peek());
		System.out.println("Elements in Stack: " + stack);  
		result = stack.empty();  
		System.out.println("Is the stack empty? " + result);  
		}  
		

}
