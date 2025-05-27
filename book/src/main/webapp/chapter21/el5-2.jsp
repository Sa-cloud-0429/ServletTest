<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../header.html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

${parm.price}円×
${parm.price}個＝
${parm.price*parm.count}円

</body>
<%@include file="../footer.html"%>
</html>