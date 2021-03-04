package com.java8;
import java.util.function.BiFunction;

public class ArithmeticExample {
public static float add(int a,float b) {
	return a+b;
	
}

public static float add(float a,float b) {
	return a+b;
	
}
public static int add(int a,int b) {
	return a+b;
	
}
public static void main(String[] args) {
	BiFunction<Integer, Float, Float> adder1=ArithmeticExample::add;
	BiFunction<Float, Float, Float> adder2=ArithmeticExample::add;
	BiFunction<Integer, Integer, Integer> adder3=ArithmeticExample::add;
	float result1=adder1.apply(20, 10f);
	float result2=adder2.apply(20f, 10f);
	int result3=adder3.apply(20, 10);
	System.out.println(result1+""+result2+""+result3);
}

}
