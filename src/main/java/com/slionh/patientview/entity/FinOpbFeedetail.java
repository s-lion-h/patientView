package com.slionh.patientview.entity;

import java.math.BigDecimal;
import java.util.Date;

public class FinOpbFeedetail extends FinOpbFeedetailKey {
    private String clinicCode;

    private String cardNo;

    private Date regDate;

    private String regDpcd;

    private String doctCode;

    private String doctDept;

    private String itemCode;

    private String itemName;

    private String drugFlag;

    private String specs;

    private String selfMade;

    private String drugQuality;

    private String doseModelCode;

    private String feeCode;

    private String classCode;

    private BigDecimal unitPrice;

    private BigDecimal qty;

    private Short days;

    private String frequencyCode;

    private String usageCode;

    private String useName;

    private Short injectNumber;

    private String emcFlag;

    private String labType;

    private String checkBody;

    private BigDecimal doseOnce;

    private String doseUnit;

    private BigDecimal baseDose;

    private Short packQty;

    private String priceUnit;

    private BigDecimal pubCost;

    private BigDecimal payCost;

    private BigDecimal ownCost;

    private String execDpcd;

    private String execDpnm;

    private String centerCode;

    private String itemGrade;

    private String mainDrug;

    private String combNo;

    private String operCode;

    private Date operDate;

    private String payFlag;

    private String cancelFlag;

    private String feeCpcd;

    private Date feeDate;

    private String invoiceNo;

    private String invoCode;

    private String invoSequence;

    private String confirmFlag;

    private String confirmCode;

    private String confirmDept;

    private Date confirmDate;

    private BigDecimal ecoCost;

    private BigDecimal newItemrate;

    private BigDecimal oldItemrate;

    private String extFlag;

    private String extFlag1;

    private String extFlag2;

    private String pactUnitFlag;

    private String packageCode;

    private String packageName;

    private BigDecimal nobackNum;

    private BigDecimal confirmNum;

    private Short confirmInject;

    private String sampleId;

    private String recipeSeq;

    private BigDecimal overCost;

    private BigDecimal excessCost;

    private BigDecimal drugOwncost;

    private String costSource;

    private String subjobFlag;

    private String accountFlag;

    private Long updateSequenceno;

    private String doctindept;

    private String medicalgroupcode;

    private String paykindCode;

    private String pactCode;

    private BigDecimal oldUnitPrice;

    private BigDecimal packageQty;

    private String recipeMemo;

    private String memo;

    private String extFlag3;

    private String belongDept;

    private String sampleState;

    private BigDecimal donateCost;

    private String packageFlag;

    private BigDecimal packageEco;

    private String checkbodypackage;

