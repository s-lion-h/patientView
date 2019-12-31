package com.slionh.patientview.entity;

import java.math.BigDecimal;
import java.util.Date;

public class BdCrmPatient {
    private String patientid;

    private String cardno;

    private String name;

    private String engname;

    private String spell;

    private String wbspell;

    private String sex;

    private Date birthday;

    private String idtype;

    private String idno;

    private String phone;

    private String job;

    private String email;

    private String wechat;

    private String province;

    private String city;

    private String address;

    private String patientlevel;

    private String patienttype;

    private String channel1;

    private String channel2;

    private String channel3;

    private Integer delivertimes;

    private Date expectedtime;

    private String clientmanager;

    private String consultmanager;

    private String cmanager;

    private String sellmanager;

    private String memo;

    private String othermemo;

    private Date firstvisittime;

    private Date lastvisitime;

    private BigDecimal totcost;

    private BigDecimal integration;

    private String extfield01;

    private String extfield02;

    private String extfield03;

    private String hospitalid;

    private String hospitalname;

    private Date createtime;

    private String createoper;

    private Date lastmodifiytime;

    private String lastmodifiyoperid;

    private String lastmodifiyopername;

    private String validflag;

    private String sexcode;

    private String idtypecode;

    private String childflag;

    private String guardian1;

    private String guardian1phone;

    private String guardian2;

    private String guardian2phone;

    private String patientlevelcode;

    private String patienttypecode;

    private String channel1code;

    private String channel2code;

    private String channel3code;

    private String bcsellmanager;

    private String memo2;

    private String createopername;

    private String guardianinfo1id;

    private String guardianinfo1name;

    private String guardianinfo2id;

    private String guardianinfo2name;

    private String introducerid;

    private String introducername;

    private String mmwyflag;

    private String mmwyeventid;

    private String mmwyeventname;

    private String patientlabel;

    private String mmwyid;

    private String packageflag;

    private Date deliverydate;

    private String familyid;

    private String familyname;

    private String roleid;

    private String rolename;

    private String channel4code;

    private String channel4;

    private String ghcflag;

    private String ghcclientmanagerid;

    private String ghcclientmanagername;

    private String mmwyregistertype;

    private String mmwysharerole;

    private String clientwechatadd;

    private String consultwechatadd;

