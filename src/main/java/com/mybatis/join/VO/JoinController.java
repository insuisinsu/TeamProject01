package com.mybatis.join.VO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JoinController {
	
	@Autowired
	private MybatisDAO mybatisDAO;
	
	// 뭐라고 요청이 들어오는지  ,, (요청이 들어오는)범위는 web.xml 과 presentation-layer.xml 에서 설정
	@RequestMapping("/joinList.do")
	public String selectList(JoinVO vo, Model model) {
		System.out.println("컨트롤러 - /joinList.do 호출 성공");
		List<JoinVO> joinList = mybatisDAO.selectListJoin(vo);
		System.out.println("joinList 에 joinList 객체 저장 성공");
		
		JoinVO joinVO = joinList.get(0);
		System.out.println(joinVO.toString());

		
		model.addAttribute("joinVO", mybatisDAO.selectListJoin(joinVO));
		
		return "joinList.jsp";
	}
	
}