    public FinOpbFeedetail(String recipeNo, Integer sequenceNo, String transType, String moOrder, String invoiceSeq, String hospitalId, String clinicCode, String cardNo, Date regDate, String regDpcd, String doctCode, String doctDept, String itemCode, String itemName, String drugFlag, String specs, String selfMade, String drugQuality, String doseModelCode, String feeCode, String classCode, BigDecimal unitPrice, BigDecimal qty, Short days, String frequencyCode, String usageCode, String useName, Short injectNumber, String emcFlag, String labType, String checkBody, BigDecimal doseOnce, String doseUnit, BigDecimal baseDose, Short packQty, String priceUnit, BigDecimal pubCost, BigDecimal payCost, BigDecimal ownCost, String execDpcd, String execDpnm, String centerCode, String itemGrade, String mainDrug, String combNo, String operCode, Date operDate, String payFlag, String cancelFlag, String feeCpcd, Date feeDate, String invoiceNo, String invoCode, String invoSequence, String confirmFlag, String confirmCode, String confirmDept, Date confirmDate, BigDecimal ecoCost, BigDecimal newItemrate, BigDecimal oldItemrate, String extFlag, String extFlag1, String extFlag2, String pactUnitFlag, String packageCode, String packageName, BigDecimal nobackNum, BigDecimal confirmNum, Short confirmInject, String sampleId, String recipeSeq, BigDecimal overCost, BigDecimal excessCost, BigDecimal drugOwncost, String costSource, String subjobFlag, String accountFlag, Long updateSequenceno, String doctindept, String medicalgroupcode, String paykindCode, String pactCode, BigDecimal oldUnitPrice, BigDecimal packageQty, String recipeMemo, String memo, String extFlag3, String belongDept, String sampleState, BigDecimal donateCost, String packageFlag, BigDecimal packageEco, String checkbodypackage) {
        super(recipeNo, sequenceNo, transType, moOrder, invoiceSeq, hospitalId);
        this.clinicCode = clinicCode;
        this.cardNo = cardNo;
        this.regDate = regDate;
        this.regDpcd = regDpcd;
        this.doctCode = doctCode;
        this.doctDept = doctDept;
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.drugFlag = drugFlag;
        this.specs = specs;
        this.selfMade = selfMade;
        this.drugQuality = drugQuality;
        this.doseModelCode = doseModelCode;
        this.feeCode = feeCode;
        this.classCode = classCode;
        this.unitPrice = unitPrice;
        this.qty = qty;
        this.days = days;
        this.frequencyCode = frequencyCode;
        this.usageCode = usageCode;
        this.useName = useName;
        this.injectNumber = injectNumber;
        this.emcFlag = emcFlag;
        this.labType = labType;
        this.checkBody = checkBody;
        this.doseOnce = doseOnce;
        this.doseUnit = doseUnit;
        this.baseDose = baseDose;
        this.packQty = packQty;
        this.priceUnit = priceUnit;
        this.pubCost = pubCost;
        this.payCost = payCost;
        this.ownCost = ownCost;
        this.execDpcd = execDpcd;
        this.execDpnm = execDpnm;
        this.centerCode = centerCode;
        this.itemGrade = itemGrade;
        this.mainDrug = mainDrug;
        this.combNo = combNo;
        this.operCode = operCode;
        this.operDate = operDate;
        this.payFlag = payFlag;
        this.cancelFlag = cancelFlag;
        this.feeCpcd = feeCpcd;
        this.feeDate = feeDate;
        this.invoiceNo = invoiceNo;
        this.invoCode = invoCode;
        this.invoSequence = invoSequence;
        this.confirmFlag = confirmFlag;
        this.confirmCode = confirmCode;
        this.confirmDept = confirmDept;
        this.confirmDate = confirmDate;
        this.ecoCost = ecoCost;
        this.newItemrate = newItemrate;
        this.oldItemrate = oldItemrate;
        this.extFlag = extFlag;
        this.extFlag1 = extFlag1;
        this.extFlag2 = extFlag2;
        this.pactUnitFlag = pactUnitFlag;
        this.packageCode = packageCode;
        this.packageName = packageName;
        this.nobackNum = nobackNum;
        this.confirmNum = confirmNum;
        this.confirmInject = confirmInject;
        this.sampleId = sampleId;
        this.recipeSeq = recipeSeq;
        this.overCost = overCost;
        this.excessCost = excessCost;
        this.drugOwncost = drugOwncost;
        this.costSource = costSource;
        this.subjobFlag = subjobFlag;
        this.accountFlag = accountFlag;
        this.updateSequenceno = updateSequenceno;
        this.doctindept = doctindept;
        this.medicalgroupcode = medicalgroupcode;
        this.paykindCode = paykindCode;
        this.pactCode = pactCode;
        this.oldUnitPrice = oldUnitPrice;
        this.packageQty = packageQty;
        this.recipeMemo = recipeMemo;
        this.memo = memo;
        this.extFlag3 = extFlag3;
        this.belongDept = belongDept;
        this.sampleState = sampleState;
        this.donateCost = donateCost;
        this.packageFlag = packageFlag;
        this.packageEco = packageEco;
        this.checkbodypackage = checkbodypackage;
    }

    public FinOpbFeedetail() {
        super();
    }

    public String getClinicCode() {
        return clinicCode;
    }

