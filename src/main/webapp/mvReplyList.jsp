<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div>
		<table border="1" style="">
			<tr>
				<th>내용</th>
				<th>날짜</th>
				<th>작성자 번호</th>
			</tr>

			<c:forEach items="${replyList}" var="repl">
				<tr>
					<td>${repl.remvContent}</td>
					<td>${repl.remvRdate}</td>
					<td>${repl.mNum}</td>
				<tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>