    public BdCrmPatient(String patientid, String cardno, String name, String engname, String spell, String wbspell, String sex, Date birthday, String idtype, String idno, String phone, String job, String email, String wechat, String province, String city, String address, String patientlevel, String patienttype, String channel1, String channel2, String channel3, Integer delivertimes, Date expectedtime, String clientmanager, String consultmanager, String cmanager, String sellmanager, String memo, String othermemo, Date firstvisittime, Date lastvisitime, BigDecimal totcost, BigDecimal integration, String extfield01, String extfield02, String extfield03, String hospitalid, String hospitalname, Date createtime, String createoper, Date lastmodifiytime, String lastmodifiyoperid, String lastmodifiyopername, String validflag, String sexcode, String idtypecode, String childflag, String guardian1, String guardian1phone, String guardian2, String guardian2phone, String patientlevelcode, String patienttypecode, String channel1code, String channel2code, String channel3code, String bcsellmanager, String memo2, String createopername, String guardianinfo1id, String guardianinfo1name, String guardianinfo2id, String guardianinfo2name, String introducerid, String introducername, String mmwyflag, String mmwyeventid, String mmwyeventname, String patientlabel, String mmwyid, String packageflag, Date deliverydate, String familyid, String familyname, String roleid, String rolename, String channel4code, String channel4, String ghcflag, String ghcclientmanagerid, String ghcclientmanagername, String mmwyregistertype, String mmwysharerole, String clientwechatadd, String consultwechatadd) {
        this.patientid = patientid;
        this.cardno = cardno;
        this.name = name;
        this.engname = engname;
        this.spell = spell;
        this.wbspell = wbspell;
        this.sex = sex;
        this.birthday = birthday;
        this.idtype = idtype;
        this.idno = idno;
        this.phone = phone;
        this.job = job;
        this.email = email;
        this.wechat = wechat;
        this.province = province;
        this.city = city;
        this.address = address;
        this.patientlevel = patientlevel;
        this.patienttype = patienttype;
        this.channel1 = channel1;
        this.channel2 = channel2;
        this.channel3 = channel3;
        this.delivertimes = delivertimes;
        this.expectedtime = expectedtime;
        this.clientmanager = clientmanager;
        this.consultmanager = consultmanager;
        this.cmanager = cmanager;
        this.sellmanager = sellmanager;
        this.memo = memo;
        this.othermemo = othermemo;
        this.firstvisittime = firstvisittime;
        this.lastvisitime = lastvisitime;
        this.totcost = totcost;
        this.integration = integration;
        this.extfield01 = extfield01;
        this.extfield02 = extfield02;
        this.extfield03 = extfield03;
        this.hospitalid = hospitalid;
        this.hospitalname = hospitalname;
        this.createtime = createtime;
        this.createoper = createoper;
        this.lastmodifiytime = lastmodifiytime;
        this.lastmodifiyoperid = lastmodifiyoperid;
        this.lastmodifiyopername = lastmodifiyopername;
        this.validflag = validflag;
        this.sexcode = sexcode;
        this.idtypecode = idtypecode;
        this.childflag = childflag;
        this.guardian1 = guardian1;
        this.guardian1phone = guardian1phone;
        this.guardian2 = guardian2;
        this.guardian2phone = guardian2phone;
        this.patientlevelcode = patientlevelcode;
        this.patienttypecode = patienttypecode;
        this.channel1code = channel1code;
        this.channel2code = channel2code;
        this.channel3code = channel3code;
        this.bcsellmanager = bcsellmanager;
        this.memo2 = memo2;
        this.createopername = createopername;
        this.guardianinfo1id = guardianinfo1id;
        this.guardianinfo1name = guardianinfo1name;
        this.guardianinfo2id = guardianinfo2id;
        this.guardianinfo2name = guardianinfo2name;
        this.introducerid = introducerid;
        this.introducername = introducername;
        this.mmwyflag = mmwyflag;
        this.mmwyeventid = mmwyeventid;
        this.mmwyeventname = mmwyeventname;
        this.patientlabel = patientlabel;
        this.mmwyid = mmwyid;
        this.packageflag = packageflag;
        this.deliverydate = deliverydate;
        this.familyid = familyid;
        this.familyname = familyname;
        this.roleid = roleid;
        this.rolename = rolename;
        this.channel4code = channel4code;
        this.channel4 = channel4;
        this.ghcflag = ghcflag;
        this.ghcclientmanagerid = ghcclientmanagerid;
        this.ghcclientmanagername = ghcclientmanagername;
        this.mmwyregistertype = mmwyregistertype;
        this.mmwysharerole = mmwysharerole;
        this.clientwechatadd = clientwechatadd;
        this.consultwechatadd = consultwechatadd;
    }

