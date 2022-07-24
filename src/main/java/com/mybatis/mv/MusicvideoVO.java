package com.mybatis.mv;

import java.util.Date;

import lombok.Data;

@Data
public class MusicvideoVO {
	
	private int mv_id;					// 뮤비번호
	private String mv_name;				// 제목
	private String mv_singer;			// 가수
	private String mv_album;			// 뮤비앨범
	private String mv_url;				// 뮤비URL
	private String mv_imgurl;			// 뮤비이미지 URL
	private Date mv_rdate;				// 발매일
	private String mv_lyrics;			// 가사
	private int theme_id;				// 테마번호
	
	private String searchCondition;		// 검색조건
	private String searchKeyword;		// 검색키워드	

	public MusicvideoVO () {}			// 기본 생성자
	
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

	
	

	
	public MusicvideoVO(int mv_id, String mv_name, String mv_singer, String mv_album, String mv_url, String mv_imgurl,
			Date mv_rdate, String mv_lyrics, int theme_id) {
		super();
		this.mv_id = mv_id;
		this.mv_name = mv_name;
		this.mv_singer = mv_singer;
		this.mv_album = mv_album;
		this.mv_url = mv_url;
		this.mv_imgurl = mv_imgurl;
		this.mv_rdate = mv_rdate;
		this.mv_lyrics = mv_lyrics;
		this.theme_id = theme_id;
	}
	
	// getter, setter
	
	public int getMv_id() {
		return mv_id;
	}
	public void setMv_id(int mv_id) {
		this.mv_id = mv_id;
	}
	public String getMv_name() {
		return mv_name;
	}
	public void setMv_name(String mv_name) {
		this.mv_name = mv_name;
	}
	public String getMv_singer() {
		return mv_singer;
	}
	public void setMv_singer(String mv_singer) {
		this.mv_singer = mv_singer;
	}
	public String getMv_album() {
		return mv_album;
	}
	public void setMv_album(String mv_album) {
		this.mv_album = mv_album;
	}
	public String getMv_url() {
		return mv_url;
	}
	public void setMv_url(String mv_url) {
		this.mv_url = mv_url;
	}
	public String getMv_imgurl() {
		return mv_imgurl;
	}
	public void setMv_imgurl(String mv_imgurl) {
		this.mv_imgurl = mv_imgurl;
	}
	public Date getMv_rdate() {
		return mv_rdate;
	}
	public void setMv_rdate(Date mv_rdate) {
		this.mv_rdate = mv_rdate;
	}
	public String getMv_lyrics() {
		return mv_lyrics;
	}
	public void setMv_lyrics(String mv_lyrics) {
		this.mv_lyrics = mv_lyrics;
	}
	public int getTheme_id() {
		return theme_id;
	}
	public void setTheme_id(int theme_id) {
		this.theme_id = theme_id;
	}
	
	// toString()
	
	@Override
	public String toString() {
		return "MusicvideoVO [mv_id=" + mv_id + ", mv_name=" + mv_name + ", mv_singer=" + mv_singer + ", mv_album="
				+ mv_album + ", mv_url=" + mv_url + ", mv_imgurl=" + mv_imgurl + ", mv_rdate=" + mv_rdate
				+ ", mv_lyrics=" + mv_lyrics + ", theme_id=" + theme_id + "]";
	}
	
	
	
	

	
}
