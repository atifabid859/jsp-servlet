package com.cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletCookie1")
public class ServletCookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			String n=request.getParameter("name");
			out.print("welcome"+n);
			System.out.println(n);
			Cookie cookie=new Cookie("uname", n);
			response.addCookie(cookie);
			out.print("<form action='ServletCookie2' method='post'>");
			out.print("<input type='submit'value='go'>");
			out.print("</form>");}
			catch (Exception e) {
				e.printStackTrace();
			}
	}

}
