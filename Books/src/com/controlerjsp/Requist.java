package com.controlerjsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DaoImple;
import com.pojojsp.Bean;

import daointerface.Dao;


@WebServlet("/Reguist")
public class Requist extends HttpServlet {
	

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		/*
		 * res.setContentType("text/html"); PrintWriter out=res.getWriter();
		 */
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		String mnumber=req.getParameter("mnumber");
		String email=req.getParameter("email");
	System.out.println( name+""+password+""+mnumber+""+email);
	Bean b=new Bean();
	b.setName(name);
	b.setPassword(password);
	b.setMnumber(mnumber);
	b.setEmail(email);
	System.out.println(b.getName()+""+b.getMnumber()+""+b.getEmail()+""+b.getPassword());
	Dao dao=new DaoImple();
	dao.shape(b);
	System.out.println("hii");
	}

}
