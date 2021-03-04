package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Servlet1 extends HttpServlet{
	
	@Override
	 public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{try {

		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		ServletConfig config= getServletConfig();
		Class.forName(config.getInitParameter("driver"));
		Connection con=DriverManager.getConnection(config.getInitParameter("url"),config.getInitParameter("username"),config.getInitParameter("password"));
		PreparedStatement str=con.prepareStatement("select * from arshad");
		out.print("<html><form>");
		 out.print("<table border=1 width=50% height=50% align=center>");  
         out.print("<tr><th>user</th><th>pass</th><th>email</th></tr>"); 
		ResultSet rs=str.executeQuery();
		while(rs.next())
			
		
          
         out.print("<tr><td align=center>" + rs.getString(1) + "</td><td align=center>" + rs.getString(2) + "</td><td align=center>" + rs.getString(3) + "</td></tr>");
		out.print("</table>");  
        out.print("</html></body>");  
		
	} catch (Exception e) {
	e.printStackTrace();
	}




	}

	

}