    public BdCrmPatient() {
        super();
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid == null ? null : patientid.trim();
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEngname() {
        return engname;
    }

    public void setEngname(String engname) {
        this.engname = engname == null ? null : engname.trim();
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell == null ? null : spell.trim();
    }

    public String getWbspell() {
        return wbspell;
    }

    public void setWbspell(String wbspell) {
        this.wbspell = wbspell == null ? null : wbspell.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype == null ? null : idtype.trim();
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPatientlevel() {
        return patientlevel;
    }

    public void setPatientlevel(String patientlevel) {
        this.patientlevel = patientlevel == null ? null : patientlevel.trim();
    }

    public String getPatienttype() {
        return patienttype;
    }

    public void setPatienttype(String patienttype) {
        this.patienttype = patienttype == null ? null : patienttype.trim();
    }

    public String getChannel1() {
        return channel1;
    }

    public void setChannel1(String channel1) {
        this.channel1 = channel1 == null ? null : channel1.trim();
    }

    public String getChannel2() {
        return channel2;
    }

    public void setChannel2(String channel2) {
        this.channel2 = channel2 == null ? null : channel2.trim();
    }

    public String getChannel3() {
        return channel3;
    }

    public void setChannel3(String channel3) {
        this.channel3 = channel3 == null ? null : channel3.trim();
    }

    public Integer getDelivertimes() {
        return delivertimes;
    }

    public void setDelivertimes(Integer delivertimes) {
        this.delivertimes = delivertimes;
    }

    public Date getExpectedtime() {
        return expectedtime;
    }

    public void setExpectedtime(Date expectedtime) {
        this.expectedtime = expectedtime;
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

    public String getCmanager() {
        return cmanager;
    }

    public void setCmanager(String cmanager) {
        this.cmanager = cmanager == null ? null : cmanager.trim();
    }

    public String getSellmanager() {
        return sellmanager;
    }

    public void setSellmanager(String sellmanager) {
        this.sellmanager = sellmanager == null ? null : sellmanager.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getOthermemo() {
        return othermemo;
    }

    public void setOthermemo(String othermemo) {
        this.othermemo = othermemo == null ? null : othermemo.trim();
    }

    public Date getFirstvisittime() {
        return firstvisittime;
    }

    public void setFirstvisittime(Date firstvisittime) {
        this.firstvisittime = firstvisittime;
    }

    public Date getLastvisitime() {
        return lastvisitime;
    }

    public void setLastvisitime(Date lastvisitime) {
        this.lastvisitime = lastvisitime;
    }

    public BigDecimal getTotcost() {
        return totcost;
    }

    public void setTotcost(BigDecimal totcost) {
        this.totcost = totcost;
    }

    public BigDecimal getIntegration() {
        return integration;
    }

    public void setIntegration(BigDecimal integration) {
        this.integration = integration;
    }

    public String getExtfield01() {
        return extfield01;
    }

    public void setExtfield01(String extfield01) {
        this.extfield01 = extfield01 == null ? null : extfield01.trim();
    }

    public String getExtfield02() {
        return extfield02;
    }

    public void setExtfield02(String extfield02) {
        this.extfield02 = extfield02 == null ? null : extfield02.trim();
    }

    public String getExtfield03() {
        return extfield03;
    }

    public void setExtfield03(String extfield03) {
        this.extfield03 = extfield03 == null ? null : extfield03.trim();
    }

    public String getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(String hospitalid) {
        this.hospitalid = hospitalid == null ? null : hospitalid.trim();
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname == null ? null : hospitalname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateoper() {
        return createoper;
    }

    public void setCreateoper(String createoper) {
        this.createoper = createoper == null ? null : createoper.trim();
    }

    public Date getLastmodifiytime() {
        return lastmodifiytime;
    }

    public void setLastmodifiytime(Date lastmodifiytime) {
        this.lastmodifiytime = lastmodifiytime;
    }

    public String getLastmodifiyoperid() {
        return lastmodifiyoperid;
    }

    public void setLastmodifiyoperid(String lastmodifiyoperid) {
        this.lastmodifiyoperid = lastmodifiyoperid == null ? null : lastmodifiyoperid.trim();
    }

    public String getLastmodifiyopername() {
        return lastmodifiyopername;
    }

    public void setLastmodifiyopername(String lastmodifiyopername) {
        this.lastmodifiyopername = lastmodifiyopername == null ? null : lastmodifiyopername.trim();
    }

    public String getValidflag() {
        return validflag;
    }

    public void setValidflag(String validflag) {
        this.validflag = validflag == null ? null : validflag.trim();
    }

    public String getSexcode() {
        return sexcode;
    }

    public void setSexcode(String sexcode) {
        this.sexcode = sexcode == null ? null : sexcode.trim();
    }

    public String getIdtypecode() {
        return idtypecode;
    }

    public void setIdtypecode(String idtypecode) {
        this.idtypecode = idtypecode == null ? null : idtypecode.trim();
    }

    public String getChildflag() {
        return childflag;
    }

    public void setChildflag(String childflag) {
        this.childflag = childflag == null ? null : childflag.trim();
    }

    public String getGuardian1() {
        return guardian1;
    }

    public void setGuardian1(String guardian1) {
        this.guardian1 = guardian1 == null ? null : guardian1.trim();
    }

    public String getGuardian1phone() {
        return guardian1phone;
    }

    public void setGuardian1phone(String guardian1phone) {
        this.guardian1phone = guardian1phone == null ? null : guardian1phone.trim();
    }

    public String getGuardian2() {
        return guardian2;
    }

    public void setGuardian2(String guardian2) {
        this.guardian2 = guardian2 == null ? null : guardian2.trim();
    }

    public String getGuardian2phone() {
        return guardian2phone;
    }

    public void setGuardian2phone(String guardian2phone) {
        this.guardian2phone = guardian2phone == null ? null : guardian2phone.trim();
    }

    public String getPatientlevelcode() {
        return patientlevelcode;
    }

    public void setPatientlevelcode(String patientlevelcode) {
        this.patientlevelcode = patientlevelcode == null ? null : patientlevelcode.trim();
    }

    public String getPatienttypecode() {
        return patienttypecode;
    }

    public void setPatienttypecode(String patienttypecode) {
        this.patienttypecode = patienttypecode == null ? null : patienttypecode.trim();
    }

    public String getChannel1code() {
        return channel1code;
    }

    public void setChannel1code(String channel1code) {
        this.channel1code = channel1code == null ? null : channel1code.trim();
    }

    public String getChannel2code() {
        return channel2code;
    }

    public void setChannel2code(String channel2code) {
        this.channel2code = channel2code == null ? null : channel2code.trim();
    }

    public String getChannel3code() {
        return channel3code;
    }

    public void setChannel3code(String channel3code) {
        this.channel3code = channel3code == null ? null : channel3code.trim();
    }

    public String getBcsellmanager() {
        return bcsellmanager;
    }

    public void setBcsellmanager(String bcsellmanager) {
        this.bcsellmanager = bcsellmanager == null ? null : bcsellmanager.trim();
    }

    public String getMemo2() {
        return memo2;
    }

    public void setMemo2(String memo2) {
        this.memo2 = memo2 == null ? null : memo2.trim();
    }

    public String getCreateopername() {
        return createopername;
    }

    public void setCreateopername(String createopername) {
        this.createopername = createopername == null ? null : createopername.trim();
    }

    public String getGuardianinfo1id() {
        return guardianinfo1id;
    }

    public void setGuardianinfo1id(String guardianinfo1id) {
        this.guardianinfo1id = guardianinfo1id == null ? null : guardianinfo1id.trim();
    }

    public String getGuardianinfo1name() {
        return guardianinfo1name;
    }

    public void setGuardianinfo1name(String guardianinfo1name) {
        this.guardianinfo1name = guardianinfo1name == null ? null : guardianinfo1name.trim();
    }

    public String getGuardianinfo2id() {
        return guardianinfo2id;
    }

    public void setGuardianinfo2id(String guardianinfo2id) {
        this.guardianinfo2id = guardianinfo2id == null ? null : guardianinfo2id.trim();
    }

    public String getGuardianinfo2name() {
        return guardianinfo2name;
    }

    public void setGuardianinfo2name(String guardianinfo2name) {
        this.guardianinfo2name = guardianinfo2name == null ? null : guardianinfo2name.trim();
    }

    public String getIntroducerid() {
        return introducerid;
    }

    public void setIntroducerid(String introducerid) {
        this.introducerid = introducerid == null ? null : introducerid.trim();
    }

    public String getIntroducername() {
        return introducername;
    }

    public void setIntroducername(String introducername) {
        this.introducername = introducername == null ? null : introducername.trim();
    }

    public String getMmwyflag() {
        return mmwyflag;
    }

    public void setMmwyflag(String mmwyflag) {
        this.mmwyflag = mmwyflag == null ? null : mmwyflag.trim();
    }

    public String getMmwyeventid() {
        return mmwyeventid;
    }

    public void setMmwyeventid(String mmwyeventid) {
        this.mmwyeventid = mmwyeventid == null ? null : mmwyeventid.trim();
    }

    public String getMmwyeventname() {
        return mmwyeventname;
    }

    public void setMmwyeventname(String mmwyeventname) {
        this.mmwyeventname = mmwyeventname == null ? null : mmwyeventname.trim();
    }

    public String getPatientlabel() {
        return patientlabel;
    }

    public void setPatientlabel(String patientlabel) {
        this.patientlabel = patientlabel == null ? null : patientlabel.trim();
    }

    public String getMmwyid() {
        return mmwyid;
    }

    public void setMmwyid(String mmwyid) {
        this.mmwyid = mmwyid == null ? null : mmwyid.trim();
    }

    public String getPackageflag() {
        return packageflag;
    }

    public void setPackageflag(String packageflag) {
        this.packageflag = packageflag == null ? null : packageflag.trim();
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
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

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getChannel4code() {
        return channel4code;
    }

    public void setChannel4code(String channel4code) {
        this.channel4code = channel4code == null ? null : channel4code.trim();
    }

    public String getChannel4() {
        return channel4;
    }

    public void setChannel4(String channel4) {
        this.channel4 = channel4 == null ? null : channel4.trim();
    }

    public String getGhcflag() {
        return ghcflag;
    }

    public void setGhcflag(String ghcflag) {
        this.ghcflag = ghcflag == null ? null : ghcflag.trim();
    }

    public String getGhcclientmanagerid() {
        return ghcclientmanagerid;
    }

    public void setGhcclientmanagerid(String ghcclientmanagerid) {
        this.ghcclientmanagerid = ghcclientmanagerid == null ? null : ghcclientmanagerid.trim();
    }

    public String getGhcclientmanagername() {
        return ghcclientmanagername;
    }

    public void setGhcclientmanagername(String ghcclientmanagername) {
        this.ghcclientmanagername = ghcclientmanagername == null ? null : ghcclientmanagername.trim();
    }

    public String getMmwyregistertype() {
        return mmwyregistertype;
    }

    public void setMmwyregistertype(String mmwyregistertype) {
        this.mmwyregistertype = mmwyregistertype == null ? null : mmwyregistertype.trim();
    }

    public String getMmwysharerole() {
        return mmwysharerole;
    }

    public void setMmwysharerole(String mmwysharerole) {
        this.mmwysharerole = mmwysharerole == null ? null : mmwysharerole.trim();
    }

    public String getClientwechatadd() {
        return clientwechatadd;
    }

    public void setClientwechatadd(String clientwechatadd) {
        this.clientwechatadd = clientwechatadd == null ? null : clientwechatadd.trim();
    }

    public String getConsultwechatadd() {
        return consultwechatadd;
    }

    public void setConsultwechatadd(String consultwechatadd) {
        this.consultwechatadd = consultwechatadd == null ? null : consultwechatadd.trim();
    }

    @Override
    public String toString() {
        return "BdCrmPatient{" +
                "patientid='" + patientid + '\'' +
                ", cardno='" + cardno + '\'' +
                ", name='" + name + '\'' +
                ", engname='" + engname + '\'' +
                ", spell='" + spell + '\'' +
                ", wbspell='" + wbspell + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", idtype='" + idtype + '\'' +
                ", idno='" + idno + '\'' +
                ", phone='" + phone + '\'' +
                ", job='" + job + '\'' +
                ", email='" + email + '\'' +
                ", wechat='" + wechat + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", patientlevel='" + patientlevel + '\'' +
                ", patienttype='" + patienttype + '\'' +
                ", channel1='" + channel1 + '\'' +
                ", channel2='" + channel2 + '\'' +
                ", channel3='" + channel3 + '\'' +
                ", delivertimes=" + delivertimes +
                ", expectedtime=" + expectedtime +
                ", clientmanager='" + clientmanager + '\'' +
                ", consultmanager='" + consultmanager + '\'' +
                ", cmanager='" + cmanager + '\'' +
                ", sellmanager='" + sellmanager + '\'' +
                ", memo='" + memo + '\'' +
                ", othermemo='" + othermemo + '\'' +
                ", firstvisittime=" + firstvisittime +
                ", lastvisitime=" + lastvisitime +
                ", totcost=" + totcost +
                ", integration=" + integration +
                ", extfield01='" + extfield01 + '\'' +
                ", extfield02='" + extfield02 + '\'' +
                ", extfield03='" + extfield03 + '\'' +
                ", hospitalid='" + hospitalid + '\'' +
                ", hospitalname='" + hospitalname + '\'' +
                ", createtime=" + createtime +
                ", createoper='" + createoper + '\'' +
                ", lastmodifiytime=" + lastmodifiytime +
                ", lastmodifiyoperid='" + lastmodifiyoperid + '\'' +
                ", lastmodifiyopername='" + lastmodifiyopername + '\'' +
                ", validflag='" + validflag + '\'' +
                ", sexcode='" + sexcode + '\'' +
                ", idtypecode='" + idtypecode + '\'' +
                ", childflag='" + childflag + '\'' +
                ", guardian1='" + guardian1 + '\'' +
                ", guardian1phone='" + guardian1phone + '\'' +
                ", guardian2='" + guardian2 + '\'' +
                ", guardian2phone='" + guardian2phone + '\'' +
                ", patientlevelcode='" + patientlevelcode + '\'' +
                ", patienttypecode='" + patienttypecode + '\'' +
                ", channel1code='" + channel1code + '\'' +
                ", channel2code='" + channel2code + '\'' +
                ", channel3code='" + channel3code + '\'' +
                ", bcsellmanager='" + bcsellmanager + '\'' +
                ", memo2='" + memo2 + '\'' +
                ", createopername='" + createopername + '\'' +
                ", guardianinfo1id='" + guardianinfo1id + '\'' +
                ", guardianinfo1name='" + guardianinfo1name + '\'' +
                ", guardianinfo2id='" + guardianinfo2id + '\'' +
                ", guardianinfo2name='" + guardianinfo2name + '\'' +
                ", introducerid='" + introducerid + '\'' +
                ", introducername='" + introducername + '\'' +
                ", mmwyflag='" + mmwyflag + '\'' +
                ", mmwyeventid='" + mmwyeventid + '\'' +
                ", mmwyeventname='" + mmwyeventname + '\'' +
                ", patientlabel='" + patientlabel + '\'' +
                ", mmwyid='" + mmwyid + '\'' +
                ", packageflag='" + packageflag + '\'' +
                ", deliverydate=" + deliverydate +
                ", familyid='" + familyid + '\'' +
                ", familyname='" + familyname + '\'' +
                ", roleid='" + roleid + '\'' +
                ", rolename='" + rolename + '\'' +
                ", channel4code='" + channel4code + '\'' +
                ", channel4='" + channel4 + '\'' +
                ", ghcflag='" + ghcflag + '\'' +
                ", ghcclientmanagerid='" + ghcclientmanagerid + '\'' +
                ", ghcclientmanagername='" + ghcclientmanagername + '\'' +
                ", mmwyregistertype='" + mmwyregistertype + '\'' +
                ", mmwysharerole='" + mmwysharerole + '\'' +
                ", clientwechatadd='" + clientwechatadd + '\'' +
                ", consultwechatadd='" + consultwechatadd + '\'' +
                '}';
    }
}