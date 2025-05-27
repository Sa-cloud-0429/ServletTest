<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../header.html"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>予約フォーム</title>
</head>
<body>

<form action="reservation" method="post">

<p>名前を入力してください</p>
<input type="text" name="user" required>
<p>メールアドレスを入力してください</p>
<input type="text" name="mail" required>
<p>宿泊日を入力してください</p>
<input type="text" name="dayin" required>
<p>宿泊人数を入力してください</p>
<input type="text" name="people" required>
<p>宿泊日数を入力してください</p>
<input type="text" name="day" required>

<p>部屋タイプを選択してください</p>
<input type="radio" name="roomtype" value="シングル" checked required>シングル
<input type="radio" name="roomtype" value="ダブル">ダブル
<input type="radio" name="roomtype" value="ツイン">ツイン
<input type="radio" name="roomtype" value="トリプル">トリプル

<p>オプションを選択してください</p>
<p><input type ="checkbox" name="option">送迎付き</p>
<p><input type ="checkbox" name="option">朝食付き</p>
<p><input type ="checkbox" name="option">和室</p>

<p><input type ="checkbox" id="child" name="child" value="yes" onclick="toggleChildPlan()">３歳以下の子供がいる</p>
<p id="childPlan" style="display:none;">
お子様向けに別プランがありますが、そちらを予約しますか？
</p>

<p><input type="submit" value="確定"></p>


</form>

<%@ include file="../header.html"%>
</body>
</html>