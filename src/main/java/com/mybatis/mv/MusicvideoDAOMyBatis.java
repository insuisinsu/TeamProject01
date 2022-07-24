package com.mybatis.mv;

import java.util.List; 

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MusicvideoDAOMyBatis {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertMV(MusicvideoVO vo) {
		System.out.println("MyBatis를 사용해서 insertMV() 수행 ");
		
		mybatis.insert("MusicvideoDAO.insertMV", vo);
	}
	
	public void updateMV(MusicvideoVO vo) {
		System.out.println("MyBatis를 사용해서 updateMV() 수행 ");
		
		mybatis.update("MusicvideoDAO.updateMV", vo);
	}
	
	public void deleteMV(MusicvideoVO vo) {
		System.out.println("MyBatis를 사용해서 deleteMV() 수행 ");
		
		mybatis.delete("MusicvideoDAO.deleteMV", vo);
	}
	
	// 넘어오는 값(레코드)이 하나인 경우
	public MusicvideoVO getMV(MusicvideoVO vo) {	
		System.out.println("MyBatis를 사용해서 getMV() 수행 ");
		
		return mybatis.selectOne("MusicvideoDAO.getMV", vo);
	}
	
	
	
	
	
	// 넘어오는 값(레코드)이 여러개 인 경우
	public List<MusicvideoVO> getMVList(MusicvideoVO vo) { 	
		System.out.println("MyBatis를 사용해서 getMVList() 수행 ");
		
		return mybatis.selectList("MusicvideoDAO.getMVList", vo);
	}
	
	
	
	
	
}
