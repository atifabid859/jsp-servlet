package com.servletproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/")
public class ServletProject2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter printwriter=response.getWriter();
	
	//printwriter.print("<h2 style=color:red> hello program<h2>");
	printwriter.print("<form action='servletProject1' method='post'>");
	
	printwriter .print("<table cellspan='2' cellpadding='2' width='50%' border='3' align='center'>"); 
	printwriter.print("<tr><th colspan ='3' bgcolor='black' style=color:white>Validation Login Form</th></tr>");
	printwriter.print("<tr><th>UserName:</th><th><input type='text' name='username'/></th></tr>");
	printwriter.print("<tr><th>Password:</th><th><input type='password' name='password'></th></tr>"); 
	printwriter.print("<tr><th>Conform Password:</th><th><input type='password' name='confpassword'></th></tr>");
	printwriter.print("<tr><th colspan='2'align='center'><button type='submit'>Login</button></th></tr>");
	
	printwriter.print("</table>");  
	printwriter.print("</form>");  
	}

}
