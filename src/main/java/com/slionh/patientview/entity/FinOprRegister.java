package com.slionh.patientview.entity;

import java.math.BigDecimal;
import java.util.Date;

public class FinOprRegister extends FinOprRegisterKey {
    private String cardNo;

    private Date regDate;

    private String noonCode;

    private String name;

    private String idenno;

    private String sexCode;

    private Date birthday;

    private String relaPhone;

    private String address;

    private String cardType;

    private String paykindCode;

    private String paykindName;

    private String pactCode;

    private String pactName;

    private String mcardNo;

    private String reglevlCode;

    private String reglevlName;

    private String deptCode;

    private String deptName;

    private String schemaNo;

    private Integer orderNo;

    private Long seeno;

    private Date beginTime;

    private Date endTime;

    private String doctCode;

    private String doctName;

    private String ynregchrg;

    private String invoiceNo;

    private String recipeNo;

    private String ynbook;

    private String ynfr;

    private String appendFlag;

    private BigDecimal regFee;

    private BigDecimal chckFee;

    private BigDecimal diagFee;

    private BigDecimal othFee;

    private BigDecimal ownCost;

    private BigDecimal pubCost;

    private BigDecimal payCost;

    private String validFlag;

    private String operCode;

    private Date operDate;

    private String cancelOpcd;

    private Date cancelDate;

    private String medicalType;

    private String icdCode;

    private String examCode;

    private Date examDate;

    private String checkFlag;

    private String checkOpcd;

    private Date checkDate;

    private String balanceFlag;

    private String balanceNo;

    private String balanceOpcd;

    private Date balanceDate;

    private String ynsee;

    private Date seeDate;

    private String triageFlag;

    private String triageOpcd;

    private Date triageDate;

    private Short printInvoicecnt;

    private String seeDpcd;

    private String seeDocd;

    private String inSource;

    private String isSendinhoscase;

    private String isEncryptname;

    private String normalname;

    private Date inDate;

    private Date outDate;

    private String zg;

    private String inState;

    private BigDecimal ecoCost;

    private String isAccount;

    private String isEmergency;

    private String mark1;

    private BigDecimal height;

    private BigDecimal weight;

    private BigDecimal sbp;

    private BigDecimal dbp;

    private BigDecimal temperature;

    private String upFlag;

    private BigDecimal bloodglu;

    private String currentCardtype;

    private String currentCard;

    private BigDecimal inTimes;

    private Long emrRegid;

    private String patientType;

    private String bookId;

    private String class1desease;

    private String class2desease;

    private String isDirectfee;

    private String realDoctCode;

    private String realDoctName;

    private String hospitalFirstVisit;

    private String rootdeptFirstVisit;

    private String doctFirstVisit;

