package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class ServletCookie2
 */

@WebServlet("/ServletCookie2")
public class ServletCookie2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			Cookie []c=request.getCookies();
			out.print("hello"+c[0].getValue());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
