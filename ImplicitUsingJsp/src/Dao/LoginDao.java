package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao
{
	 public static boolean checkUser(String username,String password)
	{
		boolean status=false;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			String query="select * from user_reg where name=? and pass=?";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
			PreparedStatement ptmt=con.prepareStatement(query);
			ptmt.setString(1,username);
			ptmt.setString(2,password);
			ResultSet re=ptmt.executeQuery();
			System.out.println("connected");
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
