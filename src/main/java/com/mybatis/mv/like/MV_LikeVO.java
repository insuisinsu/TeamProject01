package com.mybatis.mv.like;

import lombok.Data;

@Data
public class MV_LikeVO {

	
	private String MV_LIKE_NUM; 	// ���ƿ� ��ȣ
    private String MV_ID; 			// �º� ��ȣ
    private String M_NUM; 			// ��� ��ȣ
    private String MV_LIKE_CNT; 	// ���ƿ� �� 
    private String MV_UNLIKE_CNT;	// �Ⱦ�� �� (���ƿ� �ٽ� ������)
	
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
