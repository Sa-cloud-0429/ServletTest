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

	<%!int countA = 0;%>
	<%
	int countB = 0;
	countA++;
	countB++;
	%>
	
	<p>宣言による変数countAは<%=countA %></p>
	<p>スクリプトレット内の変数countBは<%=countB %></p>


	<%@ include file="../header.html"%>
</body>
</html>