package com.institute.com;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Batches extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletContext context=getServletContext();
		String Institute=context.getInitParameter("Institute");
		
		ServletConfig config=getServletConfig();
		String Batches=config.getInitParameter("Batches");
		String tr=config.getInitParameter("Trainer");
		System.out.println(Institute+" "+Batches);
		System.out.println("trainer="+tr);
	}

}
