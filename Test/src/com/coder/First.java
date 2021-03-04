package com.coder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.PrintWriter;
@WebServlet("/First")
public class First extends HttpServlet {
	
       
   
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String name=req.getParameter("name");
		String dob=req.getParameter("dob");
		String email=req.getParameter("email");
		String contact=req.getParameter("contact");
	System.out.println( name+""+dob+""+email+""+contact);
	}

}
