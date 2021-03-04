package com.jsoft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;  
public class MainClass1{  
public static void main(String args[]){  
ArrayList<Student> al=new ArrayList<Student>();  

Collections.sort(al); 
al.add(new Student(102,"Atif",17));
al.add(new Student(104,"Arshad",15));
al.add(new Student(106,"Suhail",16));
al.add(new Student(107,"Asad",18));

for(Student st:al){  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
}  
}  
	