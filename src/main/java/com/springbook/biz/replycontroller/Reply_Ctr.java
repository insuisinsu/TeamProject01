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

    //���񽺷� ����
    @Autowired
    private Reply_MV_Svc reMv_Svc;
    
    //��� ����
    @RequestMapping("/insertMVReply.do")
    public String insertReply(@ModelAttribute("replmv") Reply_MV_VO replmv) {	//@ModelAttribute("replmv")����Ͽ� �� �޾ƿ���
	System.out.println("��Ʈ�ѷ��� �º� ���");
	//�� �Ѿ������ Ȯ��
	System.out.println(replmv.getRemv_content());
	System.out.println(replmv.getM_num());
	System.out.println(replmv.getMv_id());
	reMv_Svc.insertMVReply(replmv);
	return "getMV.do";
    }
    
    //��� ��� ��ȸ
    @RequestMapping("/selectMVReply.do")
      public String replyList(@ModelAttribute("replmv2") Reply_MV_VO replmv2) {
      System.out.println("��۸�� ��ȸ");
      System.out.println(replmv2.getRemv_content());
      reMv_Svc.selectMVReply(replmv2);
      return "getMV.do";
      }
     
    
    
}
