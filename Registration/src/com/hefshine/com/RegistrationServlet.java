package com.hefshine.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	response.setContentType("text/html");
    	PrintWriter wr=response.getWriter();
    	String name=request.getParameter("name");
    	String address=request.getParameter("address");
    	String contact=request.getParameter("contact");
    	String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db","root","root");
			
			PreparedStatement ps=con.prepareStatement("insert into userreg values(?,?,?,?,?)");
		ps.setString(1,name);
		ps.setString(2,address);
		ps.setString(3,contact);
		ps.setString(4,username);
		ps.setString(5,password);
		
		int i=ps.executeUpdate();
		if(i>0)
			wr.print("you are successfully registered..");
		}
		catch(Exception e)
		{
		System.out.println(e);
	}
		wr.close();
		
		 
		
    }
}
