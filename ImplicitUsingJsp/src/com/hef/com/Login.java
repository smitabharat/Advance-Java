package com.hef.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.LoginDao;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		PrintWriter out=response.getWriter();
	    String username=request.getParameter("username");
		String password=request.getParameter("password");
		System.out.println("accepted...");
		if(LoginDao.checkUser(username,password))
		{
			response.sendRedirect("Welcome.jsp");
			session.setAttribute("username", username);
		}
		else
		{
			out.print("sorry u enter wrong username or password");
			RequestDispatcher rd=request.getRequestDispatcher("Login.html");
			rd.include(request, response);
		}
		System.out.println("end");
		out.close();
		
		
		
		
	}

}
