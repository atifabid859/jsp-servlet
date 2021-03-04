package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.BeanClass;
import com.serviceimlement.ServiceImplement;
import com.serviceinterface.ServiceInterface;

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	int status=0;
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String Name=request.getParameter("name");
		String Password=request.getParameter("password");
		String Email=request.getParameter("email");
		String Country=request.getParameter("country");
		BeanClass b=new BeanClass();
		b.setName(Name);
		b.setPassword(Password);
		b.setEmail(Email);
		b.setCountry(Country);
		ServiceInterface st=new ServiceImplement();
		status=st.save(b);
		if(status>0) {
			out.print("register");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}else {
			out.print("unable");
		}
	}

}
