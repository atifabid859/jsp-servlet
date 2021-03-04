package com.map;

import java.util.HashMap;
import java.util.Map;

public class Books {
	int id;
	String name;
	String author;
	String publisher;
	int quantity;
	public Books(int id, String name, String author, String publisher,int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this .quantity=quantity;
	}}
class HshMapExampl2{
public static void main(String []args) {
	Map<Integer,Books> map=new HashMap<>();
	Books obj=new Books(101, "c language", "Arshad","BPB", 9);
	Books obj1=new Books(102, "java language", "Aamir","BPl", 6);
	Books obj2=new Books(103, "javascript language", "Asadullah", "ccl", 3);
	map.put(1, obj);
	map.put(2, obj1);
	map.put(3, obj2);
	for(Map.Entry<Integer, Books> entry:map.entrySet()) {
		int key=entry.getKey();
		Books b=entry.getValue();
		System.out.println(key+"  ");
		System.out.println(b.id+""+b.name+""+b.author+""+b.publisher+""+b.quantity);
		
		
	}
	
}}
