package com.springbook.biz.reply;

import java.util.Date;

public class Reply_MV_VO {

    private String remv_id;
    private String remv_content;
    private Date remv_rdate;
    private int mv_id;
    private int m_num;
    
    public Reply_MV_VO() {};
    
    public String getRemv_id() {
        return remv_id;
    }
    public void setRemv_id(String remv_id) {
        this.remv_id = remv_id;
    }
    public String getRemv_content() {
        return remv_content;
    }
    public void setRemv_content(String remv_content) {
        this.remv_content = remv_content;
    }
    public Date getRemv_rdate() {
        return remv_rdate;
    }
    public void setRemv_rdate(Date remv_rdate) {
        this.remv_rdate = remv_rdate;
    }

    public int getMv_id() {
        return mv_id;
    }

    public void setMv_id(int mv_id) {
        this.mv_id = mv_id;
    }

    public int getM_num() {
        return m_num;
    }
    public void setM_num(int m_num) {
        this.m_num = m_num;
    }
    
    
    
}
