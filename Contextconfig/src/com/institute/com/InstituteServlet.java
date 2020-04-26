package com.institute.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InstituteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletContext context=getServletContext();
		String Institute=context.getInitParameter("Institute");
		PrintWriter pw=response.getWriter();
		
		ServletConfig config=getServletConfig();
		String na=config.getInitParameter("Batch");
		String train=config.getInitParameter("Trainer");
		System.out.println(Institute+" "+na);
		System.out.println("Trainer="+train);
		pw.write(Institute+" "+na );
		pw.write("trainer="+train);
			}

}
