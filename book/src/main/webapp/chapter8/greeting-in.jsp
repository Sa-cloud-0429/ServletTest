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

<p>お名前を入力してください</p>
<form action="greeting-out.jsp" method="post">
<input type ="text" name="user">
<input type ="submit" value="確定">
</form>

<%@ include file="../header.html"%>
</body>
</html>