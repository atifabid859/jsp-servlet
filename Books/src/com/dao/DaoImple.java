package com.dao;

import java.sql.PreparedStatement;

import com.connectionjsp.Dbconnection;
import com.mysql.jdbc.Connection;
import com.pojojsp.Bean;

import daointerface.Dao;

public class DaoImple implements Dao {

	@Override
	public void shape(Bean p) {
		// TODO Auto-generated method stub
		
	

	
	
	  int status=0;
	  
	  try { 
		  java.sql.Connection con1=Dbconnection.getConnection();
	  PreparedStatement str=con1.
	  prepareStatement("insert into asad (name,password,Mobile_No,email)values(?,?,?,?)");
	  str.setString(1,p.getName());
	  str.setString(2,p.getPassword());
	  str.setString(3,p.getMnumber());
	  str.setString(4,p.getEmail());
	  
	  str.executeUpdate();//System.out.println(status+"insert valuse"); con1.close(); }
	  } catch (Exception e) { e.printStackTrace(); }
	 
		
	}}
		