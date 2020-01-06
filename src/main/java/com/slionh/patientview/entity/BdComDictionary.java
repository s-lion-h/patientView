package com.slionh.patientview.entity;

import java.util.Date;

public class BdComDictionary extends BdComDictionaryKey {
    private String dictionaryCode;

    private String dictionaryName;

    private String description;

    private String userDefineCode;

    private String spellCode;

    private String fivestrokeCode;

    private Short sortId;

    private String validFlag;

    private String operId;

    private Date operTime;

    public BdComDictionary(String dictionaryId, String dictionaryType, String dictionaryCode, String dictionaryName, String description, String userDefineCode, String spellCode, String fivestrokeCode, Short sortId, String validFlag, String operId, Date operTime) {
        super(dictionaryId, dictionaryType);
        this.dictionaryCode = dictionaryCode;
        this.dictionaryName = dictionaryName;
        this.description = description;
        this.userDefineCode = userDefineCode;
        this.spellCode = spellCode;
        this.fivestrokeCode = fivestrokeCode;
        this.sortId = sortId;
        this.validFlag = validFlag;
        this.operId = operId;
        this.operTime = operTime;
    }

    public BdComDictionary() {
        super();
    }

    public String getDictionaryCode() {
        return dictionaryCode;
    }

    public void setDictionaryCode(String dictionaryCode) {
        this.dictionaryCode = dictionaryCode == null ? null : dictionaryCode.trim();
    }

    public String getDictionaryName() {
        return dictionaryName;
    }

    public void setDictionaryName(String dictionaryName) {
        this.dictionaryName = dictionaryName == null ? null : dictionaryName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getUserDefineCode() {
        return userDefineCode;
    }

    public void setUserDefineCode(String userDefineCode) {
        this.userDefineCode = userDefineCode == null ? null : userDefineCode.trim();
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode == null ? null : spellCode.trim();
    }

    public String getFivestrokeCode() {
        return fivestrokeCode;
    }

    public void setFivestrokeCode(String fivestrokeCode) {
        this.fivestrokeCode = fivestrokeCode == null ? null : fivestrokeCode.trim();
    }

    public Short getSortId() {
        return sortId;
    }

    public void setSortId(Short sortId) {
        this.sortId = sortId;
    }

    public String getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag == null ? null : validFlag.trim();
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

    @Override
    public String toString() {
        return "BdComDictionary{" +
                "dictionaryCode='" + dictionaryCode + '\'' +
                ", dictionaryName='" + dictionaryName + '\'' +
                ", description='" + description + '\'' +
                ", userDefineCode='" + userDefineCode + '\'' +
                ", spellCode='" + spellCode + '\'' +
                ", fivestrokeCode='" + fivestrokeCode + '\'' +
                ", sortId=" + sortId +
                ", validFlag='" + validFlag + '\'' +
                ", operId='" + operId + '\'' +
                ", operTime=" + operTime +
                '}';
    }
}