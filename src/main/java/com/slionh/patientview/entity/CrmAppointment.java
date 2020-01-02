package com.slionh.patientview.entity;

import java.util.Date;

public class CrmAppointment {
    private String appointid;

    private String patientid;

    private String consultid;

    private Date appointdate;

    private String appointtype;

    private String deptid;

    private String deptname;

    private String doctid;

    private String doctname;

    private String appointitem;

    private String appointmarketing;

    private String appointsms;

    private String remindsms;

    private String state;

    private String cliniccode;

    private String triageoperid;

    private String triageopername;

    private Date triagetime;

    private String extfield01;

    private String extfield02;

    private String extfield03;

    private String hospitalid;

    private String hospitalname;

    private Date canceltime;

    private String canceloperid;

    private String cancelopername;

    private Date createtime;

    private String createoperid;

    private String createopername;

    private String lastmodifiyoperid;

    private String lastmodifiyopername;

    private String schemaid;

    private Date begintime;

    private Date endtime;

    private Date lastmodifiytime;

    private String appointchilditem;

    private String appointitemname;

    private String receiveoperid;

    private String receiveopername;

    private Date receivetime;

    private String isfirstsee;

    private String isrevisit;

    public CrmAppointment(String appointid, String patientid, String consultid, Date appointdate, String appointtype, String deptid, String deptname, String doctid, String doctname, String appointitem, String appointmarketing, String appointsms, String remindsms, String state, String cliniccode, String triageoperid, String triageopername, Date triagetime, String extfield01, String extfield02, String extfield03, String hospitalid, String hospitalname, Date canceltime, String canceloperid, String cancelopername, Date createtime, String createoperid, String createopername, String lastmodifiyoperid, String lastmodifiyopername, String schemaid, Date begintime, Date endtime, Date lastmodifiytime, String appointchilditem, String appointitemname, String receiveoperid, String receiveopername, Date receivetime, String isfirstsee, String isrevisit) {
        this.appointid = appointid;
        this.patientid = patientid;
        this.consultid = consultid;
        this.appointdate = appointdate;
        this.appointtype = appointtype;
        this.deptid = deptid;
        this.deptname = deptname;
        this.doctid = doctid;
        this.doctname = doctname;
        this.appointitem = appointitem;
        this.appointmarketing = appointmarketing;
        this.appointsms = appointsms;
        this.remindsms = remindsms;
        this.state = state;
        this.cliniccode = cliniccode;
        this.triageoperid = triageoperid;
        this.triageopername = triageopername;
        this.triagetime = triagetime;
        this.extfield01 = extfield01;
        this.extfield02 = extfield02;
        this.extfield03 = extfield03;
        this.hospitalid = hospitalid;
        this.hospitalname = hospitalname;
        this.canceltime = canceltime;
        this.canceloperid = canceloperid;
        this.cancelopername = cancelopername;
        this.createtime = createtime;
        this.createoperid = createoperid;
        this.createopername = createopername;
        this.lastmodifiyoperid = lastmodifiyoperid;
        this.lastmodifiyopername = lastmodifiyopername;
        this.schemaid = schemaid;
        this.begintime = begintime;
        this.endtime = endtime;
        this.lastmodifiytime = lastmodifiytime;
        this.appointchilditem = appointchilditem;
        this.appointitemname = appointitemname;
        this.receiveoperid = receiveoperid;
        this.receiveopername = receiveopername;
        this.receivetime = receivetime;
        this.isfirstsee = isfirstsee;
        this.isrevisit = isrevisit;
    }

    public CrmAppointment() {
        super();
    }

    public String getAppointid() {
        return appointid;
    }

    public void setAppointid(String appointid) {
        this.appointid = appointid == null ? null : appointid.trim();
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid == null ? null : patientid.trim();
    }

    public String getConsultid() {
        return consultid;
    }

    public void setConsultid(String consultid) {
        this.consultid = consultid == null ? null : consultid.trim();
    }

    public Date getAppointdate() {
        return appointdate;
    }

    public void setAppointdate(Date appointdate) {
        this.appointdate = appointdate;
    }

    public String getAppointtype() {
        return appointtype;
    }

    public void setAppointtype(String appointtype) {
        this.appointtype = appointtype == null ? null : appointtype.trim();
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        this.deptid = deptid == null ? null : deptid.trim();
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname == null ? null : deptname.trim();
    }

