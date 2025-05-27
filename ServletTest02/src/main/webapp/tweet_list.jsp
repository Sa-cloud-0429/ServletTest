<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ツイート一覧</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
	<div class="container">
		<h1>ツイート一覧</h1>
		<%-- 新規投稿 --%>
		<p>
			<a href="new_tweet.jsp">新規投稿</a>
		</p>

		<%-- ツイート一覧の表示 --%>
		<ul class="tweet-list">
			<c:forEach var="tweet" items="${tweet}">
				<li>
					<div class="tweet-content">
						<p class="tweet-info">投稿者: ${tweet.author} </p>
						<p class="tweet-content-text">内容: ${tweet.content }</p>
						<p class="tweet-date">投稿日時: ${tweet.postedAt}</p>
						
					</div>

				</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>
