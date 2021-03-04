package com.Controlerservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daoImplement.DaoImplement;
import com.daoservlet.DaoInterface;
import com.pojo.Bean;

@WebServlet("/Controler")
public class Controler extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		System.out.println(name+""+password);
		Bean b=new Bean();
		b.setName(name);
		b.setPassword(password);
		DaoInterface dao=new DaoImplement();
		int i=dao.display(b);
		if(i>0) {
			out.println("<html><body><h2 style='color:red'>Data Successfully</h2></body></html>");
			response.sendRedirect("index.jsp");
		}else {
			out.println("<h2>Data Not Successfully</h2>");
			response.sendRedirect("index.jsp");
		}
	}

}
