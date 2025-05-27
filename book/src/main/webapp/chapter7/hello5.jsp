<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ include file ="../header.html" %>
     <%@ page import ="java.util.Date" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet/JSP Samples</title>
</head>
<body>

<p>Hello!</p>
<p>こんにちは!</p>
<p><%=new Date() %></p>


<%@ include file ="../footer.html"  %>
</body>
</html>