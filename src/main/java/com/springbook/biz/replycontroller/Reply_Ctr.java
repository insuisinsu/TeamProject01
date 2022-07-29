package com.springbook.biz.replycontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springbook.biz.reply.Reply_MV_Svc;
import com.springbook.biz.reply.Reply_MV_VO;

@Controller
public class Reply_Ctr {

    //서비스로 연결
    @Autowired
    private Reply_MV_Svc reMv_Svc;
    
    //댓글 저장
    @RequestMapping("/insertMVReply")
    public String insertReply(@ModelAttribute("replmv") Reply_MV_VO replmv, Model model) {	//@ModelAttribute("replmv")사용하여 값 받아오기
	System.out.println("컨트롤러로 뮤비 등록");
	List<Reply_MV_VO> replyList = reMv_Svc.selectMVReply(replmv);
	reMv_Svc.insertMVReply(replmv);
	model.addAttribute("mv3", replyList);
	return "getMV.jsp";
    }
    
/*
    //댓글 목록 조회
    @RequestMapping("/mvReplyList.do")
      public String replyList( Reply_MV_VO replmv, Model model) {
      System.out.println("댓글목록 조회");
      List<Reply_MV_VO> replyList = reMv_Svc.selectMVReply(replmv);
      model.addAttribute("replyList", replyList);
      return "mvReplyList.jsp";
      }
*/     
    
    
}
