package net.javaguides.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/atif","root","root");  
					PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
					ps.setInt(1, 4);
					ps.setString(2, "Atif");
					ps.setString(3, "sakinaka");
					ps.setString(4, "thana");
					ps.executeUpdate();
	
			
		} catch (Exception e) {
		System.out.println(e);
		}


	}

}
