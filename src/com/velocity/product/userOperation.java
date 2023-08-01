package com.velocity.product;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class userOperation {

	PreparedStatement ps=null;
	Connection con=null;
	
	public void insertUserRegistration(String firstname,String lastname,String username,String password,String city,int mobilenumber) {
		try {
			ConnectionTest connection=new ConnectionTest();
			con =connection.getConnectionDetails();
			
			ps=con.prepareStatement("insert into registration(firstname,lastname,username,password,city,mobilenumber)values(?,?,?,?,?,?)");
			ps.setString(1, firstname);
			ps.setString(2, lastname);
			ps.setString(3, username);
			ps.setString(4, password);
			ps.setString(5, city);
			ps.setInt(6, mobilenumber);
			
			int i=ps.executeUpdate();
			
			System.out.println("Record is successfully inserted" +i);
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	
	}
}

