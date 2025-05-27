<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ include file="../header.html" %>
  <%@page import="bean.Product" %>
  
  <% Product p=(Product)request.getAttribute("product"); %>
  <%=p.getId() %>:<%=p.getName() %>:<%=p.getPrice() %><br>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ include file="../footer.html" %>
</body>
</html>