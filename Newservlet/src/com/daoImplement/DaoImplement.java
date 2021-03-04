package com.daoImplement;

import java.sql.PreparedStatement;

import com.daoservlet.DaoInterface;
import com.mysql.jdbc.Connection;
import com.pojo.Bean;

import DBconnection.DBconnection;

public class DaoImplement implements  DaoInterface{

	
	@Override
	public int display(Bean p) {
		int count=0;
		try {
			Connection con1=DBconnection.getConnection();
			PreparedStatement str=con1.prepareStatement("insert into anas (name,password)values(?,?)");
			str.setString(1,p.getName() );
			str.setString(2,p.getPassword() );
			count=str.executeUpdate();
			if(count>0) {
				System.out.println("save in db");
			}
			
			}catch(Exception e) {
				e.printStackTrace();
		}
		return count;
	}

}
