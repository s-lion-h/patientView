package com.slionh.patientview.entity;

public class FinOprRegisterKey {
    private String clinicCode;

    private String transType;

    private String hospitalId;

    public FinOprRegisterKey(String clinicCode, String transType, String hospitalId) {
        this.clinicCode = clinicCode;
        this.transType = transType;
        this.hospitalId = hospitalId;
    }

    public FinOprRegisterKey() {
        super();
    }

    public String getClinicCode() {
        return clinicCode;
    }

    public void setClinicCode(String clinicCode) {
        this.clinicCode = clinicCode == null ? null : clinicCode.trim();
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId == null ? null : hospitalId.trim();
    }
}