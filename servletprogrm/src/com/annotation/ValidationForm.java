package com.annotation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ValidationForm")
public class ValidationForm extends HttpServlet {

	private static final long serialVersionUID = 8997038813293866255L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("ValidationForm.doGet()");
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String cnfPassword = request.getParameter("conf_password");
		List<String> errList = new ArrayList<>();

		if (userName == null || userName.trim().length() == 0) {
			errList.add("please enter user name");
		}
		if (password == null || password.trim().length() == 0) {
			errList.add("please enter password");
		}
		if (cnfPassword == null || cnfPassword.trim().length() == 0) {
			errList.add("please enter password");
		}
		if (!errList.isEmpty()) {
			response.getWriter().println("<font color='red'>" + errList + "</font>");
			request.getRequestDispatcher("/validation.jsp").include(request, response);
		}

		else {
			System.out.println("userName : [" + userName + "] \n  password : [" + password + "]\n cnfPassword: ["
					+ cnfPassword + "]");
		}

		if (cnfPassword.equals(password)) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
				PreparedStatement ps = con
						.prepareStatement("insert into waris(username,password,conf_Password) values(?,?,?)");
				ps.setString(1, userName);
				ps.setString(2, password);
				ps.setString(3, cnfPassword);
				int i = ps.executeUpdate();
				if (i > 0) {
					System.out.println("Register");
				} else {
					System.out.println("not register");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

	
