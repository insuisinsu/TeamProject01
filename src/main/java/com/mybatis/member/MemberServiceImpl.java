package com.mybatis.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	// 타입으로 객체 주입
	@Autowired
	private MemberDAO memberDAO;
	
	@Override
	public void insertMember(MemberVO vo) {
		memberDAO.insertMember(vo);
	}
	
	@Override
	public void updateMember(MemberVO vo) {
		memberDAO.updateMember(vo);
	}
	
	@Override
	public void deleteMember(MemberVO vo) {
		memberDAO.deleteMember(vo);
	}
	
	@Override
	public MemberVO getMember(MemberVO vo) {
		return memberDAO.getMember(vo);
	}

	@Override
	public List<MemberVO> getMemberAllList(MemberVO vo, Criteria cri) {
		return memberDAO.getMemberAllList(vo, cri);
	}
	
	public int listCount() {
		return memberDAO.listCount();
	}
	
}
