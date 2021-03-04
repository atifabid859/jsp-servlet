package net.javaguides.login.web;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.javaguides.login.been.LoginBean;
import net.javaguides.login.databse.LoginDao;
/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final LoginBean LoginBean = null;
    private LoginDao loginDao;
    public void init() {
 	   loginDao =new LoginDao();
    }
    
	protected void dopost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	LoginBean loginbean=new LoginBean();
	loginbean.setUsername(username);
	loginbean.setPassword(password);
	
	
    
        try {
           
            if ( loginDao.validate(LoginBean)){
                response.sendRedirect("loginsuccess");
            }
            else {
            	HttpSession session= request.getSession();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}