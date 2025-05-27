<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
   
   <%@ taglib prefix="c" uri="jakarta.tags.core" %>
   <c:forEach var="p" items="${List}">
   ${p.id}:${p.name}:${p.price} <br>
   </c:forEach>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>