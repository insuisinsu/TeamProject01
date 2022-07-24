<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뮤비 등록(관리자)</title>
</head>
<body>
	<center>
		<h1>글 등록</h1>
		<hr>
		<form action="insertMV.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">제목</td>
					<td align="left"><input type="text" name="mv_name" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">가수</td>
					<td align="left"><input type="text" name="mv_singer" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">앨범</td>
					<td align="left"><input type="text" name="mv_album"  /></td>
				</tr>
				<tr>
					<td bgcolor="orange" width = "70"> 뮤비 url </td>
					<td align = "left"> <input type="text" name ="mv_url"> </td>
				</tr>
				<tr>
					<td bgcolor="orange" width = "70"> 뮤비 이미지 url </td>
					<td align = "left"> <input type="text" name ="mv_imgurl"> </td>
				</tr>				
				<tr>
					<td bgcolor="orange" width = "70"> 발매일 </td>
					<td align = "left"> <input type="date" name ="mv_rdate"> </td>
				</tr>
				<tr>
					<td bgcolor="orange" width = "70"> 가사 </td>
					<td align = "left"> <input type="text" name ="mv_lyrics"> </td>
				</tr>														
				<tr>
					<td bgcolor="orange" width = "70"> 테마번호 </td>
					<td align = "left"> <input type="number" name ="theme_id"> </td>
				</tr>						
				<tr>
					<td colspan="2" align="center"><input type= "submit"
						value=" 새글 등록 " /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="musicvideoList.do">글 목록 가기</a>
	</center>
</body>
</html>