<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<jsp:useBean id="product" class="bean.Product" />

<jsp:setProperty name="product" property="id" value="2" />
<jsp:setProperty name="product" property="name" value="サーモン" />
<jsp:setProperty name="product" property="price" value="100" />

<jsp:getProperty name="product" property="id" />:
<jsp:getProperty name="product" property="name" />:
<jsp:getProperty name="product" property="price" />:



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>