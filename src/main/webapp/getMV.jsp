<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
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
		<li>최신음악</li>
		<li>인기음악</li>
		<li>장르음악</li>
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
	
	<div class = "div3">
		<br>
		<h3> 가사 </h3>
		<hr width="100%">
		<br>
		${mv.mv_lyrics}
	</div>
</center>	

	<!-- 댓글 작성 -->
	<div style="boarder: solid 1px; width: 1000px; , padding: 5px">
		<form action="insertMVReply.do" method="post">
			<input type="hidden">
			<input type="number" placeholder="멤버넘버" name="m_num" value=<c:out value="${replmv.m_num}"/>>
			<input type="number" placeholder="뮤비넘버" name="mv_id" value=<c:out value="${replmv.mv_id}"/>>
			<textarea rows="10" cols="140" name="remv_content" placeholder="댓글을 입력해 주세요" id="reply"><c:out value="${replmv.remv_content}"/></textarea>
			<button id="replyBtn">등록</button>
		</form>
	</div>
	
	<!-- 댓글 리스트 -->
	<div>
	<form action="selectMVReply.do" method="post">
		<table border = "1" style="width=1000px">
				<c:forEach items="${replmv2}" var="repl">
				내용:		<td>${repl.remv_content}</td>
				날짜:		<td>${repl.remv_rdate}</td>
				뮤비아이디:	<td>${repl.mv_id}</td>
				멤버아이디:	<td>${repl.m_num}</td>
				</c:forEach>
		</table>
			<button>버튼</button>
	</form>
	</div>
<script>

	$('#replyBtn').click(function() {
		var reply = $('#reply').val();
		if(reply == ""){
			alert("글을 입력해 주세요")
			return false;
		}else{
			alert("글이 등록 되었습니다.")
		}
		
});
	



</script>
	

</body>
</html>