    public FinOprRegister(String clinicCode, String transType, String hospitalId, String cardNo, Date regDate, String noonCode, String name, String idenno, String sexCode, Date birthday, String relaPhone, String address, String cardType, String paykindCode, String paykindName, String pactCode, String pactName, String mcardNo, String reglevlCode, String reglevlName, String deptCode, String deptName, String schemaNo, Integer orderNo, Long seeno, Date beginTime, Date endTime, String doctCode, String doctName, String ynregchrg, String invoiceNo, String recipeNo, String ynbook, String ynfr, String appendFlag, BigDecimal regFee, BigDecimal chckFee, BigDecimal diagFee, BigDecimal othFee, BigDecimal ownCost, BigDecimal pubCost, BigDecimal payCost, String validFlag, String operCode, Date operDate, String cancelOpcd, Date cancelDate, String medicalType, String icdCode, String examCode, Date examDate, String checkFlag, String checkOpcd, Date checkDate, String balanceFlag, String balanceNo, String balanceOpcd, Date balanceDate, String ynsee, Date seeDate, String triageFlag, String triageOpcd, Date triageDate, Short printInvoicecnt, String seeDpcd, String seeDocd, String inSource, String isSendinhoscase, String isEncryptname, String normalname, Date inDate, Date outDate, String zg, String inState, BigDecimal ecoCost, String isAccount, String isEmergency, String mark1, BigDecimal height, BigDecimal weight, BigDecimal sbp, BigDecimal dbp, BigDecimal temperature, String upFlag, BigDecimal bloodglu, String currentCardtype, String currentCard, BigDecimal inTimes, Long emrRegid, String patientType, String bookId, String class1desease, String class2desease, String isDirectfee, String realDoctCode, String realDoctName, String hospitalFirstVisit, String rootdeptFirstVisit, String doctFirstVisit) {
        super(clinicCode, transType, hospitalId);
        this.cardNo = cardNo;
        this.regDate = regDate;
        this.noonCode = noonCode;
        this.name = name;
        this.idenno = idenno;
        this.sexCode = sexCode;
        this.birthday = birthday;
        this.relaPhone = relaPhone;
        this.address = address;
        this.cardType = cardType;
        this.paykindCode = paykindCode;
        this.paykindName = paykindName;
        this.pactCode = pactCode;
        this.pactName = pactName;
        this.mcardNo = mcardNo;
        this.reglevlCode = reglevlCode;
        this.reglevlName = reglevlName;
        this.deptCode = deptCode;
        this.deptName = deptName;
        this.schemaNo = schemaNo;
        this.orderNo = orderNo;
        this.seeno = seeno;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.doctCode = doctCode;
        this.doctName = doctName;
        this.ynregchrg = ynregchrg;
        this.invoiceNo = invoiceNo;
        this.recipeNo = recipeNo;
        this.ynbook = ynbook;
        this.ynfr = ynfr;
        this.appendFlag = appendFlag;
        this.regFee = regFee;
        this.chckFee = chckFee;
        this.diagFee = diagFee;
        this.othFee = othFee;
        this.ownCost = ownCost;
        this.pubCost = pubCost;
        this.payCost = payCost;
        this.validFlag = validFlag;
        this.operCode = operCode;
        this.operDate = operDate;
        this.cancelOpcd = cancelOpcd;
        this.cancelDate = cancelDate;
        this.medicalType = medicalType;
        this.icdCode = icdCode;
        this.examCode = examCode;
        this.examDate = examDate;
        this.checkFlag = checkFlag;
        this.checkOpcd = checkOpcd;
        this.checkDate = checkDate;
        this.balanceFlag = balanceFlag;
        this.balanceNo = balanceNo;
        this.balanceOpcd = balanceOpcd;
        this.balanceDate = balanceDate;
        this.ynsee = ynsee;
        this.seeDate = seeDate;
        this.triageFlag = triageFlag;
        this.triageOpcd = triageOpcd;
        this.triageDate = triageDate;
        this.printInvoicecnt = printInvoicecnt;
        this.seeDpcd = seeDpcd;
        this.seeDocd = seeDocd;
        this.inSource = inSource;
        this.isSendinhoscase = isSendinhoscase;
        this.isEncryptname = isEncryptname;
        this.normalname = normalname;
        this.inDate = inDate;
        this.outDate = outDate;
        this.zg = zg;
        this.inState = inState;
        this.ecoCost = ecoCost;
        this.isAccount = isAccount;
        this.isEmergency = isEmergency;
        this.mark1 = mark1;
        this.height = height;
        this.weight = weight;
        this.sbp = sbp;
        this.dbp = dbp;
        this.temperature = temperature;
        this.upFlag = upFlag;
        this.bloodglu = bloodglu;
        this.currentCardtype = currentCardtype;
        this.currentCard = currentCard;
        this.inTimes = inTimes;
        this.emrRegid = emrRegid;
        this.patientType = patientType;
        this.bookId = bookId;
        this.class1desease = class1desease;
        this.class2desease = class2desease;
        this.isDirectfee = isDirectfee;
        this.realDoctCode = realDoctCode;
        this.realDoctName = realDoctName;
        this.hospitalFirstVisit = hospitalFirstVisit;
        this.rootdeptFirstVisit = rootdeptFirstVisit;
        this.doctFirstVisit = doctFirstVisit;
    }

    public FinOprRegister() {
        super();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }

    public String getNoonCode() {
        return noonCode;
    }

