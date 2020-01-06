package com.slionh.patientview.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FinOprRegisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinOprRegisterExample() {
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

        public Criteria andNoonCodeIsNull() {
            addCriterion("NOON_CODE is null");
            return (Criteria) this;
        }

        public Criteria andNoonCodeIsNotNull() {
            addCriterion("NOON_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andNoonCodeEqualTo(String value) {
            addCriterion("NOON_CODE =", value, "noonCode");
            return (Criteria) this;
        }

        public Criteria andNoonCodeNotEqualTo(String value) {
            addCriterion("NOON_CODE <>", value, "noonCode");
            return (Criteria) this;
        }

        public Criteria andNoonCodeGreaterThan(String value) {
            addCriterion("NOON_CODE >", value, "noonCode");
            return (Criteria) this;
        }

        public Criteria andNoonCodeGreaterThanOrEqualTo(String value) {
            addCriterion("NOON_CODE >=", value, "noonCode");
            return (Criteria) this;
        }

        public Criteria andNoonCodeLessThan(String value) {
            addCriterion("NOON_CODE <", value, "noonCode");
            return (Criteria) this;
        }

        public Criteria andNoonCodeLessThanOrEqualTo(String value) {
            addCriterion("NOON_CODE <=", value, "noonCode");
            return (Criteria) this;
        }

        public Criteria andNoonCodeLike(String value) {
            addCriterion("NOON_CODE like", value, "noonCode");
            return (Criteria) this;
        }

        public Criteria andNoonCodeNotLike(String value) {
            addCriterion("NOON_CODE not like", value, "noonCode");
            return (Criteria) this;
        }

        public Criteria andNoonCodeIn(List<String> values) {
            addCriterion("NOON_CODE in", values, "noonCode");
            return (Criteria) this;
        }

        public Criteria andNoonCodeNotIn(List<String> values) {
            addCriterion("NOON_CODE not in", values, "noonCode");
            return (Criteria) this;
        }

        public Criteria andNoonCodeBetween(String value1, String value2) {
            addCriterion("NOON_CODE between", value1, value2, "noonCode");
            return (Criteria) this;
        }

        public Criteria andNoonCodeNotBetween(String value1, String value2) {
            addCriterion("NOON_CODE not between", value1, value2, "noonCode");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdennoIsNull() {
            addCriterion("IDENNO is null");
            return (Criteria) this;
        }

        public Criteria andIdennoIsNotNull() {
            addCriterion("IDENNO is not null");
            return (Criteria) this;
        }

        public Criteria andIdennoEqualTo(String value) {
            addCriterion("IDENNO =", value, "idenno");
            return (Criteria) this;
        }

        public Criteria andIdennoNotEqualTo(String value) {
            addCriterion("IDENNO <>", value, "idenno");
            return (Criteria) this;
        }

        public Criteria andIdennoGreaterThan(String value) {
            addCriterion("IDENNO >", value, "idenno");
            return (Criteria) this;
        }

        public Criteria andIdennoGreaterThanOrEqualTo(String value) {
            addCriterion("IDENNO >=", value, "idenno");
            return (Criteria) this;
        }

        public Criteria andIdennoLessThan(String value) {
            addCriterion("IDENNO <", value, "idenno");
            return (Criteria) this;
        }

        public Criteria andIdennoLessThanOrEqualTo(String value) {
            addCriterion("IDENNO <=", value, "idenno");
            return (Criteria) this;
        }

        public Criteria andIdennoLike(String value) {
            addCriterion("IDENNO like", value, "idenno");
            return (Criteria) this;
        }

        public Criteria andIdennoNotLike(String value) {
            addCriterion("IDENNO not like", value, "idenno");
            return (Criteria) this;
        }

        public Criteria andIdennoIn(List<String> values) {
            addCriterion("IDENNO in", values, "idenno");
            return (Criteria) this;
        }

        public Criteria andIdennoNotIn(List<String> values) {
            addCriterion("IDENNO not in", values, "idenno");
            return (Criteria) this;
        }

        public Criteria andIdennoBetween(String value1, String value2) {
            addCriterion("IDENNO between", value1, value2, "idenno");
            return (Criteria) this;
        }

        public Criteria andIdennoNotBetween(String value1, String value2) {
            addCriterion("IDENNO not between", value1, value2, "idenno");
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

        public Criteria andRelaPhoneIsNull() {
            addCriterion("RELA_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andRelaPhoneIsNotNull() {
            addCriterion("RELA_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andRelaPhoneEqualTo(String value) {
            addCriterion("RELA_PHONE =", value, "relaPhone");
            return (Criteria) this;
        }

        public Criteria andRelaPhoneNotEqualTo(String value) {
            addCriterion("RELA_PHONE <>", value, "relaPhone");
            return (Criteria) this;
        }

        public Criteria andRelaPhoneGreaterThan(String value) {
            addCriterion("RELA_PHONE >", value, "relaPhone");
            return (Criteria) this;
        }

        public Criteria andRelaPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("RELA_PHONE >=", value, "relaPhone");
            return (Criteria) this;
        }

        public Criteria andRelaPhoneLessThan(String value) {
            addCriterion("RELA_PHONE <", value, "relaPhone");
            return (Criteria) this;
        }

        public Criteria andRelaPhoneLessThanOrEqualTo(String value) {
            addCriterion("RELA_PHONE <=", value, "relaPhone");
            return (Criteria) this;
        }

        public Criteria andRelaPhoneLike(String value) {
            addCriterion("RELA_PHONE like", value, "relaPhone");
            return (Criteria) this;
        }

        public Criteria andRelaPhoneNotLike(String value) {
            addCriterion("RELA_PHONE not like", value, "relaPhone");
            return (Criteria) this;
        }

        public Criteria andRelaPhoneIn(List<String> values) {
            addCriterion("RELA_PHONE in", values, "relaPhone");
            return (Criteria) this;
        }

        public Criteria andRelaPhoneNotIn(List<String> values) {
            addCriterion("RELA_PHONE not in", values, "relaPhone");
            return (Criteria) this;
        }

        public Criteria andRelaPhoneBetween(String value1, String value2) {
            addCriterion("RELA_PHONE between", value1, value2, "relaPhone");
            return (Criteria) this;
        }

        public Criteria andRelaPhoneNotBetween(String value1, String value2) {
            addCriterion("RELA_PHONE not between", value1, value2, "relaPhone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("CARD_TYPE =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("CARD_TYPE <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("CARD_TYPE >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("CARD_TYPE <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("CARD_TYPE <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("CARD_TYPE like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("CARD_TYPE not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("CARD_TYPE in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("CARD_TYPE not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("CARD_TYPE between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("CARD_TYPE not between", value1, value2, "cardType");
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

        public Criteria andPaykindNameIsNull() {
            addCriterion("PAYKIND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPaykindNameIsNotNull() {
            addCriterion("PAYKIND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPaykindNameEqualTo(String value) {
            addCriterion("PAYKIND_NAME =", value, "paykindName");
            return (Criteria) this;
        }

        public Criteria andPaykindNameNotEqualTo(String value) {
            addCriterion("PAYKIND_NAME <>", value, "paykindName");
            return (Criteria) this;
        }

        public Criteria andPaykindNameGreaterThan(String value) {
            addCriterion("PAYKIND_NAME >", value, "paykindName");
            return (Criteria) this;
        }

        public Criteria andPaykindNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYKIND_NAME >=", value, "paykindName");
            return (Criteria) this;
        }

        public Criteria andPaykindNameLessThan(String value) {
            addCriterion("PAYKIND_NAME <", value, "paykindName");
            return (Criteria) this;
        }

        public Criteria andPaykindNameLessThanOrEqualTo(String value) {
            addCriterion("PAYKIND_NAME <=", value, "paykindName");
            return (Criteria) this;
        }

        public Criteria andPaykindNameLike(String value) {
            addCriterion("PAYKIND_NAME like", value, "paykindName");
            return (Criteria) this;
        }

        public Criteria andPaykindNameNotLike(String value) {
            addCriterion("PAYKIND_NAME not like", value, "paykindName");
            return (Criteria) this;
        }

        public Criteria andPaykindNameIn(List<String> values) {
            addCriterion("PAYKIND_NAME in", values, "paykindName");
            return (Criteria) this;
        }

        public Criteria andPaykindNameNotIn(List<String> values) {
            addCriterion("PAYKIND_NAME not in", values, "paykindName");
            return (Criteria) this;
        }

        public Criteria andPaykindNameBetween(String value1, String value2) {
            addCriterion("PAYKIND_NAME between", value1, value2, "paykindName");
            return (Criteria) this;
        }

        public Criteria andPaykindNameNotBetween(String value1, String value2) {
            addCriterion("PAYKIND_NAME not between", value1, value2, "paykindName");
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

        public Criteria andPactNameIsNull() {
            addCriterion("PACT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPactNameIsNotNull() {
            addCriterion("PACT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPactNameEqualTo(String value) {
            addCriterion("PACT_NAME =", value, "pactName");
            return (Criteria) this;
        }

        public Criteria andPactNameNotEqualTo(String value) {
            addCriterion("PACT_NAME <>", value, "pactName");
            return (Criteria) this;
        }

        public Criteria andPactNameGreaterThan(String value) {
            addCriterion("PACT_NAME >", value, "pactName");
            return (Criteria) this;
        }

        public Criteria andPactNameGreaterThanOrEqualTo(String value) {
            addCriterion("PACT_NAME >=", value, "pactName");
            return (Criteria) this;
        }

        public Criteria andPactNameLessThan(String value) {
            addCriterion("PACT_NAME <", value, "pactName");
            return (Criteria) this;
        }

        public Criteria andPactNameLessThanOrEqualTo(String value) {
            addCriterion("PACT_NAME <=", value, "pactName");
            return (Criteria) this;
        }

        public Criteria andPactNameLike(String value) {
            addCriterion("PACT_NAME like", value, "pactName");
            return (Criteria) this;
        }

        public Criteria andPactNameNotLike(String value) {
            addCriterion("PACT_NAME not like", value, "pactName");
            return (Criteria) this;
        }

        public Criteria andPactNameIn(List<String> values) {
            addCriterion("PACT_NAME in", values, "pactName");
            return (Criteria) this;
        }

        public Criteria andPactNameNotIn(List<String> values) {
            addCriterion("PACT_NAME not in", values, "pactName");
            return (Criteria) this;
        }

        public Criteria andPactNameBetween(String value1, String value2) {
            addCriterion("PACT_NAME between", value1, value2, "pactName");
            return (Criteria) this;
        }

        public Criteria andPactNameNotBetween(String value1, String value2) {
            addCriterion("PACT_NAME not between", value1, value2, "pactName");
            return (Criteria) this;
        }

        public Criteria andMcardNoIsNull() {
            addCriterion("MCARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andMcardNoIsNotNull() {
            addCriterion("MCARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMcardNoEqualTo(String value) {
            addCriterion("MCARD_NO =", value, "mcardNo");
            return (Criteria) this;
        }

        public Criteria andMcardNoNotEqualTo(String value) {
            addCriterion("MCARD_NO <>", value, "mcardNo");
            return (Criteria) this;
        }

        public Criteria andMcardNoGreaterThan(String value) {
            addCriterion("MCARD_NO >", value, "mcardNo");
            return (Criteria) this;
        }

        public Criteria andMcardNoGreaterThanOrEqualTo(String value) {
            addCriterion("MCARD_NO >=", value, "mcardNo");
            return (Criteria) this;
        }

        public Criteria andMcardNoLessThan(String value) {
            addCriterion("MCARD_NO <", value, "mcardNo");
            return (Criteria) this;
        }

        public Criteria andMcardNoLessThanOrEqualTo(String value) {
            addCriterion("MCARD_NO <=", value, "mcardNo");
            return (Criteria) this;
        }

        public Criteria andMcardNoLike(String value) {
            addCriterion("MCARD_NO like", value, "mcardNo");
            return (Criteria) this;
        }

        public Criteria andMcardNoNotLike(String value) {
            addCriterion("MCARD_NO not like", value, "mcardNo");
            return (Criteria) this;
        }

        public Criteria andMcardNoIn(List<String> values) {
            addCriterion("MCARD_NO in", values, "mcardNo");
            return (Criteria) this;
        }

        public Criteria andMcardNoNotIn(List<String> values) {
            addCriterion("MCARD_NO not in", values, "mcardNo");
            return (Criteria) this;
        }

        public Criteria andMcardNoBetween(String value1, String value2) {
            addCriterion("MCARD_NO between", value1, value2, "mcardNo");
            return (Criteria) this;
        }

        public Criteria andMcardNoNotBetween(String value1, String value2) {
            addCriterion("MCARD_NO not between", value1, value2, "mcardNo");
            return (Criteria) this;
        }

        public Criteria andReglevlCodeIsNull() {
            addCriterion("REGLEVL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReglevlCodeIsNotNull() {
            addCriterion("REGLEVL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReglevlCodeEqualTo(String value) {
            addCriterion("REGLEVL_CODE =", value, "reglevlCode");
            return (Criteria) this;
        }

        public Criteria andReglevlCodeNotEqualTo(String value) {
            addCriterion("REGLEVL_CODE <>", value, "reglevlCode");
            return (Criteria) this;
        }

        public Criteria andReglevlCodeGreaterThan(String value) {
            addCriterion("REGLEVL_CODE >", value, "reglevlCode");
            return (Criteria) this;
        }

        public Criteria andReglevlCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REGLEVL_CODE >=", value, "reglevlCode");
            return (Criteria) this;
        }

        public Criteria andReglevlCodeLessThan(String value) {
            addCriterion("REGLEVL_CODE <", value, "reglevlCode");
            return (Criteria) this;
        }

        public Criteria andReglevlCodeLessThanOrEqualTo(String value) {
            addCriterion("REGLEVL_CODE <=", value, "reglevlCode");
            return (Criteria) this;
        }

        public Criteria andReglevlCodeLike(String value) {
            addCriterion("REGLEVL_CODE like", value, "reglevlCode");
            return (Criteria) this;
        }

        public Criteria andReglevlCodeNotLike(String value) {
            addCriterion("REGLEVL_CODE not like", value, "reglevlCode");
            return (Criteria) this;
        }

        public Criteria andReglevlCodeIn(List<String> values) {
            addCriterion("REGLEVL_CODE in", values, "reglevlCode");
            return (Criteria) this;
        }

        public Criteria andReglevlCodeNotIn(List<String> values) {
            addCriterion("REGLEVL_CODE not in", values, "reglevlCode");
            return (Criteria) this;
        }

        public Criteria andReglevlCodeBetween(String value1, String value2) {
            addCriterion("REGLEVL_CODE between", value1, value2, "reglevlCode");
            return (Criteria) this;
        }

        public Criteria andReglevlCodeNotBetween(String value1, String value2) {
            addCriterion("REGLEVL_CODE not between", value1, value2, "reglevlCode");
            return (Criteria) this;
        }

        public Criteria andReglevlNameIsNull() {
            addCriterion("REGLEVL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReglevlNameIsNotNull() {
            addCriterion("REGLEVL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReglevlNameEqualTo(String value) {
            addCriterion("REGLEVL_NAME =", value, "reglevlName");
            return (Criteria) this;
        }

        public Criteria andReglevlNameNotEqualTo(String value) {
            addCriterion("REGLEVL_NAME <>", value, "reglevlName");
            return (Criteria) this;
        }

        public Criteria andReglevlNameGreaterThan(String value) {
            addCriterion("REGLEVL_NAME >", value, "reglevlName");
            return (Criteria) this;
        }

        public Criteria andReglevlNameGreaterThanOrEqualTo(String value) {
            addCriterion("REGLEVL_NAME >=", value, "reglevlName");
            return (Criteria) this;
        }

        public Criteria andReglevlNameLessThan(String value) {
            addCriterion("REGLEVL_NAME <", value, "reglevlName");
            return (Criteria) this;
        }

        public Criteria andReglevlNameLessThanOrEqualTo(String value) {
            addCriterion("REGLEVL_NAME <=", value, "reglevlName");
            return (Criteria) this;
        }

        public Criteria andReglevlNameLike(String value) {
            addCriterion("REGLEVL_NAME like", value, "reglevlName");
            return (Criteria) this;
        }

        public Criteria andReglevlNameNotLike(String value) {
            addCriterion("REGLEVL_NAME not like", value, "reglevlName");
            return (Criteria) this;
        }

        public Criteria andReglevlNameIn(List<String> values) {
            addCriterion("REGLEVL_NAME in", values, "reglevlName");
            return (Criteria) this;
        }

        public Criteria andReglevlNameNotIn(List<String> values) {
            addCriterion("REGLEVL_NAME not in", values, "reglevlName");
            return (Criteria) this;
        }

        public Criteria andReglevlNameBetween(String value1, String value2) {
            addCriterion("REGLEVL_NAME between", value1, value2, "reglevlName");
            return (Criteria) this;
        }

        public Criteria andReglevlNameNotBetween(String value1, String value2) {
            addCriterion("REGLEVL_NAME not between", value1, value2, "reglevlName");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNull() {
            addCriterion("DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("DEPT_CODE =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("DEPT_CODE <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("DEPT_CODE >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("DEPT_CODE <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("DEPT_CODE like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("DEPT_CODE not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("DEPT_CODE in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("DEPT_CODE not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("DEPT_CODE between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("DEPT_CODE not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("DEPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("DEPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("DEPT_NAME =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("DEPT_NAME <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("DEPT_NAME >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("DEPT_NAME <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("DEPT_NAME like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("DEPT_NAME not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("DEPT_NAME in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("DEPT_NAME not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("DEPT_NAME between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("DEPT_NAME not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andSchemaNoIsNull() {
            addCriterion("SCHEMA_NO is null");
            return (Criteria) this;
        }

        public Criteria andSchemaNoIsNotNull() {
            addCriterion("SCHEMA_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSchemaNoEqualTo(String value) {
            addCriterion("SCHEMA_NO =", value, "schemaNo");
            return (Criteria) this;
        }

        public Criteria andSchemaNoNotEqualTo(String value) {
            addCriterion("SCHEMA_NO <>", value, "schemaNo");
            return (Criteria) this;
        }

        public Criteria andSchemaNoGreaterThan(String value) {
            addCriterion("SCHEMA_NO >", value, "schemaNo");
            return (Criteria) this;
        }

        public Criteria andSchemaNoGreaterThanOrEqualTo(String value) {
            addCriterion("SCHEMA_NO >=", value, "schemaNo");
            return (Criteria) this;
        }

        public Criteria andSchemaNoLessThan(String value) {
            addCriterion("SCHEMA_NO <", value, "schemaNo");
            return (Criteria) this;
        }

        public Criteria andSchemaNoLessThanOrEqualTo(String value) {
            addCriterion("SCHEMA_NO <=", value, "schemaNo");
            return (Criteria) this;
        }

        public Criteria andSchemaNoLike(String value) {
            addCriterion("SCHEMA_NO like", value, "schemaNo");
            return (Criteria) this;
        }

        public Criteria andSchemaNoNotLike(String value) {
            addCriterion("SCHEMA_NO not like", value, "schemaNo");
            return (Criteria) this;
        }

        public Criteria andSchemaNoIn(List<String> values) {
            addCriterion("SCHEMA_NO in", values, "schemaNo");
            return (Criteria) this;
        }

        public Criteria andSchemaNoNotIn(List<String> values) {
            addCriterion("SCHEMA_NO not in", values, "schemaNo");
            return (Criteria) this;
        }

        public Criteria andSchemaNoBetween(String value1, String value2) {
            addCriterion("SCHEMA_NO between", value1, value2, "schemaNo");
            return (Criteria) this;
        }

        public Criteria andSchemaNoNotBetween(String value1, String value2) {
            addCriterion("SCHEMA_NO not between", value1, value2, "schemaNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(Integer value) {
            addCriterion("ORDER_NO =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(Integer value) {
            addCriterion("ORDER_NO <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(Integer value) {
            addCriterion("ORDER_NO >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NO >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(Integer value) {
            addCriterion("ORDER_NO <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_NO <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<Integer> values) {
            addCriterion("ORDER_NO in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<Integer> values) {
            addCriterion("ORDER_NO not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NO between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_NO not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andSeenoIsNull() {
            addCriterion("SEENO is null");
            return (Criteria) this;
        }

        public Criteria andSeenoIsNotNull() {
            addCriterion("SEENO is not null");
            return (Criteria) this;
        }

        public Criteria andSeenoEqualTo(Long value) {
            addCriterion("SEENO =", value, "seeno");
            return (Criteria) this;
        }

        public Criteria andSeenoNotEqualTo(Long value) {
            addCriterion("SEENO <>", value, "seeno");
            return (Criteria) this;
        }

        public Criteria andSeenoGreaterThan(Long value) {
            addCriterion("SEENO >", value, "seeno");
            return (Criteria) this;
        }

        public Criteria andSeenoGreaterThanOrEqualTo(Long value) {
            addCriterion("SEENO >=", value, "seeno");
            return (Criteria) this;
        }

        public Criteria andSeenoLessThan(Long value) {
            addCriterion("SEENO <", value, "seeno");
            return (Criteria) this;
        }

        public Criteria andSeenoLessThanOrEqualTo(Long value) {
            addCriterion("SEENO <=", value, "seeno");
            return (Criteria) this;
        }

        public Criteria andSeenoIn(List<Long> values) {
            addCriterion("SEENO in", values, "seeno");
            return (Criteria) this;
        }

        public Criteria andSeenoNotIn(List<Long> values) {
            addCriterion("SEENO not in", values, "seeno");
            return (Criteria) this;
        }

        public Criteria andSeenoBetween(Long value1, Long value2) {
            addCriterion("SEENO between", value1, value2, "seeno");
            return (Criteria) this;
        }

        public Criteria andSeenoNotBetween(Long value1, Long value2) {
            addCriterion("SEENO not between", value1, value2, "seeno");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterion("BEGIN_TIME =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterion("BEGIN_TIME <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterion("BEGIN_TIME >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BEGIN_TIME >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterion("BEGIN_TIME <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("BEGIN_TIME <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterion("BEGIN_TIME in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterion("BEGIN_TIME not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterion("BEGIN_TIME between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("BEGIN_TIME not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
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

        public Criteria andDoctNameIsNull() {
            addCriterion("DOCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDoctNameIsNotNull() {
            addCriterion("DOCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDoctNameEqualTo(String value) {
            addCriterion("DOCT_NAME =", value, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameNotEqualTo(String value) {
            addCriterion("DOCT_NAME <>", value, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameGreaterThan(String value) {
            addCriterion("DOCT_NAME >", value, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameGreaterThanOrEqualTo(String value) {
            addCriterion("DOCT_NAME >=", value, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameLessThan(String value) {
            addCriterion("DOCT_NAME <", value, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameLessThanOrEqualTo(String value) {
            addCriterion("DOCT_NAME <=", value, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameLike(String value) {
            addCriterion("DOCT_NAME like", value, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameNotLike(String value) {
            addCriterion("DOCT_NAME not like", value, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameIn(List<String> values) {
            addCriterion("DOCT_NAME in", values, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameNotIn(List<String> values) {
            addCriterion("DOCT_NAME not in", values, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameBetween(String value1, String value2) {
            addCriterion("DOCT_NAME between", value1, value2, "doctName");
            return (Criteria) this;
        }

        public Criteria andDoctNameNotBetween(String value1, String value2) {
            addCriterion("DOCT_NAME not between", value1, value2, "doctName");
            return (Criteria) this;
        }

        public Criteria andYnregchrgIsNull() {
            addCriterion("YNREGCHRG is null");
            return (Criteria) this;
        }

        public Criteria andYnregchrgIsNotNull() {
            addCriterion("YNREGCHRG is not null");
            return (Criteria) this;
        }

        public Criteria andYnregchrgEqualTo(String value) {
            addCriterion("YNREGCHRG =", value, "ynregchrg");
            return (Criteria) this;
        }

        public Criteria andYnregchrgNotEqualTo(String value) {
            addCriterion("YNREGCHRG <>", value, "ynregchrg");
            return (Criteria) this;
        }

        public Criteria andYnregchrgGreaterThan(String value) {
            addCriterion("YNREGCHRG >", value, "ynregchrg");
            return (Criteria) this;
        }

        public Criteria andYnregchrgGreaterThanOrEqualTo(String value) {
            addCriterion("YNREGCHRG >=", value, "ynregchrg");
            return (Criteria) this;
        }

        public Criteria andYnregchrgLessThan(String value) {
            addCriterion("YNREGCHRG <", value, "ynregchrg");
            return (Criteria) this;
        }

        public Criteria andYnregchrgLessThanOrEqualTo(String value) {
            addCriterion("YNREGCHRG <=", value, "ynregchrg");
            return (Criteria) this;
        }

        public Criteria andYnregchrgLike(String value) {
            addCriterion("YNREGCHRG like", value, "ynregchrg");
            return (Criteria) this;
        }

        public Criteria andYnregchrgNotLike(String value) {
            addCriterion("YNREGCHRG not like", value, "ynregchrg");
            return (Criteria) this;
        }

        public Criteria andYnregchrgIn(List<String> values) {
            addCriterion("YNREGCHRG in", values, "ynregchrg");
            return (Criteria) this;
        }

        public Criteria andYnregchrgNotIn(List<String> values) {
            addCriterion("YNREGCHRG not in", values, "ynregchrg");
            return (Criteria) this;
        }

        public Criteria andYnregchrgBetween(String value1, String value2) {
            addCriterion("YNREGCHRG between", value1, value2, "ynregchrg");
            return (Criteria) this;
        }

        public Criteria andYnregchrgNotBetween(String value1, String value2) {
            addCriterion("YNREGCHRG not between", value1, value2, "ynregchrg");
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

        public Criteria andYnbookIsNull() {
            addCriterion("YNBOOK is null");
            return (Criteria) this;
        }

        public Criteria andYnbookIsNotNull() {
            addCriterion("YNBOOK is not null");
            return (Criteria) this;
        }

        public Criteria andYnbookEqualTo(String value) {
            addCriterion("YNBOOK =", value, "ynbook");
            return (Criteria) this;
        }

        public Criteria andYnbookNotEqualTo(String value) {
            addCriterion("YNBOOK <>", value, "ynbook");
            return (Criteria) this;
        }

        public Criteria andYnbookGreaterThan(String value) {
            addCriterion("YNBOOK >", value, "ynbook");
            return (Criteria) this;
        }

        public Criteria andYnbookGreaterThanOrEqualTo(String value) {
            addCriterion("YNBOOK >=", value, "ynbook");
            return (Criteria) this;
        }

        public Criteria andYnbookLessThan(String value) {
            addCriterion("YNBOOK <", value, "ynbook");
            return (Criteria) this;
        }

        public Criteria andYnbookLessThanOrEqualTo(String value) {
            addCriterion("YNBOOK <=", value, "ynbook");
            return (Criteria) this;
        }

        public Criteria andYnbookLike(String value) {
            addCriterion("YNBOOK like", value, "ynbook");
            return (Criteria) this;
        }

        public Criteria andYnbookNotLike(String value) {
            addCriterion("YNBOOK not like", value, "ynbook");
            return (Criteria) this;
        }

        public Criteria andYnbookIn(List<String> values) {
            addCriterion("YNBOOK in", values, "ynbook");
            return (Criteria) this;
        }

        public Criteria andYnbookNotIn(List<String> values) {
            addCriterion("YNBOOK not in", values, "ynbook");
            return (Criteria) this;
        }

        public Criteria andYnbookBetween(String value1, String value2) {
            addCriterion("YNBOOK between", value1, value2, "ynbook");
            return (Criteria) this;
        }

        public Criteria andYnbookNotBetween(String value1, String value2) {
            addCriterion("YNBOOK not between", value1, value2, "ynbook");
            return (Criteria) this;
        }

        public Criteria andYnfrIsNull() {
            addCriterion("YNFR is null");
            return (Criteria) this;
        }

        public Criteria andYnfrIsNotNull() {
            addCriterion("YNFR is not null");
            return (Criteria) this;
        }

        public Criteria andYnfrEqualTo(String value) {
            addCriterion("YNFR =", value, "ynfr");
            return (Criteria) this;
        }

        public Criteria andYnfrNotEqualTo(String value) {
            addCriterion("YNFR <>", value, "ynfr");
            return (Criteria) this;
        }

        public Criteria andYnfrGreaterThan(String value) {
            addCriterion("YNFR >", value, "ynfr");
            return (Criteria) this;
        }

        public Criteria andYnfrGreaterThanOrEqualTo(String value) {
            addCriterion("YNFR >=", value, "ynfr");
            return (Criteria) this;
        }

        public Criteria andYnfrLessThan(String value) {
            addCriterion("YNFR <", value, "ynfr");
            return (Criteria) this;
        }

        public Criteria andYnfrLessThanOrEqualTo(String value) {
            addCriterion("YNFR <=", value, "ynfr");
            return (Criteria) this;
        }

        public Criteria andYnfrLike(String value) {
            addCriterion("YNFR like", value, "ynfr");
            return (Criteria) this;
        }

        public Criteria andYnfrNotLike(String value) {
            addCriterion("YNFR not like", value, "ynfr");
            return (Criteria) this;
        }

        public Criteria andYnfrIn(List<String> values) {
            addCriterion("YNFR in", values, "ynfr");
            return (Criteria) this;
        }

        public Criteria andYnfrNotIn(List<String> values) {
            addCriterion("YNFR not in", values, "ynfr");
            return (Criteria) this;
        }

        public Criteria andYnfrBetween(String value1, String value2) {
            addCriterion("YNFR between", value1, value2, "ynfr");
            return (Criteria) this;
        }

        public Criteria andYnfrNotBetween(String value1, String value2) {
            addCriterion("YNFR not between", value1, value2, "ynfr");
            return (Criteria) this;
        }

        public Criteria andAppendFlagIsNull() {
            addCriterion("APPEND_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAppendFlagIsNotNull() {
            addCriterion("APPEND_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAppendFlagEqualTo(String value) {
            addCriterion("APPEND_FLAG =", value, "appendFlag");
            return (Criteria) this;
        }

        public Criteria andAppendFlagNotEqualTo(String value) {
            addCriterion("APPEND_FLAG <>", value, "appendFlag");
            return (Criteria) this;
        }

        public Criteria andAppendFlagGreaterThan(String value) {
            addCriterion("APPEND_FLAG >", value, "appendFlag");
            return (Criteria) this;
        }

        public Criteria andAppendFlagGreaterThanOrEqualTo(String value) {
            addCriterion("APPEND_FLAG >=", value, "appendFlag");
            return (Criteria) this;
        }

        public Criteria andAppendFlagLessThan(String value) {
            addCriterion("APPEND_FLAG <", value, "appendFlag");
            return (Criteria) this;
        }

        public Criteria andAppendFlagLessThanOrEqualTo(String value) {
            addCriterion("APPEND_FLAG <=", value, "appendFlag");
            return (Criteria) this;
        }

        public Criteria andAppendFlagLike(String value) {
            addCriterion("APPEND_FLAG like", value, "appendFlag");
            return (Criteria) this;
        }

        public Criteria andAppendFlagNotLike(String value) {
            addCriterion("APPEND_FLAG not like", value, "appendFlag");
            return (Criteria) this;
        }

        public Criteria andAppendFlagIn(List<String> values) {
            addCriterion("APPEND_FLAG in", values, "appendFlag");
            return (Criteria) this;
        }

        public Criteria andAppendFlagNotIn(List<String> values) {
            addCriterion("APPEND_FLAG not in", values, "appendFlag");
            return (Criteria) this;
        }

        public Criteria andAppendFlagBetween(String value1, String value2) {
            addCriterion("APPEND_FLAG between", value1, value2, "appendFlag");
            return (Criteria) this;
        }

        public Criteria andAppendFlagNotBetween(String value1, String value2) {
            addCriterion("APPEND_FLAG not between", value1, value2, "appendFlag");
            return (Criteria) this;
        }

        public Criteria andRegFeeIsNull() {
            addCriterion("REG_FEE is null");
            return (Criteria) this;
        }

        public Criteria andRegFeeIsNotNull() {
            addCriterion("REG_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andRegFeeEqualTo(BigDecimal value) {
            addCriterion("REG_FEE =", value, "regFee");
            return (Criteria) this;
        }

        public Criteria andRegFeeNotEqualTo(BigDecimal value) {
            addCriterion("REG_FEE <>", value, "regFee");
            return (Criteria) this;
        }

        public Criteria andRegFeeGreaterThan(BigDecimal value) {
            addCriterion("REG_FEE >", value, "regFee");
            return (Criteria) this;
        }

        public Criteria andRegFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REG_FEE >=", value, "regFee");
            return (Criteria) this;
        }

        public Criteria andRegFeeLessThan(BigDecimal value) {
            addCriterion("REG_FEE <", value, "regFee");
            return (Criteria) this;
        }

        public Criteria andRegFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REG_FEE <=", value, "regFee");
            return (Criteria) this;
        }

        public Criteria andRegFeeIn(List<BigDecimal> values) {
            addCriterion("REG_FEE in", values, "regFee");
            return (Criteria) this;
        }

        public Criteria andRegFeeNotIn(List<BigDecimal> values) {
            addCriterion("REG_FEE not in", values, "regFee");
            return (Criteria) this;
        }

        public Criteria andRegFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REG_FEE between", value1, value2, "regFee");
            return (Criteria) this;
        }

        public Criteria andRegFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REG_FEE not between", value1, value2, "regFee");
            return (Criteria) this;
        }

        public Criteria andChckFeeIsNull() {
            addCriterion("CHCK_FEE is null");
            return (Criteria) this;
        }

        public Criteria andChckFeeIsNotNull() {
            addCriterion("CHCK_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andChckFeeEqualTo(BigDecimal value) {
            addCriterion("CHCK_FEE =", value, "chckFee");
            return (Criteria) this;
        }

        public Criteria andChckFeeNotEqualTo(BigDecimal value) {
            addCriterion("CHCK_FEE <>", value, "chckFee");
            return (Criteria) this;
        }

        public Criteria andChckFeeGreaterThan(BigDecimal value) {
            addCriterion("CHCK_FEE >", value, "chckFee");
            return (Criteria) this;
        }

        public Criteria andChckFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CHCK_FEE >=", value, "chckFee");
            return (Criteria) this;
        }

        public Criteria andChckFeeLessThan(BigDecimal value) {
            addCriterion("CHCK_FEE <", value, "chckFee");
            return (Criteria) this;
        }

        public Criteria andChckFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CHCK_FEE <=", value, "chckFee");
            return (Criteria) this;
        }

        public Criteria andChckFeeIn(List<BigDecimal> values) {
            addCriterion("CHCK_FEE in", values, "chckFee");
            return (Criteria) this;
        }

        public Criteria andChckFeeNotIn(List<BigDecimal> values) {
            addCriterion("CHCK_FEE not in", values, "chckFee");
            return (Criteria) this;
        }

        public Criteria andChckFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHCK_FEE between", value1, value2, "chckFee");
            return (Criteria) this;
        }

        public Criteria andChckFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CHCK_FEE not between", value1, value2, "chckFee");
            return (Criteria) this;
        }

        public Criteria andDiagFeeIsNull() {
            addCriterion("DIAG_FEE is null");
            return (Criteria) this;
        }

        public Criteria andDiagFeeIsNotNull() {
            addCriterion("DIAG_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andDiagFeeEqualTo(BigDecimal value) {
            addCriterion("DIAG_FEE =", value, "diagFee");
            return (Criteria) this;
        }

        public Criteria andDiagFeeNotEqualTo(BigDecimal value) {
            addCriterion("DIAG_FEE <>", value, "diagFee");
            return (Criteria) this;
        }

        public Criteria andDiagFeeGreaterThan(BigDecimal value) {
            addCriterion("DIAG_FEE >", value, "diagFee");
            return (Criteria) this;
        }

        public Criteria andDiagFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DIAG_FEE >=", value, "diagFee");
            return (Criteria) this;
        }

        public Criteria andDiagFeeLessThan(BigDecimal value) {
            addCriterion("DIAG_FEE <", value, "diagFee");
            return (Criteria) this;
        }

        public Criteria andDiagFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DIAG_FEE <=", value, "diagFee");
            return (Criteria) this;
        }

        public Criteria andDiagFeeIn(List<BigDecimal> values) {
            addCriterion("DIAG_FEE in", values, "diagFee");
            return (Criteria) this;
        }

        public Criteria andDiagFeeNotIn(List<BigDecimal> values) {
            addCriterion("DIAG_FEE not in", values, "diagFee");
            return (Criteria) this;
        }

        public Criteria andDiagFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIAG_FEE between", value1, value2, "diagFee");
            return (Criteria) this;
        }

        public Criteria andDiagFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DIAG_FEE not between", value1, value2, "diagFee");
            return (Criteria) this;
        }

        public Criteria andOthFeeIsNull() {
            addCriterion("OTH_FEE is null");
            return (Criteria) this;
        }

        public Criteria andOthFeeIsNotNull() {
            addCriterion("OTH_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andOthFeeEqualTo(BigDecimal value) {
            addCriterion("OTH_FEE =", value, "othFee");
            return (Criteria) this;
        }

        public Criteria andOthFeeNotEqualTo(BigDecimal value) {
            addCriterion("OTH_FEE <>", value, "othFee");
            return (Criteria) this;
        }

        public Criteria andOthFeeGreaterThan(BigDecimal value) {
            addCriterion("OTH_FEE >", value, "othFee");
            return (Criteria) this;
        }

        public Criteria andOthFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTH_FEE >=", value, "othFee");
            return (Criteria) this;
        }

        public Criteria andOthFeeLessThan(BigDecimal value) {
            addCriterion("OTH_FEE <", value, "othFee");
            return (Criteria) this;
        }

        public Criteria andOthFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTH_FEE <=", value, "othFee");
            return (Criteria) this;
        }

        public Criteria andOthFeeIn(List<BigDecimal> values) {
            addCriterion("OTH_FEE in", values, "othFee");
            return (Criteria) this;
        }

        public Criteria andOthFeeNotIn(List<BigDecimal> values) {
            addCriterion("OTH_FEE not in", values, "othFee");
            return (Criteria) this;
        }

        public Criteria andOthFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTH_FEE between", value1, value2, "othFee");
            return (Criteria) this;
        }

        public Criteria andOthFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTH_FEE not between", value1, value2, "othFee");
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

        public Criteria andValidFlagIsNull() {
            addCriterion("VALID_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andValidFlagIsNotNull() {
            addCriterion("VALID_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andValidFlagEqualTo(String value) {
            addCriterion("VALID_FLAG =", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotEqualTo(String value) {
            addCriterion("VALID_FLAG <>", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagGreaterThan(String value) {
            addCriterion("VALID_FLAG >", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagGreaterThanOrEqualTo(String value) {
            addCriterion("VALID_FLAG >=", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagLessThan(String value) {
            addCriterion("VALID_FLAG <", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagLessThanOrEqualTo(String value) {
            addCriterion("VALID_FLAG <=", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagLike(String value) {
            addCriterion("VALID_FLAG like", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotLike(String value) {
            addCriterion("VALID_FLAG not like", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagIn(List<String> values) {
            addCriterion("VALID_FLAG in", values, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotIn(List<String> values) {
            addCriterion("VALID_FLAG not in", values, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagBetween(String value1, String value2) {
            addCriterion("VALID_FLAG between", value1, value2, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotBetween(String value1, String value2) {
            addCriterion("VALID_FLAG not between", value1, value2, "validFlag");
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

        public Criteria andCancelOpcdIsNull() {
            addCriterion("CANCEL_OPCD is null");
            return (Criteria) this;
        }

        public Criteria andCancelOpcdIsNotNull() {
            addCriterion("CANCEL_OPCD is not null");
            return (Criteria) this;
        }

        public Criteria andCancelOpcdEqualTo(String value) {
            addCriterion("CANCEL_OPCD =", value, "cancelOpcd");
            return (Criteria) this;
        }

        public Criteria andCancelOpcdNotEqualTo(String value) {
            addCriterion("CANCEL_OPCD <>", value, "cancelOpcd");
            return (Criteria) this;
        }

        public Criteria andCancelOpcdGreaterThan(String value) {
            addCriterion("CANCEL_OPCD >", value, "cancelOpcd");
            return (Criteria) this;
        }

        public Criteria andCancelOpcdGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_OPCD >=", value, "cancelOpcd");
            return (Criteria) this;
        }

        public Criteria andCancelOpcdLessThan(String value) {
            addCriterion("CANCEL_OPCD <", value, "cancelOpcd");
            return (Criteria) this;
        }

        public Criteria andCancelOpcdLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_OPCD <=", value, "cancelOpcd");
            return (Criteria) this;
        }

        public Criteria andCancelOpcdLike(String value) {
            addCriterion("CANCEL_OPCD like", value, "cancelOpcd");
            return (Criteria) this;
        }

        public Criteria andCancelOpcdNotLike(String value) {
            addCriterion("CANCEL_OPCD not like", value, "cancelOpcd");
            return (Criteria) this;
        }

        public Criteria andCancelOpcdIn(List<String> values) {
            addCriterion("CANCEL_OPCD in", values, "cancelOpcd");
            return (Criteria) this;
        }

        public Criteria andCancelOpcdNotIn(List<String> values) {
            addCriterion("CANCEL_OPCD not in", values, "cancelOpcd");
            return (Criteria) this;
        }

        public Criteria andCancelOpcdBetween(String value1, String value2) {
            addCriterion("CANCEL_OPCD between", value1, value2, "cancelOpcd");
            return (Criteria) this;
        }

        public Criteria andCancelOpcdNotBetween(String value1, String value2) {
            addCriterion("CANCEL_OPCD not between", value1, value2, "cancelOpcd");
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

        public Criteria andMedicalTypeIsNull() {
            addCriterion("MEDICAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMedicalTypeIsNotNull() {
            addCriterion("MEDICAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalTypeEqualTo(String value) {
            addCriterion("MEDICAL_TYPE =", value, "medicalType");
            return (Criteria) this;
        }

        public Criteria andMedicalTypeNotEqualTo(String value) {
            addCriterion("MEDICAL_TYPE <>", value, "medicalType");
            return (Criteria) this;
        }

        public Criteria andMedicalTypeGreaterThan(String value) {
            addCriterion("MEDICAL_TYPE >", value, "medicalType");
            return (Criteria) this;
        }

        public Criteria andMedicalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MEDICAL_TYPE >=", value, "medicalType");
            return (Criteria) this;
        }

        public Criteria andMedicalTypeLessThan(String value) {
            addCriterion("MEDICAL_TYPE <", value, "medicalType");
            return (Criteria) this;
        }

        public Criteria andMedicalTypeLessThanOrEqualTo(String value) {
            addCriterion("MEDICAL_TYPE <=", value, "medicalType");
            return (Criteria) this;
        }

        public Criteria andMedicalTypeLike(String value) {
            addCriterion("MEDICAL_TYPE like", value, "medicalType");
            return (Criteria) this;
        }

        public Criteria andMedicalTypeNotLike(String value) {
            addCriterion("MEDICAL_TYPE not like", value, "medicalType");
            return (Criteria) this;
        }

        public Criteria andMedicalTypeIn(List<String> values) {
            addCriterion("MEDICAL_TYPE in", values, "medicalType");
            return (Criteria) this;
        }

        public Criteria andMedicalTypeNotIn(List<String> values) {
            addCriterion("MEDICAL_TYPE not in", values, "medicalType");
            return (Criteria) this;
        }

        public Criteria andMedicalTypeBetween(String value1, String value2) {
            addCriterion("MEDICAL_TYPE between", value1, value2, "medicalType");
            return (Criteria) this;
        }

        public Criteria andMedicalTypeNotBetween(String value1, String value2) {
            addCriterion("MEDICAL_TYPE not between", value1, value2, "medicalType");
            return (Criteria) this;
        }

        public Criteria andIcdCodeIsNull() {
            addCriterion("ICD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIcdCodeIsNotNull() {
            addCriterion("ICD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIcdCodeEqualTo(String value) {
            addCriterion("ICD_CODE =", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeNotEqualTo(String value) {
            addCriterion("ICD_CODE <>", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeGreaterThan(String value) {
            addCriterion("ICD_CODE >", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ICD_CODE >=", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeLessThan(String value) {
            addCriterion("ICD_CODE <", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeLessThanOrEqualTo(String value) {
            addCriterion("ICD_CODE <=", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeLike(String value) {
            addCriterion("ICD_CODE like", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeNotLike(String value) {
            addCriterion("ICD_CODE not like", value, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeIn(List<String> values) {
            addCriterion("ICD_CODE in", values, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeNotIn(List<String> values) {
            addCriterion("ICD_CODE not in", values, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeBetween(String value1, String value2) {
            addCriterion("ICD_CODE between", value1, value2, "icdCode");
            return (Criteria) this;
        }

        public Criteria andIcdCodeNotBetween(String value1, String value2) {
            addCriterion("ICD_CODE not between", value1, value2, "icdCode");
            return (Criteria) this;
        }

        public Criteria andExamCodeIsNull() {
            addCriterion("EXAM_CODE is null");
            return (Criteria) this;
        }

        public Criteria andExamCodeIsNotNull() {
            addCriterion("EXAM_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andExamCodeEqualTo(String value) {
            addCriterion("EXAM_CODE =", value, "examCode");
            return (Criteria) this;
        }

        public Criteria andExamCodeNotEqualTo(String value) {
            addCriterion("EXAM_CODE <>", value, "examCode");
            return (Criteria) this;
        }

        public Criteria andExamCodeGreaterThan(String value) {
            addCriterion("EXAM_CODE >", value, "examCode");
            return (Criteria) this;
        }

        public Criteria andExamCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_CODE >=", value, "examCode");
            return (Criteria) this;
        }

        public Criteria andExamCodeLessThan(String value) {
            addCriterion("EXAM_CODE <", value, "examCode");
            return (Criteria) this;
        }

        public Criteria andExamCodeLessThanOrEqualTo(String value) {
            addCriterion("EXAM_CODE <=", value, "examCode");
            return (Criteria) this;
        }

        public Criteria andExamCodeLike(String value) {
            addCriterion("EXAM_CODE like", value, "examCode");
            return (Criteria) this;
        }

        public Criteria andExamCodeNotLike(String value) {
            addCriterion("EXAM_CODE not like", value, "examCode");
            return (Criteria) this;
        }

        public Criteria andExamCodeIn(List<String> values) {
            addCriterion("EXAM_CODE in", values, "examCode");
            return (Criteria) this;
        }

        public Criteria andExamCodeNotIn(List<String> values) {
            addCriterion("EXAM_CODE not in", values, "examCode");
            return (Criteria) this;
        }

        public Criteria andExamCodeBetween(String value1, String value2) {
            addCriterion("EXAM_CODE between", value1, value2, "examCode");
            return (Criteria) this;
        }

        public Criteria andExamCodeNotBetween(String value1, String value2) {
            addCriterion("EXAM_CODE not between", value1, value2, "examCode");
            return (Criteria) this;
        }

        public Criteria andExamDateIsNull() {
            addCriterion("EXAM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExamDateIsNotNull() {
            addCriterion("EXAM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExamDateEqualTo(Date value) {
            addCriterion("EXAM_DATE =", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotEqualTo(Date value) {
            addCriterion("EXAM_DATE <>", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateGreaterThan(Date value) {
            addCriterion("EXAM_DATE >", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EXAM_DATE >=", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateLessThan(Date value) {
            addCriterion("EXAM_DATE <", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateLessThanOrEqualTo(Date value) {
            addCriterion("EXAM_DATE <=", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateIn(List<Date> values) {
            addCriterion("EXAM_DATE in", values, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotIn(List<Date> values) {
            addCriterion("EXAM_DATE not in", values, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateBetween(Date value1, Date value2) {
            addCriterion("EXAM_DATE between", value1, value2, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotBetween(Date value1, Date value2) {
            addCriterion("EXAM_DATE not between", value1, value2, "examDate");
            return (Criteria) this;
        }

        public Criteria andCheckFlagIsNull() {
            addCriterion("CHECK_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCheckFlagIsNotNull() {
            addCriterion("CHECK_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFlagEqualTo(String value) {
            addCriterion("CHECK_FLAG =", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotEqualTo(String value) {
            addCriterion("CHECK_FLAG <>", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagGreaterThan(String value) {
            addCriterion("CHECK_FLAG >", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_FLAG >=", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagLessThan(String value) {
            addCriterion("CHECK_FLAG <", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagLessThanOrEqualTo(String value) {
            addCriterion("CHECK_FLAG <=", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagLike(String value) {
            addCriterion("CHECK_FLAG like", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotLike(String value) {
            addCriterion("CHECK_FLAG not like", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagIn(List<String> values) {
            addCriterion("CHECK_FLAG in", values, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotIn(List<String> values) {
            addCriterion("CHECK_FLAG not in", values, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagBetween(String value1, String value2) {
            addCriterion("CHECK_FLAG between", value1, value2, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotBetween(String value1, String value2) {
            addCriterion("CHECK_FLAG not between", value1, value2, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckOpcdIsNull() {
            addCriterion("CHECK_OPCD is null");
            return (Criteria) this;
        }

        public Criteria andCheckOpcdIsNotNull() {
            addCriterion("CHECK_OPCD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckOpcdEqualTo(String value) {
            addCriterion("CHECK_OPCD =", value, "checkOpcd");
            return (Criteria) this;
        }

        public Criteria andCheckOpcdNotEqualTo(String value) {
            addCriterion("CHECK_OPCD <>", value, "checkOpcd");
            return (Criteria) this;
        }

        public Criteria andCheckOpcdGreaterThan(String value) {
            addCriterion("CHECK_OPCD >", value, "checkOpcd");
            return (Criteria) this;
        }

        public Criteria andCheckOpcdGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_OPCD >=", value, "checkOpcd");
            return (Criteria) this;
        }

        public Criteria andCheckOpcdLessThan(String value) {
            addCriterion("CHECK_OPCD <", value, "checkOpcd");
            return (Criteria) this;
        }

        public Criteria andCheckOpcdLessThanOrEqualTo(String value) {
            addCriterion("CHECK_OPCD <=", value, "checkOpcd");
            return (Criteria) this;
        }

        public Criteria andCheckOpcdLike(String value) {
            addCriterion("CHECK_OPCD like", value, "checkOpcd");
            return (Criteria) this;
        }

        public Criteria andCheckOpcdNotLike(String value) {
            addCriterion("CHECK_OPCD not like", value, "checkOpcd");
            return (Criteria) this;
        }

        public Criteria andCheckOpcdIn(List<String> values) {
            addCriterion("CHECK_OPCD in", values, "checkOpcd");
            return (Criteria) this;
        }

        public Criteria andCheckOpcdNotIn(List<String> values) {
            addCriterion("CHECK_OPCD not in", values, "checkOpcd");
            return (Criteria) this;
        }

        public Criteria andCheckOpcdBetween(String value1, String value2) {
            addCriterion("CHECK_OPCD between", value1, value2, "checkOpcd");
            return (Criteria) this;
        }

        public Criteria andCheckOpcdNotBetween(String value1, String value2) {
            addCriterion("CHECK_OPCD not between", value1, value2, "checkOpcd");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNull() {
            addCriterion("CHECK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNotNull() {
            addCriterion("CHECK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDateEqualTo(Date value) {
            addCriterion("CHECK_DATE =", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotEqualTo(Date value) {
            addCriterion("CHECK_DATE <>", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThan(Date value) {
            addCriterion("CHECK_DATE >", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CHECK_DATE >=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThan(Date value) {
            addCriterion("CHECK_DATE <", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThanOrEqualTo(Date value) {
            addCriterion("CHECK_DATE <=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIn(List<Date> values) {
            addCriterion("CHECK_DATE in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotIn(List<Date> values) {
            addCriterion("CHECK_DATE not in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateBetween(Date value1, Date value2) {
            addCriterion("CHECK_DATE between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotBetween(Date value1, Date value2) {
            addCriterion("CHECK_DATE not between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andBalanceFlagIsNull() {
            addCriterion("BALANCE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andBalanceFlagIsNotNull() {
            addCriterion("BALANCE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceFlagEqualTo(String value) {
            addCriterion("BALANCE_FLAG =", value, "balanceFlag");
            return (Criteria) this;
        }

        public Criteria andBalanceFlagNotEqualTo(String value) {
            addCriterion("BALANCE_FLAG <>", value, "balanceFlag");
            return (Criteria) this;
        }

        public Criteria andBalanceFlagGreaterThan(String value) {
            addCriterion("BALANCE_FLAG >", value, "balanceFlag");
            return (Criteria) this;
        }

        public Criteria andBalanceFlagGreaterThanOrEqualTo(String value) {
            addCriterion("BALANCE_FLAG >=", value, "balanceFlag");
            return (Criteria) this;
        }

        public Criteria andBalanceFlagLessThan(String value) {
            addCriterion("BALANCE_FLAG <", value, "balanceFlag");
            return (Criteria) this;
        }

        public Criteria andBalanceFlagLessThanOrEqualTo(String value) {
            addCriterion("BALANCE_FLAG <=", value, "balanceFlag");
            return (Criteria) this;
        }

        public Criteria andBalanceFlagLike(String value) {
            addCriterion("BALANCE_FLAG like", value, "balanceFlag");
            return (Criteria) this;
        }

        public Criteria andBalanceFlagNotLike(String value) {
            addCriterion("BALANCE_FLAG not like", value, "balanceFlag");
            return (Criteria) this;
        }

        public Criteria andBalanceFlagIn(List<String> values) {
            addCriterion("BALANCE_FLAG in", values, "balanceFlag");
            return (Criteria) this;
        }

        public Criteria andBalanceFlagNotIn(List<String> values) {
            addCriterion("BALANCE_FLAG not in", values, "balanceFlag");
            return (Criteria) this;
        }

        public Criteria andBalanceFlagBetween(String value1, String value2) {
            addCriterion("BALANCE_FLAG between", value1, value2, "balanceFlag");
            return (Criteria) this;
        }

        public Criteria andBalanceFlagNotBetween(String value1, String value2) {
            addCriterion("BALANCE_FLAG not between", value1, value2, "balanceFlag");
            return (Criteria) this;
        }

        public Criteria andBalanceNoIsNull() {
            addCriterion("BALANCE_NO is null");
            return (Criteria) this;
        }

        public Criteria andBalanceNoIsNotNull() {
            addCriterion("BALANCE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceNoEqualTo(String value) {
            addCriterion("BALANCE_NO =", value, "balanceNo");
            return (Criteria) this;
        }

        public Criteria andBalanceNoNotEqualTo(String value) {
            addCriterion("BALANCE_NO <>", value, "balanceNo");
            return (Criteria) this;
        }

        public Criteria andBalanceNoGreaterThan(String value) {
            addCriterion("BALANCE_NO >", value, "balanceNo");
            return (Criteria) this;
        }

        public Criteria andBalanceNoGreaterThanOrEqualTo(String value) {
            addCriterion("BALANCE_NO >=", value, "balanceNo");
            return (Criteria) this;
        }

        public Criteria andBalanceNoLessThan(String value) {
            addCriterion("BALANCE_NO <", value, "balanceNo");
            return (Criteria) this;
        }

        public Criteria andBalanceNoLessThanOrEqualTo(String value) {
            addCriterion("BALANCE_NO <=", value, "balanceNo");
            return (Criteria) this;
        }

        public Criteria andBalanceNoLike(String value) {
            addCriterion("BALANCE_NO like", value, "balanceNo");
            return (Criteria) this;
        }

        public Criteria andBalanceNoNotLike(String value) {
            addCriterion("BALANCE_NO not like", value, "balanceNo");
            return (Criteria) this;
        }

        public Criteria andBalanceNoIn(List<String> values) {
            addCriterion("BALANCE_NO in", values, "balanceNo");
            return (Criteria) this;
        }

        public Criteria andBalanceNoNotIn(List<String> values) {
            addCriterion("BALANCE_NO not in", values, "balanceNo");
            return (Criteria) this;
        }

        public Criteria andBalanceNoBetween(String value1, String value2) {
            addCriterion("BALANCE_NO between", value1, value2, "balanceNo");
            return (Criteria) this;
        }

        public Criteria andBalanceNoNotBetween(String value1, String value2) {
            addCriterion("BALANCE_NO not between", value1, value2, "balanceNo");
            return (Criteria) this;
        }

        public Criteria andBalanceOpcdIsNull() {
            addCriterion("BALANCE_OPCD is null");
            return (Criteria) this;
        }

        public Criteria andBalanceOpcdIsNotNull() {
            addCriterion("BALANCE_OPCD is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceOpcdEqualTo(String value) {
            addCriterion("BALANCE_OPCD =", value, "balanceOpcd");
            return (Criteria) this;
        }

        public Criteria andBalanceOpcdNotEqualTo(String value) {
            addCriterion("BALANCE_OPCD <>", value, "balanceOpcd");
            return (Criteria) this;
        }

        public Criteria andBalanceOpcdGreaterThan(String value) {
            addCriterion("BALANCE_OPCD >", value, "balanceOpcd");
            return (Criteria) this;
        }

        public Criteria andBalanceOpcdGreaterThanOrEqualTo(String value) {
            addCriterion("BALANCE_OPCD >=", value, "balanceOpcd");
            return (Criteria) this;
        }

        public Criteria andBalanceOpcdLessThan(String value) {
            addCriterion("BALANCE_OPCD <", value, "balanceOpcd");
            return (Criteria) this;
        }

        public Criteria andBalanceOpcdLessThanOrEqualTo(String value) {
            addCriterion("BALANCE_OPCD <=", value, "balanceOpcd");
            return (Criteria) this;
        }

        public Criteria andBalanceOpcdLike(String value) {
            addCriterion("BALANCE_OPCD like", value, "balanceOpcd");
            return (Criteria) this;
        }

        public Criteria andBalanceOpcdNotLike(String value) {
            addCriterion("BALANCE_OPCD not like", value, "balanceOpcd");
            return (Criteria) this;
        }

        public Criteria andBalanceOpcdIn(List<String> values) {
            addCriterion("BALANCE_OPCD in", values, "balanceOpcd");
            return (Criteria) this;
        }

        public Criteria andBalanceOpcdNotIn(List<String> values) {
            addCriterion("BALANCE_OPCD not in", values, "balanceOpcd");
            return (Criteria) this;
        }

        public Criteria andBalanceOpcdBetween(String value1, String value2) {
            addCriterion("BALANCE_OPCD between", value1, value2, "balanceOpcd");
            return (Criteria) this;
        }

        public Criteria andBalanceOpcdNotBetween(String value1, String value2) {
            addCriterion("BALANCE_OPCD not between", value1, value2, "balanceOpcd");
            return (Criteria) this;
        }

        public Criteria andBalanceDateIsNull() {
            addCriterion("BALANCE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBalanceDateIsNotNull() {
            addCriterion("BALANCE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceDateEqualTo(Date value) {
            addCriterion("BALANCE_DATE =", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateNotEqualTo(Date value) {
            addCriterion("BALANCE_DATE <>", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateGreaterThan(Date value) {
            addCriterion("BALANCE_DATE >", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("BALANCE_DATE >=", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateLessThan(Date value) {
            addCriterion("BALANCE_DATE <", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateLessThanOrEqualTo(Date value) {
            addCriterion("BALANCE_DATE <=", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateIn(List<Date> values) {
            addCriterion("BALANCE_DATE in", values, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateNotIn(List<Date> values) {
            addCriterion("BALANCE_DATE not in", values, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateBetween(Date value1, Date value2) {
            addCriterion("BALANCE_DATE between", value1, value2, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateNotBetween(Date value1, Date value2) {
            addCriterion("BALANCE_DATE not between", value1, value2, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andYnseeIsNull() {
            addCriterion("YNSEE is null");
            return (Criteria) this;
        }

        public Criteria andYnseeIsNotNull() {
            addCriterion("YNSEE is not null");
            return (Criteria) this;
        }

        public Criteria andYnseeEqualTo(String value) {
            addCriterion("YNSEE =", value, "ynsee");
            return (Criteria) this;
        }

        public Criteria andYnseeNotEqualTo(String value) {
            addCriterion("YNSEE <>", value, "ynsee");
            return (Criteria) this;
        }

        public Criteria andYnseeGreaterThan(String value) {
            addCriterion("YNSEE >", value, "ynsee");
            return (Criteria) this;
        }

        public Criteria andYnseeGreaterThanOrEqualTo(String value) {
            addCriterion("YNSEE >=", value, "ynsee");
            return (Criteria) this;
        }

        public Criteria andYnseeLessThan(String value) {
            addCriterion("YNSEE <", value, "ynsee");
            return (Criteria) this;
        }

        public Criteria andYnseeLessThanOrEqualTo(String value) {
            addCriterion("YNSEE <=", value, "ynsee");
            return (Criteria) this;
        }

        public Criteria andYnseeLike(String value) {
            addCriterion("YNSEE like", value, "ynsee");
            return (Criteria) this;
        }

        public Criteria andYnseeNotLike(String value) {
            addCriterion("YNSEE not like", value, "ynsee");
            return (Criteria) this;
        }

        public Criteria andYnseeIn(List<String> values) {
            addCriterion("YNSEE in", values, "ynsee");
            return (Criteria) this;
        }

        public Criteria andYnseeNotIn(List<String> values) {
            addCriterion("YNSEE not in", values, "ynsee");
            return (Criteria) this;
        }

        public Criteria andYnseeBetween(String value1, String value2) {
            addCriterion("YNSEE between", value1, value2, "ynsee");
            return (Criteria) this;
        }

        public Criteria andYnseeNotBetween(String value1, String value2) {
            addCriterion("YNSEE not between", value1, value2, "ynsee");
            return (Criteria) this;
        }

        public Criteria andSeeDateIsNull() {
            addCriterion("SEE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSeeDateIsNotNull() {
            addCriterion("SEE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSeeDateEqualTo(Date value) {
            addCriterion("SEE_DATE =", value, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateNotEqualTo(Date value) {
            addCriterion("SEE_DATE <>", value, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateGreaterThan(Date value) {
            addCriterion("SEE_DATE >", value, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SEE_DATE >=", value, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateLessThan(Date value) {
            addCriterion("SEE_DATE <", value, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateLessThanOrEqualTo(Date value) {
            addCriterion("SEE_DATE <=", value, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateIn(List<Date> values) {
            addCriterion("SEE_DATE in", values, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateNotIn(List<Date> values) {
            addCriterion("SEE_DATE not in", values, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateBetween(Date value1, Date value2) {
            addCriterion("SEE_DATE between", value1, value2, "seeDate");
            return (Criteria) this;
        }

        public Criteria andSeeDateNotBetween(Date value1, Date value2) {
            addCriterion("SEE_DATE not between", value1, value2, "seeDate");
            return (Criteria) this;
        }

        public Criteria andTriageFlagIsNull() {
            addCriterion("TRIAGE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andTriageFlagIsNotNull() {
            addCriterion("TRIAGE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTriageFlagEqualTo(String value) {
            addCriterion("TRIAGE_FLAG =", value, "triageFlag");
            return (Criteria) this;
        }

        public Criteria andTriageFlagNotEqualTo(String value) {
            addCriterion("TRIAGE_FLAG <>", value, "triageFlag");
            return (Criteria) this;
        }

        public Criteria andTriageFlagGreaterThan(String value) {
            addCriterion("TRIAGE_FLAG >", value, "triageFlag");
            return (Criteria) this;
        }

        public Criteria andTriageFlagGreaterThanOrEqualTo(String value) {
            addCriterion("TRIAGE_FLAG >=", value, "triageFlag");
            return (Criteria) this;
        }

        public Criteria andTriageFlagLessThan(String value) {
            addCriterion("TRIAGE_FLAG <", value, "triageFlag");
            return (Criteria) this;
        }

        public Criteria andTriageFlagLessThanOrEqualTo(String value) {
            addCriterion("TRIAGE_FLAG <=", value, "triageFlag");
            return (Criteria) this;
        }

        public Criteria andTriageFlagLike(String value) {
            addCriterion("TRIAGE_FLAG like", value, "triageFlag");
            return (Criteria) this;
        }

        public Criteria andTriageFlagNotLike(String value) {
            addCriterion("TRIAGE_FLAG not like", value, "triageFlag");
            return (Criteria) this;
        }

        public Criteria andTriageFlagIn(List<String> values) {
            addCriterion("TRIAGE_FLAG in", values, "triageFlag");
            return (Criteria) this;
        }

        public Criteria andTriageFlagNotIn(List<String> values) {
            addCriterion("TRIAGE_FLAG not in", values, "triageFlag");
            return (Criteria) this;
        }

        public Criteria andTriageFlagBetween(String value1, String value2) {
            addCriterion("TRIAGE_FLAG between", value1, value2, "triageFlag");
            return (Criteria) this;
        }

        public Criteria andTriageFlagNotBetween(String value1, String value2) {
            addCriterion("TRIAGE_FLAG not between", value1, value2, "triageFlag");
            return (Criteria) this;
        }

        public Criteria andTriageOpcdIsNull() {
            addCriterion("TRIAGE_OPCD is null");
            return (Criteria) this;
        }

        public Criteria andTriageOpcdIsNotNull() {
            addCriterion("TRIAGE_OPCD is not null");
            return (Criteria) this;
        }

        public Criteria andTriageOpcdEqualTo(String value) {
            addCriterion("TRIAGE_OPCD =", value, "triageOpcd");
            return (Criteria) this;
        }

        public Criteria andTriageOpcdNotEqualTo(String value) {
            addCriterion("TRIAGE_OPCD <>", value, "triageOpcd");
            return (Criteria) this;
        }

        public Criteria andTriageOpcdGreaterThan(String value) {
            addCriterion("TRIAGE_OPCD >", value, "triageOpcd");
            return (Criteria) this;
        }

        public Criteria andTriageOpcdGreaterThanOrEqualTo(String value) {
            addCriterion("TRIAGE_OPCD >=", value, "triageOpcd");
            return (Criteria) this;
        }

        public Criteria andTriageOpcdLessThan(String value) {
            addCriterion("TRIAGE_OPCD <", value, "triageOpcd");
            return (Criteria) this;
        }

        public Criteria andTriageOpcdLessThanOrEqualTo(String value) {
            addCriterion("TRIAGE_OPCD <=", value, "triageOpcd");
            return (Criteria) this;
        }

        public Criteria andTriageOpcdLike(String value) {
            addCriterion("TRIAGE_OPCD like", value, "triageOpcd");
            return (Criteria) this;
        }

        public Criteria andTriageOpcdNotLike(String value) {
            addCriterion("TRIAGE_OPCD not like", value, "triageOpcd");
            return (Criteria) this;
        }

        public Criteria andTriageOpcdIn(List<String> values) {
            addCriterion("TRIAGE_OPCD in", values, "triageOpcd");
            return (Criteria) this;
        }

        public Criteria andTriageOpcdNotIn(List<String> values) {
            addCriterion("TRIAGE_OPCD not in", values, "triageOpcd");
            return (Criteria) this;
        }

        public Criteria andTriageOpcdBetween(String value1, String value2) {
            addCriterion("TRIAGE_OPCD between", value1, value2, "triageOpcd");
            return (Criteria) this;
        }

        public Criteria andTriageOpcdNotBetween(String value1, String value2) {
            addCriterion("TRIAGE_OPCD not between", value1, value2, "triageOpcd");
            return (Criteria) this;
        }

        public Criteria andTriageDateIsNull() {
            addCriterion("TRIAGE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTriageDateIsNotNull() {
            addCriterion("TRIAGE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTriageDateEqualTo(Date value) {
            addCriterion("TRIAGE_DATE =", value, "triageDate");
            return (Criteria) this;
        }

        public Criteria andTriageDateNotEqualTo(Date value) {
            addCriterion("TRIAGE_DATE <>", value, "triageDate");
            return (Criteria) this;
        }

        public Criteria andTriageDateGreaterThan(Date value) {
            addCriterion("TRIAGE_DATE >", value, "triageDate");
            return (Criteria) this;
        }

        public Criteria andTriageDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TRIAGE_DATE >=", value, "triageDate");
            return (Criteria) this;
        }

        public Criteria andTriageDateLessThan(Date value) {
            addCriterion("TRIAGE_DATE <", value, "triageDate");
            return (Criteria) this;
        }

        public Criteria andTriageDateLessThanOrEqualTo(Date value) {
            addCriterion("TRIAGE_DATE <=", value, "triageDate");
            return (Criteria) this;
        }

        public Criteria andTriageDateIn(List<Date> values) {
            addCriterion("TRIAGE_DATE in", values, "triageDate");
            return (Criteria) this;
        }

        public Criteria andTriageDateNotIn(List<Date> values) {
            addCriterion("TRIAGE_DATE not in", values, "triageDate");
            return (Criteria) this;
        }

        public Criteria andTriageDateBetween(Date value1, Date value2) {
            addCriterion("TRIAGE_DATE between", value1, value2, "triageDate");
            return (Criteria) this;
        }

        public Criteria andTriageDateNotBetween(Date value1, Date value2) {
            addCriterion("TRIAGE_DATE not between", value1, value2, "triageDate");
            return (Criteria) this;
        }

        public Criteria andPrintInvoicecntIsNull() {
            addCriterion("PRINT_INVOICECNT is null");
            return (Criteria) this;
        }

        public Criteria andPrintInvoicecntIsNotNull() {
            addCriterion("PRINT_INVOICECNT is not null");
            return (Criteria) this;
        }

        public Criteria andPrintInvoicecntEqualTo(Short value) {
            addCriterion("PRINT_INVOICECNT =", value, "printInvoicecnt");
            return (Criteria) this;
        }

        public Criteria andPrintInvoicecntNotEqualTo(Short value) {
            addCriterion("PRINT_INVOICECNT <>", value, "printInvoicecnt");
            return (Criteria) this;
        }

        public Criteria andPrintInvoicecntGreaterThan(Short value) {
            addCriterion("PRINT_INVOICECNT >", value, "printInvoicecnt");
            return (Criteria) this;
        }

        public Criteria andPrintInvoicecntGreaterThanOrEqualTo(Short value) {
            addCriterion("PRINT_INVOICECNT >=", value, "printInvoicecnt");
            return (Criteria) this;
        }

        public Criteria andPrintInvoicecntLessThan(Short value) {
            addCriterion("PRINT_INVOICECNT <", value, "printInvoicecnt");
            return (Criteria) this;
        }

        public Criteria andPrintInvoicecntLessThanOrEqualTo(Short value) {
            addCriterion("PRINT_INVOICECNT <=", value, "printInvoicecnt");
            return (Criteria) this;
        }

        public Criteria andPrintInvoicecntIn(List<Short> values) {
            addCriterion("PRINT_INVOICECNT in", values, "printInvoicecnt");
            return (Criteria) this;
        }

        public Criteria andPrintInvoicecntNotIn(List<Short> values) {
            addCriterion("PRINT_INVOICECNT not in", values, "printInvoicecnt");
            return (Criteria) this;
        }

        public Criteria andPrintInvoicecntBetween(Short value1, Short value2) {
            addCriterion("PRINT_INVOICECNT between", value1, value2, "printInvoicecnt");
            return (Criteria) this;
        }

        public Criteria andPrintInvoicecntNotBetween(Short value1, Short value2) {
            addCriterion("PRINT_INVOICECNT not between", value1, value2, "printInvoicecnt");
            return (Criteria) this;
        }

        public Criteria andSeeDpcdIsNull() {
            addCriterion("SEE_DPCD is null");
            return (Criteria) this;
        }

        public Criteria andSeeDpcdIsNotNull() {
            addCriterion("SEE_DPCD is not null");
            return (Criteria) this;
        }

        public Criteria andSeeDpcdEqualTo(String value) {
            addCriterion("SEE_DPCD =", value, "seeDpcd");
            return (Criteria) this;
        }

        public Criteria andSeeDpcdNotEqualTo(String value) {
            addCriterion("SEE_DPCD <>", value, "seeDpcd");
            return (Criteria) this;
        }

        public Criteria andSeeDpcdGreaterThan(String value) {
            addCriterion("SEE_DPCD >", value, "seeDpcd");
            return (Criteria) this;
        }

        public Criteria andSeeDpcdGreaterThanOrEqualTo(String value) {
            addCriterion("SEE_DPCD >=", value, "seeDpcd");
            return (Criteria) this;
        }

        public Criteria andSeeDpcdLessThan(String value) {
            addCriterion("SEE_DPCD <", value, "seeDpcd");
            return (Criteria) this;
        }

        public Criteria andSeeDpcdLessThanOrEqualTo(String value) {
            addCriterion("SEE_DPCD <=", value, "seeDpcd");
            return (Criteria) this;
        }

        public Criteria andSeeDpcdLike(String value) {
            addCriterion("SEE_DPCD like", value, "seeDpcd");
            return (Criteria) this;
        }

        public Criteria andSeeDpcdNotLike(String value) {
            addCriterion("SEE_DPCD not like", value, "seeDpcd");
            return (Criteria) this;
        }

        public Criteria andSeeDpcdIn(List<String> values) {
            addCriterion("SEE_DPCD in", values, "seeDpcd");
            return (Criteria) this;
        }

        public Criteria andSeeDpcdNotIn(List<String> values) {
            addCriterion("SEE_DPCD not in", values, "seeDpcd");
            return (Criteria) this;
        }

        public Criteria andSeeDpcdBetween(String value1, String value2) {
            addCriterion("SEE_DPCD between", value1, value2, "seeDpcd");
            return (Criteria) this;
        }

        public Criteria andSeeDpcdNotBetween(String value1, String value2) {
            addCriterion("SEE_DPCD not between", value1, value2, "seeDpcd");
            return (Criteria) this;
        }

        public Criteria andSeeDocdIsNull() {
            addCriterion("SEE_DOCD is null");
            return (Criteria) this;
        }

        public Criteria andSeeDocdIsNotNull() {
            addCriterion("SEE_DOCD is not null");
            return (Criteria) this;
        }

        public Criteria andSeeDocdEqualTo(String value) {
            addCriterion("SEE_DOCD =", value, "seeDocd");
            return (Criteria) this;
        }

        public Criteria andSeeDocdNotEqualTo(String value) {
            addCriterion("SEE_DOCD <>", value, "seeDocd");
            return (Criteria) this;
        }

        public Criteria andSeeDocdGreaterThan(String value) {
            addCriterion("SEE_DOCD >", value, "seeDocd");
            return (Criteria) this;
        }

        public Criteria andSeeDocdGreaterThanOrEqualTo(String value) {
            addCriterion("SEE_DOCD >=", value, "seeDocd");
            return (Criteria) this;
        }

        public Criteria andSeeDocdLessThan(String value) {
            addCriterion("SEE_DOCD <", value, "seeDocd");
            return (Criteria) this;
        }

        public Criteria andSeeDocdLessThanOrEqualTo(String value) {
            addCriterion("SEE_DOCD <=", value, "seeDocd");
            return (Criteria) this;
        }

        public Criteria andSeeDocdLike(String value) {
            addCriterion("SEE_DOCD like", value, "seeDocd");
            return (Criteria) this;
        }

        public Criteria andSeeDocdNotLike(String value) {
            addCriterion("SEE_DOCD not like", value, "seeDocd");
            return (Criteria) this;
        }

        public Criteria andSeeDocdIn(List<String> values) {
            addCriterion("SEE_DOCD in", values, "seeDocd");
            return (Criteria) this;
        }

        public Criteria andSeeDocdNotIn(List<String> values) {
            addCriterion("SEE_DOCD not in", values, "seeDocd");
            return (Criteria) this;
        }

        public Criteria andSeeDocdBetween(String value1, String value2) {
            addCriterion("SEE_DOCD between", value1, value2, "seeDocd");
            return (Criteria) this;
        }

        public Criteria andSeeDocdNotBetween(String value1, String value2) {
            addCriterion("SEE_DOCD not between", value1, value2, "seeDocd");
            return (Criteria) this;
        }

        public Criteria andInSourceIsNull() {
            addCriterion("IN_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andInSourceIsNotNull() {
            addCriterion("IN_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andInSourceEqualTo(String value) {
            addCriterion("IN_SOURCE =", value, "inSource");
            return (Criteria) this;
        }

        public Criteria andInSourceNotEqualTo(String value) {
            addCriterion("IN_SOURCE <>", value, "inSource");
            return (Criteria) this;
        }

        public Criteria andInSourceGreaterThan(String value) {
            addCriterion("IN_SOURCE >", value, "inSource");
            return (Criteria) this;
        }

        public Criteria andInSourceGreaterThanOrEqualTo(String value) {
            addCriterion("IN_SOURCE >=", value, "inSource");
            return (Criteria) this;
        }

        public Criteria andInSourceLessThan(String value) {
            addCriterion("IN_SOURCE <", value, "inSource");
            return (Criteria) this;
        }

        public Criteria andInSourceLessThanOrEqualTo(String value) {
            addCriterion("IN_SOURCE <=", value, "inSource");
            return (Criteria) this;
        }

        public Criteria andInSourceLike(String value) {
            addCriterion("IN_SOURCE like", value, "inSource");
            return (Criteria) this;
        }

        public Criteria andInSourceNotLike(String value) {
            addCriterion("IN_SOURCE not like", value, "inSource");
            return (Criteria) this;
        }

        public Criteria andInSourceIn(List<String> values) {
            addCriterion("IN_SOURCE in", values, "inSource");
            return (Criteria) this;
        }

        public Criteria andInSourceNotIn(List<String> values) {
            addCriterion("IN_SOURCE not in", values, "inSource");
            return (Criteria) this;
        }

        public Criteria andInSourceBetween(String value1, String value2) {
            addCriterion("IN_SOURCE between", value1, value2, "inSource");
            return (Criteria) this;
        }

        public Criteria andInSourceNotBetween(String value1, String value2) {
            addCriterion("IN_SOURCE not between", value1, value2, "inSource");
            return (Criteria) this;
        }

        public Criteria andIsSendinhoscaseIsNull() {
            addCriterion("IS_SENDINHOSCASE is null");
            return (Criteria) this;
        }

        public Criteria andIsSendinhoscaseIsNotNull() {
            addCriterion("IS_SENDINHOSCASE is not null");
            return (Criteria) this;
        }

        public Criteria andIsSendinhoscaseEqualTo(String value) {
            addCriterion("IS_SENDINHOSCASE =", value, "isSendinhoscase");
            return (Criteria) this;
        }

        public Criteria andIsSendinhoscaseNotEqualTo(String value) {
            addCriterion("IS_SENDINHOSCASE <>", value, "isSendinhoscase");
            return (Criteria) this;
        }

        public Criteria andIsSendinhoscaseGreaterThan(String value) {
            addCriterion("IS_SENDINHOSCASE >", value, "isSendinhoscase");
            return (Criteria) this;
        }

        public Criteria andIsSendinhoscaseGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SENDINHOSCASE >=", value, "isSendinhoscase");
            return (Criteria) this;
        }

        public Criteria andIsSendinhoscaseLessThan(String value) {
            addCriterion("IS_SENDINHOSCASE <", value, "isSendinhoscase");
            return (Criteria) this;
        }

        public Criteria andIsSendinhoscaseLessThanOrEqualTo(String value) {
            addCriterion("IS_SENDINHOSCASE <=", value, "isSendinhoscase");
            return (Criteria) this;
        }

        public Criteria andIsSendinhoscaseLike(String value) {
            addCriterion("IS_SENDINHOSCASE like", value, "isSendinhoscase");
            return (Criteria) this;
        }

        public Criteria andIsSendinhoscaseNotLike(String value) {
            addCriterion("IS_SENDINHOSCASE not like", value, "isSendinhoscase");
            return (Criteria) this;
        }

        public Criteria andIsSendinhoscaseIn(List<String> values) {
            addCriterion("IS_SENDINHOSCASE in", values, "isSendinhoscase");
            return (Criteria) this;
        }

        public Criteria andIsSendinhoscaseNotIn(List<String> values) {
            addCriterion("IS_SENDINHOSCASE not in", values, "isSendinhoscase");
            return (Criteria) this;
        }

        public Criteria andIsSendinhoscaseBetween(String value1, String value2) {
            addCriterion("IS_SENDINHOSCASE between", value1, value2, "isSendinhoscase");
            return (Criteria) this;
        }

        public Criteria andIsSendinhoscaseNotBetween(String value1, String value2) {
            addCriterion("IS_SENDINHOSCASE not between", value1, value2, "isSendinhoscase");
            return (Criteria) this;
        }

        public Criteria andIsEncryptnameIsNull() {
            addCriterion("IS_ENCRYPTNAME is null");
            return (Criteria) this;
        }

        public Criteria andIsEncryptnameIsNotNull() {
            addCriterion("IS_ENCRYPTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andIsEncryptnameEqualTo(String value) {
            addCriterion("IS_ENCRYPTNAME =", value, "isEncryptname");
            return (Criteria) this;
        }

        public Criteria andIsEncryptnameNotEqualTo(String value) {
            addCriterion("IS_ENCRYPTNAME <>", value, "isEncryptname");
            return (Criteria) this;
        }

        public Criteria andIsEncryptnameGreaterThan(String value) {
            addCriterion("IS_ENCRYPTNAME >", value, "isEncryptname");
            return (Criteria) this;
        }

        public Criteria andIsEncryptnameGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ENCRYPTNAME >=", value, "isEncryptname");
            return (Criteria) this;
        }

        public Criteria andIsEncryptnameLessThan(String value) {
            addCriterion("IS_ENCRYPTNAME <", value, "isEncryptname");
            return (Criteria) this;
        }

        public Criteria andIsEncryptnameLessThanOrEqualTo(String value) {
            addCriterion("IS_ENCRYPTNAME <=", value, "isEncryptname");
            return (Criteria) this;
        }

        public Criteria andIsEncryptnameLike(String value) {
            addCriterion("IS_ENCRYPTNAME like", value, "isEncryptname");
            return (Criteria) this;
        }

        public Criteria andIsEncryptnameNotLike(String value) {
            addCriterion("IS_ENCRYPTNAME not like", value, "isEncryptname");
            return (Criteria) this;
        }

        public Criteria andIsEncryptnameIn(List<String> values) {
            addCriterion("IS_ENCRYPTNAME in", values, "isEncryptname");
            return (Criteria) this;
        }

        public Criteria andIsEncryptnameNotIn(List<String> values) {
            addCriterion("IS_ENCRYPTNAME not in", values, "isEncryptname");
            return (Criteria) this;
        }

        public Criteria andIsEncryptnameBetween(String value1, String value2) {
            addCriterion("IS_ENCRYPTNAME between", value1, value2, "isEncryptname");
            return (Criteria) this;
        }

        public Criteria andIsEncryptnameNotBetween(String value1, String value2) {
            addCriterion("IS_ENCRYPTNAME not between", value1, value2, "isEncryptname");
            return (Criteria) this;
        }

        public Criteria andNormalnameIsNull() {
            addCriterion("NORMALNAME is null");
            return (Criteria) this;
        }

        public Criteria andNormalnameIsNotNull() {
            addCriterion("NORMALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNormalnameEqualTo(String value) {
            addCriterion("NORMALNAME =", value, "normalname");
            return (Criteria) this;
        }

        public Criteria andNormalnameNotEqualTo(String value) {
            addCriterion("NORMALNAME <>", value, "normalname");
            return (Criteria) this;
        }

        public Criteria andNormalnameGreaterThan(String value) {
            addCriterion("NORMALNAME >", value, "normalname");
            return (Criteria) this;
        }

        public Criteria andNormalnameGreaterThanOrEqualTo(String value) {
            addCriterion("NORMALNAME >=", value, "normalname");
            return (Criteria) this;
        }

        public Criteria andNormalnameLessThan(String value) {
            addCriterion("NORMALNAME <", value, "normalname");
            return (Criteria) this;
        }

        public Criteria andNormalnameLessThanOrEqualTo(String value) {
            addCriterion("NORMALNAME <=", value, "normalname");
            return (Criteria) this;
        }

        public Criteria andNormalnameLike(String value) {
            addCriterion("NORMALNAME like", value, "normalname");
            return (Criteria) this;
        }

        public Criteria andNormalnameNotLike(String value) {
            addCriterion("NORMALNAME not like", value, "normalname");
            return (Criteria) this;
        }

        public Criteria andNormalnameIn(List<String> values) {
            addCriterion("NORMALNAME in", values, "normalname");
            return (Criteria) this;
        }

        public Criteria andNormalnameNotIn(List<String> values) {
            addCriterion("NORMALNAME not in", values, "normalname");
            return (Criteria) this;
        }

        public Criteria andNormalnameBetween(String value1, String value2) {
            addCriterion("NORMALNAME between", value1, value2, "normalname");
            return (Criteria) this;
        }

        public Criteria andNormalnameNotBetween(String value1, String value2) {
            addCriterion("NORMALNAME not between", value1, value2, "normalname");
            return (Criteria) this;
        }

        public Criteria andInDateIsNull() {
            addCriterion("IN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInDateIsNotNull() {
            addCriterion("IN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInDateEqualTo(Date value) {
            addCriterion("IN_DATE =", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotEqualTo(Date value) {
            addCriterion("IN_DATE <>", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThan(Date value) {
            addCriterion("IN_DATE >", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThanOrEqualTo(Date value) {
            addCriterion("IN_DATE >=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThan(Date value) {
            addCriterion("IN_DATE <", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThanOrEqualTo(Date value) {
            addCriterion("IN_DATE <=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateIn(List<Date> values) {
            addCriterion("IN_DATE in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotIn(List<Date> values) {
            addCriterion("IN_DATE not in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateBetween(Date value1, Date value2) {
            addCriterion("IN_DATE between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotBetween(Date value1, Date value2) {
            addCriterion("IN_DATE not between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andOutDateIsNull() {
            addCriterion("OUT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOutDateIsNotNull() {
            addCriterion("OUT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOutDateEqualTo(Date value) {
            addCriterion("OUT_DATE =", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateNotEqualTo(Date value) {
            addCriterion("OUT_DATE <>", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateGreaterThan(Date value) {
            addCriterion("OUT_DATE >", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("OUT_DATE >=", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateLessThan(Date value) {
            addCriterion("OUT_DATE <", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateLessThanOrEqualTo(Date value) {
            addCriterion("OUT_DATE <=", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateIn(List<Date> values) {
            addCriterion("OUT_DATE in", values, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateNotIn(List<Date> values) {
            addCriterion("OUT_DATE not in", values, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateBetween(Date value1, Date value2) {
            addCriterion("OUT_DATE between", value1, value2, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateNotBetween(Date value1, Date value2) {
            addCriterion("OUT_DATE not between", value1, value2, "outDate");
            return (Criteria) this;
        }

        public Criteria andZgIsNull() {
            addCriterion("ZG is null");
            return (Criteria) this;
        }

        public Criteria andZgIsNotNull() {
            addCriterion("ZG is not null");
            return (Criteria) this;
        }

        public Criteria andZgEqualTo(String value) {
            addCriterion("ZG =", value, "zg");
            return (Criteria) this;
        }

        public Criteria andZgNotEqualTo(String value) {
            addCriterion("ZG <>", value, "zg");
            return (Criteria) this;
        }

        public Criteria andZgGreaterThan(String value) {
            addCriterion("ZG >", value, "zg");
            return (Criteria) this;
        }

        public Criteria andZgGreaterThanOrEqualTo(String value) {
            addCriterion("ZG >=", value, "zg");
            return (Criteria) this;
        }

        public Criteria andZgLessThan(String value) {
            addCriterion("ZG <", value, "zg");
            return (Criteria) this;
        }

        public Criteria andZgLessThanOrEqualTo(String value) {
            addCriterion("ZG <=", value, "zg");
            return (Criteria) this;
        }

        public Criteria andZgLike(String value) {
            addCriterion("ZG like", value, "zg");
            return (Criteria) this;
        }

        public Criteria andZgNotLike(String value) {
            addCriterion("ZG not like", value, "zg");
            return (Criteria) this;
        }

        public Criteria andZgIn(List<String> values) {
            addCriterion("ZG in", values, "zg");
            return (Criteria) this;
        }

        public Criteria andZgNotIn(List<String> values) {
            addCriterion("ZG not in", values, "zg");
            return (Criteria) this;
        }

        public Criteria andZgBetween(String value1, String value2) {
            addCriterion("ZG between", value1, value2, "zg");
            return (Criteria) this;
        }

        public Criteria andZgNotBetween(String value1, String value2) {
            addCriterion("ZG not between", value1, value2, "zg");
            return (Criteria) this;
        }

        public Criteria andInStateIsNull() {
            addCriterion("IN_STATE is null");
            return (Criteria) this;
        }

        public Criteria andInStateIsNotNull() {
            addCriterion("IN_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andInStateEqualTo(String value) {
            addCriterion("IN_STATE =", value, "inState");
            return (Criteria) this;
        }

        public Criteria andInStateNotEqualTo(String value) {
            addCriterion("IN_STATE <>", value, "inState");
            return (Criteria) this;
        }

        public Criteria andInStateGreaterThan(String value) {
            addCriterion("IN_STATE >", value, "inState");
            return (Criteria) this;
        }

        public Criteria andInStateGreaterThanOrEqualTo(String value) {
            addCriterion("IN_STATE >=", value, "inState");
            return (Criteria) this;
        }

        public Criteria andInStateLessThan(String value) {
            addCriterion("IN_STATE <", value, "inState");
            return (Criteria) this;
        }

        public Criteria andInStateLessThanOrEqualTo(String value) {
            addCriterion("IN_STATE <=", value, "inState");
            return (Criteria) this;
        }

        public Criteria andInStateLike(String value) {
            addCriterion("IN_STATE like", value, "inState");
            return (Criteria) this;
        }

        public Criteria andInStateNotLike(String value) {
            addCriterion("IN_STATE not like", value, "inState");
            return (Criteria) this;
        }

        public Criteria andInStateIn(List<String> values) {
            addCriterion("IN_STATE in", values, "inState");
            return (Criteria) this;
        }

        public Criteria andInStateNotIn(List<String> values) {
            addCriterion("IN_STATE not in", values, "inState");
            return (Criteria) this;
        }

        public Criteria andInStateBetween(String value1, String value2) {
            addCriterion("IN_STATE between", value1, value2, "inState");
            return (Criteria) this;
        }

        public Criteria andInStateNotBetween(String value1, String value2) {
            addCriterion("IN_STATE not between", value1, value2, "inState");
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

        public Criteria andIsAccountIsNull() {
            addCriterion("IS_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andIsAccountIsNotNull() {
            addCriterion("IS_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIsAccountEqualTo(String value) {
            addCriterion("IS_ACCOUNT =", value, "isAccount");
            return (Criteria) this;
        }

        public Criteria andIsAccountNotEqualTo(String value) {
            addCriterion("IS_ACCOUNT <>", value, "isAccount");
            return (Criteria) this;
        }

        public Criteria andIsAccountGreaterThan(String value) {
            addCriterion("IS_ACCOUNT >", value, "isAccount");
            return (Criteria) this;
        }

        public Criteria andIsAccountGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ACCOUNT >=", value, "isAccount");
            return (Criteria) this;
        }

        public Criteria andIsAccountLessThan(String value) {
            addCriterion("IS_ACCOUNT <", value, "isAccount");
            return (Criteria) this;
        }

        public Criteria andIsAccountLessThanOrEqualTo(String value) {
            addCriterion("IS_ACCOUNT <=", value, "isAccount");
            return (Criteria) this;
        }

        public Criteria andIsAccountLike(String value) {
            addCriterion("IS_ACCOUNT like", value, "isAccount");
            return (Criteria) this;
        }

        public Criteria andIsAccountNotLike(String value) {
            addCriterion("IS_ACCOUNT not like", value, "isAccount");
            return (Criteria) this;
        }

        public Criteria andIsAccountIn(List<String> values) {
            addCriterion("IS_ACCOUNT in", values, "isAccount");
            return (Criteria) this;
        }

        public Criteria andIsAccountNotIn(List<String> values) {
            addCriterion("IS_ACCOUNT not in", values, "isAccount");
            return (Criteria) this;
        }

        public Criteria andIsAccountBetween(String value1, String value2) {
            addCriterion("IS_ACCOUNT between", value1, value2, "isAccount");
            return (Criteria) this;
        }

        public Criteria andIsAccountNotBetween(String value1, String value2) {
            addCriterion("IS_ACCOUNT not between", value1, value2, "isAccount");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyIsNull() {
            addCriterion("IS_EMERGENCY is null");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyIsNotNull() {
            addCriterion("IS_EMERGENCY is not null");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyEqualTo(String value) {
            addCriterion("IS_EMERGENCY =", value, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyNotEqualTo(String value) {
            addCriterion("IS_EMERGENCY <>", value, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyGreaterThan(String value) {
            addCriterion("IS_EMERGENCY >", value, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyGreaterThanOrEqualTo(String value) {
            addCriterion("IS_EMERGENCY >=", value, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyLessThan(String value) {
            addCriterion("IS_EMERGENCY <", value, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyLessThanOrEqualTo(String value) {
            addCriterion("IS_EMERGENCY <=", value, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyLike(String value) {
            addCriterion("IS_EMERGENCY like", value, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyNotLike(String value) {
            addCriterion("IS_EMERGENCY not like", value, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyIn(List<String> values) {
            addCriterion("IS_EMERGENCY in", values, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyNotIn(List<String> values) {
            addCriterion("IS_EMERGENCY not in", values, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyBetween(String value1, String value2) {
            addCriterion("IS_EMERGENCY between", value1, value2, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andIsEmergencyNotBetween(String value1, String value2) {
            addCriterion("IS_EMERGENCY not between", value1, value2, "isEmergency");
            return (Criteria) this;
        }

        public Criteria andMark1IsNull() {
            addCriterion("MARK1 is null");
            return (Criteria) this;
        }

        public Criteria andMark1IsNotNull() {
            addCriterion("MARK1 is not null");
            return (Criteria) this;
        }

        public Criteria andMark1EqualTo(String value) {
            addCriterion("MARK1 =", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1NotEqualTo(String value) {
            addCriterion("MARK1 <>", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1GreaterThan(String value) {
            addCriterion("MARK1 >", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1GreaterThanOrEqualTo(String value) {
            addCriterion("MARK1 >=", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1LessThan(String value) {
            addCriterion("MARK1 <", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1LessThanOrEqualTo(String value) {
            addCriterion("MARK1 <=", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1Like(String value) {
            addCriterion("MARK1 like", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1NotLike(String value) {
            addCriterion("MARK1 not like", value, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1In(List<String> values) {
            addCriterion("MARK1 in", values, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1NotIn(List<String> values) {
            addCriterion("MARK1 not in", values, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1Between(String value1, String value2) {
            addCriterion("MARK1 between", value1, value2, "mark1");
            return (Criteria) this;
        }

        public Criteria andMark1NotBetween(String value1, String value2) {
            addCriterion("MARK1 not between", value1, value2, "mark1");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(BigDecimal value) {
            addCriterion("HEIGHT =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(BigDecimal value) {
            addCriterion("HEIGHT <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(BigDecimal value) {
            addCriterion("HEIGHT >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HEIGHT >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(BigDecimal value) {
            addCriterion("HEIGHT <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HEIGHT <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<BigDecimal> values) {
            addCriterion("HEIGHT in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<BigDecimal> values) {
            addCriterion("HEIGHT not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEIGHT between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HEIGHT not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("WEIGHT =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("WEIGHT >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("WEIGHT <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("WEIGHT in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHT not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andSbpIsNull() {
            addCriterion("SBP is null");
            return (Criteria) this;
        }

        public Criteria andSbpIsNotNull() {
            addCriterion("SBP is not null");
            return (Criteria) this;
        }

        public Criteria andSbpEqualTo(BigDecimal value) {
            addCriterion("SBP =", value, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpNotEqualTo(BigDecimal value) {
            addCriterion("SBP <>", value, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpGreaterThan(BigDecimal value) {
            addCriterion("SBP >", value, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SBP >=", value, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpLessThan(BigDecimal value) {
            addCriterion("SBP <", value, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SBP <=", value, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpIn(List<BigDecimal> values) {
            addCriterion("SBP in", values, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpNotIn(List<BigDecimal> values) {
            addCriterion("SBP not in", values, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SBP between", value1, value2, "sbp");
            return (Criteria) this;
        }

        public Criteria andSbpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SBP not between", value1, value2, "sbp");
            return (Criteria) this;
        }

        public Criteria andDbpIsNull() {
            addCriterion("DBP is null");
            return (Criteria) this;
        }

        public Criteria andDbpIsNotNull() {
            addCriterion("DBP is not null");
            return (Criteria) this;
        }

        public Criteria andDbpEqualTo(BigDecimal value) {
            addCriterion("DBP =", value, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpNotEqualTo(BigDecimal value) {
            addCriterion("DBP <>", value, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpGreaterThan(BigDecimal value) {
            addCriterion("DBP >", value, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DBP >=", value, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpLessThan(BigDecimal value) {
            addCriterion("DBP <", value, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DBP <=", value, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpIn(List<BigDecimal> values) {
            addCriterion("DBP in", values, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpNotIn(List<BigDecimal> values) {
            addCriterion("DBP not in", values, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DBP between", value1, value2, "dbp");
            return (Criteria) this;
        }

        public Criteria andDbpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DBP not between", value1, value2, "dbp");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("TEMPERATURE is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("TEMPERATURE is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(BigDecimal value) {
            addCriterion("TEMPERATURE =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(BigDecimal value) {
            addCriterion("TEMPERATURE <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(BigDecimal value) {
            addCriterion("TEMPERATURE >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPERATURE >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(BigDecimal value) {
            addCriterion("TEMPERATURE <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPERATURE <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<BigDecimal> values) {
            addCriterion("TEMPERATURE in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<BigDecimal> values) {
            addCriterion("TEMPERATURE not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPERATURE between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPERATURE not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andUpFlagIsNull() {
            addCriterion("UP_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andUpFlagIsNotNull() {
            addCriterion("UP_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andUpFlagEqualTo(String value) {
            addCriterion("UP_FLAG =", value, "upFlag");
            return (Criteria) this;
        }

        public Criteria andUpFlagNotEqualTo(String value) {
            addCriterion("UP_FLAG <>", value, "upFlag");
            return (Criteria) this;
        }

        public Criteria andUpFlagGreaterThan(String value) {
            addCriterion("UP_FLAG >", value, "upFlag");
            return (Criteria) this;
        }

        public Criteria andUpFlagGreaterThanOrEqualTo(String value) {
            addCriterion("UP_FLAG >=", value, "upFlag");
            return (Criteria) this;
        }

        public Criteria andUpFlagLessThan(String value) {
            addCriterion("UP_FLAG <", value, "upFlag");
            return (Criteria) this;
        }

        public Criteria andUpFlagLessThanOrEqualTo(String value) {
            addCriterion("UP_FLAG <=", value, "upFlag");
            return (Criteria) this;
        }

        public Criteria andUpFlagLike(String value) {
            addCriterion("UP_FLAG like", value, "upFlag");
            return (Criteria) this;
        }

        public Criteria andUpFlagNotLike(String value) {
            addCriterion("UP_FLAG not like", value, "upFlag");
            return (Criteria) this;
        }

        public Criteria andUpFlagIn(List<String> values) {
            addCriterion("UP_FLAG in", values, "upFlag");
            return (Criteria) this;
        }

        public Criteria andUpFlagNotIn(List<String> values) {
            addCriterion("UP_FLAG not in", values, "upFlag");
            return (Criteria) this;
        }

        public Criteria andUpFlagBetween(String value1, String value2) {
            addCriterion("UP_FLAG between", value1, value2, "upFlag");
            return (Criteria) this;
        }

        public Criteria andUpFlagNotBetween(String value1, String value2) {
            addCriterion("UP_FLAG not between", value1, value2, "upFlag");
            return (Criteria) this;
        }

        public Criteria andBloodgluIsNull() {
            addCriterion("BLOODGLU is null");
            return (Criteria) this;
        }

        public Criteria andBloodgluIsNotNull() {
            addCriterion("BLOODGLU is not null");
            return (Criteria) this;
        }

        public Criteria andBloodgluEqualTo(BigDecimal value) {
            addCriterion("BLOODGLU =", value, "bloodglu");
            return (Criteria) this;
        }

        public Criteria andBloodgluNotEqualTo(BigDecimal value) {
            addCriterion("BLOODGLU <>", value, "bloodglu");
            return (Criteria) this;
        }

        public Criteria andBloodgluGreaterThan(BigDecimal value) {
            addCriterion("BLOODGLU >", value, "bloodglu");
            return (Criteria) this;
        }

        public Criteria andBloodgluGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BLOODGLU >=", value, "bloodglu");
            return (Criteria) this;
        }

        public Criteria andBloodgluLessThan(BigDecimal value) {
            addCriterion("BLOODGLU <", value, "bloodglu");
            return (Criteria) this;
        }

        public Criteria andBloodgluLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BLOODGLU <=", value, "bloodglu");
            return (Criteria) this;
        }

        public Criteria andBloodgluIn(List<BigDecimal> values) {
            addCriterion("BLOODGLU in", values, "bloodglu");
            return (Criteria) this;
        }

        public Criteria andBloodgluNotIn(List<BigDecimal> values) {
            addCriterion("BLOODGLU not in", values, "bloodglu");
            return (Criteria) this;
        }

        public Criteria andBloodgluBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BLOODGLU between", value1, value2, "bloodglu");
            return (Criteria) this;
        }

        public Criteria andBloodgluNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BLOODGLU not between", value1, value2, "bloodglu");
            return (Criteria) this;
        }

        public Criteria andCurrentCardtypeIsNull() {
            addCriterion("CURRENT_CARDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCardtypeIsNotNull() {
            addCriterion("CURRENT_CARDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCardtypeEqualTo(String value) {
            addCriterion("CURRENT_CARDTYPE =", value, "currentCardtype");
            return (Criteria) this;
        }

        public Criteria andCurrentCardtypeNotEqualTo(String value) {
            addCriterion("CURRENT_CARDTYPE <>", value, "currentCardtype");
            return (Criteria) this;
        }

        public Criteria andCurrentCardtypeGreaterThan(String value) {
            addCriterion("CURRENT_CARDTYPE >", value, "currentCardtype");
            return (Criteria) this;
        }

        public Criteria andCurrentCardtypeGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_CARDTYPE >=", value, "currentCardtype");
            return (Criteria) this;
        }

        public Criteria andCurrentCardtypeLessThan(String value) {
            addCriterion("CURRENT_CARDTYPE <", value, "currentCardtype");
            return (Criteria) this;
        }

        public Criteria andCurrentCardtypeLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_CARDTYPE <=", value, "currentCardtype");
            return (Criteria) this;
        }

        public Criteria andCurrentCardtypeLike(String value) {
            addCriterion("CURRENT_CARDTYPE like", value, "currentCardtype");
            return (Criteria) this;
        }

        public Criteria andCurrentCardtypeNotLike(String value) {
            addCriterion("CURRENT_CARDTYPE not like", value, "currentCardtype");
            return (Criteria) this;
        }

        public Criteria andCurrentCardtypeIn(List<String> values) {
            addCriterion("CURRENT_CARDTYPE in", values, "currentCardtype");
            return (Criteria) this;
        }

        public Criteria andCurrentCardtypeNotIn(List<String> values) {
            addCriterion("CURRENT_CARDTYPE not in", values, "currentCardtype");
            return (Criteria) this;
        }

        public Criteria andCurrentCardtypeBetween(String value1, String value2) {
            addCriterion("CURRENT_CARDTYPE between", value1, value2, "currentCardtype");
            return (Criteria) this;
        }

        public Criteria andCurrentCardtypeNotBetween(String value1, String value2) {
            addCriterion("CURRENT_CARDTYPE not between", value1, value2, "currentCardtype");
            return (Criteria) this;
        }

        public Criteria andCurrentCardIsNull() {
            addCriterion("CURRENT_CARD is null");
            return (Criteria) this;
        }

        public Criteria andCurrentCardIsNotNull() {
            addCriterion("CURRENT_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentCardEqualTo(String value) {
            addCriterion("CURRENT_CARD =", value, "currentCard");
            return (Criteria) this;
        }

        public Criteria andCurrentCardNotEqualTo(String value) {
            addCriterion("CURRENT_CARD <>", value, "currentCard");
            return (Criteria) this;
        }

        public Criteria andCurrentCardGreaterThan(String value) {
            addCriterion("CURRENT_CARD >", value, "currentCard");
            return (Criteria) this;
        }

        public Criteria andCurrentCardGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENT_CARD >=", value, "currentCard");
            return (Criteria) this;
        }

        public Criteria andCurrentCardLessThan(String value) {
            addCriterion("CURRENT_CARD <", value, "currentCard");
            return (Criteria) this;
        }

        public Criteria andCurrentCardLessThanOrEqualTo(String value) {
            addCriterion("CURRENT_CARD <=", value, "currentCard");
            return (Criteria) this;
        }

        public Criteria andCurrentCardLike(String value) {
            addCriterion("CURRENT_CARD like", value, "currentCard");
            return (Criteria) this;
        }

        public Criteria andCurrentCardNotLike(String value) {
            addCriterion("CURRENT_CARD not like", value, "currentCard");
            return (Criteria) this;
        }

        public Criteria andCurrentCardIn(List<String> values) {
            addCriterion("CURRENT_CARD in", values, "currentCard");
            return (Criteria) this;
        }

        public Criteria andCurrentCardNotIn(List<String> values) {
            addCriterion("CURRENT_CARD not in", values, "currentCard");
            return (Criteria) this;
        }

        public Criteria andCurrentCardBetween(String value1, String value2) {
            addCriterion("CURRENT_CARD between", value1, value2, "currentCard");
            return (Criteria) this;
        }

        public Criteria andCurrentCardNotBetween(String value1, String value2) {
            addCriterion("CURRENT_CARD not between", value1, value2, "currentCard");
            return (Criteria) this;
        }

        public Criteria andInTimesIsNull() {
            addCriterion("IN_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andInTimesIsNotNull() {
            addCriterion("IN_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andInTimesEqualTo(BigDecimal value) {
            addCriterion("IN_TIMES =", value, "inTimes");
            return (Criteria) this;
        }

        public Criteria andInTimesNotEqualTo(BigDecimal value) {
            addCriterion("IN_TIMES <>", value, "inTimes");
            return (Criteria) this;
        }

        public Criteria andInTimesGreaterThan(BigDecimal value) {
            addCriterion("IN_TIMES >", value, "inTimes");
            return (Criteria) this;
        }

        public Criteria andInTimesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IN_TIMES >=", value, "inTimes");
            return (Criteria) this;
        }

        public Criteria andInTimesLessThan(BigDecimal value) {
            addCriterion("IN_TIMES <", value, "inTimes");
            return (Criteria) this;
        }

        public Criteria andInTimesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IN_TIMES <=", value, "inTimes");
            return (Criteria) this;
        }

        public Criteria andInTimesIn(List<BigDecimal> values) {
            addCriterion("IN_TIMES in", values, "inTimes");
            return (Criteria) this;
        }

        public Criteria andInTimesNotIn(List<BigDecimal> values) {
            addCriterion("IN_TIMES not in", values, "inTimes");
            return (Criteria) this;
        }

        public Criteria andInTimesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IN_TIMES between", value1, value2, "inTimes");
            return (Criteria) this;
        }

        public Criteria andInTimesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IN_TIMES not between", value1, value2, "inTimes");
            return (Criteria) this;
        }

        public Criteria andEmrRegidIsNull() {
            addCriterion("EMR_REGID is null");
            return (Criteria) this;
        }

        public Criteria andEmrRegidIsNotNull() {
            addCriterion("EMR_REGID is not null");
            return (Criteria) this;
        }

        public Criteria andEmrRegidEqualTo(Long value) {
            addCriterion("EMR_REGID =", value, "emrRegid");
            return (Criteria) this;
        }

        public Criteria andEmrRegidNotEqualTo(Long value) {
            addCriterion("EMR_REGID <>", value, "emrRegid");
            return (Criteria) this;
        }

        public Criteria andEmrRegidGreaterThan(Long value) {
            addCriterion("EMR_REGID >", value, "emrRegid");
            return (Criteria) this;
        }

        public Criteria andEmrRegidGreaterThanOrEqualTo(Long value) {
            addCriterion("EMR_REGID >=", value, "emrRegid");
            return (Criteria) this;
        }

        public Criteria andEmrRegidLessThan(Long value) {
            addCriterion("EMR_REGID <", value, "emrRegid");
            return (Criteria) this;
        }

        public Criteria andEmrRegidLessThanOrEqualTo(Long value) {
            addCriterion("EMR_REGID <=", value, "emrRegid");
            return (Criteria) this;
        }

        public Criteria andEmrRegidIn(List<Long> values) {
            addCriterion("EMR_REGID in", values, "emrRegid");
            return (Criteria) this;
        }

        public Criteria andEmrRegidNotIn(List<Long> values) {
            addCriterion("EMR_REGID not in", values, "emrRegid");
            return (Criteria) this;
        }

        public Criteria andEmrRegidBetween(Long value1, Long value2) {
            addCriterion("EMR_REGID between", value1, value2, "emrRegid");
            return (Criteria) this;
        }

        public Criteria andEmrRegidNotBetween(Long value1, Long value2) {
            addCriterion("EMR_REGID not between", value1, value2, "emrRegid");
            return (Criteria) this;
        }

        public Criteria andPatientTypeIsNull() {
            addCriterion("PATIENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPatientTypeIsNotNull() {
            addCriterion("PATIENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPatientTypeEqualTo(String value) {
            addCriterion("PATIENT_TYPE =", value, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeNotEqualTo(String value) {
            addCriterion("PATIENT_TYPE <>", value, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeGreaterThan(String value) {
            addCriterion("PATIENT_TYPE >", value, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_TYPE >=", value, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeLessThan(String value) {
            addCriterion("PATIENT_TYPE <", value, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_TYPE <=", value, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeLike(String value) {
            addCriterion("PATIENT_TYPE like", value, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeNotLike(String value) {
            addCriterion("PATIENT_TYPE not like", value, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeIn(List<String> values) {
            addCriterion("PATIENT_TYPE in", values, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeNotIn(List<String> values) {
            addCriterion("PATIENT_TYPE not in", values, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeBetween(String value1, String value2) {
            addCriterion("PATIENT_TYPE between", value1, value2, "patientType");
            return (Criteria) this;
        }

        public Criteria andPatientTypeNotBetween(String value1, String value2) {
            addCriterion("PATIENT_TYPE not between", value1, value2, "patientType");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNull() {
            addCriterion("BOOK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("BOOK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(String value) {
            addCriterion("BOOK_ID =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(String value) {
            addCriterion("BOOK_ID <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(String value) {
            addCriterion("BOOK_ID >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(String value) {
            addCriterion("BOOK_ID >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(String value) {
            addCriterion("BOOK_ID <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(String value) {
            addCriterion("BOOK_ID <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLike(String value) {
            addCriterion("BOOK_ID like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotLike(String value) {
            addCriterion("BOOK_ID not like", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<String> values) {
            addCriterion("BOOK_ID in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<String> values) {
            addCriterion("BOOK_ID not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(String value1, String value2) {
            addCriterion("BOOK_ID between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(String value1, String value2) {
            addCriterion("BOOK_ID not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andClass1deseaseIsNull() {
            addCriterion("CLASS1DESEASE is null");
            return (Criteria) this;
        }

        public Criteria andClass1deseaseIsNotNull() {
            addCriterion("CLASS1DESEASE is not null");
            return (Criteria) this;
        }

        public Criteria andClass1deseaseEqualTo(String value) {
            addCriterion("CLASS1DESEASE =", value, "class1desease");
            return (Criteria) this;
        }

        public Criteria andClass1deseaseNotEqualTo(String value) {
            addCriterion("CLASS1DESEASE <>", value, "class1desease");
            return (Criteria) this;
        }

        public Criteria andClass1deseaseGreaterThan(String value) {
            addCriterion("CLASS1DESEASE >", value, "class1desease");
            return (Criteria) this;
        }

        public Criteria andClass1deseaseGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS1DESEASE >=", value, "class1desease");
            return (Criteria) this;
        }

        public Criteria andClass1deseaseLessThan(String value) {
            addCriterion("CLASS1DESEASE <", value, "class1desease");
            return (Criteria) this;
        }

        public Criteria andClass1deseaseLessThanOrEqualTo(String value) {
            addCriterion("CLASS1DESEASE <=", value, "class1desease");
            return (Criteria) this;
        }

        public Criteria andClass1deseaseLike(String value) {
            addCriterion("CLASS1DESEASE like", value, "class1desease");
            return (Criteria) this;
        }

        public Criteria andClass1deseaseNotLike(String value) {
            addCriterion("CLASS1DESEASE not like", value, "class1desease");
            return (Criteria) this;
        }

        public Criteria andClass1deseaseIn(List<String> values) {
            addCriterion("CLASS1DESEASE in", values, "class1desease");
            return (Criteria) this;
        }

        public Criteria andClass1deseaseNotIn(List<String> values) {
            addCriterion("CLASS1DESEASE not in", values, "class1desease");
            return (Criteria) this;
        }

        public Criteria andClass1deseaseBetween(String value1, String value2) {
            addCriterion("CLASS1DESEASE between", value1, value2, "class1desease");
            return (Criteria) this;
        }

        public Criteria andClass1deseaseNotBetween(String value1, String value2) {
            addCriterion("CLASS1DESEASE not between", value1, value2, "class1desease");
            return (Criteria) this;
        }

        public Criteria andClass2deseaseIsNull() {
            addCriterion("CLASS2DESEASE is null");
            return (Criteria) this;
        }

        public Criteria andClass2deseaseIsNotNull() {
            addCriterion("CLASS2DESEASE is not null");
            return (Criteria) this;
        }

        public Criteria andClass2deseaseEqualTo(String value) {
            addCriterion("CLASS2DESEASE =", value, "class2desease");
            return (Criteria) this;
        }

        public Criteria andClass2deseaseNotEqualTo(String value) {
            addCriterion("CLASS2DESEASE <>", value, "class2desease");
            return (Criteria) this;
        }

        public Criteria andClass2deseaseGreaterThan(String value) {
            addCriterion("CLASS2DESEASE >", value, "class2desease");
            return (Criteria) this;
        }

        public Criteria andClass2deseaseGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS2DESEASE >=", value, "class2desease");
            return (Criteria) this;
        }

        public Criteria andClass2deseaseLessThan(String value) {
            addCriterion("CLASS2DESEASE <", value, "class2desease");
            return (Criteria) this;
        }

        public Criteria andClass2deseaseLessThanOrEqualTo(String value) {
            addCriterion("CLASS2DESEASE <=", value, "class2desease");
            return (Criteria) this;
        }

        public Criteria andClass2deseaseLike(String value) {
            addCriterion("CLASS2DESEASE like", value, "class2desease");
            return (Criteria) this;
        }

        public Criteria andClass2deseaseNotLike(String value) {
            addCriterion("CLASS2DESEASE not like", value, "class2desease");
            return (Criteria) this;
        }

        public Criteria andClass2deseaseIn(List<String> values) {
            addCriterion("CLASS2DESEASE in", values, "class2desease");
            return (Criteria) this;
        }

        public Criteria andClass2deseaseNotIn(List<String> values) {
            addCriterion("CLASS2DESEASE not in", values, "class2desease");
            return (Criteria) this;
        }

        public Criteria andClass2deseaseBetween(String value1, String value2) {
            addCriterion("CLASS2DESEASE between", value1, value2, "class2desease");
            return (Criteria) this;
        }

        public Criteria andClass2deseaseNotBetween(String value1, String value2) {
            addCriterion("CLASS2DESEASE not between", value1, value2, "class2desease");
            return (Criteria) this;
        }

        public Criteria andIsDirectfeeIsNull() {
            addCriterion("IS_DIRECTFEE is null");
            return (Criteria) this;
        }

        public Criteria andIsDirectfeeIsNotNull() {
            addCriterion("IS_DIRECTFEE is not null");
            return (Criteria) this;
        }

        public Criteria andIsDirectfeeEqualTo(String value) {
            addCriterion("IS_DIRECTFEE =", value, "isDirectfee");
            return (Criteria) this;
        }

        public Criteria andIsDirectfeeNotEqualTo(String value) {
            addCriterion("IS_DIRECTFEE <>", value, "isDirectfee");
            return (Criteria) this;
        }

        public Criteria andIsDirectfeeGreaterThan(String value) {
            addCriterion("IS_DIRECTFEE >", value, "isDirectfee");
            return (Criteria) this;
        }

        public Criteria andIsDirectfeeGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DIRECTFEE >=", value, "isDirectfee");
            return (Criteria) this;
        }

        public Criteria andIsDirectfeeLessThan(String value) {
            addCriterion("IS_DIRECTFEE <", value, "isDirectfee");
            return (Criteria) this;
        }

        public Criteria andIsDirectfeeLessThanOrEqualTo(String value) {
            addCriterion("IS_DIRECTFEE <=", value, "isDirectfee");
            return (Criteria) this;
        }

        public Criteria andIsDirectfeeLike(String value) {
            addCriterion("IS_DIRECTFEE like", value, "isDirectfee");
            return (Criteria) this;
        }

        public Criteria andIsDirectfeeNotLike(String value) {
            addCriterion("IS_DIRECTFEE not like", value, "isDirectfee");
            return (Criteria) this;
        }

        public Criteria andIsDirectfeeIn(List<String> values) {
            addCriterion("IS_DIRECTFEE in", values, "isDirectfee");
            return (Criteria) this;
        }

        public Criteria andIsDirectfeeNotIn(List<String> values) {
            addCriterion("IS_DIRECTFEE not in", values, "isDirectfee");
            return (Criteria) this;
        }

        public Criteria andIsDirectfeeBetween(String value1, String value2) {
            addCriterion("IS_DIRECTFEE between", value1, value2, "isDirectfee");
            return (Criteria) this;
        }

        public Criteria andIsDirectfeeNotBetween(String value1, String value2) {
            addCriterion("IS_DIRECTFEE not between", value1, value2, "isDirectfee");
            return (Criteria) this;
        }

        public Criteria andRealDoctCodeIsNull() {
            addCriterion("REAL_DOCT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRealDoctCodeIsNotNull() {
            addCriterion("REAL_DOCT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRealDoctCodeEqualTo(String value) {
            addCriterion("REAL_DOCT_CODE =", value, "realDoctCode");
            return (Criteria) this;
        }

        public Criteria andRealDoctCodeNotEqualTo(String value) {
            addCriterion("REAL_DOCT_CODE <>", value, "realDoctCode");
            return (Criteria) this;
        }

        public Criteria andRealDoctCodeGreaterThan(String value) {
            addCriterion("REAL_DOCT_CODE >", value, "realDoctCode");
            return (Criteria) this;
        }

        public Criteria andRealDoctCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REAL_DOCT_CODE >=", value, "realDoctCode");
            return (Criteria) this;
        }

        public Criteria andRealDoctCodeLessThan(String value) {
            addCriterion("REAL_DOCT_CODE <", value, "realDoctCode");
            return (Criteria) this;
        }

        public Criteria andRealDoctCodeLessThanOrEqualTo(String value) {
            addCriterion("REAL_DOCT_CODE <=", value, "realDoctCode");
            return (Criteria) this;
        }

        public Criteria andRealDoctCodeLike(String value) {
            addCriterion("REAL_DOCT_CODE like", value, "realDoctCode");
            return (Criteria) this;
        }

        public Criteria andRealDoctCodeNotLike(String value) {
            addCriterion("REAL_DOCT_CODE not like", value, "realDoctCode");
            return (Criteria) this;
        }

        public Criteria andRealDoctCodeIn(List<String> values) {
            addCriterion("REAL_DOCT_CODE in", values, "realDoctCode");
            return (Criteria) this;
        }

        public Criteria andRealDoctCodeNotIn(List<String> values) {
            addCriterion("REAL_DOCT_CODE not in", values, "realDoctCode");
            return (Criteria) this;
        }

        public Criteria andRealDoctCodeBetween(String value1, String value2) {
            addCriterion("REAL_DOCT_CODE between", value1, value2, "realDoctCode");
            return (Criteria) this;
        }

        public Criteria andRealDoctCodeNotBetween(String value1, String value2) {
            addCriterion("REAL_DOCT_CODE not between", value1, value2, "realDoctCode");
            return (Criteria) this;
        }

        public Criteria andRealDoctNameIsNull() {
            addCriterion("REAL_DOCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRealDoctNameIsNotNull() {
            addCriterion("REAL_DOCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRealDoctNameEqualTo(String value) {
            addCriterion("REAL_DOCT_NAME =", value, "realDoctName");
            return (Criteria) this;
        }

        public Criteria andRealDoctNameNotEqualTo(String value) {
            addCriterion("REAL_DOCT_NAME <>", value, "realDoctName");
            return (Criteria) this;
        }

        public Criteria andRealDoctNameGreaterThan(String value) {
            addCriterion("REAL_DOCT_NAME >", value, "realDoctName");
            return (Criteria) this;
        }

        public Criteria andRealDoctNameGreaterThanOrEqualTo(String value) {
            addCriterion("REAL_DOCT_NAME >=", value, "realDoctName");
            return (Criteria) this;
        }

        public Criteria andRealDoctNameLessThan(String value) {
            addCriterion("REAL_DOCT_NAME <", value, "realDoctName");
            return (Criteria) this;
        }

        public Criteria andRealDoctNameLessThanOrEqualTo(String value) {
            addCriterion("REAL_DOCT_NAME <=", value, "realDoctName");
            return (Criteria) this;
        }

        public Criteria andRealDoctNameLike(String value) {
            addCriterion("REAL_DOCT_NAME like", value, "realDoctName");
            return (Criteria) this;
        }

        public Criteria andRealDoctNameNotLike(String value) {
            addCriterion("REAL_DOCT_NAME not like", value, "realDoctName");
            return (Criteria) this;
        }

        public Criteria andRealDoctNameIn(List<String> values) {
            addCriterion("REAL_DOCT_NAME in", values, "realDoctName");
            return (Criteria) this;
        }

        public Criteria andRealDoctNameNotIn(List<String> values) {
            addCriterion("REAL_DOCT_NAME not in", values, "realDoctName");
            return (Criteria) this;
        }

        public Criteria andRealDoctNameBetween(String value1, String value2) {
            addCriterion("REAL_DOCT_NAME between", value1, value2, "realDoctName");
            return (Criteria) this;
        }

        public Criteria andRealDoctNameNotBetween(String value1, String value2) {
            addCriterion("REAL_DOCT_NAME not between", value1, value2, "realDoctName");
            return (Criteria) this;
        }

        public Criteria andHospitalFirstVisitIsNull() {
            addCriterion("HOSPITAL_FIRST_VISIT is null");
            return (Criteria) this;
        }

        public Criteria andHospitalFirstVisitIsNotNull() {
            addCriterion("HOSPITAL_FIRST_VISIT is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalFirstVisitEqualTo(String value) {
            addCriterion("HOSPITAL_FIRST_VISIT =", value, "hospitalFirstVisit");
            return (Criteria) this;
        }

        public Criteria andHospitalFirstVisitNotEqualTo(String value) {
            addCriterion("HOSPITAL_FIRST_VISIT <>", value, "hospitalFirstVisit");
            return (Criteria) this;
        }

        public Criteria andHospitalFirstVisitGreaterThan(String value) {
            addCriterion("HOSPITAL_FIRST_VISIT >", value, "hospitalFirstVisit");
            return (Criteria) this;
        }

        public Criteria andHospitalFirstVisitGreaterThanOrEqualTo(String value) {
            addCriterion("HOSPITAL_FIRST_VISIT >=", value, "hospitalFirstVisit");
            return (Criteria) this;
        }

        public Criteria andHospitalFirstVisitLessThan(String value) {
            addCriterion("HOSPITAL_FIRST_VISIT <", value, "hospitalFirstVisit");
            return (Criteria) this;
        }

        public Criteria andHospitalFirstVisitLessThanOrEqualTo(String value) {
            addCriterion("HOSPITAL_FIRST_VISIT <=", value, "hospitalFirstVisit");
            return (Criteria) this;
        }

        public Criteria andHospitalFirstVisitLike(String value) {
            addCriterion("HOSPITAL_FIRST_VISIT like", value, "hospitalFirstVisit");
            return (Criteria) this;
        }

        public Criteria andHospitalFirstVisitNotLike(String value) {
            addCriterion("HOSPITAL_FIRST_VISIT not like", value, "hospitalFirstVisit");
            return (Criteria) this;
        }

        public Criteria andHospitalFirstVisitIn(List<String> values) {
            addCriterion("HOSPITAL_FIRST_VISIT in", values, "hospitalFirstVisit");
            return (Criteria) this;
        }

        public Criteria andHospitalFirstVisitNotIn(List<String> values) {
            addCriterion("HOSPITAL_FIRST_VISIT not in", values, "hospitalFirstVisit");
            return (Criteria) this;
        }

        public Criteria andHospitalFirstVisitBetween(String value1, String value2) {
            addCriterion("HOSPITAL_FIRST_VISIT between", value1, value2, "hospitalFirstVisit");
            return (Criteria) this;
        }

        public Criteria andHospitalFirstVisitNotBetween(String value1, String value2) {
            addCriterion("HOSPITAL_FIRST_VISIT not between", value1, value2, "hospitalFirstVisit");
            return (Criteria) this;
        }

        public Criteria andRootdeptFirstVisitIsNull() {
            addCriterion("ROOTDEPT_FIRST_VISIT is null");
            return (Criteria) this;
        }

        public Criteria andRootdeptFirstVisitIsNotNull() {
            addCriterion("ROOTDEPT_FIRST_VISIT is not null");
            return (Criteria) this;
        }

        public Criteria andRootdeptFirstVisitEqualTo(String value) {
            addCriterion("ROOTDEPT_FIRST_VISIT =", value, "rootdeptFirstVisit");
            return (Criteria) this;
        }

        public Criteria andRootdeptFirstVisitNotEqualTo(String value) {
            addCriterion("ROOTDEPT_FIRST_VISIT <>", value, "rootdeptFirstVisit");
            return (Criteria) this;
        }

        public Criteria andRootdeptFirstVisitGreaterThan(String value) {
            addCriterion("ROOTDEPT_FIRST_VISIT >", value, "rootdeptFirstVisit");
            return (Criteria) this;
        }

        public Criteria andRootdeptFirstVisitGreaterThanOrEqualTo(String value) {
            addCriterion("ROOTDEPT_FIRST_VISIT >=", value, "rootdeptFirstVisit");
            return (Criteria) this;
        }

        public Criteria andRootdeptFirstVisitLessThan(String value) {
            addCriterion("ROOTDEPT_FIRST_VISIT <", value, "rootdeptFirstVisit");
            return (Criteria) this;
        }

        public Criteria andRootdeptFirstVisitLessThanOrEqualTo(String value) {
            addCriterion("ROOTDEPT_FIRST_VISIT <=", value, "rootdeptFirstVisit");
            return (Criteria) this;
        }

        public Criteria andRootdeptFirstVisitLike(String value) {
            addCriterion("ROOTDEPT_FIRST_VISIT like", value, "rootdeptFirstVisit");
            return (Criteria) this;
        }

        public Criteria andRootdeptFirstVisitNotLike(String value) {
            addCriterion("ROOTDEPT_FIRST_VISIT not like", value, "rootdeptFirstVisit");
            return (Criteria) this;
        }

        public Criteria andRootdeptFirstVisitIn(List<String> values) {
            addCriterion("ROOTDEPT_FIRST_VISIT in", values, "rootdeptFirstVisit");
            return (Criteria) this;
        }

        public Criteria andRootdeptFirstVisitNotIn(List<String> values) {
            addCriterion("ROOTDEPT_FIRST_VISIT not in", values, "rootdeptFirstVisit");
            return (Criteria) this;
        }

        public Criteria andRootdeptFirstVisitBetween(String value1, String value2) {
            addCriterion("ROOTDEPT_FIRST_VISIT between", value1, value2, "rootdeptFirstVisit");
            return (Criteria) this;
        }

        public Criteria andRootdeptFirstVisitNotBetween(String value1, String value2) {
            addCriterion("ROOTDEPT_FIRST_VISIT not between", value1, value2, "rootdeptFirstVisit");
            return (Criteria) this;
        }

        public Criteria andDoctFirstVisitIsNull() {
            addCriterion("DOCT_FIRST_VISIT is null");
            return (Criteria) this;
        }

        public Criteria andDoctFirstVisitIsNotNull() {
            addCriterion("DOCT_FIRST_VISIT is not null");
            return (Criteria) this;
        }

        public Criteria andDoctFirstVisitEqualTo(String value) {
            addCriterion("DOCT_FIRST_VISIT =", value, "doctFirstVisit");
            return (Criteria) this;
        }

        public Criteria andDoctFirstVisitNotEqualTo(String value) {
            addCriterion("DOCT_FIRST_VISIT <>", value, "doctFirstVisit");
            return (Criteria) this;
        }

        public Criteria andDoctFirstVisitGreaterThan(String value) {
            addCriterion("DOCT_FIRST_VISIT >", value, "doctFirstVisit");
            return (Criteria) this;
        }

        public Criteria andDoctFirstVisitGreaterThanOrEqualTo(String value) {
            addCriterion("DOCT_FIRST_VISIT >=", value, "doctFirstVisit");
            return (Criteria) this;
        }

        public Criteria andDoctFirstVisitLessThan(String value) {
            addCriterion("DOCT_FIRST_VISIT <", value, "doctFirstVisit");
            return (Criteria) this;
        }

        public Criteria andDoctFirstVisitLessThanOrEqualTo(String value) {
            addCriterion("DOCT_FIRST_VISIT <=", value, "doctFirstVisit");
            return (Criteria) this;
        }

        public Criteria andDoctFirstVisitLike(String value) {
            addCriterion("DOCT_FIRST_VISIT like", value, "doctFirstVisit");
            return (Criteria) this;
        }

        public Criteria andDoctFirstVisitNotLike(String value) {
            addCriterion("DOCT_FIRST_VISIT not like", value, "doctFirstVisit");
            return (Criteria) this;
        }

        public Criteria andDoctFirstVisitIn(List<String> values) {
            addCriterion("DOCT_FIRST_VISIT in", values, "doctFirstVisit");
            return (Criteria) this;
        }

        public Criteria andDoctFirstVisitNotIn(List<String> values) {
            addCriterion("DOCT_FIRST_VISIT not in", values, "doctFirstVisit");
            return (Criteria) this;
        }

        public Criteria andDoctFirstVisitBetween(String value1, String value2) {
            addCriterion("DOCT_FIRST_VISIT between", value1, value2, "doctFirstVisit");
            return (Criteria) this;
        }

        public Criteria andDoctFirstVisitNotBetween(String value1, String value2) {
            addCriterion("DOCT_FIRST_VISIT not between", value1, value2, "doctFirstVisit");
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