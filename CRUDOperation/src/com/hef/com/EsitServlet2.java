package com.hef.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.StudentDao;


public class EsitServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String sid=request.getParameter("Id");
		int id=Integer.parseInt(sid);
		
		String subjectname=request.getParameter("subjectname");
		String marks=request.getParameter("marks");
		
		Student s=new Student();
		s.setId(id);
		s.setSubjectname(subjectname);
		s.setMarks(marks);
		int status=StudentDao.update(s);
		if(status>0)
		{
			response.sendRedirect("ViewServlet");
		}
		else
		{
			pw.print("sorry!unable to update record");
		}
		pw.close();
	}

}
