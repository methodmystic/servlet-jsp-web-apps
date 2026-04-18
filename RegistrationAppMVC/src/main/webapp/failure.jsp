<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Failed!</h1>
<% String name =(String)session.getAttribute("name"); %>
<p>Sorry <%=name%>, registration failed. Please try again.</p>
</body>
</html>