package addstudent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class Test {
	static int a=0;
static String choose;
	public static void main(String[] args) throws IOException {
		List<Student> student=new ArrayList<>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the iterarion");
		int row=Integer.parseInt(br.readLine());
		for(int i=1;i<=row;i++) {
			System.out.println("enter the id");
			int id=Integer.parseInt(br.readLine());
			System.out.println("enter the name");
			String name=br.readLine();
			List<Integer> marks=new ArrayList<Integer>();
			for(int j=1;j<=3;j++)
			{
		      System.out.println("enter the mark");
		      marks.add(Integer.parseInt(br.readLine()));
		        
			}
			Student s=new Student();
			s.setId(id);
			s.setName(name);
			s.setMarks(marks);
			System.out.println(s);
			
			List<Integer> marks2 = s.getMarks();
for(Integer t:marks) {
	  a=a+t;
	  
	  
}		
System.out.println(a);
			
		}
	}
		}
	
