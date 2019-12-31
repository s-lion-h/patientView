package com.slionh.patientview.entity;

public class ComPatientinfoKey {
    private String cardNo;

    private String hospitalId;

    public ComPatientinfoKey(String cardNo, String hospitalId) {
        this.cardNo = cardNo;
        this.hospitalId = hospitalId;
    }

    public ComPatientinfoKey() {
        super();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId == null ? null : hospitalId.trim();
    }
}