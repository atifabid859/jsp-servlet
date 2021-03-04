package daoimplement;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.daointerface.Dao;
import com.pojo.Bean;

import dbconnection.DBconnection;

public class Daoimpl implements Dao {
	 public int show(Bean p){  
	        int status=0;  
	        try{  
	            Connection con=DBconnection.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "insert into arshad(user,pass,email) values (?,?,?)");  
	            ps.setString(1,p.getUser());  
	            ps.setString(2,p.getPass());  
	            ps.setString(3,p.getEmail());   
	              
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    } 
}
