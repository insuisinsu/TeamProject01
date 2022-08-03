package com.mybatis.member;

import java.sql.Date;

import lombok.Data;

@Data
public class MemberVO {
	
	private int    m_num   ;
	private String m_id    ;
	private String m_pw    ;
	private String m_email ;
	private String m_phone ;
	private Date   m_birth ;
	private String m_gender;
	private Date   m_rdate ;
	private String m_add1  ;
	private String m_add2  ;
	private String m_add3  ;
	private String m_sfname;
	private String m_ofname;
	private String m_role;
	
	private String searchCondition;		// 검색조건
	private String searchKeyword;		// 검색키워드	
	
	public MemberVO() {}
	
	public MemberVO( int m_num, String m_id, String m_pw, String m_email
			, String m_phone, Date m_birth, String m_gender, Date m_rdate
			, String m_add1, String m_add2, String m_add3, String m_sfname
			, String m_ofname, String m_role) {
		super();
		this.m_num    = m_num   ;
		this.m_id     = m_id    ;
		this.m_pw     = m_pw    ;
		this.m_email  = m_email ;
		this.m_phone  = m_phone ;
		this.m_birth  = m_birth ;
		this.m_gender = m_gender;
		this.m_rdate  = m_rdate ;
		this.m_add1   = m_add1  ;
		this.m_add2   = m_add2  ;
		this.m_add3   = m_add3  ;
		this.m_sfname = m_sfname;
		this.m_ofname = m_ofname;
		this.m_role   = m_role  ;
	}

	public int getM_num() {
		return m_num;
	}

	public void setM_num(int m_num) {
		this.m_num = m_num;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public String getM_phone() {
		return m_phone;
	}

	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}

	public Date getM_birth() {
		return m_birth;
	}

	public void setM_birth(Date m_birth) {
		this.m_birth = m_birth;
	}

	public String getM_gender() {
		return m_gender;
	}

	public void setM_gender(String m_gender) {
		this.m_gender = m_gender;
	}

	public Date getM_rdate() {
		return m_rdate;
	}

	public void setM_rdate(Date m_rdate) {
		this.m_rdate = m_rdate;
	}

	public String getM_add1() {
		return m_add1;
	}

	public void setM_add1(String m_add1) {
		this.m_add1 = m_add1;
	}

	public String getM_add2() {
		return m_add2;
	}

	public void setM_add2(String m_add2) {
		this.m_add2 = m_add2;
	}

	public String getM_add3() {
		return m_add3;
	}

	public void setM_add3(String m_add3) {
		this.m_add3 = m_add3;
	}

	public String getM_sfname() {
		return m_sfname;
	}

	public void setM_sfname(String m_sfname) {
		this.m_sfname = m_sfname;
	}

	public String getM_ofname() {
		return m_ofname;
	}

	public void setM_ofname(String m_ofname) {
		this.m_ofname = m_ofname;
	}

	public String getM_role() {
		return m_role;
	}

	public void setM_role(String m_role) {
		this.m_role = m_role;
	}

	public String getSearchCondition() {
		return searchCondition;
	}

	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
	}
	
	
	
}
