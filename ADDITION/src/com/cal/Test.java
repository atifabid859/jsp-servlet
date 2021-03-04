package com.cal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Test")
public class Test extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getContentType();
		PrintWriter out=response.getWriter();
		String operation=request.getParameter("operation");
		String str=request.getParameter("num1");
		String str1=request.getParameter("num2");
		int a=Integer.parseInt(str);
		int b=Integer.parseInt(str1);
		
		
		if(operation.equalsIgnoreCase("add")) {
			int add=a+b;
			out.print(add);
			
		}
		else if(operation.equalsIgnoreCase("sub")) {
				int sub=a-b;
				out.print(sub);
			}
			else if(operation.equalsIgnoreCase("mult")) {
					int mult=a*b;
					out.print(mult);
				}
				else if(operation.equalsIgnoreCase("divi")) {
			int divi=a/b;
			out.print(divi);
		}
		else if(operation.equalsIgnoreCase("modl")) {
				int modl=a%b;
				out.print(modl);
				
			}
		
		else
		{
			out.print("please select valid option");
			
	}
}
}
