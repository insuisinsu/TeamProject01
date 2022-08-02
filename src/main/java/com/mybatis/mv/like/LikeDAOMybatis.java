package com.mybatis.mv.like;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LikeDAOMybatis {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	// 좋아요 등록
	public int likeInsert(MV_LikeVO mlvo) {
		System.out.println("MyBatis를 사용해서 likeInsert() 수행");
		
		return mybatis.insert("LikeDAO.likeInsert", mlvo);
	}
	
	// 좋아요 수정
	public int likeUpdate(MV_LikeVO mlvo) {
		System.out.println("MyBatis를 사용해서 likeUpdate() 수행");
		
		return mybatis.update("LikeDAO.likeUpdate", mlvo);
	}
	
	// 싫어요 수정
	public int unlikeUpdate(MV_LikeVO mlvo) {
		System.out.println("MyBatis를 사용해서 unlikeUpdate() 수행");
		
		return mybatis.update("LikeDAO.unlikeUpdate", mlvo);
	}
	
	// 좋아요 조회
	public List<MV_LikeVO> getLike(MV_LikeVO mlvo) {
		System.out.println("MyBatis를 사용해서 getLike() 수행");
		
		return mybatis.selectList("LikeDAO.getLike", mlvo);
	}
	
	// 좋아요 전체 조회 
	public List<MV_LikeVO> getLikeList(MV_LikeVO mlvo) {
		System.out.println("MyBatis를 사용해서 getLikeList() 수행");
		
		return mybatis.selectList("LikeDAO.getLikeList", mlvo);
	}
	
	
	
	
}
