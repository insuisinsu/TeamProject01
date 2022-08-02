package com.mybatis.mv.like;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller 
public class LikeController {
	
	
	//	필드 오토와이어드
	@Autowired(required=false)
	private LikeService likeService;

	
/*
	//	좋아요 폼
	@RequestMapping("/likeForm.do")
	public String likeForm(HttpServletRequest req, MV_LikeVO mlvo, MemberVO mvo, Model model) {
	
		
		//String mlnum = ChabunUtil.likeChabun(likeService.likeChabun().getLnum());
		
		mlvo.setMV_LIKE_NUM(req.getParameter("mv_like_num"));
		mlvo.setM_NUM(req.getParameter("m_num"));
		mlvo.setMV_ID(req.getParameter("mv_id"));

		System.out.println(mlvo.getM_NUM());
		
		List<MV_LikeVO> likelist = likeService.getLikeList(mlvo);
		//logger.info("LikeController.likeForm :: listAll >>> : " + listAll);
		System.out.println("LikeController의 likelist");
		
		
		int nCnt = 0;
		
		if(likelist.size() <= 0) {
			nCnt = likeService.likeInsert(mlvo);
			//logger.info("LikeController.likeInsert() :: nCnt >>> : " + nCnt);
			System.out.println("LikeController 의 likeInsert : " + nCnt );
		}
		
		List<MV_LikeVO> listS = likeService.getLikeList(mlvo);
		
		model.addAttribute("listS", listS);
		
		model.addAttribute("mvo", mvo);
		
		return "likeForm.jsp";
	}
	
		

	

	//	likeInsert()
	//	like 등록
	@RequestMapping("/likeInsert.do")
	@ResponseBody
	public String likeInsert(HttpServletRequest req, Model model, MV_LikeVO mlvo){
		//	likeInsert() 진입 로그
		
		System.out.println("LikeController.likeInsert() 작동 ");

		
		System.out.println("LikeController.likeInsert().getLike_cnt : " + mlvo.getMV_LIKE_CNT());
		System.out.println("LikeController.likeInsert().getMV_LIKE_NUM() : " + mlvo.getMV_LIKE_NUM());
		System.out.println("LikeController.likeInsert().getMV_ID() : " + mlvo.getMV_ID());

		
		String mv_like_cnt = "";
		
		
		List<MV_LikeVO> listCnt = likeService.getLike(mlvo);
			
		int nCnt = 0;
		
			if(listCnt != null && listCnt.size() > 0) {
				nCnt = likeService.likeUpdate(mlvo);
				System.out.println("LikeController.likeInsert() - nCnt : " + nCnt);
			}
			
			List<MV_LikeVO> likelist = likeService.getLikeList(mlvo);
			System.out.println("LikeController.likeInsert() - likelist : "  + likelist.size());
			
			if(likelist != null && likelist.size() > 0) {
				mv_like_cnt = likelist.get(0).getMV_LIKE_CNT();
				//logger.info("LikeController.likeInsert() :: mv_like_cnt >>> : " + mv_like_cnt);
				System.out.println("LikeController.likeInsert() - mv_like_cnt : " + mv_like_cnt) ;
			}
			return mv_like_cnt;

	}	//	end of likeInsert()

	*/
	
}	//	end of LikeController