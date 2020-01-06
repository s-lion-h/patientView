package com.slionh.patientview.entity;

public class FinOpbFeedetailKey {
    private String recipeNo;

    private Integer sequenceNo;

    private String transType;

    private String moOrder;

    private String invoiceSeq;

    private String hospitalId;

    public FinOpbFeedetailKey(String recipeNo, Integer sequenceNo, String transType, String moOrder, String invoiceSeq, String hospitalId) {
        this.recipeNo = recipeNo;
        this.sequenceNo = sequenceNo;
        this.transType = transType;
        this.moOrder = moOrder;
        this.invoiceSeq = invoiceSeq;
        this.hospitalId = hospitalId;
    }

    public FinOpbFeedetailKey() {
        super();
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo == null ? null : recipeNo.trim();
    }

    public Integer getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(Integer sequenceNo) {
        this.sequenceNo = sequenceNo;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    public String getMoOrder() {
        return moOrder;
    }

    public void setMoOrder(String moOrder) {
        this.moOrder = moOrder == null ? null : moOrder.trim();
    }

    public String getInvoiceSeq() {
        return invoiceSeq;
    }

    public void setInvoiceSeq(String invoiceSeq) {
        this.invoiceSeq = invoiceSeq == null ? null : invoiceSeq.trim();
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId == null ? null : hospitalId.trim();
    }
}