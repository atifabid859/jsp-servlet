package net.javaguides.registration.controller;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class Featch {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			 Statement str=con.createStatement();
			 ResultSet re=str.executeQuery("select * from atif");
			 while(re.next())
				 System.out.println(re.getInt(1)+" "+re.getString(2)+" "+re.getString(3)+""+re.getString(4));
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
