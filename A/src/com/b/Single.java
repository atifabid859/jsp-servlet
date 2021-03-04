package com.b;

public class Single {
	private static Single intance=new Single();

int x=10;
private Single() {
	
}
public static Single getInstance()
{
	return intance;
}
public static void main(String[] args) {
	Single a=Single.getInstance();
	Single b=Single.getInstance();
	
	
	System.out.println("valuse of is a="+a.x);
	System.out.println("valuse of is b="+b.x);
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
}
}

