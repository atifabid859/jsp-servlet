package net.javaguides.registration.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;


public class ModelSet { 

	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atif","root","root");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee ");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			con.close();
					
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
