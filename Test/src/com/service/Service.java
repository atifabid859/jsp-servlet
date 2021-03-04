package com.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Service
 */
@WebServlet("/Service")
public class Service extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Service() {
        super();
        System.out.println("firstservlet.firstservlet()");
        
    }
    public void init() {
    	System.out.println("firstservlet init()");
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("firstservlet service()");
	response.setContentType("text/html");
	response.getWriter().write("<h1>welcome to your first application</h1>");
	
	}
	public void destroy() {
		System.out.println("firstservlet destroy()");
		
	}

}
