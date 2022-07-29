package com.mybatis.mv;

import java.util.List;

public interface MusicvideoService {
	// CRUD 기능의 메소드 구현
	
	// 뮤직비디오 등록 (관리자 페이지)
	void insertMV(MusicvideoVO vo);

	// 뮤직비디오 수정 (관리자 페이지)
	void updateMV(MusicvideoVO vo);

	// 뮤직비디오 삭제 (관리자 페이지)
	void deleteMV(MusicvideoVO vo);

	// 뮤직비디오 상세 조회 
	MusicvideoVO getMV(MusicvideoVO vo);

	// 뮤직비디오 목록 조회 (테마)
	List<MusicvideoVO> getMVList(MusicvideoVO vo, Criteria cri);
	
	// 뮤직비디오 목록 조회 (전체)
	List<MusicvideoVO> getMVAllList(MusicvideoVO vo, Criteria cri);
	
	// 게시물 총 개수
	int listCount();
	
}
