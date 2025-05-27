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

<% request.setCharacterEncoding("UTF-8"); %>
<p>こんにちは、<%=request.getParameter("user") %>さん！</p>


<%@ include file="../header.html"%>
</body>
</html>