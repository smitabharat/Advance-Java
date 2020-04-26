<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Arithmatic</title>
</head>
<body>
<%
int n1=Integer.parseInt(request.getParameter("n1"));
int n2=Integer.parseInt(request.getParameter("n2"));
%>
<%
int sum,sub,mult,div;
sum=n1+n2;
sub=n1-n2;
mult=n1*n2;
div=n1/n2;

out.println("sum="+sum+"<br");
out.println("sub="+sub+"<br>");
out.println("mult="+mult+"<br>");
out.println("div="+div+"<br>");
%>


</body>
</html>