    public void setNoonCode(String noonCode) {
        this.noonCode = noonCode == null ? null : noonCode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno == null ? null : idenno.trim();
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

    public String getRelaPhone() {
        return relaPhone;
    }

    public void setRelaPhone(String relaPhone) {
        this.relaPhone = relaPhone == null ? null : relaPhone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode == null ? null : paykindCode.trim();
    }

    public String getPaykindName() {
        return paykindName;
    }

    public void setPaykindName(String paykindName) {
        this.paykindName = paykindName == null ? null : paykindName.trim();
    }

    public String getPactCode() {
        return pactCode;
    }

    public void setPactCode(String pactCode) {
        this.pactCode = pactCode == null ? null : pactCode.trim();
    }

    public String getPactName() {
        return pactName;
    }

    public void setPactName(String pactName) {
        this.pactName = pactName == null ? null : pactName.trim();
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo == null ? null : mcardNo.trim();
    }

    public String getReglevlCode() {
        return reglevlCode;
    }

    public void setReglevlCode(String reglevlCode) {
        this.reglevlCode = reglevlCode == null ? null : reglevlCode.trim();
    }

    public String getReglevlName() {
        return reglevlName;
    }

    public void setReglevlName(String reglevlName) {
        this.reglevlName = reglevlName == null ? null : reglevlName.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getSchemaNo() {
        return schemaNo;
    }

    public void setSchemaNo(String schemaNo) {
        this.schemaNo = schemaNo == null ? null : schemaNo.trim();
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public Long getSeeno() {
        return seeno;
    }

    public void setSeeno(Long seeno) {
        this.seeno = seeno;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode == null ? null : doctCode.trim();
    }

    public String getDoctName() {
        return doctName;
    }

    public void setDoctName(String doctName) {
        this.doctName = doctName == null ? null : doctName.trim();
    }

    public String getYnregchrg() {
        return ynregchrg;
    }

    public void setYnregchrg(String ynregchrg) {
        this.ynregchrg = ynregchrg == null ? null : ynregchrg.trim();
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo == null ? null : recipeNo.trim();
    }

    public String getYnbook() {
        return ynbook;
    }

    public void setYnbook(String ynbook) {
        this.ynbook = ynbook == null ? null : ynbook.trim();
    }

    public String getYnfr() {
        return ynfr;
    }

    public void setYnfr(String ynfr) {
        this.ynfr = ynfr == null ? null : ynfr.trim();
    }

    public String getAppendFlag() {
        return appendFlag;
    }

    public void setAppendFlag(String appendFlag) {
        this.appendFlag = appendFlag == null ? null : appendFlag.trim();
    }

    public BigDecimal getRegFee() {
        return regFee;
    }

    public void setRegFee(BigDecimal regFee) {
        this.regFee = regFee;
    }

    public BigDecimal getChckFee() {
        return chckFee;
    }

    public void setChckFee(BigDecimal chckFee) {
        this.chckFee = chckFee;
    }

    public BigDecimal getDiagFee() {
        return diagFee;
    }

    public void setDiagFee(BigDecimal diagFee) {
        this.diagFee = diagFee;
    }

    public BigDecimal getOthFee() {
        return othFee;
    }

    public void setOthFee(BigDecimal othFee) {
        this.othFee = othFee;
    }

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    public BigDecimal getPubCost() {
        return pubCost;
    }

    public void setPubCost(BigDecimal pubCost) {
        this.pubCost = pubCost;
    }

    public BigDecimal getPayCost() {
        return payCost;
    }

    public void setPayCost(BigDecimal payCost) {
        this.payCost = payCost;
    }

    public String getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag == null ? null : validFlag.trim();
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode == null ? null : operCode.trim();
    }

    public Date getOperDate() {
        return operDate;
    }

    public void setOperDate(Date operDate) {
        this.operDate = operDate;
    }

    public String getCancelOpcd() {
        return cancelOpcd;
    }

    public void setCancelOpcd(String cancelOpcd) {
        this.cancelOpcd = cancelOpcd == null ? null : cancelOpcd.trim();
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getMedicalType() {
        return medicalType;
    }

    public void setMedicalType(String medicalType) {
        this.medicalType = medicalType == null ? null : medicalType.trim();
    }

    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode == null ? null : icdCode.trim();
    }

    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String examCode) {
        this.examCode = examCode == null ? null : examCode.trim();
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    public String getCheckFlag() {
        return checkFlag;
    }

    public void setCheckFlag(String checkFlag) {
        this.checkFlag = checkFlag == null ? null : checkFlag.trim();
    }

    public String getCheckOpcd() {
        return checkOpcd;
    }

    public void setCheckOpcd(String checkOpcd) {
        this.checkOpcd = checkOpcd == null ? null : checkOpcd.trim();
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getBalanceFlag() {
        return balanceFlag;
    }

    public void setBalanceFlag(String balanceFlag) {
        this.balanceFlag = balanceFlag == null ? null : balanceFlag.trim();
    }

    public String getBalanceNo() {
        return balanceNo;
    }

    public void setBalanceNo(String balanceNo) {
        this.balanceNo = balanceNo == null ? null : balanceNo.trim();
    }

    public String getBalanceOpcd() {
        return balanceOpcd;
    }

    public void setBalanceOpcd(String balanceOpcd) {
        this.balanceOpcd = balanceOpcd == null ? null : balanceOpcd.trim();
    }

    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }

    public String getYnsee() {
        return ynsee;
    }

    public void setYnsee(String ynsee) {
        this.ynsee = ynsee == null ? null : ynsee.trim();
    }

    public Date getSeeDate() {
        return seeDate;
    }

    public void setSeeDate(Date seeDate) {
        this.seeDate = seeDate;
    }

    public String getTriageFlag() {
        return triageFlag;
    }

    public void setTriageFlag(String triageFlag) {
        this.triageFlag = triageFlag == null ? null : triageFlag.trim();
    }

    public String getTriageOpcd() {
        return triageOpcd;
    }

    public void setTriageOpcd(String triageOpcd) {
        this.triageOpcd = triageOpcd == null ? null : triageOpcd.trim();
    }

    public Date getTriageDate() {
        return triageDate;
    }

    public void setTriageDate(Date triageDate) {
        this.triageDate = triageDate;
    }

    public Short getPrintInvoicecnt() {
        return printInvoicecnt;
    }

    public void setPrintInvoicecnt(Short printInvoicecnt) {
        this.printInvoicecnt = printInvoicecnt;
    }

    public String getSeeDpcd() {
        return seeDpcd;
    }

    public void setSeeDpcd(String seeDpcd) {
        this.seeDpcd = seeDpcd == null ? null : seeDpcd.trim();
    }

    public String getSeeDocd() {
        return seeDocd;
    }

    public void setSeeDocd(String seeDocd) {
        this.seeDocd = seeDocd == null ? null : seeDocd.trim();
    }

    public String getInSource() {
        return inSource;
    }

    public void setInSource(String inSource) {
        this.inSource = inSource == null ? null : inSource.trim();
    }

    public String getIsSendinhoscase() {
        return isSendinhoscase;
    }

    public void setIsSendinhoscase(String isSendinhoscase) {
        this.isSendinhoscase = isSendinhoscase == null ? null : isSendinhoscase.trim();
    }

    public String getIsEncryptname() {
        return isEncryptname;
    }

    public void setIsEncryptname(String isEncryptname) {
        this.isEncryptname = isEncryptname == null ? null : isEncryptname.trim();
    }

    public String getNormalname() {
        return normalname;
    }

    public void setNormalname(String normalname) {
        this.normalname = normalname == null ? null : normalname.trim();
    }

    public Date getInDate() {
        return inDate;
    }

    public void setInDate(Date inDate) {
        this.inDate = inDate;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }

    public String getZg() {
        return zg;
    }

    public void setZg(String zg) {
        this.zg = zg == null ? null : zg.trim();
    }

    public String getInState() {
        return inState;
    }

    public void setInState(String inState) {
        this.inState = inState == null ? null : inState.trim();
    }

    public BigDecimal getEcoCost() {
        return ecoCost;
    }

    public void setEcoCost(BigDecimal ecoCost) {
        this.ecoCost = ecoCost;
    }

    public String getIsAccount() {
        return isAccount;
    }

    public void setIsAccount(String isAccount) {
        this.isAccount = isAccount == null ? null : isAccount.trim();
    }

    public String getIsEmergency() {
        return isEmergency;
    }

    public void setIsEmergency(String isEmergency) {
        this.isEmergency = isEmergency == null ? null : isEmergency.trim();
    }

    public String getMark1() {
        return mark1;
    }

    public void setMark1(String mark1) {
        this.mark1 = mark1 == null ? null : mark1.trim();
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getSbp() {
        return sbp;
    }

    public void setSbp(BigDecimal sbp) {
        this.sbp = sbp;
    }

    public BigDecimal getDbp() {
        return dbp;
    }

    public void setDbp(BigDecimal dbp) {
        this.dbp = dbp;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public String getUpFlag() {
        return upFlag;
    }

    public void setUpFlag(String upFlag) {
        this.upFlag = upFlag == null ? null : upFlag.trim();
    }

    public BigDecimal getBloodglu() {
        return bloodglu;
    }

    public void setBloodglu(BigDecimal bloodglu) {
        this.bloodglu = bloodglu;
    }

    public String getCurrentCardtype() {
        return currentCardtype;
    }

    public void setCurrentCardtype(String currentCardtype) {
        this.currentCardtype = currentCardtype == null ? null : currentCardtype.trim();
    }

    public String getCurrentCard() {
        return currentCard;
    }

    public void setCurrentCard(String currentCard) {
        this.currentCard = currentCard == null ? null : currentCard.trim();
    }

    public BigDecimal getInTimes() {
        return inTimes;
    }

    public void setInTimes(BigDecimal inTimes) {
        this.inTimes = inTimes;
    }

    public Long getEmrRegid() {
        return emrRegid;
    }

    public void setEmrRegid(Long emrRegid) {
        this.emrRegid = emrRegid;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType == null ? null : patientType.trim();
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId == null ? null : bookId.trim();
    }

    public String getClass1desease() {
        return class1desease;
    }

    public void setClass1desease(String class1desease) {
        this.class1desease = class1desease == null ? null : class1desease.trim();
    }

    public String getClass2desease() {
        return class2desease;
    }

    public void setClass2desease(String class2desease) {
        this.class2desease = class2desease == null ? null : class2desease.trim();
    }

    public String getIsDirectfee() {
        return isDirectfee;
    }

    public void setIsDirectfee(String isDirectfee) {
        this.isDirectfee = isDirectfee == null ? null : isDirectfee.trim();
    }

    public String getRealDoctCode() {
        return realDoctCode;
    }

    public void setRealDoctCode(String realDoctCode) {
        this.realDoctCode = realDoctCode == null ? null : realDoctCode.trim();
    }

    public String getRealDoctName() {
        return realDoctName;
    }

    public void setRealDoctName(String realDoctName) {
        this.realDoctName = realDoctName == null ? null : realDoctName.trim();
    }

    public String getHospitalFirstVisit() {
        return hospitalFirstVisit;
    }

    public void setHospitalFirstVisit(String hospitalFirstVisit) {
        this.hospitalFirstVisit = hospitalFirstVisit == null ? null : hospitalFirstVisit.trim();
    }

    public String getRootdeptFirstVisit() {
        return rootdeptFirstVisit;
    }

    public void setRootdeptFirstVisit(String rootdeptFirstVisit) {
        this.rootdeptFirstVisit = rootdeptFirstVisit == null ? null : rootdeptFirstVisit.trim();
    }

    public String getDoctFirstVisit() {
        return doctFirstVisit;
    }

    public void setDoctFirstVisit(String doctFirstVisit) {
        this.doctFirstVisit = doctFirstVisit == null ? null : doctFirstVisit.trim();
    }

    @Override
    public String toString() {
        return "FinOprRegister{" +
                "cardNo='" + cardNo + '\'' +
                ", regDate=" + regDate +
                ", noonCode='" + noonCode + '\'' +
                ", name='" + name + '\'' +
                ", idenno='" + idenno + '\'' +
                ", sexCode='" + sexCode + '\'' +
                ", birthday=" + birthday +
                ", relaPhone='" + relaPhone + '\'' +
                ", address='" + address + '\'' +
                ", cardType='" + cardType + '\'' +
                ", paykindCode='" + paykindCode + '\'' +
                ", paykindName='" + paykindName + '\'' +
                ", pactCode='" + pactCode + '\'' +
                ", pactName='" + pactName + '\'' +
                ", mcardNo='" + mcardNo + '\'' +
                ", reglevlCode='" + reglevlCode + '\'' +
                ", reglevlName='" + reglevlName + '\'' +
                ", deptCode='" + deptCode + '\'' +
                ", deptName='" + deptName + '\'' +
                ", schemaNo='" + schemaNo + '\'' +
                ", orderNo=" + orderNo +
                ", seeno=" + seeno +
                ", beginTime=" + beginTime +
                ", endTime=" + endTime +
                ", doctCode='" + doctCode + '\'' +
                ", doctName='" + doctName + '\'' +
                ", ynregchrg='" + ynregchrg + '\'' +
                ", invoiceNo='" + invoiceNo + '\'' +
                ", recipeNo='" + recipeNo + '\'' +
                ", ynbook='" + ynbook + '\'' +
                ", ynfr='" + ynfr + '\'' +
                ", appendFlag='" + appendFlag + '\'' +
                ", regFee=" + regFee +
                ", chckFee=" + chckFee +
                ", diagFee=" + diagFee +
                ", othFee=" + othFee +
                ", ownCost=" + ownCost +
                ", pubCost=" + pubCost +
                ", payCost=" + payCost +
                ", validFlag='" + validFlag + '\'' +
                ", operCode='" + operCode + '\'' +
                ", operDate=" + operDate +
                ", cancelOpcd='" + cancelOpcd + '\'' +
                ", cancelDate=" + cancelDate +
                ", medicalType='" + medicalType + '\'' +
                ", icdCode='" + icdCode + '\'' +
                ", examCode='" + examCode + '\'' +
                ", examDate=" + examDate +
                ", checkFlag='" + checkFlag + '\'' +
                ", checkOpcd='" + checkOpcd + '\'' +
                ", checkDate=" + checkDate +
                ", balanceFlag='" + balanceFlag + '\'' +
                ", balanceNo='" + balanceNo + '\'' +
                ", balanceOpcd='" + balanceOpcd + '\'' +
                ", balanceDate=" + balanceDate +
                ", ynsee='" + ynsee + '\'' +
                ", seeDate=" + seeDate +
                ", triageFlag='" + triageFlag + '\'' +
                ", triageOpcd='" + triageOpcd + '\'' +
                ", triageDate=" + triageDate +
                ", printInvoicecnt=" + printInvoicecnt +
                ", seeDpcd='" + seeDpcd + '\'' +
                ", seeDocd='" + seeDocd + '\'' +
                ", inSource='" + inSource + '\'' +
                ", isSendinhoscase='" + isSendinhoscase + '\'' +
                ", isEncryptname='" + isEncryptname + '\'' +
                ", normalname='" + normalname + '\'' +
                ", inDate=" + inDate +
                ", outDate=" + outDate +
                ", zg='" + zg + '\'' +
                ", inState='" + inState + '\'' +
                ", ecoCost=" + ecoCost +
                ", isAccount='" + isAccount + '\'' +
                ", isEmergency='" + isEmergency + '\'' +
                ", mark1='" + mark1 + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", sbp=" + sbp +
                ", dbp=" + dbp +
                ", temperature=" + temperature +
                ", upFlag='" + upFlag + '\'' +
                ", bloodglu=" + bloodglu +
                ", currentCardtype='" + currentCardtype + '\'' +
                ", currentCard='" + currentCard + '\'' +
                ", inTimes=" + inTimes +
                ", emrRegid=" + emrRegid +
                ", patientType='" + patientType + '\'' +
                ", bookId='" + bookId + '\'' +
                ", class1desease='" + class1desease + '\'' +
                ", class2desease='" + class2desease + '\'' +
                ", isDirectfee='" + isDirectfee + '\'' +
                ", realDoctCode='" + realDoctCode + '\'' +
                ", realDoctName='" + realDoctName + '\'' +
                ", hospitalFirstVisit='" + hospitalFirstVisit + '\'' +
                ", rootdeptFirstVisit='" + rootdeptFirstVisit + '\'' +
                ", doctFirstVisit='" + doctFirstVisit + '\'' +
                '}';
    }
}