<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="http://code.jquery.com/jquery-latest.js"></script>
<title>Insert title here</title>
</head>
<body>

	<!-- 댓글 작성 -->
	<div style="boarder: solid 1px; width: 1000px; , padding: 5px">
		<form action="insertMVReply.do" method="post">
			<input type="hidden">
			<input type="number" placeholder="멤버넘버" name="mNum" value=<c:out value="${replmv.mNum}"/>>
			<input type="number" placeholder="뮤비넘버" name="mvId" value=<c:out value="${replmv.mvId}"/>>
			<textarea rows="10" cols="140" name="remvContent" placeholder="댓글을 입력해 주세요" id="reply"><c:out value="${replmv.remvContent}"/></textarea>
			<button id="replyBtn">등록</button>
		</form>
	</div>
	
 	<!-- 댓글 리스트 -->
	<%@ include file="/mvReplyList.do" %>
	
<script>

	$('#replyBtn').click(function() {
		var reply = $('#reply').val();
		if(reply == ""){
			alert("글을 입력해 주세요")
			return false;
		}else{
			alert("글이 등록 되었습니다.")
			return true;
		}
		
});
</script>
	



</body>
</html>