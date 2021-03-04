package com.generic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First
 */
@WebServlet("/First")
public class First extends GenericServlet {
	
	private static final long serialVersionUID = 1L;
   
	

	@Override
	public void service(ServletRequest reg, ServletResponse res) throws ServletException, IOException {
		System.out.println("Enter the number hello");
		 res.setContentType("text/html");
		 PrintWriter out=res.getWriter();
		 out.print("<html><body>");
		 out.print("<b>Welcome Atif And Aamir</b>");
		 out.print("</html></body>");
	}

	

}
