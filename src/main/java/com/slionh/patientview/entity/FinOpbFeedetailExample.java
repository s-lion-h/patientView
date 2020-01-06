package com.slionh.patientview.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinOpbFeedetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinOpbFeedetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRecipeNoIsNull() {
            addCriterion("RECIPE_NO is null");
            return (Criteria) this;
        }

        public Criteria andRecipeNoIsNotNull() {
            addCriterion("RECIPE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeNoEqualTo(String value) {
            addCriterion("RECIPE_NO =", value, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoNotEqualTo(String value) {
            addCriterion("RECIPE_NO <>", value, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoGreaterThan(String value) {
            addCriterion("RECIPE_NO >", value, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoGreaterThanOrEqualTo(String value) {
            addCriterion("RECIPE_NO >=", value, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoLessThan(String value) {
            addCriterion("RECIPE_NO <", value, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoLessThanOrEqualTo(String value) {
            addCriterion("RECIPE_NO <=", value, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoLike(String value) {
            addCriterion("RECIPE_NO like", value, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoNotLike(String value) {
            addCriterion("RECIPE_NO not like", value, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoIn(List<String> values) {
            addCriterion("RECIPE_NO in", values, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoNotIn(List<String> values) {
            addCriterion("RECIPE_NO not in", values, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoBetween(String value1, String value2) {
            addCriterion("RECIPE_NO between", value1, value2, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andRecipeNoNotBetween(String value1, String value2) {
            addCriterion("RECIPE_NO not between", value1, value2, "recipeNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoIsNull() {
            addCriterion("SEQUENCE_NO is null");
            return (Criteria) this;
        }

        public Criteria andSequenceNoIsNotNull() {
            addCriterion("SEQUENCE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceNoEqualTo(Integer value) {
            addCriterion("SEQUENCE_NO =", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoNotEqualTo(Integer value) {
            addCriterion("SEQUENCE_NO <>", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoGreaterThan(Integer value) {
            addCriterion("SEQUENCE_NO >", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEQUENCE_NO >=", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoLessThan(Integer value) {
            addCriterion("SEQUENCE_NO <", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoLessThanOrEqualTo(Integer value) {
            addCriterion("SEQUENCE_NO <=", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoIn(List<Integer> values) {
            addCriterion("SEQUENCE_NO in", values, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoNotIn(List<Integer> values) {
            addCriterion("SEQUENCE_NO not in", values, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoBetween(Integer value1, Integer value2) {
            addCriterion("SEQUENCE_NO between", value1, value2, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoNotBetween(Integer value1, Integer value2) {
            addCriterion("SEQUENCE_NO not between", value1, value2, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNull() {
            addCriterion("TRANS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTransTypeIsNotNull() {
            addCriterion("TRANS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTransTypeEqualTo(String value) {
            addCriterion("TRANS_TYPE =", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotEqualTo(String value) {
            addCriterion("TRANS_TYPE <>", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThan(String value) {
            addCriterion("TRANS_TYPE >", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_TYPE >=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThan(String value) {
            addCriterion("TRANS_TYPE <", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLessThanOrEqualTo(String value) {
            addCriterion("TRANS_TYPE <=", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeLike(String value) {
            addCriterion("TRANS_TYPE like", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotLike(String value) {
            addCriterion("TRANS_TYPE not like", value, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeIn(List<String> values) {
            addCriterion("TRANS_TYPE in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotIn(List<String> values) {
            addCriterion("TRANS_TYPE not in", values, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeBetween(String value1, String value2) {
            addCriterion("TRANS_TYPE between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andTransTypeNotBetween(String value1, String value2) {
            addCriterion("TRANS_TYPE not between", value1, value2, "transType");
            return (Criteria) this;
        }

        public Criteria andMoOrderIsNull() {
            addCriterion("MO_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andMoOrderIsNotNull() {
            addCriterion("MO_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andMoOrderEqualTo(String value) {
            addCriterion("MO_ORDER =", value, "moOrder");
            return (Criteria) this;
        }

        public Criteria andMoOrderNotEqualTo(String value) {
            addCriterion("MO_ORDER <>", value, "moOrder");
            return (Criteria) this;
        }

        public Criteria andMoOrderGreaterThan(String value) {
            addCriterion("MO_ORDER >", value, "moOrder");
            return (Criteria) this;
        }

        public Criteria andMoOrderGreaterThanOrEqualTo(String value) {
            addCriterion("MO_ORDER >=", value, "moOrder");
            return (Criteria) this;
        }

        public Criteria andMoOrderLessThan(String value) {
            addCriterion("MO_ORDER <", value, "moOrder");
            return (Criteria) this;
        }

        public Criteria andMoOrderLessThanOrEqualTo(String value) {
            addCriterion("MO_ORDER <=", value, "moOrder");
            return (Criteria) this;
        }

        public Criteria andMoOrderLike(String value) {
            addCriterion("MO_ORDER like", value, "moOrder");
            return (Criteria) this;
        }

        public Criteria andMoOrderNotLike(String value) {
            addCriterion("MO_ORDER not like", value, "moOrder");
            return (Criteria) this;
        }

        public Criteria andMoOrderIn(List<String> values) {
            addCriterion("MO_ORDER in", values, "moOrder");
            return (Criteria) this;
        }

        public Criteria andMoOrderNotIn(List<String> values) {
            addCriterion("MO_ORDER not in", values, "moOrder");
            return (Criteria) this;
        }

        public Criteria andMoOrderBetween(String value1, String value2) {
            addCriterion("MO_ORDER between", value1, value2, "moOrder");
            return (Criteria) this;
        }

        public Criteria andMoOrderNotBetween(String value1, String value2) {
            addCriterion("MO_ORDER not between", value1, value2, "moOrder");
            return (Criteria) this;
        }

        public Criteria andInvoiceSeqIsNull() {
            addCriterion("INVOICE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceSeqIsNotNull() {
            addCriterion("INVOICE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceSeqEqualTo(String value) {
            addCriterion("INVOICE_SEQ =", value, "invoiceSeq");
            return (Criteria) this;
        }

        public Criteria andInvoiceSeqNotEqualTo(String value) {
            addCriterion("INVOICE_SEQ <>", value, "invoiceSeq");
            return (Criteria) this;
        }

        public Criteria andInvoiceSeqGreaterThan(String value) {
            addCriterion("INVOICE_SEQ >", value, "invoiceSeq");
            return (Criteria) this;
        }

        public Criteria andInvoiceSeqGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_SEQ >=", value, "invoiceSeq");
            return (Criteria) this;
        }

        public Criteria andInvoiceSeqLessThan(String value) {
            addCriterion("INVOICE_SEQ <", value, "invoiceSeq");
            return (Criteria) this;
        }

        public Criteria andInvoiceSeqLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_SEQ <=", value, "invoiceSeq");
            return (Criteria) this;
        }

        public Criteria andInvoiceSeqLike(String value) {
            addCriterion("INVOICE_SEQ like", value, "invoiceSeq");
            return (Criteria) this;
        }

        public Criteria andInvoiceSeqNotLike(String value) {
            addCriterion("INVOICE_SEQ not like", value, "invoiceSeq");
            return (Criteria) this;
        }

        public Criteria andInvoiceSeqIn(List<String> values) {
            addCriterion("INVOICE_SEQ in", values, "invoiceSeq");
            return (Criteria) this;
        }

        public Criteria andInvoiceSeqNotIn(List<String> values) {
            addCriterion("INVOICE_SEQ not in", values, "invoiceSeq");
            return (Criteria) this;
        }

        public Criteria andInvoiceSeqBetween(String value1, String value2) {
            addCriterion("INVOICE_SEQ between", value1, value2, "invoiceSeq");
            return (Criteria) this;
        }

        public Criteria andInvoiceSeqNotBetween(String value1, String value2) {
            addCriterion("INVOICE_SEQ not between", value1, value2, "invoiceSeq");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIsNull() {
            addCriterion("HOSPITAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIsNotNull() {
            addCriterion("HOSPITAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalIdEqualTo(String value) {
            addCriterion("HOSPITAL_ID =", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotEqualTo(String value) {
            addCriterion("HOSPITAL_ID <>", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThan(String value) {
            addCriterion("HOSPITAL_ID >", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdGreaterThanOrEqualTo(String value) {
            addCriterion("HOSPITAL_ID >=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThan(String value) {
            addCriterion("HOSPITAL_ID <", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLessThanOrEqualTo(String value) {
            addCriterion("HOSPITAL_ID <=", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdLike(String value) {
            addCriterion("HOSPITAL_ID like", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotLike(String value) {
            addCriterion("HOSPITAL_ID not like", value, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdIn(List<String> values) {
            addCriterion("HOSPITAL_ID in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotIn(List<String> values) {
            addCriterion("HOSPITAL_ID not in", values, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdBetween(String value1, String value2) {
            addCriterion("HOSPITAL_ID between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andHospitalIdNotBetween(String value1, String value2) {
            addCriterion("HOSPITAL_ID not between", value1, value2, "hospitalId");
            return (Criteria) this;
        }

        public Criteria andClinicCodeIsNull() {
            addCriterion("CLINIC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andClinicCodeIsNotNull() {
            addCriterion("CLINIC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andClinicCodeEqualTo(String value) {
            addCriterion("CLINIC_CODE =", value, "clinicCode");
            return (Criteria) this;
        }

        public Criteria andClinicCodeNotEqualTo(String value) {
            addCriterion("CLINIC_CODE <>", value, "clinicCode");
            return (Criteria) this;
        }

        public Criteria andClinicCodeGreaterThan(String value) {
            addCriterion("CLINIC_CODE >", value, "clinicCode");
            return (Criteria) this;
        }

        public Criteria andClinicCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLINIC_CODE >=", value, "clinicCode");
            return (Criteria) this;
        }

        public Criteria andClinicCodeLessThan(String value) {
            addCriterion("CLINIC_CODE <", value, "clinicCode");
            return (Criteria) this;
        }

        public Criteria andClinicCodeLessThanOrEqualTo(String value) {
            addCriterion("CLINIC_CODE <=", value, "clinicCode");
            return (Criteria) this;
        }

        public Criteria andClinicCodeLike(String value) {
            addCriterion("CLINIC_CODE like", value, "clinicCode");
            return (Criteria) this;
        }

        public Criteria andClinicCodeNotLike(String value) {
            addCriterion("CLINIC_CODE not like", value, "clinicCode");
            return (Criteria) this;
        }

        public Criteria andClinicCodeIn(List<String> values) {
            addCriterion("CLINIC_CODE in", values, "clinicCode");
            return (Criteria) this;
        }

        public Criteria andClinicCodeNotIn(List<String> values) {
            addCriterion("CLINIC_CODE not in", values, "clinicCode");
            return (Criteria) this;
        }

        public Criteria andClinicCodeBetween(String value1, String value2) {
            addCriterion("CLINIC_CODE between", value1, value2, "clinicCode");
            return (Criteria) this;
        }

        public Criteria andClinicCodeNotBetween(String value1, String value2) {
            addCriterion("CLINIC_CODE not between", value1, value2, "clinicCode");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("CARD_NO =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("CARD_NO <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("CARD_NO >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NO >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("CARD_NO <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("CARD_NO <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("CARD_NO like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("CARD_NO not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("CARD_NO in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("CARD_NO not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("CARD_NO between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("CARD_NO not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("REG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("REG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(Date value) {
            addCriterion("REG_DATE =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(Date value) {
            addCriterion("REG_DATE <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(Date value) {
            addCriterion("REG_DATE >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REG_DATE >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(Date value) {
            addCriterion("REG_DATE <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(Date value) {
            addCriterion("REG_DATE <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<Date> values) {
            addCriterion("REG_DATE in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<Date> values) {
            addCriterion("REG_DATE not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(Date value1, Date value2) {
            addCriterion("REG_DATE between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(Date value1, Date value2) {
            addCriterion("REG_DATE not between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDpcdIsNull() {
            addCriterion("REG_DPCD is null");
            return (Criteria) this;
        }

        public Criteria andRegDpcdIsNotNull() {
            addCriterion("REG_DPCD is not null");
            return (Criteria) this;
        }

        public Criteria andRegDpcdEqualTo(String value) {
            addCriterion("REG_DPCD =", value, "regDpcd");
            return (Criteria) this;
        }

        public Criteria andRegDpcdNotEqualTo(String value) {
            addCriterion("REG_DPCD <>", value, "regDpcd");
            return (Criteria) this;
        }

        public Criteria andRegDpcdGreaterThan(String value) {
            addCriterion("REG_DPCD >", value, "regDpcd");
            return (Criteria) this;
        }

        public Criteria andRegDpcdGreaterThanOrEqualTo(String value) {
            addCriterion("REG_DPCD >=", value, "regDpcd");
            return (Criteria) this;
        }

        public Criteria andRegDpcdLessThan(String value) {
            addCriterion("REG_DPCD <", value, "regDpcd");
            return (Criteria) this;
        }

        public Criteria andRegDpcdLessThanOrEqualTo(String value) {
            addCriterion("REG_DPCD <=", value, "regDpcd");
            return (Criteria) this;
        }

        public Criteria andRegDpcdLike(String value) {
            addCriterion("REG_DPCD like", value, "regDpcd");
            return (Criteria) this;
        }

        public Criteria andRegDpcdNotLike(String value) {
            addCriterion("REG_DPCD not like", value, "regDpcd");
            return (Criteria) this;
        }

        public Criteria andRegDpcdIn(List<String> values) {
            addCriterion("REG_DPCD in", values, "regDpcd");
            return (Criteria) this;
        }

        public Criteria andRegDpcdNotIn(List<String> values) {
            addCriterion("REG_DPCD not in", values, "regDpcd");
            return (Criteria) this;
        }

        public Criteria andRegDpcdBetween(String value1, String value2) {
            addCriterion("REG_DPCD between", value1, value2, "regDpcd");
            return (Criteria) this;
        }

        public Criteria andRegDpcdNotBetween(String value1, String value2) {
            addCriterion("REG_DPCD not between", value1, value2, "regDpcd");
            return (Criteria) this;
        }

        public Criteria andDoctCodeIsNull() {
            addCriterion("DOCT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDoctCodeIsNotNull() {
            addCriterion("DOCT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDoctCodeEqualTo(String value) {
            addCriterion("DOCT_CODE =", value, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeNotEqualTo(String value) {
            addCriterion("DOCT_CODE <>", value, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeGreaterThan(String value) {
            addCriterion("DOCT_CODE >", value, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DOCT_CODE >=", value, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeLessThan(String value) {
            addCriterion("DOCT_CODE <", value, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeLessThanOrEqualTo(String value) {
            addCriterion("DOCT_CODE <=", value, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeLike(String value) {
            addCriterion("DOCT_CODE like", value, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeNotLike(String value) {
            addCriterion("DOCT_CODE not like", value, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeIn(List<String> values) {
            addCriterion("DOCT_CODE in", values, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeNotIn(List<String> values) {
            addCriterion("DOCT_CODE not in", values, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeBetween(String value1, String value2) {
            addCriterion("DOCT_CODE between", value1, value2, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctCodeNotBetween(String value1, String value2) {
            addCriterion("DOCT_CODE not between", value1, value2, "doctCode");
            return (Criteria) this;
        }

        public Criteria andDoctDeptIsNull() {
            addCriterion("DOCT_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andDoctDeptIsNotNull() {
            addCriterion("DOCT_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andDoctDeptEqualTo(String value) {
            addCriterion("DOCT_DEPT =", value, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptNotEqualTo(String value) {
            addCriterion("DOCT_DEPT <>", value, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptGreaterThan(String value) {
            addCriterion("DOCT_DEPT >", value, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptGreaterThanOrEqualTo(String value) {
            addCriterion("DOCT_DEPT >=", value, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptLessThan(String value) {
            addCriterion("DOCT_DEPT <", value, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptLessThanOrEqualTo(String value) {
            addCriterion("DOCT_DEPT <=", value, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptLike(String value) {
            addCriterion("DOCT_DEPT like", value, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptNotLike(String value) {
            addCriterion("DOCT_DEPT not like", value, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptIn(List<String> values) {
            addCriterion("DOCT_DEPT in", values, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptNotIn(List<String> values) {
            addCriterion("DOCT_DEPT not in", values, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptBetween(String value1, String value2) {
            addCriterion("DOCT_DEPT between", value1, value2, "doctDept");
            return (Criteria) this;
        }

        public Criteria andDoctDeptNotBetween(String value1, String value2) {
            addCriterion("DOCT_DEPT not between", value1, value2, "doctDept");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNull() {
            addCriterion("ITEM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andItemCodeIsNotNull() {
            addCriterion("ITEM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andItemCodeEqualTo(String value) {
            addCriterion("ITEM_CODE =", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotEqualTo(String value) {
            addCriterion("ITEM_CODE <>", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThan(String value) {
            addCriterion("ITEM_CODE >", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_CODE >=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThan(String value) {
            addCriterion("ITEM_CODE <", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLessThanOrEqualTo(String value) {
            addCriterion("ITEM_CODE <=", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeLike(String value) {
            addCriterion("ITEM_CODE like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotLike(String value) {
            addCriterion("ITEM_CODE not like", value, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeIn(List<String> values) {
            addCriterion("ITEM_CODE in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotIn(List<String> values) {
            addCriterion("ITEM_CODE not in", values, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeBetween(String value1, String value2) {
            addCriterion("ITEM_CODE between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemCodeNotBetween(String value1, String value2) {
            addCriterion("ITEM_CODE not between", value1, value2, "itemCode");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("ITEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("ITEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("ITEM_NAME =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("ITEM_NAME <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("ITEM_NAME >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("ITEM_NAME <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("ITEM_NAME like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("ITEM_NAME not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("ITEM_NAME in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("ITEM_NAME not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("ITEM_NAME between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("ITEM_NAME not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andDrugFlagIsNull() {
            addCriterion("DRUG_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDrugFlagIsNotNull() {
            addCriterion("DRUG_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDrugFlagEqualTo(String value) {
            addCriterion("DRUG_FLAG =", value, "drugFlag");
            return (Criteria) this;
        }

        public Criteria andDrugFlagNotEqualTo(String value) {
            addCriterion("DRUG_FLAG <>", value, "drugFlag");
            return (Criteria) this;
        }

        public Criteria andDrugFlagGreaterThan(String value) {
            addCriterion("DRUG_FLAG >", value, "drugFlag");
            return (Criteria) this;
        }

        public Criteria andDrugFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DRUG_FLAG >=", value, "drugFlag");
            return (Criteria) this;
        }

        public Criteria andDrugFlagLessThan(String value) {
            addCriterion("DRUG_FLAG <", value, "drugFlag");
            return (Criteria) this;
        }

        public Criteria andDrugFlagLessThanOrEqualTo(String value) {
            addCriterion("DRUG_FLAG <=", value, "drugFlag");
            return (Criteria) this;
        }

        public Criteria andDrugFlagLike(String value) {
            addCriterion("DRUG_FLAG like", value, "drugFlag");
            return (Criteria) this;
        }

        public Criteria andDrugFlagNotLike(String value) {
            addCriterion("DRUG_FLAG not like", value, "drugFlag");
            return (Criteria) this;
        }

        public Criteria andDrugFlagIn(List<String> values) {
            addCriterion("DRUG_FLAG in", values, "drugFlag");
            return (Criteria) this;
        }

        public Criteria andDrugFlagNotIn(List<String> values) {
            addCriterion("DRUG_FLAG not in", values, "drugFlag");
            return (Criteria) this;
        }

        public Criteria andDrugFlagBetween(String value1, String value2) {
            addCriterion("DRUG_FLAG between", value1, value2, "drugFlag");
            return (Criteria) this;
        }

        public Criteria andDrugFlagNotBetween(String value1, String value2) {
            addCriterion("DRUG_FLAG not between", value1, value2, "drugFlag");
            return (Criteria) this;
        }

        public Criteria andSpecsIsNull() {
            addCriterion("SPECS is null");
            return (Criteria) this;
        }

        public Criteria andSpecsIsNotNull() {
            addCriterion("SPECS is not null");
            return (Criteria) this;
        }

        public Criteria andSpecsEqualTo(String value) {
            addCriterion("SPECS =", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotEqualTo(String value) {
            addCriterion("SPECS <>", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsGreaterThan(String value) {
            addCriterion("SPECS >", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsGreaterThanOrEqualTo(String value) {
            addCriterion("SPECS >=", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsLessThan(String value) {
            addCriterion("SPECS <", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsLessThanOrEqualTo(String value) {
            addCriterion("SPECS <=", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsLike(String value) {
            addCriterion("SPECS like", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotLike(String value) {
            addCriterion("SPECS not like", value, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsIn(List<String> values) {
            addCriterion("SPECS in", values, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotIn(List<String> values) {
            addCriterion("SPECS not in", values, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsBetween(String value1, String value2) {
            addCriterion("SPECS between", value1, value2, "specs");
            return (Criteria) this;
        }

        public Criteria andSpecsNotBetween(String value1, String value2) {
            addCriterion("SPECS not between", value1, value2, "specs");
            return (Criteria) this;
        }

        public Criteria andSelfMadeIsNull() {
            addCriterion("SELF_MADE is null");
            return (Criteria) this;
        }

        public Criteria andSelfMadeIsNotNull() {
            addCriterion("SELF_MADE is not null");
            return (Criteria) this;
        }

        public Criteria andSelfMadeEqualTo(String value) {
            addCriterion("SELF_MADE =", value, "selfMade");
            return (Criteria) this;
        }

        public Criteria andSelfMadeNotEqualTo(String value) {
            addCriterion("SELF_MADE <>", value, "selfMade");
            return (Criteria) this;
        }

        public Criteria andSelfMadeGreaterThan(String value) {
            addCriterion("SELF_MADE >", value, "selfMade");
            return (Criteria) this;
        }

        public Criteria andSelfMadeGreaterThanOrEqualTo(String value) {
            addCriterion("SELF_MADE >=", value, "selfMade");
            return (Criteria) this;
        }

        public Criteria andSelfMadeLessThan(String value) {
            addCriterion("SELF_MADE <", value, "selfMade");
            return (Criteria) this;
        }

        public Criteria andSelfMadeLessThanOrEqualTo(String value) {
            addCriterion("SELF_MADE <=", value, "selfMade");
            return (Criteria) this;
        }

        public Criteria andSelfMadeLike(String value) {
            addCriterion("SELF_MADE like", value, "selfMade");
            return (Criteria) this;
        }

        public Criteria andSelfMadeNotLike(String value) {
            addCriterion("SELF_MADE not like", value, "selfMade");
            return (Criteria) this;
        }

        public Criteria andSelfMadeIn(List<String> values) {
            addCriterion("SELF_MADE in", values, "selfMade");
            return (Criteria) this;
        }

        public Criteria andSelfMadeNotIn(List<String> values) {
            addCriterion("SELF_MADE not in", values, "selfMade");
            return (Criteria) this;
        }

        public Criteria andSelfMadeBetween(String value1, String value2) {
            addCriterion("SELF_MADE between", value1, value2, "selfMade");
            return (Criteria) this;
        }

        public Criteria andSelfMadeNotBetween(String value1, String value2) {
            addCriterion("SELF_MADE not between", value1, value2, "selfMade");
            return (Criteria) this;
        }

        public Criteria andDrugQualityIsNull() {
            addCriterion("DRUG_QUALITY is null");
            return (Criteria) this;
        }

        public Criteria andDrugQualityIsNotNull() {
            addCriterion("DRUG_QUALITY is not null");
            return (Criteria) this;
        }

        public Criteria andDrugQualityEqualTo(String value) {
            addCriterion("DRUG_QUALITY =", value, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityNotEqualTo(String value) {
            addCriterion("DRUG_QUALITY <>", value, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityGreaterThan(String value) {
            addCriterion("DRUG_QUALITY >", value, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityGreaterThanOrEqualTo(String value) {
            addCriterion("DRUG_QUALITY >=", value, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityLessThan(String value) {
            addCriterion("DRUG_QUALITY <", value, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityLessThanOrEqualTo(String value) {
            addCriterion("DRUG_QUALITY <=", value, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityLike(String value) {
            addCriterion("DRUG_QUALITY like", value, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityNotLike(String value) {
            addCriterion("DRUG_QUALITY not like", value, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityIn(List<String> values) {
            addCriterion("DRUG_QUALITY in", values, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityNotIn(List<String> values) {
            addCriterion("DRUG_QUALITY not in", values, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityBetween(String value1, String value2) {
            addCriterion("DRUG_QUALITY between", value1, value2, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDrugQualityNotBetween(String value1, String value2) {
            addCriterion("DRUG_QUALITY not between", value1, value2, "drugQuality");
            return (Criteria) this;
        }

        public Criteria andDoseModelCodeIsNull() {
            addCriterion("DOSE_MODEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDoseModelCodeIsNotNull() {
            addCriterion("DOSE_MODEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDoseModelCodeEqualTo(String value) {
            addCriterion("DOSE_MODEL_CODE =", value, "doseModelCode");
            return (Criteria) this;
        }

        public Criteria andDoseModelCodeNotEqualTo(String value) {
            addCriterion("DOSE_MODEL_CODE <>", value, "doseModelCode");
            return (Criteria) this;
        }

        public Criteria andDoseModelCodeGreaterThan(String value) {
            addCriterion("DOSE_MODEL_CODE >", value, "doseModelCode");
            return (Criteria) this;
        }

        public Criteria andDoseModelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DOSE_MODEL_CODE >=", value, "doseModelCode");
            return (Criteria) this;
        }

        public Criteria andDoseModelCodeLessThan(String value) {
            addCriterion("DOSE_MODEL_CODE <", value, "doseModelCode");
            return (Criteria) this;
        }

        public Criteria andDoseModelCodeLessThanOrEqualTo(String value) {
            addCriterion("DOSE_MODEL_CODE <=", value, "doseModelCode");
            return (Criteria) this;
        }

        public Criteria andDoseModelCodeLike(String value) {
            addCriterion("DOSE_MODEL_CODE like", value, "doseModelCode");
            return (Criteria) this;
        }

        public Criteria andDoseModelCodeNotLike(String value) {
            addCriterion("DOSE_MODEL_CODE not like", value, "doseModelCode");
            return (Criteria) this;
        }

        public Criteria andDoseModelCodeIn(List<String> values) {
            addCriterion("DOSE_MODEL_CODE in", values, "doseModelCode");
            return (Criteria) this;
        }

        public Criteria andDoseModelCodeNotIn(List<String> values) {
            addCriterion("DOSE_MODEL_CODE not in", values, "doseModelCode");
            return (Criteria) this;
        }

        public Criteria andDoseModelCodeBetween(String value1, String value2) {
            addCriterion("DOSE_MODEL_CODE between", value1, value2, "doseModelCode");
            return (Criteria) this;
        }

        public Criteria andDoseModelCodeNotBetween(String value1, String value2) {
            addCriterion("DOSE_MODEL_CODE not between", value1, value2, "doseModelCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeIsNull() {
            addCriterion("FEE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFeeCodeIsNotNull() {
            addCriterion("FEE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeCodeEqualTo(String value) {
            addCriterion("FEE_CODE =", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeNotEqualTo(String value) {
            addCriterion("FEE_CODE <>", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeGreaterThan(String value) {
            addCriterion("FEE_CODE >", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_CODE >=", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeLessThan(String value) {
            addCriterion("FEE_CODE <", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeLessThanOrEqualTo(String value) {
            addCriterion("FEE_CODE <=", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeLike(String value) {
            addCriterion("FEE_CODE like", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeNotLike(String value) {
            addCriterion("FEE_CODE not like", value, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeIn(List<String> values) {
            addCriterion("FEE_CODE in", values, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeNotIn(List<String> values) {
            addCriterion("FEE_CODE not in", values, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeBetween(String value1, String value2) {
            addCriterion("FEE_CODE between", value1, value2, "feeCode");
            return (Criteria) this;
        }

        public Criteria andFeeCodeNotBetween(String value1, String value2) {
            addCriterion("FEE_CODE not between", value1, value2, "feeCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeIsNull() {
            addCriterion("CLASS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andClassCodeIsNotNull() {
            addCriterion("CLASS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andClassCodeEqualTo(String value) {
            addCriterion("CLASS_CODE =", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotEqualTo(String value) {
            addCriterion("CLASS_CODE <>", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeGreaterThan(String value) {
            addCriterion("CLASS_CODE >", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_CODE >=", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeLessThan(String value) {
            addCriterion("CLASS_CODE <", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeLessThanOrEqualTo(String value) {
            addCriterion("CLASS_CODE <=", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeLike(String value) {
            addCriterion("CLASS_CODE like", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotLike(String value) {
            addCriterion("CLASS_CODE not like", value, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeIn(List<String> values) {
            addCriterion("CLASS_CODE in", values, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotIn(List<String> values) {
            addCriterion("CLASS_CODE not in", values, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeBetween(String value1, String value2) {
            addCriterion("CLASS_CODE between", value1, value2, "classCode");
            return (Criteria) this;
        }

        public Criteria andClassCodeNotBetween(String value1, String value2) {
            addCriterion("CLASS_CODE not between", value1, value2, "classCode");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("UNIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("UNIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(BigDecimal value) {
            addCriterion("UNIT_PRICE =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("UNIT_PRICE <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("UNIT_PRICE >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIT_PRICE >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(BigDecimal value) {
            addCriterion("UNIT_PRICE <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIT_PRICE <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<BigDecimal> values) {
            addCriterion("UNIT_PRICE in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("UNIT_PRICE not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIT_PRICE between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIT_PRICE not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andQtyIsNull() {
            addCriterion("QTY is null");
            return (Criteria) this;
        }

        public Criteria andQtyIsNotNull() {
            addCriterion("QTY is not null");
            return (Criteria) this;
        }

        public Criteria andQtyEqualTo(BigDecimal value) {
            addCriterion("QTY =", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotEqualTo(BigDecimal value) {
            addCriterion("QTY <>", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThan(BigDecimal value) {
            addCriterion("QTY >", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY >=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThan(BigDecimal value) {
            addCriterion("QTY <", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QTY <=", value, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyIn(List<BigDecimal> values) {
            addCriterion("QTY in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotIn(List<BigDecimal> values) {
            addCriterion("QTY not in", values, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QTY not between", value1, value2, "qty");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("DAYS is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(Short value) {
            addCriterion("DAYS =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(Short value) {
            addCriterion("DAYS <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(Short value) {
            addCriterion("DAYS >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(Short value) {
            addCriterion("DAYS >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(Short value) {
            addCriterion("DAYS <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(Short value) {
            addCriterion("DAYS <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<Short> values) {
            addCriterion("DAYS in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<Short> values) {
            addCriterion("DAYS not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(Short value1, Short value2) {
            addCriterion("DAYS between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(Short value1, Short value2) {
            addCriterion("DAYS not between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andFrequencyCodeIsNull() {
            addCriterion("FREQUENCY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFrequencyCodeIsNotNull() {
            addCriterion("FREQUENCY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFrequencyCodeEqualTo(String value) {
            addCriterion("FREQUENCY_CODE =", value, "frequencyCode");
            return (Criteria) this;
        }

        public Criteria andFrequencyCodeNotEqualTo(String value) {
            addCriterion("FREQUENCY_CODE <>", value, "frequencyCode");
            return (Criteria) this;
        }

        public Criteria andFrequencyCodeGreaterThan(String value) {
            addCriterion("FREQUENCY_CODE >", value, "frequencyCode");
            return (Criteria) this;
        }

        public Criteria andFrequencyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FREQUENCY_CODE >=", value, "frequencyCode");
            return (Criteria) this;
        }

        public Criteria andFrequencyCodeLessThan(String value) {
            addCriterion("FREQUENCY_CODE <", value, "frequencyCode");
            return (Criteria) this;
        }

        public Criteria andFrequencyCodeLessThanOrEqualTo(String value) {
            addCriterion("FREQUENCY_CODE <=", value, "frequencyCode");
            return (Criteria) this;
        }

        public Criteria andFrequencyCodeLike(String value) {
            addCriterion("FREQUENCY_CODE like", value, "frequencyCode");
            return (Criteria) this;
        }

        public Criteria andFrequencyCodeNotLike(String value) {
            addCriterion("FREQUENCY_CODE not like", value, "frequencyCode");
            return (Criteria) this;
        }

        public Criteria andFrequencyCodeIn(List<String> values) {
            addCriterion("FREQUENCY_CODE in", values, "frequencyCode");
            return (Criteria) this;
        }

        public Criteria andFrequencyCodeNotIn(List<String> values) {
            addCriterion("FREQUENCY_CODE not in", values, "frequencyCode");
            return (Criteria) this;
        }

        public Criteria andFrequencyCodeBetween(String value1, String value2) {
            addCriterion("FREQUENCY_CODE between", value1, value2, "frequencyCode");
            return (Criteria) this;
        }

        public Criteria andFrequencyCodeNotBetween(String value1, String value2) {
            addCriterion("FREQUENCY_CODE not between", value1, value2, "frequencyCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeIsNull() {
            addCriterion("USAGE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUsageCodeIsNotNull() {
            addCriterion("USAGE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUsageCodeEqualTo(String value) {
            addCriterion("USAGE_CODE =", value, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeNotEqualTo(String value) {
            addCriterion("USAGE_CODE <>", value, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeGreaterThan(String value) {
            addCriterion("USAGE_CODE >", value, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USAGE_CODE >=", value, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeLessThan(String value) {
            addCriterion("USAGE_CODE <", value, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeLessThanOrEqualTo(String value) {
            addCriterion("USAGE_CODE <=", value, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeLike(String value) {
            addCriterion("USAGE_CODE like", value, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeNotLike(String value) {
            addCriterion("USAGE_CODE not like", value, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeIn(List<String> values) {
            addCriterion("USAGE_CODE in", values, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeNotIn(List<String> values) {
            addCriterion("USAGE_CODE not in", values, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeBetween(String value1, String value2) {
            addCriterion("USAGE_CODE between", value1, value2, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUsageCodeNotBetween(String value1, String value2) {
            addCriterion("USAGE_CODE not between", value1, value2, "usageCode");
            return (Criteria) this;
        }

        public Criteria andUseNameIsNull() {
            addCriterion("USE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUseNameIsNotNull() {
            addCriterion("USE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUseNameEqualTo(String value) {
            addCriterion("USE_NAME =", value, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameNotEqualTo(String value) {
            addCriterion("USE_NAME <>", value, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameGreaterThan(String value) {
            addCriterion("USE_NAME >", value, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameGreaterThanOrEqualTo(String value) {
            addCriterion("USE_NAME >=", value, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameLessThan(String value) {
            addCriterion("USE_NAME <", value, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameLessThanOrEqualTo(String value) {
            addCriterion("USE_NAME <=", value, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameLike(String value) {
            addCriterion("USE_NAME like", value, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameNotLike(String value) {
            addCriterion("USE_NAME not like", value, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameIn(List<String> values) {
            addCriterion("USE_NAME in", values, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameNotIn(List<String> values) {
            addCriterion("USE_NAME not in", values, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameBetween(String value1, String value2) {
            addCriterion("USE_NAME between", value1, value2, "useName");
            return (Criteria) this;
        }

        public Criteria andUseNameNotBetween(String value1, String value2) {
            addCriterion("USE_NAME not between", value1, value2, "useName");
            return (Criteria) this;
        }

        public Criteria andInjectNumberIsNull() {
            addCriterion("INJECT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andInjectNumberIsNotNull() {
            addCriterion("INJECT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andInjectNumberEqualTo(Short value) {
            addCriterion("INJECT_NUMBER =", value, "injectNumber");
            return (Criteria) this;
        }

        public Criteria andInjectNumberNotEqualTo(Short value) {
            addCriterion("INJECT_NUMBER <>", value, "injectNumber");
            return (Criteria) this;
        }

        public Criteria andInjectNumberGreaterThan(Short value) {
            addCriterion("INJECT_NUMBER >", value, "injectNumber");
            return (Criteria) this;
        }

        public Criteria andInjectNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("INJECT_NUMBER >=", value, "injectNumber");
            return (Criteria) this;
        }

        public Criteria andInjectNumberLessThan(Short value) {
            addCriterion("INJECT_NUMBER <", value, "injectNumber");
            return (Criteria) this;
        }

        public Criteria andInjectNumberLessThanOrEqualTo(Short value) {
            addCriterion("INJECT_NUMBER <=", value, "injectNumber");
            return (Criteria) this;
        }

        public Criteria andInjectNumberIn(List<Short> values) {
            addCriterion("INJECT_NUMBER in", values, "injectNumber");
            return (Criteria) this;
        }

        public Criteria andInjectNumberNotIn(List<Short> values) {
            addCriterion("INJECT_NUMBER not in", values, "injectNumber");
            return (Criteria) this;
        }

        public Criteria andInjectNumberBetween(Short value1, Short value2) {
            addCriterion("INJECT_NUMBER between", value1, value2, "injectNumber");
            return (Criteria) this;
        }

        public Criteria andInjectNumberNotBetween(Short value1, Short value2) {
            addCriterion("INJECT_NUMBER not between", value1, value2, "injectNumber");
            return (Criteria) this;
        }

        public Criteria andEmcFlagIsNull() {
            addCriterion("EMC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andEmcFlagIsNotNull() {
            addCriterion("EMC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andEmcFlagEqualTo(String value) {
            addCriterion("EMC_FLAG =", value, "emcFlag");
            return (Criteria) this;
        }

        public Criteria andEmcFlagNotEqualTo(String value) {
            addCriterion("EMC_FLAG <>", value, "emcFlag");
            return (Criteria) this;
        }

        public Criteria andEmcFlagGreaterThan(String value) {
            addCriterion("EMC_FLAG >", value, "emcFlag");
            return (Criteria) this;
        }

        public Criteria andEmcFlagGreaterThanOrEqualTo(String value) {
            addCriterion("EMC_FLAG >=", value, "emcFlag");
            return (Criteria) this;
        }

        public Criteria andEmcFlagLessThan(String value) {
            addCriterion("EMC_FLAG <", value, "emcFlag");
            return (Criteria) this;
        }

        public Criteria andEmcFlagLessThanOrEqualTo(String value) {
            addCriterion("EMC_FLAG <=", value, "emcFlag");
            return (Criteria) this;
        }

        public Criteria andEmcFlagLike(String value) {
            addCriterion("EMC_FLAG like", value, "emcFlag");
            return (Criteria) this;
        }

        public Criteria andEmcFlagNotLike(String value) {
            addCriterion("EMC_FLAG not like", value, "emcFlag");
            return (Criteria) this;
        }

        public Criteria andEmcFlagIn(List<String> values) {
            addCriterion("EMC_FLAG in", values, "emcFlag");
            return (Criteria) this;
        }

        public Criteria andEmcFlagNotIn(List<String> values) {
            addCriterion("EMC_FLAG not in", values, "emcFlag");
            return (Criteria) this;
        }

        public Criteria andEmcFlagBetween(String value1, String value2) {
            addCriterion("EMC_FLAG between", value1, value2, "emcFlag");
            return (Criteria) this;
        }

        public Criteria andEmcFlagNotBetween(String value1, String value2) {
            addCriterion("EMC_FLAG not between", value1, value2, "emcFlag");
            return (Criteria) this;
        }

        public Criteria andLabTypeIsNull() {
            addCriterion("LAB_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLabTypeIsNotNull() {
            addCriterion("LAB_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLabTypeEqualTo(String value) {
            addCriterion("LAB_TYPE =", value, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeNotEqualTo(String value) {
            addCriterion("LAB_TYPE <>", value, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeGreaterThan(String value) {
            addCriterion("LAB_TYPE >", value, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LAB_TYPE >=", value, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeLessThan(String value) {
            addCriterion("LAB_TYPE <", value, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeLessThanOrEqualTo(String value) {
            addCriterion("LAB_TYPE <=", value, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeLike(String value) {
            addCriterion("LAB_TYPE like", value, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeNotLike(String value) {
            addCriterion("LAB_TYPE not like", value, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeIn(List<String> values) {
            addCriterion("LAB_TYPE in", values, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeNotIn(List<String> values) {
            addCriterion("LAB_TYPE not in", values, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeBetween(String value1, String value2) {
            addCriterion("LAB_TYPE between", value1, value2, "labType");
            return (Criteria) this;
        }

        public Criteria andLabTypeNotBetween(String value1, String value2) {
            addCriterion("LAB_TYPE not between", value1, value2, "labType");
            return (Criteria) this;
        }

        public Criteria andCheckBodyIsNull() {
            addCriterion("CHECK_BODY is null");
            return (Criteria) this;
        }

        public Criteria andCheckBodyIsNotNull() {
            addCriterion("CHECK_BODY is not null");
            return (Criteria) this;
        }

        public Criteria andCheckBodyEqualTo(String value) {
            addCriterion("CHECK_BODY =", value, "checkBody");
            return (Criteria) this;
        }

        public Criteria andCheckBodyNotEqualTo(String value) {
            addCriterion("CHECK_BODY <>", value, "checkBody");
            return (Criteria) this;
        }

        public Criteria andCheckBodyGreaterThan(String value) {
            addCriterion("CHECK_BODY >", value, "checkBody");
            return (Criteria) this;
        }

        public Criteria andCheckBodyGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_BODY >=", value, "checkBody");
            return (Criteria) this;
        }

        public Criteria andCheckBodyLessThan(String value) {
            addCriterion("CHECK_BODY <", value, "checkBody");
            return (Criteria) this;
        }

        public Criteria andCheckBodyLessThanOrEqualTo(String value) {
            addCriterion("CHECK_BODY <=", value, "checkBody");
            return (Criteria) this;
        }

        public Criteria andCheckBodyLike(String value) {
            addCriterion("CHECK_BODY like", value, "checkBody");
            return (Criteria) this;
        }

        public Criteria andCheckBodyNotLike(String value) {
            addCriterion("CHECK_BODY not like", value, "checkBody");
            return (Criteria) this;
        }

        public Criteria andCheckBodyIn(List<String> values) {
            addCriterion("CHECK_BODY in", values, "checkBody");
            return (Criteria) this;
        }

        public Criteria andCheckBodyNotIn(List<String> values) {
            addCriterion("CHECK_BODY not in", values, "checkBody");
            return (Criteria) this;
        }

        public Criteria andCheckBodyBetween(String value1, String value2) {
            addCriterion("CHECK_BODY between", value1, value2, "checkBody");
            return (Criteria) this;
        }

        public Criteria andCheckBodyNotBetween(String value1, String value2) {
            addCriterion("CHECK_BODY not between", value1, value2, "checkBody");
            return (Criteria) this;
        }

        public Criteria andDoseOnceIsNull() {
            addCriterion("DOSE_ONCE is null");
            return (Criteria) this;
        }

        public Criteria andDoseOnceIsNotNull() {
            addCriterion("DOSE_ONCE is not null");
            return (Criteria) this;
        }

        public Criteria andDoseOnceEqualTo(BigDecimal value) {
            addCriterion("DOSE_ONCE =", value, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceNotEqualTo(BigDecimal value) {
            addCriterion("DOSE_ONCE <>", value, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceGreaterThan(BigDecimal value) {
            addCriterion("DOSE_ONCE >", value, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DOSE_ONCE >=", value, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceLessThan(BigDecimal value) {
            addCriterion("DOSE_ONCE <", value, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DOSE_ONCE <=", value, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceIn(List<BigDecimal> values) {
            addCriterion("DOSE_ONCE in", values, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceNotIn(List<BigDecimal> values) {
            addCriterion("DOSE_ONCE not in", values, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOSE_ONCE between", value1, value2, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseOnceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DOSE_ONCE not between", value1, value2, "doseOnce");
            return (Criteria) this;
        }

        public Criteria andDoseUnitIsNull() {
            addCriterion("DOSE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andDoseUnitIsNotNull() {
            addCriterion("DOSE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andDoseUnitEqualTo(String value) {
            addCriterion("DOSE_UNIT =", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitNotEqualTo(String value) {
            addCriterion("DOSE_UNIT <>", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitGreaterThan(String value) {
            addCriterion("DOSE_UNIT >", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitGreaterThanOrEqualTo(String value) {
            addCriterion("DOSE_UNIT >=", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitLessThan(String value) {
            addCriterion("DOSE_UNIT <", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitLessThanOrEqualTo(String value) {
            addCriterion("DOSE_UNIT <=", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitLike(String value) {
            addCriterion("DOSE_UNIT like", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitNotLike(String value) {
            addCriterion("DOSE_UNIT not like", value, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitIn(List<String> values) {
            addCriterion("DOSE_UNIT in", values, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitNotIn(List<String> values) {
            addCriterion("DOSE_UNIT not in", values, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitBetween(String value1, String value2) {
            addCriterion("DOSE_UNIT between", value1, value2, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andDoseUnitNotBetween(String value1, String value2) {
            addCriterion("DOSE_UNIT not between", value1, value2, "doseUnit");
            return (Criteria) this;
        }

        public Criteria andBaseDoseIsNull() {
            addCriterion("BASE_DOSE is null");
            return (Criteria) this;
        }

        public Criteria andBaseDoseIsNotNull() {
            addCriterion("BASE_DOSE is not null");
            return (Criteria) this;
        }

        public Criteria andBaseDoseEqualTo(BigDecimal value) {
            addCriterion("BASE_DOSE =", value, "baseDose");
            return (Criteria) this;
        }

        public Criteria andBaseDoseNotEqualTo(BigDecimal value) {
            addCriterion("BASE_DOSE <>", value, "baseDose");
            return (Criteria) this;
        }

        public Criteria andBaseDoseGreaterThan(BigDecimal value) {
            addCriterion("BASE_DOSE >", value, "baseDose");
            return (Criteria) this;
        }

        public Criteria andBaseDoseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_DOSE >=", value, "baseDose");
            return (Criteria) this;
        }

        public Criteria andBaseDoseLessThan(BigDecimal value) {
            addCriterion("BASE_DOSE <", value, "baseDose");
            return (Criteria) this;
        }

        public Criteria andBaseDoseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASE_DOSE <=", value, "baseDose");
            return (Criteria) this;
        }

        public Criteria andBaseDoseIn(List<BigDecimal> values) {
            addCriterion("BASE_DOSE in", values, "baseDose");
            return (Criteria) this;
        }

        public Criteria andBaseDoseNotIn(List<BigDecimal> values) {
            addCriterion("BASE_DOSE not in", values, "baseDose");
            return (Criteria) this;
        }

        public Criteria andBaseDoseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_DOSE between", value1, value2, "baseDose");
            return (Criteria) this;
        }

        public Criteria andBaseDoseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASE_DOSE not between", value1, value2, "baseDose");
            return (Criteria) this;
        }

        public Criteria andPackQtyIsNull() {
            addCriterion("PACK_QTY is null");
            return (Criteria) this;
        }

        public Criteria andPackQtyIsNotNull() {
            addCriterion("PACK_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andPackQtyEqualTo(Short value) {
            addCriterion("PACK_QTY =", value, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyNotEqualTo(Short value) {
            addCriterion("PACK_QTY <>", value, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyGreaterThan(Short value) {
            addCriterion("PACK_QTY >", value, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyGreaterThanOrEqualTo(Short value) {
            addCriterion("PACK_QTY >=", value, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyLessThan(Short value) {
            addCriterion("PACK_QTY <", value, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyLessThanOrEqualTo(Short value) {
            addCriterion("PACK_QTY <=", value, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyIn(List<Short> values) {
            addCriterion("PACK_QTY in", values, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyNotIn(List<Short> values) {
            addCriterion("PACK_QTY not in", values, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyBetween(Short value1, Short value2) {
            addCriterion("PACK_QTY between", value1, value2, "packQty");
            return (Criteria) this;
        }

        public Criteria andPackQtyNotBetween(Short value1, Short value2) {
            addCriterion("PACK_QTY not between", value1, value2, "packQty");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIsNull() {
            addCriterion("PRICE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIsNotNull() {
            addCriterion("PRICE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andPriceUnitEqualTo(String value) {
            addCriterion("PRICE_UNIT =", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitNotEqualTo(String value) {
            addCriterion("PRICE_UNIT <>", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitGreaterThan(String value) {
            addCriterion("PRICE_UNIT >", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitGreaterThanOrEqualTo(String value) {
            addCriterion("PRICE_UNIT >=", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitLessThan(String value) {
            addCriterion("PRICE_UNIT <", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitLessThanOrEqualTo(String value) {
            addCriterion("PRICE_UNIT <=", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitLike(String value) {
            addCriterion("PRICE_UNIT like", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitNotLike(String value) {
            addCriterion("PRICE_UNIT not like", value, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitIn(List<String> values) {
            addCriterion("PRICE_UNIT in", values, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitNotIn(List<String> values) {
            addCriterion("PRICE_UNIT not in", values, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitBetween(String value1, String value2) {
            addCriterion("PRICE_UNIT between", value1, value2, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPriceUnitNotBetween(String value1, String value2) {
            addCriterion("PRICE_UNIT not between", value1, value2, "priceUnit");
            return (Criteria) this;
        }

        public Criteria andPubCostIsNull() {
            addCriterion("PUB_COST is null");
            return (Criteria) this;
        }

        public Criteria andPubCostIsNotNull() {
            addCriterion("PUB_COST is not null");
            return (Criteria) this;
        }

        public Criteria andPubCostEqualTo(BigDecimal value) {
            addCriterion("PUB_COST =", value, "pubCost");
            return (Criteria) this;
        }

        public Criteria andPubCostNotEqualTo(BigDecimal value) {
            addCriterion("PUB_COST <>", value, "pubCost");
            return (Criteria) this;
        }

        public Criteria andPubCostGreaterThan(BigDecimal value) {
            addCriterion("PUB_COST >", value, "pubCost");
            return (Criteria) this;
        }

        public Criteria andPubCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PUB_COST >=", value, "pubCost");
            return (Criteria) this;
        }

        public Criteria andPubCostLessThan(BigDecimal value) {
            addCriterion("PUB_COST <", value, "pubCost");
            return (Criteria) this;
        }

        public Criteria andPubCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PUB_COST <=", value, "pubCost");
            return (Criteria) this;
        }

        public Criteria andPubCostIn(List<BigDecimal> values) {
            addCriterion("PUB_COST in", values, "pubCost");
            return (Criteria) this;
        }

        public Criteria andPubCostNotIn(List<BigDecimal> values) {
            addCriterion("PUB_COST not in", values, "pubCost");
            return (Criteria) this;
        }

        public Criteria andPubCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PUB_COST between", value1, value2, "pubCost");
            return (Criteria) this;
        }

        public Criteria andPubCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PUB_COST not between", value1, value2, "pubCost");
            return (Criteria) this;
        }

        public Criteria andPayCostIsNull() {
            addCriterion("PAY_COST is null");
            return (Criteria) this;
        }

        public Criteria andPayCostIsNotNull() {
            addCriterion("PAY_COST is not null");
            return (Criteria) this;
        }

        public Criteria andPayCostEqualTo(BigDecimal value) {
            addCriterion("PAY_COST =", value, "payCost");
            return (Criteria) this;
        }

        public Criteria andPayCostNotEqualTo(BigDecimal value) {
            addCriterion("PAY_COST <>", value, "payCost");
            return (Criteria) this;
        }

        public Criteria andPayCostGreaterThan(BigDecimal value) {
            addCriterion("PAY_COST >", value, "payCost");
            return (Criteria) this;
        }

        public Criteria andPayCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_COST >=", value, "payCost");
            return (Criteria) this;
        }

        public Criteria andPayCostLessThan(BigDecimal value) {
            addCriterion("PAY_COST <", value, "payCost");
            return (Criteria) this;
        }

        public Criteria andPayCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAY_COST <=", value, "payCost");
            return (Criteria) this;
        }

        public Criteria andPayCostIn(List<BigDecimal> values) {
            addCriterion("PAY_COST in", values, "payCost");
            return (Criteria) this;
        }

        public Criteria andPayCostNotIn(List<BigDecimal> values) {
            addCriterion("PAY_COST not in", values, "payCost");
            return (Criteria) this;
        }

        public Criteria andPayCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_COST between", value1, value2, "payCost");
            return (Criteria) this;
        }

        public Criteria andPayCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAY_COST not between", value1, value2, "payCost");
            return (Criteria) this;
        }

        public Criteria andOwnCostIsNull() {
            addCriterion("OWN_COST is null");
            return (Criteria) this;
        }

        public Criteria andOwnCostIsNotNull() {
            addCriterion("OWN_COST is not null");
            return (Criteria) this;
        }

        public Criteria andOwnCostEqualTo(BigDecimal value) {
            addCriterion("OWN_COST =", value, "ownCost");
            return (Criteria) this;
        }

        public Criteria andOwnCostNotEqualTo(BigDecimal value) {
            addCriterion("OWN_COST <>", value, "ownCost");
            return (Criteria) this;
        }

        public Criteria andOwnCostGreaterThan(BigDecimal value) {
            addCriterion("OWN_COST >", value, "ownCost");
            return (Criteria) this;
        }

        public Criteria andOwnCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OWN_COST >=", value, "ownCost");
            return (Criteria) this;
        }

        public Criteria andOwnCostLessThan(BigDecimal value) {
            addCriterion("OWN_COST <", value, "ownCost");
            return (Criteria) this;
        }

        public Criteria andOwnCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OWN_COST <=", value, "ownCost");
            return (Criteria) this;
        }

        public Criteria andOwnCostIn(List<BigDecimal> values) {
            addCriterion("OWN_COST in", values, "ownCost");
            return (Criteria) this;
        }

        public Criteria andOwnCostNotIn(List<BigDecimal> values) {
            addCriterion("OWN_COST not in", values, "ownCost");
            return (Criteria) this;
        }

        public Criteria andOwnCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OWN_COST between", value1, value2, "ownCost");
            return (Criteria) this;
        }

        public Criteria andOwnCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OWN_COST not between", value1, value2, "ownCost");
            return (Criteria) this;
        }

        public Criteria andExecDpcdIsNull() {
            addCriterion("EXEC_DPCD is null");
            return (Criteria) this;
        }

        public Criteria andExecDpcdIsNotNull() {
            addCriterion("EXEC_DPCD is not null");
            return (Criteria) this;
        }

        public Criteria andExecDpcdEqualTo(String value) {
            addCriterion("EXEC_DPCD =", value, "execDpcd");
            return (Criteria) this;
        }

        public Criteria andExecDpcdNotEqualTo(String value) {
            addCriterion("EXEC_DPCD <>", value, "execDpcd");
            return (Criteria) this;
        }

        public Criteria andExecDpcdGreaterThan(String value) {
            addCriterion("EXEC_DPCD >", value, "execDpcd");
            return (Criteria) this;
        }

        public Criteria andExecDpcdGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_DPCD >=", value, "execDpcd");
            return (Criteria) this;
        }

        public Criteria andExecDpcdLessThan(String value) {
            addCriterion("EXEC_DPCD <", value, "execDpcd");
            return (Criteria) this;
        }

        public Criteria andExecDpcdLessThanOrEqualTo(String value) {
            addCriterion("EXEC_DPCD <=", value, "execDpcd");
            return (Criteria) this;
        }

        public Criteria andExecDpcdLike(String value) {
            addCriterion("EXEC_DPCD like", value, "execDpcd");
            return (Criteria) this;
        }

        public Criteria andExecDpcdNotLike(String value) {
            addCriterion("EXEC_DPCD not like", value, "execDpcd");
            return (Criteria) this;
        }

        public Criteria andExecDpcdIn(List<String> values) {
            addCriterion("EXEC_DPCD in", values, "execDpcd");
            return (Criteria) this;
        }

        public Criteria andExecDpcdNotIn(List<String> values) {
            addCriterion("EXEC_DPCD not in", values, "execDpcd");
            return (Criteria) this;
        }

        public Criteria andExecDpcdBetween(String value1, String value2) {
            addCriterion("EXEC_DPCD between", value1, value2, "execDpcd");
            return (Criteria) this;
        }

        public Criteria andExecDpcdNotBetween(String value1, String value2) {
            addCriterion("EXEC_DPCD not between", value1, value2, "execDpcd");
            return (Criteria) this;
        }

        public Criteria andExecDpnmIsNull() {
            addCriterion("EXEC_DPNM is null");
            return (Criteria) this;
        }

        public Criteria andExecDpnmIsNotNull() {
            addCriterion("EXEC_DPNM is not null");
            return (Criteria) this;
        }

        public Criteria andExecDpnmEqualTo(String value) {
            addCriterion("EXEC_DPNM =", value, "execDpnm");
            return (Criteria) this;
        }

        public Criteria andExecDpnmNotEqualTo(String value) {
            addCriterion("EXEC_DPNM <>", value, "execDpnm");
            return (Criteria) this;
        }

        public Criteria andExecDpnmGreaterThan(String value) {
            addCriterion("EXEC_DPNM >", value, "execDpnm");
            return (Criteria) this;
        }

        public Criteria andExecDpnmGreaterThanOrEqualTo(String value) {
            addCriterion("EXEC_DPNM >=", value, "execDpnm");
            return (Criteria) this;
        }

        public Criteria andExecDpnmLessThan(String value) {
            addCriterion("EXEC_DPNM <", value, "execDpnm");
            return (Criteria) this;
        }

        public Criteria andExecDpnmLessThanOrEqualTo(String value) {
            addCriterion("EXEC_DPNM <=", value, "execDpnm");
            return (Criteria) this;
        }

        public Criteria andExecDpnmLike(String value) {
            addCriterion("EXEC_DPNM like", value, "execDpnm");
            return (Criteria) this;
        }

        public Criteria andExecDpnmNotLike(String value) {
            addCriterion("EXEC_DPNM not like", value, "execDpnm");
            return (Criteria) this;
        }

        public Criteria andExecDpnmIn(List<String> values) {
            addCriterion("EXEC_DPNM in", values, "execDpnm");
            return (Criteria) this;
        }

        public Criteria andExecDpnmNotIn(List<String> values) {
            addCriterion("EXEC_DPNM not in", values, "execDpnm");
            return (Criteria) this;
        }

        public Criteria andExecDpnmBetween(String value1, String value2) {
            addCriterion("EXEC_DPNM between", value1, value2, "execDpnm");
            return (Criteria) this;
        }

        public Criteria andExecDpnmNotBetween(String value1, String value2) {
            addCriterion("EXEC_DPNM not between", value1, value2, "execDpnm");
            return (Criteria) this;
        }

        public Criteria andCenterCodeIsNull() {
            addCriterion("CENTER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCenterCodeIsNotNull() {
            addCriterion("CENTER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCenterCodeEqualTo(String value) {
            addCriterion("CENTER_CODE =", value, "centerCode");
            return (Criteria) this;
        }

        public Criteria andCenterCodeNotEqualTo(String value) {
            addCriterion("CENTER_CODE <>", value, "centerCode");
            return (Criteria) this;
        }

        public Criteria andCenterCodeGreaterThan(String value) {
            addCriterion("CENTER_CODE >", value, "centerCode");
            return (Criteria) this;
        }

        public Criteria andCenterCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CENTER_CODE >=", value, "centerCode");
            return (Criteria) this;
        }

        public Criteria andCenterCodeLessThan(String value) {
            addCriterion("CENTER_CODE <", value, "centerCode");
            return (Criteria) this;
        }

        public Criteria andCenterCodeLessThanOrEqualTo(String value) {
            addCriterion("CENTER_CODE <=", value, "centerCode");
            return (Criteria) this;
        }

        public Criteria andCenterCodeLike(String value) {
            addCriterion("CENTER_CODE like", value, "centerCode");
            return (Criteria) this;
        }

        public Criteria andCenterCodeNotLike(String value) {
            addCriterion("CENTER_CODE not like", value, "centerCode");
            return (Criteria) this;
        }

        public Criteria andCenterCodeIn(List<String> values) {
            addCriterion("CENTER_CODE in", values, "centerCode");
            return (Criteria) this;
        }

        public Criteria andCenterCodeNotIn(List<String> values) {
            addCriterion("CENTER_CODE not in", values, "centerCode");
            return (Criteria) this;
        }

        public Criteria andCenterCodeBetween(String value1, String value2) {
            addCriterion("CENTER_CODE between", value1, value2, "centerCode");
            return (Criteria) this;
        }

        public Criteria andCenterCodeNotBetween(String value1, String value2) {
            addCriterion("CENTER_CODE not between", value1, value2, "centerCode");
            return (Criteria) this;
        }

        public Criteria andItemGradeIsNull() {
            addCriterion("ITEM_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andItemGradeIsNotNull() {
            addCriterion("ITEM_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andItemGradeEqualTo(String value) {
            addCriterion("ITEM_GRADE =", value, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeNotEqualTo(String value) {
            addCriterion("ITEM_GRADE <>", value, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeGreaterThan(String value) {
            addCriterion("ITEM_GRADE >", value, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_GRADE >=", value, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeLessThan(String value) {
            addCriterion("ITEM_GRADE <", value, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeLessThanOrEqualTo(String value) {
            addCriterion("ITEM_GRADE <=", value, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeLike(String value) {
            addCriterion("ITEM_GRADE like", value, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeNotLike(String value) {
            addCriterion("ITEM_GRADE not like", value, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeIn(List<String> values) {
            addCriterion("ITEM_GRADE in", values, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeNotIn(List<String> values) {
            addCriterion("ITEM_GRADE not in", values, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeBetween(String value1, String value2) {
            addCriterion("ITEM_GRADE between", value1, value2, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andItemGradeNotBetween(String value1, String value2) {
            addCriterion("ITEM_GRADE not between", value1, value2, "itemGrade");
            return (Criteria) this;
        }

        public Criteria andMainDrugIsNull() {
            addCriterion("MAIN_DRUG is null");
            return (Criteria) this;
        }

        public Criteria andMainDrugIsNotNull() {
            addCriterion("MAIN_DRUG is not null");
            return (Criteria) this;
        }

        public Criteria andMainDrugEqualTo(String value) {
            addCriterion("MAIN_DRUG =", value, "mainDrug");
            return (Criteria) this;
        }

        public Criteria andMainDrugNotEqualTo(String value) {
            addCriterion("MAIN_DRUG <>", value, "mainDrug");
            return (Criteria) this;
        }

        public Criteria andMainDrugGreaterThan(String value) {
            addCriterion("MAIN_DRUG >", value, "mainDrug");
            return (Criteria) this;
        }

        public Criteria andMainDrugGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_DRUG >=", value, "mainDrug");
            return (Criteria) this;
        }

        public Criteria andMainDrugLessThan(String value) {
            addCriterion("MAIN_DRUG <", value, "mainDrug");
            return (Criteria) this;
        }

        public Criteria andMainDrugLessThanOrEqualTo(String value) {
            addCriterion("MAIN_DRUG <=", value, "mainDrug");
            return (Criteria) this;
        }

        public Criteria andMainDrugLike(String value) {
            addCriterion("MAIN_DRUG like", value, "mainDrug");
            return (Criteria) this;
        }

        public Criteria andMainDrugNotLike(String value) {
            addCriterion("MAIN_DRUG not like", value, "mainDrug");
            return (Criteria) this;
        }

        public Criteria andMainDrugIn(List<String> values) {
            addCriterion("MAIN_DRUG in", values, "mainDrug");
            return (Criteria) this;
        }

        public Criteria andMainDrugNotIn(List<String> values) {
            addCriterion("MAIN_DRUG not in", values, "mainDrug");
            return (Criteria) this;
        }

        public Criteria andMainDrugBetween(String value1, String value2) {
            addCriterion("MAIN_DRUG between", value1, value2, "mainDrug");
            return (Criteria) this;
        }

        public Criteria andMainDrugNotBetween(String value1, String value2) {
            addCriterion("MAIN_DRUG not between", value1, value2, "mainDrug");
            return (Criteria) this;
        }

        public Criteria andCombNoIsNull() {
            addCriterion("COMB_NO is null");
            return (Criteria) this;
        }

        public Criteria andCombNoIsNotNull() {
            addCriterion("COMB_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCombNoEqualTo(String value) {
            addCriterion("COMB_NO =", value, "combNo");
            return (Criteria) this;
        }

        public Criteria andCombNoNotEqualTo(String value) {
            addCriterion("COMB_NO <>", value, "combNo");
            return (Criteria) this;
        }

        public Criteria andCombNoGreaterThan(String value) {
            addCriterion("COMB_NO >", value, "combNo");
            return (Criteria) this;
        }

        public Criteria andCombNoGreaterThanOrEqualTo(String value) {
            addCriterion("COMB_NO >=", value, "combNo");
            return (Criteria) this;
        }

        public Criteria andCombNoLessThan(String value) {
            addCriterion("COMB_NO <", value, "combNo");
            return (Criteria) this;
        }

        public Criteria andCombNoLessThanOrEqualTo(String value) {
            addCriterion("COMB_NO <=", value, "combNo");
            return (Criteria) this;
        }

        public Criteria andCombNoLike(String value) {
            addCriterion("COMB_NO like", value, "combNo");
            return (Criteria) this;
        }

        public Criteria andCombNoNotLike(String value) {
            addCriterion("COMB_NO not like", value, "combNo");
            return (Criteria) this;
        }

        public Criteria andCombNoIn(List<String> values) {
            addCriterion("COMB_NO in", values, "combNo");
            return (Criteria) this;
        }

        public Criteria andCombNoNotIn(List<String> values) {
            addCriterion("COMB_NO not in", values, "combNo");
            return (Criteria) this;
        }

        public Criteria andCombNoBetween(String value1, String value2) {
            addCriterion("COMB_NO between", value1, value2, "combNo");
            return (Criteria) this;
        }

        public Criteria andCombNoNotBetween(String value1, String value2) {
            addCriterion("COMB_NO not between", value1, value2, "combNo");
            return (Criteria) this;
        }

        public Criteria andOperCodeIsNull() {
            addCriterion("OPER_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOperCodeIsNotNull() {
            addCriterion("OPER_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOperCodeEqualTo(String value) {
            addCriterion("OPER_CODE =", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeNotEqualTo(String value) {
            addCriterion("OPER_CODE <>", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeGreaterThan(String value) {
            addCriterion("OPER_CODE >", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_CODE >=", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeLessThan(String value) {
            addCriterion("OPER_CODE <", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeLessThanOrEqualTo(String value) {
            addCriterion("OPER_CODE <=", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeLike(String value) {
            addCriterion("OPER_CODE like", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeNotLike(String value) {
            addCriterion("OPER_CODE not like", value, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeIn(List<String> values) {
            addCriterion("OPER_CODE in", values, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeNotIn(List<String> values) {
            addCriterion("OPER_CODE not in", values, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeBetween(String value1, String value2) {
            addCriterion("OPER_CODE between", value1, value2, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperCodeNotBetween(String value1, String value2) {
            addCriterion("OPER_CODE not between", value1, value2, "operCode");
            return (Criteria) this;
        }

        public Criteria andOperDateIsNull() {
            addCriterion("OPER_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOperDateIsNotNull() {
            addCriterion("OPER_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOperDateEqualTo(Date value) {
            addCriterion("OPER_DATE =", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateNotEqualTo(Date value) {
            addCriterion("OPER_DATE <>", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateGreaterThan(Date value) {
            addCriterion("OPER_DATE >", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateGreaterThanOrEqualTo(Date value) {
            addCriterion("OPER_DATE >=", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateLessThan(Date value) {
            addCriterion("OPER_DATE <", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateLessThanOrEqualTo(Date value) {
            addCriterion("OPER_DATE <=", value, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateIn(List<Date> values) {
            addCriterion("OPER_DATE in", values, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateNotIn(List<Date> values) {
            addCriterion("OPER_DATE not in", values, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateBetween(Date value1, Date value2) {
            addCriterion("OPER_DATE between", value1, value2, "operDate");
            return (Criteria) this;
        }

        public Criteria andOperDateNotBetween(Date value1, Date value2) {
            addCriterion("OPER_DATE not between", value1, value2, "operDate");
            return (Criteria) this;
        }

        public Criteria andPayFlagIsNull() {
            addCriterion("PAY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPayFlagIsNotNull() {
            addCriterion("PAY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPayFlagEqualTo(String value) {
            addCriterion("PAY_FLAG =", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotEqualTo(String value) {
            addCriterion("PAY_FLAG <>", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagGreaterThan(String value) {
            addCriterion("PAY_FLAG >", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_FLAG >=", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagLessThan(String value) {
            addCriterion("PAY_FLAG <", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagLessThanOrEqualTo(String value) {
            addCriterion("PAY_FLAG <=", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagLike(String value) {
            addCriterion("PAY_FLAG like", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotLike(String value) {
            addCriterion("PAY_FLAG not like", value, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagIn(List<String> values) {
            addCriterion("PAY_FLAG in", values, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotIn(List<String> values) {
            addCriterion("PAY_FLAG not in", values, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagBetween(String value1, String value2) {
            addCriterion("PAY_FLAG between", value1, value2, "payFlag");
            return (Criteria) this;
        }

        public Criteria andPayFlagNotBetween(String value1, String value2) {
            addCriterion("PAY_FLAG not between", value1, value2, "payFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagIsNull() {
            addCriterion("CANCEL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCancelFlagIsNotNull() {
            addCriterion("CANCEL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCancelFlagEqualTo(String value) {
            addCriterion("CANCEL_FLAG =", value, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagNotEqualTo(String value) {
            addCriterion("CANCEL_FLAG <>", value, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagGreaterThan(String value) {
            addCriterion("CANCEL_FLAG >", value, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_FLAG >=", value, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagLessThan(String value) {
            addCriterion("CANCEL_FLAG <", value, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_FLAG <=", value, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagLike(String value) {
            addCriterion("CANCEL_FLAG like", value, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagNotLike(String value) {
            addCriterion("CANCEL_FLAG not like", value, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagIn(List<String> values) {
            addCriterion("CANCEL_FLAG in", values, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagNotIn(List<String> values) {
            addCriterion("CANCEL_FLAG not in", values, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagBetween(String value1, String value2) {
            addCriterion("CANCEL_FLAG between", value1, value2, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andCancelFlagNotBetween(String value1, String value2) {
            addCriterion("CANCEL_FLAG not between", value1, value2, "cancelFlag");
            return (Criteria) this;
        }

        public Criteria andFeeCpcdIsNull() {
            addCriterion("FEE_CPCD is null");
            return (Criteria) this;
        }

        public Criteria andFeeCpcdIsNotNull() {
            addCriterion("FEE_CPCD is not null");
            return (Criteria) this;
        }

        public Criteria andFeeCpcdEqualTo(String value) {
            addCriterion("FEE_CPCD =", value, "feeCpcd");
            return (Criteria) this;
        }

        public Criteria andFeeCpcdNotEqualTo(String value) {
            addCriterion("FEE_CPCD <>", value, "feeCpcd");
            return (Criteria) this;
        }

        public Criteria andFeeCpcdGreaterThan(String value) {
            addCriterion("FEE_CPCD >", value, "feeCpcd");
            return (Criteria) this;
        }

        public Criteria andFeeCpcdGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_CPCD >=", value, "feeCpcd");
            return (Criteria) this;
        }

        public Criteria andFeeCpcdLessThan(String value) {
            addCriterion("FEE_CPCD <", value, "feeCpcd");
            return (Criteria) this;
        }

        public Criteria andFeeCpcdLessThanOrEqualTo(String value) {
            addCriterion("FEE_CPCD <=", value, "feeCpcd");
            return (Criteria) this;
        }

        public Criteria andFeeCpcdLike(String value) {
            addCriterion("FEE_CPCD like", value, "feeCpcd");
            return (Criteria) this;
        }

        public Criteria andFeeCpcdNotLike(String value) {
            addCriterion("FEE_CPCD not like", value, "feeCpcd");
            return (Criteria) this;
        }

        public Criteria andFeeCpcdIn(List<String> values) {
            addCriterion("FEE_CPCD in", values, "feeCpcd");
            return (Criteria) this;
        }

        public Criteria andFeeCpcdNotIn(List<String> values) {
            addCriterion("FEE_CPCD not in", values, "feeCpcd");
            return (Criteria) this;
        }

        public Criteria andFeeCpcdBetween(String value1, String value2) {
            addCriterion("FEE_CPCD between", value1, value2, "feeCpcd");
            return (Criteria) this;
        }

        public Criteria andFeeCpcdNotBetween(String value1, String value2) {
            addCriterion("FEE_CPCD not between", value1, value2, "feeCpcd");
            return (Criteria) this;
        }

        public Criteria andFeeDateIsNull() {
            addCriterion("FEE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFeeDateIsNotNull() {
            addCriterion("FEE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeDateEqualTo(Date value) {
            addCriterion("FEE_DATE =", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateNotEqualTo(Date value) {
            addCriterion("FEE_DATE <>", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateGreaterThan(Date value) {
            addCriterion("FEE_DATE >", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FEE_DATE >=", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateLessThan(Date value) {
            addCriterion("FEE_DATE <", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateLessThanOrEqualTo(Date value) {
            addCriterion("FEE_DATE <=", value, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateIn(List<Date> values) {
            addCriterion("FEE_DATE in", values, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateNotIn(List<Date> values) {
            addCriterion("FEE_DATE not in", values, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateBetween(Date value1, Date value2) {
            addCriterion("FEE_DATE between", value1, value2, "feeDate");
            return (Criteria) this;
        }

        public Criteria andFeeDateNotBetween(Date value1, Date value2) {
            addCriterion("FEE_DATE not between", value1, value2, "feeDate");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNull() {
            addCriterion("INVOICE_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIsNotNull() {
            addCriterion("INVOICE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoEqualTo(String value) {
            addCriterion("INVOICE_NO =", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotEqualTo(String value) {
            addCriterion("INVOICE_NO <>", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThan(String value) {
            addCriterion("INVOICE_NO >", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_NO >=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThan(String value) {
            addCriterion("INVOICE_NO <", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_NO <=", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoLike(String value) {
            addCriterion("INVOICE_NO like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotLike(String value) {
            addCriterion("INVOICE_NO not like", value, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoIn(List<String> values) {
            addCriterion("INVOICE_NO in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotIn(List<String> values) {
            addCriterion("INVOICE_NO not in", values, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoBetween(String value1, String value2) {
            addCriterion("INVOICE_NO between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceNoNotBetween(String value1, String value2) {
            addCriterion("INVOICE_NO not between", value1, value2, "invoiceNo");
            return (Criteria) this;
        }

        public Criteria andInvoCodeIsNull() {
            addCriterion("INVO_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInvoCodeIsNotNull() {
            addCriterion("INVO_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoCodeEqualTo(String value) {
            addCriterion("INVO_CODE =", value, "invoCode");
            return (Criteria) this;
        }

        public Criteria andInvoCodeNotEqualTo(String value) {
            addCriterion("INVO_CODE <>", value, "invoCode");
            return (Criteria) this;
        }

        public Criteria andInvoCodeGreaterThan(String value) {
            addCriterion("INVO_CODE >", value, "invoCode");
            return (Criteria) this;
        }

        public Criteria andInvoCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INVO_CODE >=", value, "invoCode");
            return (Criteria) this;
        }

        public Criteria andInvoCodeLessThan(String value) {
            addCriterion("INVO_CODE <", value, "invoCode");
            return (Criteria) this;
        }

        public Criteria andInvoCodeLessThanOrEqualTo(String value) {
            addCriterion("INVO_CODE <=", value, "invoCode");
            return (Criteria) this;
        }

        public Criteria andInvoCodeLike(String value) {
            addCriterion("INVO_CODE like", value, "invoCode");
            return (Criteria) this;
        }

        public Criteria andInvoCodeNotLike(String value) {
            addCriterion("INVO_CODE not like", value, "invoCode");
            return (Criteria) this;
        }

        public Criteria andInvoCodeIn(List<String> values) {
            addCriterion("INVO_CODE in", values, "invoCode");
            return (Criteria) this;
        }

        public Criteria andInvoCodeNotIn(List<String> values) {
            addCriterion("INVO_CODE not in", values, "invoCode");
            return (Criteria) this;
        }

        public Criteria andInvoCodeBetween(String value1, String value2) {
            addCriterion("INVO_CODE between", value1, value2, "invoCode");
            return (Criteria) this;
        }

        public Criteria andInvoCodeNotBetween(String value1, String value2) {
            addCriterion("INVO_CODE not between", value1, value2, "invoCode");
            return (Criteria) this;
        }

        public Criteria andInvoSequenceIsNull() {
            addCriterion("INVO_SEQUENCE is null");
            return (Criteria) this;
        }

        public Criteria andInvoSequenceIsNotNull() {
            addCriterion("INVO_SEQUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoSequenceEqualTo(String value) {
            addCriterion("INVO_SEQUENCE =", value, "invoSequence");
            return (Criteria) this;
        }

        public Criteria andInvoSequenceNotEqualTo(String value) {
            addCriterion("INVO_SEQUENCE <>", value, "invoSequence");
            return (Criteria) this;
        }

        public Criteria andInvoSequenceGreaterThan(String value) {
            addCriterion("INVO_SEQUENCE >", value, "invoSequence");
            return (Criteria) this;
        }

        public Criteria andInvoSequenceGreaterThanOrEqualTo(String value) {
            addCriterion("INVO_SEQUENCE >=", value, "invoSequence");
            return (Criteria) this;
        }

        public Criteria andInvoSequenceLessThan(String value) {
            addCriterion("INVO_SEQUENCE <", value, "invoSequence");
            return (Criteria) this;
        }

        public Criteria andInvoSequenceLessThanOrEqualTo(String value) {
            addCriterion("INVO_SEQUENCE <=", value, "invoSequence");
            return (Criteria) this;
        }

        public Criteria andInvoSequenceLike(String value) {
            addCriterion("INVO_SEQUENCE like", value, "invoSequence");
            return (Criteria) this;
        }

        public Criteria andInvoSequenceNotLike(String value) {
            addCriterion("INVO_SEQUENCE not like", value, "invoSequence");
            return (Criteria) this;
        }

        public Criteria andInvoSequenceIn(List<String> values) {
            addCriterion("INVO_SEQUENCE in", values, "invoSequence");
            return (Criteria) this;
        }

        public Criteria andInvoSequenceNotIn(List<String> values) {
            addCriterion("INVO_SEQUENCE not in", values, "invoSequence");
            return (Criteria) this;
        }

        public Criteria andInvoSequenceBetween(String value1, String value2) {
            addCriterion("INVO_SEQUENCE between", value1, value2, "invoSequence");
            return (Criteria) this;
        }

        public Criteria andInvoSequenceNotBetween(String value1, String value2) {
            addCriterion("INVO_SEQUENCE not between", value1, value2, "invoSequence");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagIsNull() {
            addCriterion("CONFIRM_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagIsNotNull() {
            addCriterion("CONFIRM_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagEqualTo(String value) {
            addCriterion("CONFIRM_FLAG =", value, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagNotEqualTo(String value) {
            addCriterion("CONFIRM_FLAG <>", value, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagGreaterThan(String value) {
            addCriterion("CONFIRM_FLAG >", value, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM_FLAG >=", value, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagLessThan(String value) {
            addCriterion("CONFIRM_FLAG <", value, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM_FLAG <=", value, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagLike(String value) {
            addCriterion("CONFIRM_FLAG like", value, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagNotLike(String value) {
            addCriterion("CONFIRM_FLAG not like", value, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagIn(List<String> values) {
            addCriterion("CONFIRM_FLAG in", values, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagNotIn(List<String> values) {
            addCriterion("CONFIRM_FLAG not in", values, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagBetween(String value1, String value2) {
            addCriterion("CONFIRM_FLAG between", value1, value2, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmFlagNotBetween(String value1, String value2) {
            addCriterion("CONFIRM_FLAG not between", value1, value2, "confirmFlag");
            return (Criteria) this;
        }

        public Criteria andConfirmCodeIsNull() {
            addCriterion("CONFIRM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andConfirmCodeIsNotNull() {
            addCriterion("CONFIRM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmCodeEqualTo(String value) {
            addCriterion("CONFIRM_CODE =", value, "confirmCode");
            return (Criteria) this;
        }

        public Criteria andConfirmCodeNotEqualTo(String value) {
            addCriterion("CONFIRM_CODE <>", value, "confirmCode");
            return (Criteria) this;
        }

        public Criteria andConfirmCodeGreaterThan(String value) {
            addCriterion("CONFIRM_CODE >", value, "confirmCode");
            return (Criteria) this;
        }

        public Criteria andConfirmCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM_CODE >=", value, "confirmCode");
            return (Criteria) this;
        }

        public Criteria andConfirmCodeLessThan(String value) {
            addCriterion("CONFIRM_CODE <", value, "confirmCode");
            return (Criteria) this;
        }

        public Criteria andConfirmCodeLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM_CODE <=", value, "confirmCode");
            return (Criteria) this;
        }

        public Criteria andConfirmCodeLike(String value) {
            addCriterion("CONFIRM_CODE like", value, "confirmCode");
            return (Criteria) this;
        }

        public Criteria andConfirmCodeNotLike(String value) {
            addCriterion("CONFIRM_CODE not like", value, "confirmCode");
            return (Criteria) this;
        }

        public Criteria andConfirmCodeIn(List<String> values) {
            addCriterion("CONFIRM_CODE in", values, "confirmCode");
            return (Criteria) this;
        }

        public Criteria andConfirmCodeNotIn(List<String> values) {
            addCriterion("CONFIRM_CODE not in", values, "confirmCode");
            return (Criteria) this;
        }

        public Criteria andConfirmCodeBetween(String value1, String value2) {
            addCriterion("CONFIRM_CODE between", value1, value2, "confirmCode");
            return (Criteria) this;
        }

        public Criteria andConfirmCodeNotBetween(String value1, String value2) {
            addCriterion("CONFIRM_CODE not between", value1, value2, "confirmCode");
            return (Criteria) this;
        }

        public Criteria andConfirmDeptIsNull() {
            addCriterion("CONFIRM_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andConfirmDeptIsNotNull() {
            addCriterion("CONFIRM_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmDeptEqualTo(String value) {
            addCriterion("CONFIRM_DEPT =", value, "confirmDept");
            return (Criteria) this;
        }

        public Criteria andConfirmDeptNotEqualTo(String value) {
            addCriterion("CONFIRM_DEPT <>", value, "confirmDept");
            return (Criteria) this;
        }

        public Criteria andConfirmDeptGreaterThan(String value) {
            addCriterion("CONFIRM_DEPT >", value, "confirmDept");
            return (Criteria) this;
        }

        public Criteria andConfirmDeptGreaterThanOrEqualTo(String value) {
            addCriterion("CONFIRM_DEPT >=", value, "confirmDept");
            return (Criteria) this;
        }

        public Criteria andConfirmDeptLessThan(String value) {
            addCriterion("CONFIRM_DEPT <", value, "confirmDept");
            return (Criteria) this;
        }

        public Criteria andConfirmDeptLessThanOrEqualTo(String value) {
            addCriterion("CONFIRM_DEPT <=", value, "confirmDept");
            return (Criteria) this;
        }

        public Criteria andConfirmDeptLike(String value) {
            addCriterion("CONFIRM_DEPT like", value, "confirmDept");
            return (Criteria) this;
        }

        public Criteria andConfirmDeptNotLike(String value) {
            addCriterion("CONFIRM_DEPT not like", value, "confirmDept");
            return (Criteria) this;
        }

        public Criteria andConfirmDeptIn(List<String> values) {
            addCriterion("CONFIRM_DEPT in", values, "confirmDept");
            return (Criteria) this;
        }

        public Criteria andConfirmDeptNotIn(List<String> values) {
            addCriterion("CONFIRM_DEPT not in", values, "confirmDept");
            return (Criteria) this;
        }

        public Criteria andConfirmDeptBetween(String value1, String value2) {
            addCriterion("CONFIRM_DEPT between", value1, value2, "confirmDept");
            return (Criteria) this;
        }

        public Criteria andConfirmDeptNotBetween(String value1, String value2) {
            addCriterion("CONFIRM_DEPT not between", value1, value2, "confirmDept");
            return (Criteria) this;
        }

        public Criteria andConfirmDateIsNull() {
            addCriterion("CONFIRM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andConfirmDateIsNotNull() {
            addCriterion("CONFIRM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmDateEqualTo(Date value) {
            addCriterion("CONFIRM_DATE =", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateNotEqualTo(Date value) {
            addCriterion("CONFIRM_DATE <>", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateGreaterThan(Date value) {
            addCriterion("CONFIRM_DATE >", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_DATE >=", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateLessThan(Date value) {
            addCriterion("CONFIRM_DATE <", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateLessThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_DATE <=", value, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateIn(List<Date> values) {
            addCriterion("CONFIRM_DATE in", values, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateNotIn(List<Date> values) {
            addCriterion("CONFIRM_DATE not in", values, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_DATE between", value1, value2, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andConfirmDateNotBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_DATE not between", value1, value2, "confirmDate");
            return (Criteria) this;
        }

        public Criteria andEcoCostIsNull() {
            addCriterion("ECO_COST is null");
            return (Criteria) this;
        }

        public Criteria andEcoCostIsNotNull() {
            addCriterion("ECO_COST is not null");
            return (Criteria) this;
        }

        public Criteria andEcoCostEqualTo(BigDecimal value) {
            addCriterion("ECO_COST =", value, "ecoCost");
            return (Criteria) this;
        }

        public Criteria andEcoCostNotEqualTo(BigDecimal value) {
            addCriterion("ECO_COST <>", value, "ecoCost");
            return (Criteria) this;
        }

        public Criteria andEcoCostGreaterThan(BigDecimal value) {
            addCriterion("ECO_COST >", value, "ecoCost");
            return (Criteria) this;
        }

        public Criteria andEcoCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ECO_COST >=", value, "ecoCost");
            return (Criteria) this;
        }

        public Criteria andEcoCostLessThan(BigDecimal value) {
            addCriterion("ECO_COST <", value, "ecoCost");
            return (Criteria) this;
        }

        public Criteria andEcoCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ECO_COST <=", value, "ecoCost");
            return (Criteria) this;
        }

        public Criteria andEcoCostIn(List<BigDecimal> values) {
            addCriterion("ECO_COST in", values, "ecoCost");
            return (Criteria) this;
        }

        public Criteria andEcoCostNotIn(List<BigDecimal> values) {
            addCriterion("ECO_COST not in", values, "ecoCost");
            return (Criteria) this;
        }

        public Criteria andEcoCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ECO_COST between", value1, value2, "ecoCost");
            return (Criteria) this;
        }

        public Criteria andEcoCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ECO_COST not between", value1, value2, "ecoCost");
            return (Criteria) this;
        }

        public Criteria andNewItemrateIsNull() {
            addCriterion("NEW_ITEMRATE is null");
            return (Criteria) this;
        }

        public Criteria andNewItemrateIsNotNull() {
            addCriterion("NEW_ITEMRATE is not null");
            return (Criteria) this;
        }

        public Criteria andNewItemrateEqualTo(BigDecimal value) {
            addCriterion("NEW_ITEMRATE =", value, "newItemrate");
            return (Criteria) this;
        }

        public Criteria andNewItemrateNotEqualTo(BigDecimal value) {
            addCriterion("NEW_ITEMRATE <>", value, "newItemrate");
            return (Criteria) this;
        }

        public Criteria andNewItemrateGreaterThan(BigDecimal value) {
            addCriterion("NEW_ITEMRATE >", value, "newItemrate");
            return (Criteria) this;
        }

        public Criteria andNewItemrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEW_ITEMRATE >=", value, "newItemrate");
            return (Criteria) this;
        }

        public Criteria andNewItemrateLessThan(BigDecimal value) {
            addCriterion("NEW_ITEMRATE <", value, "newItemrate");
            return (Criteria) this;
        }

        public Criteria andNewItemrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEW_ITEMRATE <=", value, "newItemrate");
            return (Criteria) this;
        }

        public Criteria andNewItemrateIn(List<BigDecimal> values) {
            addCriterion("NEW_ITEMRATE in", values, "newItemrate");
            return (Criteria) this;
        }

        public Criteria andNewItemrateNotIn(List<BigDecimal> values) {
            addCriterion("NEW_ITEMRATE not in", values, "newItemrate");
            return (Criteria) this;
        }

        public Criteria andNewItemrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEW_ITEMRATE between", value1, value2, "newItemrate");
            return (Criteria) this;
        }

        public Criteria andNewItemrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEW_ITEMRATE not between", value1, value2, "newItemrate");
            return (Criteria) this;
        }

        public Criteria andOldItemrateIsNull() {
            addCriterion("OLD_ITEMRATE is null");
            return (Criteria) this;
        }

        public Criteria andOldItemrateIsNotNull() {
            addCriterion("OLD_ITEMRATE is not null");
            return (Criteria) this;
        }

        public Criteria andOldItemrateEqualTo(BigDecimal value) {
            addCriterion("OLD_ITEMRATE =", value, "oldItemrate");
            return (Criteria) this;
        }

        public Criteria andOldItemrateNotEqualTo(BigDecimal value) {
            addCriterion("OLD_ITEMRATE <>", value, "oldItemrate");
            return (Criteria) this;
        }

        public Criteria andOldItemrateGreaterThan(BigDecimal value) {
            addCriterion("OLD_ITEMRATE >", value, "oldItemrate");
            return (Criteria) this;
        }

        public Criteria andOldItemrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OLD_ITEMRATE >=", value, "oldItemrate");
            return (Criteria) this;
        }

        public Criteria andOldItemrateLessThan(BigDecimal value) {
            addCriterion("OLD_ITEMRATE <", value, "oldItemrate");
            return (Criteria) this;
        }

        public Criteria andOldItemrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OLD_ITEMRATE <=", value, "oldItemrate");
            return (Criteria) this;
        }

        public Criteria andOldItemrateIn(List<BigDecimal> values) {
            addCriterion("OLD_ITEMRATE in", values, "oldItemrate");
            return (Criteria) this;
        }

        public Criteria andOldItemrateNotIn(List<BigDecimal> values) {
            addCriterion("OLD_ITEMRATE not in", values, "oldItemrate");
            return (Criteria) this;
        }

        public Criteria andOldItemrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OLD_ITEMRATE between", value1, value2, "oldItemrate");
            return (Criteria) this;
        }

        public Criteria andOldItemrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OLD_ITEMRATE not between", value1, value2, "oldItemrate");
            return (Criteria) this;
        }

        public Criteria andExtFlagIsNull() {
            addCriterion("EXT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andExtFlagIsNotNull() {
            addCriterion("EXT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andExtFlagEqualTo(String value) {
            addCriterion("EXT_FLAG =", value, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagNotEqualTo(String value) {
            addCriterion("EXT_FLAG <>", value, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagGreaterThan(String value) {
            addCriterion("EXT_FLAG >", value, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagGreaterThanOrEqualTo(String value) {
            addCriterion("EXT_FLAG >=", value, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagLessThan(String value) {
            addCriterion("EXT_FLAG <", value, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagLessThanOrEqualTo(String value) {
            addCriterion("EXT_FLAG <=", value, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagLike(String value) {
            addCriterion("EXT_FLAG like", value, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagNotLike(String value) {
            addCriterion("EXT_FLAG not like", value, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagIn(List<String> values) {
            addCriterion("EXT_FLAG in", values, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagNotIn(List<String> values) {
            addCriterion("EXT_FLAG not in", values, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagBetween(String value1, String value2) {
            addCriterion("EXT_FLAG between", value1, value2, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlagNotBetween(String value1, String value2) {
            addCriterion("EXT_FLAG not between", value1, value2, "extFlag");
            return (Criteria) this;
        }

        public Criteria andExtFlag1IsNull() {
            addCriterion("EXT_FLAG1 is null");
            return (Criteria) this;
        }

        public Criteria andExtFlag1IsNotNull() {
            addCriterion("EXT_FLAG1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtFlag1EqualTo(String value) {
            addCriterion("EXT_FLAG1 =", value, "extFlag1");
            return (Criteria) this;
        }

        public Criteria andExtFlag1NotEqualTo(String value) {
            addCriterion("EXT_FLAG1 <>", value, "extFlag1");
            return (Criteria) this;
        }

        public Criteria andExtFlag1GreaterThan(String value) {
            addCriterion("EXT_FLAG1 >", value, "extFlag1");
            return (Criteria) this;
        }

        public Criteria andExtFlag1GreaterThanOrEqualTo(String value) {
            addCriterion("EXT_FLAG1 >=", value, "extFlag1");
            return (Criteria) this;
        }

        public Criteria andExtFlag1LessThan(String value) {
            addCriterion("EXT_FLAG1 <", value, "extFlag1");
            return (Criteria) this;
        }

        public Criteria andExtFlag1LessThanOrEqualTo(String value) {
            addCriterion("EXT_FLAG1 <=", value, "extFlag1");
            return (Criteria) this;
        }

        public Criteria andExtFlag1Like(String value) {
            addCriterion("EXT_FLAG1 like", value, "extFlag1");
            return (Criteria) this;
        }

        public Criteria andExtFlag1NotLike(String value) {
            addCriterion("EXT_FLAG1 not like", value, "extFlag1");
            return (Criteria) this;
        }

        public Criteria andExtFlag1In(List<String> values) {
            addCriterion("EXT_FLAG1 in", values, "extFlag1");
            return (Criteria) this;
        }

        public Criteria andExtFlag1NotIn(List<String> values) {
            addCriterion("EXT_FLAG1 not in", values, "extFlag1");
            return (Criteria) this;
        }

        public Criteria andExtFlag1Between(String value1, String value2) {
            addCriterion("EXT_FLAG1 between", value1, value2, "extFlag1");
            return (Criteria) this;
        }

        public Criteria andExtFlag1NotBetween(String value1, String value2) {
            addCriterion("EXT_FLAG1 not between", value1, value2, "extFlag1");
            return (Criteria) this;
        }

        public Criteria andExtFlag2IsNull() {
            addCriterion("EXT_FLAG2 is null");
            return (Criteria) this;
        }

        public Criteria andExtFlag2IsNotNull() {
            addCriterion("EXT_FLAG2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtFlag2EqualTo(String value) {
            addCriterion("EXT_FLAG2 =", value, "extFlag2");
            return (Criteria) this;
        }

        public Criteria andExtFlag2NotEqualTo(String value) {
            addCriterion("EXT_FLAG2 <>", value, "extFlag2");
            return (Criteria) this;
        }

        public Criteria andExtFlag2GreaterThan(String value) {
            addCriterion("EXT_FLAG2 >", value, "extFlag2");
            return (Criteria) this;
        }

        public Criteria andExtFlag2GreaterThanOrEqualTo(String value) {
            addCriterion("EXT_FLAG2 >=", value, "extFlag2");
            return (Criteria) this;
        }

        public Criteria andExtFlag2LessThan(String value) {
            addCriterion("EXT_FLAG2 <", value, "extFlag2");
            return (Criteria) this;
        }

        public Criteria andExtFlag2LessThanOrEqualTo(String value) {
            addCriterion("EXT_FLAG2 <=", value, "extFlag2");
            return (Criteria) this;
        }

        public Criteria andExtFlag2Like(String value) {
            addCriterion("EXT_FLAG2 like", value, "extFlag2");
            return (Criteria) this;
        }

        public Criteria andExtFlag2NotLike(String value) {
            addCriterion("EXT_FLAG2 not like", value, "extFlag2");
            return (Criteria) this;
        }

        public Criteria andExtFlag2In(List<String> values) {
            addCriterion("EXT_FLAG2 in", values, "extFlag2");
            return (Criteria) this;
        }

        public Criteria andExtFlag2NotIn(List<String> values) {
            addCriterion("EXT_FLAG2 not in", values, "extFlag2");
            return (Criteria) this;
        }

        public Criteria andExtFlag2Between(String value1, String value2) {
            addCriterion("EXT_FLAG2 between", value1, value2, "extFlag2");
            return (Criteria) this;
        }

        public Criteria andExtFlag2NotBetween(String value1, String value2) {
            addCriterion("EXT_FLAG2 not between", value1, value2, "extFlag2");
            return (Criteria) this;
        }

        public Criteria andPactUnitFlagIsNull() {
            addCriterion("PACT_UNIT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPactUnitFlagIsNotNull() {
            addCriterion("PACT_UNIT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPactUnitFlagEqualTo(String value) {
            addCriterion("PACT_UNIT_FLAG =", value, "pactUnitFlag");
            return (Criteria) this;
        }

        public Criteria andPactUnitFlagNotEqualTo(String value) {
            addCriterion("PACT_UNIT_FLAG <>", value, "pactUnitFlag");
            return (Criteria) this;
        }

        public Criteria andPactUnitFlagGreaterThan(String value) {
            addCriterion("PACT_UNIT_FLAG >", value, "pactUnitFlag");
            return (Criteria) this;
        }

        public Criteria andPactUnitFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PACT_UNIT_FLAG >=", value, "pactUnitFlag");
            return (Criteria) this;
        }

        public Criteria andPactUnitFlagLessThan(String value) {
            addCriterion("PACT_UNIT_FLAG <", value, "pactUnitFlag");
            return (Criteria) this;
        }

        public Criteria andPactUnitFlagLessThanOrEqualTo(String value) {
            addCriterion("PACT_UNIT_FLAG <=", value, "pactUnitFlag");
            return (Criteria) this;
        }

        public Criteria andPactUnitFlagLike(String value) {
            addCriterion("PACT_UNIT_FLAG like", value, "pactUnitFlag");
            return (Criteria) this;
        }

        public Criteria andPactUnitFlagNotLike(String value) {
            addCriterion("PACT_UNIT_FLAG not like", value, "pactUnitFlag");
            return (Criteria) this;
        }

        public Criteria andPactUnitFlagIn(List<String> values) {
            addCriterion("PACT_UNIT_FLAG in", values, "pactUnitFlag");
            return (Criteria) this;
        }

        public Criteria andPactUnitFlagNotIn(List<String> values) {
            addCriterion("PACT_UNIT_FLAG not in", values, "pactUnitFlag");
            return (Criteria) this;
        }

        public Criteria andPactUnitFlagBetween(String value1, String value2) {
            addCriterion("PACT_UNIT_FLAG between", value1, value2, "pactUnitFlag");
            return (Criteria) this;
        }

        public Criteria andPactUnitFlagNotBetween(String value1, String value2) {
            addCriterion("PACT_UNIT_FLAG not between", value1, value2, "pactUnitFlag");
            return (Criteria) this;
        }

        public Criteria andPackageCodeIsNull() {
            addCriterion("PACKAGE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPackageCodeIsNotNull() {
            addCriterion("PACKAGE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPackageCodeEqualTo(String value) {
            addCriterion("PACKAGE_CODE =", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeNotEqualTo(String value) {
            addCriterion("PACKAGE_CODE <>", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeGreaterThan(String value) {
            addCriterion("PACKAGE_CODE >", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PACKAGE_CODE >=", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeLessThan(String value) {
            addCriterion("PACKAGE_CODE <", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeLessThanOrEqualTo(String value) {
            addCriterion("PACKAGE_CODE <=", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeLike(String value) {
            addCriterion("PACKAGE_CODE like", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeNotLike(String value) {
            addCriterion("PACKAGE_CODE not like", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeIn(List<String> values) {
            addCriterion("PACKAGE_CODE in", values, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeNotIn(List<String> values) {
            addCriterion("PACKAGE_CODE not in", values, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeBetween(String value1, String value2) {
            addCriterion("PACKAGE_CODE between", value1, value2, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeNotBetween(String value1, String value2) {
            addCriterion("PACKAGE_CODE not between", value1, value2, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNull() {
            addCriterion("PACKAGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNotNull() {
            addCriterion("PACKAGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNameEqualTo(String value) {
            addCriterion("PACKAGE_NAME =", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotEqualTo(String value) {
            addCriterion("PACKAGE_NAME <>", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThan(String value) {
            addCriterion("PACKAGE_NAME >", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("PACKAGE_NAME >=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThan(String value) {
            addCriterion("PACKAGE_NAME <", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThanOrEqualTo(String value) {
            addCriterion("PACKAGE_NAME <=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLike(String value) {
            addCriterion("PACKAGE_NAME like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotLike(String value) {
            addCriterion("PACKAGE_NAME not like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameIn(List<String> values) {
            addCriterion("PACKAGE_NAME in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotIn(List<String> values) {
            addCriterion("PACKAGE_NAME not in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameBetween(String value1, String value2) {
            addCriterion("PACKAGE_NAME between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotBetween(String value1, String value2) {
            addCriterion("PACKAGE_NAME not between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andNobackNumIsNull() {
            addCriterion("NOBACK_NUM is null");
            return (Criteria) this;
        }

        public Criteria andNobackNumIsNotNull() {
            addCriterion("NOBACK_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNobackNumEqualTo(BigDecimal value) {
            addCriterion("NOBACK_NUM =", value, "nobackNum");
            return (Criteria) this;
        }

        public Criteria andNobackNumNotEqualTo(BigDecimal value) {
            addCriterion("NOBACK_NUM <>", value, "nobackNum");
            return (Criteria) this;
        }

        public Criteria andNobackNumGreaterThan(BigDecimal value) {
            addCriterion("NOBACK_NUM >", value, "nobackNum");
            return (Criteria) this;
        }

        public Criteria andNobackNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NOBACK_NUM >=", value, "nobackNum");
            return (Criteria) this;
        }

        public Criteria andNobackNumLessThan(BigDecimal value) {
            addCriterion("NOBACK_NUM <", value, "nobackNum");
            return (Criteria) this;
        }

        public Criteria andNobackNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NOBACK_NUM <=", value, "nobackNum");
            return (Criteria) this;
        }

        public Criteria andNobackNumIn(List<BigDecimal> values) {
            addCriterion("NOBACK_NUM in", values, "nobackNum");
            return (Criteria) this;
        }

        public Criteria andNobackNumNotIn(List<BigDecimal> values) {
            addCriterion("NOBACK_NUM not in", values, "nobackNum");
            return (Criteria) this;
        }

        public Criteria andNobackNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOBACK_NUM between", value1, value2, "nobackNum");
            return (Criteria) this;
        }

        public Criteria andNobackNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOBACK_NUM not between", value1, value2, "nobackNum");
            return (Criteria) this;
        }

        public Criteria andConfirmNumIsNull() {
            addCriterion("CONFIRM_NUM is null");
            return (Criteria) this;
        }

        public Criteria andConfirmNumIsNotNull() {
            addCriterion("CONFIRM_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmNumEqualTo(BigDecimal value) {
            addCriterion("CONFIRM_NUM =", value, "confirmNum");
            return (Criteria) this;
        }

        public Criteria andConfirmNumNotEqualTo(BigDecimal value) {
            addCriterion("CONFIRM_NUM <>", value, "confirmNum");
            return (Criteria) this;
        }

        public Criteria andConfirmNumGreaterThan(BigDecimal value) {
            addCriterion("CONFIRM_NUM >", value, "confirmNum");
            return (Criteria) this;
        }

        public Criteria andConfirmNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CONFIRM_NUM >=", value, "confirmNum");
            return (Criteria) this;
        }

        public Criteria andConfirmNumLessThan(BigDecimal value) {
            addCriterion("CONFIRM_NUM <", value, "confirmNum");
            return (Criteria) this;
        }

        public Criteria andConfirmNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CONFIRM_NUM <=", value, "confirmNum");
            return (Criteria) this;
        }

        public Criteria andConfirmNumIn(List<BigDecimal> values) {
            addCriterion("CONFIRM_NUM in", values, "confirmNum");
            return (Criteria) this;
        }

        public Criteria andConfirmNumNotIn(List<BigDecimal> values) {
            addCriterion("CONFIRM_NUM not in", values, "confirmNum");
            return (Criteria) this;
        }

        public Criteria andConfirmNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONFIRM_NUM between", value1, value2, "confirmNum");
            return (Criteria) this;
        }

        public Criteria andConfirmNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CONFIRM_NUM not between", value1, value2, "confirmNum");
            return (Criteria) this;
        }

        public Criteria andConfirmInjectIsNull() {
            addCriterion("CONFIRM_INJECT is null");
            return (Criteria) this;
        }

        public Criteria andConfirmInjectIsNotNull() {
            addCriterion("CONFIRM_INJECT is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmInjectEqualTo(Short value) {
            addCriterion("CONFIRM_INJECT =", value, "confirmInject");
            return (Criteria) this;
        }

        public Criteria andConfirmInjectNotEqualTo(Short value) {
            addCriterion("CONFIRM_INJECT <>", value, "confirmInject");
            return (Criteria) this;
        }

        public Criteria andConfirmInjectGreaterThan(Short value) {
            addCriterion("CONFIRM_INJECT >", value, "confirmInject");
            return (Criteria) this;
        }

        public Criteria andConfirmInjectGreaterThanOrEqualTo(Short value) {
            addCriterion("CONFIRM_INJECT >=", value, "confirmInject");
            return (Criteria) this;
        }

        public Criteria andConfirmInjectLessThan(Short value) {
            addCriterion("CONFIRM_INJECT <", value, "confirmInject");
            return (Criteria) this;
        }

        public Criteria andConfirmInjectLessThanOrEqualTo(Short value) {
            addCriterion("CONFIRM_INJECT <=", value, "confirmInject");
            return (Criteria) this;
        }

        public Criteria andConfirmInjectIn(List<Short> values) {
            addCriterion("CONFIRM_INJECT in", values, "confirmInject");
            return (Criteria) this;
        }

        public Criteria andConfirmInjectNotIn(List<Short> values) {
            addCriterion("CONFIRM_INJECT not in", values, "confirmInject");
            return (Criteria) this;
        }

        public Criteria andConfirmInjectBetween(Short value1, Short value2) {
            addCriterion("CONFIRM_INJECT between", value1, value2, "confirmInject");
            return (Criteria) this;
        }

        public Criteria andConfirmInjectNotBetween(Short value1, Short value2) {
            addCriterion("CONFIRM_INJECT not between", value1, value2, "confirmInject");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNull() {
            addCriterion("SAMPLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNotNull() {
            addCriterion("SAMPLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSampleIdEqualTo(String value) {
            addCriterion("SAMPLE_ID =", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotEqualTo(String value) {
            addCriterion("SAMPLE_ID <>", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThan(String value) {
            addCriterion("SAMPLE_ID >", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_ID >=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThan(String value) {
            addCriterion("SAMPLE_ID <", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_ID <=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLike(String value) {
            addCriterion("SAMPLE_ID like", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotLike(String value) {
            addCriterion("SAMPLE_ID not like", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdIn(List<String> values) {
            addCriterion("SAMPLE_ID in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotIn(List<String> values) {
            addCriterion("SAMPLE_ID not in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdBetween(String value1, String value2) {
            addCriterion("SAMPLE_ID between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_ID not between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andRecipeSeqIsNull() {
            addCriterion("RECIPE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andRecipeSeqIsNotNull() {
            addCriterion("RECIPE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeSeqEqualTo(String value) {
            addCriterion("RECIPE_SEQ =", value, "recipeSeq");
            return (Criteria) this;
        }

        public Criteria andRecipeSeqNotEqualTo(String value) {
            addCriterion("RECIPE_SEQ <>", value, "recipeSeq");
            return (Criteria) this;
        }

        public Criteria andRecipeSeqGreaterThan(String value) {
            addCriterion("RECIPE_SEQ >", value, "recipeSeq");
            return (Criteria) this;
        }

        public Criteria andRecipeSeqGreaterThanOrEqualTo(String value) {
            addCriterion("RECIPE_SEQ >=", value, "recipeSeq");
            return (Criteria) this;
        }

        public Criteria andRecipeSeqLessThan(String value) {
            addCriterion("RECIPE_SEQ <", value, "recipeSeq");
            return (Criteria) this;
        }

        public Criteria andRecipeSeqLessThanOrEqualTo(String value) {
            addCriterion("RECIPE_SEQ <=", value, "recipeSeq");
            return (Criteria) this;
        }

        public Criteria andRecipeSeqLike(String value) {
            addCriterion("RECIPE_SEQ like", value, "recipeSeq");
            return (Criteria) this;
        }

        public Criteria andRecipeSeqNotLike(String value) {
            addCriterion("RECIPE_SEQ not like", value, "recipeSeq");
            return (Criteria) this;
        }

        public Criteria andRecipeSeqIn(List<String> values) {
            addCriterion("RECIPE_SEQ in", values, "recipeSeq");
            return (Criteria) this;
        }

        public Criteria andRecipeSeqNotIn(List<String> values) {
            addCriterion("RECIPE_SEQ not in", values, "recipeSeq");
            return (Criteria) this;
        }

        public Criteria andRecipeSeqBetween(String value1, String value2) {
            addCriterion("RECIPE_SEQ between", value1, value2, "recipeSeq");
            return (Criteria) this;
        }

        public Criteria andRecipeSeqNotBetween(String value1, String value2) {
            addCriterion("RECIPE_SEQ not between", value1, value2, "recipeSeq");
            return (Criteria) this;
        }

        public Criteria andOverCostIsNull() {
            addCriterion("OVER_COST is null");
            return (Criteria) this;
        }

        public Criteria andOverCostIsNotNull() {
            addCriterion("OVER_COST is not null");
            return (Criteria) this;
        }

        public Criteria andOverCostEqualTo(BigDecimal value) {
            addCriterion("OVER_COST =", value, "overCost");
            return (Criteria) this;
        }

        public Criteria andOverCostNotEqualTo(BigDecimal value) {
            addCriterion("OVER_COST <>", value, "overCost");
            return (Criteria) this;
        }

        public Criteria andOverCostGreaterThan(BigDecimal value) {
            addCriterion("OVER_COST >", value, "overCost");
            return (Criteria) this;
        }

        public Criteria andOverCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OVER_COST >=", value, "overCost");
            return (Criteria) this;
        }

        public Criteria andOverCostLessThan(BigDecimal value) {
            addCriterion("OVER_COST <", value, "overCost");
            return (Criteria) this;
        }

        public Criteria andOverCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OVER_COST <=", value, "overCost");
            return (Criteria) this;
        }

        public Criteria andOverCostIn(List<BigDecimal> values) {
            addCriterion("OVER_COST in", values, "overCost");
            return (Criteria) this;
        }

        public Criteria andOverCostNotIn(List<BigDecimal> values) {
            addCriterion("OVER_COST not in", values, "overCost");
            return (Criteria) this;
        }

        public Criteria andOverCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OVER_COST between", value1, value2, "overCost");
            return (Criteria) this;
        }

        public Criteria andOverCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OVER_COST not between", value1, value2, "overCost");
            return (Criteria) this;
        }

        public Criteria andExcessCostIsNull() {
            addCriterion("EXCESS_COST is null");
            return (Criteria) this;
        }

        public Criteria andExcessCostIsNotNull() {
            addCriterion("EXCESS_COST is not null");
            return (Criteria) this;
        }

        public Criteria andExcessCostEqualTo(BigDecimal value) {
            addCriterion("EXCESS_COST =", value, "excessCost");
            return (Criteria) this;
        }

        public Criteria andExcessCostNotEqualTo(BigDecimal value) {
            addCriterion("EXCESS_COST <>", value, "excessCost");
            return (Criteria) this;
        }

        public Criteria andExcessCostGreaterThan(BigDecimal value) {
            addCriterion("EXCESS_COST >", value, "excessCost");
            return (Criteria) this;
        }

        public Criteria andExcessCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCESS_COST >=", value, "excessCost");
            return (Criteria) this;
        }

        public Criteria andExcessCostLessThan(BigDecimal value) {
            addCriterion("EXCESS_COST <", value, "excessCost");
            return (Criteria) this;
        }

        public Criteria andExcessCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCESS_COST <=", value, "excessCost");
            return (Criteria) this;
        }

        public Criteria andExcessCostIn(List<BigDecimal> values) {
            addCriterion("EXCESS_COST in", values, "excessCost");
            return (Criteria) this;
        }

        public Criteria andExcessCostNotIn(List<BigDecimal> values) {
            addCriterion("EXCESS_COST not in", values, "excessCost");
            return (Criteria) this;
        }

        public Criteria andExcessCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCESS_COST between", value1, value2, "excessCost");
            return (Criteria) this;
        }

        public Criteria andExcessCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCESS_COST not between", value1, value2, "excessCost");
            return (Criteria) this;
        }

        public Criteria andDrugOwncostIsNull() {
            addCriterion("DRUG_OWNCOST is null");
            return (Criteria) this;
        }

        public Criteria andDrugOwncostIsNotNull() {
            addCriterion("DRUG_OWNCOST is not null");
            return (Criteria) this;
        }

        public Criteria andDrugOwncostEqualTo(BigDecimal value) {
            addCriterion("DRUG_OWNCOST =", value, "drugOwncost");
            return (Criteria) this;
        }

        public Criteria andDrugOwncostNotEqualTo(BigDecimal value) {
            addCriterion("DRUG_OWNCOST <>", value, "drugOwncost");
            return (Criteria) this;
        }

        public Criteria andDrugOwncostGreaterThan(BigDecimal value) {
            addCriterion("DRUG_OWNCOST >", value, "drugOwncost");
            return (Criteria) this;
        }

        public Criteria andDrugOwncostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DRUG_OWNCOST >=", value, "drugOwncost");
            return (Criteria) this;
        }

        public Criteria andDrugOwncostLessThan(BigDecimal value) {
            addCriterion("DRUG_OWNCOST <", value, "drugOwncost");
            return (Criteria) this;
        }

        public Criteria andDrugOwncostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DRUG_OWNCOST <=", value, "drugOwncost");
            return (Criteria) this;
        }

        public Criteria andDrugOwncostIn(List<BigDecimal> values) {
            addCriterion("DRUG_OWNCOST in", values, "drugOwncost");
            return (Criteria) this;
        }

        public Criteria andDrugOwncostNotIn(List<BigDecimal> values) {
            addCriterion("DRUG_OWNCOST not in", values, "drugOwncost");
            return (Criteria) this;
        }

        public Criteria andDrugOwncostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRUG_OWNCOST between", value1, value2, "drugOwncost");
            return (Criteria) this;
        }

        public Criteria andDrugOwncostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DRUG_OWNCOST not between", value1, value2, "drugOwncost");
            return (Criteria) this;
        }

        public Criteria andCostSourceIsNull() {
            addCriterion("COST_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andCostSourceIsNotNull() {
            addCriterion("COST_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andCostSourceEqualTo(String value) {
            addCriterion("COST_SOURCE =", value, "costSource");
            return (Criteria) this;
        }

        public Criteria andCostSourceNotEqualTo(String value) {
            addCriterion("COST_SOURCE <>", value, "costSource");
            return (Criteria) this;
        }

        public Criteria andCostSourceGreaterThan(String value) {
            addCriterion("COST_SOURCE >", value, "costSource");
            return (Criteria) this;
        }

        public Criteria andCostSourceGreaterThanOrEqualTo(String value) {
            addCriterion("COST_SOURCE >=", value, "costSource");
            return (Criteria) this;
        }

        public Criteria andCostSourceLessThan(String value) {
            addCriterion("COST_SOURCE <", value, "costSource");
            return (Criteria) this;
        }

        public Criteria andCostSourceLessThanOrEqualTo(String value) {
            addCriterion("COST_SOURCE <=", value, "costSource");
            return (Criteria) this;
        }

        public Criteria andCostSourceLike(String value) {
            addCriterion("COST_SOURCE like", value, "costSource");
            return (Criteria) this;
        }

        public Criteria andCostSourceNotLike(String value) {
            addCriterion("COST_SOURCE not like", value, "costSource");
            return (Criteria) this;
        }

        public Criteria andCostSourceIn(List<String> values) {
            addCriterion("COST_SOURCE in", values, "costSource");
            return (Criteria) this;
        }

        public Criteria andCostSourceNotIn(List<String> values) {
            addCriterion("COST_SOURCE not in", values, "costSource");
            return (Criteria) this;
        }

        public Criteria andCostSourceBetween(String value1, String value2) {
            addCriterion("COST_SOURCE between", value1, value2, "costSource");
            return (Criteria) this;
        }

        public Criteria andCostSourceNotBetween(String value1, String value2) {
            addCriterion("COST_SOURCE not between", value1, value2, "costSource");
            return (Criteria) this;
        }

        public Criteria andSubjobFlagIsNull() {
            addCriterion("SUBJOB_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andSubjobFlagIsNotNull() {
            addCriterion("SUBJOB_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andSubjobFlagEqualTo(String value) {
            addCriterion("SUBJOB_FLAG =", value, "subjobFlag");
            return (Criteria) this;
        }

        public Criteria andSubjobFlagNotEqualTo(String value) {
            addCriterion("SUBJOB_FLAG <>", value, "subjobFlag");
            return (Criteria) this;
        }

        public Criteria andSubjobFlagGreaterThan(String value) {
            addCriterion("SUBJOB_FLAG >", value, "subjobFlag");
            return (Criteria) this;
        }

        public Criteria andSubjobFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJOB_FLAG >=", value, "subjobFlag");
            return (Criteria) this;
        }

        public Criteria andSubjobFlagLessThan(String value) {
            addCriterion("SUBJOB_FLAG <", value, "subjobFlag");
            return (Criteria) this;
        }

        public Criteria andSubjobFlagLessThanOrEqualTo(String value) {
            addCriterion("SUBJOB_FLAG <=", value, "subjobFlag");
            return (Criteria) this;
        }

        public Criteria andSubjobFlagLike(String value) {
            addCriterion("SUBJOB_FLAG like", value, "subjobFlag");
            return (Criteria) this;
        }

        public Criteria andSubjobFlagNotLike(String value) {
            addCriterion("SUBJOB_FLAG not like", value, "subjobFlag");
            return (Criteria) this;
        }

        public Criteria andSubjobFlagIn(List<String> values) {
            addCriterion("SUBJOB_FLAG in", values, "subjobFlag");
            return (Criteria) this;
        }

        public Criteria andSubjobFlagNotIn(List<String> values) {
            addCriterion("SUBJOB_FLAG not in", values, "subjobFlag");
            return (Criteria) this;
        }

        public Criteria andSubjobFlagBetween(String value1, String value2) {
            addCriterion("SUBJOB_FLAG between", value1, value2, "subjobFlag");
            return (Criteria) this;
        }

        public Criteria andSubjobFlagNotBetween(String value1, String value2) {
            addCriterion("SUBJOB_FLAG not between", value1, value2, "subjobFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagIsNull() {
            addCriterion("ACCOUNT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAccountFlagIsNotNull() {
            addCriterion("ACCOUNT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAccountFlagEqualTo(String value) {
            addCriterion("ACCOUNT_FLAG =", value, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagNotEqualTo(String value) {
            addCriterion("ACCOUNT_FLAG <>", value, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagGreaterThan(String value) {
            addCriterion("ACCOUNT_FLAG >", value, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_FLAG >=", value, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagLessThan(String value) {
            addCriterion("ACCOUNT_FLAG <", value, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_FLAG <=", value, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagLike(String value) {
            addCriterion("ACCOUNT_FLAG like", value, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagNotLike(String value) {
            addCriterion("ACCOUNT_FLAG not like", value, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagIn(List<String> values) {
            addCriterion("ACCOUNT_FLAG in", values, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagNotIn(List<String> values) {
            addCriterion("ACCOUNT_FLAG not in", values, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagBetween(String value1, String value2) {
            addCriterion("ACCOUNT_FLAG between", value1, value2, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andAccountFlagNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_FLAG not between", value1, value2, "accountFlag");
            return (Criteria) this;
        }

        public Criteria andUpdateSequencenoIsNull() {
            addCriterion("UPDATE_SEQUENCENO is null");
            return (Criteria) this;
        }

        public Criteria andUpdateSequencenoIsNotNull() {
            addCriterion("UPDATE_SEQUENCENO is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateSequencenoEqualTo(Long value) {
            addCriterion("UPDATE_SEQUENCENO =", value, "updateSequenceno");
            return (Criteria) this;
        }

        public Criteria andUpdateSequencenoNotEqualTo(Long value) {
            addCriterion("UPDATE_SEQUENCENO <>", value, "updateSequenceno");
            return (Criteria) this;
        }

        public Criteria andUpdateSequencenoGreaterThan(Long value) {
            addCriterion("UPDATE_SEQUENCENO >", value, "updateSequenceno");
            return (Criteria) this;
        }

        public Criteria andUpdateSequencenoGreaterThanOrEqualTo(Long value) {
            addCriterion("UPDATE_SEQUENCENO >=", value, "updateSequenceno");
            return (Criteria) this;
        }

        public Criteria andUpdateSequencenoLessThan(Long value) {
            addCriterion("UPDATE_SEQUENCENO <", value, "updateSequenceno");
            return (Criteria) this;
        }

        public Criteria andUpdateSequencenoLessThanOrEqualTo(Long value) {
            addCriterion("UPDATE_SEQUENCENO <=", value, "updateSequenceno");
            return (Criteria) this;
        }

        public Criteria andUpdateSequencenoIn(List<Long> values) {
            addCriterion("UPDATE_SEQUENCENO in", values, "updateSequenceno");
            return (Criteria) this;
        }

        public Criteria andUpdateSequencenoNotIn(List<Long> values) {
            addCriterion("UPDATE_SEQUENCENO not in", values, "updateSequenceno");
            return (Criteria) this;
        }

        public Criteria andUpdateSequencenoBetween(Long value1, Long value2) {
            addCriterion("UPDATE_SEQUENCENO between", value1, value2, "updateSequenceno");
            return (Criteria) this;
        }

        public Criteria andUpdateSequencenoNotBetween(Long value1, Long value2) {
            addCriterion("UPDATE_SEQUENCENO not between", value1, value2, "updateSequenceno");
            return (Criteria) this;
        }

        public Criteria andDoctindeptIsNull() {
            addCriterion("DOCTINDEPT is null");
            return (Criteria) this;
        }

        public Criteria andDoctindeptIsNotNull() {
            addCriterion("DOCTINDEPT is not null");
            return (Criteria) this;
        }

        public Criteria andDoctindeptEqualTo(String value) {
            addCriterion("DOCTINDEPT =", value, "doctindept");
            return (Criteria) this;
        }

        public Criteria andDoctindeptNotEqualTo(String value) {
            addCriterion("DOCTINDEPT <>", value, "doctindept");
            return (Criteria) this;
        }

        public Criteria andDoctindeptGreaterThan(String value) {
            addCriterion("DOCTINDEPT >", value, "doctindept");
            return (Criteria) this;
        }

        public Criteria andDoctindeptGreaterThanOrEqualTo(String value) {
            addCriterion("DOCTINDEPT >=", value, "doctindept");
            return (Criteria) this;
        }

        public Criteria andDoctindeptLessThan(String value) {
            addCriterion("DOCTINDEPT <", value, "doctindept");
            return (Criteria) this;
        }

        public Criteria andDoctindeptLessThanOrEqualTo(String value) {
            addCriterion("DOCTINDEPT <=", value, "doctindept");
            return (Criteria) this;
        }

        public Criteria andDoctindeptLike(String value) {
            addCriterion("DOCTINDEPT like", value, "doctindept");
            return (Criteria) this;
        }

        public Criteria andDoctindeptNotLike(String value) {
            addCriterion("DOCTINDEPT not like", value, "doctindept");
            return (Criteria) this;
        }

        public Criteria andDoctindeptIn(List<String> values) {
            addCriterion("DOCTINDEPT in", values, "doctindept");
            return (Criteria) this;
        }

        public Criteria andDoctindeptNotIn(List<String> values) {
            addCriterion("DOCTINDEPT not in", values, "doctindept");
            return (Criteria) this;
        }

        public Criteria andDoctindeptBetween(String value1, String value2) {
            addCriterion("DOCTINDEPT between", value1, value2, "doctindept");
            return (Criteria) this;
        }

        public Criteria andDoctindeptNotBetween(String value1, String value2) {
            addCriterion("DOCTINDEPT not between", value1, value2, "doctindept");
            return (Criteria) this;
        }

        public Criteria andMedicalgroupcodeIsNull() {
            addCriterion("MEDICALGROUPCODE is null");
            return (Criteria) this;
        }

        public Criteria andMedicalgroupcodeIsNotNull() {
            addCriterion("MEDICALGROUPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalgroupcodeEqualTo(String value) {
            addCriterion("MEDICALGROUPCODE =", value, "medicalgroupcode");
            return (Criteria) this;
        }

        public Criteria andMedicalgroupcodeNotEqualTo(String value) {
            addCriterion("MEDICALGROUPCODE <>", value, "medicalgroupcode");
            return (Criteria) this;
        }

        public Criteria andMedicalgroupcodeGreaterThan(String value) {
            addCriterion("MEDICALGROUPCODE >", value, "medicalgroupcode");
            return (Criteria) this;
        }

        public Criteria andMedicalgroupcodeGreaterThanOrEqualTo(String value) {
            addCriterion("MEDICALGROUPCODE >=", value, "medicalgroupcode");
            return (Criteria) this;
        }

        public Criteria andMedicalgroupcodeLessThan(String value) {
            addCriterion("MEDICALGROUPCODE <", value, "medicalgroupcode");
            return (Criteria) this;
        }

        public Criteria andMedicalgroupcodeLessThanOrEqualTo(String value) {
            addCriterion("MEDICALGROUPCODE <=", value, "medicalgroupcode");
            return (Criteria) this;
        }

        public Criteria andMedicalgroupcodeLike(String value) {
            addCriterion("MEDICALGROUPCODE like", value, "medicalgroupcode");
            return (Criteria) this;
        }

        public Criteria andMedicalgroupcodeNotLike(String value) {
            addCriterion("MEDICALGROUPCODE not like", value, "medicalgroupcode");
            return (Criteria) this;
        }

        public Criteria andMedicalgroupcodeIn(List<String> values) {
            addCriterion("MEDICALGROUPCODE in", values, "medicalgroupcode");
            return (Criteria) this;
        }

        public Criteria andMedicalgroupcodeNotIn(List<String> values) {
            addCriterion("MEDICALGROUPCODE not in", values, "medicalgroupcode");
            return (Criteria) this;
        }

        public Criteria andMedicalgroupcodeBetween(String value1, String value2) {
            addCriterion("MEDICALGROUPCODE between", value1, value2, "medicalgroupcode");
            return (Criteria) this;
        }

        public Criteria andMedicalgroupcodeNotBetween(String value1, String value2) {
            addCriterion("MEDICALGROUPCODE not between", value1, value2, "medicalgroupcode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeIsNull() {
            addCriterion("PAYKIND_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeIsNotNull() {
            addCriterion("PAYKIND_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeEqualTo(String value) {
            addCriterion("PAYKIND_CODE =", value, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeNotEqualTo(String value) {
            addCriterion("PAYKIND_CODE <>", value, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeGreaterThan(String value) {
            addCriterion("PAYKIND_CODE >", value, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYKIND_CODE >=", value, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeLessThan(String value) {
            addCriterion("PAYKIND_CODE <", value, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeLessThanOrEqualTo(String value) {
            addCriterion("PAYKIND_CODE <=", value, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeLike(String value) {
            addCriterion("PAYKIND_CODE like", value, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeNotLike(String value) {
            addCriterion("PAYKIND_CODE not like", value, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeIn(List<String> values) {
            addCriterion("PAYKIND_CODE in", values, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeNotIn(List<String> values) {
            addCriterion("PAYKIND_CODE not in", values, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeBetween(String value1, String value2) {
            addCriterion("PAYKIND_CODE between", value1, value2, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPaykindCodeNotBetween(String value1, String value2) {
            addCriterion("PAYKIND_CODE not between", value1, value2, "paykindCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeIsNull() {
            addCriterion("PACT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPactCodeIsNotNull() {
            addCriterion("PACT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPactCodeEqualTo(String value) {
            addCriterion("PACT_CODE =", value, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeNotEqualTo(String value) {
            addCriterion("PACT_CODE <>", value, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeGreaterThan(String value) {
            addCriterion("PACT_CODE >", value, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PACT_CODE >=", value, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeLessThan(String value) {
            addCriterion("PACT_CODE <", value, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeLessThanOrEqualTo(String value) {
            addCriterion("PACT_CODE <=", value, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeLike(String value) {
            addCriterion("PACT_CODE like", value, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeNotLike(String value) {
            addCriterion("PACT_CODE not like", value, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeIn(List<String> values) {
            addCriterion("PACT_CODE in", values, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeNotIn(List<String> values) {
            addCriterion("PACT_CODE not in", values, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeBetween(String value1, String value2) {
            addCriterion("PACT_CODE between", value1, value2, "pactCode");
            return (Criteria) this;
        }

        public Criteria andPactCodeNotBetween(String value1, String value2) {
            addCriterion("PACT_CODE not between", value1, value2, "pactCode");
            return (Criteria) this;
        }

        public Criteria andOldUnitPriceIsNull() {
            addCriterion("OLD_UNIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andOldUnitPriceIsNotNull() {
            addCriterion("OLD_UNIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andOldUnitPriceEqualTo(BigDecimal value) {
            addCriterion("OLD_UNIT_PRICE =", value, "oldUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOldUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("OLD_UNIT_PRICE <>", value, "oldUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOldUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("OLD_UNIT_PRICE >", value, "oldUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOldUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OLD_UNIT_PRICE >=", value, "oldUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOldUnitPriceLessThan(BigDecimal value) {
            addCriterion("OLD_UNIT_PRICE <", value, "oldUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOldUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OLD_UNIT_PRICE <=", value, "oldUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOldUnitPriceIn(List<BigDecimal> values) {
            addCriterion("OLD_UNIT_PRICE in", values, "oldUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOldUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("OLD_UNIT_PRICE not in", values, "oldUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOldUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OLD_UNIT_PRICE between", value1, value2, "oldUnitPrice");
            return (Criteria) this;
        }

        public Criteria andOldUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OLD_UNIT_PRICE not between", value1, value2, "oldUnitPrice");
            return (Criteria) this;
        }

        public Criteria andPackageQtyIsNull() {
            addCriterion("PACKAGE_QTY is null");
            return (Criteria) this;
        }

        public Criteria andPackageQtyIsNotNull() {
            addCriterion("PACKAGE_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andPackageQtyEqualTo(BigDecimal value) {
            addCriterion("PACKAGE_QTY =", value, "packageQty");
            return (Criteria) this;
        }

        public Criteria andPackageQtyNotEqualTo(BigDecimal value) {
            addCriterion("PACKAGE_QTY <>", value, "packageQty");
            return (Criteria) this;
        }

        public Criteria andPackageQtyGreaterThan(BigDecimal value) {
            addCriterion("PACKAGE_QTY >", value, "packageQty");
            return (Criteria) this;
        }

        public Criteria andPackageQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKAGE_QTY >=", value, "packageQty");
            return (Criteria) this;
        }

        public Criteria andPackageQtyLessThan(BigDecimal value) {
            addCriterion("PACKAGE_QTY <", value, "packageQty");
            return (Criteria) this;
        }

        public Criteria andPackageQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKAGE_QTY <=", value, "packageQty");
            return (Criteria) this;
        }

        public Criteria andPackageQtyIn(List<BigDecimal> values) {
            addCriterion("PACKAGE_QTY in", values, "packageQty");
            return (Criteria) this;
        }

        public Criteria andPackageQtyNotIn(List<BigDecimal> values) {
            addCriterion("PACKAGE_QTY not in", values, "packageQty");
            return (Criteria) this;
        }

        public Criteria andPackageQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKAGE_QTY between", value1, value2, "packageQty");
            return (Criteria) this;
        }

        public Criteria andPackageQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKAGE_QTY not between", value1, value2, "packageQty");
            return (Criteria) this;
        }

        public Criteria andRecipeMemoIsNull() {
            addCriterion("RECIPE_MEMO is null");
            return (Criteria) this;
        }

        public Criteria andRecipeMemoIsNotNull() {
            addCriterion("RECIPE_MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andRecipeMemoEqualTo(String value) {
            addCriterion("RECIPE_MEMO =", value, "recipeMemo");
            return (Criteria) this;
        }

        public Criteria andRecipeMemoNotEqualTo(String value) {
            addCriterion("RECIPE_MEMO <>", value, "recipeMemo");
            return (Criteria) this;
        }

        public Criteria andRecipeMemoGreaterThan(String value) {
            addCriterion("RECIPE_MEMO >", value, "recipeMemo");
            return (Criteria) this;
        }

        public Criteria andRecipeMemoGreaterThanOrEqualTo(String value) {
            addCriterion("RECIPE_MEMO >=", value, "recipeMemo");
            return (Criteria) this;
        }

        public Criteria andRecipeMemoLessThan(String value) {
            addCriterion("RECIPE_MEMO <", value, "recipeMemo");
            return (Criteria) this;
        }

        public Criteria andRecipeMemoLessThanOrEqualTo(String value) {
            addCriterion("RECIPE_MEMO <=", value, "recipeMemo");
            return (Criteria) this;
        }

        public Criteria andRecipeMemoLike(String value) {
            addCriterion("RECIPE_MEMO like", value, "recipeMemo");
            return (Criteria) this;
        }

        public Criteria andRecipeMemoNotLike(String value) {
            addCriterion("RECIPE_MEMO not like", value, "recipeMemo");
            return (Criteria) this;
        }

        public Criteria andRecipeMemoIn(List<String> values) {
            addCriterion("RECIPE_MEMO in", values, "recipeMemo");
            return (Criteria) this;
        }

        public Criteria andRecipeMemoNotIn(List<String> values) {
            addCriterion("RECIPE_MEMO not in", values, "recipeMemo");
            return (Criteria) this;
        }

        public Criteria andRecipeMemoBetween(String value1, String value2) {
            addCriterion("RECIPE_MEMO between", value1, value2, "recipeMemo");
            return (Criteria) this;
        }

        public Criteria andRecipeMemoNotBetween(String value1, String value2) {
            addCriterion("RECIPE_MEMO not between", value1, value2, "recipeMemo");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("MEMO is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("MEMO is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("MEMO =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("MEMO <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("MEMO >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("MEMO >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("MEMO <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("MEMO <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("MEMO like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("MEMO not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("MEMO in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("MEMO not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("MEMO between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("MEMO not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andExtFlag3IsNull() {
            addCriterion("EXT_FLAG3 is null");
            return (Criteria) this;
        }

        public Criteria andExtFlag3IsNotNull() {
            addCriterion("EXT_FLAG3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtFlag3EqualTo(String value) {
            addCriterion("EXT_FLAG3 =", value, "extFlag3");
            return (Criteria) this;
        }

        public Criteria andExtFlag3NotEqualTo(String value) {
            addCriterion("EXT_FLAG3 <>", value, "extFlag3");
            return (Criteria) this;
        }

        public Criteria andExtFlag3GreaterThan(String value) {
            addCriterion("EXT_FLAG3 >", value, "extFlag3");
            return (Criteria) this;
        }

        public Criteria andExtFlag3GreaterThanOrEqualTo(String value) {
            addCriterion("EXT_FLAG3 >=", value, "extFlag3");
            return (Criteria) this;
        }

        public Criteria andExtFlag3LessThan(String value) {
            addCriterion("EXT_FLAG3 <", value, "extFlag3");
            return (Criteria) this;
        }

        public Criteria andExtFlag3LessThanOrEqualTo(String value) {
            addCriterion("EXT_FLAG3 <=", value, "extFlag3");
            return (Criteria) this;
        }

        public Criteria andExtFlag3Like(String value) {
            addCriterion("EXT_FLAG3 like", value, "extFlag3");
            return (Criteria) this;
        }

        public Criteria andExtFlag3NotLike(String value) {
            addCriterion("EXT_FLAG3 not like", value, "extFlag3");
            return (Criteria) this;
        }

        public Criteria andExtFlag3In(List<String> values) {
            addCriterion("EXT_FLAG3 in", values, "extFlag3");
            return (Criteria) this;
        }

        public Criteria andExtFlag3NotIn(List<String> values) {
            addCriterion("EXT_FLAG3 not in", values, "extFlag3");
            return (Criteria) this;
        }

        public Criteria andExtFlag3Between(String value1, String value2) {
            addCriterion("EXT_FLAG3 between", value1, value2, "extFlag3");
            return (Criteria) this;
        }

        public Criteria andExtFlag3NotBetween(String value1, String value2) {
            addCriterion("EXT_FLAG3 not between", value1, value2, "extFlag3");
            return (Criteria) this;
        }

        public Criteria andBelongDeptIsNull() {
            addCriterion("BELONG_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andBelongDeptIsNotNull() {
            addCriterion("BELONG_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andBelongDeptEqualTo(String value) {
            addCriterion("BELONG_DEPT =", value, "belongDept");
            return (Criteria) this;
        }

        public Criteria andBelongDeptNotEqualTo(String value) {
            addCriterion("BELONG_DEPT <>", value, "belongDept");
            return (Criteria) this;
        }

        public Criteria andBelongDeptGreaterThan(String value) {
            addCriterion("BELONG_DEPT >", value, "belongDept");
            return (Criteria) this;
        }

        public Criteria andBelongDeptGreaterThanOrEqualTo(String value) {
            addCriterion("BELONG_DEPT >=", value, "belongDept");
            return (Criteria) this;
        }

        public Criteria andBelongDeptLessThan(String value) {
            addCriterion("BELONG_DEPT <", value, "belongDept");
            return (Criteria) this;
        }

        public Criteria andBelongDeptLessThanOrEqualTo(String value) {
            addCriterion("BELONG_DEPT <=", value, "belongDept");
            return (Criteria) this;
        }

        public Criteria andBelongDeptLike(String value) {
            addCriterion("BELONG_DEPT like", value, "belongDept");
            return (Criteria) this;
        }

        public Criteria andBelongDeptNotLike(String value) {
            addCriterion("BELONG_DEPT not like", value, "belongDept");
            return (Criteria) this;
        }

        public Criteria andBelongDeptIn(List<String> values) {
            addCriterion("BELONG_DEPT in", values, "belongDept");
            return (Criteria) this;
        }

        public Criteria andBelongDeptNotIn(List<String> values) {
            addCriterion("BELONG_DEPT not in", values, "belongDept");
            return (Criteria) this;
        }

        public Criteria andBelongDeptBetween(String value1, String value2) {
            addCriterion("BELONG_DEPT between", value1, value2, "belongDept");
            return (Criteria) this;
        }

        public Criteria andBelongDeptNotBetween(String value1, String value2) {
            addCriterion("BELONG_DEPT not between", value1, value2, "belongDept");
            return (Criteria) this;
        }

        public Criteria andSampleStateIsNull() {
            addCriterion("SAMPLE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andSampleStateIsNotNull() {
            addCriterion("SAMPLE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andSampleStateEqualTo(String value) {
            addCriterion("SAMPLE_STATE =", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateNotEqualTo(String value) {
            addCriterion("SAMPLE_STATE <>", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateGreaterThan(String value) {
            addCriterion("SAMPLE_STATE >", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateGreaterThanOrEqualTo(String value) {
            addCriterion("SAMPLE_STATE >=", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateLessThan(String value) {
            addCriterion("SAMPLE_STATE <", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateLessThanOrEqualTo(String value) {
            addCriterion("SAMPLE_STATE <=", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateLike(String value) {
            addCriterion("SAMPLE_STATE like", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateNotLike(String value) {
            addCriterion("SAMPLE_STATE not like", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateIn(List<String> values) {
            addCriterion("SAMPLE_STATE in", values, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateNotIn(List<String> values) {
            addCriterion("SAMPLE_STATE not in", values, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateBetween(String value1, String value2) {
            addCriterion("SAMPLE_STATE between", value1, value2, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateNotBetween(String value1, String value2) {
            addCriterion("SAMPLE_STATE not between", value1, value2, "sampleState");
            return (Criteria) this;
        }

        public Criteria andDonateCostIsNull() {
            addCriterion("DONATE_COST is null");
            return (Criteria) this;
        }

        public Criteria andDonateCostIsNotNull() {
            addCriterion("DONATE_COST is not null");
            return (Criteria) this;
        }

        public Criteria andDonateCostEqualTo(BigDecimal value) {
            addCriterion("DONATE_COST =", value, "donateCost");
            return (Criteria) this;
        }

        public Criteria andDonateCostNotEqualTo(BigDecimal value) {
            addCriterion("DONATE_COST <>", value, "donateCost");
            return (Criteria) this;
        }

        public Criteria andDonateCostGreaterThan(BigDecimal value) {
            addCriterion("DONATE_COST >", value, "donateCost");
            return (Criteria) this;
        }

        public Criteria andDonateCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DONATE_COST >=", value, "donateCost");
            return (Criteria) this;
        }

        public Criteria andDonateCostLessThan(BigDecimal value) {
            addCriterion("DONATE_COST <", value, "donateCost");
            return (Criteria) this;
        }

        public Criteria andDonateCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DONATE_COST <=", value, "donateCost");
            return (Criteria) this;
        }

        public Criteria andDonateCostIn(List<BigDecimal> values) {
            addCriterion("DONATE_COST in", values, "donateCost");
            return (Criteria) this;
        }

        public Criteria andDonateCostNotIn(List<BigDecimal> values) {
            addCriterion("DONATE_COST not in", values, "donateCost");
            return (Criteria) this;
        }

        public Criteria andDonateCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DONATE_COST between", value1, value2, "donateCost");
            return (Criteria) this;
        }

        public Criteria andDonateCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DONATE_COST not between", value1, value2, "donateCost");
            return (Criteria) this;
        }

        public Criteria andPackageFlagIsNull() {
            addCriterion("PACKAGE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPackageFlagIsNotNull() {
            addCriterion("PACKAGE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPackageFlagEqualTo(String value) {
            addCriterion("PACKAGE_FLAG =", value, "packageFlag");
            return (Criteria) this;
        }

        public Criteria andPackageFlagNotEqualTo(String value) {
            addCriterion("PACKAGE_FLAG <>", value, "packageFlag");
            return (Criteria) this;
        }

        public Criteria andPackageFlagGreaterThan(String value) {
            addCriterion("PACKAGE_FLAG >", value, "packageFlag");
            return (Criteria) this;
        }

        public Criteria andPackageFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PACKAGE_FLAG >=", value, "packageFlag");
            return (Criteria) this;
        }

        public Criteria andPackageFlagLessThan(String value) {
            addCriterion("PACKAGE_FLAG <", value, "packageFlag");
            return (Criteria) this;
        }

        public Criteria andPackageFlagLessThanOrEqualTo(String value) {
            addCriterion("PACKAGE_FLAG <=", value, "packageFlag");
            return (Criteria) this;
        }

        public Criteria andPackageFlagLike(String value) {
            addCriterion("PACKAGE_FLAG like", value, "packageFlag");
            return (Criteria) this;
        }

        public Criteria andPackageFlagNotLike(String value) {
            addCriterion("PACKAGE_FLAG not like", value, "packageFlag");
            return (Criteria) this;
        }

        public Criteria andPackageFlagIn(List<String> values) {
            addCriterion("PACKAGE_FLAG in", values, "packageFlag");
            return (Criteria) this;
        }

        public Criteria andPackageFlagNotIn(List<String> values) {
            addCriterion("PACKAGE_FLAG not in", values, "packageFlag");
            return (Criteria) this;
        }

        public Criteria andPackageFlagBetween(String value1, String value2) {
            addCriterion("PACKAGE_FLAG between", value1, value2, "packageFlag");
            return (Criteria) this;
        }

        public Criteria andPackageFlagNotBetween(String value1, String value2) {
            addCriterion("PACKAGE_FLAG not between", value1, value2, "packageFlag");
            return (Criteria) this;
        }

        public Criteria andPackageEcoIsNull() {
            addCriterion("PACKAGE_ECO is null");
            return (Criteria) this;
        }

        public Criteria andPackageEcoIsNotNull() {
            addCriterion("PACKAGE_ECO is not null");
            return (Criteria) this;
        }

        public Criteria andPackageEcoEqualTo(BigDecimal value) {
            addCriterion("PACKAGE_ECO =", value, "packageEco");
            return (Criteria) this;
        }

        public Criteria andPackageEcoNotEqualTo(BigDecimal value) {
            addCriterion("PACKAGE_ECO <>", value, "packageEco");
            return (Criteria) this;
        }

        public Criteria andPackageEcoGreaterThan(BigDecimal value) {
            addCriterion("PACKAGE_ECO >", value, "packageEco");
            return (Criteria) this;
        }

        public Criteria andPackageEcoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKAGE_ECO >=", value, "packageEco");
            return (Criteria) this;
        }

        public Criteria andPackageEcoLessThan(BigDecimal value) {
            addCriterion("PACKAGE_ECO <", value, "packageEco");
            return (Criteria) this;
        }

        public Criteria andPackageEcoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKAGE_ECO <=", value, "packageEco");
            return (Criteria) this;
        }

        public Criteria andPackageEcoIn(List<BigDecimal> values) {
            addCriterion("PACKAGE_ECO in", values, "packageEco");
            return (Criteria) this;
        }

        public Criteria andPackageEcoNotIn(List<BigDecimal> values) {
            addCriterion("PACKAGE_ECO not in", values, "packageEco");
            return (Criteria) this;
        }

        public Criteria andPackageEcoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKAGE_ECO between", value1, value2, "packageEco");
            return (Criteria) this;
        }

        public Criteria andPackageEcoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKAGE_ECO not between", value1, value2, "packageEco");
            return (Criteria) this;
        }

        public Criteria andCheckbodypackageIsNull() {
            addCriterion("CHECKBODYPACKAGE is null");
            return (Criteria) this;
        }

        public Criteria andCheckbodypackageIsNotNull() {
            addCriterion("CHECKBODYPACKAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckbodypackageEqualTo(String value) {
            addCriterion("CHECKBODYPACKAGE =", value, "checkbodypackage");
            return (Criteria) this;
        }

        public Criteria andCheckbodypackageNotEqualTo(String value) {
            addCriterion("CHECKBODYPACKAGE <>", value, "checkbodypackage");
            return (Criteria) this;
        }

        public Criteria andCheckbodypackageGreaterThan(String value) {
            addCriterion("CHECKBODYPACKAGE >", value, "checkbodypackage");
            return (Criteria) this;
        }

        public Criteria andCheckbodypackageGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKBODYPACKAGE >=", value, "checkbodypackage");
            return (Criteria) this;
        }

        public Criteria andCheckbodypackageLessThan(String value) {
            addCriterion("CHECKBODYPACKAGE <", value, "checkbodypackage");
            return (Criteria) this;
        }

        public Criteria andCheckbodypackageLessThanOrEqualTo(String value) {
            addCriterion("CHECKBODYPACKAGE <=", value, "checkbodypackage");
            return (Criteria) this;
        }

        public Criteria andCheckbodypackageLike(String value) {
            addCriterion("CHECKBODYPACKAGE like", value, "checkbodypackage");
            return (Criteria) this;
        }

        public Criteria andCheckbodypackageNotLike(String value) {
            addCriterion("CHECKBODYPACKAGE not like", value, "checkbodypackage");
            return (Criteria) this;
        }

        public Criteria andCheckbodypackageIn(List<String> values) {
            addCriterion("CHECKBODYPACKAGE in", values, "checkbodypackage");
            return (Criteria) this;
        }

        public Criteria andCheckbodypackageNotIn(List<String> values) {
            addCriterion("CHECKBODYPACKAGE not in", values, "checkbodypackage");
            return (Criteria) this;
        }

        public Criteria andCheckbodypackageBetween(String value1, String value2) {
            addCriterion("CHECKBODYPACKAGE between", value1, value2, "checkbodypackage");
            return (Criteria) this;
        }

        public Criteria andCheckbodypackageNotBetween(String value1, String value2) {
            addCriterion("CHECKBODYPACKAGE not between", value1, value2, "checkbodypackage");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}