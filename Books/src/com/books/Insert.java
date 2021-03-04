package com.books;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		PreparedStatement stmt=Con.prepareStatement("insert into atif values(?,?,?,?)");
		//PreparedStatement stmt=Con.prepareStatement("delete from atif  where id=?,? ");
	//	stmt.setInt(1, 2);
		
		stmt.setInt(1,3);
		stmt.setString(2, "Arshad");
		stmt.setString(3, "Kolkata");
		stmt.setString(4, "d nager");
		int i=stmt.executeUpdate();

		System.out.println(i+"record  insert");
		
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
