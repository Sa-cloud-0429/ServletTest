<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ include file ="../header.html" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet/JSP Samples</title>
</head>
<body>

<p>Hello!</p>
<p>こんにちは!</p>

<p><% out.println(new java.util.Date()); %></p>
<%@ include file ="../footer.html"  %>
</body>
</html>