package com.slionh.patientview.entity;

import java.util.Date;

public class CrmRevisit {
    private String visitId;

    private String patientId;

    private String patientName;

    private String visitType;

    private String visitDisease;

    private String visitTitle;

    private String visitWay;

    private Date visitTime;

    private String visitDept;

    private String visitOper;

    private Date realVisitTime;

    private String realVisitDept;

    private String realVisitOper;

    private String customerStatus;

    private String customerWhere;

    private String visitResult;

    private String visitEnvironment;

    private String visitService;

    private String visitEffect;

    private Date visitNextDate;

    private String visitNextId;

    private String state;

    private String validFlag;

    private String memo;

    private String createdOperId;

    private Date createdTime;

    private String operId;

    private Date operTime;

    private String appointId;

    private String hospitalId;

    private String hospitalName;

    public CrmRevisit(String visitId, String patientId, String patientName, String visitType, String visitDisease, String visitTitle, String visitWay, Date visitTime, String visitDept, String visitOper, Date realVisitTime, String realVisitDept, String realVisitOper, String customerStatus, String customerWhere, String visitResult, String visitEnvironment, String visitService, String visitEffect, Date visitNextDate, String visitNextId, String state, String validFlag, String memo, String createdOperId, Date createdTime, String operId, Date operTime, String appointId, String hospitalId, String hospitalName) {
        this.visitId = visitId;
        this.patientId = patientId;
        this.patientName = patientName;
        this.visitType = visitType;
        this.visitDisease = visitDisease;
        this.visitTitle = visitTitle;
        this.visitWay = visitWay;
        this.visitTime = visitTime;
        this.visitDept = visitDept;
        this.visitOper = visitOper;
        this.realVisitTime = realVisitTime;
        this.realVisitDept = realVisitDept;
        this.realVisitOper = realVisitOper;
        this.customerStatus = customerStatus;
        this.customerWhere = customerWhere;
        this.visitResult = visitResult;
        this.visitEnvironment = visitEnvironment;
        this.visitService = visitService;
        this.visitEffect = visitEffect;
        this.visitNextDate = visitNextDate;
        this.visitNextId = visitNextId;
        this.state = state;
        this.validFlag = validFlag;
        this.memo = memo;
        this.createdOperId = createdOperId;
        this.createdTime = createdTime;
        this.operId = operId;
        this.operTime = operTime;
        this.appointId = appointId;
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
    }

    public CrmRevisit() {
        super();
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId == null ? null : visitId.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType == null ? null : visitType.trim();
    }

    public String getVisitDisease() {
        return visitDisease;
    }

    public void setVisitDisease(String visitDisease) {
        this.visitDisease = visitDisease == null ? null : visitDisease.trim();
    }

    public String getVisitTitle() {
        return visitTitle;
    }

    public void setVisitTitle(String visitTitle) {
        this.visitTitle = visitTitle == null ? null : visitTitle.trim();
    }

    public String getVisitWay() {
        return visitWay;
    }

    public void setVisitWay(String visitWay) {
        this.visitWay = visitWay == null ? null : visitWay.trim();
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public String getVisitDept() {
        return visitDept;
    }

    public void setVisitDept(String visitDept) {
        this.visitDept = visitDept == null ? null : visitDept.trim();
    }

    public String getVisitOper() {
        return visitOper;
    }

    public void setVisitOper(String visitOper) {
        this.visitOper = visitOper == null ? null : visitOper.trim();
    }

    public Date getRealVisitTime() {
        return realVisitTime;
    }

    public void setRealVisitTime(Date realVisitTime) {
        this.realVisitTime = realVisitTime;
    }

    public String getRealVisitDept() {
        return realVisitDept;
    }

    public void setRealVisitDept(String realVisitDept) {
        this.realVisitDept = realVisitDept == null ? null : realVisitDept.trim();
    }

    public String getRealVisitOper() {
        return realVisitOper;
    }

    public void setRealVisitOper(String realVisitOper) {
        this.realVisitOper = realVisitOper == null ? null : realVisitOper.trim();
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus == null ? null : customerStatus.trim();
    }

    public String getCustomerWhere() {
        return customerWhere;
    }

    public void setCustomerWhere(String customerWhere) {
        this.customerWhere = customerWhere == null ? null : customerWhere.trim();
    }

    public String getVisitResult() {
        return visitResult;
    }

    public void setVisitResult(String visitResult) {
        this.visitResult = visitResult == null ? null : visitResult.trim();
    }

    public String getVisitEnvironment() {
        return visitEnvironment;
    }

    public void setVisitEnvironment(String visitEnvironment) {
        this.visitEnvironment = visitEnvironment == null ? null : visitEnvironment.trim();
    }

    public String getVisitService() {
        return visitService;
    }

    public void setVisitService(String visitService) {
        this.visitService = visitService == null ? null : visitService.trim();
    }

    public String getVisitEffect() {
        return visitEffect;
    }

    public void setVisitEffect(String visitEffect) {
        this.visitEffect = visitEffect == null ? null : visitEffect.trim();
    }

    public Date getVisitNextDate() {
        return visitNextDate;
    }

    public void setVisitNextDate(Date visitNextDate) {
        this.visitNextDate = visitNextDate;
    }

    public String getVisitNextId() {
        return visitNextId;
    }

    public void setVisitNextId(String visitNextId) {
        this.visitNextId = visitNextId == null ? null : visitNextId.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag == null ? null : validFlag.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getCreatedOperId() {
        return createdOperId;
    }

    public void setCreatedOperId(String createdOperId) {
        this.createdOperId = createdOperId == null ? null : createdOperId.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getOperId() {
        return operId;
    }

    public void setOperId(String operId) {
        this.operId = operId == null ? null : operId.trim();
    }

    public Date getOperTime() {
        return operTime;
    }

    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    public String getAppointId() {
        return appointId;
    }

    public void setAppointId(String appointId) {
        this.appointId = appointId == null ? null : appointId.trim();
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId == null ? null : hospitalId.trim();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    @Override
    public String toString() {
        return "CrmRevisit{" +
                "visitId='" + visitId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", patientName='" + patientName + '\'' +
                ", visitType='" + visitType + '\'' +
                ", visitDisease='" + visitDisease + '\'' +
                ", visitTitle='" + visitTitle + '\'' +
                ", visitWay='" + visitWay + '\'' +
                ", visitTime=" + visitTime +
                ", visitDept='" + visitDept + '\'' +
                ", visitOper='" + visitOper + '\'' +
                ", realVisitTime=" + realVisitTime +
                ", realVisitDept='" + realVisitDept + '\'' +
                ", realVisitOper='" + realVisitOper + '\'' +
                ", customerStatus='" + customerStatus + '\'' +
                ", customerWhere='" + customerWhere + '\'' +
                ", visitResult='" + visitResult + '\'' +
                ", visitEnvironment='" + visitEnvironment + '\'' +
                ", visitService='" + visitService + '\'' +
                ", visitEffect='" + visitEffect + '\'' +
                ", visitNextDate=" + visitNextDate +
                ", visitNextId='" + visitNextId + '\'' +
                ", state='" + state + '\'' +
                ", validFlag='" + validFlag + '\'' +
                ", memo='" + memo + '\'' +
                ", createdOperId='" + createdOperId + '\'' +
                ", createdTime=" + createdTime +
                ", operId='" + operId + '\'' +
                ", operTime=" + operTime +
                ", appointId='" + appointId + '\'' +
                ", hospitalId='" + hospitalId + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                '}';
    }
}