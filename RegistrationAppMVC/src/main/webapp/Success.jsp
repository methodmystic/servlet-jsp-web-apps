<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Successful</title>
</head>
<body>
<h1>Registration Successful!</h1>
<% String name =(String)session.getAttribute("name"); %>
<p>hey <%=name%>, registration Successful. Welcome to the page....</p>
</body>
</html>