    public String getDoctid() {
        return doctid;
    }

    public void setDoctid(String doctid) {
        this.doctid = doctid == null ? null : doctid.trim();
    }

    public String getDoctname() {
        return doctname;
    }

    public void setDoctname(String doctname) {
        this.doctname = doctname == null ? null : doctname.trim();
    }

    public String getAppointitem() {
        return appointitem;
    }

    public void setAppointitem(String appointitem) {
        this.appointitem = appointitem == null ? null : appointitem.trim();
    }

    public String getAppointmarketing() {
        return appointmarketing;
    }

    public void setAppointmarketing(String appointmarketing) {
        this.appointmarketing = appointmarketing == null ? null : appointmarketing.trim();
    }

    public String getAppointsms() {
        return appointsms;
    }

    public void setAppointsms(String appointsms) {
        this.appointsms = appointsms == null ? null : appointsms.trim();
    }

    public String getRemindsms() {
        return remindsms;
    }

    public void setRemindsms(String remindsms) {
        this.remindsms = remindsms == null ? null : remindsms.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCliniccode() {
        return cliniccode;
    }

    public void setCliniccode(String cliniccode) {
        this.cliniccode = cliniccode == null ? null : cliniccode.trim();
    }

    public String getTriageoperid() {
        return triageoperid;
    }

    public void setTriageoperid(String triageoperid) {
        this.triageoperid = triageoperid == null ? null : triageoperid.trim();
    }

    public String getTriageopername() {
        return triageopername;
    }

    public void setTriageopername(String triageopername) {
        this.triageopername = triageopername == null ? null : triageopername.trim();
    }

    public Date getTriagetime() {
        return triagetime;
    }

    public void setTriagetime(Date triagetime) {
        this.triagetime = triagetime;
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

    public Date getCanceltime() {
        return canceltime;
    }

    public void setCanceltime(Date canceltime) {
        this.canceltime = canceltime;
    }

    public String getCanceloperid() {
        return canceloperid;
    }

    public void setCanceloperid(String canceloperid) {
        this.canceloperid = canceloperid == null ? null : canceloperid.trim();
    }

    public String getCancelopername() {
        return cancelopername;
    }

    public void setCancelopername(String cancelopername) {
        this.cancelopername = cancelopername == null ? null : cancelopername.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateoperid() {
        return createoperid;
    }

    public void setCreateoperid(String createoperid) {
        this.createoperid = createoperid == null ? null : createoperid.trim();
    }

    public String getCreateopername() {
        return createopername;
    }

    public void setCreateopername(String createopername) {
        this.createopername = createopername == null ? null : createopername.trim();
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

    public String getSchemaid() {
        return schemaid;
    }

    public void setSchemaid(String schemaid) {
        this.schemaid = schemaid == null ? null : schemaid.trim();
    }

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getLastmodifiytime() {
        return lastmodifiytime;
    }

    public void setLastmodifiytime(Date lastmodifiytime) {
        this.lastmodifiytime = lastmodifiytime;
    }

    public String getAppointchilditem() {
        return appointchilditem;
    }

    public void setAppointchilditem(String appointchilditem) {
        this.appointchilditem = appointchilditem == null ? null : appointchilditem.trim();
    }

    public String getAppointitemname() {
        return appointitemname;
    }

    public void setAppointitemname(String appointitemname) {
        this.appointitemname = appointitemname == null ? null : appointitemname.trim();
    }

    public String getReceiveoperid() {
        return receiveoperid;
    }

    public void setReceiveoperid(String receiveoperid) {
        this.receiveoperid = receiveoperid == null ? null : receiveoperid.trim();
    }

    public String getReceiveopername() {
        return receiveopername;
    }

    public void setReceiveopername(String receiveopername) {
        this.receiveopername = receiveopername == null ? null : receiveopername.trim();
    }

    public Date getReceivetime() {
        return receivetime;
    }

    public void setReceivetime(Date receivetime) {
        this.receivetime = receivetime;
    }

    public String getIsfirstsee() {
        return isfirstsee;
    }

    public void setIsfirstsee(String isfirstsee) {
        this.isfirstsee = isfirstsee == null ? null : isfirstsee.trim();
    }

    public String getIsrevisit() {
        return isrevisit;
    }

    public void setIsrevisit(String isrevisit) {
        this.isrevisit = isrevisit == null ? null : isrevisit.trim();
    }
}