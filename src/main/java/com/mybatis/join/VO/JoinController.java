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
	
	// ����� ��û�� ��������  ,, (��û�� ������)������ web.xml �� presentation-layer.xml ���� ����
	@RequestMapping("/joinList.do")
	public String selectList(JoinVO vo, Model model) {
		System.out.println("��Ʈ�ѷ� - /joinList.do ȣ�� ����");
		List<JoinVO> joinList = mybatisDAO.selectListJoin(vo);
		System.out.println("joinList �� joinList ��ü ���� ����");
		
		JoinVO joinVO = joinList.get(0);
		System.out.println(joinVO.toString());

		
		model.addAttribute("joinVO", mybatisDAO.selectListJoin(joinVO));
		
		return "joinList.jsp";
	}
	
}
