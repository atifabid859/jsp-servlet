package com.connectionjsp;
import java.sql.Connection;
import java.sql.DriverManager;
public class Dbconnection {
	
		 public static  Connection getConnection(){  
		        Connection con=null; 
	
		try{  
        	Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");  

        }catch(Exception e)
		{
        	e.printStackTrace();
        	System.out.println(e);}
		return con;  
      
	  
    }
}