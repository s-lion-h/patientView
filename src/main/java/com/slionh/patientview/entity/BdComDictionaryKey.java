package com.slionh.patientview.entity;

public class BdComDictionaryKey {
    private String dictionaryId;

    private String dictionaryType;

    public BdComDictionaryKey(String dictionaryId, String dictionaryType) {
        this.dictionaryId = dictionaryId;
        this.dictionaryType = dictionaryType;
    }

    public BdComDictionaryKey() {
        super();
    }

    public String getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(String dictionaryId) {
        this.dictionaryId = dictionaryId == null ? null : dictionaryId.trim();
    }

    public String getDictionaryType() {
        return dictionaryType;
    }

    public void setDictionaryType(String dictionaryType) {
        this.dictionaryType = dictionaryType == null ? null : dictionaryType.trim();
    }
}