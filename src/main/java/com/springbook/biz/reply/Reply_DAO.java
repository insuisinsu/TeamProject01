package com.springbook.biz.reply;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Reply_DAO implements Reply_MV_Svc {
    
    //SqlSessionTemplate���� SIUD�޼��尡 ����
    @Autowired
    private SqlSessionTemplate sqlSession;
    
    public void insertMVReply(Reply_MV_VO vo){
	System.out.println("Reply insert()����");
	sqlSession.insert("reply.insertMVReply", vo);
    }

    @Override
    public List<Reply_MV_VO> selectMVReply(Reply_MV_VO vo) {
	System.out.println("Reply select()����");
	//������ ����Ʈ���·� ��Ƽ� ����
	return sqlSession.selectList("reply.selectMVReply", vo);
    }
    
    
    
    
}
