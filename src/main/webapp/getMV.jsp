<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뮤비 상세 페이지</title>
<style>
	* {margin:0; padding:0;}
	ul li {display: inline-block;}
	.div1 {
		margin:20px;
		display: inline;
	} 
	.div2 {
		display: inline-block;
	}
	.div3 {
		width: 45%
	}
</style>
</head>

<body>
<h2> 뮤직비디오 추천 </h2>
<br><hr>
<!-- 네비바 시작 -->
<nav>
	<ul style="width: 500px; border: 1px solid;">
		<li> <a href = "getMVAllList.do"> 최신음악 </a></li>
		<li> 인기음악</li>
		<li> <a href = "getMVList.do?theme_id=1"> 장르음악 </a></li>
		<li>플레이리스트</li>
	</ul>
	
</nav>
<!-- 네비바 끝 -->

<center>
	<h3> 뮤직비디오 </h3>
	<!-- 뮤직비디오 div 시작 (아이프레임 사용 )  -->
	<div class = "div1">
	<br>
		<iframe width="560" height="315" src="${mv.mv_url}" title="YouTube video player"
		frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"  allowfullscreen>
		</iframe>
	</div>
	<br>
	<!-- 뮤직비디오 div 종료 -->
	
	<!-- 곡 정보 div 시작  -->
	<div class = "div1">
	<h3> 곡정보 </h3>
	<hr width="45%">
		<div class = "div2">
		<iframe src="${mv.mv_imgurl}"  scrolling ="no" width="200" height="auto" margin="0" frameborder="0" align ="middle"> </iframe>
		</div>
		<div class = "div2">
		<br>
			제목		: ${mv.mv_name} <p>
			가수명	: ${mv.mv_singer} <p>
			앨범		: ${mv.mv_album} <p>
			발매일	: ${mv.mv_rdate}
		</div>
		<div class = "div2">
			<!-- 수정 버튼 id 맞출예정 -->
			<button id = "updateMV" class = "MV-btn2"> 수정 </button>	 
			<!-- 좋아요버튼 id 맞출예정 / 좋아요 클릭 전 0번 클릭 후 1번 이미지 넣을 예정 -->
			<button id = "like-btn" class = "MV-btn2"> <img src="projectIMG/like0.png"  width="10px" height="10px"> 좋아요 </button> 
			 <!-- 담기 버튼 id 맞출예정 -->
			<button id = "save-btn" class = "MV-btn2"> 담기 </button>
		</div>
	</div>
	
	<!-- 곡 정보 div 끝 -->
	
	<!-- 가사 div 시작 -->
	<div class = "div3">
		<br>
		<h3> 가사 </h3>
		<hr width="100%">
		<br>/
		${mv.mv_lyrics}
	</div>
	<!-- 가사 div 끝 -->
	
	<!-- 관련 영상 리스트 (같은 가수의 앨범) -->
	<div class = "div3">
		<br><br>
		<h3> 관련 영상 </h3>
		<iframe width="560" height="315" src="${mv.mv_url}" title="YouTube video player"
		frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"  allowfullscreen>
		</iframe>
		<br>
	</div>
	
</center>	

<!-- 댓글 작성 -->
	<div style="boarder: solid 1px; width: 1000px; , padding: 5px">
		<form action="insertMVReply.do" method="post">
			<input type="hidden">
			<input type="number" placeholder="멤버넘버" name="mNum" value=<c:out value="${replmv.mNum}"/>>
			<input type="number" placeholder="뮤비넘버" name="mvId" value=<c:out value="${replmv.mvId}"/>>
			<textarea rows="10" cols="140" name="remvContent" placeholder="댓글을 입력해 주세요" id="reply"><c:out value="${replmv.remvContent}"/></textarea>
			<button id="reply" onclick="replyBtn">등록</button>
		</form>
	</div>
	
 	<!-- 댓글 리스트 -->
	<div>
		<table border="1" style="">
			<tr>
				<th>내용</th>
				<th>날짜</th>
				<th>작성자 번호</th>
			</tr>

			<c:forEach items="${mv3}" var="repl">
				<tr>
					<td>${repl.remvContent}</td>
					<td>${repl.remvRdate}</td>
					<td>${repl.mNum}</td>
				<tr>
			</c:forEach>
		</table>
	</div>

<script>

	function replyBtn() {
		var reply = $('#reply').val();
		if(reply == ""){
			alert("글을 입력해 주세요")
			return false;
		}else{
			alert("글이 등록 되었습니다.")
			return true;
		}
	}

	/* $('#replyBtn').click(function() {
		
		
}); */
</script>
	


</body>
</html>