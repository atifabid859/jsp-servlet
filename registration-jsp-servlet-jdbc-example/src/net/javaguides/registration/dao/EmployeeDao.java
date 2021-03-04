package net.javaguides.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.javaguides.registration.model.Employee;


public class EmployeeDao {

	public void registerEmployee(Employee employee) throws ClassNotFoundException, SQLException{
		
		String INSERT_USER_SQL ="INSERT INTO employee"+"(id,first_name,last_name,username,password,address,contact)VALUES"+"(?,?,?,?,?,?,?);";
	int result= 0;	
	Class.forName("com.mysql:jdbc.Driver");
		try 
			(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false","root","root");
			PreparedStatement preparedstatement= connection.prepareStatement(INSERT_USER_SQL)){
		
		}
		
	}
		
	}

