package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao 
{
	private String driverClassName="com.mysql.jdbc.Driver";
	private String connectionUrl="jdbc:mysql://localhost:3306/db";
	private String dbuser="root";
	private String dbpwd="root";
	
	public boolean checkUser(String username,String password)
	{
		boolean status=false;
		
		try
		{
			Class.forName(driverClassName);
			String query="select * from user_reg where name=? and pass=?";
			Connection con=DriverManager.getConnection(connectionUrl,dbuser,dbpwd);
			PreparedStatement ptmt=con.prepareStatement(query);
			ptmt.setString(1,username);
			ptmt.setString(2,password);
			ResultSet re=ptmt.executeQuery();
			while(re.next())
			{
				status=true;
			}
		}
		catch(Exception e)
		{ 
			System.out.println(e);		
			}
		return status;
	}


}
