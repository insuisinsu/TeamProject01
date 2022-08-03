<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

		<h1>회원 등록</h1>
		<hr>
  
		<form action="insertMember.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange" width="70">m_id</td>
					<td align="left"><input type="text" name="m_id" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">m_pw</td>
					<td align="left"><input type="password" name="m_pw" /></td>
				</tr>
				<tr>
					<td bgcolor="orange">m_email</td>
					<td align="left"><input type="text" name="m_email"  /></td>
				</tr>
				<tr>
					<td bgcolor="orange" width = "70"> m_phone </td>
					<td align = "left"> <input type="text" name ="m_phone"> </td>
				</tr>
				<tr>
					<td bgcolor="orange" width = "70">m_birth </td>
					<td align = "left"> <input type="date" name ="m_birth"> </td>
				</tr>				
				<tr>
					<td bgcolor="orange" width = "70"> m_gender </td>
					<td align = "left"> <input type="text" name ="m_gender"> </td>
				</tr>
				<tr>
					<td bgcolor="orange" width = "70"> m_add1 </td>
					<td align = "left"> <input type="text" name ="m_add1"> </td>
				</tr>
				<tr>
					<td bgcolor="orange" width = "70"> m_add2 </td>
					<td align = "left"> <input type="text" name ="m_add2"> </td>
				</tr>
				<tr>
					<td bgcolor="orange" width = "70"> m_add3 </td>
					<td align = "left"> <input type="text" name ="m_add3"> </td>
				</tr>
				<tr>
					<td bgcolor="orange" width = "70"> m_sfname </td>
					<td align = "left"> <input type="text" name ="m_sfname"> </td>
				</tr>
				<tr>
					<td bgcolor="orange" width = "70"> m_ofname </td>
					<td align = "left"> <input type="text" name ="m_ofname"> </td>
				</tr>	
				<tr>
					<td bgcolor="orange" width = "70"> m_role </td>
					<td align = "left"> <input type="text" name ="m_role"> </td>
				</tr>					


						
				<tr>
					<td colspan="2" align="center"><input type= "submit"
						value=" 회원 등록 " /></td>
				</tr>
			</table>
		</form>
		<hr>
		<a href="index.jsp">글 목록 가기</a>


</body>
</html>