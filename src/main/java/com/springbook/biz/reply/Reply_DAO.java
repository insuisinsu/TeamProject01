package com.springbook.biz.reply;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Reply_DAO implements Reply_MV_Svc {
    
    //SqlSessionTemplate에는 SIUD메서드가 있음
    @Autowired
    private SqlSessionTemplate sqlSession;
    
    public void insertMVReply(Reply_MV_VO vo){
	System.out.println("Reply insert()수행");
	sqlSession.insert("reply.insertMVReply", vo);
    }

    @Override
    public List<Reply_MV_VO> selectMVReply(Reply_MV_VO vo) {
	System.out.println("Reply select()수행");
	//값들을 리스트형태로 담아서 전송
	return sqlSession.selectList("reply.selectMVReply", vo);
    }
    
    
    
    
}
