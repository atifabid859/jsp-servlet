package com.daoimplement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.BeanClass;
import com.daointerface.DaoInterface;
import com.dbconnection.DBconnection;

public class DaoImplement implements DaoInterface {
	int status=0;
	@Override
	public int save(BeanClass b) {
		
		try {
			Connection con=DBconnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into aamir(Name,Password,Email,Country)values(?,?,?,?)");
			ps.setString(1, b.getName());
			ps.setString(2, b.getPassword());
			ps.setString(3, b.getEmail());
			ps.setString(4, b.getCountry());
	        status=ps.executeUpdate();
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return status;
	}
	@Override
	public List<BeanClass> getDisplay() {
		List<BeanClass> list=new ArrayList<BeanClass>();
		try {
			Connection con=DBconnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from aamir ");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				BeanClass b=new BeanClass();
				b.setId(rs.getInt(1));
				b.setName(rs.getString(2));
				b.setPassword(rs.getString(3));
				b.setEmail(rs.getString(4));
				b.setCountry(rs.getString(5));
				list.add(b);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	

}
