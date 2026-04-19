<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration failed</title>
</head>
<body>
<h1>Registration Failed!</h1>
<% String name =(String)session.getAttribute("name"); %>
<p>Sorry <%=name%>, registration failed ! Something went wrong, please try again... </p>
</body>
</html>