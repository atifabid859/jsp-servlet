package com.b;

public class Simple {
public static void main(String[] args) {
	Simple obj=new Simple();
	obj.start();
}

void start() {
	long[]p= {3,4,5};
	long[]Q=method(p);
	System.out.println(p[0]+p[1]+p[2]);
	System.out.println(Q[0]+Q[1]+Q[2]);
}

private long[] method(long[] r) {
	r[1]=7;
	return r;
}
}
