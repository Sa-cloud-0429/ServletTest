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

<%@ page errorPage="total-error.jsp" %>

<%
request.setCharacterEncoding("UTF-8");
int price=Integer.parseInt(request.getParameter("price"));
int count=Integer.parseInt(request.getParameter("count"));
%>

<%=price %>円×<%=count %>個=<%=price*count %>円
<%@ include file="../header.html"%>
</body>
</html>