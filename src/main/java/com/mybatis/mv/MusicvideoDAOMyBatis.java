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
	
	
<<<<<<< HEAD
	// �Ѿ���� ��(���ڵ�)�� ������ �� ��� (�׸���)
	public List<MusicvideoVO> getMVList(MusicvideoVO vo, Criteria cri) {
=======
	
	
	
	// �Ѿ���� ��(���ڵ�)�� ������ �� ���
	public List<MusicvideoVO> getMVList(MusicvideoVO vo) { 	
>>>>>>> 7801e111a992d75b3e045c2b49397f81a0adc034
		System.out.println("MyBatis�� ����ؼ� getMVList() ���� ");
		
		return mybatis.selectList("MusicvideoDAO.getMVList", vo);
	}
	
	
<<<<<<< HEAD
	// �Ѿ���� ��(���ڵ�)�� ������ �� ��� (��ü)
	public List<MusicvideoVO> getMVAllList(MusicvideoVO vo, Criteria cri) {
		System.out.println("MyBatis�� ����ؼ� getMVAllList() ���� ");
		
		return mybatis.selectList("MusicvideoDAO.getMVAllList", vo);
	}

	public int listCount() {
		return mybatis.selectOne("MusicvideoDAO.listCount");
	}

=======
	
	
>>>>>>> 7801e111a992d75b3e045c2b49397f81a0adc034
	
}
