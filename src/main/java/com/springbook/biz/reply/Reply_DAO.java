package com.springbook.biz.reply;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Reply_DAO{
    
    //SqlSessionTemplate에는 SIUD메서드가 있음
    @Autowired
    private SqlSessionTemplate sqlSession;
    public void insertMVReply(Reply_MV_VO vo){
	System.out.println("Reply insert()수행");
	sqlSession.insert("reply.insertMVReply", vo);
    }

    //리스트로 값받아오기
    public List<Reply_MV_VO> selectMVReply(Reply_MV_VO vo) {
	System.out.println("Reply select()수행");
	//값들을 리스트형태로 담아서 전송
	return sqlSession.selectList("reply.selectMVReply", vo);
    }
    
    //한개의 값만 넘어왔을때
    public Reply_MV_VO selectMVReply_One(Reply_MV_VO vo) {
	System.out.println("하나만");
	return sqlSession.selectOne("reply.selectMVReply", vo);
    }
    
    
    
}
