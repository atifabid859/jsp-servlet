package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



//@WebServlet("/ateef2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
	public  void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();;
			ServletConfig config1=getServletConfig();
			Class.forName( config1.getInitParameter("driver"));
			Connection con=DriverManager.getConnection(config1.getInitParameter("url"), config1.getInitParameter("username"),config1.getInitParameter("password"));
			PreparedStatement str1=con.prepareStatement("select * from anas");
			out.println("<table border=1 width=50% height=50%>");  
	         out.println("<tr><th>id</th><th>name</th><th>password</th><tr>"); 
	         ResultSet rs1=str1.executeQuery();
	 		while(rs1.next()) {
	 		out.println("<tr><td>" + rs1.getInt(1) + "</td><td>" + rs1.getString(2) + "</td><td>" + rs1.getString(3) + "</td></tr>");	 		
 
	 		}	 		out.println("</table>"); 
	 		out.println("</html></body>");  	
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
