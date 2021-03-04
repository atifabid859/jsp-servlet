package net.javaguides.login.databse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import net.javaguides.login.been.LoginBean;
public class LoginDao {
	public boolean validate1(LoginBean LoginBean) throws ClassNotFoundException{
		boolean status=false;
	
	Class.forName("com.mysql.jdbc.Driver");
	
	try {
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/soft","root","root");
	PreparedStatement preparedStatement=con.prepareStatement("select * from students where username=?and password=? ") ;
	preparedStatement.setString(1, LoginBean.getUsername());
	preparedStatement.setString(1, LoginBean.getPassword());
	System.out.println(preparedStatement);
	ResultSet rs=preparedStatement.executeQuery();
	status=rs.next();
	}
	catch(Exception e) {
	System.out.println();
		
	}
	return status;

	 
	       
	       
}

	public boolean validate(LoginBean loginbean) {
		// TODO Auto-generated method stub
		return false;
	}
}