package com.annotation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/Simple", initParams = { @WebInitParam(name = "driver", value = "com.mysql.jdbc.Driver"),
		@WebInitParam(name = "url", value = "jdbc:mysql://localhost:3306/test"),
		@WebInitParam(name = "username", value = "root"), @WebInitParam(name = "password", value = "root")

})

public class ServletAnnotation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		ServletConfig config = getServletConfig();
		PrintWriter out = response.getWriter();
		try {
			Class.forName(config.getInitParameter("driver"));
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try (Connection con = DriverManager.getConnection(config.getInitParameter("url"),
				config.getInitParameter("username"), config.getInitParameter("password"));
				PreparedStatement st = con.prepareStatement("select * from atif");
				ResultSet set = st.executeQuery()) {
			out.println("<table border=1 width=50% height=50%>");
			out.println("<tr><th>id</th><th>name</th><th>address</th><th>city</th></tr>");
			while (set.next()) {
				out.println("<tr><td>" + set.getString(1) + "</td><td>" + set.getString(2) + "</td><td>"
						+ set.getString(3) + "</td><td>" + set.getString(4) + "</td></tr>");
			}
			out.println("</table>");
			out.println("</html></body>");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