    public void setClinicCode(String clinicCode) {
        this.clinicCode = clinicCode == null ? null : clinicCode.trim();
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

    public String getRegDpcd() {
        return regDpcd;
    }

    public void setRegDpcd(String regDpcd) {
        this.regDpcd = regDpcd == null ? null : regDpcd.trim();
    }

    public String getDoctCode() {
        return doctCode;
    }

    public void setDoctCode(String doctCode) {
        this.doctCode = doctCode == null ? null : doctCode.trim();
    }

    public String getDoctDept() {
        return doctDept;
    }

    public void setDoctDept(String doctDept) {
        this.doctDept = doctDept == null ? null : doctDept.trim();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getDrugFlag() {
        return drugFlag;
    }

    public void setDrugFlag(String drugFlag) {
        this.drugFlag = drugFlag == null ? null : drugFlag.trim();
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs == null ? null : specs.trim();
    }

    public String getSelfMade() {
        return selfMade;
    }

    public void setSelfMade(String selfMade) {
        this.selfMade = selfMade == null ? null : selfMade.trim();
    }

    public String getDrugQuality() {
        return drugQuality;
    }

    public void setDrugQuality(String drugQuality) {
        this.drugQuality = drugQuality == null ? null : drugQuality.trim();
    }

    public String getDoseModelCode() {
        return doseModelCode;
    }

    public void setDoseModelCode(String doseModelCode) {
        this.doseModelCode = doseModelCode == null ? null : doseModelCode.trim();
    }

    public String getFeeCode() {
        return feeCode;
    }

    public void setFeeCode(String feeCode) {
        this.feeCode = feeCode == null ? null : feeCode.trim();
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode == null ? null : classCode.trim();
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public Short getDays() {
        return days;
    }

    public void setDays(Short days) {
        this.days = days;
    }

    public String getFrequencyCode() {
        return frequencyCode;
    }

    public void setFrequencyCode(String frequencyCode) {
        this.frequencyCode = frequencyCode == null ? null : frequencyCode.trim();
    }

    public String getUsageCode() {
        return usageCode;
    }

    public void setUsageCode(String usageCode) {
        this.usageCode = usageCode == null ? null : usageCode.trim();
    }

    public String getUseName() {
        return useName;
    }

    public void setUseName(String useName) {
        this.useName = useName == null ? null : useName.trim();
    }

    public Short getInjectNumber() {
        return injectNumber;
    }

    public void setInjectNumber(Short injectNumber) {
        this.injectNumber = injectNumber;
    }

    public String getEmcFlag() {
        return emcFlag;
    }

    public void setEmcFlag(String emcFlag) {
        this.emcFlag = emcFlag == null ? null : emcFlag.trim();
    }

    public String getLabType() {
        return labType;
    }

    public void setLabType(String labType) {
        this.labType = labType == null ? null : labType.trim();
    }

    public String getCheckBody() {
        return checkBody;
    }

    public void setCheckBody(String checkBody) {
        this.checkBody = checkBody == null ? null : checkBody.trim();
    }

    public BigDecimal getDoseOnce() {
        return doseOnce;
    }

    public void setDoseOnce(BigDecimal doseOnce) {
        this.doseOnce = doseOnce;
    }

    public String getDoseUnit() {
        return doseUnit;
    }

    public void setDoseUnit(String doseUnit) {
        this.doseUnit = doseUnit == null ? null : doseUnit.trim();
    }

    public BigDecimal getBaseDose() {
        return baseDose;
    }

    public void setBaseDose(BigDecimal baseDose) {
        this.baseDose = baseDose;
    }

    public Short getPackQty() {
        return packQty;
    }

    public void setPackQty(Short packQty) {
        this.packQty = packQty;
    }

    public String getPriceUnit() {
        return priceUnit;
    }

    public void setPriceUnit(String priceUnit) {
        this.priceUnit = priceUnit == null ? null : priceUnit.trim();
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

    public BigDecimal getOwnCost() {
        return ownCost;
    }

    public void setOwnCost(BigDecimal ownCost) {
        this.ownCost = ownCost;
    }

    public String getExecDpcd() {
        return execDpcd;
    }

    public void setExecDpcd(String execDpcd) {
        this.execDpcd = execDpcd == null ? null : execDpcd.trim();
    }

    public String getExecDpnm() {
        return execDpnm;
    }

    public void setExecDpnm(String execDpnm) {
        this.execDpnm = execDpnm == null ? null : execDpnm.trim();
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode == null ? null : centerCode.trim();
    }

    public String getItemGrade() {
        return itemGrade;
    }

    public void setItemGrade(String itemGrade) {
        this.itemGrade = itemGrade == null ? null : itemGrade.trim();
    }

    public String getMainDrug() {
        return mainDrug;
    }

    public void setMainDrug(String mainDrug) {
        this.mainDrug = mainDrug == null ? null : mainDrug.trim();
    }

    public String getCombNo() {
        return combNo;
    }

    public void setCombNo(String combNo) {
        this.combNo = combNo == null ? null : combNo.trim();
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

    public String getPayFlag() {
        return payFlag;
    }

    public void setPayFlag(String payFlag) {
        this.payFlag = payFlag == null ? null : payFlag.trim();
    }

    public String getCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(String cancelFlag) {
        this.cancelFlag = cancelFlag == null ? null : cancelFlag.trim();
    }

    public String getFeeCpcd() {
        return feeCpcd;
    }

    public void setFeeCpcd(String feeCpcd) {
        this.feeCpcd = feeCpcd == null ? null : feeCpcd.trim();
    }

    public Date getFeeDate() {
        return feeDate;
    }

    public void setFeeDate(Date feeDate) {
        this.feeDate = feeDate;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public String getInvoCode() {
        return invoCode;
    }

    public void setInvoCode(String invoCode) {
        this.invoCode = invoCode == null ? null : invoCode.trim();
    }

    public String getInvoSequence() {
        return invoSequence;
    }

    public void setInvoSequence(String invoSequence) {
        this.invoSequence = invoSequence == null ? null : invoSequence.trim();
    }

    public String getConfirmFlag() {
        return confirmFlag;
    }

    public void setConfirmFlag(String confirmFlag) {
        this.confirmFlag = confirmFlag == null ? null : confirmFlag.trim();
    }

    public String getConfirmCode() {
        return confirmCode;
    }

    public void setConfirmCode(String confirmCode) {
        this.confirmCode = confirmCode == null ? null : confirmCode.trim();
    }

    public String getConfirmDept() {
        return confirmDept;
    }

    public void setConfirmDept(String confirmDept) {
        this.confirmDept = confirmDept == null ? null : confirmDept.trim();
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public BigDecimal getEcoCost() {
        return ecoCost;
    }

    public void setEcoCost(BigDecimal ecoCost) {
        this.ecoCost = ecoCost;
    }

    public BigDecimal getNewItemrate() {
        return newItemrate;
    }

    public void setNewItemrate(BigDecimal newItemrate) {
        this.newItemrate = newItemrate;
    }

    public BigDecimal getOldItemrate() {
        return oldItemrate;
    }

    public void setOldItemrate(BigDecimal oldItemrate) {
        this.oldItemrate = oldItemrate;
    }

    public String getExtFlag() {
        return extFlag;
    }

    public void setExtFlag(String extFlag) {
        this.extFlag = extFlag == null ? null : extFlag.trim();
    }

    public String getExtFlag1() {
        return extFlag1;
    }

    public void setExtFlag1(String extFlag1) {
        this.extFlag1 = extFlag1 == null ? null : extFlag1.trim();
    }

    public String getExtFlag2() {
        return extFlag2;
    }

    public void setExtFlag2(String extFlag2) {
        this.extFlag2 = extFlag2 == null ? null : extFlag2.trim();
    }

    public String getPactUnitFlag() {
        return pactUnitFlag;
    }

    public void setPactUnitFlag(String pactUnitFlag) {
        this.pactUnitFlag = pactUnitFlag == null ? null : pactUnitFlag.trim();
    }

    public String getPackageCode() {
        return packageCode;
    }

    public void setPackageCode(String packageCode) {
        this.packageCode = packageCode == null ? null : packageCode.trim();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public BigDecimal getNobackNum() {
        return nobackNum;
    }

    public void setNobackNum(BigDecimal nobackNum) {
        this.nobackNum = nobackNum;
    }

    public BigDecimal getConfirmNum() {
        return confirmNum;
    }

    public void setConfirmNum(BigDecimal confirmNum) {
        this.confirmNum = confirmNum;
    }

    public Short getConfirmInject() {
        return confirmInject;
    }

    public void setConfirmInject(Short confirmInject) {
        this.confirmInject = confirmInject;
    }

    public String getSampleId() {
        return sampleId;
    }

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId == null ? null : sampleId.trim();
    }

    public String getRecipeSeq() {
        return recipeSeq;
    }

    public void setRecipeSeq(String recipeSeq) {
        this.recipeSeq = recipeSeq == null ? null : recipeSeq.trim();
    }

    public BigDecimal getOverCost() {
        return overCost;
    }

    public void setOverCost(BigDecimal overCost) {
        this.overCost = overCost;
    }

    public BigDecimal getExcessCost() {
        return excessCost;
    }

    public void setExcessCost(BigDecimal excessCost) {
        this.excessCost = excessCost;
    }

    public BigDecimal getDrugOwncost() {
        return drugOwncost;
    }

    public void setDrugOwncost(BigDecimal drugOwncost) {
        this.drugOwncost = drugOwncost;
    }

    public String getCostSource() {
        return costSource;
    }

    public void setCostSource(String costSource) {
        this.costSource = costSource == null ? null : costSource.trim();
    }

    public String getSubjobFlag() {
        return subjobFlag;
    }

    public void setSubjobFlag(String subjobFlag) {
        this.subjobFlag = subjobFlag == null ? null : subjobFlag.trim();
    }

    public String getAccountFlag() {
        return accountFlag;
    }

    public void setAccountFlag(String accountFlag) {
        this.accountFlag = accountFlag == null ? null : accountFlag.trim();
    }

    public Long getUpdateSequenceno() {
        return updateSequenceno;
    }

    public void setUpdateSequenceno(Long updateSequenceno) {
        this.updateSequenceno = updateSequenceno;
    }

    public String getDoctindept() {
        return doctindept;
    }

    public void setDoctindept(String doctindept) {
        this.doctindept = doctindept == null ? null : doctindept.trim();
    }

    public String getMedicalgroupcode() {
        return medicalgroupcode;
    }

    public void setMedicalgroupcode(String medicalgroupcode) {
        this.medicalgroupcode = medicalgroupcode == null ? null : medicalgroupcode.trim();
    }

    public String getPaykindCode() {
        return paykindCode;
    }

    public void setPaykindCode(String paykindCode) {
        this.paykindCode = paykindCode == null ? null : paykindCode.trim();
    }

    public String getPactCode() {
        return pactCode;
    }

    public void setPactCode(String pactCode) {
        this.pactCode = pactCode == null ? null : pactCode.trim();
    }

    public BigDecimal getOldUnitPrice() {
        return oldUnitPrice;
    }

    public void setOldUnitPrice(BigDecimal oldUnitPrice) {
        this.oldUnitPrice = oldUnitPrice;
    }

    public BigDecimal getPackageQty() {
        return packageQty;
    }

    public void setPackageQty(BigDecimal packageQty) {
        this.packageQty = packageQty;
    }

    public String getRecipeMemo() {
        return recipeMemo;
    }

    public void setRecipeMemo(String recipeMemo) {
        this.recipeMemo = recipeMemo == null ? null : recipeMemo.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getExtFlag3() {
        return extFlag3;
    }

    public void setExtFlag3(String extFlag3) {
        this.extFlag3 = extFlag3 == null ? null : extFlag3.trim();
    }

    public String getBelongDept() {
        return belongDept;
    }

    public void setBelongDept(String belongDept) {
        this.belongDept = belongDept == null ? null : belongDept.trim();
    }

    public String getSampleState() {
        return sampleState;
    }

    public void setSampleState(String sampleState) {
        this.sampleState = sampleState == null ? null : sampleState.trim();
    }

    public BigDecimal getDonateCost() {
        return donateCost;
    }

    public void setDonateCost(BigDecimal donateCost) {
        this.donateCost = donateCost;
    }

    public String getPackageFlag() {
        return packageFlag;
    }

    public void setPackageFlag(String packageFlag) {
        this.packageFlag = packageFlag == null ? null : packageFlag.trim();
    }

    public BigDecimal getPackageEco() {
        return packageEco;
    }

    public void setPackageEco(BigDecimal packageEco) {
        this.packageEco = packageEco;
    }

    public String getCheckbodypackage() {
        return checkbodypackage;
    }

    public void setCheckbodypackage(String checkbodypackage) {
        this.checkbodypackage = checkbodypackage == null ? null : checkbodypackage.trim();
    }

    @Override
    public String toString() {
        return "FinOpbFeedetail{" +
                "clinicCode='" + clinicCode + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", regDate=" + regDate +
                ", regDpcd='" + regDpcd + '\'' +
                ", doctCode='" + doctCode + '\'' +
                ", doctDept='" + doctDept + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", drugFlag='" + drugFlag + '\'' +
                ", specs='" + specs + '\'' +
                ", selfMade='" + selfMade + '\'' +
                ", drugQuality='" + drugQuality + '\'' +
                ", doseModelCode='" + doseModelCode + '\'' +
                ", feeCode='" + feeCode + '\'' +
                ", classCode='" + classCode + '\'' +
                ", unitPrice=" + unitPrice +
                ", qty=" + qty +
                ", days=" + days +
                ", frequencyCode='" + frequencyCode + '\'' +
                ", usageCode='" + usageCode + '\'' +
                ", useName='" + useName + '\'' +
                ", injectNumber=" + injectNumber +
                ", emcFlag='" + emcFlag + '\'' +
                ", labType='" + labType + '\'' +
                ", checkBody='" + checkBody + '\'' +
                ", doseOnce=" + doseOnce +
                ", doseUnit='" + doseUnit + '\'' +
                ", baseDose=" + baseDose +
                ", packQty=" + packQty +
                ", priceUnit='" + priceUnit + '\'' +
                ", pubCost=" + pubCost +
                ", payCost=" + payCost +
                ", ownCost=" + ownCost +
                ", execDpcd='" + execDpcd + '\'' +
                ", execDpnm='" + execDpnm + '\'' +
                ", centerCode='" + centerCode + '\'' +
                ", itemGrade='" + itemGrade + '\'' +
                ", mainDrug='" + mainDrug + '\'' +
                ", combNo='" + combNo + '\'' +
                ", operCode='" + operCode + '\'' +
                ", operDate=" + operDate +
                ", payFlag='" + payFlag + '\'' +
                ", cancelFlag='" + cancelFlag + '\'' +
                ", feeCpcd='" + feeCpcd + '\'' +
                ", feeDate=" + feeDate +
                ", invoiceNo='" + invoiceNo + '\'' +
                ", invoCode='" + invoCode + '\'' +
                ", invoSequence='" + invoSequence + '\'' +
                ", confirmFlag='" + confirmFlag + '\'' +
                ", confirmCode='" + confirmCode + '\'' +
                ", confirmDept='" + confirmDept + '\'' +
                ", confirmDate=" + confirmDate +
                ", ecoCost=" + ecoCost +
                ", newItemrate=" + newItemrate +
                ", oldItemrate=" + oldItemrate +
                ", extFlag='" + extFlag + '\'' +
                ", extFlag1='" + extFlag1 + '\'' +
                ", extFlag2='" + extFlag2 + '\'' +
                ", pactUnitFlag='" + pactUnitFlag + '\'' +
                ", packageCode='" + packageCode + '\'' +
                ", packageName='" + packageName + '\'' +
                ", nobackNum=" + nobackNum +
                ", confirmNum=" + confirmNum +
                ", confirmInject=" + confirmInject +
                ", sampleId='" + sampleId + '\'' +
                ", recipeSeq='" + recipeSeq + '\'' +
                ", overCost=" + overCost +
                ", excessCost=" + excessCost +
                ", drugOwncost=" + drugOwncost +
                ", costSource='" + costSource + '\'' +
                ", subjobFlag='" + subjobFlag + '\'' +
                ", accountFlag='" + accountFlag + '\'' +
                ", updateSequenceno=" + updateSequenceno +
                ", doctindept='" + doctindept + '\'' +
                ", medicalgroupcode='" + medicalgroupcode + '\'' +
                ", paykindCode='" + paykindCode + '\'' +
                ", pactCode='" + pactCode + '\'' +
                ", oldUnitPrice=" + oldUnitPrice +
                ", packageQty=" + packageQty +
                ", recipeMemo='" + recipeMemo + '\'' +
                ", memo='" + memo + '\'' +
                ", extFlag3='" + extFlag3 + '\'' +
                ", belongDept='" + belongDept + '\'' +
                ", sampleState='" + sampleState + '\'' +
                ", donateCost=" + donateCost +
                ", packageFlag='" + packageFlag + '\'' +
                ", packageEco=" + packageEco +
                ", checkbodypackage='" + checkbodypackage + '\'' +
                '}';
    }
}