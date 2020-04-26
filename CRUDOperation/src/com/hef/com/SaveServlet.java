package com.hef.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.StudentDao;


public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String subjectname=request.getParameter("subjectname");
		
		
		String mark=request.getParameter("marks");
		int marks=Integer.parseInt(mark);
		
		Student s=new Student();
		s.setSubjectname(subjectname);
		
		s.setMarks(marks);
		
		int status=StudentDao.save(s);
		if(status>0)
		{
			pw.write("<p>Record saved successfully</p>");
			request.getRequestDispatcher("Subject.html").include(request, response);
		}
		else
		{
			pw.write("Sorry unable to save record");
		}
		pw.close();
	}
	

	}


