package com.springbook.biz.reply;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface Reply_MV_Svc {
    
    //��۵��
    void insertMVReply(Reply_MV_VO vo);
   
    //�����
    //Reply_MV_VO selectMVReply_One(Reply_MV_VO vo);
    
    //��۸�� �Ҿ����
    List<Reply_MV_VO> selectMVReply(Reply_MV_VO vo);
    
    

}