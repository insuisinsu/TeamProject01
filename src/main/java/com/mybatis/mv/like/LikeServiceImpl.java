package com.mybatis.mv.like;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("likeService")
public class LikeServiceImpl implements LikeService {

	//타입으로 객체 주입
	@Autowired
	private LikeDAOMybatis likeDAO;
	
	@Override
	public List<MV_LikeVO> getLike(MV_LikeVO mlvo) {
		
		return likeDAO.getLike(mlvo);
	}

	@Override
	public List<MV_LikeVO> getLikeList(MV_LikeVO mlvo) {
		return likeDAO.getLikeList(mlvo);
	}

	@Override
	public int likeInsert(MV_LikeVO mlvo) {
		return likeDAO.likeInsert(mlvo);
	}

	@Override
	public int likeUpdate(MV_LikeVO mlvo) {
		return likeDAO.likeUpdate(mlvo);
	}

	@Override
	public int unlikeUpdate(MV_LikeVO mlvo) {
		return likeDAO.unlikeUpdate(mlvo);
	}

}
