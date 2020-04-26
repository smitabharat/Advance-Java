<%@page import="com.bean.com.Student"%>
<%@page import="Dao.StudentInfo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
String _id=request.getParameter("id");
int id=Integer.parseInt(_id);

StudentInfo sd=new StudentInfo();
Student stud=sd.getStudentById(id);

%>
<h1><%= stud.getId() %></h1>
<h1><%= stud.getName()+" "+stud.getAddress()%></h1>

</body>
</html>