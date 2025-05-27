<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン画面</title>
</head>
<body>
<h2>ログイン</h2>
<form action="validate.jsp" method="post">
ユーザー名<input type="text" name="username">
パスワード<input type="text" name="password">
<input type="submit" value="送信">
</form>

</body>
</html>