package com.slionh.patientview.entity;

import java.util.Date;

public class CrmPatientlabel {
    private String patientlabelId;

    private String patientId;

    private String labelType;

    private String labelId;

    private String labelSpecies;

    private String labelContent;

    private String memo;

    private String extfiled1;

    private String extfiled2;

    private String extfiled3;

    private String labelState;

    private String operDept;

    private String operCode;

    private String operName;

    private Date operTime;

    public CrmPatientlabel(String patientlabelId, String patientId, String labelType, String labelId, String labelSpecies, String labelContent, String memo, String extfiled1, String extfiled2, String extfiled3, String labelState, String operDept, String operCode, String operName, Date operTime) {
        this.patientlabelId = patientlabelId;
        this.patientId = patientId;
        this.labelType = labelType;
        this.labelId = labelId;
        this.labelSpecies = labelSpecies;
        this.labelContent = labelContent;
        this.memo = memo;
        this.extfiled1 = extfiled1;
        this.extfiled2 = extfiled2;
        this.extfiled3 = extfiled3;
        this.labelState = labelState;
        this.operDept = operDept;
        this.operCode = operCode;
        this.operName = operName;
        this.operTime = operTime;
    }

    public CrmPatientlabel() {
        super();
    }

    public String getPatientlabelId() {
        return patientlabelId;
    }

    public void setPatientlabelId(String patientlabelId) {
        this.patientlabelId = patientlabelId == null ? null : patientlabelId.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getLabelType() {
        return labelType;
    }

    public void setLabelType(String labelType) {
        this.labelType = labelType == null ? null : labelType.trim();
    }

    public String getLabelId() {
        return labelId;
    }

    public void setLabelId(String labelId) {
        this.labelId = labelId == null ? null : labelId.trim();
    }

    public String getLabelSpecies() {
        return labelSpecies;
    }

    public void setLabelSpecies(String labelSpecies) {
        this.labelSpecies = labelSpecies == null ? null : labelSpecies.trim();
    }

    public String getLabelContent() {
        return labelContent;
    }

    public void setLabelContent(String labelContent) {
        this.labelContent = labelContent == null ? null : labelContent.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getExtfiled1() {
        return extfiled1;
    }

    public void setExtfiled1(String extfiled1) {
        this.extfiled1 = extfiled1 == null ? null : extfiled1.trim();
    }

    public String getExtfiled2() {
        return extfiled2;
    }

    public void setExtfiled2(String extfiled2) {
        this.extfiled2 = extfiled2 == null ? null : extfiled2.trim();
    }

    public String getExtfiled3() {
        return extfiled3;
    }

    public void setExtfiled3(String extfiled3) {
        this.extfiled3 = extfiled3 == null ? null : extfiled3.trim();
    }

    public String getLabelState() {
        return labelState;
    }

    public void setLabelState(String labelState) {
        this.labelState = labelState == null ? null : labelState.trim();
    }

    public String getOperDept() {
        return operDept;
    }

    public void setOperDept(String operDept) {
        this.operDept = operDept == null ? null : operDept.trim();
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
}