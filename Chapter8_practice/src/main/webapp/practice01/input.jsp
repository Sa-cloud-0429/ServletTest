<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力フォーム</title>
</head>
<body>
<h2>ユーザー情報入力</h2>

<form action="output.jsp" method="post">
ユーザー名<input type="text" name="username"><br>
年齢<input type="text" name="age"><br>
<input type="submit" name="送信">
</form>

 
</body>
</html>