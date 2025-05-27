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

<form action="total-out.jsp" method="post">
<input type="text" name="price">
円×
<input type="text" name="count">
個＝
<input type="submit" value="計算">
</form>


<%@ include file="../header.html"%>
</body>
</html>