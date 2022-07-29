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

    //���񽺷� ����
    @Autowired
    private Reply_MV_Svc reMv_Svc;
    
    //��� ����
    @RequestMapping("/insertMVReply")
    public String insertReply(@ModelAttribute("replmv") Reply_MV_VO replmv, Model model) {	//@ModelAttribute("replmv")����Ͽ� �� �޾ƿ���
	System.out.println("��Ʈ�ѷ��� �º� ���");
	List<Reply_MV_VO> replyList = reMv_Svc.selectMVReply(replmv);
	reMv_Svc.insertMVReply(replmv);
	model.addAttribute("mv3", replyList);
	return "getMV.jsp";
    }
    
/*
    //��� ��� ��ȸ
    @RequestMapping("/mvReplyList.do")
      public String replyList( Reply_MV_VO replmv, Model model) {
      System.out.println("��۸�� ��ȸ");
      List<Reply_MV_VO> replyList = reMv_Svc.selectMVReply(replmv);
      model.addAttribute("replyList", replyList);
      return "mvReplyList.jsp";
      }
*/     
    
    
}
