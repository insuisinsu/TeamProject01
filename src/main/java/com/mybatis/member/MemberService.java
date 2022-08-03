package com.mybatis.member;

import java.util.List;

public interface MemberService {

	void insertMember(MemberVO vo);

	void updateMember(MemberVO vo);

	void deleteMember(MemberVO vo);

	MemberVO getMember(MemberVO vo);

	List<MemberVO> getMemberAllList(MemberVO vo, Criteria cri);

}
