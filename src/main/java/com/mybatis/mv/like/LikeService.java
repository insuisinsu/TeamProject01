package com.mybatis.mv.like;

import java.util.List;

//LikeService class
public interface LikeService {

	
//	좋아요 조회
public List<MV_LikeVO> getLike(MV_LikeVO mlvo);
	
//	좋아요 전체 조회
public List<MV_LikeVO> getLikeList(MV_LikeVO mlvo);

//	좋아요 입력
public int likeInsert(MV_LikeVO mlvo);

//	좋아요 업데이트
public int likeUpdate(MV_LikeVO mlvo);

//  싫어요 업데이트
public int unlikeUpdate(MV_LikeVO mlvo);

}	//	좋아요 서비스 끝
