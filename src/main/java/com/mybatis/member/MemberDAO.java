package com.mybatis.member;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mybatis.member.Criteria;

@Repository
public class MemberDAO {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insertMember(MemberVO vo) {
		System.out.println("MyBatis 를 사용해서 insertMember() 수행");
		mybatis.insert("MemberDAO.insertMember", vo);
	}
	
	public void updateMember(MemberVO vo) {
		System.out.println("MyBatis 를 사용해서 updateMember() 수행");
		mybatis.update("MemberDAO.updateMember", vo);
	}
	
	public void deleteMember(MemberVO vo) {
		System.out.println("MyBatis 를 사용해서 deleteMember() 수행");
		mybatis.delete("MemberDAO.deleteMember", vo);
	}
	
	// Member 하나만 가져오는 경우
	public MemberVO getMember(MemberVO vo) {
		System.out.println("MyBatis 를 사용해서 getMember() 수행");
		return mybatis.selectOne("MemberDAO.getMember", vo);
	}
	
	// Member 여럿을 가져오는 경우 - List 에 MemberVO 객체를 담아서 가져온다.
	public List<MemberVO> getMemberAllList(MemberVO vo, Criteria cri){
		System.out.println("MyBatis 를 사용해서 selectList() 수행 - 전체 멤버");
		return mybatis.selectList("MemberDAO.getMemberAllList", cri);
	}
	
	// 페이징 카운트 처리
	public int listCount() {
		System.out.println("Member 카운트");
		return mybatis.selectOne("MemberDAO.listCount");
	}
	
	
	
	
	
}
