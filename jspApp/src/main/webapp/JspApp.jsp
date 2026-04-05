<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP WEB APP</title>
</head>
<body>
<h1>JSP WEB APP to generate dynamic response</h1>
<%@page import = "java.util.Date" %>
 <%!
      int age = 18;
 %>
<%

String name = request.getParameter("name");
String email = request.getParameter("email");
String upassword = request.getParameter("upassword");
String city = request.getParameter("city");
Date date = new Date();
out.println("Hello " + name + ", you have registered successfully on " + date);

%>
<h1>Age is <%=age%></h1>

</body>
</html>
