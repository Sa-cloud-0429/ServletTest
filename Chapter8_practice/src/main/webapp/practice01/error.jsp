<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     
     <%@ page isErrorPage="true" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>エラー</title>
</head>
<body>

<h2>入力エラー</h2>
<p>ユーザー名または年齢が正しくありません。</p>
<p><%= exception.getMessage() %></p>
 
</body>
</html>