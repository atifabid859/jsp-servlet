package com.loginforms;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginDao")
public class LoginDao extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	     String name=request.getParameter("name");
	     String email=request.getParameter("email");
	     String pass=request.getParameter("pass");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		Connection	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		PreparedStatement	str=con.prepareStatement("insert into student(name,email,password)values(?,?,?)");
		
		str.setString(1, name);
		str.setString(2, email);
		str.setString(3, pass);
		
		int i=str.executeUpdate();
		if(i>0) {
			out.println("successfully");
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
