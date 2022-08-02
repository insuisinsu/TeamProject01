package com.springbook.biz.reply;

import java.util.Date;

import lombok.Data;

@Data
public class Reply_MV_VO {

    private String remvId;
    private String remvContent;
    private Date remvRdate;
    private int mvId;
    private int mNum;

    public Reply_MV_VO() {
    }

    public String getRemvId() {
        return remvId;
    }

    public void setRemvId(String remvId) {
        this.remvId = remvId;
    }

    public String getRemvContent() {
        return remvContent;
    }

    public void setRemvContent(String remvContent) {
        this.remvContent = remvContent;
    }

    public Date getRemvRdate() {
        return remvRdate;
    }

    public void setRemvRdate(Date remvRdate) {
        this.remvRdate = remvRdate;
    }

    public int getMvId() {
        return mvId;
    }

    public void setMvId(int mvId) {
        this.mvId = mvId;
    }

    public int getmNum() {
        return mNum;
    }

    public void setmNum(int mNum) {
        this.mNum = mNum;
    }


}
