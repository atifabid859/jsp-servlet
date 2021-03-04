package com.java;

import java.util.Scanner;

public class For1 {

public static int getThirdLargest(int[] a, int total){  
int temp; 
Scanner sc=new  Scanner(System.in);
System.out.println("Enter the no:");
int n=sc.nextInt();
for (int i = 0; i < total; i++)   
        {  
            for (int j = i + 1; j < total; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[total-n];  
}  
public static void main(String args[]){  
int a[]={5,6,7,9,1,3,4,5,6,9,7};  
 
System.out.println("Third Largest: "+getThirdLargest(a,6));  
}}  