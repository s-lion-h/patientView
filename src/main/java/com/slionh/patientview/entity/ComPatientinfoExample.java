package com.slionh.patientview.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComPatientinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComPatientinfoExample() {
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

        public Criteria andIcCardnoIsNull() {
            addCriterion("IC_CARDNO is null");
            return (Criteria) this;
        }

        public Criteria andIcCardnoIsNotNull() {
            addCriterion("IC_CARDNO is not null");
            return (Criteria) this;
        }

        public Criteria andIcCardnoEqualTo(String value) {
            addCriterion("IC_CARDNO =", value, "icCardno");
            return (Criteria) this;
        }

        public Criteria andIcCardnoNotEqualTo(String value) {
            addCriterion("IC_CARDNO <>", value, "icCardno");
            return (Criteria) this;
        }

        public Criteria andIcCardnoGreaterThan(String value) {
            addCriterion("IC_CARDNO >", value, "icCardno");
            return (Criteria) this;
        }

        public Criteria andIcCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("IC_CARDNO >=", value, "icCardno");
            return (Criteria) this;
        }

        public Criteria andIcCardnoLessThan(String value) {
            addCriterion("IC_CARDNO <", value, "icCardno");
            return (Criteria) this;
        }

        public Criteria andIcCardnoLessThanOrEqualTo(String value) {
            addCriterion("IC_CARDNO <=", value, "icCardno");
            return (Criteria) this;
        }

        public Criteria andIcCardnoLike(String value) {
            addCriterion("IC_CARDNO like", value, "icCardno");
            return (Criteria) this;
        }

        public Criteria andIcCardnoNotLike(String value) {
            addCriterion("IC_CARDNO not like", value, "icCardno");
            return (Criteria) this;
        }

        public Criteria andIcCardnoIn(List<String> values) {
            addCriterion("IC_CARDNO in", values, "icCardno");
            return (Criteria) this;
        }

        public Criteria andIcCardnoNotIn(List<String> values) {
            addCriterion("IC_CARDNO not in", values, "icCardno");
            return (Criteria) this;
        }

        public Criteria andIcCardnoBetween(String value1, String value2) {
            addCriterion("IC_CARDNO between", value1, value2, "icCardno");
            return (Criteria) this;
        }

        public Criteria andIcCardnoNotBetween(String value1, String value2) {
            addCriterion("IC_CARDNO not between", value1, value2, "icCardno");
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

        public Criteria andSpellCodeIsNull() {
            addCriterion("SPELL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSpellCodeIsNotNull() {
            addCriterion("SPELL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSpellCodeEqualTo(String value) {
            addCriterion("SPELL_CODE =", value, "spellCode");
            return (Criteria) this;
        }

        public Criteria andSpellCodeNotEqualTo(String value) {
            addCriterion("SPELL_CODE <>", value, "spellCode");
            return (Criteria) this;
        }

        public Criteria andSpellCodeGreaterThan(String value) {
            addCriterion("SPELL_CODE >", value, "spellCode");
            return (Criteria) this;
        }

        public Criteria andSpellCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SPELL_CODE >=", value, "spellCode");
            return (Criteria) this;
        }

        public Criteria andSpellCodeLessThan(String value) {
            addCriterion("SPELL_CODE <", value, "spellCode");
            return (Criteria) this;
        }

        public Criteria andSpellCodeLessThanOrEqualTo(String value) {
            addCriterion("SPELL_CODE <=", value, "spellCode");
            return (Criteria) this;
        }

        public Criteria andSpellCodeLike(String value) {
            addCriterion("SPELL_CODE like", value, "spellCode");
            return (Criteria) this;
        }

        public Criteria andSpellCodeNotLike(String value) {
            addCriterion("SPELL_CODE not like", value, "spellCode");
            return (Criteria) this;
        }

        public Criteria andSpellCodeIn(List<String> values) {
            addCriterion("SPELL_CODE in", values, "spellCode");
            return (Criteria) this;
        }

        public Criteria andSpellCodeNotIn(List<String> values) {
            addCriterion("SPELL_CODE not in", values, "spellCode");
            return (Criteria) this;
        }

        public Criteria andSpellCodeBetween(String value1, String value2) {
            addCriterion("SPELL_CODE between", value1, value2, "spellCode");
            return (Criteria) this;
        }

        public Criteria andSpellCodeNotBetween(String value1, String value2) {
            addCriterion("SPELL_CODE not between", value1, value2, "spellCode");
            return (Criteria) this;
        }

        public Criteria andWbCodeIsNull() {
            addCriterion("WB_CODE is null");
            return (Criteria) this;
        }

        public Criteria andWbCodeIsNotNull() {
            addCriterion("WB_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andWbCodeEqualTo(String value) {
            addCriterion("WB_CODE =", value, "wbCode");
            return (Criteria) this;
        }

        public Criteria andWbCodeNotEqualTo(String value) {
            addCriterion("WB_CODE <>", value, "wbCode");
            return (Criteria) this;
        }

        public Criteria andWbCodeGreaterThan(String value) {
            addCriterion("WB_CODE >", value, "wbCode");
            return (Criteria) this;
        }

        public Criteria andWbCodeGreaterThanOrEqualTo(String value) {
            addCriterion("WB_CODE >=", value, "wbCode");
            return (Criteria) this;
        }

        public Criteria andWbCodeLessThan(String value) {
            addCriterion("WB_CODE <", value, "wbCode");
            return (Criteria) this;
        }

        public Criteria andWbCodeLessThanOrEqualTo(String value) {
            addCriterion("WB_CODE <=", value, "wbCode");
            return (Criteria) this;
        }

        public Criteria andWbCodeLike(String value) {
            addCriterion("WB_CODE like", value, "wbCode");
            return (Criteria) this;
        }

        public Criteria andWbCodeNotLike(String value) {
            addCriterion("WB_CODE not like", value, "wbCode");
            return (Criteria) this;
        }

        public Criteria andWbCodeIn(List<String> values) {
            addCriterion("WB_CODE in", values, "wbCode");
            return (Criteria) this;
        }

        public Criteria andWbCodeNotIn(List<String> values) {
            addCriterion("WB_CODE not in", values, "wbCode");
            return (Criteria) this;
        }

        public Criteria andWbCodeBetween(String value1, String value2) {
            addCriterion("WB_CODE between", value1, value2, "wbCode");
            return (Criteria) this;
        }

        public Criteria andWbCodeNotBetween(String value1, String value2) {
            addCriterion("WB_CODE not between", value1, value2, "wbCode");
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

        public Criteria andBloodCodeIsNull() {
            addCriterion("BLOOD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBloodCodeIsNotNull() {
            addCriterion("BLOOD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBloodCodeEqualTo(String value) {
            addCriterion("BLOOD_CODE =", value, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeNotEqualTo(String value) {
            addCriterion("BLOOD_CODE <>", value, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeGreaterThan(String value) {
            addCriterion("BLOOD_CODE >", value, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BLOOD_CODE >=", value, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeLessThan(String value) {
            addCriterion("BLOOD_CODE <", value, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeLessThanOrEqualTo(String value) {
            addCriterion("BLOOD_CODE <=", value, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeLike(String value) {
            addCriterion("BLOOD_CODE like", value, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeNotLike(String value) {
            addCriterion("BLOOD_CODE not like", value, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeIn(List<String> values) {
            addCriterion("BLOOD_CODE in", values, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeNotIn(List<String> values) {
            addCriterion("BLOOD_CODE not in", values, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeBetween(String value1, String value2) {
            addCriterion("BLOOD_CODE between", value1, value2, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andBloodCodeNotBetween(String value1, String value2) {
            addCriterion("BLOOD_CODE not between", value1, value2, "bloodCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeIsNull() {
            addCriterion("PROF_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProfCodeIsNotNull() {
            addCriterion("PROF_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProfCodeEqualTo(String value) {
            addCriterion("PROF_CODE =", value, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeNotEqualTo(String value) {
            addCriterion("PROF_CODE <>", value, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeGreaterThan(String value) {
            addCriterion("PROF_CODE >", value, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROF_CODE >=", value, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeLessThan(String value) {
            addCriterion("PROF_CODE <", value, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeLessThanOrEqualTo(String value) {
            addCriterion("PROF_CODE <=", value, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeLike(String value) {
            addCriterion("PROF_CODE like", value, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeNotLike(String value) {
            addCriterion("PROF_CODE not like", value, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeIn(List<String> values) {
            addCriterion("PROF_CODE in", values, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeNotIn(List<String> values) {
            addCriterion("PROF_CODE not in", values, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeBetween(String value1, String value2) {
            addCriterion("PROF_CODE between", value1, value2, "profCode");
            return (Criteria) this;
        }

        public Criteria andProfCodeNotBetween(String value1, String value2) {
            addCriterion("PROF_CODE not between", value1, value2, "profCode");
            return (Criteria) this;
        }

        public Criteria andWorkHomeIsNull() {
            addCriterion("WORK_HOME is null");
            return (Criteria) this;
        }

        public Criteria andWorkHomeIsNotNull() {
            addCriterion("WORK_HOME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkHomeEqualTo(String value) {
            addCriterion("WORK_HOME =", value, "workHome");
            return (Criteria) this;
        }

        public Criteria andWorkHomeNotEqualTo(String value) {
            addCriterion("WORK_HOME <>", value, "workHome");
            return (Criteria) this;
        }

        public Criteria andWorkHomeGreaterThan(String value) {
            addCriterion("WORK_HOME >", value, "workHome");
            return (Criteria) this;
        }

        public Criteria andWorkHomeGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_HOME >=", value, "workHome");
            return (Criteria) this;
        }

        public Criteria andWorkHomeLessThan(String value) {
            addCriterion("WORK_HOME <", value, "workHome");
            return (Criteria) this;
        }

        public Criteria andWorkHomeLessThanOrEqualTo(String value) {
            addCriterion("WORK_HOME <=", value, "workHome");
            return (Criteria) this;
        }

        public Criteria andWorkHomeLike(String value) {
            addCriterion("WORK_HOME like", value, "workHome");
            return (Criteria) this;
        }

        public Criteria andWorkHomeNotLike(String value) {
            addCriterion("WORK_HOME not like", value, "workHome");
            return (Criteria) this;
        }

        public Criteria andWorkHomeIn(List<String> values) {
            addCriterion("WORK_HOME in", values, "workHome");
            return (Criteria) this;
        }

        public Criteria andWorkHomeNotIn(List<String> values) {
            addCriterion("WORK_HOME not in", values, "workHome");
            return (Criteria) this;
        }

        public Criteria andWorkHomeBetween(String value1, String value2) {
            addCriterion("WORK_HOME between", value1, value2, "workHome");
            return (Criteria) this;
        }

        public Criteria andWorkHomeNotBetween(String value1, String value2) {
            addCriterion("WORK_HOME not between", value1, value2, "workHome");
            return (Criteria) this;
        }

        public Criteria andWorkTelIsNull() {
            addCriterion("WORK_TEL is null");
            return (Criteria) this;
        }

        public Criteria andWorkTelIsNotNull() {
            addCriterion("WORK_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTelEqualTo(String value) {
            addCriterion("WORK_TEL =", value, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelNotEqualTo(String value) {
            addCriterion("WORK_TEL <>", value, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelGreaterThan(String value) {
            addCriterion("WORK_TEL >", value, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_TEL >=", value, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelLessThan(String value) {
            addCriterion("WORK_TEL <", value, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelLessThanOrEqualTo(String value) {
            addCriterion("WORK_TEL <=", value, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelLike(String value) {
            addCriterion("WORK_TEL like", value, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelNotLike(String value) {
            addCriterion("WORK_TEL not like", value, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelIn(List<String> values) {
            addCriterion("WORK_TEL in", values, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelNotIn(List<String> values) {
            addCriterion("WORK_TEL not in", values, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelBetween(String value1, String value2) {
            addCriterion("WORK_TEL between", value1, value2, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkTelNotBetween(String value1, String value2) {
            addCriterion("WORK_TEL not between", value1, value2, "workTel");
            return (Criteria) this;
        }

        public Criteria andWorkZipIsNull() {
            addCriterion("WORK_ZIP is null");
            return (Criteria) this;
        }

        public Criteria andWorkZipIsNotNull() {
            addCriterion("WORK_ZIP is not null");
            return (Criteria) this;
        }

        public Criteria andWorkZipEqualTo(String value) {
            addCriterion("WORK_ZIP =", value, "workZip");
            return (Criteria) this;
        }

        public Criteria andWorkZipNotEqualTo(String value) {
            addCriterion("WORK_ZIP <>", value, "workZip");
            return (Criteria) this;
        }

        public Criteria andWorkZipGreaterThan(String value) {
            addCriterion("WORK_ZIP >", value, "workZip");
            return (Criteria) this;
        }

        public Criteria andWorkZipGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_ZIP >=", value, "workZip");
            return (Criteria) this;
        }

        public Criteria andWorkZipLessThan(String value) {
            addCriterion("WORK_ZIP <", value, "workZip");
            return (Criteria) this;
        }

        public Criteria andWorkZipLessThanOrEqualTo(String value) {
            addCriterion("WORK_ZIP <=", value, "workZip");
            return (Criteria) this;
        }

        public Criteria andWorkZipLike(String value) {
            addCriterion("WORK_ZIP like", value, "workZip");
            return (Criteria) this;
        }

        public Criteria andWorkZipNotLike(String value) {
            addCriterion("WORK_ZIP not like", value, "workZip");
            return (Criteria) this;
        }

        public Criteria andWorkZipIn(List<String> values) {
            addCriterion("WORK_ZIP in", values, "workZip");
            return (Criteria) this;
        }

        public Criteria andWorkZipNotIn(List<String> values) {
            addCriterion("WORK_ZIP not in", values, "workZip");
            return (Criteria) this;
        }

        public Criteria andWorkZipBetween(String value1, String value2) {
            addCriterion("WORK_ZIP between", value1, value2, "workZip");
            return (Criteria) this;
        }

        public Criteria andWorkZipNotBetween(String value1, String value2) {
            addCriterion("WORK_ZIP not between", value1, value2, "workZip");
            return (Criteria) this;
        }

        public Criteria andHomeIsNull() {
            addCriterion("HOME is null");
            return (Criteria) this;
        }

        public Criteria andHomeIsNotNull() {
            addCriterion("HOME is not null");
            return (Criteria) this;
        }

        public Criteria andHomeEqualTo(String value) {
            addCriterion("HOME =", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeNotEqualTo(String value) {
            addCriterion("HOME <>", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeGreaterThan(String value) {
            addCriterion("HOME >", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeGreaterThanOrEqualTo(String value) {
            addCriterion("HOME >=", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeLessThan(String value) {
            addCriterion("HOME <", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeLessThanOrEqualTo(String value) {
            addCriterion("HOME <=", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeLike(String value) {
            addCriterion("HOME like", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeNotLike(String value) {
            addCriterion("HOME not like", value, "home");
            return (Criteria) this;
        }

        public Criteria andHomeIn(List<String> values) {
            addCriterion("HOME in", values, "home");
            return (Criteria) this;
        }

        public Criteria andHomeNotIn(List<String> values) {
            addCriterion("HOME not in", values, "home");
            return (Criteria) this;
        }

        public Criteria andHomeBetween(String value1, String value2) {
            addCriterion("HOME between", value1, value2, "home");
            return (Criteria) this;
        }

        public Criteria andHomeNotBetween(String value1, String value2) {
            addCriterion("HOME not between", value1, value2, "home");
            return (Criteria) this;
        }

        public Criteria andHomeTelIsNull() {
            addCriterion("HOME_TEL is null");
            return (Criteria) this;
        }

        public Criteria andHomeTelIsNotNull() {
            addCriterion("HOME_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andHomeTelEqualTo(String value) {
            addCriterion("HOME_TEL =", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelNotEqualTo(String value) {
            addCriterion("HOME_TEL <>", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelGreaterThan(String value) {
            addCriterion("HOME_TEL >", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_TEL >=", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelLessThan(String value) {
            addCriterion("HOME_TEL <", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelLessThanOrEqualTo(String value) {
            addCriterion("HOME_TEL <=", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelLike(String value) {
            addCriterion("HOME_TEL like", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelNotLike(String value) {
            addCriterion("HOME_TEL not like", value, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelIn(List<String> values) {
            addCriterion("HOME_TEL in", values, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelNotIn(List<String> values) {
            addCriterion("HOME_TEL not in", values, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelBetween(String value1, String value2) {
            addCriterion("HOME_TEL between", value1, value2, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeTelNotBetween(String value1, String value2) {
            addCriterion("HOME_TEL not between", value1, value2, "homeTel");
            return (Criteria) this;
        }

        public Criteria andHomeZipIsNull() {
            addCriterion("HOME_ZIP is null");
            return (Criteria) this;
        }

        public Criteria andHomeZipIsNotNull() {
            addCriterion("HOME_ZIP is not null");
            return (Criteria) this;
        }

        public Criteria andHomeZipEqualTo(String value) {
            addCriterion("HOME_ZIP =", value, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipNotEqualTo(String value) {
            addCriterion("HOME_ZIP <>", value, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipGreaterThan(String value) {
            addCriterion("HOME_ZIP >", value, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_ZIP >=", value, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipLessThan(String value) {
            addCriterion("HOME_ZIP <", value, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipLessThanOrEqualTo(String value) {
            addCriterion("HOME_ZIP <=", value, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipLike(String value) {
            addCriterion("HOME_ZIP like", value, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipNotLike(String value) {
            addCriterion("HOME_ZIP not like", value, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipIn(List<String> values) {
            addCriterion("HOME_ZIP in", values, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipNotIn(List<String> values) {
            addCriterion("HOME_ZIP not in", values, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipBetween(String value1, String value2) {
            addCriterion("HOME_ZIP between", value1, value2, "homeZip");
            return (Criteria) this;
        }

        public Criteria andHomeZipNotBetween(String value1, String value2) {
            addCriterion("HOME_ZIP not between", value1, value2, "homeZip");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("DISTRICT is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("DISTRICT is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("DISTRICT =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("DISTRICT <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("DISTRICT >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRICT >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("DISTRICT <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("DISTRICT <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("DISTRICT like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("DISTRICT not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("DISTRICT in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("DISTRICT not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("DISTRICT between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("DISTRICT not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andNationCodeIsNull() {
            addCriterion("NATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andNationCodeIsNotNull() {
            addCriterion("NATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andNationCodeEqualTo(String value) {
            addCriterion("NATION_CODE =", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotEqualTo(String value) {
            addCriterion("NATION_CODE <>", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeGreaterThan(String value) {
            addCriterion("NATION_CODE >", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("NATION_CODE >=", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeLessThan(String value) {
            addCriterion("NATION_CODE <", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeLessThanOrEqualTo(String value) {
            addCriterion("NATION_CODE <=", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeLike(String value) {
            addCriterion("NATION_CODE like", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotLike(String value) {
            addCriterion("NATION_CODE not like", value, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeIn(List<String> values) {
            addCriterion("NATION_CODE in", values, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotIn(List<String> values) {
            addCriterion("NATION_CODE not in", values, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeBetween(String value1, String value2) {
            addCriterion("NATION_CODE between", value1, value2, "nationCode");
            return (Criteria) this;
        }

        public Criteria andNationCodeNotBetween(String value1, String value2) {
            addCriterion("NATION_CODE not between", value1, value2, "nationCode");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameIsNull() {
            addCriterion("LINKMAN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameIsNotNull() {
            addCriterion("LINKMAN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameEqualTo(String value) {
            addCriterion("LINKMAN_NAME =", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameNotEqualTo(String value) {
            addCriterion("LINKMAN_NAME <>", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameGreaterThan(String value) {
            addCriterion("LINKMAN_NAME >", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_NAME >=", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameLessThan(String value) {
            addCriterion("LINKMAN_NAME <", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_NAME <=", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameLike(String value) {
            addCriterion("LINKMAN_NAME like", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameNotLike(String value) {
            addCriterion("LINKMAN_NAME not like", value, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameIn(List<String> values) {
            addCriterion("LINKMAN_NAME in", values, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameNotIn(List<String> values) {
            addCriterion("LINKMAN_NAME not in", values, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameBetween(String value1, String value2) {
            addCriterion("LINKMAN_NAME between", value1, value2, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanNameNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_NAME not between", value1, value2, "linkmanName");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelIsNull() {
            addCriterion("LINKMAN_TEL is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelIsNotNull() {
            addCriterion("LINKMAN_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelEqualTo(String value) {
            addCriterion("LINKMAN_TEL =", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelNotEqualTo(String value) {
            addCriterion("LINKMAN_TEL <>", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelGreaterThan(String value) {
            addCriterion("LINKMAN_TEL >", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_TEL >=", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelLessThan(String value) {
            addCriterion("LINKMAN_TEL <", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_TEL <=", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelLike(String value) {
            addCriterion("LINKMAN_TEL like", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelNotLike(String value) {
            addCriterion("LINKMAN_TEL not like", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelIn(List<String> values) {
            addCriterion("LINKMAN_TEL in", values, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelNotIn(List<String> values) {
            addCriterion("LINKMAN_TEL not in", values, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelBetween(String value1, String value2) {
            addCriterion("LINKMAN_TEL between", value1, value2, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_TEL not between", value1, value2, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanAddIsNull() {
            addCriterion("LINKMAN_ADD is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanAddIsNotNull() {
            addCriterion("LINKMAN_ADD is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanAddEqualTo(String value) {
            addCriterion("LINKMAN_ADD =", value, "linkmanAdd");
            return (Criteria) this;
        }

        public Criteria andLinkmanAddNotEqualTo(String value) {
            addCriterion("LINKMAN_ADD <>", value, "linkmanAdd");
            return (Criteria) this;
        }

        public Criteria andLinkmanAddGreaterThan(String value) {
            addCriterion("LINKMAN_ADD >", value, "linkmanAdd");
            return (Criteria) this;
        }

        public Criteria andLinkmanAddGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_ADD >=", value, "linkmanAdd");
            return (Criteria) this;
        }

        public Criteria andLinkmanAddLessThan(String value) {
            addCriterion("LINKMAN_ADD <", value, "linkmanAdd");
            return (Criteria) this;
        }

        public Criteria andLinkmanAddLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_ADD <=", value, "linkmanAdd");
            return (Criteria) this;
        }

        public Criteria andLinkmanAddLike(String value) {
            addCriterion("LINKMAN_ADD like", value, "linkmanAdd");
            return (Criteria) this;
        }

        public Criteria andLinkmanAddNotLike(String value) {
            addCriterion("LINKMAN_ADD not like", value, "linkmanAdd");
            return (Criteria) this;
        }

        public Criteria andLinkmanAddIn(List<String> values) {
            addCriterion("LINKMAN_ADD in", values, "linkmanAdd");
            return (Criteria) this;
        }

        public Criteria andLinkmanAddNotIn(List<String> values) {
            addCriterion("LINKMAN_ADD not in", values, "linkmanAdd");
            return (Criteria) this;
        }

        public Criteria andLinkmanAddBetween(String value1, String value2) {
            addCriterion("LINKMAN_ADD between", value1, value2, "linkmanAdd");
            return (Criteria) this;
        }

        public Criteria andLinkmanAddNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_ADD not between", value1, value2, "linkmanAdd");
            return (Criteria) this;
        }

        public Criteria andRelaCodeIsNull() {
            addCriterion("RELA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRelaCodeIsNotNull() {
            addCriterion("RELA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRelaCodeEqualTo(String value) {
            addCriterion("RELA_CODE =", value, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeNotEqualTo(String value) {
            addCriterion("RELA_CODE <>", value, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeGreaterThan(String value) {
            addCriterion("RELA_CODE >", value, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RELA_CODE >=", value, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeLessThan(String value) {
            addCriterion("RELA_CODE <", value, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeLessThanOrEqualTo(String value) {
            addCriterion("RELA_CODE <=", value, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeLike(String value) {
            addCriterion("RELA_CODE like", value, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeNotLike(String value) {
            addCriterion("RELA_CODE not like", value, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeIn(List<String> values) {
            addCriterion("RELA_CODE in", values, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeNotIn(List<String> values) {
            addCriterion("RELA_CODE not in", values, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeBetween(String value1, String value2) {
            addCriterion("RELA_CODE between", value1, value2, "relaCode");
            return (Criteria) this;
        }

        public Criteria andRelaCodeNotBetween(String value1, String value2) {
            addCriterion("RELA_CODE not between", value1, value2, "relaCode");
            return (Criteria) this;
        }

        public Criteria andMariIsNull() {
            addCriterion("MARI is null");
            return (Criteria) this;
        }

        public Criteria andMariIsNotNull() {
            addCriterion("MARI is not null");
            return (Criteria) this;
        }

        public Criteria andMariEqualTo(String value) {
            addCriterion("MARI =", value, "mari");
            return (Criteria) this;
        }

        public Criteria andMariNotEqualTo(String value) {
            addCriterion("MARI <>", value, "mari");
            return (Criteria) this;
        }

        public Criteria andMariGreaterThan(String value) {
            addCriterion("MARI >", value, "mari");
            return (Criteria) this;
        }

        public Criteria andMariGreaterThanOrEqualTo(String value) {
            addCriterion("MARI >=", value, "mari");
            return (Criteria) this;
        }

        public Criteria andMariLessThan(String value) {
            addCriterion("MARI <", value, "mari");
            return (Criteria) this;
        }

        public Criteria andMariLessThanOrEqualTo(String value) {
            addCriterion("MARI <=", value, "mari");
            return (Criteria) this;
        }

        public Criteria andMariLike(String value) {
            addCriterion("MARI like", value, "mari");
            return (Criteria) this;
        }

        public Criteria andMariNotLike(String value) {
            addCriterion("MARI not like", value, "mari");
            return (Criteria) this;
        }

        public Criteria andMariIn(List<String> values) {
            addCriterion("MARI in", values, "mari");
            return (Criteria) this;
        }

        public Criteria andMariNotIn(List<String> values) {
            addCriterion("MARI not in", values, "mari");
            return (Criteria) this;
        }

        public Criteria andMariBetween(String value1, String value2) {
            addCriterion("MARI between", value1, value2, "mari");
            return (Criteria) this;
        }

        public Criteria andMariNotBetween(String value1, String value2) {
            addCriterion("MARI not between", value1, value2, "mari");
            return (Criteria) this;
        }

        public Criteria andCounCodeIsNull() {
            addCriterion("COUN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCounCodeIsNotNull() {
            addCriterion("COUN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCounCodeEqualTo(String value) {
            addCriterion("COUN_CODE =", value, "counCode");
            return (Criteria) this;
        }

        public Criteria andCounCodeNotEqualTo(String value) {
            addCriterion("COUN_CODE <>", value, "counCode");
            return (Criteria) this;
        }

        public Criteria andCounCodeGreaterThan(String value) {
            addCriterion("COUN_CODE >", value, "counCode");
            return (Criteria) this;
        }

        public Criteria andCounCodeGreaterThanOrEqualTo(String value) {
            addCriterion("COUN_CODE >=", value, "counCode");
            return (Criteria) this;
        }

        public Criteria andCounCodeLessThan(String value) {
            addCriterion("COUN_CODE <", value, "counCode");
            return (Criteria) this;
        }

        public Criteria andCounCodeLessThanOrEqualTo(String value) {
            addCriterion("COUN_CODE <=", value, "counCode");
            return (Criteria) this;
        }

        public Criteria andCounCodeLike(String value) {
            addCriterion("COUN_CODE like", value, "counCode");
            return (Criteria) this;
        }

        public Criteria andCounCodeNotLike(String value) {
            addCriterion("COUN_CODE not like", value, "counCode");
            return (Criteria) this;
        }

        public Criteria andCounCodeIn(List<String> values) {
            addCriterion("COUN_CODE in", values, "counCode");
            return (Criteria) this;
        }

        public Criteria andCounCodeNotIn(List<String> values) {
            addCriterion("COUN_CODE not in", values, "counCode");
            return (Criteria) this;
        }

        public Criteria andCounCodeBetween(String value1, String value2) {
            addCriterion("COUN_CODE between", value1, value2, "counCode");
            return (Criteria) this;
        }

        public Criteria andCounCodeNotBetween(String value1, String value2) {
            addCriterion("COUN_CODE not between", value1, value2, "counCode");
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

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andFramtIsNull() {
            addCriterion("FRAMT is null");
            return (Criteria) this;
        }

        public Criteria andFramtIsNotNull() {
            addCriterion("FRAMT is not null");
            return (Criteria) this;
        }

        public Criteria andFramtEqualTo(BigDecimal value) {
            addCriterion("FRAMT =", value, "framt");
            return (Criteria) this;
        }

        public Criteria andFramtNotEqualTo(BigDecimal value) {
            addCriterion("FRAMT <>", value, "framt");
            return (Criteria) this;
        }

        public Criteria andFramtGreaterThan(BigDecimal value) {
            addCriterion("FRAMT >", value, "framt");
            return (Criteria) this;
        }

        public Criteria andFramtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FRAMT >=", value, "framt");
            return (Criteria) this;
        }

        public Criteria andFramtLessThan(BigDecimal value) {
            addCriterion("FRAMT <", value, "framt");
            return (Criteria) this;
        }

        public Criteria andFramtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FRAMT <=", value, "framt");
            return (Criteria) this;
        }

        public Criteria andFramtIn(List<BigDecimal> values) {
            addCriterion("FRAMT in", values, "framt");
            return (Criteria) this;
        }

        public Criteria andFramtNotIn(List<BigDecimal> values) {
            addCriterion("FRAMT not in", values, "framt");
            return (Criteria) this;
        }

        public Criteria andFramtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FRAMT between", value1, value2, "framt");
            return (Criteria) this;
        }

        public Criteria andFramtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FRAMT not between", value1, value2, "framt");
            return (Criteria) this;
        }

        public Criteria andAnaphyFlagIsNull() {
            addCriterion("ANAPHY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andAnaphyFlagIsNotNull() {
            addCriterion("ANAPHY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andAnaphyFlagEqualTo(String value) {
            addCriterion("ANAPHY_FLAG =", value, "anaphyFlag");
            return (Criteria) this;
        }

        public Criteria andAnaphyFlagNotEqualTo(String value) {
            addCriterion("ANAPHY_FLAG <>", value, "anaphyFlag");
            return (Criteria) this;
        }

        public Criteria andAnaphyFlagGreaterThan(String value) {
            addCriterion("ANAPHY_FLAG >", value, "anaphyFlag");
            return (Criteria) this;
        }

        public Criteria andAnaphyFlagGreaterThanOrEqualTo(String value) {
            addCriterion("ANAPHY_FLAG >=", value, "anaphyFlag");
            return (Criteria) this;
        }

        public Criteria andAnaphyFlagLessThan(String value) {
            addCriterion("ANAPHY_FLAG <", value, "anaphyFlag");
            return (Criteria) this;
        }

        public Criteria andAnaphyFlagLessThanOrEqualTo(String value) {
            addCriterion("ANAPHY_FLAG <=", value, "anaphyFlag");
            return (Criteria) this;
        }

        public Criteria andAnaphyFlagLike(String value) {
            addCriterion("ANAPHY_FLAG like", value, "anaphyFlag");
            return (Criteria) this;
        }

        public Criteria andAnaphyFlagNotLike(String value) {
            addCriterion("ANAPHY_FLAG not like", value, "anaphyFlag");
            return (Criteria) this;
        }

        public Criteria andAnaphyFlagIn(List<String> values) {
            addCriterion("ANAPHY_FLAG in", values, "anaphyFlag");
            return (Criteria) this;
        }

        public Criteria andAnaphyFlagNotIn(List<String> values) {
            addCriterion("ANAPHY_FLAG not in", values, "anaphyFlag");
            return (Criteria) this;
        }

        public Criteria andAnaphyFlagBetween(String value1, String value2) {
            addCriterion("ANAPHY_FLAG between", value1, value2, "anaphyFlag");
            return (Criteria) this;
        }

        public Criteria andAnaphyFlagNotBetween(String value1, String value2) {
            addCriterion("ANAPHY_FLAG not between", value1, value2, "anaphyFlag");
            return (Criteria) this;
        }

        public Criteria andHepatitisFlagIsNull() {
            addCriterion("HEPATITIS_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andHepatitisFlagIsNotNull() {
            addCriterion("HEPATITIS_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andHepatitisFlagEqualTo(String value) {
            addCriterion("HEPATITIS_FLAG =", value, "hepatitisFlag");
            return (Criteria) this;
        }

        public Criteria andHepatitisFlagNotEqualTo(String value) {
            addCriterion("HEPATITIS_FLAG <>", value, "hepatitisFlag");
            return (Criteria) this;
        }

        public Criteria andHepatitisFlagGreaterThan(String value) {
            addCriterion("HEPATITIS_FLAG >", value, "hepatitisFlag");
            return (Criteria) this;
        }

        public Criteria andHepatitisFlagGreaterThanOrEqualTo(String value) {
            addCriterion("HEPATITIS_FLAG >=", value, "hepatitisFlag");
            return (Criteria) this;
        }

        public Criteria andHepatitisFlagLessThan(String value) {
            addCriterion("HEPATITIS_FLAG <", value, "hepatitisFlag");
            return (Criteria) this;
        }

        public Criteria andHepatitisFlagLessThanOrEqualTo(String value) {
            addCriterion("HEPATITIS_FLAG <=", value, "hepatitisFlag");
            return (Criteria) this;
        }

        public Criteria andHepatitisFlagLike(String value) {
            addCriterion("HEPATITIS_FLAG like", value, "hepatitisFlag");
            return (Criteria) this;
        }

        public Criteria andHepatitisFlagNotLike(String value) {
            addCriterion("HEPATITIS_FLAG not like", value, "hepatitisFlag");
            return (Criteria) this;
        }

        public Criteria andHepatitisFlagIn(List<String> values) {
            addCriterion("HEPATITIS_FLAG in", values, "hepatitisFlag");
            return (Criteria) this;
        }

        public Criteria andHepatitisFlagNotIn(List<String> values) {
            addCriterion("HEPATITIS_FLAG not in", values, "hepatitisFlag");
            return (Criteria) this;
        }

        public Criteria andHepatitisFlagBetween(String value1, String value2) {
            addCriterion("HEPATITIS_FLAG between", value1, value2, "hepatitisFlag");
            return (Criteria) this;
        }

        public Criteria andHepatitisFlagNotBetween(String value1, String value2) {
            addCriterion("HEPATITIS_FLAG not between", value1, value2, "hepatitisFlag");
            return (Criteria) this;
        }

        public Criteria andActCodeIsNull() {
            addCriterion("ACT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andActCodeIsNotNull() {
            addCriterion("ACT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andActCodeEqualTo(String value) {
            addCriterion("ACT_CODE =", value, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeNotEqualTo(String value) {
            addCriterion("ACT_CODE <>", value, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeGreaterThan(String value) {
            addCriterion("ACT_CODE >", value, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_CODE >=", value, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeLessThan(String value) {
            addCriterion("ACT_CODE <", value, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeLessThanOrEqualTo(String value) {
            addCriterion("ACT_CODE <=", value, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeLike(String value) {
            addCriterion("ACT_CODE like", value, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeNotLike(String value) {
            addCriterion("ACT_CODE not like", value, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeIn(List<String> values) {
            addCriterion("ACT_CODE in", values, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeNotIn(List<String> values) {
            addCriterion("ACT_CODE not in", values, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeBetween(String value1, String value2) {
            addCriterion("ACT_CODE between", value1, value2, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeNotBetween(String value1, String value2) {
            addCriterion("ACT_CODE not between", value1, value2, "actCode");
            return (Criteria) this;
        }

        public Criteria andActAmtIsNull() {
            addCriterion("ACT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andActAmtIsNotNull() {
            addCriterion("ACT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andActAmtEqualTo(BigDecimal value) {
            addCriterion("ACT_AMT =", value, "actAmt");
            return (Criteria) this;
        }

        public Criteria andActAmtNotEqualTo(BigDecimal value) {
            addCriterion("ACT_AMT <>", value, "actAmt");
            return (Criteria) this;
        }

        public Criteria andActAmtGreaterThan(BigDecimal value) {
            addCriterion("ACT_AMT >", value, "actAmt");
            return (Criteria) this;
        }

        public Criteria andActAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACT_AMT >=", value, "actAmt");
            return (Criteria) this;
        }

        public Criteria andActAmtLessThan(BigDecimal value) {
            addCriterion("ACT_AMT <", value, "actAmt");
            return (Criteria) this;
        }

        public Criteria andActAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACT_AMT <=", value, "actAmt");
            return (Criteria) this;
        }

        public Criteria andActAmtIn(List<BigDecimal> values) {
            addCriterion("ACT_AMT in", values, "actAmt");
            return (Criteria) this;
        }

        public Criteria andActAmtNotIn(List<BigDecimal> values) {
            addCriterion("ACT_AMT not in", values, "actAmt");
            return (Criteria) this;
        }

        public Criteria andActAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACT_AMT between", value1, value2, "actAmt");
            return (Criteria) this;
        }

        public Criteria andActAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACT_AMT not between", value1, value2, "actAmt");
            return (Criteria) this;
        }

        public Criteria andLactSumIsNull() {
            addCriterion("LACT_SUM is null");
            return (Criteria) this;
        }

        public Criteria andLactSumIsNotNull() {
            addCriterion("LACT_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andLactSumEqualTo(BigDecimal value) {
            addCriterion("LACT_SUM =", value, "lactSum");
            return (Criteria) this;
        }

        public Criteria andLactSumNotEqualTo(BigDecimal value) {
            addCriterion("LACT_SUM <>", value, "lactSum");
            return (Criteria) this;
        }

        public Criteria andLactSumGreaterThan(BigDecimal value) {
            addCriterion("LACT_SUM >", value, "lactSum");
            return (Criteria) this;
        }

        public Criteria andLactSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LACT_SUM >=", value, "lactSum");
            return (Criteria) this;
        }

        public Criteria andLactSumLessThan(BigDecimal value) {
            addCriterion("LACT_SUM <", value, "lactSum");
            return (Criteria) this;
        }

        public Criteria andLactSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LACT_SUM <=", value, "lactSum");
            return (Criteria) this;
        }

        public Criteria andLactSumIn(List<BigDecimal> values) {
            addCriterion("LACT_SUM in", values, "lactSum");
            return (Criteria) this;
        }

        public Criteria andLactSumNotIn(List<BigDecimal> values) {
            addCriterion("LACT_SUM not in", values, "lactSum");
            return (Criteria) this;
        }

        public Criteria andLactSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LACT_SUM between", value1, value2, "lactSum");
            return (Criteria) this;
        }

        public Criteria andLactSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LACT_SUM not between", value1, value2, "lactSum");
            return (Criteria) this;
        }

        public Criteria andLbankSumIsNull() {
            addCriterion("LBANK_SUM is null");
            return (Criteria) this;
        }

        public Criteria andLbankSumIsNotNull() {
            addCriterion("LBANK_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andLbankSumEqualTo(BigDecimal value) {
            addCriterion("LBANK_SUM =", value, "lbankSum");
            return (Criteria) this;
        }

        public Criteria andLbankSumNotEqualTo(BigDecimal value) {
            addCriterion("LBANK_SUM <>", value, "lbankSum");
            return (Criteria) this;
        }

        public Criteria andLbankSumGreaterThan(BigDecimal value) {
            addCriterion("LBANK_SUM >", value, "lbankSum");
            return (Criteria) this;
        }

        public Criteria andLbankSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LBANK_SUM >=", value, "lbankSum");
            return (Criteria) this;
        }

        public Criteria andLbankSumLessThan(BigDecimal value) {
            addCriterion("LBANK_SUM <", value, "lbankSum");
            return (Criteria) this;
        }

        public Criteria andLbankSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LBANK_SUM <=", value, "lbankSum");
            return (Criteria) this;
        }

        public Criteria andLbankSumIn(List<BigDecimal> values) {
            addCriterion("LBANK_SUM in", values, "lbankSum");
            return (Criteria) this;
        }

        public Criteria andLbankSumNotIn(List<BigDecimal> values) {
            addCriterion("LBANK_SUM not in", values, "lbankSum");
            return (Criteria) this;
        }

        public Criteria andLbankSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LBANK_SUM between", value1, value2, "lbankSum");
            return (Criteria) this;
        }

        public Criteria andLbankSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LBANK_SUM not between", value1, value2, "lbankSum");
            return (Criteria) this;
        }

        public Criteria andArrearTimesIsNull() {
            addCriterion("ARREAR_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andArrearTimesIsNotNull() {
            addCriterion("ARREAR_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andArrearTimesEqualTo(Short value) {
            addCriterion("ARREAR_TIMES =", value, "arrearTimes");
            return (Criteria) this;
        }

        public Criteria andArrearTimesNotEqualTo(Short value) {
            addCriterion("ARREAR_TIMES <>", value, "arrearTimes");
            return (Criteria) this;
        }

        public Criteria andArrearTimesGreaterThan(Short value) {
            addCriterion("ARREAR_TIMES >", value, "arrearTimes");
            return (Criteria) this;
        }

        public Criteria andArrearTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("ARREAR_TIMES >=", value, "arrearTimes");
            return (Criteria) this;
        }

        public Criteria andArrearTimesLessThan(Short value) {
            addCriterion("ARREAR_TIMES <", value, "arrearTimes");
            return (Criteria) this;
        }

        public Criteria andArrearTimesLessThanOrEqualTo(Short value) {
            addCriterion("ARREAR_TIMES <=", value, "arrearTimes");
            return (Criteria) this;
        }

        public Criteria andArrearTimesIn(List<Short> values) {
            addCriterion("ARREAR_TIMES in", values, "arrearTimes");
            return (Criteria) this;
        }

        public Criteria andArrearTimesNotIn(List<Short> values) {
            addCriterion("ARREAR_TIMES not in", values, "arrearTimes");
            return (Criteria) this;
        }

        public Criteria andArrearTimesBetween(Short value1, Short value2) {
            addCriterion("ARREAR_TIMES between", value1, value2, "arrearTimes");
            return (Criteria) this;
        }

        public Criteria andArrearTimesNotBetween(Short value1, Short value2) {
            addCriterion("ARREAR_TIMES not between", value1, value2, "arrearTimes");
            return (Criteria) this;
        }

        public Criteria andArrearSumIsNull() {
            addCriterion("ARREAR_SUM is null");
            return (Criteria) this;
        }

        public Criteria andArrearSumIsNotNull() {
            addCriterion("ARREAR_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andArrearSumEqualTo(BigDecimal value) {
            addCriterion("ARREAR_SUM =", value, "arrearSum");
            return (Criteria) this;
        }

        public Criteria andArrearSumNotEqualTo(BigDecimal value) {
            addCriterion("ARREAR_SUM <>", value, "arrearSum");
            return (Criteria) this;
        }

        public Criteria andArrearSumGreaterThan(BigDecimal value) {
            addCriterion("ARREAR_SUM >", value, "arrearSum");
            return (Criteria) this;
        }

        public Criteria andArrearSumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ARREAR_SUM >=", value, "arrearSum");
            return (Criteria) this;
        }

        public Criteria andArrearSumLessThan(BigDecimal value) {
            addCriterion("ARREAR_SUM <", value, "arrearSum");
            return (Criteria) this;
        }

        public Criteria andArrearSumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ARREAR_SUM <=", value, "arrearSum");
            return (Criteria) this;
        }

        public Criteria andArrearSumIn(List<BigDecimal> values) {
            addCriterion("ARREAR_SUM in", values, "arrearSum");
            return (Criteria) this;
        }

        public Criteria andArrearSumNotIn(List<BigDecimal> values) {
            addCriterion("ARREAR_SUM not in", values, "arrearSum");
            return (Criteria) this;
        }

        public Criteria andArrearSumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ARREAR_SUM between", value1, value2, "arrearSum");
            return (Criteria) this;
        }

        public Criteria andArrearSumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ARREAR_SUM not between", value1, value2, "arrearSum");
            return (Criteria) this;
        }

        public Criteria andInhosSourceIsNull() {
            addCriterion("INHOS_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andInhosSourceIsNotNull() {
            addCriterion("INHOS_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andInhosSourceEqualTo(String value) {
            addCriterion("INHOS_SOURCE =", value, "inhosSource");
            return (Criteria) this;
        }

        public Criteria andInhosSourceNotEqualTo(String value) {
            addCriterion("INHOS_SOURCE <>", value, "inhosSource");
            return (Criteria) this;
        }

        public Criteria andInhosSourceGreaterThan(String value) {
            addCriterion("INHOS_SOURCE >", value, "inhosSource");
            return (Criteria) this;
        }

        public Criteria andInhosSourceGreaterThanOrEqualTo(String value) {
            addCriterion("INHOS_SOURCE >=", value, "inhosSource");
            return (Criteria) this;
        }

        public Criteria andInhosSourceLessThan(String value) {
            addCriterion("INHOS_SOURCE <", value, "inhosSource");
            return (Criteria) this;
        }

        public Criteria andInhosSourceLessThanOrEqualTo(String value) {
            addCriterion("INHOS_SOURCE <=", value, "inhosSource");
            return (Criteria) this;
        }

        public Criteria andInhosSourceLike(String value) {
            addCriterion("INHOS_SOURCE like", value, "inhosSource");
            return (Criteria) this;
        }

        public Criteria andInhosSourceNotLike(String value) {
            addCriterion("INHOS_SOURCE not like", value, "inhosSource");
            return (Criteria) this;
        }

        public Criteria andInhosSourceIn(List<String> values) {
            addCriterion("INHOS_SOURCE in", values, "inhosSource");
            return (Criteria) this;
        }

        public Criteria andInhosSourceNotIn(List<String> values) {
            addCriterion("INHOS_SOURCE not in", values, "inhosSource");
            return (Criteria) this;
        }

        public Criteria andInhosSourceBetween(String value1, String value2) {
            addCriterion("INHOS_SOURCE between", value1, value2, "inhosSource");
            return (Criteria) this;
        }

        public Criteria andInhosSourceNotBetween(String value1, String value2) {
            addCriterion("INHOS_SOURCE not between", value1, value2, "inhosSource");
            return (Criteria) this;
        }

        public Criteria andLihosDateIsNull() {
            addCriterion("LIHOS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLihosDateIsNotNull() {
            addCriterion("LIHOS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLihosDateEqualTo(Date value) {
            addCriterion("LIHOS_DATE =", value, "lihosDate");
            return (Criteria) this;
        }

        public Criteria andLihosDateNotEqualTo(Date value) {
            addCriterion("LIHOS_DATE <>", value, "lihosDate");
            return (Criteria) this;
        }

        public Criteria andLihosDateGreaterThan(Date value) {
            addCriterion("LIHOS_DATE >", value, "lihosDate");
            return (Criteria) this;
        }

        public Criteria andLihosDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LIHOS_DATE >=", value, "lihosDate");
            return (Criteria) this;
        }

        public Criteria andLihosDateLessThan(Date value) {
            addCriterion("LIHOS_DATE <", value, "lihosDate");
            return (Criteria) this;
        }

        public Criteria andLihosDateLessThanOrEqualTo(Date value) {
            addCriterion("LIHOS_DATE <=", value, "lihosDate");
            return (Criteria) this;
        }

        public Criteria andLihosDateIn(List<Date> values) {
            addCriterion("LIHOS_DATE in", values, "lihosDate");
            return (Criteria) this;
        }

        public Criteria andLihosDateNotIn(List<Date> values) {
            addCriterion("LIHOS_DATE not in", values, "lihosDate");
            return (Criteria) this;
        }

        public Criteria andLihosDateBetween(Date value1, Date value2) {
            addCriterion("LIHOS_DATE between", value1, value2, "lihosDate");
            return (Criteria) this;
        }

        public Criteria andLihosDateNotBetween(Date value1, Date value2) {
            addCriterion("LIHOS_DATE not between", value1, value2, "lihosDate");
            return (Criteria) this;
        }

        public Criteria andInhosTimesIsNull() {
            addCriterion("INHOS_TIMES is null");
            return (Criteria) this;
        }

        public Criteria andInhosTimesIsNotNull() {
            addCriterion("INHOS_TIMES is not null");
            return (Criteria) this;
        }

        public Criteria andInhosTimesEqualTo(Short value) {
            addCriterion("INHOS_TIMES =", value, "inhosTimes");
            return (Criteria) this;
        }

        public Criteria andInhosTimesNotEqualTo(Short value) {
            addCriterion("INHOS_TIMES <>", value, "inhosTimes");
            return (Criteria) this;
        }

        public Criteria andInhosTimesGreaterThan(Short value) {
            addCriterion("INHOS_TIMES >", value, "inhosTimes");
            return (Criteria) this;
        }

        public Criteria andInhosTimesGreaterThanOrEqualTo(Short value) {
            addCriterion("INHOS_TIMES >=", value, "inhosTimes");
            return (Criteria) this;
        }

        public Criteria andInhosTimesLessThan(Short value) {
            addCriterion("INHOS_TIMES <", value, "inhosTimes");
            return (Criteria) this;
        }

        public Criteria andInhosTimesLessThanOrEqualTo(Short value) {
            addCriterion("INHOS_TIMES <=", value, "inhosTimes");
            return (Criteria) this;
        }

        public Criteria andInhosTimesIn(List<Short> values) {
            addCriterion("INHOS_TIMES in", values, "inhosTimes");
            return (Criteria) this;
        }

        public Criteria andInhosTimesNotIn(List<Short> values) {
            addCriterion("INHOS_TIMES not in", values, "inhosTimes");
            return (Criteria) this;
        }

        public Criteria andInhosTimesBetween(Short value1, Short value2) {
            addCriterion("INHOS_TIMES between", value1, value2, "inhosTimes");
            return (Criteria) this;
        }

        public Criteria andInhosTimesNotBetween(Short value1, Short value2) {
            addCriterion("INHOS_TIMES not between", value1, value2, "inhosTimes");
            return (Criteria) this;
        }

        public Criteria andLouthosDateIsNull() {
            addCriterion("LOUTHOS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLouthosDateIsNotNull() {
            addCriterion("LOUTHOS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLouthosDateEqualTo(Date value) {
            addCriterion("LOUTHOS_DATE =", value, "louthosDate");
            return (Criteria) this;
        }

        public Criteria andLouthosDateNotEqualTo(Date value) {
            addCriterion("LOUTHOS_DATE <>", value, "louthosDate");
            return (Criteria) this;
        }

        public Criteria andLouthosDateGreaterThan(Date value) {
            addCriterion("LOUTHOS_DATE >", value, "louthosDate");
            return (Criteria) this;
        }

        public Criteria andLouthosDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LOUTHOS_DATE >=", value, "louthosDate");
            return (Criteria) this;
        }

        public Criteria andLouthosDateLessThan(Date value) {
            addCriterion("LOUTHOS_DATE <", value, "louthosDate");
            return (Criteria) this;
        }

        public Criteria andLouthosDateLessThanOrEqualTo(Date value) {
            addCriterion("LOUTHOS_DATE <=", value, "louthosDate");
            return (Criteria) this;
        }

        public Criteria andLouthosDateIn(List<Date> values) {
            addCriterion("LOUTHOS_DATE in", values, "louthosDate");
            return (Criteria) this;
        }

        public Criteria andLouthosDateNotIn(List<Date> values) {
            addCriterion("LOUTHOS_DATE not in", values, "louthosDate");
            return (Criteria) this;
        }

        public Criteria andLouthosDateBetween(Date value1, Date value2) {
            addCriterion("LOUTHOS_DATE between", value1, value2, "louthosDate");
            return (Criteria) this;
        }

        public Criteria andLouthosDateNotBetween(Date value1, Date value2) {
            addCriterion("LOUTHOS_DATE not between", value1, value2, "louthosDate");
            return (Criteria) this;
        }

        public Criteria andFirSeeDateIsNull() {
            addCriterion("FIR_SEE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFirSeeDateIsNotNull() {
            addCriterion("FIR_SEE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFirSeeDateEqualTo(Date value) {
            addCriterion("FIR_SEE_DATE =", value, "firSeeDate");
            return (Criteria) this;
        }

        public Criteria andFirSeeDateNotEqualTo(Date value) {
            addCriterion("FIR_SEE_DATE <>", value, "firSeeDate");
            return (Criteria) this;
        }

        public Criteria andFirSeeDateGreaterThan(Date value) {
            addCriterion("FIR_SEE_DATE >", value, "firSeeDate");
            return (Criteria) this;
        }

        public Criteria andFirSeeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("FIR_SEE_DATE >=", value, "firSeeDate");
            return (Criteria) this;
        }

        public Criteria andFirSeeDateLessThan(Date value) {
            addCriterion("FIR_SEE_DATE <", value, "firSeeDate");
            return (Criteria) this;
        }

        public Criteria andFirSeeDateLessThanOrEqualTo(Date value) {
            addCriterion("FIR_SEE_DATE <=", value, "firSeeDate");
            return (Criteria) this;
        }

        public Criteria andFirSeeDateIn(List<Date> values) {
            addCriterion("FIR_SEE_DATE in", values, "firSeeDate");
            return (Criteria) this;
        }

        public Criteria andFirSeeDateNotIn(List<Date> values) {
            addCriterion("FIR_SEE_DATE not in", values, "firSeeDate");
            return (Criteria) this;
        }

        public Criteria andFirSeeDateBetween(Date value1, Date value2) {
            addCriterion("FIR_SEE_DATE between", value1, value2, "firSeeDate");
            return (Criteria) this;
        }

        public Criteria andFirSeeDateNotBetween(Date value1, Date value2) {
            addCriterion("FIR_SEE_DATE not between", value1, value2, "firSeeDate");
            return (Criteria) this;
        }

        public Criteria andLregDateIsNull() {
            addCriterion("LREG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLregDateIsNotNull() {
            addCriterion("LREG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLregDateEqualTo(Date value) {
            addCriterion("LREG_DATE =", value, "lregDate");
            return (Criteria) this;
        }

        public Criteria andLregDateNotEqualTo(Date value) {
            addCriterion("LREG_DATE <>", value, "lregDate");
            return (Criteria) this;
        }

        public Criteria andLregDateGreaterThan(Date value) {
            addCriterion("LREG_DATE >", value, "lregDate");
            return (Criteria) this;
        }

        public Criteria andLregDateGreaterThanOrEqualTo(Date value) {
            addCriterion("LREG_DATE >=", value, "lregDate");
            return (Criteria) this;
        }

        public Criteria andLregDateLessThan(Date value) {
            addCriterion("LREG_DATE <", value, "lregDate");
            return (Criteria) this;
        }

        public Criteria andLregDateLessThanOrEqualTo(Date value) {
            addCriterion("LREG_DATE <=", value, "lregDate");
            return (Criteria) this;
        }

        public Criteria andLregDateIn(List<Date> values) {
            addCriterion("LREG_DATE in", values, "lregDate");
            return (Criteria) this;
        }

        public Criteria andLregDateNotIn(List<Date> values) {
            addCriterion("LREG_DATE not in", values, "lregDate");
            return (Criteria) this;
        }

        public Criteria andLregDateBetween(Date value1, Date value2) {
            addCriterion("LREG_DATE between", value1, value2, "lregDate");
            return (Criteria) this;
        }

        public Criteria andLregDateNotBetween(Date value1, Date value2) {
            addCriterion("LREG_DATE not between", value1, value2, "lregDate");
            return (Criteria) this;
        }

        public Criteria andDisobyCntIsNull() {
            addCriterion("DISOBY_CNT is null");
            return (Criteria) this;
        }

        public Criteria andDisobyCntIsNotNull() {
            addCriterion("DISOBY_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andDisobyCntEqualTo(Short value) {
            addCriterion("DISOBY_CNT =", value, "disobyCnt");
            return (Criteria) this;
        }

        public Criteria andDisobyCntNotEqualTo(Short value) {
            addCriterion("DISOBY_CNT <>", value, "disobyCnt");
            return (Criteria) this;
        }

        public Criteria andDisobyCntGreaterThan(Short value) {
            addCriterion("DISOBY_CNT >", value, "disobyCnt");
            return (Criteria) this;
        }

        public Criteria andDisobyCntGreaterThanOrEqualTo(Short value) {
            addCriterion("DISOBY_CNT >=", value, "disobyCnt");
            return (Criteria) this;
        }

        public Criteria andDisobyCntLessThan(Short value) {
            addCriterion("DISOBY_CNT <", value, "disobyCnt");
            return (Criteria) this;
        }

        public Criteria andDisobyCntLessThanOrEqualTo(Short value) {
            addCriterion("DISOBY_CNT <=", value, "disobyCnt");
            return (Criteria) this;
        }

        public Criteria andDisobyCntIn(List<Short> values) {
            addCriterion("DISOBY_CNT in", values, "disobyCnt");
            return (Criteria) this;
        }

        public Criteria andDisobyCntNotIn(List<Short> values) {
            addCriterion("DISOBY_CNT not in", values, "disobyCnt");
            return (Criteria) this;
        }

        public Criteria andDisobyCntBetween(Short value1, Short value2) {
            addCriterion("DISOBY_CNT between", value1, value2, "disobyCnt");
            return (Criteria) this;
        }

        public Criteria andDisobyCntNotBetween(Short value1, Short value2) {
            addCriterion("DISOBY_CNT not between", value1, value2, "disobyCnt");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("MARK is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("MARK is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("MARK =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("MARK <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("MARK >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("MARK >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("MARK <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("MARK <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("MARK like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("MARK not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("MARK in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("MARK not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("MARK between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("MARK not between", value1, value2, "mark");
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

        public Criteria andIsValidIsNull() {
            addCriterion("IS_VALID is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("IS_VALID is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(String value) {
            addCriterion("IS_VALID =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(String value) {
            addCriterion("IS_VALID <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(String value) {
            addCriterion("IS_VALID >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(String value) {
            addCriterion("IS_VALID >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(String value) {
            addCriterion("IS_VALID <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(String value) {
            addCriterion("IS_VALID <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLike(String value) {
            addCriterion("IS_VALID like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotLike(String value) {
            addCriterion("IS_VALID not like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<String> values) {
            addCriterion("IS_VALID in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<String> values) {
            addCriterion("IS_VALID not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(String value1, String value2) {
            addCriterion("IS_VALID between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(String value1, String value2) {
            addCriterion("IS_VALID not between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andFeeKindIsNull() {
            addCriterion("FEE_KIND is null");
            return (Criteria) this;
        }

        public Criteria andFeeKindIsNotNull() {
            addCriterion("FEE_KIND is not null");
            return (Criteria) this;
        }

        public Criteria andFeeKindEqualTo(String value) {
            addCriterion("FEE_KIND =", value, "feeKind");
            return (Criteria) this;
        }

        public Criteria andFeeKindNotEqualTo(String value) {
            addCriterion("FEE_KIND <>", value, "feeKind");
            return (Criteria) this;
        }

        public Criteria andFeeKindGreaterThan(String value) {
            addCriterion("FEE_KIND >", value, "feeKind");
            return (Criteria) this;
        }

        public Criteria andFeeKindGreaterThanOrEqualTo(String value) {
            addCriterion("FEE_KIND >=", value, "feeKind");
            return (Criteria) this;
        }

        public Criteria andFeeKindLessThan(String value) {
            addCriterion("FEE_KIND <", value, "feeKind");
            return (Criteria) this;
        }

        public Criteria andFeeKindLessThanOrEqualTo(String value) {
            addCriterion("FEE_KIND <=", value, "feeKind");
            return (Criteria) this;
        }

        public Criteria andFeeKindLike(String value) {
            addCriterion("FEE_KIND like", value, "feeKind");
            return (Criteria) this;
        }

        public Criteria andFeeKindNotLike(String value) {
            addCriterion("FEE_KIND not like", value, "feeKind");
            return (Criteria) this;
        }

        public Criteria andFeeKindIn(List<String> values) {
            addCriterion("FEE_KIND in", values, "feeKind");
            return (Criteria) this;
        }

        public Criteria andFeeKindNotIn(List<String> values) {
            addCriterion("FEE_KIND not in", values, "feeKind");
            return (Criteria) this;
        }

        public Criteria andFeeKindBetween(String value1, String value2) {
            addCriterion("FEE_KIND between", value1, value2, "feeKind");
            return (Criteria) this;
        }

        public Criteria andFeeKindNotBetween(String value1, String value2) {
            addCriterion("FEE_KIND not between", value1, value2, "feeKind");
            return (Criteria) this;
        }

        public Criteria andOldCardnoIsNull() {
            addCriterion("OLD_CARDNO is null");
            return (Criteria) this;
        }

        public Criteria andOldCardnoIsNotNull() {
            addCriterion("OLD_CARDNO is not null");
            return (Criteria) this;
        }

        public Criteria andOldCardnoEqualTo(String value) {
            addCriterion("OLD_CARDNO =", value, "oldCardno");
            return (Criteria) this;
        }

        public Criteria andOldCardnoNotEqualTo(String value) {
            addCriterion("OLD_CARDNO <>", value, "oldCardno");
            return (Criteria) this;
        }

        public Criteria andOldCardnoGreaterThan(String value) {
            addCriterion("OLD_CARDNO >", value, "oldCardno");
            return (Criteria) this;
        }

        public Criteria andOldCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("OLD_CARDNO >=", value, "oldCardno");
            return (Criteria) this;
        }

        public Criteria andOldCardnoLessThan(String value) {
            addCriterion("OLD_CARDNO <", value, "oldCardno");
            return (Criteria) this;
        }

        public Criteria andOldCardnoLessThanOrEqualTo(String value) {
            addCriterion("OLD_CARDNO <=", value, "oldCardno");
            return (Criteria) this;
        }

        public Criteria andOldCardnoLike(String value) {
            addCriterion("OLD_CARDNO like", value, "oldCardno");
            return (Criteria) this;
        }

        public Criteria andOldCardnoNotLike(String value) {
            addCriterion("OLD_CARDNO not like", value, "oldCardno");
            return (Criteria) this;
        }

        public Criteria andOldCardnoIn(List<String> values) {
            addCriterion("OLD_CARDNO in", values, "oldCardno");
            return (Criteria) this;
        }

        public Criteria andOldCardnoNotIn(List<String> values) {
            addCriterion("OLD_CARDNO not in", values, "oldCardno");
            return (Criteria) this;
        }

        public Criteria andOldCardnoBetween(String value1, String value2) {
            addCriterion("OLD_CARDNO between", value1, value2, "oldCardno");
            return (Criteria) this;
        }

        public Criteria andOldCardnoNotBetween(String value1, String value2) {
            addCriterion("OLD_CARDNO not between", value1, value2, "oldCardno");
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

        public Criteria andIdcardtypeIsNull() {
            addCriterion("IDCARDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdcardtypeIsNotNull() {
            addCriterion("IDCARDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardtypeEqualTo(String value) {
            addCriterion("IDCARDTYPE =", value, "idcardtype");
            return (Criteria) this;
        }

        public Criteria andIdcardtypeNotEqualTo(String value) {
            addCriterion("IDCARDTYPE <>", value, "idcardtype");
            return (Criteria) this;
        }

        public Criteria andIdcardtypeGreaterThan(String value) {
            addCriterion("IDCARDTYPE >", value, "idcardtype");
            return (Criteria) this;
        }

        public Criteria andIdcardtypeGreaterThanOrEqualTo(String value) {
            addCriterion("IDCARDTYPE >=", value, "idcardtype");
            return (Criteria) this;
        }

        public Criteria andIdcardtypeLessThan(String value) {
            addCriterion("IDCARDTYPE <", value, "idcardtype");
            return (Criteria) this;
        }

        public Criteria andIdcardtypeLessThanOrEqualTo(String value) {
            addCriterion("IDCARDTYPE <=", value, "idcardtype");
            return (Criteria) this;
        }

        public Criteria andIdcardtypeLike(String value) {
            addCriterion("IDCARDTYPE like", value, "idcardtype");
            return (Criteria) this;
        }

        public Criteria andIdcardtypeNotLike(String value) {
            addCriterion("IDCARDTYPE not like", value, "idcardtype");
            return (Criteria) this;
        }

        public Criteria andIdcardtypeIn(List<String> values) {
            addCriterion("IDCARDTYPE in", values, "idcardtype");
            return (Criteria) this;
        }

        public Criteria andIdcardtypeNotIn(List<String> values) {
            addCriterion("IDCARDTYPE not in", values, "idcardtype");
            return (Criteria) this;
        }

        public Criteria andIdcardtypeBetween(String value1, String value2) {
            addCriterion("IDCARDTYPE between", value1, value2, "idcardtype");
            return (Criteria) this;
        }

        public Criteria andIdcardtypeNotBetween(String value1, String value2) {
            addCriterion("IDCARDTYPE not between", value1, value2, "idcardtype");
            return (Criteria) this;
        }

        public Criteria andVipFlagIsNull() {
            addCriterion("VIP_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andVipFlagIsNotNull() {
            addCriterion("VIP_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andVipFlagEqualTo(String value) {
            addCriterion("VIP_FLAG =", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagNotEqualTo(String value) {
            addCriterion("VIP_FLAG <>", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagGreaterThan(String value) {
            addCriterion("VIP_FLAG >", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagGreaterThanOrEqualTo(String value) {
            addCriterion("VIP_FLAG >=", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagLessThan(String value) {
            addCriterion("VIP_FLAG <", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagLessThanOrEqualTo(String value) {
            addCriterion("VIP_FLAG <=", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagLike(String value) {
            addCriterion("VIP_FLAG like", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagNotLike(String value) {
            addCriterion("VIP_FLAG not like", value, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagIn(List<String> values) {
            addCriterion("VIP_FLAG in", values, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagNotIn(List<String> values) {
            addCriterion("VIP_FLAG not in", values, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagBetween(String value1, String value2) {
            addCriterion("VIP_FLAG between", value1, value2, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andVipFlagNotBetween(String value1, String value2) {
            addCriterion("VIP_FLAG not between", value1, value2, "vipFlag");
            return (Criteria) this;
        }

        public Criteria andMontherNameIsNull() {
            addCriterion("MONTHER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMontherNameIsNotNull() {
            addCriterion("MONTHER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMontherNameEqualTo(String value) {
            addCriterion("MONTHER_NAME =", value, "montherName");
            return (Criteria) this;
        }

        public Criteria andMontherNameNotEqualTo(String value) {
            addCriterion("MONTHER_NAME <>", value, "montherName");
            return (Criteria) this;
        }

        public Criteria andMontherNameGreaterThan(String value) {
            addCriterion("MONTHER_NAME >", value, "montherName");
            return (Criteria) this;
        }

        public Criteria andMontherNameGreaterThanOrEqualTo(String value) {
            addCriterion("MONTHER_NAME >=", value, "montherName");
            return (Criteria) this;
        }

        public Criteria andMontherNameLessThan(String value) {
            addCriterion("MONTHER_NAME <", value, "montherName");
            return (Criteria) this;
        }

        public Criteria andMontherNameLessThanOrEqualTo(String value) {
            addCriterion("MONTHER_NAME <=", value, "montherName");
            return (Criteria) this;
        }

        public Criteria andMontherNameLike(String value) {
            addCriterion("MONTHER_NAME like", value, "montherName");
            return (Criteria) this;
        }

        public Criteria andMontherNameNotLike(String value) {
            addCriterion("MONTHER_NAME not like", value, "montherName");
            return (Criteria) this;
        }

        public Criteria andMontherNameIn(List<String> values) {
            addCriterion("MONTHER_NAME in", values, "montherName");
            return (Criteria) this;
        }

        public Criteria andMontherNameNotIn(List<String> values) {
            addCriterion("MONTHER_NAME not in", values, "montherName");
            return (Criteria) this;
        }

        public Criteria andMontherNameBetween(String value1, String value2) {
            addCriterion("MONTHER_NAME between", value1, value2, "montherName");
            return (Criteria) this;
        }

        public Criteria andMontherNameNotBetween(String value1, String value2) {
            addCriterion("MONTHER_NAME not between", value1, value2, "montherName");
            return (Criteria) this;
        }

        public Criteria andIsTreatmentIsNull() {
            addCriterion("IS_TREATMENT is null");
            return (Criteria) this;
        }

        public Criteria andIsTreatmentIsNotNull() {
            addCriterion("IS_TREATMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsTreatmentEqualTo(String value) {
            addCriterion("IS_TREATMENT =", value, "isTreatment");
            return (Criteria) this;
        }

        public Criteria andIsTreatmentNotEqualTo(String value) {
            addCriterion("IS_TREATMENT <>", value, "isTreatment");
            return (Criteria) this;
        }

        public Criteria andIsTreatmentGreaterThan(String value) {
            addCriterion("IS_TREATMENT >", value, "isTreatment");
            return (Criteria) this;
        }

        public Criteria andIsTreatmentGreaterThanOrEqualTo(String value) {
            addCriterion("IS_TREATMENT >=", value, "isTreatment");
            return (Criteria) this;
        }

        public Criteria andIsTreatmentLessThan(String value) {
            addCriterion("IS_TREATMENT <", value, "isTreatment");
            return (Criteria) this;
        }

        public Criteria andIsTreatmentLessThanOrEqualTo(String value) {
            addCriterion("IS_TREATMENT <=", value, "isTreatment");
            return (Criteria) this;
        }

        public Criteria andIsTreatmentLike(String value) {
            addCriterion("IS_TREATMENT like", value, "isTreatment");
            return (Criteria) this;
        }

        public Criteria andIsTreatmentNotLike(String value) {
            addCriterion("IS_TREATMENT not like", value, "isTreatment");
            return (Criteria) this;
        }

        public Criteria andIsTreatmentIn(List<String> values) {
            addCriterion("IS_TREATMENT in", values, "isTreatment");
            return (Criteria) this;
        }

        public Criteria andIsTreatmentNotIn(List<String> values) {
            addCriterion("IS_TREATMENT not in", values, "isTreatment");
            return (Criteria) this;
        }

        public Criteria andIsTreatmentBetween(String value1, String value2) {
            addCriterion("IS_TREATMENT between", value1, value2, "isTreatment");
            return (Criteria) this;
        }

        public Criteria andIsTreatmentNotBetween(String value1, String value2) {
            addCriterion("IS_TREATMENT not between", value1, value2, "isTreatment");
            return (Criteria) this;
        }

        public Criteria andCaseNoIsNull() {
            addCriterion("CASE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCaseNoIsNotNull() {
            addCriterion("CASE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCaseNoEqualTo(String value) {
            addCriterion("CASE_NO =", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotEqualTo(String value) {
            addCriterion("CASE_NO <>", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThan(String value) {
            addCriterion("CASE_NO >", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoGreaterThanOrEqualTo(String value) {
            addCriterion("CASE_NO >=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThan(String value) {
            addCriterion("CASE_NO <", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLessThanOrEqualTo(String value) {
            addCriterion("CASE_NO <=", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoLike(String value) {
            addCriterion("CASE_NO like", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotLike(String value) {
            addCriterion("CASE_NO not like", value, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoIn(List<String> values) {
            addCriterion("CASE_NO in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotIn(List<String> values) {
            addCriterion("CASE_NO not in", values, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoBetween(String value1, String value2) {
            addCriterion("CASE_NO between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andCaseNoNotBetween(String value1, String value2) {
            addCriterion("CASE_NO not between", value1, value2, "caseNo");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIsNull() {
            addCriterion("INSURANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIsNotNull() {
            addCriterion("INSURANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdEqualTo(String value) {
            addCriterion("INSURANCE_ID =", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotEqualTo(String value) {
            addCriterion("INSURANCE_ID <>", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdGreaterThan(String value) {
            addCriterion("INSURANCE_ID >", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCE_ID >=", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdLessThan(String value) {
            addCriterion("INSURANCE_ID <", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdLessThanOrEqualTo(String value) {
            addCriterion("INSURANCE_ID <=", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdLike(String value) {
            addCriterion("INSURANCE_ID like", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotLike(String value) {
            addCriterion("INSURANCE_ID not like", value, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdIn(List<String> values) {
            addCriterion("INSURANCE_ID in", values, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotIn(List<String> values) {
            addCriterion("INSURANCE_ID not in", values, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdBetween(String value1, String value2) {
            addCriterion("INSURANCE_ID between", value1, value2, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceIdNotBetween(String value1, String value2) {
            addCriterion("INSURANCE_ID not between", value1, value2, "insuranceId");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIsNull() {
            addCriterion("INSURANCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIsNotNull() {
            addCriterion("INSURANCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameEqualTo(String value) {
            addCriterion("INSURANCE_NAME =", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotEqualTo(String value) {
            addCriterion("INSURANCE_NAME <>", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameGreaterThan(String value) {
            addCriterion("INSURANCE_NAME >", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameGreaterThanOrEqualTo(String value) {
            addCriterion("INSURANCE_NAME >=", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLessThan(String value) {
            addCriterion("INSURANCE_NAME <", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLessThanOrEqualTo(String value) {
            addCriterion("INSURANCE_NAME <=", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLike(String value) {
            addCriterion("INSURANCE_NAME like", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotLike(String value) {
            addCriterion("INSURANCE_NAME not like", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIn(List<String> values) {
            addCriterion("INSURANCE_NAME in", values, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotIn(List<String> values) {
            addCriterion("INSURANCE_NAME not in", values, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameBetween(String value1, String value2) {
            addCriterion("INSURANCE_NAME between", value1, value2, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotBetween(String value1, String value2) {
            addCriterion("INSURANCE_NAME not between", value1, value2, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andHomeDoorNoIsNull() {
            addCriterion("HOME_DOOR_NO is null");
            return (Criteria) this;
        }

        public Criteria andHomeDoorNoIsNotNull() {
            addCriterion("HOME_DOOR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andHomeDoorNoEqualTo(String value) {
            addCriterion("HOME_DOOR_NO =", value, "homeDoorNo");
            return (Criteria) this;
        }

        public Criteria andHomeDoorNoNotEqualTo(String value) {
            addCriterion("HOME_DOOR_NO <>", value, "homeDoorNo");
            return (Criteria) this;
        }

        public Criteria andHomeDoorNoGreaterThan(String value) {
            addCriterion("HOME_DOOR_NO >", value, "homeDoorNo");
            return (Criteria) this;
        }

        public Criteria andHomeDoorNoGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_DOOR_NO >=", value, "homeDoorNo");
            return (Criteria) this;
        }

        public Criteria andHomeDoorNoLessThan(String value) {
            addCriterion("HOME_DOOR_NO <", value, "homeDoorNo");
            return (Criteria) this;
        }

        public Criteria andHomeDoorNoLessThanOrEqualTo(String value) {
            addCriterion("HOME_DOOR_NO <=", value, "homeDoorNo");
            return (Criteria) this;
        }

        public Criteria andHomeDoorNoLike(String value) {
            addCriterion("HOME_DOOR_NO like", value, "homeDoorNo");
            return (Criteria) this;
        }

        public Criteria andHomeDoorNoNotLike(String value) {
            addCriterion("HOME_DOOR_NO not like", value, "homeDoorNo");
            return (Criteria) this;
        }

        public Criteria andHomeDoorNoIn(List<String> values) {
            addCriterion("HOME_DOOR_NO in", values, "homeDoorNo");
            return (Criteria) this;
        }

        public Criteria andHomeDoorNoNotIn(List<String> values) {
            addCriterion("HOME_DOOR_NO not in", values, "homeDoorNo");
            return (Criteria) this;
        }

        public Criteria andHomeDoorNoBetween(String value1, String value2) {
            addCriterion("HOME_DOOR_NO between", value1, value2, "homeDoorNo");
            return (Criteria) this;
        }

        public Criteria andHomeDoorNoNotBetween(String value1, String value2) {
            addCriterion("HOME_DOOR_NO not between", value1, value2, "homeDoorNo");
            return (Criteria) this;
        }

        public Criteria andLinkmanDoorNoIsNull() {
            addCriterion("LINKMAN_DOOR_NO is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanDoorNoIsNotNull() {
            addCriterion("LINKMAN_DOOR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanDoorNoEqualTo(String value) {
            addCriterion("LINKMAN_DOOR_NO =", value, "linkmanDoorNo");
            return (Criteria) this;
        }

        public Criteria andLinkmanDoorNoNotEqualTo(String value) {
            addCriterion("LINKMAN_DOOR_NO <>", value, "linkmanDoorNo");
            return (Criteria) this;
        }

        public Criteria andLinkmanDoorNoGreaterThan(String value) {
            addCriterion("LINKMAN_DOOR_NO >", value, "linkmanDoorNo");
            return (Criteria) this;
        }

        public Criteria andLinkmanDoorNoGreaterThanOrEqualTo(String value) {
            addCriterion("LINKMAN_DOOR_NO >=", value, "linkmanDoorNo");
            return (Criteria) this;
        }

        public Criteria andLinkmanDoorNoLessThan(String value) {
            addCriterion("LINKMAN_DOOR_NO <", value, "linkmanDoorNo");
            return (Criteria) this;
        }

        public Criteria andLinkmanDoorNoLessThanOrEqualTo(String value) {
            addCriterion("LINKMAN_DOOR_NO <=", value, "linkmanDoorNo");
            return (Criteria) this;
        }

        public Criteria andLinkmanDoorNoLike(String value) {
            addCriterion("LINKMAN_DOOR_NO like", value, "linkmanDoorNo");
            return (Criteria) this;
        }

        public Criteria andLinkmanDoorNoNotLike(String value) {
            addCriterion("LINKMAN_DOOR_NO not like", value, "linkmanDoorNo");
            return (Criteria) this;
        }

        public Criteria andLinkmanDoorNoIn(List<String> values) {
            addCriterion("LINKMAN_DOOR_NO in", values, "linkmanDoorNo");
            return (Criteria) this;
        }

        public Criteria andLinkmanDoorNoNotIn(List<String> values) {
            addCriterion("LINKMAN_DOOR_NO not in", values, "linkmanDoorNo");
            return (Criteria) this;
        }

        public Criteria andLinkmanDoorNoBetween(String value1, String value2) {
            addCriterion("LINKMAN_DOOR_NO between", value1, value2, "linkmanDoorNo");
            return (Criteria) this;
        }

        public Criteria andLinkmanDoorNoNotBetween(String value1, String value2) {
            addCriterion("LINKMAN_DOOR_NO not between", value1, value2, "linkmanDoorNo");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmrPatidIsNull() {
            addCriterion("EMR_PATID is null");
            return (Criteria) this;
        }

        public Criteria andEmrPatidIsNotNull() {
            addCriterion("EMR_PATID is not null");
            return (Criteria) this;
        }

        public Criteria andEmrPatidEqualTo(Long value) {
            addCriterion("EMR_PATID =", value, "emrPatid");
            return (Criteria) this;
        }

        public Criteria andEmrPatidNotEqualTo(Long value) {
            addCriterion("EMR_PATID <>", value, "emrPatid");
            return (Criteria) this;
        }

        public Criteria andEmrPatidGreaterThan(Long value) {
            addCriterion("EMR_PATID >", value, "emrPatid");
            return (Criteria) this;
        }

        public Criteria andEmrPatidGreaterThanOrEqualTo(Long value) {
            addCriterion("EMR_PATID >=", value, "emrPatid");
            return (Criteria) this;
        }

        public Criteria andEmrPatidLessThan(Long value) {
            addCriterion("EMR_PATID <", value, "emrPatid");
            return (Criteria) this;
        }

        public Criteria andEmrPatidLessThanOrEqualTo(Long value) {
            addCriterion("EMR_PATID <=", value, "emrPatid");
            return (Criteria) this;
        }

        public Criteria andEmrPatidIn(List<Long> values) {
            addCriterion("EMR_PATID in", values, "emrPatid");
            return (Criteria) this;
        }

        public Criteria andEmrPatidNotIn(List<Long> values) {
            addCriterion("EMR_PATID not in", values, "emrPatid");
            return (Criteria) this;
        }

        public Criteria andEmrPatidBetween(Long value1, Long value2) {
            addCriterion("EMR_PATID between", value1, value2, "emrPatid");
            return (Criteria) this;
        }

        public Criteria andEmrPatidNotBetween(Long value1, Long value2) {
            addCriterion("EMR_PATID not between", value1, value2, "emrPatid");
            return (Criteria) this;
        }

        public Criteria andHomeNowIsNull() {
            addCriterion("HOME_NOW is null");
            return (Criteria) this;
        }

        public Criteria andHomeNowIsNotNull() {
            addCriterion("HOME_NOW is not null");
            return (Criteria) this;
        }

        public Criteria andHomeNowEqualTo(String value) {
            addCriterion("HOME_NOW =", value, "homeNow");
            return (Criteria) this;
        }

        public Criteria andHomeNowNotEqualTo(String value) {
            addCriterion("HOME_NOW <>", value, "homeNow");
            return (Criteria) this;
        }

        public Criteria andHomeNowGreaterThan(String value) {
            addCriterion("HOME_NOW >", value, "homeNow");
            return (Criteria) this;
        }

        public Criteria andHomeNowGreaterThanOrEqualTo(String value) {
            addCriterion("HOME_NOW >=", value, "homeNow");
            return (Criteria) this;
        }

        public Criteria andHomeNowLessThan(String value) {
            addCriterion("HOME_NOW <", value, "homeNow");
            return (Criteria) this;
        }

        public Criteria andHomeNowLessThanOrEqualTo(String value) {
            addCriterion("HOME_NOW <=", value, "homeNow");
            return (Criteria) this;
        }

        public Criteria andHomeNowLike(String value) {
            addCriterion("HOME_NOW like", value, "homeNow");
            return (Criteria) this;
        }

        public Criteria andHomeNowNotLike(String value) {
            addCriterion("HOME_NOW not like", value, "homeNow");
            return (Criteria) this;
        }

        public Criteria andHomeNowIn(List<String> values) {
            addCriterion("HOME_NOW in", values, "homeNow");
            return (Criteria) this;
        }

        public Criteria andHomeNowNotIn(List<String> values) {
            addCriterion("HOME_NOW not in", values, "homeNow");
            return (Criteria) this;
        }

        public Criteria andHomeNowBetween(String value1, String value2) {
            addCriterion("HOME_NOW between", value1, value2, "homeNow");
            return (Criteria) this;
        }

        public Criteria andHomeNowNotBetween(String value1, String value2) {
            addCriterion("HOME_NOW not between", value1, value2, "homeNow");
            return (Criteria) this;
        }

        public Criteria andFamilyCodeIsNull() {
            addCriterion("FAMILY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFamilyCodeIsNotNull() {
            addCriterion("FAMILY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyCodeEqualTo(String value) {
            addCriterion("FAMILY_CODE =", value, "familyCode");
            return (Criteria) this;
        }

        public Criteria andFamilyCodeNotEqualTo(String value) {
            addCriterion("FAMILY_CODE <>", value, "familyCode");
            return (Criteria) this;
        }

        public Criteria andFamilyCodeGreaterThan(String value) {
            addCriterion("FAMILY_CODE >", value, "familyCode");
            return (Criteria) this;
        }

        public Criteria andFamilyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILY_CODE >=", value, "familyCode");
            return (Criteria) this;
        }

        public Criteria andFamilyCodeLessThan(String value) {
            addCriterion("FAMILY_CODE <", value, "familyCode");
            return (Criteria) this;
        }

        public Criteria andFamilyCodeLessThanOrEqualTo(String value) {
            addCriterion("FAMILY_CODE <=", value, "familyCode");
            return (Criteria) this;
        }

        public Criteria andFamilyCodeLike(String value) {
            addCriterion("FAMILY_CODE like", value, "familyCode");
            return (Criteria) this;
        }

        public Criteria andFamilyCodeNotLike(String value) {
            addCriterion("FAMILY_CODE not like", value, "familyCode");
            return (Criteria) this;
        }

        public Criteria andFamilyCodeIn(List<String> values) {
            addCriterion("FAMILY_CODE in", values, "familyCode");
            return (Criteria) this;
        }

        public Criteria andFamilyCodeNotIn(List<String> values) {
            addCriterion("FAMILY_CODE not in", values, "familyCode");
            return (Criteria) this;
        }

        public Criteria andFamilyCodeBetween(String value1, String value2) {
            addCriterion("FAMILY_CODE between", value1, value2, "familyCode");
            return (Criteria) this;
        }

        public Criteria andFamilyCodeNotBetween(String value1, String value2) {
            addCriterion("FAMILY_CODE not between", value1, value2, "familyCode");
            return (Criteria) this;
        }

        public Criteria andOtherCardnoIsNull() {
            addCriterion("OTHER_CARDNO is null");
            return (Criteria) this;
        }

        public Criteria andOtherCardnoIsNotNull() {
            addCriterion("OTHER_CARDNO is not null");
            return (Criteria) this;
        }

        public Criteria andOtherCardnoEqualTo(String value) {
            addCriterion("OTHER_CARDNO =", value, "otherCardno");
            return (Criteria) this;
        }

        public Criteria andOtherCardnoNotEqualTo(String value) {
            addCriterion("OTHER_CARDNO <>", value, "otherCardno");
            return (Criteria) this;
        }

        public Criteria andOtherCardnoGreaterThan(String value) {
            addCriterion("OTHER_CARDNO >", value, "otherCardno");
            return (Criteria) this;
        }

        public Criteria andOtherCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("OTHER_CARDNO >=", value, "otherCardno");
            return (Criteria) this;
        }

        public Criteria andOtherCardnoLessThan(String value) {
            addCriterion("OTHER_CARDNO <", value, "otherCardno");
            return (Criteria) this;
        }

        public Criteria andOtherCardnoLessThanOrEqualTo(String value) {
            addCriterion("OTHER_CARDNO <=", value, "otherCardno");
            return (Criteria) this;
        }

        public Criteria andOtherCardnoLike(String value) {
            addCriterion("OTHER_CARDNO like", value, "otherCardno");
            return (Criteria) this;
        }

        public Criteria andOtherCardnoNotLike(String value) {
            addCriterion("OTHER_CARDNO not like", value, "otherCardno");
            return (Criteria) this;
        }

        public Criteria andOtherCardnoIn(List<String> values) {
            addCriterion("OTHER_CARDNO in", values, "otherCardno");
            return (Criteria) this;
        }

        public Criteria andOtherCardnoNotIn(List<String> values) {
            addCriterion("OTHER_CARDNO not in", values, "otherCardno");
            return (Criteria) this;
        }

        public Criteria andOtherCardnoBetween(String value1, String value2) {
            addCriterion("OTHER_CARDNO between", value1, value2, "otherCardno");
            return (Criteria) this;
        }

        public Criteria andOtherCardnoNotBetween(String value1, String value2) {
            addCriterion("OTHER_CARDNO not between", value1, value2, "otherCardno");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNull() {
            addCriterion("SERVICE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNotNull() {
            addCriterion("SERVICE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeEqualTo(String value) {
            addCriterion("SERVICE_CODE =", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotEqualTo(String value) {
            addCriterion("SERVICE_CODE <>", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThan(String value) {
            addCriterion("SERVICE_CODE >", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_CODE >=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThan(String value) {
            addCriterion("SERVICE_CODE <", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_CODE <=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLike(String value) {
            addCriterion("SERVICE_CODE like", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotLike(String value) {
            addCriterion("SERVICE_CODE not like", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIn(List<String> values) {
            addCriterion("SERVICE_CODE in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotIn(List<String> values) {
            addCriterion("SERVICE_CODE not in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeBetween(String value1, String value2) {
            addCriterion("SERVICE_CODE between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotBetween(String value1, String value2) {
            addCriterion("SERVICE_CODE not between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNull() {
            addCriterion("SERVICE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("SERVICE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("SERVICE_NAME =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("SERVICE_NAME <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("SERVICE_NAME >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("SERVICE_NAME <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_NAME <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("SERVICE_NAME like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("SERVICE_NAME not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("SERVICE_NAME in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("SERVICE_NAME not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("SERVICE_NAME not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andPatientSourcenoIsNull() {
            addCriterion("PATIENT_SOURCENO is null");
            return (Criteria) this;
        }

        public Criteria andPatientSourcenoIsNotNull() {
            addCriterion("PATIENT_SOURCENO is not null");
            return (Criteria) this;
        }

        public Criteria andPatientSourcenoEqualTo(String value) {
            addCriterion("PATIENT_SOURCENO =", value, "patientSourceno");
            return (Criteria) this;
        }

        public Criteria andPatientSourcenoNotEqualTo(String value) {
            addCriterion("PATIENT_SOURCENO <>", value, "patientSourceno");
            return (Criteria) this;
        }

        public Criteria andPatientSourcenoGreaterThan(String value) {
            addCriterion("PATIENT_SOURCENO >", value, "patientSourceno");
            return (Criteria) this;
        }

        public Criteria andPatientSourcenoGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_SOURCENO >=", value, "patientSourceno");
            return (Criteria) this;
        }

        public Criteria andPatientSourcenoLessThan(String value) {
            addCriterion("PATIENT_SOURCENO <", value, "patientSourceno");
            return (Criteria) this;
        }

        public Criteria andPatientSourcenoLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_SOURCENO <=", value, "patientSourceno");
            return (Criteria) this;
        }

        public Criteria andPatientSourcenoLike(String value) {
            addCriterion("PATIENT_SOURCENO like", value, "patientSourceno");
            return (Criteria) this;
        }

        public Criteria andPatientSourcenoNotLike(String value) {
            addCriterion("PATIENT_SOURCENO not like", value, "patientSourceno");
            return (Criteria) this;
        }

        public Criteria andPatientSourcenoIn(List<String> values) {
            addCriterion("PATIENT_SOURCENO in", values, "patientSourceno");
            return (Criteria) this;
        }

        public Criteria andPatientSourcenoNotIn(List<String> values) {
            addCriterion("PATIENT_SOURCENO not in", values, "patientSourceno");
            return (Criteria) this;
        }

        public Criteria andPatientSourcenoBetween(String value1, String value2) {
            addCriterion("PATIENT_SOURCENO between", value1, value2, "patientSourceno");
            return (Criteria) this;
        }

        public Criteria andPatientSourcenoNotBetween(String value1, String value2) {
            addCriterion("PATIENT_SOURCENO not between", value1, value2, "patientSourceno");
            return (Criteria) this;
        }

        public Criteria andReferralPersonIsNull() {
            addCriterion("REFERRAL_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andReferralPersonIsNotNull() {
            addCriterion("REFERRAL_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andReferralPersonEqualTo(String value) {
            addCriterion("REFERRAL_PERSON =", value, "referralPerson");
            return (Criteria) this;
        }

        public Criteria andReferralPersonNotEqualTo(String value) {
            addCriterion("REFERRAL_PERSON <>", value, "referralPerson");
            return (Criteria) this;
        }

        public Criteria andReferralPersonGreaterThan(String value) {
            addCriterion("REFERRAL_PERSON >", value, "referralPerson");
            return (Criteria) this;
        }

        public Criteria andReferralPersonGreaterThanOrEqualTo(String value) {
            addCriterion("REFERRAL_PERSON >=", value, "referralPerson");
            return (Criteria) this;
        }

        public Criteria andReferralPersonLessThan(String value) {
            addCriterion("REFERRAL_PERSON <", value, "referralPerson");
            return (Criteria) this;
        }

        public Criteria andReferralPersonLessThanOrEqualTo(String value) {
            addCriterion("REFERRAL_PERSON <=", value, "referralPerson");
            return (Criteria) this;
        }

        public Criteria andReferralPersonLike(String value) {
            addCriterion("REFERRAL_PERSON like", value, "referralPerson");
            return (Criteria) this;
        }

        public Criteria andReferralPersonNotLike(String value) {
            addCriterion("REFERRAL_PERSON not like", value, "referralPerson");
            return (Criteria) this;
        }

        public Criteria andReferralPersonIn(List<String> values) {
            addCriterion("REFERRAL_PERSON in", values, "referralPerson");
            return (Criteria) this;
        }

        public Criteria andReferralPersonNotIn(List<String> values) {
            addCriterion("REFERRAL_PERSON not in", values, "referralPerson");
            return (Criteria) this;
        }

        public Criteria andReferralPersonBetween(String value1, String value2) {
            addCriterion("REFERRAL_PERSON between", value1, value2, "referralPerson");
            return (Criteria) this;
        }

        public Criteria andReferralPersonNotBetween(String value1, String value2) {
            addCriterion("REFERRAL_PERSON not between", value1, value2, "referralPerson");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNull() {
            addCriterion("CHANNEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIsNotNull() {
            addCriterion("CHANNEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelCodeEqualTo(String value) {
            addCriterion("CHANNEL_CODE =", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotEqualTo(String value) {
            addCriterion("CHANNEL_CODE <>", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThan(String value) {
            addCriterion("CHANNEL_CODE >", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CODE >=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThan(String value) {
            addCriterion("CHANNEL_CODE <", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_CODE <=", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeLike(String value) {
            addCriterion("CHANNEL_CODE like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotLike(String value) {
            addCriterion("CHANNEL_CODE not like", value, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeIn(List<String> values) {
            addCriterion("CHANNEL_CODE in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotIn(List<String> values) {
            addCriterion("CHANNEL_CODE not in", values, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeBetween(String value1, String value2) {
            addCriterion("CHANNEL_CODE between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andChannelCodeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_CODE not between", value1, value2, "channelCode");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIsNull() {
            addCriterion("FAMILY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIsNotNull() {
            addCriterion("FAMILY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyNameEqualTo(String value) {
            addCriterion("FAMILY_NAME =", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotEqualTo(String value) {
            addCriterion("FAMILY_NAME <>", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThan(String value) {
            addCriterion("FAMILY_NAME >", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILY_NAME >=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThan(String value) {
            addCriterion("FAMILY_NAME <", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLessThanOrEqualTo(String value) {
            addCriterion("FAMILY_NAME <=", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameLike(String value) {
            addCriterion("FAMILY_NAME like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotLike(String value) {
            addCriterion("FAMILY_NAME not like", value, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameIn(List<String> values) {
            addCriterion("FAMILY_NAME in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotIn(List<String> values) {
            addCriterion("FAMILY_NAME not in", values, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameBetween(String value1, String value2) {
            addCriterion("FAMILY_NAME between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andFamilyNameNotBetween(String value1, String value2) {
            addCriterion("FAMILY_NAME not between", value1, value2, "familyName");
            return (Criteria) this;
        }

        public Criteria andBicompanyidIsNull() {
            addCriterion("BICOMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andBicompanyidIsNotNull() {
            addCriterion("BICOMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andBicompanyidEqualTo(String value) {
            addCriterion("BICOMPANYID =", value, "bicompanyid");
            return (Criteria) this;
        }

        public Criteria andBicompanyidNotEqualTo(String value) {
            addCriterion("BICOMPANYID <>", value, "bicompanyid");
            return (Criteria) this;
        }

        public Criteria andBicompanyidGreaterThan(String value) {
            addCriterion("BICOMPANYID >", value, "bicompanyid");
            return (Criteria) this;
        }

        public Criteria andBicompanyidGreaterThanOrEqualTo(String value) {
            addCriterion("BICOMPANYID >=", value, "bicompanyid");
            return (Criteria) this;
        }

        public Criteria andBicompanyidLessThan(String value) {
            addCriterion("BICOMPANYID <", value, "bicompanyid");
            return (Criteria) this;
        }

        public Criteria andBicompanyidLessThanOrEqualTo(String value) {
            addCriterion("BICOMPANYID <=", value, "bicompanyid");
            return (Criteria) this;
        }

        public Criteria andBicompanyidLike(String value) {
            addCriterion("BICOMPANYID like", value, "bicompanyid");
            return (Criteria) this;
        }

        public Criteria andBicompanyidNotLike(String value) {
            addCriterion("BICOMPANYID not like", value, "bicompanyid");
            return (Criteria) this;
        }

        public Criteria andBicompanyidIn(List<String> values) {
            addCriterion("BICOMPANYID in", values, "bicompanyid");
            return (Criteria) this;
        }

        public Criteria andBicompanyidNotIn(List<String> values) {
            addCriterion("BICOMPANYID not in", values, "bicompanyid");
            return (Criteria) this;
        }

        public Criteria andBicompanyidBetween(String value1, String value2) {
            addCriterion("BICOMPANYID between", value1, value2, "bicompanyid");
            return (Criteria) this;
        }

        public Criteria andBicompanyidNotBetween(String value1, String value2) {
            addCriterion("BICOMPANYID not between", value1, value2, "bicompanyid");
            return (Criteria) this;
        }

        public Criteria andBicompanynameIsNull() {
            addCriterion("BICOMPANYNAME is null");
            return (Criteria) this;
        }

        public Criteria andBicompanynameIsNotNull() {
            addCriterion("BICOMPANYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBicompanynameEqualTo(String value) {
            addCriterion("BICOMPANYNAME =", value, "bicompanyname");
            return (Criteria) this;
        }

        public Criteria andBicompanynameNotEqualTo(String value) {
            addCriterion("BICOMPANYNAME <>", value, "bicompanyname");
            return (Criteria) this;
        }

        public Criteria andBicompanynameGreaterThan(String value) {
            addCriterion("BICOMPANYNAME >", value, "bicompanyname");
            return (Criteria) this;
        }

        public Criteria andBicompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("BICOMPANYNAME >=", value, "bicompanyname");
            return (Criteria) this;
        }

        public Criteria andBicompanynameLessThan(String value) {
            addCriterion("BICOMPANYNAME <", value, "bicompanyname");
            return (Criteria) this;
        }

        public Criteria andBicompanynameLessThanOrEqualTo(String value) {
            addCriterion("BICOMPANYNAME <=", value, "bicompanyname");
            return (Criteria) this;
        }

        public Criteria andBicompanynameLike(String value) {
            addCriterion("BICOMPANYNAME like", value, "bicompanyname");
            return (Criteria) this;
        }

        public Criteria andBicompanynameNotLike(String value) {
            addCriterion("BICOMPANYNAME not like", value, "bicompanyname");
            return (Criteria) this;
        }

        public Criteria andBicompanynameIn(List<String> values) {
            addCriterion("BICOMPANYNAME in", values, "bicompanyname");
            return (Criteria) this;
        }

        public Criteria andBicompanynameNotIn(List<String> values) {
            addCriterion("BICOMPANYNAME not in", values, "bicompanyname");
            return (Criteria) this;
        }

        public Criteria andBicompanynameBetween(String value1, String value2) {
            addCriterion("BICOMPANYNAME between", value1, value2, "bicompanyname");
            return (Criteria) this;
        }

        public Criteria andBicompanynameNotBetween(String value1, String value2) {
            addCriterion("BICOMPANYNAME not between", value1, value2, "bicompanyname");
            return (Criteria) this;
        }

        public Criteria andCrmidIsNull() {
            addCriterion("CRMID is null");
            return (Criteria) this;
        }

        public Criteria andCrmidIsNotNull() {
            addCriterion("CRMID is not null");
            return (Criteria) this;
        }

        public Criteria andCrmidEqualTo(String value) {
            addCriterion("CRMID =", value, "crmid");
            return (Criteria) this;
        }

        public Criteria andCrmidNotEqualTo(String value) {
            addCriterion("CRMID <>", value, "crmid");
            return (Criteria) this;
        }

        public Criteria andCrmidGreaterThan(String value) {
            addCriterion("CRMID >", value, "crmid");
            return (Criteria) this;
        }

        public Criteria andCrmidGreaterThanOrEqualTo(String value) {
            addCriterion("CRMID >=", value, "crmid");
            return (Criteria) this;
        }

        public Criteria andCrmidLessThan(String value) {
            addCriterion("CRMID <", value, "crmid");
            return (Criteria) this;
        }

        public Criteria andCrmidLessThanOrEqualTo(String value) {
            addCriterion("CRMID <=", value, "crmid");
            return (Criteria) this;
        }

        public Criteria andCrmidLike(String value) {
            addCriterion("CRMID like", value, "crmid");
            return (Criteria) this;
        }

        public Criteria andCrmidNotLike(String value) {
            addCriterion("CRMID not like", value, "crmid");
            return (Criteria) this;
        }

        public Criteria andCrmidIn(List<String> values) {
            addCriterion("CRMID in", values, "crmid");
            return (Criteria) this;
        }

        public Criteria andCrmidNotIn(List<String> values) {
            addCriterion("CRMID not in", values, "crmid");
            return (Criteria) this;
        }

        public Criteria andCrmidBetween(String value1, String value2) {
            addCriterion("CRMID between", value1, value2, "crmid");
            return (Criteria) this;
        }

        public Criteria andCrmidNotBetween(String value1, String value2) {
            addCriterion("CRMID not between", value1, value2, "crmid");
            return (Criteria) this;
        }

        public Criteria andChannel1codeIsNull() {
            addCriterion("CHANNEL1CODE is null");
            return (Criteria) this;
        }

        public Criteria andChannel1codeIsNotNull() {
            addCriterion("CHANNEL1CODE is not null");
            return (Criteria) this;
        }

        public Criteria andChannel1codeEqualTo(String value) {
            addCriterion("CHANNEL1CODE =", value, "channel1code");
            return (Criteria) this;
        }

        public Criteria andChannel1codeNotEqualTo(String value) {
            addCriterion("CHANNEL1CODE <>", value, "channel1code");
            return (Criteria) this;
        }

        public Criteria andChannel1codeGreaterThan(String value) {
            addCriterion("CHANNEL1CODE >", value, "channel1code");
            return (Criteria) this;
        }

        public Criteria andChannel1codeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL1CODE >=", value, "channel1code");
            return (Criteria) this;
        }

        public Criteria andChannel1codeLessThan(String value) {
            addCriterion("CHANNEL1CODE <", value, "channel1code");
            return (Criteria) this;
        }

        public Criteria andChannel1codeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL1CODE <=", value, "channel1code");
            return (Criteria) this;
        }

        public Criteria andChannel1codeLike(String value) {
            addCriterion("CHANNEL1CODE like", value, "channel1code");
            return (Criteria) this;
        }

        public Criteria andChannel1codeNotLike(String value) {
            addCriterion("CHANNEL1CODE not like", value, "channel1code");
            return (Criteria) this;
        }

        public Criteria andChannel1codeIn(List<String> values) {
            addCriterion("CHANNEL1CODE in", values, "channel1code");
            return (Criteria) this;
        }

        public Criteria andChannel1codeNotIn(List<String> values) {
            addCriterion("CHANNEL1CODE not in", values, "channel1code");
            return (Criteria) this;
        }

        public Criteria andChannel1codeBetween(String value1, String value2) {
            addCriterion("CHANNEL1CODE between", value1, value2, "channel1code");
            return (Criteria) this;
        }

        public Criteria andChannel1codeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL1CODE not between", value1, value2, "channel1code");
            return (Criteria) this;
        }

        public Criteria andChannel1IsNull() {
            addCriterion("CHANNEL1 is null");
            return (Criteria) this;
        }

        public Criteria andChannel1IsNotNull() {
            addCriterion("CHANNEL1 is not null");
            return (Criteria) this;
        }

        public Criteria andChannel1EqualTo(String value) {
            addCriterion("CHANNEL1 =", value, "channel1");
            return (Criteria) this;
        }

        public Criteria andChannel1NotEqualTo(String value) {
            addCriterion("CHANNEL1 <>", value, "channel1");
            return (Criteria) this;
        }

        public Criteria andChannel1GreaterThan(String value) {
            addCriterion("CHANNEL1 >", value, "channel1");
            return (Criteria) this;
        }

        public Criteria andChannel1GreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL1 >=", value, "channel1");
            return (Criteria) this;
        }

        public Criteria andChannel1LessThan(String value) {
            addCriterion("CHANNEL1 <", value, "channel1");
            return (Criteria) this;
        }

        public Criteria andChannel1LessThanOrEqualTo(String value) {
            addCriterion("CHANNEL1 <=", value, "channel1");
            return (Criteria) this;
        }

        public Criteria andChannel1Like(String value) {
            addCriterion("CHANNEL1 like", value, "channel1");
            return (Criteria) this;
        }

        public Criteria andChannel1NotLike(String value) {
            addCriterion("CHANNEL1 not like", value, "channel1");
            return (Criteria) this;
        }

        public Criteria andChannel1In(List<String> values) {
            addCriterion("CHANNEL1 in", values, "channel1");
            return (Criteria) this;
        }

        public Criteria andChannel1NotIn(List<String> values) {
            addCriterion("CHANNEL1 not in", values, "channel1");
            return (Criteria) this;
        }

        public Criteria andChannel1Between(String value1, String value2) {
            addCriterion("CHANNEL1 between", value1, value2, "channel1");
            return (Criteria) this;
        }

        public Criteria andChannel1NotBetween(String value1, String value2) {
            addCriterion("CHANNEL1 not between", value1, value2, "channel1");
            return (Criteria) this;
        }

        public Criteria andChannel2codeIsNull() {
            addCriterion("CHANNEL2CODE is null");
            return (Criteria) this;
        }

        public Criteria andChannel2codeIsNotNull() {
            addCriterion("CHANNEL2CODE is not null");
            return (Criteria) this;
        }

        public Criteria andChannel2codeEqualTo(String value) {
            addCriterion("CHANNEL2CODE =", value, "channel2code");
            return (Criteria) this;
        }

        public Criteria andChannel2codeNotEqualTo(String value) {
            addCriterion("CHANNEL2CODE <>", value, "channel2code");
            return (Criteria) this;
        }

        public Criteria andChannel2codeGreaterThan(String value) {
            addCriterion("CHANNEL2CODE >", value, "channel2code");
            return (Criteria) this;
        }

        public Criteria andChannel2codeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL2CODE >=", value, "channel2code");
            return (Criteria) this;
        }

        public Criteria andChannel2codeLessThan(String value) {
            addCriterion("CHANNEL2CODE <", value, "channel2code");
            return (Criteria) this;
        }

        public Criteria andChannel2codeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL2CODE <=", value, "channel2code");
            return (Criteria) this;
        }

        public Criteria andChannel2codeLike(String value) {
            addCriterion("CHANNEL2CODE like", value, "channel2code");
            return (Criteria) this;
        }

        public Criteria andChannel2codeNotLike(String value) {
            addCriterion("CHANNEL2CODE not like", value, "channel2code");
            return (Criteria) this;
        }

        public Criteria andChannel2codeIn(List<String> values) {
            addCriterion("CHANNEL2CODE in", values, "channel2code");
            return (Criteria) this;
        }

        public Criteria andChannel2codeNotIn(List<String> values) {
            addCriterion("CHANNEL2CODE not in", values, "channel2code");
            return (Criteria) this;
        }

        public Criteria andChannel2codeBetween(String value1, String value2) {
            addCriterion("CHANNEL2CODE between", value1, value2, "channel2code");
            return (Criteria) this;
        }

        public Criteria andChannel2codeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL2CODE not between", value1, value2, "channel2code");
            return (Criteria) this;
        }

        public Criteria andChannel2IsNull() {
            addCriterion("CHANNEL2 is null");
            return (Criteria) this;
        }

        public Criteria andChannel2IsNotNull() {
            addCriterion("CHANNEL2 is not null");
            return (Criteria) this;
        }

        public Criteria andChannel2EqualTo(String value) {
            addCriterion("CHANNEL2 =", value, "channel2");
            return (Criteria) this;
        }

        public Criteria andChannel2NotEqualTo(String value) {
            addCriterion("CHANNEL2 <>", value, "channel2");
            return (Criteria) this;
        }

        public Criteria andChannel2GreaterThan(String value) {
            addCriterion("CHANNEL2 >", value, "channel2");
            return (Criteria) this;
        }

        public Criteria andChannel2GreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL2 >=", value, "channel2");
            return (Criteria) this;
        }

        public Criteria andChannel2LessThan(String value) {
            addCriterion("CHANNEL2 <", value, "channel2");
            return (Criteria) this;
        }

        public Criteria andChannel2LessThanOrEqualTo(String value) {
            addCriterion("CHANNEL2 <=", value, "channel2");
            return (Criteria) this;
        }

        public Criteria andChannel2Like(String value) {
            addCriterion("CHANNEL2 like", value, "channel2");
            return (Criteria) this;
        }

        public Criteria andChannel2NotLike(String value) {
            addCriterion("CHANNEL2 not like", value, "channel2");
            return (Criteria) this;
        }

        public Criteria andChannel2In(List<String> values) {
            addCriterion("CHANNEL2 in", values, "channel2");
            return (Criteria) this;
        }

        public Criteria andChannel2NotIn(List<String> values) {
            addCriterion("CHANNEL2 not in", values, "channel2");
            return (Criteria) this;
        }

        public Criteria andChannel2Between(String value1, String value2) {
            addCriterion("CHANNEL2 between", value1, value2, "channel2");
            return (Criteria) this;
        }

        public Criteria andChannel2NotBetween(String value1, String value2) {
            addCriterion("CHANNEL2 not between", value1, value2, "channel2");
            return (Criteria) this;
        }

        public Criteria andChannel3codeIsNull() {
            addCriterion("CHANNEL3CODE is null");
            return (Criteria) this;
        }

        public Criteria andChannel3codeIsNotNull() {
            addCriterion("CHANNEL3CODE is not null");
            return (Criteria) this;
        }

        public Criteria andChannel3codeEqualTo(String value) {
            addCriterion("CHANNEL3CODE =", value, "channel3code");
            return (Criteria) this;
        }

        public Criteria andChannel3codeNotEqualTo(String value) {
            addCriterion("CHANNEL3CODE <>", value, "channel3code");
            return (Criteria) this;
        }

        public Criteria andChannel3codeGreaterThan(String value) {
            addCriterion("CHANNEL3CODE >", value, "channel3code");
            return (Criteria) this;
        }

        public Criteria andChannel3codeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL3CODE >=", value, "channel3code");
            return (Criteria) this;
        }

        public Criteria andChannel3codeLessThan(String value) {
            addCriterion("CHANNEL3CODE <", value, "channel3code");
            return (Criteria) this;
        }

        public Criteria andChannel3codeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL3CODE <=", value, "channel3code");
            return (Criteria) this;
        }

        public Criteria andChannel3codeLike(String value) {
            addCriterion("CHANNEL3CODE like", value, "channel3code");
            return (Criteria) this;
        }

        public Criteria andChannel3codeNotLike(String value) {
            addCriterion("CHANNEL3CODE not like", value, "channel3code");
            return (Criteria) this;
        }

        public Criteria andChannel3codeIn(List<String> values) {
            addCriterion("CHANNEL3CODE in", values, "channel3code");
            return (Criteria) this;
        }

        public Criteria andChannel3codeNotIn(List<String> values) {
            addCriterion("CHANNEL3CODE not in", values, "channel3code");
            return (Criteria) this;
        }

        public Criteria andChannel3codeBetween(String value1, String value2) {
            addCriterion("CHANNEL3CODE between", value1, value2, "channel3code");
            return (Criteria) this;
        }

        public Criteria andChannel3codeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL3CODE not between", value1, value2, "channel3code");
            return (Criteria) this;
        }

        public Criteria andChannel3IsNull() {
            addCriterion("CHANNEL3 is null");
            return (Criteria) this;
        }

        public Criteria andChannel3IsNotNull() {
            addCriterion("CHANNEL3 is not null");
            return (Criteria) this;
        }

        public Criteria andChannel3EqualTo(String value) {
            addCriterion("CHANNEL3 =", value, "channel3");
            return (Criteria) this;
        }

        public Criteria andChannel3NotEqualTo(String value) {
            addCriterion("CHANNEL3 <>", value, "channel3");
            return (Criteria) this;
        }

        public Criteria andChannel3GreaterThan(String value) {
            addCriterion("CHANNEL3 >", value, "channel3");
            return (Criteria) this;
        }

        public Criteria andChannel3GreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL3 >=", value, "channel3");
            return (Criteria) this;
        }

        public Criteria andChannel3LessThan(String value) {
            addCriterion("CHANNEL3 <", value, "channel3");
            return (Criteria) this;
        }

        public Criteria andChannel3LessThanOrEqualTo(String value) {
            addCriterion("CHANNEL3 <=", value, "channel3");
            return (Criteria) this;
        }

        public Criteria andChannel3Like(String value) {
            addCriterion("CHANNEL3 like", value, "channel3");
            return (Criteria) this;
        }

        public Criteria andChannel3NotLike(String value) {
            addCriterion("CHANNEL3 not like", value, "channel3");
            return (Criteria) this;
        }

        public Criteria andChannel3In(List<String> values) {
            addCriterion("CHANNEL3 in", values, "channel3");
            return (Criteria) this;
        }

        public Criteria andChannel3NotIn(List<String> values) {
            addCriterion("CHANNEL3 not in", values, "channel3");
            return (Criteria) this;
        }

        public Criteria andChannel3Between(String value1, String value2) {
            addCriterion("CHANNEL3 between", value1, value2, "channel3");
            return (Criteria) this;
        }

        public Criteria andChannel3NotBetween(String value1, String value2) {
            addCriterion("CHANNEL3 not between", value1, value2, "channel3");
            return (Criteria) this;
        }

        public Criteria andClientmanagerIsNull() {
            addCriterion("CLIENTMANAGER is null");
            return (Criteria) this;
        }

        public Criteria andClientmanagerIsNotNull() {
            addCriterion("CLIENTMANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andClientmanagerEqualTo(String value) {
            addCriterion("CLIENTMANAGER =", value, "clientmanager");
            return (Criteria) this;
        }

        public Criteria andClientmanagerNotEqualTo(String value) {
            addCriterion("CLIENTMANAGER <>", value, "clientmanager");
            return (Criteria) this;
        }

        public Criteria andClientmanagerGreaterThan(String value) {
            addCriterion("CLIENTMANAGER >", value, "clientmanager");
            return (Criteria) this;
        }

        public Criteria andClientmanagerGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTMANAGER >=", value, "clientmanager");
            return (Criteria) this;
        }

        public Criteria andClientmanagerLessThan(String value) {
            addCriterion("CLIENTMANAGER <", value, "clientmanager");
            return (Criteria) this;
        }

        public Criteria andClientmanagerLessThanOrEqualTo(String value) {
            addCriterion("CLIENTMANAGER <=", value, "clientmanager");
            return (Criteria) this;
        }

        public Criteria andClientmanagerLike(String value) {
            addCriterion("CLIENTMANAGER like", value, "clientmanager");
            return (Criteria) this;
        }

        public Criteria andClientmanagerNotLike(String value) {
            addCriterion("CLIENTMANAGER not like", value, "clientmanager");
            return (Criteria) this;
        }

        public Criteria andClientmanagerIn(List<String> values) {
            addCriterion("CLIENTMANAGER in", values, "clientmanager");
            return (Criteria) this;
        }

        public Criteria andClientmanagerNotIn(List<String> values) {
            addCriterion("CLIENTMANAGER not in", values, "clientmanager");
            return (Criteria) this;
        }

        public Criteria andClientmanagerBetween(String value1, String value2) {
            addCriterion("CLIENTMANAGER between", value1, value2, "clientmanager");
            return (Criteria) this;
        }

        public Criteria andClientmanagerNotBetween(String value1, String value2) {
            addCriterion("CLIENTMANAGER not between", value1, value2, "clientmanager");
            return (Criteria) this;
        }

        public Criteria andConsultmanagerIsNull() {
            addCriterion("CONSULTMANAGER is null");
            return (Criteria) this;
        }

        public Criteria andConsultmanagerIsNotNull() {
            addCriterion("CONSULTMANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andConsultmanagerEqualTo(String value) {
            addCriterion("CONSULTMANAGER =", value, "consultmanager");
            return (Criteria) this;
        }

        public Criteria andConsultmanagerNotEqualTo(String value) {
            addCriterion("CONSULTMANAGER <>", value, "consultmanager");
            return (Criteria) this;
        }

        public Criteria andConsultmanagerGreaterThan(String value) {
            addCriterion("CONSULTMANAGER >", value, "consultmanager");
            return (Criteria) this;
        }

        public Criteria andConsultmanagerGreaterThanOrEqualTo(String value) {
            addCriterion("CONSULTMANAGER >=", value, "consultmanager");
            return (Criteria) this;
        }

        public Criteria andConsultmanagerLessThan(String value) {
            addCriterion("CONSULTMANAGER <", value, "consultmanager");
            return (Criteria) this;
        }

        public Criteria andConsultmanagerLessThanOrEqualTo(String value) {
            addCriterion("CONSULTMANAGER <=", value, "consultmanager");
            return (Criteria) this;
        }

        public Criteria andConsultmanagerLike(String value) {
            addCriterion("CONSULTMANAGER like", value, "consultmanager");
            return (Criteria) this;
        }

        public Criteria andConsultmanagerNotLike(String value) {
            addCriterion("CONSULTMANAGER not like", value, "consultmanager");
            return (Criteria) this;
        }

        public Criteria andConsultmanagerIn(List<String> values) {
            addCriterion("CONSULTMANAGER in", values, "consultmanager");
            return (Criteria) this;
        }

        public Criteria andConsultmanagerNotIn(List<String> values) {
            addCriterion("CONSULTMANAGER not in", values, "consultmanager");
            return (Criteria) this;
        }

        public Criteria andConsultmanagerBetween(String value1, String value2) {
            addCriterion("CONSULTMANAGER between", value1, value2, "consultmanager");
            return (Criteria) this;
        }

        public Criteria andConsultmanagerNotBetween(String value1, String value2) {
            addCriterion("CONSULTMANAGER not between", value1, value2, "consultmanager");
            return (Criteria) this;
        }

        public Criteria andSellmanagerIsNull() {
            addCriterion("SELLMANAGER is null");
            return (Criteria) this;
        }

        public Criteria andSellmanagerIsNotNull() {
            addCriterion("SELLMANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andSellmanagerEqualTo(String value) {
            addCriterion("SELLMANAGER =", value, "sellmanager");
            return (Criteria) this;
        }

        public Criteria andSellmanagerNotEqualTo(String value) {
            addCriterion("SELLMANAGER <>", value, "sellmanager");
            return (Criteria) this;
        }

        public Criteria andSellmanagerGreaterThan(String value) {
            addCriterion("SELLMANAGER >", value, "sellmanager");
            return (Criteria) this;
        }

        public Criteria andSellmanagerGreaterThanOrEqualTo(String value) {
            addCriterion("SELLMANAGER >=", value, "sellmanager");
            return (Criteria) this;
        }

        public Criteria andSellmanagerLessThan(String value) {
            addCriterion("SELLMANAGER <", value, "sellmanager");
            return (Criteria) this;
        }

        public Criteria andSellmanagerLessThanOrEqualTo(String value) {
            addCriterion("SELLMANAGER <=", value, "sellmanager");
            return (Criteria) this;
        }

        public Criteria andSellmanagerLike(String value) {
            addCriterion("SELLMANAGER like", value, "sellmanager");
            return (Criteria) this;
        }

        public Criteria andSellmanagerNotLike(String value) {
            addCriterion("SELLMANAGER not like", value, "sellmanager");
            return (Criteria) this;
        }

        public Criteria andSellmanagerIn(List<String> values) {
            addCriterion("SELLMANAGER in", values, "sellmanager");
            return (Criteria) this;
        }

        public Criteria andSellmanagerNotIn(List<String> values) {
            addCriterion("SELLMANAGER not in", values, "sellmanager");
            return (Criteria) this;
        }

        public Criteria andSellmanagerBetween(String value1, String value2) {
            addCriterion("SELLMANAGER between", value1, value2, "sellmanager");
            return (Criteria) this;
        }

        public Criteria andSellmanagerNotBetween(String value1, String value2) {
            addCriterion("SELLMANAGER not between", value1, value2, "sellmanager");
            return (Criteria) this;
        }

        public Criteria andBcsellmanagerIsNull() {
            addCriterion("BCSELLMANAGER is null");
            return (Criteria) this;
        }

        public Criteria andBcsellmanagerIsNotNull() {
            addCriterion("BCSELLMANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andBcsellmanagerEqualTo(String value) {
            addCriterion("BCSELLMANAGER =", value, "bcsellmanager");
            return (Criteria) this;
        }

        public Criteria andBcsellmanagerNotEqualTo(String value) {
            addCriterion("BCSELLMANAGER <>", value, "bcsellmanager");
            return (Criteria) this;
        }

        public Criteria andBcsellmanagerGreaterThan(String value) {
            addCriterion("BCSELLMANAGER >", value, "bcsellmanager");
            return (Criteria) this;
        }

        public Criteria andBcsellmanagerGreaterThanOrEqualTo(String value) {
            addCriterion("BCSELLMANAGER >=", value, "bcsellmanager");
            return (Criteria) this;
        }

        public Criteria andBcsellmanagerLessThan(String value) {
            addCriterion("BCSELLMANAGER <", value, "bcsellmanager");
            return (Criteria) this;
        }

        public Criteria andBcsellmanagerLessThanOrEqualTo(String value) {
            addCriterion("BCSELLMANAGER <=", value, "bcsellmanager");
            return (Criteria) this;
        }

        public Criteria andBcsellmanagerLike(String value) {
            addCriterion("BCSELLMANAGER like", value, "bcsellmanager");
            return (Criteria) this;
        }

        public Criteria andBcsellmanagerNotLike(String value) {
            addCriterion("BCSELLMANAGER not like", value, "bcsellmanager");
            return (Criteria) this;
        }

        public Criteria andBcsellmanagerIn(List<String> values) {
            addCriterion("BCSELLMANAGER in", values, "bcsellmanager");
            return (Criteria) this;
        }

        public Criteria andBcsellmanagerNotIn(List<String> values) {
            addCriterion("BCSELLMANAGER not in", values, "bcsellmanager");
            return (Criteria) this;
        }

        public Criteria andBcsellmanagerBetween(String value1, String value2) {
            addCriterion("BCSELLMANAGER between", value1, value2, "bcsellmanager");
            return (Criteria) this;
        }

        public Criteria andBcsellmanagerNotBetween(String value1, String value2) {
            addCriterion("BCSELLMANAGER not between", value1, value2, "bcsellmanager");
            return (Criteria) this;
        }

        public Criteria andChildflagIsNull() {
            addCriterion("CHILDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andChildflagIsNotNull() {
            addCriterion("CHILDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andChildflagEqualTo(String value) {
            addCriterion("CHILDFLAG =", value, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagNotEqualTo(String value) {
            addCriterion("CHILDFLAG <>", value, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagGreaterThan(String value) {
            addCriterion("CHILDFLAG >", value, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagGreaterThanOrEqualTo(String value) {
            addCriterion("CHILDFLAG >=", value, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagLessThan(String value) {
            addCriterion("CHILDFLAG <", value, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagLessThanOrEqualTo(String value) {
            addCriterion("CHILDFLAG <=", value, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagLike(String value) {
            addCriterion("CHILDFLAG like", value, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagNotLike(String value) {
            addCriterion("CHILDFLAG not like", value, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagIn(List<String> values) {
            addCriterion("CHILDFLAG in", values, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagNotIn(List<String> values) {
            addCriterion("CHILDFLAG not in", values, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagBetween(String value1, String value2) {
            addCriterion("CHILDFLAG between", value1, value2, "childflag");
            return (Criteria) this;
        }

        public Criteria andChildflagNotBetween(String value1, String value2) {
            addCriterion("CHILDFLAG not between", value1, value2, "childflag");
            return (Criteria) this;
        }

        public Criteria andPackageflagIsNull() {
            addCriterion("PACKAGEFLAG is null");
            return (Criteria) this;
        }

        public Criteria andPackageflagIsNotNull() {
            addCriterion("PACKAGEFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPackageflagEqualTo(String value) {
            addCriterion("PACKAGEFLAG =", value, "packageflag");
            return (Criteria) this;
        }

        public Criteria andPackageflagNotEqualTo(String value) {
            addCriterion("PACKAGEFLAG <>", value, "packageflag");
            return (Criteria) this;
        }

        public Criteria andPackageflagGreaterThan(String value) {
            addCriterion("PACKAGEFLAG >", value, "packageflag");
            return (Criteria) this;
        }

        public Criteria andPackageflagGreaterThanOrEqualTo(String value) {
            addCriterion("PACKAGEFLAG >=", value, "packageflag");
            return (Criteria) this;
        }

        public Criteria andPackageflagLessThan(String value) {
            addCriterion("PACKAGEFLAG <", value, "packageflag");
            return (Criteria) this;
        }

        public Criteria andPackageflagLessThanOrEqualTo(String value) {
            addCriterion("PACKAGEFLAG <=", value, "packageflag");
            return (Criteria) this;
        }

        public Criteria andPackageflagLike(String value) {
            addCriterion("PACKAGEFLAG like", value, "packageflag");
            return (Criteria) this;
        }

        public Criteria andPackageflagNotLike(String value) {
            addCriterion("PACKAGEFLAG not like", value, "packageflag");
            return (Criteria) this;
        }

        public Criteria andPackageflagIn(List<String> values) {
            addCriterion("PACKAGEFLAG in", values, "packageflag");
            return (Criteria) this;
        }

        public Criteria andPackageflagNotIn(List<String> values) {
            addCriterion("PACKAGEFLAG not in", values, "packageflag");
            return (Criteria) this;
        }

        public Criteria andPackageflagBetween(String value1, String value2) {
            addCriterion("PACKAGEFLAG between", value1, value2, "packageflag");
            return (Criteria) this;
        }

        public Criteria andPackageflagNotBetween(String value1, String value2) {
            addCriterion("PACKAGEFLAG not between", value1, value2, "packageflag");
            return (Criteria) this;
        }

        public Criteria andFamilyidIsNull() {
            addCriterion("FAMILYID is null");
            return (Criteria) this;
        }

        public Criteria andFamilyidIsNotNull() {
            addCriterion("FAMILYID is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyidEqualTo(String value) {
            addCriterion("FAMILYID =", value, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidNotEqualTo(String value) {
            addCriterion("FAMILYID <>", value, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidGreaterThan(String value) {
            addCriterion("FAMILYID >", value, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYID >=", value, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidLessThan(String value) {
            addCriterion("FAMILYID <", value, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidLessThanOrEqualTo(String value) {
            addCriterion("FAMILYID <=", value, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidLike(String value) {
            addCriterion("FAMILYID like", value, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidNotLike(String value) {
            addCriterion("FAMILYID not like", value, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidIn(List<String> values) {
            addCriterion("FAMILYID in", values, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidNotIn(List<String> values) {
            addCriterion("FAMILYID not in", values, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidBetween(String value1, String value2) {
            addCriterion("FAMILYID between", value1, value2, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilyidNotBetween(String value1, String value2) {
            addCriterion("FAMILYID not between", value1, value2, "familyid");
            return (Criteria) this;
        }

        public Criteria andFamilynameIsNull() {
            addCriterion("FAMILYNAME is null");
            return (Criteria) this;
        }

        public Criteria andFamilynameIsNotNull() {
            addCriterion("FAMILYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andFamilynameEqualTo(String value) {
            addCriterion("FAMILYNAME =", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotEqualTo(String value) {
            addCriterion("FAMILYNAME <>", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameGreaterThan(String value) {
            addCriterion("FAMILYNAME >", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYNAME >=", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameLessThan(String value) {
            addCriterion("FAMILYNAME <", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameLessThanOrEqualTo(String value) {
            addCriterion("FAMILYNAME <=", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameLike(String value) {
            addCriterion("FAMILYNAME like", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotLike(String value) {
            addCriterion("FAMILYNAME not like", value, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameIn(List<String> values) {
            addCriterion("FAMILYNAME in", values, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotIn(List<String> values) {
            addCriterion("FAMILYNAME not in", values, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameBetween(String value1, String value2) {
            addCriterion("FAMILYNAME between", value1, value2, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilynameNotBetween(String value1, String value2) {
            addCriterion("FAMILYNAME not between", value1, value2, "familyname");
            return (Criteria) this;
        }

        public Criteria andFamilyroleidIsNull() {
            addCriterion("FAMILYROLEID is null");
            return (Criteria) this;
        }

        public Criteria andFamilyroleidIsNotNull() {
            addCriterion("FAMILYROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyroleidEqualTo(String value) {
            addCriterion("FAMILYROLEID =", value, "familyroleid");
            return (Criteria) this;
        }

        public Criteria andFamilyroleidNotEqualTo(String value) {
            addCriterion("FAMILYROLEID <>", value, "familyroleid");
            return (Criteria) this;
        }

        public Criteria andFamilyroleidGreaterThan(String value) {
            addCriterion("FAMILYROLEID >", value, "familyroleid");
            return (Criteria) this;
        }

        public Criteria andFamilyroleidGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYROLEID >=", value, "familyroleid");
            return (Criteria) this;
        }

        public Criteria andFamilyroleidLessThan(String value) {
            addCriterion("FAMILYROLEID <", value, "familyroleid");
            return (Criteria) this;
        }

        public Criteria andFamilyroleidLessThanOrEqualTo(String value) {
            addCriterion("FAMILYROLEID <=", value, "familyroleid");
            return (Criteria) this;
        }

        public Criteria andFamilyroleidLike(String value) {
            addCriterion("FAMILYROLEID like", value, "familyroleid");
            return (Criteria) this;
        }

        public Criteria andFamilyroleidNotLike(String value) {
            addCriterion("FAMILYROLEID not like", value, "familyroleid");
            return (Criteria) this;
        }

        public Criteria andFamilyroleidIn(List<String> values) {
            addCriterion("FAMILYROLEID in", values, "familyroleid");
            return (Criteria) this;
        }

        public Criteria andFamilyroleidNotIn(List<String> values) {
            addCriterion("FAMILYROLEID not in", values, "familyroleid");
            return (Criteria) this;
        }

        public Criteria andFamilyroleidBetween(String value1, String value2) {
            addCriterion("FAMILYROLEID between", value1, value2, "familyroleid");
            return (Criteria) this;
        }

        public Criteria andFamilyroleidNotBetween(String value1, String value2) {
            addCriterion("FAMILYROLEID not between", value1, value2, "familyroleid");
            return (Criteria) this;
        }

        public Criteria andFamilyrolenameIsNull() {
            addCriterion("FAMILYROLENAME is null");
            return (Criteria) this;
        }

        public Criteria andFamilyrolenameIsNotNull() {
            addCriterion("FAMILYROLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andFamilyrolenameEqualTo(String value) {
            addCriterion("FAMILYROLENAME =", value, "familyrolename");
            return (Criteria) this;
        }

        public Criteria andFamilyrolenameNotEqualTo(String value) {
            addCriterion("FAMILYROLENAME <>", value, "familyrolename");
            return (Criteria) this;
        }

        public Criteria andFamilyrolenameGreaterThan(String value) {
            addCriterion("FAMILYROLENAME >", value, "familyrolename");
            return (Criteria) this;
        }

        public Criteria andFamilyrolenameGreaterThanOrEqualTo(String value) {
            addCriterion("FAMILYROLENAME >=", value, "familyrolename");
            return (Criteria) this;
        }

        public Criteria andFamilyrolenameLessThan(String value) {
            addCriterion("FAMILYROLENAME <", value, "familyrolename");
            return (Criteria) this;
        }

        public Criteria andFamilyrolenameLessThanOrEqualTo(String value) {
            addCriterion("FAMILYROLENAME <=", value, "familyrolename");
            return (Criteria) this;
        }

        public Criteria andFamilyrolenameLike(String value) {
            addCriterion("FAMILYROLENAME like", value, "familyrolename");
            return (Criteria) this;
        }

        public Criteria andFamilyrolenameNotLike(String value) {
            addCriterion("FAMILYROLENAME not like", value, "familyrolename");
            return (Criteria) this;
        }

        public Criteria andFamilyrolenameIn(List<String> values) {
            addCriterion("FAMILYROLENAME in", values, "familyrolename");
            return (Criteria) this;
        }

        public Criteria andFamilyrolenameNotIn(List<String> values) {
            addCriterion("FAMILYROLENAME not in", values, "familyrolename");
            return (Criteria) this;
        }

        public Criteria andFamilyrolenameBetween(String value1, String value2) {
            addCriterion("FAMILYROLENAME between", value1, value2, "familyrolename");
            return (Criteria) this;
        }

        public Criteria andFamilyrolenameNotBetween(String value1, String value2) {
            addCriterion("FAMILYROLENAME not between", value1, value2, "familyrolename");
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