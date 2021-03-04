package connector;

import java.sql.Connection;
import java.sql.DriverManager;

public class Myconnection {
	
	static  Connection  connection=null;
	public static Connection getcConnection(){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/busbook", "root","root");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		return connection;
		
	}


}
