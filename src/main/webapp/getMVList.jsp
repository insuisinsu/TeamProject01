<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<<<<<<< HEAD
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
=======
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
>>>>>>> 7801e111a992d75b3e045c2b49397f81a0adc034
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>뮤직비디오 리스트</title>
<style>
	* {margin:0; padding:0;}
	ul li {display: inline-block;}
</style>
</head>
<body>
<h2> 뮤직비디오 추천 </h2>
<br><hr>
<!-- 네비바 시작 -->
<nav>
	<ul style="width: 500px; border: 1px solid;">
<<<<<<< HEAD
		<li> <a href = "getMVAllList.do"> 최신음악 </a></li>
=======
		<li>최신음악</li>
>>>>>>> 7801e111a992d75b3e045c2b49397f81a0adc034
		<li>인기음악</li>
		<li>장르음악</li>
		<li>플레이리스트</li>
	</ul>
	<div style= "float: left ; width: 50%;">
	<button id = "newMV-btn" class = "MV-btn1">최신</button>		<!-- id로 Jquery / class 로 버튼 css 처리 -->
	<button id = "hotMV-btn" class = "MV-btn1">인기</button>
	</div>
	
	<div style= "float: right; width: 50%; text-align: right;">
<<<<<<< HEAD
	<button id = "allMV-btn" class = "MV-btn2"> <a href = "getMVAllList.do"> 전체 </a>  </button>
	<button id = "DanMV-btn" class = "MV-btn2"> <a href = "getMVList.do?theme_id=1"> 댄스 </a>  </button>			<!-- THEME_ID 1 : 댄스 -->
	<button id = "BalMV-btn" class = "MV-btn2"> <a href = "getMVList.do?theme_id=2"> 발라드 </a> </button>		<!-- THEME_ID 2 : 발라드 -->
	<button id = "PopMV-btn" class = "MV-btn2"> <a href = "getMVList.do?theme_id=3"> POP </a> </button>			<!-- THEME_ID 3 : POP -->
	<button id = "RapMV-btn" class = "MV-btn2"> <a href = "getMVList.do?theme_id=4"> 랩/힙합 </a> </button>		<!-- THEME_ID 4 : 랩/힙합 -->
	<button id = "IndMV-btn" class = "MV-btn2"> <a href = "getMVList.do?theme_id=5"> 인디 </a> </button>			<!-- THEME_ID 5 : 인디 -->
	<button id = "TroMV-btn" class = "MV-btn2"> <a href = "getMVList.do?theme_id=6"> 트로트 </a> </button>		<!-- THEME_ID 6 : 트로트 -->
	<button id = "RnbMV-btn" class = "MV-btn2"> <a href = "getMVList.do?theme_id=7"> R&B </a> </button>			<!-- THEME_ID 7 : R&B -->
=======
	<button id = "allMV-btn" class = "MV-btn2"> 전체 </button>
	<button id = "DanMV-btn" class = "MV-btn2"> 댄스 </button>
	<button id = "BalMV-btn" class = "MV-btn2"> 발라드 </button>
	<button id = "PopMV-btn" class = "MV-btn2"> POP </button>
	<button id = "RapMV-btn" class = "MV-btn2"> 랩/힙합 </button>
	<button id = "IndMV-btn" class = "MV-btn2"> 인디 </button>
	<button id = "TroMV-btn" class = "MV-btn2"> 트로트 </button>
	<button id = "RnbMV-btn" class = "MV-btn2"> R&B </button>
>>>>>>> 7801e111a992d75b3e045c2b49397f81a0adc034
	</div>
</nav>
<!-- 네비바 마무리 -->
<p>	

<center> <!--  테이블 시작 -->
<table border="1px" width="1000px;">
	<tr>
		<th>번호</th>
		<th>영상</th>
		<th>영상정보</th>
		<th>보기</th>
	</tr>
	<c:forEach items="${mvList }" var="mv">
	<tr>
		<td>${mv.mv_id}</td>	<!-- 번호 -->
		<td width ="200"; height ="200";><iframe src="${mv.mv_imgurl}"  scrolling ="no" width="100%" height="100%" margin="0" frameborder="0" align ="middle"> </iframe></td>	
		<!-- 영상(썸네일) -->
		<td>${mv.mv_name} ㅣ ${mv.mv_singer} <p>
			${mv.mv_rdate} ㅣ 좋아요 수(수정예정) <!-- 영상정보 -->
		</td>	
		<td> <img src="projectIMG/like0.png"  width="30px" height="30px"> (좋아요 수) ㅣ						<!-- 좋아요수 + 좋아요 클릭 여부 -->
			 <a href="getMV.do?mv_id=${mv.mv_id}"><img src="projectIMG/play.png" width="30px" height="30px" ></a> ㅣ			
			 <!-- 해당 뮤비 상세페이지 이동 (mv_id 값에 따른)-->
			 <img src="projectIMG/playlist.png" width="30px" height="30px" > 								<!-- 플레이리스트 담는 페이지로 이동 -->
		</td>	<!-- 보기 (좋아요는 기능 구현되면 0, 1 구별 예정 ) -->
	</tr>
	</c:forEach>
</table>
<<<<<<< HEAD

<div>
  <ul>
    <c:if test="${pageMaker.prev}">
    	<li><a href="getMVAllList.do${pageMaker.makeQuery(pageMaker.startPage - 1)}">이전</a></li>
    </c:if> 

    <c:forEach begin="${pageMaker.startPage}" end="${pageMaker.endPage}" var="idx">
    	<li><a href="getMVAllList.do${pageMaker.makeQuery(idx)}">${idx}</a></li>
    </c:forEach>

    <c:if test="${pageMaker.next && pageMaker.endPage > 0}">
    	<li><a href="getMVAllList.do${pageMaker.makeQuery(pageMaker.endPage + 1)}">다음</a></li>
    </c:if> 
  </ul>
</div>



</center> <!--  테이블 마무리-->



=======
</center> <!--  테이블 마무리-->

>>>>>>> 7801e111a992d75b3e045c2b49397f81a0adc034
</body>
</html>