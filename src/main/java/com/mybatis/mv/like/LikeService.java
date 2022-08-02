package com.mybatis.mv.like;

import java.util.List;

//LikeService class
public interface LikeService {

	
//	���ƿ� ��ȸ
public List<MV_LikeVO> getLike(MV_LikeVO mlvo);
	
//	���ƿ� ��ü ��ȸ
public List<MV_LikeVO> getLikeList(MV_LikeVO mlvo);

//	���ƿ� �Է�
public int likeInsert(MV_LikeVO mlvo);

//	���ƿ� ������Ʈ
public int likeUpdate(MV_LikeVO mlvo);

//  �Ⱦ�� ������Ʈ
public int unlikeUpdate(MV_LikeVO mlvo);

}	//	���ƿ� ���� ��
