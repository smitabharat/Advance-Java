package com.hef.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.StudentDao;


public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.print("<h1>Update Subjectmarks</h1>");
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		
		Student s=StudentDao.getStudentById(id);
		
		pw.print("<form action='EsitServlet2'method='post'>");
		pw.print("<table>");
		pw.print("<tr><td></td><input type='hidden'name='id' value="+s.getId()+"/></td></tr>");
		pw.print("<tr><td></td><input type='text'name='subjectname' value="+s.getSubjectname()+"/></td></tr>");
		pw.print("<tr><td>Marks:</td><td><input type='marks'value="+s.getMarks()+"/></td></tr>");
		pw.print("</td></tr>");
		pw.print("<tr><td colspan='2'><input type='submit'value='Edit & Save'/></td></tr>");
		pw.print("</table>");
		pw.print("</form>");
		pw.close();
		
		
	}

}
