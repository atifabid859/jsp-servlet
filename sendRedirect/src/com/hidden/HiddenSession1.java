package com.hidden;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HiddenSession1")
public class HiddenSession1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String name=request.getParameter("username");
			out.print("welcome"+name);
			out.print("<form action='HiddenSession2'method='post'>"
					+ "<input type='Hidden'name='uname'value='"+name+"'>"
					+ "<button>go to second session</button>"
					+ "</form>");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
