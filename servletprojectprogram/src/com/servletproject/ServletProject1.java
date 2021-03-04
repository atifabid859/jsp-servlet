package com.servletproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletProject1")
public class ServletProject1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confpassword = request.getParameter("confpassword");
		List<String> list = new ArrayList<String>();
		System.out.println("username.." + username + "password" + password+"confpassword"+confpassword);
		if (username == null || username.trim().length() == 0) {
			list.add("please enter username");
			
		}  if (password == null || password.trim().length() == 0) {
			list.add("please enter password");
			
		}  if (confpassword == null || confpassword.trim().length() == 0) {
			list.add("please enter confpassword");

		}  if (!confpassword.equals(password)) {
			list.add("password miss match ");
			
		}
		if (list.size() > 0) {
			out.print(list);
			request.getRequestDispatcher("/").include(request, response);
		} else {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
					PreparedStatement str = con
							.prepareStatement("insert into student(username,password,confpassword)values(?,?,?)")){

					str.setString(1, username);
					str.setString(2, password);
					str.setString(3, confpassword);
					int i = str.executeUpdate();
					
					
					if (i > 0) {
						out.print("successfully");
						
						//request.setAttribute("error", "sucefully -");
						request.getRequestDispatcher("/").forward(request, response);
						
					}

				}
				 catch (Exception e) {
				e.printStackTrace();
			}

		}
	
	

	}}
