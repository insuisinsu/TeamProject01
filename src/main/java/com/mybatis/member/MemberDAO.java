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
		System.out.println("MyBatis �� ����ؼ� insertMember() ����");
		mybatis.insert("MemberDAO.insertMember", vo);
	}
	
	public void updateMember(MemberVO vo) {
		System.out.println("MyBatis �� ����ؼ� updateMember() ����");
		mybatis.update("MemberDAO.updateMember", vo);
	}
	
	public void deleteMember(MemberVO vo) {
		System.out.println("MyBatis �� ����ؼ� deleteMember() ����");
		mybatis.delete("MemberDAO.deleteMember", vo);
	}
	
	// Member �ϳ��� �������� ���
	public MemberVO getMember(MemberVO vo) {
		System.out.println("MyBatis �� ����ؼ� getMember() ����");
		return mybatis.selectOne("MemberDAO.getMember", vo);
	}
	
	// Member ������ �������� ��� - List �� MemberVO ��ü�� ��Ƽ� �����´�.
	public List<MemberVO> getMemberAllList(MemberVO vo, Criteria cri){
		System.out.println("MyBatis �� ����ؼ� selectList() ���� - ��ü ���");
		return mybatis.selectList("MemberDAO.getMemberAllList", cri);
	}
	
	// ����¡ ī��Ʈ ó��
	public int listCount() {
		System.out.println("Member ī��Ʈ");
		return mybatis.selectOne("MemberDAO.listCount");
	}
	
	
	
	
	
}
