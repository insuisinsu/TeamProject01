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

	// interface 로 DAO 호출
	@Autowired
	private MemberService memberService;

	// 데이터 변환 처리 -> DB 에서 가져온 값을 JSON 포맷으로 변환
	
	@RequestMapping(value="/dataTransformMember.do") 
	@ResponseBody
	public List<MemberVO> dataTransformMember(MemberVO vo, Criteria cri){
		List<MemberVO> memberList = memberService.getMemberAllList(vo, cri);
		return	 memberList;
	}
	

	// 1. 회원 등록
	@RequestMapping("/insertMember.do")
	public String insertMember(MemberVO vo) {
		System.out.println("회원 등록 - 컨트롤러에서 MyBatis 를 이용해 insert");
		memberService.insertMember(vo);
		return "";
	}

	// 2. 회원 조회
	@RequestMapping("/getMember.do")
	public String getMember(MemberVO vo, Model model) {
		System.out.println("회원 등록 - 컨트롤러에서 MyBatis 를 이용해 select");
		model.addAttribute("member", memberService.getMember(vo));
		return "getMember.jsp";
	}

}
