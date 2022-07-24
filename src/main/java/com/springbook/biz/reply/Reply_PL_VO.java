package com.springbook.biz.reply;

import java.util.Date;

public class Reply_PL_VO {

    private String repl_id;
    private String repl_content;
    private Date repl_rdate;
    private int pl_id;
    private int m_num;
    
    public Reply_PL_VO() {};
    
    public String getRepl_id() {
        return repl_id;
    }
    public void setRepl_id(String repl_id) {
        this.repl_id = repl_id;
    }
    public String getRepl_content() {
        return repl_content;
    }
    public void setRepl_content(String repl_content) {
        this.repl_content = repl_content;
    }
    public Date getRepl_rdate() {
        return repl_rdate;
    }
    public void setRepl_rdate(Date repl_rdate) {
        this.repl_rdate = repl_rdate;
    }
    public int getPl_id() {
        return pl_id;
    }
    public void setPl_id(int pl_id) {
        this.pl_id = pl_id;
    }
    public int getM_num() {
        return m_num;
    }
    public void setM_num(int m_num) {
        this.m_num = m_num;
    }
    
    
    
}
