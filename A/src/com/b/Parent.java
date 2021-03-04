package com.b;

public interface Parent {
	int a=10;
	interface Child{
		int a=20;
	}
}
class Children implements Parent{
	 
		public static void main(String[] args) {
			Parent p=new Children();
			System.out.println(p.a);
		}
	}
