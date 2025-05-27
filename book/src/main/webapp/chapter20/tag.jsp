<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:useBean id="product" class="bean.Product" scope="request" />

<p>
	<jsp:getProperty name="product" property="id" />:
	<jsp:getProperty name="product" property="name" />:
	<jsp:getProperty name="product" property="price" />:
</p>


	<!DOCTYPE html>
	<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
	</html>