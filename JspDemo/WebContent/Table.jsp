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
int no=Integer.parseInt(request.getParameter("no"));
%>
<%
for(int i=1;i<=10;i++)
{
	out.println(no*i+"<br>");
}
%>
</body>
</html>