<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.hef.com.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String username=request.getParameter("username");
out.println(username);
%>

<jsp:useBean id="u1" class="com.hef.com.Student"></jsp:useBean>
<%-- <jsp:setProperty property="username" value=" <%=username %>"
 name="u"/> --%>
 
 <jsp:setProperty property="username" name="u1" value="kalpana"/>



Record:<br>
<jsp:getProperty property="username" name="u"/><br>
<%-- <jsp:getProperty property="rollno" name="u"/><br>
<jsp:getProperty property="address" name="u"/><br>
<jsp:getProperty property="contact" name="u"/><br> --%>

</body>
</html>