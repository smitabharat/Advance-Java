<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="heading.jsp">
<jsp:param value="Sp college" name="collegename"/>
</jsp:include>
<hr>

<jsp:useBean id="smita" class="com.hefshine.com.Student"></jsp:useBean>
<jsp:setProperty property="firstname" name="smita" value="kalpana"/>
<jsp:getProperty property="firstname" name="smita"/>

</body>
</html>