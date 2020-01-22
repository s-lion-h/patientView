package com.slionh.patientview.entity;

import java.util.Date;

public class BdCrmMsgtemplate {
    private String msgtemplateId;

    private String msgtemplateType;

    private String msgtemplateChannel;

    private String msgtemplateTitle;

    private String msgtemplateContent;

    private Short sortId;

    private String state;

    private String extfield01;

    private String extfield02;

    private String extfield03;

    private String operCode;

    private String operName;

    private Date operTime;

    private String createCode;

    private String createName;

    private Date createTime;

    public BdCrmMsgtemplate(String msgtemplateId, String msgtemplateType, String msgtemplateChannel, String msgtemplateTitle, String msgtemplateContent, Short sortId, String state, String extfield01, String extfield02, String extfield03, String operCode, String operName, Date operTime, String createCode, String createName, Date createTime) {
        this.msgtemplateId = msgtemplateId;
        this.msgtemplateType = msgtemplateType;
        this.msgtemplateChannel = msgtemplateChannel;
        this.msgtemplateTitle = msgtemplateTitle;
        this.msgtemplateContent = msgtemplateContent;
        this.sortId = sortId;
        this.state = state;
        this.extfield01 = extfield01;
        this.extfield02 = extfield02;
        this.extfield03 = extfield03;
        this.operCode = operCode;
        this.operName = operName;
        this.operTime = operTime;
        this.createCode = createCode;
        this.createName = createName;
        this.createTime = createTime;
    }

    public BdCrmMsgtemplate() {
        super();
    }

    public String getMsgtemplateId() {
        return msgtemplateId;
    }

    public void setMsgtemplateId(String msgtemplateId) {
        this.msgtemplateId = msgtemplateId == null ? null : msgtemplateId.trim();
    }

    public String getMsgtemplateType() {
        return msgtemplateType;
    }

    public void setMsgtemplateType(String msgtemplateType) {
        this.msgtemplateType = msgtemplateType == null ? null : msgtemplateType.trim();
    }

    public String getMsgtemplateChannel() {
        return msgtemplateChannel;
    }

    public void setMsgtemplateChannel(String msgtemplateChannel) {
        this.msgtemplateChannel = msgtemplateChannel == null ? null : msgtemplateChannel.trim();
    }

    public String getMsgtemplateTitle() {
        return msgtemplateTitle;
    }

    public void setMsgtemplateTitle(String msgtemplateTitle) {
        this.msgtemplateTitle = msgtemplateTitle == null ? null : msgtemplateTitle.trim();
    }

    public String getMsgtemplateContent() {
        return msgtemplateContent;
    }

    public void setMsgtemplateContent(String msgtemplateContent) {
        this.msgtemplateContent = msgtemplateContent == null ? null : msgtemplateContent.trim();
    }

    public Short getSortId() {
        return sortId;
    }

    public void setSortId(Short sortId) {
        this.sortId = sortId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getExtfield01() {
        return extfield01;
    }

    public void setExtfield01(String extfield01) {
        this.extfield01 = extfield01 == null ? null : extfield01.trim();
    }

    public String getExtfield02() {
        return extfield02;
    }

    public void setExtfield02(String extfield02) {
        this.extfield02 = extfield02 == null ? null : extfield02.trim();
    }

    public String getExtfield03() {
        return extfield03;
    }

    public void setExtfield03(String extfield03) {
        this.extfield03 = extfield03 == null ? null : extfield03.trim();
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode == null ? null : operCode.trim();
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName == null ? null : operName.trim();
    }

    public Date getOperTime() {
        return operTime;
    }

    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    public String getCreateCode() {
        return createCode;
    }

    public void setCreateCode(String createCode) {
        this.createCode = createCode == null ? null : createCode.trim();
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}