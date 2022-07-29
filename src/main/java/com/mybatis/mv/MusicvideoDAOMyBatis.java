package com.mybatis.mv;

<<<<<<< HEAD
import java.util.List;
=======
import java.util.List; 
>>>>>>> 7801e111a992d75b3e045c2b49397f81a0adc034

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
	
	
<<<<<<< HEAD
	// 넘어오는 값(레코드)이 여러개 인 경우 (테마별)
	public List<MusicvideoVO> getMVList(MusicvideoVO vo, Criteria cri) {
=======
	
	
	
	// 넘어오는 값(레코드)이 여러개 인 경우
	public List<MusicvideoVO> getMVList(MusicvideoVO vo) { 	
>>>>>>> 7801e111a992d75b3e045c2b49397f81a0adc034
		System.out.println("MyBatis를 사용해서 getMVList() 수행 ");
		
		return mybatis.selectList("MusicvideoDAO.getMVList", vo);
	}
	
	
<<<<<<< HEAD
	// 넘어오는 값(레코드)이 여러개 인 경우 (전체)
	public List<MusicvideoVO> getMVAllList(MusicvideoVO vo, Criteria cri) {
		System.out.println("MyBatis를 사용해서 getMVAllList() 수행 ");
		
		return mybatis.selectList("MusicvideoDAO.getMVAllList", vo);
	}

	public int listCount() {
		return mybatis.selectOne("MusicvideoDAO.listCount");
	}

=======
	
	
>>>>>>> 7801e111a992d75b3e045c2b49397f81a0adc034
	
}
