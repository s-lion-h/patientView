package com.slionh.patientview.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpPackageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExpPackageExample() {
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

        public Criteria andPackageIdIsNull() {
            addCriterion("PACKAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPackageIdIsNotNull() {
            addCriterion("PACKAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPackageIdEqualTo(String value) {
            addCriterion("PACKAGE_ID =", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotEqualTo(String value) {
            addCriterion("PACKAGE_ID <>", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdGreaterThan(String value) {
            addCriterion("PACKAGE_ID >", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdGreaterThanOrEqualTo(String value) {
            addCriterion("PACKAGE_ID >=", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdLessThan(String value) {
            addCriterion("PACKAGE_ID <", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdLessThanOrEqualTo(String value) {
            addCriterion("PACKAGE_ID <=", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdLike(String value) {
            addCriterion("PACKAGE_ID like", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotLike(String value) {
            addCriterion("PACKAGE_ID not like", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdIn(List<String> values) {
            addCriterion("PACKAGE_ID in", values, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotIn(List<String> values) {
            addCriterion("PACKAGE_ID not in", values, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdBetween(String value1, String value2) {
            addCriterion("PACKAGE_ID between", value1, value2, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotBetween(String value1, String value2) {
            addCriterion("PACKAGE_ID not between", value1, value2, "packageId");
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

        public Criteria andPatientNameIsNull() {
            addCriterion("PATIENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("PATIENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("PATIENT_NAME =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("PATIENT_NAME <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("PATIENT_NAME >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_NAME >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("PATIENT_NAME <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_NAME <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("PATIENT_NAME like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("PATIENT_NAME not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("PATIENT_NAME in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("PATIENT_NAME not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("PATIENT_NAME between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("PATIENT_NAME not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andSexCodeIsNull() {
            addCriterion("SEX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSexCodeIsNotNull() {
            addCriterion("SEX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSexCodeEqualTo(String value) {
            addCriterion("SEX_CODE =", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeNotEqualTo(String value) {
            addCriterion("SEX_CODE <>", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeGreaterThan(String value) {
            addCriterion("SEX_CODE >", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SEX_CODE >=", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeLessThan(String value) {
            addCriterion("SEX_CODE <", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeLessThanOrEqualTo(String value) {
            addCriterion("SEX_CODE <=", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeLike(String value) {
            addCriterion("SEX_CODE like", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeNotLike(String value) {
            addCriterion("SEX_CODE not like", value, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeIn(List<String> values) {
            addCriterion("SEX_CODE in", values, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeNotIn(List<String> values) {
            addCriterion("SEX_CODE not in", values, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeBetween(String value1, String value2) {
            addCriterion("SEX_CODE between", value1, value2, "sexCode");
            return (Criteria) this;
        }

        public Criteria andSexCodeNotBetween(String value1, String value2) {
            addCriterion("SEX_CODE not between", value1, value2, "sexCode");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andCardLevelIsNull() {
            addCriterion("CARD_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCardLevelIsNotNull() {
            addCriterion("CARD_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCardLevelEqualTo(String value) {
            addCriterion("CARD_LEVEL =", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelNotEqualTo(String value) {
            addCriterion("CARD_LEVEL <>", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelGreaterThan(String value) {
            addCriterion("CARD_LEVEL >", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_LEVEL >=", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelLessThan(String value) {
            addCriterion("CARD_LEVEL <", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelLessThanOrEqualTo(String value) {
            addCriterion("CARD_LEVEL <=", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelLike(String value) {
            addCriterion("CARD_LEVEL like", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelNotLike(String value) {
            addCriterion("CARD_LEVEL not like", value, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelIn(List<String> values) {
            addCriterion("CARD_LEVEL in", values, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelNotIn(List<String> values) {
            addCriterion("CARD_LEVEL not in", values, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelBetween(String value1, String value2) {
            addCriterion("CARD_LEVEL between", value1, value2, "cardLevel");
            return (Criteria) this;
        }

        public Criteria andCardLevelNotBetween(String value1, String value2) {
            addCriterion("CARD_LEVEL not between", value1, value2, "cardLevel");
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

        public Criteria andPackageDeptIsNull() {
            addCriterion("PACKAGE_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andPackageDeptIsNotNull() {
            addCriterion("PACKAGE_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andPackageDeptEqualTo(String value) {
            addCriterion("PACKAGE_DEPT =", value, "packageDept");
            return (Criteria) this;
        }

        public Criteria andPackageDeptNotEqualTo(String value) {
            addCriterion("PACKAGE_DEPT <>", value, "packageDept");
            return (Criteria) this;
        }

        public Criteria andPackageDeptGreaterThan(String value) {
            addCriterion("PACKAGE_DEPT >", value, "packageDept");
            return (Criteria) this;
        }

        public Criteria andPackageDeptGreaterThanOrEqualTo(String value) {
            addCriterion("PACKAGE_DEPT >=", value, "packageDept");
            return (Criteria) this;
        }

        public Criteria andPackageDeptLessThan(String value) {
            addCriterion("PACKAGE_DEPT <", value, "packageDept");
            return (Criteria) this;
        }

        public Criteria andPackageDeptLessThanOrEqualTo(String value) {
            addCriterion("PACKAGE_DEPT <=", value, "packageDept");
            return (Criteria) this;
        }

        public Criteria andPackageDeptLike(String value) {
            addCriterion("PACKAGE_DEPT like", value, "packageDept");
            return (Criteria) this;
        }

        public Criteria andPackageDeptNotLike(String value) {
            addCriterion("PACKAGE_DEPT not like", value, "packageDept");
            return (Criteria) this;
        }

        public Criteria andPackageDeptIn(List<String> values) {
            addCriterion("PACKAGE_DEPT in", values, "packageDept");
            return (Criteria) this;
        }

        public Criteria andPackageDeptNotIn(List<String> values) {
            addCriterion("PACKAGE_DEPT not in", values, "packageDept");
            return (Criteria) this;
        }

        public Criteria andPackageDeptBetween(String value1, String value2) {
            addCriterion("PACKAGE_DEPT between", value1, value2, "packageDept");
            return (Criteria) this;
        }

        public Criteria andPackageDeptNotBetween(String value1, String value2) {
            addCriterion("PACKAGE_DEPT not between", value1, value2, "packageDept");
            return (Criteria) this;
        }

        public Criteria andConsultantIsNull() {
            addCriterion("CONSULTANT is null");
            return (Criteria) this;
        }

        public Criteria andConsultantIsNotNull() {
            addCriterion("CONSULTANT is not null");
            return (Criteria) this;
        }

        public Criteria andConsultantEqualTo(String value) {
            addCriterion("CONSULTANT =", value, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantNotEqualTo(String value) {
            addCriterion("CONSULTANT <>", value, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantGreaterThan(String value) {
            addCriterion("CONSULTANT >", value, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantGreaterThanOrEqualTo(String value) {
            addCriterion("CONSULTANT >=", value, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantLessThan(String value) {
            addCriterion("CONSULTANT <", value, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantLessThanOrEqualTo(String value) {
            addCriterion("CONSULTANT <=", value, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantLike(String value) {
            addCriterion("CONSULTANT like", value, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantNotLike(String value) {
            addCriterion("CONSULTANT not like", value, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantIn(List<String> values) {
            addCriterion("CONSULTANT in", values, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantNotIn(List<String> values) {
            addCriterion("CONSULTANT not in", values, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantBetween(String value1, String value2) {
            addCriterion("CONSULTANT between", value1, value2, "consultant");
            return (Criteria) this;
        }

        public Criteria andConsultantNotBetween(String value1, String value2) {
            addCriterion("CONSULTANT not between", value1, value2, "consultant");
            return (Criteria) this;
        }

        public Criteria andDelimitingCodeIsNull() {
            addCriterion("DELIMITING_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDelimitingCodeIsNotNull() {
            addCriterion("DELIMITING_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDelimitingCodeEqualTo(String value) {
            addCriterion("DELIMITING_CODE =", value, "delimitingCode");
            return (Criteria) this;
        }

        public Criteria andDelimitingCodeNotEqualTo(String value) {
            addCriterion("DELIMITING_CODE <>", value, "delimitingCode");
            return (Criteria) this;
        }

        public Criteria andDelimitingCodeGreaterThan(String value) {
            addCriterion("DELIMITING_CODE >", value, "delimitingCode");
            return (Criteria) this;
        }

        public Criteria andDelimitingCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DELIMITING_CODE >=", value, "delimitingCode");
            return (Criteria) this;
        }

        public Criteria andDelimitingCodeLessThan(String value) {
            addCriterion("DELIMITING_CODE <", value, "delimitingCode");
            return (Criteria) this;
        }

        public Criteria andDelimitingCodeLessThanOrEqualTo(String value) {
            addCriterion("DELIMITING_CODE <=", value, "delimitingCode");
            return (Criteria) this;
        }

        public Criteria andDelimitingCodeLike(String value) {
            addCriterion("DELIMITING_CODE like", value, "delimitingCode");
            return (Criteria) this;
        }

        public Criteria andDelimitingCodeNotLike(String value) {
            addCriterion("DELIMITING_CODE not like", value, "delimitingCode");
            return (Criteria) this;
        }

        public Criteria andDelimitingCodeIn(List<String> values) {
            addCriterion("DELIMITING_CODE in", values, "delimitingCode");
            return (Criteria) this;
        }

        public Criteria andDelimitingCodeNotIn(List<String> values) {
            addCriterion("DELIMITING_CODE not in", values, "delimitingCode");
            return (Criteria) this;
        }

        public Criteria andDelimitingCodeBetween(String value1, String value2) {
            addCriterion("DELIMITING_CODE between", value1, value2, "delimitingCode");
            return (Criteria) this;
        }

        public Criteria andDelimitingCodeNotBetween(String value1, String value2) {
            addCriterion("DELIMITING_CODE not between", value1, value2, "delimitingCode");
            return (Criteria) this;
        }

        public Criteria andDelimitingDateIsNull() {
            addCriterion("DELIMITING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDelimitingDateIsNotNull() {
            addCriterion("DELIMITING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDelimitingDateEqualTo(Date value) {
            addCriterion("DELIMITING_DATE =", value, "delimitingDate");
            return (Criteria) this;
        }

        public Criteria andDelimitingDateNotEqualTo(Date value) {
            addCriterion("DELIMITING_DATE <>", value, "delimitingDate");
            return (Criteria) this;
        }

        public Criteria andDelimitingDateGreaterThan(Date value) {
            addCriterion("DELIMITING_DATE >", value, "delimitingDate");
            return (Criteria) this;
        }

        public Criteria andDelimitingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIMITING_DATE >=", value, "delimitingDate");
            return (Criteria) this;
        }

        public Criteria andDelimitingDateLessThan(Date value) {
            addCriterion("DELIMITING_DATE <", value, "delimitingDate");
            return (Criteria) this;
        }

        public Criteria andDelimitingDateLessThanOrEqualTo(Date value) {
            addCriterion("DELIMITING_DATE <=", value, "delimitingDate");
            return (Criteria) this;
        }

        public Criteria andDelimitingDateIn(List<Date> values) {
            addCriterion("DELIMITING_DATE in", values, "delimitingDate");
            return (Criteria) this;
        }

        public Criteria andDelimitingDateNotIn(List<Date> values) {
            addCriterion("DELIMITING_DATE not in", values, "delimitingDate");
            return (Criteria) this;
        }

        public Criteria andDelimitingDateBetween(Date value1, Date value2) {
            addCriterion("DELIMITING_DATE between", value1, value2, "delimitingDate");
            return (Criteria) this;
        }

        public Criteria andDelimitingDateNotBetween(Date value1, Date value2) {
            addCriterion("DELIMITING_DATE not between", value1, value2, "delimitingDate");
            return (Criteria) this;
        }

        public Criteria andPackageCostIsNull() {
            addCriterion("PACKAGE_COST is null");
            return (Criteria) this;
        }

        public Criteria andPackageCostIsNotNull() {
            addCriterion("PACKAGE_COST is not null");
            return (Criteria) this;
        }

        public Criteria andPackageCostEqualTo(BigDecimal value) {
            addCriterion("PACKAGE_COST =", value, "packageCost");
            return (Criteria) this;
        }

        public Criteria andPackageCostNotEqualTo(BigDecimal value) {
            addCriterion("PACKAGE_COST <>", value, "packageCost");
            return (Criteria) this;
        }

        public Criteria andPackageCostGreaterThan(BigDecimal value) {
            addCriterion("PACKAGE_COST >", value, "packageCost");
            return (Criteria) this;
        }

        public Criteria andPackageCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKAGE_COST >=", value, "packageCost");
            return (Criteria) this;
        }

        public Criteria andPackageCostLessThan(BigDecimal value) {
            addCriterion("PACKAGE_COST <", value, "packageCost");
            return (Criteria) this;
        }

        public Criteria andPackageCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKAGE_COST <=", value, "packageCost");
            return (Criteria) this;
        }

        public Criteria andPackageCostIn(List<BigDecimal> values) {
            addCriterion("PACKAGE_COST in", values, "packageCost");
            return (Criteria) this;
        }

        public Criteria andPackageCostNotIn(List<BigDecimal> values) {
            addCriterion("PACKAGE_COST not in", values, "packageCost");
            return (Criteria) this;
        }

        public Criteria andPackageCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKAGE_COST between", value1, value2, "packageCost");
            return (Criteria) this;
        }

        public Criteria andPackageCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKAGE_COST not between", value1, value2, "packageCost");
            return (Criteria) this;
        }

        public Criteria andRealCostIsNull() {
            addCriterion("REAL_COST is null");
            return (Criteria) this;
        }

        public Criteria andRealCostIsNotNull() {
            addCriterion("REAL_COST is not null");
            return (Criteria) this;
        }

        public Criteria andRealCostEqualTo(BigDecimal value) {
            addCriterion("REAL_COST =", value, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostNotEqualTo(BigDecimal value) {
            addCriterion("REAL_COST <>", value, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostGreaterThan(BigDecimal value) {
            addCriterion("REAL_COST >", value, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_COST >=", value, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostLessThan(BigDecimal value) {
            addCriterion("REAL_COST <", value, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REAL_COST <=", value, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostIn(List<BigDecimal> values) {
            addCriterion("REAL_COST in", values, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostNotIn(List<BigDecimal> values) {
            addCriterion("REAL_COST not in", values, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_COST between", value1, value2, "realCost");
            return (Criteria) this;
        }

        public Criteria andRealCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REAL_COST not between", value1, value2, "realCost");
            return (Criteria) this;
        }

        public Criteria andGiftCostIsNull() {
            addCriterion("GIFT_COST is null");
            return (Criteria) this;
        }

        public Criteria andGiftCostIsNotNull() {
            addCriterion("GIFT_COST is not null");
            return (Criteria) this;
        }

        public Criteria andGiftCostEqualTo(BigDecimal value) {
            addCriterion("GIFT_COST =", value, "giftCost");
            return (Criteria) this;
        }

        public Criteria andGiftCostNotEqualTo(BigDecimal value) {
            addCriterion("GIFT_COST <>", value, "giftCost");
            return (Criteria) this;
        }

        public Criteria andGiftCostGreaterThan(BigDecimal value) {
            addCriterion("GIFT_COST >", value, "giftCost");
            return (Criteria) this;
        }

        public Criteria andGiftCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GIFT_COST >=", value, "giftCost");
            return (Criteria) this;
        }

        public Criteria andGiftCostLessThan(BigDecimal value) {
            addCriterion("GIFT_COST <", value, "giftCost");
            return (Criteria) this;
        }

        public Criteria andGiftCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GIFT_COST <=", value, "giftCost");
            return (Criteria) this;
        }

        public Criteria andGiftCostIn(List<BigDecimal> values) {
            addCriterion("GIFT_COST in", values, "giftCost");
            return (Criteria) this;
        }

        public Criteria andGiftCostNotIn(List<BigDecimal> values) {
            addCriterion("GIFT_COST not in", values, "giftCost");
            return (Criteria) this;
        }

        public Criteria andGiftCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GIFT_COST between", value1, value2, "giftCost");
            return (Criteria) this;
        }

        public Criteria andGiftCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GIFT_COST not between", value1, value2, "giftCost");
            return (Criteria) this;
        }

        public Criteria andEtcCostIsNull() {
            addCriterion("ETC_COST is null");
            return (Criteria) this;
        }

        public Criteria andEtcCostIsNotNull() {
            addCriterion("ETC_COST is not null");
            return (Criteria) this;
        }

        public Criteria andEtcCostEqualTo(BigDecimal value) {
            addCriterion("ETC_COST =", value, "etcCost");
            return (Criteria) this;
        }

        public Criteria andEtcCostNotEqualTo(BigDecimal value) {
            addCriterion("ETC_COST <>", value, "etcCost");
            return (Criteria) this;
        }

        public Criteria andEtcCostGreaterThan(BigDecimal value) {
            addCriterion("ETC_COST >", value, "etcCost");
            return (Criteria) this;
        }

        public Criteria andEtcCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ETC_COST >=", value, "etcCost");
            return (Criteria) this;
        }

        public Criteria andEtcCostLessThan(BigDecimal value) {
            addCriterion("ETC_COST <", value, "etcCost");
            return (Criteria) this;
        }

        public Criteria andEtcCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ETC_COST <=", value, "etcCost");
            return (Criteria) this;
        }

        public Criteria andEtcCostIn(List<BigDecimal> values) {
            addCriterion("ETC_COST in", values, "etcCost");
            return (Criteria) this;
        }

        public Criteria andEtcCostNotIn(List<BigDecimal> values) {
            addCriterion("ETC_COST not in", values, "etcCost");
            return (Criteria) this;
        }

        public Criteria andEtcCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ETC_COST between", value1, value2, "etcCost");
            return (Criteria) this;
        }

        public Criteria andEtcCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ETC_COST not between", value1, value2, "etcCost");
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

        public Criteria andCancelOperIsNull() {
            addCriterion("CANCEL_OPER is null");
            return (Criteria) this;
        }

        public Criteria andCancelOperIsNotNull() {
            addCriterion("CANCEL_OPER is not null");
            return (Criteria) this;
        }

        public Criteria andCancelOperEqualTo(String value) {
            addCriterion("CANCEL_OPER =", value, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperNotEqualTo(String value) {
            addCriterion("CANCEL_OPER <>", value, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperGreaterThan(String value) {
            addCriterion("CANCEL_OPER >", value, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_OPER >=", value, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperLessThan(String value) {
            addCriterion("CANCEL_OPER <", value, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_OPER <=", value, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperLike(String value) {
            addCriterion("CANCEL_OPER like", value, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperNotLike(String value) {
            addCriterion("CANCEL_OPER not like", value, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperIn(List<String> values) {
            addCriterion("CANCEL_OPER in", values, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperNotIn(List<String> values) {
            addCriterion("CANCEL_OPER not in", values, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperBetween(String value1, String value2) {
            addCriterion("CANCEL_OPER between", value1, value2, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelOperNotBetween(String value1, String value2) {
            addCriterion("CANCEL_OPER not between", value1, value2, "cancelOper");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNull() {
            addCriterion("CANCEL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNotNull() {
            addCriterion("CANCEL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCancelDateEqualTo(Date value) {
            addCriterion("CANCEL_DATE =", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotEqualTo(Date value) {
            addCriterion("CANCEL_DATE <>", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThan(Date value) {
            addCriterion("CANCEL_DATE >", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CANCEL_DATE >=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThan(Date value) {
            addCriterion("CANCEL_DATE <", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThanOrEqualTo(Date value) {
            addCriterion("CANCEL_DATE <=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIn(List<Date> values) {
            addCriterion("CANCEL_DATE in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotIn(List<Date> values) {
            addCriterion("CANCEL_DATE not in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateBetween(Date value1, Date value2) {
            addCriterion("CANCEL_DATE between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotBetween(Date value1, Date value2) {
            addCriterion("CANCEL_DATE not between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeIsNull() {
            addCriterion("ORIGINAL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeIsNotNull() {
            addCriterion("ORIGINAL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeEqualTo(String value) {
            addCriterion("ORIGINAL_CODE =", value, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeNotEqualTo(String value) {
            addCriterion("ORIGINAL_CODE <>", value, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeGreaterThan(String value) {
            addCriterion("ORIGINAL_CODE >", value, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_CODE >=", value, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeLessThan(String value) {
            addCriterion("ORIGINAL_CODE <", value, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeLessThanOrEqualTo(String value) {
            addCriterion("ORIGINAL_CODE <=", value, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeLike(String value) {
            addCriterion("ORIGINAL_CODE like", value, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeNotLike(String value) {
            addCriterion("ORIGINAL_CODE not like", value, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeIn(List<String> values) {
            addCriterion("ORIGINAL_CODE in", values, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeNotIn(List<String> values) {
            addCriterion("ORIGINAL_CODE not in", values, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeBetween(String value1, String value2) {
            addCriterion("ORIGINAL_CODE between", value1, value2, "originalCode");
            return (Criteria) this;
        }

        public Criteria andOriginalCodeNotBetween(String value1, String value2) {
            addCriterion("ORIGINAL_CODE not between", value1, value2, "originalCode");
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

        public Criteria andSequenceNoEqualTo(String value) {
            addCriterion("SEQUENCE_NO =", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoNotEqualTo(String value) {
            addCriterion("SEQUENCE_NO <>", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoGreaterThan(String value) {
            addCriterion("SEQUENCE_NO >", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoGreaterThanOrEqualTo(String value) {
            addCriterion("SEQUENCE_NO >=", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoLessThan(String value) {
            addCriterion("SEQUENCE_NO <", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoLessThanOrEqualTo(String value) {
            addCriterion("SEQUENCE_NO <=", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoLike(String value) {
            addCriterion("SEQUENCE_NO like", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoNotLike(String value) {
            addCriterion("SEQUENCE_NO not like", value, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoIn(List<String> values) {
            addCriterion("SEQUENCE_NO in", values, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoNotIn(List<String> values) {
            addCriterion("SEQUENCE_NO not in", values, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoBetween(String value1, String value2) {
            addCriterion("SEQUENCE_NO between", value1, value2, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andSequenceNoNotBetween(String value1, String value2) {
            addCriterion("SEQUENCE_NO not between", value1, value2, "sequenceNo");
            return (Criteria) this;
        }

        public Criteria andCostFlagIsNull() {
            addCriterion("COST_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCostFlagIsNotNull() {
            addCriterion("COST_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCostFlagEqualTo(String value) {
            addCriterion("COST_FLAG =", value, "costFlag");
            return (Criteria) this;
        }

        public Criteria andCostFlagNotEqualTo(String value) {
            addCriterion("COST_FLAG <>", value, "costFlag");
            return (Criteria) this;
        }

        public Criteria andCostFlagGreaterThan(String value) {
            addCriterion("COST_FLAG >", value, "costFlag");
            return (Criteria) this;
        }

        public Criteria andCostFlagGreaterThanOrEqualTo(String value) {
            addCriterion("COST_FLAG >=", value, "costFlag");
            return (Criteria) this;
        }

        public Criteria andCostFlagLessThan(String value) {
            addCriterion("COST_FLAG <", value, "costFlag");
            return (Criteria) this;
        }

        public Criteria andCostFlagLessThanOrEqualTo(String value) {
            addCriterion("COST_FLAG <=", value, "costFlag");
            return (Criteria) this;
        }

        public Criteria andCostFlagLike(String value) {
            addCriterion("COST_FLAG like", value, "costFlag");
            return (Criteria) this;
        }

        public Criteria andCostFlagNotLike(String value) {
            addCriterion("COST_FLAG not like", value, "costFlag");
            return (Criteria) this;
        }

        public Criteria andCostFlagIn(List<String> values) {
            addCriterion("COST_FLAG in", values, "costFlag");
            return (Criteria) this;
        }

        public Criteria andCostFlagNotIn(List<String> values) {
            addCriterion("COST_FLAG not in", values, "costFlag");
            return (Criteria) this;
        }

        public Criteria andCostFlagBetween(String value1, String value2) {
            addCriterion("COST_FLAG between", value1, value2, "costFlag");
            return (Criteria) this;
        }

        public Criteria andCostFlagNotBetween(String value1, String value2) {
            addCriterion("COST_FLAG not between", value1, value2, "costFlag");
            return (Criteria) this;
        }

        public Criteria andCostInvoiceIsNull() {
            addCriterion("COST_INVOICE is null");
            return (Criteria) this;
        }

        public Criteria andCostInvoiceIsNotNull() {
            addCriterion("COST_INVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andCostInvoiceEqualTo(String value) {
            addCriterion("COST_INVOICE =", value, "costInvoice");
            return (Criteria) this;
        }

        public Criteria andCostInvoiceNotEqualTo(String value) {
            addCriterion("COST_INVOICE <>", value, "costInvoice");
            return (Criteria) this;
        }

        public Criteria andCostInvoiceGreaterThan(String value) {
            addCriterion("COST_INVOICE >", value, "costInvoice");
            return (Criteria) this;
        }

        public Criteria andCostInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("COST_INVOICE >=", value, "costInvoice");
            return (Criteria) this;
        }

        public Criteria andCostInvoiceLessThan(String value) {
            addCriterion("COST_INVOICE <", value, "costInvoice");
            return (Criteria) this;
        }

        public Criteria andCostInvoiceLessThanOrEqualTo(String value) {
            addCriterion("COST_INVOICE <=", value, "costInvoice");
            return (Criteria) this;
        }

        public Criteria andCostInvoiceLike(String value) {
            addCriterion("COST_INVOICE like", value, "costInvoice");
            return (Criteria) this;
        }

        public Criteria andCostInvoiceNotLike(String value) {
            addCriterion("COST_INVOICE not like", value, "costInvoice");
            return (Criteria) this;
        }

        public Criteria andCostInvoiceIn(List<String> values) {
            addCriterion("COST_INVOICE in", values, "costInvoice");
            return (Criteria) this;
        }

        public Criteria andCostInvoiceNotIn(List<String> values) {
            addCriterion("COST_INVOICE not in", values, "costInvoice");
            return (Criteria) this;
        }

        public Criteria andCostInvoiceBetween(String value1, String value2) {
            addCriterion("COST_INVOICE between", value1, value2, "costInvoice");
            return (Criteria) this;
        }

        public Criteria andCostInvoiceNotBetween(String value1, String value2) {
            addCriterion("COST_INVOICE not between", value1, value2, "costInvoice");
            return (Criteria) this;
        }

        public Criteria andCostclinicCodeIsNull() {
            addCriterion("COSTCLINIC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCostclinicCodeIsNotNull() {
            addCriterion("COSTCLINIC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCostclinicCodeEqualTo(String value) {
            addCriterion("COSTCLINIC_CODE =", value, "costclinicCode");
            return (Criteria) this;
        }

        public Criteria andCostclinicCodeNotEqualTo(String value) {
            addCriterion("COSTCLINIC_CODE <>", value, "costclinicCode");
            return (Criteria) this;
        }

        public Criteria andCostclinicCodeGreaterThan(String value) {
            addCriterion("COSTCLINIC_CODE >", value, "costclinicCode");
            return (Criteria) this;
        }

        public Criteria andCostclinicCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COSTCLINIC_CODE >=", value, "costclinicCode");
            return (Criteria) this;
        }

        public Criteria andCostclinicCodeLessThan(String value) {
            addCriterion("COSTCLINIC_CODE <", value, "costclinicCode");
            return (Criteria) this;
        }

        public Criteria andCostclinicCodeLessThanOrEqualTo(String value) {
            addCriterion("COSTCLINIC_CODE <=", value, "costclinicCode");
            return (Criteria) this;
        }

        public Criteria andCostclinicCodeLike(String value) {
            addCriterion("COSTCLINIC_CODE like", value, "costclinicCode");
            return (Criteria) this;
        }

        public Criteria andCostclinicCodeNotLike(String value) {
            addCriterion("COSTCLINIC_CODE not like", value, "costclinicCode");
            return (Criteria) this;
        }

        public Criteria andCostclinicCodeIn(List<String> values) {
            addCriterion("COSTCLINIC_CODE in", values, "costclinicCode");
            return (Criteria) this;
        }

        public Criteria andCostclinicCodeNotIn(List<String> values) {
            addCriterion("COSTCLINIC_CODE not in", values, "costclinicCode");
            return (Criteria) this;
        }

        public Criteria andCostclinicCodeBetween(String value1, String value2) {
            addCriterion("COSTCLINIC_CODE between", value1, value2, "costclinicCode");
            return (Criteria) this;
        }

        public Criteria andCostclinicCodeNotBetween(String value1, String value2) {
            addCriterion("COSTCLINIC_CODE not between", value1, value2, "costclinicCode");
            return (Criteria) this;
        }

        public Criteria andUsetypeIsNull() {
            addCriterion("USETYPE is null");
            return (Criteria) this;
        }

        public Criteria andUsetypeIsNotNull() {
            addCriterion("USETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUsetypeEqualTo(String value) {
            addCriterion("USETYPE =", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotEqualTo(String value) {
            addCriterion("USETYPE <>", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeGreaterThan(String value) {
            addCriterion("USETYPE >", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeGreaterThanOrEqualTo(String value) {
            addCriterion("USETYPE >=", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeLessThan(String value) {
            addCriterion("USETYPE <", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeLessThanOrEqualTo(String value) {
            addCriterion("USETYPE <=", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeLike(String value) {
            addCriterion("USETYPE like", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotLike(String value) {
            addCriterion("USETYPE not like", value, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeIn(List<String> values) {
            addCriterion("USETYPE in", values, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotIn(List<String> values) {
            addCriterion("USETYPE not in", values, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeBetween(String value1, String value2) {
            addCriterion("USETYPE between", value1, value2, "usetype");
            return (Criteria) this;
        }

        public Criteria andUsetypeNotBetween(String value1, String value2) {
            addCriterion("USETYPE not between", value1, value2, "usetype");
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

        public Criteria andPackagesequenceNoIsNull() {
            addCriterion("PACKAGESEQUENCE_NO is null");
            return (Criteria) this;
        }

        public Criteria andPackagesequenceNoIsNotNull() {
            addCriterion("PACKAGESEQUENCE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPackagesequenceNoEqualTo(String value) {
            addCriterion("PACKAGESEQUENCE_NO =", value, "packagesequenceNo");
            return (Criteria) this;
        }

        public Criteria andPackagesequenceNoNotEqualTo(String value) {
            addCriterion("PACKAGESEQUENCE_NO <>", value, "packagesequenceNo");
            return (Criteria) this;
        }

        public Criteria andPackagesequenceNoGreaterThan(String value) {
            addCriterion("PACKAGESEQUENCE_NO >", value, "packagesequenceNo");
            return (Criteria) this;
        }

        public Criteria andPackagesequenceNoGreaterThanOrEqualTo(String value) {
            addCriterion("PACKAGESEQUENCE_NO >=", value, "packagesequenceNo");
            return (Criteria) this;
        }

        public Criteria andPackagesequenceNoLessThan(String value) {
            addCriterion("PACKAGESEQUENCE_NO <", value, "packagesequenceNo");
            return (Criteria) this;
        }

        public Criteria andPackagesequenceNoLessThanOrEqualTo(String value) {
            addCriterion("PACKAGESEQUENCE_NO <=", value, "packagesequenceNo");
            return (Criteria) this;
        }

        public Criteria andPackagesequenceNoLike(String value) {
            addCriterion("PACKAGESEQUENCE_NO like", value, "packagesequenceNo");
            return (Criteria) this;
        }

        public Criteria andPackagesequenceNoNotLike(String value) {
            addCriterion("PACKAGESEQUENCE_NO not like", value, "packagesequenceNo");
            return (Criteria) this;
        }

        public Criteria andPackagesequenceNoIn(List<String> values) {
            addCriterion("PACKAGESEQUENCE_NO in", values, "packagesequenceNo");
            return (Criteria) this;
        }

        public Criteria andPackagesequenceNoNotIn(List<String> values) {
            addCriterion("PACKAGESEQUENCE_NO not in", values, "packagesequenceNo");
            return (Criteria) this;
        }

        public Criteria andPackagesequenceNoBetween(String value1, String value2) {
            addCriterion("PACKAGESEQUENCE_NO between", value1, value2, "packagesequenceNo");
            return (Criteria) this;
        }

        public Criteria andPackagesequenceNoNotBetween(String value1, String value2) {
            addCriterion("PACKAGESEQUENCE_NO not between", value1, value2, "packagesequenceNo");
            return (Criteria) this;
        }

        public Criteria andParentpackageidIsNull() {
            addCriterion("PARENTPACKAGEID is null");
            return (Criteria) this;
        }

        public Criteria andParentpackageidIsNotNull() {
            addCriterion("PARENTPACKAGEID is not null");
            return (Criteria) this;
        }

        public Criteria andParentpackageidEqualTo(String value) {
            addCriterion("PARENTPACKAGEID =", value, "parentpackageid");
            return (Criteria) this;
        }

        public Criteria andParentpackageidNotEqualTo(String value) {
            addCriterion("PARENTPACKAGEID <>", value, "parentpackageid");
            return (Criteria) this;
        }

        public Criteria andParentpackageidGreaterThan(String value) {
            addCriterion("PARENTPACKAGEID >", value, "parentpackageid");
            return (Criteria) this;
        }

        public Criteria andParentpackageidGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTPACKAGEID >=", value, "parentpackageid");
            return (Criteria) this;
        }

        public Criteria andParentpackageidLessThan(String value) {
            addCriterion("PARENTPACKAGEID <", value, "parentpackageid");
            return (Criteria) this;
        }

        public Criteria andParentpackageidLessThanOrEqualTo(String value) {
            addCriterion("PARENTPACKAGEID <=", value, "parentpackageid");
            return (Criteria) this;
        }

        public Criteria andParentpackageidLike(String value) {
            addCriterion("PARENTPACKAGEID like", value, "parentpackageid");
            return (Criteria) this;
        }

        public Criteria andParentpackageidNotLike(String value) {
            addCriterion("PARENTPACKAGEID not like", value, "parentpackageid");
            return (Criteria) this;
        }

        public Criteria andParentpackageidIn(List<String> values) {
            addCriterion("PARENTPACKAGEID in", values, "parentpackageid");
            return (Criteria) this;
        }

        public Criteria andParentpackageidNotIn(List<String> values) {
            addCriterion("PARENTPACKAGEID not in", values, "parentpackageid");
            return (Criteria) this;
        }

        public Criteria andParentpackageidBetween(String value1, String value2) {
            addCriterion("PARENTPACKAGEID between", value1, value2, "parentpackageid");
            return (Criteria) this;
        }

        public Criteria andParentpackageidNotBetween(String value1, String value2) {
            addCriterion("PARENTPACKAGEID not between", value1, value2, "parentpackageid");
            return (Criteria) this;
        }

        public Criteria andParentpackagenameIsNull() {
            addCriterion("PARENTPACKAGENAME is null");
            return (Criteria) this;
        }

        public Criteria andParentpackagenameIsNotNull() {
            addCriterion("PARENTPACKAGENAME is not null");
            return (Criteria) this;
        }

        public Criteria andParentpackagenameEqualTo(String value) {
            addCriterion("PARENTPACKAGENAME =", value, "parentpackagename");
            return (Criteria) this;
        }

        public Criteria andParentpackagenameNotEqualTo(String value) {
            addCriterion("PARENTPACKAGENAME <>", value, "parentpackagename");
            return (Criteria) this;
        }

        public Criteria andParentpackagenameGreaterThan(String value) {
            addCriterion("PARENTPACKAGENAME >", value, "parentpackagename");
            return (Criteria) this;
        }

        public Criteria andParentpackagenameGreaterThanOrEqualTo(String value) {
            addCriterion("PARENTPACKAGENAME >=", value, "parentpackagename");
            return (Criteria) this;
        }

        public Criteria andParentpackagenameLessThan(String value) {
            addCriterion("PARENTPACKAGENAME <", value, "parentpackagename");
            return (Criteria) this;
        }

        public Criteria andParentpackagenameLessThanOrEqualTo(String value) {
            addCriterion("PARENTPACKAGENAME <=", value, "parentpackagename");
            return (Criteria) this;
        }

        public Criteria andParentpackagenameLike(String value) {
            addCriterion("PARENTPACKAGENAME like", value, "parentpackagename");
            return (Criteria) this;
        }

        public Criteria andParentpackagenameNotLike(String value) {
            addCriterion("PARENTPACKAGENAME not like", value, "parentpackagename");
            return (Criteria) this;
        }

        public Criteria andParentpackagenameIn(List<String> values) {
            addCriterion("PARENTPACKAGENAME in", values, "parentpackagename");
            return (Criteria) this;
        }

        public Criteria andParentpackagenameNotIn(List<String> values) {
            addCriterion("PARENTPACKAGENAME not in", values, "parentpackagename");
            return (Criteria) this;
        }

        public Criteria andParentpackagenameBetween(String value1, String value2) {
            addCriterion("PARENTPACKAGENAME between", value1, value2, "parentpackagename");
            return (Criteria) this;
        }

        public Criteria andParentpackagenameNotBetween(String value1, String value2) {
            addCriterion("PARENTPACKAGENAME not between", value1, value2, "parentpackagename");
            return (Criteria) this;
        }

        public Criteria andPackagenumIsNull() {
            addCriterion("PACKAGENUM is null");
            return (Criteria) this;
        }

        public Criteria andPackagenumIsNotNull() {
            addCriterion("PACKAGENUM is not null");
            return (Criteria) this;
        }

        public Criteria andPackagenumEqualTo(BigDecimal value) {
            addCriterion("PACKAGENUM =", value, "packagenum");
            return (Criteria) this;
        }

        public Criteria andPackagenumNotEqualTo(BigDecimal value) {
            addCriterion("PACKAGENUM <>", value, "packagenum");
            return (Criteria) this;
        }

        public Criteria andPackagenumGreaterThan(BigDecimal value) {
            addCriterion("PACKAGENUM >", value, "packagenum");
            return (Criteria) this;
        }

        public Criteria andPackagenumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKAGENUM >=", value, "packagenum");
            return (Criteria) this;
        }

        public Criteria andPackagenumLessThan(BigDecimal value) {
            addCriterion("PACKAGENUM <", value, "packagenum");
            return (Criteria) this;
        }

        public Criteria andPackagenumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKAGENUM <=", value, "packagenum");
            return (Criteria) this;
        }

        public Criteria andPackagenumIn(List<BigDecimal> values) {
            addCriterion("PACKAGENUM in", values, "packagenum");
            return (Criteria) this;
        }

        public Criteria andPackagenumNotIn(List<BigDecimal> values) {
            addCriterion("PACKAGENUM not in", values, "packagenum");
            return (Criteria) this;
        }

        public Criteria andPackagenumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKAGENUM between", value1, value2, "packagenum");
            return (Criteria) this;
        }

        public Criteria andPackagenumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKAGENUM not between", value1, value2, "packagenum");
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