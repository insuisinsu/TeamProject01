package com.springbook.biz.board;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;


public class BoardVO {
	
	private int seq; 
	private String title; 
	private String writer; 
	private String content; 
	private Date regdate; 
	private int cnt;
	private String searchCondition;
	private String searchKeyword;
	private MultipartFile uploadFile;
	
	//getter , setter
	
	//@JsonIgnore   : getter 위에 설정 , 특정 변수는 JSON 포멧으로 변환하지 않도록 설정할때 사용. 
	
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
	
	public MultipartFile getUploadFile() {
		return uploadFile;
	}
	
	
	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}
	
	
	
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	} 
	
	@Override
	public String toString () {	//객체 자체를 출력시 객체의 주소를 출력 하는 것이 아니라 
								  // 객체의 메모리의 값을 출력 
		
		return "BoardVO [seq = " + seq + ", title = " + title + ", writer = " + writer +
				" , content = " + content + " , regdate = " + regdate + " , cnt = " + 
				cnt + "]" ; 
	}
	
	
}
