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
		System.out.println("MyBatis�� ����ؼ� insertMV() ���� ");
		
		mybatis.insert("MusicvideoDAO.insertMV", vo);
	}
	
	public void updateMV(MusicvideoVO vo) {
		System.out.println("MyBatis�� ����ؼ� updateMV() ���� ");
		
		mybatis.update("MusicvideoDAO.updateMV", vo);
	}
	
	public void deleteMV(MusicvideoVO vo) {
		System.out.println("MyBatis�� ����ؼ� deleteMV() ���� ");
		
		mybatis.delete("MusicvideoDAO.deleteMV", vo);
	}
	
	// �Ѿ���� ��(���ڵ�)�� �ϳ��� ���
	public MusicvideoVO getMV(MusicvideoVO vo) {	
		System.out.println("MyBatis�� ����ؼ� getMV() ���� ");
		
		return mybatis.selectOne("MusicvideoDAO.getMV", vo);
	}
	
	
	
	
	
	// �Ѿ���� ��(���ڵ�)�� ������ �� ���
	public List<MusicvideoVO> getMVList(MusicvideoVO vo) { 	
		System.out.println("MyBatis�� ����ؼ� getMVList() ���� ");
		
		return mybatis.selectList("MusicvideoDAO.getMVList", vo);
	}
	
	
	
	
	
}
