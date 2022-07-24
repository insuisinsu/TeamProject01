package com.mybatis.mv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("musicvideoService")
public class MusicvideoServiceImpl implements MusicvideoService {



	//타입으로 객체 주입
	@Autowired
	private MusicvideoDAOMyBatis MusicvideoDAO;
	

	@Override
	public void insertMV(MusicvideoVO vo) {
		MusicvideoDAO.insertMV(vo);
	}

	@Override
	public void updateMV(MusicvideoVO vo) {
		MusicvideoDAO.updateMV(vo);
	}

	@Override
	public void deleteMV(MusicvideoVO vo) {
		MusicvideoDAO.deleteMV(vo);
	}

	@Override
	public MusicvideoVO getMV(MusicvideoVO vo) {
		return MusicvideoDAO.getMV(vo);
	}

	@Override
	public List<MusicvideoVO> getMVList(MusicvideoVO vo) {
		return MusicvideoDAO.getMVList(vo);
	}

	
}