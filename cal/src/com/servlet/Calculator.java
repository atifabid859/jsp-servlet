package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String opt=getInitParameter("opt");
		String num1=getInitParameter("num1");
		String num2=getInitParameter("num2");
		Integer i1=Integer.parseInt(num1);
		Integer i2=Integer.parseInt(num2);

		if(opt.equalsIgnoreCase("add")) {
			
			int sum=i1+i2;
			pw.print(sum);
		}
		else
			if(opt.equalsIgnoreCase("sub")) {

				int sub=i1-i2;
				pw.print(sub);
			}
			else
				if(opt.equalsIgnoreCase("mul")) {
					int mul=i1*i2;
					pw.print(mul);
				
    }
				else
					if(opt.equalsIgnoreCase("div")) {
						int div=i1/i2;
						pw.print(div);
					}
					else
					{
						pw.print("please select valid option");
						RequestDispatcher rd=req.getRequestDispatcher("text/html");
						rd.include(req, res);
					}
	}

}
