package com.mybatis.join.VO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<JoinVO> selectListJoin(JoinVO vo) {
		System.out.println("selectListJoin(JoinVO vo) 호출 성공");
		return mybatis.selectList("join.selectListJoin", vo);
	}
	
}
