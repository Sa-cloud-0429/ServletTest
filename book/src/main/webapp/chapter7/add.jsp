<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../header.html"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet/JSP Samples</title>
</head>
<body>

	<%!int add(int a, int b) {
		return a + b;
	}%>
<p>1+2=<%=add(1,2) %></p>
<p>3+4=<%=add(3,4) %></p>
<%@ include file="../header.html"%>
</body>
</html>