<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="model.Employee"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>社員一覧</title>
</head>
<body>
	<h1>社員一覧</h1>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>名前</th>
			<th>年齢</th>
		</tr>
		<%
		List<Employee> employees = (List<Employee>) request.getAttribute("employees");
		if (employees != null) {
			for (Employee employee : employees) {
		%>
		<tr>
			<td><%=employee.getId()%></td>
			<td><%=employee.getName()%></td>
			<td><%=employee.getAge()%></td>
		</tr>
		<%
		}
		} else {
		%>
		<tr>
			<td colspan="3">データがありません。</td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>
