package com.springbook.biz.reply;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Reply_DAO{
    
    //SqlSessionTemplate���� SIUD�޼��尡 ����
    @Autowired
    private SqlSessionTemplate sqlSession;
    public void insertMVReply(Reply_MV_VO vo){
	System.out.println("Reply insert()����");
	sqlSession.insert("reply.insertMVReply", vo);
    }

    //����Ʈ�� ���޾ƿ���
    public List<Reply_MV_VO> selectMVReply(Reply_MV_VO vo) {
	System.out.println("Reply select()����");
	//������ ����Ʈ���·� ��Ƽ� ����
	return sqlSession.selectList("reply.selectMVReply", vo);
    }
    
    //�Ѱ��� ���� �Ѿ������
    public Reply_MV_VO selectMVReply_One(Reply_MV_VO vo) {
	System.out.println("�ϳ���");
	return sqlSession.selectOne("reply.selectMVReply", vo);
    }
    
    
    
}
