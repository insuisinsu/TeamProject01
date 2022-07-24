package com.springbook.biz.replycontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springbook.biz.reply.Reply_MV_Svc;
import com.springbook.biz.reply.Reply_MV_VO;

@Controller
public class Reply_Ctr {

    //서비스로 연결
    @Autowired
    private Reply_MV_Svc reMv_Svc;
    
    //댓글 저장
    @RequestMapping("/insertMVReply.do")
    public String insertReply(@ModelAttribute("replmv") Reply_MV_VO replmv) {	//@ModelAttribute("replmv")사용하여 값 받아오기
	System.out.println("컨트롤러로 뮤비 등록");
	//값 넘어오는지 확인
	System.out.println(replmv.getRemv_content());
	System.out.println(replmv.getM_num());
	System.out.println(replmv.getMv_id());
	reMv_Svc.insertMVReply(replmv);
	return "getMV.do";
    }
    
    //댓글 목록 조회
    @RequestMapping("/selectMVReply.do")
      public String replyList(@ModelAttribute("replmv2") Reply_MV_VO replmv2) {
      System.out.println("댓글목록 조회");
      System.out.println(replmv2.getRemv_content());
      reMv_Svc.selectMVReply(replmv2);
      return "getMV.do";
      }
     
    
    
}
