package com.springbook.biz.reply;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface Reply_MV_Svc {
    
    //댓글등록
    void insertMVReply(Reply_MV_VO vo);
   
    //실험용
    //Reply_MV_VO selectMVReply_One(Reply_MV_VO vo);
    
    //댓글목록 불어오기
    List<Reply_MV_VO> selectMVReply(Reply_MV_VO vo);
    
    

}