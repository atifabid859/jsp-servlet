package com.context;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet("/ServletContext")
public class Contextservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    
    public Contextservlet() {
        super();
        
    }

	public  void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
		try {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			ServletContext context= getServletContext();
			Class.forName(context.getInitParameter("driver"));
			Connection con=DriverManager.getConnection(context.getInitParameter("url"),context.getInitParameter("username"),context.getInitParameter("password"));
			PreparedStatement stm=con.prepareStatement("select * from asad");
			 out.println("<table border=1 width=50% height=50%>");  
	         out.println("<tr><th>Id</th><th>Name</th><th>Password</th><th>Mobile_No</th><th>Email</th></tr>"); 
			ResultSet ste=stm.executeQuery();
			while(ste.next()) {
			out.println("<tr><td>"+ste.getInt(1)+"</td><td>"+ste.getString(2)+"</td><td>"+ste.getString(3)+"</td><td>"+ste.getString(4)+"</td><td>"+ste.getString(5)+"</td></tr>");
			}
			out.println("</table>");  
	        out.println("</html></body>"); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
