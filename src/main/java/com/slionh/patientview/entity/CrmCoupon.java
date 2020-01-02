package com.slionh.patientview.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CrmCoupon {
    private String accountno;

    private String patientid;

    private String patientname;

    private BigDecimal couponvacancy;

    private BigDecimal donatecouponvacancy;

    private BigDecimal couponaccumulate;

    private Short patientlevel;

    private BigDecimal levelaccumulate;

    private BigDecimal periodaccumulate;

    private Date levelbegin;

    private Date levelend;

    private Date lastoperdate;

    private String lastopercode;

    public CrmCoupon(String accountno, String patientid, String patientname, BigDecimal couponvacancy, BigDecimal donatecouponvacancy, BigDecimal couponaccumulate, Short patientlevel, BigDecimal levelaccumulate, BigDecimal periodaccumulate, Date levelbegin, Date levelend, Date lastoperdate, String lastopercode) {
        this.accountno = accountno;
        this.patientid = patientid;
        this.patientname = patientname;
        this.couponvacancy = couponvacancy;
        this.donatecouponvacancy = donatecouponvacancy;
        this.couponaccumulate = couponaccumulate;
        this.patientlevel = patientlevel;
        this.levelaccumulate = levelaccumulate;
        this.periodaccumulate = periodaccumulate;
        this.levelbegin = levelbegin;
        this.levelend = levelend;
        this.lastoperdate = lastoperdate;
        this.lastopercode = lastopercode;
    }

    public CrmCoupon() {
        super();
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno == null ? null : accountno.trim();
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid == null ? null : patientid.trim();
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname == null ? null : patientname.trim();
    }

    public BigDecimal getCouponvacancy() {
        return couponvacancy;
    }

    public void setCouponvacancy(BigDecimal couponvacancy) {
        this.couponvacancy = couponvacancy;
    }

    public BigDecimal getDonatecouponvacancy() {
        return donatecouponvacancy;
    }

    public void setDonatecouponvacancy(BigDecimal donatecouponvacancy) {
        this.donatecouponvacancy = donatecouponvacancy;
    }

    public BigDecimal getCouponaccumulate() {
        return couponaccumulate;
    }

    public void setCouponaccumulate(BigDecimal couponaccumulate) {
        this.couponaccumulate = couponaccumulate;
    }

    public Short getPatientlevel() {
        return patientlevel;
    }

    public void setPatientlevel(Short patientlevel) {
        this.patientlevel = patientlevel;
    }

    public BigDecimal getLevelaccumulate() {
        return levelaccumulate;
    }

    public void setLevelaccumulate(BigDecimal levelaccumulate) {
        this.levelaccumulate = levelaccumulate;
    }

    public BigDecimal getPeriodaccumulate() {
        return periodaccumulate;
    }

    public void setPeriodaccumulate(BigDecimal periodaccumulate) {
        this.periodaccumulate = periodaccumulate;
    }

    public Date getLevelbegin() {
        return levelbegin;
    }

    public void setLevelbegin(Date levelbegin) {
        this.levelbegin = levelbegin;
    }

    public Date getLevelend() {
        return levelend;
    }

    public void setLevelend(Date levelend) {
        this.levelend = levelend;
    }

    public Date getLastoperdate() {
        return lastoperdate;
    }

    public void setLastoperdate(Date lastoperdate) {
        this.lastoperdate = lastoperdate;
    }

    public String getLastopercode() {
        return lastopercode;
    }

    public void setLastopercode(String lastopercode) {
        this.lastopercode = lastopercode == null ? null : lastopercode.trim();
    }
}