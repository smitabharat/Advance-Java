package Test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.LoginDao;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		/*if(username.contentEquals("admin")&& password.contentEquals("1234"))
		{
		 response.sendRedirect("Home");
		}
		else
		{
			response.sendRedirect("Login.html");
		}*/
		
		PrintWriter wr=response.getWriter();
			
		 response.setContentType("text/html");
		LoginDao ud=new LoginDao();
		boolean status=ud.checkUser(username, password);
		if(status==true)
		{
			response.sendRedirect("Home?username="+username);
			//RequestDispatcher rd=request.getRequestDispatcher("Home");
			//rd.forward(request, response);
		}
		else
		{
			
			response.sendRedirect("Login.html");
			//PrintWriter pw=response.getWriter();
			//pw.write("invalid login");
			//RequestDispatcher rd=request.getRequestDispatcher("Home");
		}
	   }
	}

	


