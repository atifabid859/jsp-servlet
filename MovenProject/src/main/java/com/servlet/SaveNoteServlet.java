package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entites.Note;
import com.helper.FactoryProvider;


public class SaveNoteServlet extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
		String title=request.getParameter("title");
		String content=request.getParameter("content");
			Note note=new Note(title,content,new Date()); 
		
			//System.out.println(note.getId()+""+note.getTitle());
			//hibernate save
			
			Session s=FactoryProvider.getFactory().openSession();
			Transaction tr=s.beginTransaction();
			s.save(note);
			
			tr.commit();
			s.close();
			out.print("<h1 style='text-align:center'>note is added successfully</h1>");
			out.print("<h1 style='text-align:center'><a href='all_notes.jsp'>Viwe all notes</a></h1>");
			//out.print("<h1>note is added successfully</h1>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
