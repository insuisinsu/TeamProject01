package com.springbook.biz.reply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Reply_MV_Svc")
public class ReplySvcImpl implements Reply_MV_Svc{

    //dao로 연결
    @Autowired
    private Reply_DAO reply_Dao;

    @Override
    public void insertMVReply(Reply_MV_VO vo) {
	reply_Dao.insertMVReply(vo);
	System.out.println("insertImpl까지 왔습니다");
    }

    @Override
    public List<Reply_MV_VO> selectMVReply(Reply_MV_VO vo) {
	System.out.println("seletImpl까지 왔습니다.");
	return reply_Dao.selectMVReply(vo);
    }
    
    
    
}
