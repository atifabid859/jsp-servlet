package com.string;

final class Employess{
	 final String name;
	 final Integer id;

public Employess(String name,Integer id) {
	this.name=name;
	this.id=id;
}


public String getName() {
	return name;
}

public Integer getId() {
	return id;
}
}
public  class StringClass {
	public static void main(String[] args) {
		Employess employess=new Employess("Atif", 101);
		System.out.println(employess.name);
		// trying to chnge the object data
		//employess.name="Joker";// compile time error since field is final
	
//		System.out.println(employess.hashCode());
//		System.out.println(employess.hashCode());
	
	}

}
