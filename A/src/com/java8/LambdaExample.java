package com.java8;

interface Drawble{
	int a=20;
	public void show();
}
public class LambdaExample {
public static void main(String[] args) {
	
	int data=10;
	//Drawble d=new Drawble(){
		
		//public void show() {
	Drawble d=()->{
			System.out.println("hello"+data+""+Drawble.a);
//}
	
};

d.show();
	

}
}