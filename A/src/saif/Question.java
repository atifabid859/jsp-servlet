package saif;

import java.util.Scanner;

public class Question {
	
	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Pls Enter Your Array");
		String nextLine = s.nextLine();
	
		String[] split = nextLine.split(",");
		int[] t=new int[10];
		for(String s1:split)
		{
			 
		}
		for(int i=0;i<split.length;i++) {
			 
			  if(split[Integer.parseInt(split[i])].equals(String.valueOf(i))) {
			  System.out.println("The given array is mirror");
			  }
			  else
			  {
				  System.out.println("This not Array mirror");
			  }
			 
		}
		 
		 
	}

}
