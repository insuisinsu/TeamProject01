package com.mybatis.mv.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mybatis.mv.MusicvideoService;
import com.mybatis.mv.MusicvideoVO;
import com.springbook.biz.reply.Reply_MV_Svc;

@SessionAttributes("mv")
@Controller
public class MusicvideoController {
	/*
	 	@SessionAttributes("mv")
		 		MusicvideoVO에서 이전에 설정값을 Session에다가 저장해 두고 새롭게 변경된 항목으로 수정
		 		기존의 저장된 값들은 그대로 유지
	 */
	@Autowired
	private MusicvideoService musicvideoService;	// 인터페이스로 DAO를 호출
	
	// 데이터 변환 처리 (DB에서 가져온 값을 JSON 포멧으로 값을 변환 시킴
	@RequestMapping (value = "/dataTransform.do")
	@ResponseBody	// <mvc:annotation-driven> 에서 @ResponseBody를 게더링하고
	public List<MusicvideoVO> dataTransform(MusicvideoVO vo) {
		// Null 체크
		vo.setSearchCondition("MV_NAME");
		vo.setSearchKeyword("");
		List<MusicvideoVO> mvList = musicvideoService.getMVList(vo);
		
		return mvList;
	}
	
	
	
	
	// 1. 뮤비 등록
	@RequestMapping("/insertMV.do")
	public String insertMV(MusicvideoVO vo) {
		System.out.println("뮤비 등록 - 컨트롤러에서 Mybatis를 이용해 insert");
		
		musicvideoService.insertMV(vo);
		return "insertMV.do"; 	// Forward 방식으로 뮤비리스트 페이지에 전송
	}
	
	// 2. 뮤비 수정
	@RequestMapping("/updateMV.do")
	public String updateMV(MusicvideoVO vo) {
		System.out.println("뮤비 수정 - 컨트롤러에서 Mybatis를 이용해 update");
		
		musicvideoService.updateMV(vo);
		return ""; 	// Forward 방식으로 관리자페이지에 전송
	}
	
	// 3. 뮤비 삭제
	@RequestMapping("/deleteMV.do")	
	public String deleteMV(MusicvideoVO vo) {
		System.out.println("뮤비 삭제 - 컨트롤러에서 Mybatis를 이용해 delete");
		
		musicvideoService.deleteMV(vo);
		return "";	// Forward 방식으로 관리자페이지에 전송
	}
	
		// 검색 조건 목록 설정 (Model 객체에 값을 더 추가 합니다. Model 객체를 호출하기 전에 먼저 작동되어서 Model 객체에 값을 할당한다.)
		@ModelAttribute("conditionMap")
		public Map<String, String> searchConditionMap() {
			
			Map<String, String> conditionMap = new HashMap<String, String>();
			conditionMap.put("제목", "MV_NAME");
			conditionMap.put("가수", "MV_SINGER");
			conditionMap.put("가사", "MV_LYRICS");

			
			return conditionMap;
		}
		
				
	// 4. 뮤비 상세 조회
	@RequestMapping("/getMV.do")	
	public String getMV(MusicvideoVO vo, Model model) {
		System.out.println("뮤비 조회 - 컨트롤러에서 Mybatis를 이용해 select");
		
		model.addAttribute("mv", musicvideoService.getMV(vo));
		return "getMV.jsp";
	}
		
	// 5. 뮤비 목록 조회
	@RequestMapping("/getMVList.do")
	public String getMVList(MusicvideoVO vo, Model model) {
		System.out.println("뮤비 목록 조회 - 컨트롤러에서 Mybatis를 이용해 select");
		
		
		// NULL 에 대한 기본 처리
		if (vo.getSearchCondition() == null) { 	// 검색을 하지 않았을때 기본 처리
			vo.setSearchCondition("MV_NAME");
		}
		if (vo.getSearchKeyword()== null) {
			vo.setSearchKeyword("");
		}	
		
		
		model.addAttribute("mvList", musicvideoService.getMVList(vo));
		return "getMVList.jsp";
	}
	
		
}
