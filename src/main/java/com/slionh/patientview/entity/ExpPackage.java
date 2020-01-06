package com.slionh.patientview.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ExpPackage extends ExpPackageKey {
    private String packageId;

    private String payFlag;

    private String cardNo;

    private String patientName;

    private String sexCode;

    private Date birthday;

    private String cardLevel;

    private String paykindCode;

    private String packageDept;

    private String consultant;

    private String delimitingCode;

    private Date delimitingDate;

    private BigDecimal packageCost;

    private BigDecimal realCost;

    private BigDecimal giftCost;

    private BigDecimal etcCost;

    private String invoiceSeq;

    private String invoiceNo;

    private String operCode;

    private Date operDate;

    private String cancelFlag;

    private String cancelOper;

    private Date cancelDate;

    private String originalCode;

    private String memo;

    private String recipeNo;

    private String sequenceNo;

    private String costFlag;

    private String costInvoice;

    private String costclinicCode;

    private String usetype;

    private String packageName;

    private String packagesequenceNo;

    private String parentpackageid;

    private String parentpackagename;

    private BigDecimal packagenum;

    public ExpPackage(String clinicCode, String transType, String hospitalId, String packageId, String payFlag, String cardNo, String patientName, String sexCode, Date birthday, String cardLevel, String paykindCode, String packageDept, String consultant, String delimitingCode, Date delimitingDate, BigDecimal packageCost, BigDecimal realCost, BigDecimal giftCost, BigDecimal etcCost, String invoiceSeq, String invoiceNo, String operCode, Date operDate, String cancelFlag, String cancelOper, Date cancelDate, String originalCode, String memo, String recipeNo, String sequenceNo, String costFlag, String costInvoice, String costclinicCode, String usetype, String packageName, String packagesequenceNo, String parentpackageid, String parentpackagename, BigDecimal packagenum) {
        super(clinicCode, transType, hospitalId);
        this.packageId = packageId;
        this.payFlag = payFlag;
        this.cardNo = cardNo;
        this.patientName = patientName;
        this.sexCode = sexCode;
        this.birthday = birthday;
        this.cardLevel = cardLevel;
        this.paykindCode = paykindCode;
        this.packageDept = packageDept;
        this.consultant = consultant;
        this.delimitingCode = delimitingCode;
        this.delimitingDate = delimitingDate;
        this.packageCost = packageCost;
        this.realCost = realCost;
        this.giftCost = giftCost;
        this.etcCost = etcCost;
        this.invoiceSeq = invoiceSeq;
        this.invoiceNo = invoiceNo;
        this.operCode = operCode;
        this.operDate = operDate;
        this.cancelFlag = cancelFlag;
        this.cancelOper = cancelOper;
        this.cancelDate = cancelDate;
        this.originalCode = originalCode;
        this.memo = memo;
        this.recipeNo = recipeNo;
        this.sequenceNo = sequenceNo;
        this.costFlag = costFlag;
        this.costInvoice = costInvoice;
        this.costclinicCode = costclinicCode;
        this.usetype = usetype;
        this.packageName = packageName;
        this.packagesequenceNo = packagesequenceNo;
        this.parentpackageid = parentpackageid;
        this.parentpackagename = parentpackagename;
        this.packagenum = packagenum;
    }

    public ExpPackage() {
        super();
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId == null ? null : packageId.trim();
    }

    public String getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(String payFlag) {
        this.payFlag = payFlag == null ? null : payFlag.trim();
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
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

    public String getCardLevel() {
        return cardLevel;
    }

    public void setCardLevel(String cardLevel) {
        this.cardLevel = cardLevel == null ? null : cardLevel.trim();
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode == null ? null : paykindCode.trim();
    }

    public String getPackageDept() {
        return packageDept;
    }

    public void setPackageDept(String packageDept) {
        this.packageDept = packageDept == null ? null : packageDept.trim();
    }

    public String getConsultant() {
        return consultant;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant == null ? null : consultant.trim();
    }

    public String getDelimitingCode() {
        return delimitingCode;
    }

    public void setDelimitingCode(String delimitingCode) {
        this.delimitingCode = delimitingCode == null ? null : delimitingCode.trim();
    }

    public Date getDelimitingDate() {
        return delimitingDate;
    }

    public void setDelimitingDate(Date delimitingDate) {
        this.delimitingDate = delimitingDate;
    }

    public BigDecimal getPackageCost() {
        return packageCost;
    }

    public void setPackageCost(BigDecimal packageCost) {
        this.packageCost = packageCost;
    }

    public BigDecimal getRealCost() {
        return realCost;
    }

    public void setRealCost(BigDecimal realCost) {
        this.realCost = realCost;
    }

    public BigDecimal getGiftCost() {
        return giftCost;
    }

    public void setGiftCost(BigDecimal giftCost) {
        this.giftCost = giftCost;
    }

    public BigDecimal getEtcCost() {
        return etcCost;
    }

    public void setEtcCost(BigDecimal etcCost) {
        this.etcCost = etcCost;
    }

    public String getInvoiceSeq() {
        return invoiceSeq;
    }

    public void setInvoiceSeq(String invoiceSeq) {
        this.invoiceSeq = invoiceSeq == null ? null : invoiceSeq.trim();
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
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

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag == null ? null : cancelFlag.trim();
    }

    public String getCancelOper() {
        return cancelOper;
    }

    public void setCancelOper(String cancelOper) {
        this.cancelOper = cancelOper == null ? null : cancelOper.trim();
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getOriginalCode() {
        return originalCode;
    }

    public void setOriginalCode(String originalCode) {
        this.originalCode = originalCode == null ? null : originalCode.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getRecipeNo() {
        return recipeNo;
    }

    public void setRecipeNo(String recipeNo) {
        this.recipeNo = recipeNo == null ? null : recipeNo.trim();
    }

    public String getSequenceNo() {
        return sequenceNo;
    }

    public void setSequenceNo(String sequenceNo) {
        this.sequenceNo = sequenceNo == null ? null : sequenceNo.trim();
    }

    public String getCostFlag() {
        return costFlag;
    }

    public void setCostFlag(String costFlag) {
        this.costFlag = costFlag == null ? null : costFlag.trim();
    }

    public String getCostInvoice() {
        return costInvoice;
    }

    public void setCostInvoice(String costInvoice) {
        this.costInvoice = costInvoice == null ? null : costInvoice.trim();
    }

    public String getCostclinicCode() {
        return costclinicCode;
    }

    public void setCostclinicCode(String costclinicCode) {
        this.costclinicCode = costclinicCode == null ? null : costclinicCode.trim();
    }

    public String getUsetype() {
        return usetype;
    }

    public void setUsetype(String usetype) {
        this.usetype = usetype == null ? null : usetype.trim();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getPackagesequenceNo() {
        return packagesequenceNo;
    }

    public void setPackagesequenceNo(String packagesequenceNo) {
        this.packagesequenceNo = packagesequenceNo == null ? null : packagesequenceNo.trim();
    }

    public String getParentpackageid() {
        return parentpackageid;
    }

    public void setParentpackageid(String parentpackageid) {
        this.parentpackageid = parentpackageid == null ? null : parentpackageid.trim();
    }

    public String getParentpackagename() {
        return parentpackagename;
    }

    public void setParentpackagename(String parentpackagename) {
        this.parentpackagename = parentpackagename == null ? null : parentpackagename.trim();
    }

    public BigDecimal getPackagenum() {
        return packagenum;
    }

    public void setPackagenum(BigDecimal packagenum) {
        this.packagenum = packagenum;
    }

    @Override
    public String toString() {
        return "ExpPackage{" +
                "packageId='" + packageId + '\'' +
                ", payFlag='" + payFlag + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", patientName='" + patientName + '\'' +
                ", sexCode='" + sexCode + '\'' +
                ", birthday=" + birthday +
                ", cardLevel='" + cardLevel + '\'' +
                ", paykindCode='" + paykindCode + '\'' +
                ", packageDept='" + packageDept + '\'' +
                ", consultant='" + consultant + '\'' +
                ", delimitingCode='" + delimitingCode + '\'' +
                ", delimitingDate=" + delimitingDate +
                ", packageCost=" + packageCost +
                ", realCost=" + realCost +
                ", giftCost=" + giftCost +
                ", etcCost=" + etcCost +
                ", invoiceSeq='" + invoiceSeq + '\'' +
                ", invoiceNo='" + invoiceNo + '\'' +
                ", operCode='" + operCode + '\'' +
                ", operDate=" + operDate +
                ", cancelFlag='" + cancelFlag + '\'' +
                ", cancelOper='" + cancelOper + '\'' +
                ", cancelDate=" + cancelDate +
                ", originalCode='" + originalCode + '\'' +
                ", memo='" + memo + '\'' +
                ", recipeNo='" + recipeNo + '\'' +
                ", sequenceNo='" + sequenceNo + '\'' +
                ", costFlag='" + costFlag + '\'' +
                ", costInvoice='" + costInvoice + '\'' +
                ", costclinicCode='" + costclinicCode + '\'' +
                ", usetype='" + usetype + '\'' +
                ", packageName='" + packageName + '\'' +
                ", packagesequenceNo='" + packagesequenceNo + '\'' +
                ", parentpackageid='" + parentpackageid + '\'' +
                ", parentpackagename='" + parentpackagename + '\'' +
                ", packagenum=" + packagenum +
                '}';
    }
}