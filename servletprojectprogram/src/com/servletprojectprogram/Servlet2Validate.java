package com.servletprojectprogram;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/Servlet2Validate")
public class Servlet2Validate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private boolean isNaN(String username) {

		return false;
	}


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("xdsacd");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confpassword = request.getParameter("confpassword");
		List<String> errList = new ArrayList<String>();
		if (username == null || username.trim().length() == 0) {
			errList.add("please fill username field ");
		}
		if (username.length() <= 2 || username.length() > 20) {
			errList.add("user length must be between 2 and 20");
		}
		if (!isNaN(username)) {
			errList.add("only character alowed");
		}
		if (password == null || password.trim().length() == 0) {
			errList.add("please fill password field ");
		}
		if (password.length() <= 4 || password.length() > 12) {
			errList.add("user length must be between 4 and 12");
		}
		errList.add("please fill confpassword field ");
		if (confpassword.equals(password)) {
		}
		response.getWriter().println("<font color='red'>" + errList + "</font>");
				try {
			Class.forName("com.mysql.jdbc.Driver");
		
		Connection con =DriverManager.getConnection ("jdbc:mysql://localhost:3306/test","root","root");
				
		
		PreparedStatement st=con.prepareStatement("insert into  employee(User_Name,Password,Conform_Password)values(?,?,?)");
				st.setString(1, username);
				st.setString(2, password);
				st.setString(3, confpassword);
				int i=st.executeUpdate();
				if(i>0) {
					System.out.println("successfully");
				}
				request.getRequestDispatcher("/Servlet1").forward(request, response);	
		}      catch (Exception e) {
			e.printStackTrace();
		}
	}
}    