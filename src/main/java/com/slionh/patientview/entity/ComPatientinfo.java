package com.slionh.patientview.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ComPatientinfo extends ComPatientinfoKey {
    private String icCardno;

    private String name;

    private String spellCode;

    private String wbCode;

    private Date birthday;

    private String sexCode;

    private String idenno;

    private String bloodCode;

    private String profCode;

    private String workHome;

    private String workTel;

    private String workZip;

    private String home;

    private String homeTel;

    private String homeZip;

    private String district;

    private String nationCode;

    private String linkmanName;

    private String linkmanTel;

    private String linkmanAdd;

    private String relaCode;

    private String mari;

    private String counCode;

    private String paykindCode;

    private String paykindName;

    private String pactCode;

    private String pactName;

    private String mcardNo;

    private String areaCode;

    private BigDecimal framt;

    private String anaphyFlag;

    private String hepatitisFlag;

    private String actCode;

    private BigDecimal actAmt;

    private BigDecimal lactSum;

    private BigDecimal lbankSum;

    private Short arrearTimes;

    private BigDecimal arrearSum;

    private String inhosSource;

    private Date lihosDate;

    private Short inhosTimes;

    private Date louthosDate;

    private Date firSeeDate;

    private Date lregDate;

    private Short disobyCnt;

    private Date endDate;

    private String mark;

    private String operCode;

    private Date operDate;

    private String isValid;

    private String feeKind;

    private String oldCardno;

    private String isEncryptname;

    private String normalname;

    private String idcardtype;

    private String vipFlag;

    private String montherName;

    private String isTreatment;

    private String caseNo;

    private String insuranceId;

    private String insuranceName;

    private String homeDoorNo;

    private String linkmanDoorNo;

    private String email;

    private Long emrPatid;

    private String homeNow;

    private String familyCode;

    private String otherCardno;

    private String serviceCode;

    private String serviceName;

    private String patientSourceno;

    private String referralPerson;

    private String channelCode;

    private String familyName;

    private String bicompanyid;

    private String bicompanyname;

    private String crmid;

    private String channel1code;

    private String channel1;

    private String channel2code;

    private String channel2;

    private String channel3code;

    private String channel3;

    private String clientmanager;

    private String consultmanager;

    private String sellmanager;

    private String bcsellmanager;

    private String childflag;

    private String packageflag;

    private String familyid;

    private String familyname;

    private String familyroleid;

    private String familyrolename;

    public ComPatientinfo(String cardNo, String hospitalId, String icCardno, String name, String spellCode, String wbCode, Date birthday, String sexCode, String idenno, String bloodCode, String profCode, String workHome, String workTel, String workZip, String home, String homeTel, String homeZip, String district, String nationCode, String linkmanName, String linkmanTel, String linkmanAdd, String relaCode, String mari, String counCode, String paykindCode, String paykindName, String pactCode, String pactName, String mcardNo, String areaCode, BigDecimal framt, String anaphyFlag, String hepatitisFlag, String actCode, BigDecimal actAmt, BigDecimal lactSum, BigDecimal lbankSum, Short arrearTimes, BigDecimal arrearSum, String inhosSource, Date lihosDate, Short inhosTimes, Date louthosDate, Date firSeeDate, Date lregDate, Short disobyCnt, Date endDate, String mark, String operCode, Date operDate, String isValid, String feeKind, String oldCardno, String isEncryptname, String normalname, String idcardtype, String vipFlag, String montherName, String isTreatment, String caseNo, String insuranceId, String insuranceName, String homeDoorNo, String linkmanDoorNo, String email, Long emrPatid, String homeNow, String familyCode, String otherCardno, String serviceCode, String serviceName, String patientSourceno, String referralPerson, String channelCode, String familyName, String bicompanyid, String bicompanyname, String crmid, String channel1code, String channel1, String channel2code, String channel2, String channel3code, String channel3, String clientmanager, String consultmanager, String sellmanager, String bcsellmanager, String childflag, String packageflag, String familyid, String familyname, String familyroleid, String familyrolename) {
        super(cardNo, hospitalId);
        this.icCardno = icCardno;
        this.name = name;
        this.spellCode = spellCode;
        this.wbCode = wbCode;
        this.birthday = birthday;
        this.sexCode = sexCode;
        this.idenno = idenno;
        this.bloodCode = bloodCode;
        this.profCode = profCode;
        this.workHome = workHome;
        this.workTel = workTel;
        this.workZip = workZip;
        this.home = home;
        this.homeTel = homeTel;
        this.homeZip = homeZip;
        this.district = district;
        this.nationCode = nationCode;
        this.linkmanName = linkmanName;
        this.linkmanTel = linkmanTel;
        this.linkmanAdd = linkmanAdd;
        this.relaCode = relaCode;
        this.mari = mari;
        this.counCode = counCode;
        this.paykindCode = paykindCode;
        this.paykindName = paykindName;
        this.pactCode = pactCode;
        this.pactName = pactName;
        this.mcardNo = mcardNo;
        this.areaCode = areaCode;
        this.framt = framt;
        this.anaphyFlag = anaphyFlag;
        this.hepatitisFlag = hepatitisFlag;
        this.actCode = actCode;
        this.actAmt = actAmt;
        this.lactSum = lactSum;
        this.lbankSum = lbankSum;
        this.arrearTimes = arrearTimes;
        this.arrearSum = arrearSum;
        this.inhosSource = inhosSource;
        this.lihosDate = lihosDate;
        this.inhosTimes = inhosTimes;
        this.louthosDate = louthosDate;
        this.firSeeDate = firSeeDate;
        this.lregDate = lregDate;
        this.disobyCnt = disobyCnt;
        this.endDate = endDate;
        this.mark = mark;
        this.operCode = operCode;
        this.operDate = operDate;
        this.isValid = isValid;
        this.feeKind = feeKind;
        this.oldCardno = oldCardno;
        this.isEncryptname = isEncryptname;
        this.normalname = normalname;
        this.idcardtype = idcardtype;
        this.vipFlag = vipFlag;
        this.montherName = montherName;
        this.isTreatment = isTreatment;
        this.caseNo = caseNo;
        this.insuranceId = insuranceId;
        this.insuranceName = insuranceName;
        this.homeDoorNo = homeDoorNo;
        this.linkmanDoorNo = linkmanDoorNo;
        this.email = email;
        this.emrPatid = emrPatid;
        this.homeNow = homeNow;
        this.familyCode = familyCode;
        this.otherCardno = otherCardno;
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.patientSourceno = patientSourceno;
        this.referralPerson = referralPerson;
        this.channelCode = channelCode;
        this.familyName = familyName;
        this.bicompanyid = bicompanyid;
        this.bicompanyname = bicompanyname;
        this.crmid = crmid;
        this.channel1code = channel1code;
        this.channel1 = channel1;
        this.channel2code = channel2code;
        this.channel2 = channel2;
        this.channel3code = channel3code;
        this.channel3 = channel3;
        this.clientmanager = clientmanager;
        this.consultmanager = consultmanager;
        this.sellmanager = sellmanager;
        this.bcsellmanager = bcsellmanager;
        this.childflag = childflag;
        this.packageflag = packageflag;
        this.familyid = familyid;
        this.familyname = familyname;
        this.familyroleid = familyroleid;
        this.familyrolename = familyrolename;
    }

    public ComPatientinfo() {
        super();
    }

    public String getIcCardno() {
        return icCardno;
    }

    public void setIcCardno(String icCardno) {
        this.icCardno = icCardno == null ? null : icCardno.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSpellCode() {
        return spellCode;
    }

    public void setSpellCode(String spellCode) {
        this.spellCode = spellCode == null ? null : spellCode.trim();
    }

    public String getWbCode() {
        return wbCode;
    }

    public void setWbCode(String wbCode) {
        this.wbCode = wbCode == null ? null : wbCode.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode == null ? null : sexCode.trim();
    }

    public String getIdenno() {
        return idenno;
    }

    public void setIdenno(String idenno) {
        this.idenno = idenno == null ? null : idenno.trim();
    }

    public String getBloodCode() {
        return bloodCode;
    }

    public void setBloodCode(String bloodCode) {
        this.bloodCode = bloodCode == null ? null : bloodCode.trim();
    }

    public String getProfCode() {
        return profCode;
    }

    public void setProfCode(String profCode) {
        this.profCode = profCode == null ? null : profCode.trim();
    }

    public String getWorkHome() {
        return workHome;
    }

    public void setWorkHome(String workHome) {
        this.workHome = workHome == null ? null : workHome.trim();
    }

    public String getWorkTel() {
        return workTel;
    }

    public void setWorkTel(String workTel) {
        this.workTel = workTel == null ? null : workTel.trim();
    }

    public String getWorkZip() {
        return workZip;
    }

    public void setWorkZip(String workZip) {
        this.workZip = workZip == null ? null : workZip.trim();
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home == null ? null : home.trim();
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel == null ? null : homeTel.trim();
    }

    public String getHomeZip() {
        return homeZip;
    }

    public void setHomeZip(String homeZip) {
        this.homeZip = homeZip == null ? null : homeZip.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode == null ? null : nationCode.trim();
    }

    public String getLinkmanName() {
        return linkmanName;
    }

    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName == null ? null : linkmanName.trim();
    }

    public String getLinkmanTel() {
        return linkmanTel;
    }

    public void setLinkmanTel(String linkmanTel) {
        this.linkmanTel = linkmanTel == null ? null : linkmanTel.trim();
    }

    public String getLinkmanAdd() {
        return linkmanAdd;
    }

    public void setLinkmanAdd(String linkmanAdd) {
        this.linkmanAdd = linkmanAdd == null ? null : linkmanAdd.trim();
    }

    public String getRelaCode() {
        return relaCode;
    }

    public void setRelaCode(String relaCode) {
        this.relaCode = relaCode == null ? null : relaCode.trim();
    }

    public String getMari() {
        return mari;
    }

    public void setMari(String mari) {
        this.mari = mari == null ? null : mari.trim();
    }

    public String getCounCode() {
        return counCode;
    }

    public void setCounCode(String counCode) {
        this.counCode = counCode == null ? null : counCode.trim();
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

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public BigDecimal getFramt() {
        return framt;
    }

    public void setFramt(BigDecimal framt) {
        this.framt = framt;
    }

    public String getAnaphyFlag() {
        return anaphyFlag;
    }

    public void setAnaphyFlag(String anaphyFlag) {
        this.anaphyFlag = anaphyFlag == null ? null : anaphyFlag.trim();
    }

    public String getHepatitisFlag() {
        return hepatitisFlag;
    }

    public void setHepatitisFlag(String hepatitisFlag) {
        this.hepatitisFlag = hepatitisFlag == null ? null : hepatitisFlag.trim();
    }

    public String getActCode() {
        return actCode;
    }

    public void setActCode(String actCode) {
        this.actCode = actCode == null ? null : actCode.trim();
    }

    public BigDecimal getActAmt() {
        return actAmt;
    }

    public void setActAmt(BigDecimal actAmt) {
        this.actAmt = actAmt;
    }

    public BigDecimal getLactSum() {
        return lactSum;
    }

    public void setLactSum(BigDecimal lactSum) {
        this.lactSum = lactSum;
    }

    public BigDecimal getLbankSum() {
        return lbankSum;
    }

    public void setLbankSum(BigDecimal lbankSum) {
        this.lbankSum = lbankSum;
    }

    public Short getArrearTimes() {
        return arrearTimes;
    }

    public void setArrearTimes(Short arrearTimes) {
        this.arrearTimes = arrearTimes;
    }

    public BigDecimal getArrearSum() {
        return arrearSum;
    }

    public void setArrearSum(BigDecimal arrearSum) {
        this.arrearSum = arrearSum;
    }

    public String getInhosSource() {
        return inhosSource;
    }

    public void setInhosSource(String inhosSource) {
        this.inhosSource = inhosSource == null ? null : inhosSource.trim();
    }

    public Date getLihosDate() {
        return lihosDate;
    }

    public void setLihosDate(Date lihosDate) {
        this.lihosDate = lihosDate;
    }

    public Short getInhosTimes() {
        return inhosTimes;
    }

    public void setInhosTimes(Short inhosTimes) {
        this.inhosTimes = inhosTimes;
    }

    public Date getLouthosDate() {
        return louthosDate;
    }

    public void setLouthosDate(Date louthosDate) {
        this.louthosDate = louthosDate;
    }

    public Date getFirSeeDate() {
        return firSeeDate;
    }

    public void setFirSeeDate(Date firSeeDate) {
        this.firSeeDate = firSeeDate;
    }

    public Date getLregDate() {
        return lregDate;
    }

    public void setLregDate(Date lregDate) {
        this.lregDate = lregDate;
    }

    public Short getDisobyCnt() {
        return disobyCnt;
    }

    public void setDisobyCnt(Short disobyCnt) {
        this.disobyCnt = disobyCnt;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
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

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }

    public String getFeeKind() {
        return feeKind;
    }

    public void setFeeKind(String feeKind) {
        this.feeKind = feeKind == null ? null : feeKind.trim();
    }

    public String getOldCardno() {
        return oldCardno;
    }

    public void setOldCardno(String oldCardno) {
        this.oldCardno = oldCardno == null ? null : oldCardno.trim();
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

    public String getIdcardtype() {
        return idcardtype;
    }

    public void setIdcardtype(String idcardtype) {
        this.idcardtype = idcardtype == null ? null : idcardtype.trim();
    }

    public String getVipFlag() {
        return vipFlag;
    }

    public void setVipFlag(String vipFlag) {
        this.vipFlag = vipFlag == null ? null : vipFlag.trim();
    }

    public String getMontherName() {
        return montherName;
    }

    public void setMontherName(String montherName) {
        this.montherName = montherName == null ? null : montherName.trim();
    }

    public String getIsTreatment() {
        return isTreatment;
    }

    public void setIsTreatment(String isTreatment) {
        this.isTreatment = isTreatment == null ? null : isTreatment.trim();
    }

    public String getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo == null ? null : caseNo.trim();
    }

    public String getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(String insuranceId) {
        this.insuranceId = insuranceId == null ? null : insuranceId.trim();
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName == null ? null : insuranceName.trim();
    }

    public String getHomeDoorNo() {
        return homeDoorNo;
    }

    public void setHomeDoorNo(String homeDoorNo) {
        this.homeDoorNo = homeDoorNo == null ? null : homeDoorNo.trim();
    }

    public String getLinkmanDoorNo() {
        return linkmanDoorNo;
    }

    public void setLinkmanDoorNo(String linkmanDoorNo) {
        this.linkmanDoorNo = linkmanDoorNo == null ? null : linkmanDoorNo.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Long getEmrPatid() {
        return emrPatid;
    }

    public void setEmrPatid(Long emrPatid) {
        this.emrPatid = emrPatid;
    }

    public String getHomeNow() {
        return homeNow;
    }

    public void setHomeNow(String homeNow) {
        this.homeNow = homeNow == null ? null : homeNow.trim();
    }

    public String getFamilyCode() {
        return familyCode;
    }

    public void setFamilyCode(String familyCode) {
        this.familyCode = familyCode == null ? null : familyCode.trim();
    }

    public String getOtherCardno() {
        return otherCardno;
    }

    public void setOtherCardno(String otherCardno) {
        this.otherCardno = otherCardno == null ? null : otherCardno.trim();
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode == null ? null : serviceCode.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public String getPatientSourceno() {
        return patientSourceno;
    }

    public void setPatientSourceno(String patientSourceno) {
        this.patientSourceno = patientSourceno == null ? null : patientSourceno.trim();
    }

    public String getReferralPerson() {
        return referralPerson;
    }

    public void setReferralPerson(String referralPerson) {
        this.referralPerson = referralPerson == null ? null : referralPerson.trim();
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode == null ? null : channelCode.trim();
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName == null ? null : familyName.trim();
    }

    public String getBicompanyid() {
        return bicompanyid;
    }

    public void setBicompanyid(String bicompanyid) {
        this.bicompanyid = bicompanyid == null ? null : bicompanyid.trim();
    }

    public String getBicompanyname() {
        return bicompanyname;
    }

    public void setBicompanyname(String bicompanyname) {
        this.bicompanyname = bicompanyname == null ? null : bicompanyname.trim();
    }

    public String getCrmid() {
        return crmid;
    }

    public void setCrmid(String crmid) {
        this.crmid = crmid == null ? null : crmid.trim();
    }

    public String getChannel1code() {
        return channel1code;
    }

    public void setChannel1code(String channel1code) {
        this.channel1code = channel1code == null ? null : channel1code.trim();
    }

    public String getChannel1() {
        return channel1;
    }

    public void setChannel1(String channel1) {
        this.channel1 = channel1 == null ? null : channel1.trim();
    }

    public String getChannel2code() {
        return channel2code;
    }

    public void setChannel2code(String channel2code) {
        this.channel2code = channel2code == null ? null : channel2code.trim();
    }

    public String getChannel2() {
        return channel2;
    }

    public void setChannel2(String channel2) {
        this.channel2 = channel2 == null ? null : channel2.trim();
    }

    public String getChannel3code() {
        return channel3code;
    }

    public void setChannel3code(String channel3code) {
        this.channel3code = channel3code == null ? null : channel3code.trim();
    }

    public String getChannel3() {
        return channel3;
    }

    public void setChannel3(String channel3) {
        this.channel3 = channel3 == null ? null : channel3.trim();
    }

    public String getClientmanager() {
        return clientmanager;
    }

    public void setClientmanager(String clientmanager) {
        this.clientmanager = clientmanager == null ? null : clientmanager.trim();
    }

    public String getConsultmanager() {
        return consultmanager;
    }

    public void setConsultmanager(String consultmanager) {
        this.consultmanager = consultmanager == null ? null : consultmanager.trim();
    }

    public String getSellmanager() {
        return sellmanager;
    }

    public void setSellmanager(String sellmanager) {
        this.sellmanager = sellmanager == null ? null : sellmanager.trim();
    }

    public String getBcsellmanager() {
        return bcsellmanager;
    }

    public void setBcsellmanager(String bcsellmanager) {
        this.bcsellmanager = bcsellmanager == null ? null : bcsellmanager.trim();
    }

    public String getChildflag() {
        return childflag;
    }

    public void setChildflag(String childflag) {
        this.childflag = childflag == null ? null : childflag.trim();
    }

    public String getPackageflag() {
        return packageflag;
    }

    public void setPackageflag(String packageflag) {
        this.packageflag = packageflag == null ? null : packageflag.trim();
    }

    public String getFamilyid() {
        return familyid;
    }

    public void setFamilyid(String familyid) {
        this.familyid = familyid == null ? null : familyid.trim();
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname == null ? null : familyname.trim();
    }

    public String getFamilyroleid() {
        return familyroleid;
    }

    public void setFamilyroleid(String familyroleid) {
        this.familyroleid = familyroleid == null ? null : familyroleid.trim();
    }

    public String getFamilyrolename() {
        return familyrolename;
    }

    public void setFamilyrolename(String familyrolename) {
        this.familyrolename = familyrolename == null ? null : familyrolename.trim();
    }
}