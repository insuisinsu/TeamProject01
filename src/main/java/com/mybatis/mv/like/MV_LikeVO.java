package com.mybatis.mv.like;

import lombok.Data;

@Data
public class MV_LikeVO {

	
	private String MV_LIKE_NUM; 	// 좋아요 번호
    private String MV_ID; 			// 뮤비 번호
    private String M_NUM; 			// 멤버 번호
    private String MV_LIKE_CNT; 	// 좋아요 수 
    private String MV_UNLIKE_CNT;	// 싫어요 수 (좋아요 다시 누를때)
	
    public String getMV_UNLIKE_CNT() {
		return MV_UNLIKE_CNT;
	}
	public void setMV_UNLIKE_CNT(String mV_UNLIKE_CNT) {
		MV_UNLIKE_CNT = mV_UNLIKE_CNT;
	}
	public String getMV_LIKE_NUM() {
		return MV_LIKE_NUM;
	}
	public void setMV_LIKE_NUM(String mV_LIKE_NUM) {
		MV_LIKE_NUM = mV_LIKE_NUM;
	}
	public String getMV_ID() {
		return MV_ID;
	}
	public void setMV_ID(String mV_ID) {
		MV_ID = mV_ID;
	}
	public String getM_NUM() {
		return M_NUM;
	}
	public void setM_NUM(String m_NUM) {
		M_NUM = m_NUM;
	}
	public String getMV_LIKE_CNT() {
		return MV_LIKE_CNT;
	}
	public void setMV_LIKE_CNT(String mV_LIKE_CNT) {
		MV_LIKE_CNT = mV_LIKE_CNT;
	}

	
}
