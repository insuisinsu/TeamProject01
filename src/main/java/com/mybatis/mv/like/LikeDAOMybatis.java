package com.mybatis.mv.like;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LikeDAOMybatis {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	// ���ƿ� ���
	public int likeInsert(MV_LikeVO mlvo) {
		System.out.println("MyBatis�� ����ؼ� likeInsert() ����");
		
		return mybatis.insert("LikeDAO.likeInsert", mlvo);
	}
	
	// ���ƿ� ����
	public int likeUpdate(MV_LikeVO mlvo) {
		System.out.println("MyBatis�� ����ؼ� likeUpdate() ����");
		
		return mybatis.update("LikeDAO.likeUpdate", mlvo);
	}
	
	// �Ⱦ�� ����
	public int unlikeUpdate(MV_LikeVO mlvo) {
		System.out.println("MyBatis�� ����ؼ� unlikeUpdate() ����");
		
		return mybatis.update("LikeDAO.unlikeUpdate", mlvo);
	}
	
	// ���ƿ� ��ȸ
	public List<MV_LikeVO> getLike(MV_LikeVO mlvo) {
		System.out.println("MyBatis�� ����ؼ� getLike() ����");
		
		return mybatis.selectList("LikeDAO.getLike", mlvo);
	}
	
	// ���ƿ� ��ü ��ȸ 
	public List<MV_LikeVO> getLikeList(MV_LikeVO mlvo) {
		System.out.println("MyBatis�� ����ؼ� getLikeList() ����");
		
		return mybatis.selectList("LikeDAO.getLikeList", mlvo);
	}
	
	
	
	
}
