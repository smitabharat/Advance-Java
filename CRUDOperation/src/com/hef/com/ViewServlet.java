package com.hef.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.StudentDao;


public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<a href='Subject.html'>Add New Subject</a>");
		pw.println("<h1>Subject List</h1>");
		
		List<Student>list=StudentDao.getAllSubjects();
		pw.print("<table border='1' width='100%");
		pw.print("<tr><th>Id</th><th>SubjectName</th><th>Marks</th><th>Edit</th><th>Delete</th><tr>");
		for(Student s:list)
		{
			pw.print("<tr><td>"+s.getId()+"</td><td>"+s.getSubjectname()+"</td><td>"+s.getMarks()+"</td><td><a href='EditServlet?id="+s.getId()+'">edit</a></td><td><a href='DeleteServlet?id="+s.getId()+'">delete</a></td></tr>");
			pw.print("/table>");
			pw.close();
		}
	}

}
