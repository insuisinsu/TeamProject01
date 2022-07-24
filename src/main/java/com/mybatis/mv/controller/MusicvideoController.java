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
		 		MusicvideoVO���� ������ �������� Session���ٰ� ������ �ΰ� ���Ӱ� ����� �׸����� ����
		 		������ ����� ������ �״�� ����
	 */
	@Autowired
	private MusicvideoService musicvideoService;	// �������̽��� DAO�� ȣ��
	
	// ������ ��ȯ ó�� (DB���� ������ ���� JSON �������� ���� ��ȯ ��Ŵ
	@RequestMapping (value = "/dataTransform.do")
	@ResponseBody	// <mvc:annotation-driven> ���� @ResponseBody�� �Դ����ϰ�
	public List<MusicvideoVO> dataTransform(MusicvideoVO vo) {
		// Null üũ
		vo.setSearchCondition("MV_NAME");
		vo.setSearchKeyword("");
		List<MusicvideoVO> mvList = musicvideoService.getMVList(vo);
		
		return mvList;
	}
	
	
	
	
	// 1. �º� ���
	@RequestMapping("/insertMV.do")
	public String insertMV(MusicvideoVO vo) {
		System.out.println("�º� ��� - ��Ʈ�ѷ����� Mybatis�� �̿��� insert");
		
		musicvideoService.insertMV(vo);
		return "insertMV.do"; 	// Forward ������� �º񸮽�Ʈ �������� ����
	}
	
	// 2. �º� ����
	@RequestMapping("/updateMV.do")
	public String updateMV(MusicvideoVO vo) {
		System.out.println("�º� ���� - ��Ʈ�ѷ����� Mybatis�� �̿��� update");
		
		musicvideoService.updateMV(vo);
		return ""; 	// Forward ������� �������������� ����
	}
	
	// 3. �º� ����
	@RequestMapping("/deleteMV.do")	
	public String deleteMV(MusicvideoVO vo) {
		System.out.println("�º� ���� - ��Ʈ�ѷ����� Mybatis�� �̿��� delete");
		
		musicvideoService.deleteMV(vo);
		return "";	// Forward ������� �������������� ����
	}
	
		// �˻� ���� ��� ���� (Model ��ü�� ���� �� �߰� �մϴ�. Model ��ü�� ȣ���ϱ� ���� ���� �۵��Ǿ Model ��ü�� ���� �Ҵ��Ѵ�.)
		@ModelAttribute("conditionMap")
		public Map<String, String> searchConditionMap() {
			
			Map<String, String> conditionMap = new HashMap<String, String>();
			conditionMap.put("����", "MV_NAME");
			conditionMap.put("����", "MV_SINGER");
			conditionMap.put("����", "MV_LYRICS");

			
			return conditionMap;
		}
		
				
	// 4. �º� �� ��ȸ
	@RequestMapping("/getMV.do")	
	public String getMV(MusicvideoVO vo, Model model) {
		System.out.println("�º� ��ȸ - ��Ʈ�ѷ����� Mybatis�� �̿��� select");
		
		model.addAttribute("mv", musicvideoService.getMV(vo));
		return "getMV.jsp";
	}
		
	// 5. �º� ��� ��ȸ
	@RequestMapping("/getMVList.do")
	public String getMVList(MusicvideoVO vo, Model model) {
		System.out.println("�º� ��� ��ȸ - ��Ʈ�ѷ����� Mybatis�� �̿��� select");
		
		
		// NULL �� ���� �⺻ ó��
		if (vo.getSearchCondition() == null) { 	// �˻��� ���� �ʾ����� �⺻ ó��
			vo.setSearchCondition("MV_NAME");
		}
		if (vo.getSearchKeyword()== null) {
			vo.setSearchKeyword("");
		}	
		
		
		model.addAttribute("mvList", musicvideoService.getMVList(vo));
		return "getMVList.jsp";
	}
	
		
}
