package com.mybatis.mv;

import java.util.List;

public interface MusicvideoService {
	// CRUD ����� �޼ҵ� ����
	
	// �������� ��� (������ ������)
	void insertMV(MusicvideoVO vo);

	// �������� ���� (������ ������)
	void updateMV(MusicvideoVO vo);

	// �������� ���� (������ ������)
	void deleteMV(MusicvideoVO vo);

	// �������� �� ��ȸ 
	MusicvideoVO getMV(MusicvideoVO vo);

<<<<<<< HEAD
	// �������� ��� ��ȸ (�׸�)
	List<MusicvideoVO> getMVList(MusicvideoVO vo, Criteria cri);
	
	// �������� ��� ��ȸ (��ü)
	List<MusicvideoVO> getMVAllList(MusicvideoVO vo, Criteria cri);
	
	// �Խù� �� ����
	int listCount();
	
=======
	// �������� ��� ��ȸ
	List<MusicvideoVO> getMVList(MusicvideoVO vo);
>>>>>>> 7801e111a992d75b3e045c2b49397f81a0adc034
}
