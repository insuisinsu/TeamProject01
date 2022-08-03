package com.mybatis.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mybatis.member.Criteria;
import com.mybatis.member.MemberService;
import com.mybatis.member.MemberVO;

@SessionAttributes("member")
@Controller
public class MemberController {

	// interface �� DAO ȣ��
	@Autowired
	private MemberService memberService;

	// ������ ��ȯ ó�� -> DB ���� ������ ���� JSON �������� ��ȯ
	
	@RequestMapping(value="/dataTransformMember.do") 
	@ResponseBody
	public List<MemberVO> dataTransformMember(MemberVO vo, Criteria cri){
		List<MemberVO> memberList = memberService.getMemberAllList(vo, cri);
		return	 memberList;
	}
	

	// 1. ȸ�� ���
	@RequestMapping("/insertMember.do")
	public String insertMember(MemberVO vo) {
		System.out.println("ȸ�� ��� - ��Ʈ�ѷ����� MyBatis �� �̿��� insert");
		memberService.insertMember(vo);
		return "";
	}

	// 2. ȸ�� ��ȸ
	@RequestMapping("/getMember.do")
	public String getMember(MemberVO vo, Model model) {
		System.out.println("ȸ�� ��� - ��Ʈ�ѷ����� MyBatis �� �̿��� select");
		model.addAttribute("member", memberService.getMember(vo));
		return "getMember.jsp";
	}

}
