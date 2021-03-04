package net.javaguides.registration.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
	public static void main(String[] args) {
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
			PreparedStatement str=con.prepareStatement("insert into student values(?,?,?)");
			str.setInt(1,4);
			str.setString(2,"sakib");
			str.setString(3,"sakinaka");
			str.executeUpdate();
			System.out.println("Stidem");
			SecurityManager c=new SecurityManager();
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
