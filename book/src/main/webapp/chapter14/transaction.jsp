<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.html" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<p>追加する商品を選んでください</p>
<form action="transaction" method="post">
商品名<input type="text" name="name">
価格<input type="text" name="price">
<input type="submit" value="追加">

</form>
<%@ include file="../footer.html" %>
</body>
</html>