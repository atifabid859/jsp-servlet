package net.javaguides.registration.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
	public static void main(String[] args) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/atif","root","root");
			//PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
			//PreparedStatement ps=con.prepareStatement("update  employee set name=? where employeeid=?");
			//ps.setString(1, "juned");
			//PreparedStatement ps=con.prepareStatement("delete from employee where employeeid=?");
			PreparedStatement ps=con.prepareStatement("delete from employee where employee name=?,?");
			ps.setInt(1,2);
			
			//ps.setInt(2, 1);
			//ps.setInt(1,7);
			//ps.setString(2,"Aamir");
			//ps.setString(3,"gowandi");
			//ps.setString(4, "kaleyan");
			int i=ps.executeUpdate();
			System.out.println(i+"record delete");
		}
		catch(Exception e) {
			System.out.println(e);
}
}
}