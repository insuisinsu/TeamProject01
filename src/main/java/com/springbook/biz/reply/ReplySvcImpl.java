package com.springbook.biz.reply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Reply_MV_Svc")
public class ReplySvcImpl implements Reply_MV_Svc{

    //dao�� ����
    @Autowired
    private Reply_DAO reply_Dao;

    @Override
    public void insertMVReply(Reply_MV_VO vo) {
	reply_Dao.insertMVReply(vo);
	System.out.println("insertImpl���� �Խ��ϴ�");
    }

    @Override
    public List<Reply_MV_VO> selectMVReply(Reply_MV_VO vo) {
	System.out.println("seletImpl���� �Խ��ϴ�.");
	return reply_Dao.selectMVReply(vo);
    }
    
    
    
}
