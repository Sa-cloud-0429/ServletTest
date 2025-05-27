<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>

<%
request.setCharacterEncoding("UTF-8");

String username = request.getParameter("username");  
String ageStr = request.getParameter("age");        

if(username == null || username.isEmpty() || ageStr == null || ageStr.isEmpty()){
    throw new Exception("ユーザー名または年齢が未入力です");
}

int age = Integer.parseInt(ageStr); 
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>入力結果</h2>
<p>ユーザー名: <%= username %></p>
<p>年齢: <%= age %></p>


</body>
</html>
