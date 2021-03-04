package com.java8;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class Producd {
int id;
String name;
float price;
public Producd(int id, String name, float price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
}
class LambdaProducd{
	public static void main(String[] args) {
		List<Producd> list=new ArrayList<Producd>();
		list.add(new Producd(101,"hp laptop",2000));
		list.add(new Producd(102,"lenovo",1000));
		list.add(new Producd(103,"apple",250000));
		Collections.sort(list,(p1,p2)->{
			return p1.name.compareTo(p2.name);
		});
		for(Producd p:list) {
			System.out.println(p.id+" "+p.name+" "+p.price);
		}
	}
}