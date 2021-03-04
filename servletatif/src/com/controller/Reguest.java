package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daointerface.Dao;
import com.pojo.Bean;

import daoimplement.Daoimpl;

@WebServlet("/Reguest")
public class Reguest extends HttpServlet {
                                         

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 int status=0;
	
		response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
        String s1=request.getParameter( "user");
		String s2=request.getParameter( "pass");
		String s3=request.getParameter( "email");
		System.out.println(s1+""+s2+""+s3);
		 Bean b=new  Bean();
		 b.setUser(s1);
		 b.setPass(s2);
		 b.setEmail(s3);
		Dao dao= new Daoimpl();
		status=dao.show(b);
		 System.out.println("hii");
		if(status>0){ 
            out.print("<p>Record saved successfully!</p>");  
            request.getRequestDispatcher("index.jsp").include(request, response);  
        }else{  
            out.println("Sorry! unable to save record");  
        }  
          
        out.close();  
	}

	
}
