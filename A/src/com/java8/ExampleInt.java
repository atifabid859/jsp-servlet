package com.java8;
interface Show{
	int add(int a, int b);
}
public class ExampleInt {

	public static void main(String[] args) {
		Show i=(a,b)->{
			return a+b;
		};
		System.out.println(i.add(20, 10));
Show s=(a,b)->{
	return a+b;
};
System.out.println(s.add(200, 100));
	}

}
