package com.javaproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

class  Main{

	public static void main(String data[]) {
		List<Student1> list=new CopyOnWriteArrayList();
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("pull delete update PullAllRecord");
		String count=sc.nextLine();
		if(count.equalsIgnoreCase("add")) {
		System.out.println("enter the name");
		String str =sc.nextLine();
		System.out.println("enter the id");
		int id=sc.nextInt();
		Student1 stu=new Student1();
		stu.setId(id);
		stu.setName(str);
		System.out.println(stu);
		list.add(stu);
		System.out.println(list.size());
	
		
	}
		else if(count.equalsIgnoreCase("pull")) {
			
		}
		}
		}
}