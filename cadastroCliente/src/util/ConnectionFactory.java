package util;

import java.sql.*;

public class ConnectionFactory {
	
	private static Connection con;
	
	public static Connection getConnetion(){
		
	try {
		con = DriverManager.getConnection("jdbc:postgres://192.168.0.108","postgress","123");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return con;
	
	}
	

}
