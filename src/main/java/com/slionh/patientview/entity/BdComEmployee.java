package com.slionh.patientview.entity;

import java.util.Date;

public class BdComEmployee {
    private String employeeId;

    private String employeeCode;

    private String employeeName;

    private String employeeType;

    private String departmentId;

    private String spellCode;

    private String fivestrokeCode;

    private String sexCode;

    private Date birthday;

    private String idenno;

    private String phone;

    private String description;

    private String levelId;

    private String postId;

    private String nurseCellId;

    private Short sortId;

    private String validFlag;

    private String operId;

    private Date operTime;

    private String interfaceCode;

    private String temporaryRegistration;

    private String registrationpLevelPermission;

    public BdComEmployee(String employeeId, String employeeCode, String employeeName, String employeeType, String departmentId, String spellCode, String fivestrokeCode, String sexCode, Date birthday, String idenno, String phone, String description, String levelId, String postId, String nurseCellId, Short sortId, String validFlag, String operId, Date operTime, String interfaceCode, String temporaryRegistration, String registrationpLevelPermission) {
        this.employeeId = employeeId;
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.employeeType = employeeType;
        this.departmentId = departmentId;
        this.spellCode = spellCode;
        this.fivestrokeCode = fivestrokeCode;
        this.sexCode = sexCode;
        this.birthday = birthday;
        this.idenno = idenno;
        this.phone = phone;
        this.description = description;
        this.levelId = levelId;
        this.postId = postId;
        this.nurseCellId = nurseCellId;
        this.sortId = sortId;
        this.validFlag = validFlag;
        this.operId = operId;
        this.operTime = operTime;
        this.interfaceCode = interfaceCode;
        this.temporaryRegistration = temporaryRegistration;
        this.registrationpLevelPermission = registrationpLevelPermission;
    }

    public BdComEmployee() {
        super();
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId == null ? null : employeeId.trim();
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode == null ? null : employeeCode.trim();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName == null ? null : employeeName.trim();
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType == null ? null : employeeType.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
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

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode == null ? null : sexCode.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno == null ? null : idenno.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId == null ? null : levelId.trim();
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId == null ? null : postId.trim();
    }

    public String getNurseCellId() {
        return nurseCellId;
    }

    public void setNurseCellId(String nurseCellId) {
        this.nurseCellId = nurseCellId == null ? null : nurseCellId.trim();
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

    public String getInterfaceCode() {
        return interfaceCode;
    }

    public void setInterfaceCode(String interfaceCode) {
        this.interfaceCode = interfaceCode == null ? null : interfaceCode.trim();
    }

    public String getTemporaryRegistration() {
        return temporaryRegistration;
    }

    public void setTemporaryRegistration(String temporaryRegistration) {
        this.temporaryRegistration = temporaryRegistration == null ? null : temporaryRegistration.trim();
    }

    public String getRegistrationpLevelPermission() {
        return registrationpLevelPermission;
    }

    public void setRegistrationpLevelPermission(String registrationpLevelPermission) {
        this.registrationpLevelPermission = registrationpLevelPermission == null ? null : registrationpLevelPermission.trim();
    }
}