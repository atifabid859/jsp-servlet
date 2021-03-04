package com.servletprojectprogram;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html");
    	PrintWriter out=response.getWriter();
    	out.print("<html><body>");
    	out.print("<form action='Servlet2Validate'method='get'>"
    	+ "<table cellspasing=0 cellpadding=3 witdh=100% border=3 align=center>"
        +"<tr><th colspan=3 bgcolor=black  style=color:white>Validation Login Form</th></tr>"
        +"<tr><th>UserName</th><th><input type='text' name='username'></th></tr>"
    	+"<th>Password</th><th><input type='password' name='password'></th></tr>"
    	+"<th>Conform Password</th><th><input type='password' name='confpassword'></th></tr>"
    	+"<tr><td colspan=3 align=center bgcolor=black style=color:white><button type='submit'>Login</button></td></tr>"
    	+"</table></form>"
    	+"</html></body>"); 
    	
	
    }}

	
