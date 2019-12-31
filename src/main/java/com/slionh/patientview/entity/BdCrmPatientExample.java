package com.slionh.patientview.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BdCrmPatientExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdCrmPatientExample() {
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

        public Criteria andPatientidIsNull() {
            addCriterion("PATIENTID is null");
            return (Criteria) this;
        }

        public Criteria andPatientidIsNotNull() {
            addCriterion("PATIENTID is not null");
            return (Criteria) this;
        }

        public Criteria andPatientidEqualTo(String value) {
            addCriterion("PATIENTID =", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotEqualTo(String value) {
            addCriterion("PATIENTID <>", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidGreaterThan(String value) {
            addCriterion("PATIENTID >", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENTID >=", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLessThan(String value) {
            addCriterion("PATIENTID <", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLessThanOrEqualTo(String value) {
            addCriterion("PATIENTID <=", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidLike(String value) {
            addCriterion("PATIENTID like", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotLike(String value) {
            addCriterion("PATIENTID not like", value, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidIn(List<String> values) {
            addCriterion("PATIENTID in", values, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotIn(List<String> values) {
            addCriterion("PATIENTID not in", values, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidBetween(String value1, String value2) {
            addCriterion("PATIENTID between", value1, value2, "patientid");
            return (Criteria) this;
        }

        public Criteria andPatientidNotBetween(String value1, String value2) {
            addCriterion("PATIENTID not between", value1, value2, "patientid");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNull() {
            addCriterion("CARDNO is null");
            return (Criteria) this;
        }

        public Criteria andCardnoIsNotNull() {
            addCriterion("CARDNO is not null");
            return (Criteria) this;
        }

        public Criteria andCardnoEqualTo(String value) {
            addCriterion("CARDNO =", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotEqualTo(String value) {
            addCriterion("CARDNO <>", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThan(String value) {
            addCriterion("CARDNO >", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoGreaterThanOrEqualTo(String value) {
            addCriterion("CARDNO >=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThan(String value) {
            addCriterion("CARDNO <", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLessThanOrEqualTo(String value) {
            addCriterion("CARDNO <=", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoLike(String value) {
            addCriterion("CARDNO like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotLike(String value) {
            addCriterion("CARDNO not like", value, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoIn(List<String> values) {
            addCriterion("CARDNO in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotIn(List<String> values) {
            addCriterion("CARDNO not in", values, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoBetween(String value1, String value2) {
            addCriterion("CARDNO between", value1, value2, "cardno");
            return (Criteria) this;
        }

        public Criteria andCardnoNotBetween(String value1, String value2) {
            addCriterion("CARDNO not between", value1, value2, "cardno");
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

        public Criteria andEngnameIsNull() {
            addCriterion("ENGNAME is null");
            return (Criteria) this;
        }

        public Criteria andEngnameIsNotNull() {
            addCriterion("ENGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andEngnameEqualTo(String value) {
            addCriterion("ENGNAME =", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotEqualTo(String value) {
            addCriterion("ENGNAME <>", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameGreaterThan(String value) {
            addCriterion("ENGNAME >", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameGreaterThanOrEqualTo(String value) {
            addCriterion("ENGNAME >=", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLessThan(String value) {
            addCriterion("ENGNAME <", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLessThanOrEqualTo(String value) {
            addCriterion("ENGNAME <=", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameLike(String value) {
            addCriterion("ENGNAME like", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotLike(String value) {
            addCriterion("ENGNAME not like", value, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameIn(List<String> values) {
            addCriterion("ENGNAME in", values, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotIn(List<String> values) {
            addCriterion("ENGNAME not in", values, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameBetween(String value1, String value2) {
            addCriterion("ENGNAME between", value1, value2, "engname");
            return (Criteria) this;
        }

        public Criteria andEngnameNotBetween(String value1, String value2) {
            addCriterion("ENGNAME not between", value1, value2, "engname");
            return (Criteria) this;
        }

        public Criteria andSpellIsNull() {
            addCriterion("SPELL is null");
            return (Criteria) this;
        }

        public Criteria andSpellIsNotNull() {
            addCriterion("SPELL is not null");
            return (Criteria) this;
        }

        public Criteria andSpellEqualTo(String value) {
            addCriterion("SPELL =", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotEqualTo(String value) {
            addCriterion("SPELL <>", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellGreaterThan(String value) {
            addCriterion("SPELL >", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellGreaterThanOrEqualTo(String value) {
            addCriterion("SPELL >=", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLessThan(String value) {
            addCriterion("SPELL <", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLessThanOrEqualTo(String value) {
            addCriterion("SPELL <=", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellLike(String value) {
            addCriterion("SPELL like", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotLike(String value) {
            addCriterion("SPELL not like", value, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellIn(List<String> values) {
            addCriterion("SPELL in", values, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotIn(List<String> values) {
            addCriterion("SPELL not in", values, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellBetween(String value1, String value2) {
            addCriterion("SPELL between", value1, value2, "spell");
            return (Criteria) this;
        }

        public Criteria andSpellNotBetween(String value1, String value2) {
            addCriterion("SPELL not between", value1, value2, "spell");
            return (Criteria) this;
        }

        public Criteria andWbspellIsNull() {
            addCriterion("WBSPELL is null");
            return (Criteria) this;
        }

        public Criteria andWbspellIsNotNull() {
            addCriterion("WBSPELL is not null");
            return (Criteria) this;
        }

        public Criteria andWbspellEqualTo(String value) {
            addCriterion("WBSPELL =", value, "wbspell");
            return (Criteria) this;
        }

        public Criteria andWbspellNotEqualTo(String value) {
            addCriterion("WBSPELL <>", value, "wbspell");
            return (Criteria) this;
        }

        public Criteria andWbspellGreaterThan(String value) {
            addCriterion("WBSPELL >", value, "wbspell");
            return (Criteria) this;
        }

        public Criteria andWbspellGreaterThanOrEqualTo(String value) {
            addCriterion("WBSPELL >=", value, "wbspell");
            return (Criteria) this;
        }

        public Criteria andWbspellLessThan(String value) {
            addCriterion("WBSPELL <", value, "wbspell");
            return (Criteria) this;
        }

        public Criteria andWbspellLessThanOrEqualTo(String value) {
            addCriterion("WBSPELL <=", value, "wbspell");
            return (Criteria) this;
        }

        public Criteria andWbspellLike(String value) {
            addCriterion("WBSPELL like", value, "wbspell");
            return (Criteria) this;
        }

        public Criteria andWbspellNotLike(String value) {
            addCriterion("WBSPELL not like", value, "wbspell");
            return (Criteria) this;
        }

        public Criteria andWbspellIn(List<String> values) {
            addCriterion("WBSPELL in", values, "wbspell");
            return (Criteria) this;
        }

        public Criteria andWbspellNotIn(List<String> values) {
            addCriterion("WBSPELL not in", values, "wbspell");
            return (Criteria) this;
        }

        public Criteria andWbspellBetween(String value1, String value2) {
            addCriterion("WBSPELL between", value1, value2, "wbspell");
            return (Criteria) this;
        }

        public Criteria andWbspellNotBetween(String value1, String value2) {
            addCriterion("WBSPELL not between", value1, value2, "wbspell");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
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

        public Criteria andIdtypeIsNull() {
            addCriterion("IDTYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdtypeIsNotNull() {
            addCriterion("IDTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdtypeEqualTo(String value) {
            addCriterion("IDTYPE =", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotEqualTo(String value) {
            addCriterion("IDTYPE <>", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeGreaterThan(String value) {
            addCriterion("IDTYPE >", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeGreaterThanOrEqualTo(String value) {
            addCriterion("IDTYPE >=", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeLessThan(String value) {
            addCriterion("IDTYPE <", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeLessThanOrEqualTo(String value) {
            addCriterion("IDTYPE <=", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeLike(String value) {
            addCriterion("IDTYPE like", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotLike(String value) {
            addCriterion("IDTYPE not like", value, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeIn(List<String> values) {
            addCriterion("IDTYPE in", values, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotIn(List<String> values) {
            addCriterion("IDTYPE not in", values, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeBetween(String value1, String value2) {
            addCriterion("IDTYPE between", value1, value2, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdtypeNotBetween(String value1, String value2) {
            addCriterion("IDTYPE not between", value1, value2, "idtype");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNull() {
            addCriterion("IDNO is null");
            return (Criteria) this;
        }

        public Criteria andIdnoIsNotNull() {
            addCriterion("IDNO is not null");
            return (Criteria) this;
        }

        public Criteria andIdnoEqualTo(String value) {
            addCriterion("IDNO =", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotEqualTo(String value) {
            addCriterion("IDNO <>", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThan(String value) {
            addCriterion("IDNO >", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoGreaterThanOrEqualTo(String value) {
            addCriterion("IDNO >=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThan(String value) {
            addCriterion("IDNO <", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLessThanOrEqualTo(String value) {
            addCriterion("IDNO <=", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoLike(String value) {
            addCriterion("IDNO like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotLike(String value) {
            addCriterion("IDNO not like", value, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoIn(List<String> values) {
            addCriterion("IDNO in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotIn(List<String> values) {
            addCriterion("IDNO not in", values, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoBetween(String value1, String value2) {
            addCriterion("IDNO between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andIdnoNotBetween(String value1, String value2) {
            addCriterion("IDNO not between", value1, value2, "idno");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("JOB is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("JOB is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("JOB =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("JOB <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("JOB >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("JOB >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("JOB <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("JOB <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("JOB like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("JOB not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("JOB in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("JOB not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("JOB between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("JOB not between", value1, value2, "job");
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

        public Criteria andWechatIsNull() {
            addCriterion("WECHAT is null");
            return (Criteria) this;
        }

        public Criteria andWechatIsNotNull() {
            addCriterion("WECHAT is not null");
            return (Criteria) this;
        }

        public Criteria andWechatEqualTo(String value) {
            addCriterion("WECHAT =", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotEqualTo(String value) {
            addCriterion("WECHAT <>", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThan(String value) {
            addCriterion("WECHAT >", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatGreaterThanOrEqualTo(String value) {
            addCriterion("WECHAT >=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThan(String value) {
            addCriterion("WECHAT <", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLessThanOrEqualTo(String value) {
            addCriterion("WECHAT <=", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatLike(String value) {
            addCriterion("WECHAT like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotLike(String value) {
            addCriterion("WECHAT not like", value, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatIn(List<String> values) {
            addCriterion("WECHAT in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotIn(List<String> values) {
            addCriterion("WECHAT not in", values, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatBetween(String value1, String value2) {
            addCriterion("WECHAT between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andWechatNotBetween(String value1, String value2) {
            addCriterion("WECHAT not between", value1, value2, "wechat");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
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

        public Criteria andPatientlevelIsNull() {
            addCriterion("PATIENTLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andPatientlevelIsNotNull() {
            addCriterion("PATIENTLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andPatientlevelEqualTo(String value) {
            addCriterion("PATIENTLEVEL =", value, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelNotEqualTo(String value) {
            addCriterion("PATIENTLEVEL <>", value, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelGreaterThan(String value) {
            addCriterion("PATIENTLEVEL >", value, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENTLEVEL >=", value, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelLessThan(String value) {
            addCriterion("PATIENTLEVEL <", value, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelLessThanOrEqualTo(String value) {
            addCriterion("PATIENTLEVEL <=", value, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelLike(String value) {
            addCriterion("PATIENTLEVEL like", value, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelNotLike(String value) {
            addCriterion("PATIENTLEVEL not like", value, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelIn(List<String> values) {
            addCriterion("PATIENTLEVEL in", values, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelNotIn(List<String> values) {
            addCriterion("PATIENTLEVEL not in", values, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelBetween(String value1, String value2) {
            addCriterion("PATIENTLEVEL between", value1, value2, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelNotBetween(String value1, String value2) {
            addCriterion("PATIENTLEVEL not between", value1, value2, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatienttypeIsNull() {
            addCriterion("PATIENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPatienttypeIsNotNull() {
            addCriterion("PATIENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPatienttypeEqualTo(String value) {
            addCriterion("PATIENTTYPE =", value, "patienttype");
            return (Criteria) this;
        }

        public Criteria andPatienttypeNotEqualTo(String value) {
            addCriterion("PATIENTTYPE <>", value, "patienttype");
            return (Criteria) this;
        }

        public Criteria andPatienttypeGreaterThan(String value) {
            addCriterion("PATIENTTYPE >", value, "patienttype");
            return (Criteria) this;
        }

        public Criteria andPatienttypeGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENTTYPE >=", value, "patienttype");
            return (Criteria) this;
        }

        public Criteria andPatienttypeLessThan(String value) {
            addCriterion("PATIENTTYPE <", value, "patienttype");
            return (Criteria) this;
        }

        public Criteria andPatienttypeLessThanOrEqualTo(String value) {
            addCriterion("PATIENTTYPE <=", value, "patienttype");
            return (Criteria) this;
        }

        public Criteria andPatienttypeLike(String value) {
            addCriterion("PATIENTTYPE like", value, "patienttype");
            return (Criteria) this;
        }

        public Criteria andPatienttypeNotLike(String value) {
            addCriterion("PATIENTTYPE not like", value, "patienttype");
            return (Criteria) this;
        }

        public Criteria andPatienttypeIn(List<String> values) {
            addCriterion("PATIENTTYPE in", values, "patienttype");
            return (Criteria) this;
        }

        public Criteria andPatienttypeNotIn(List<String> values) {
            addCriterion("PATIENTTYPE not in", values, "patienttype");
            return (Criteria) this;
        }

        public Criteria andPatienttypeBetween(String value1, String value2) {
            addCriterion("PATIENTTYPE between", value1, value2, "patienttype");
            return (Criteria) this;
        }

        public Criteria andPatienttypeNotBetween(String value1, String value2) {
            addCriterion("PATIENTTYPE not between", value1, value2, "patienttype");
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

        public Criteria andDelivertimesIsNull() {
            addCriterion("DELIVERTIMES is null");
            return (Criteria) this;
        }

        public Criteria andDelivertimesIsNotNull() {
            addCriterion("DELIVERTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andDelivertimesEqualTo(Integer value) {
            addCriterion("DELIVERTIMES =", value, "delivertimes");
            return (Criteria) this;
        }

        public Criteria andDelivertimesNotEqualTo(Integer value) {
            addCriterion("DELIVERTIMES <>", value, "delivertimes");
            return (Criteria) this;
        }

        public Criteria andDelivertimesGreaterThan(Integer value) {
            addCriterion("DELIVERTIMES >", value, "delivertimes");
            return (Criteria) this;
        }

        public Criteria andDelivertimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("DELIVERTIMES >=", value, "delivertimes");
            return (Criteria) this;
        }

        public Criteria andDelivertimesLessThan(Integer value) {
            addCriterion("DELIVERTIMES <", value, "delivertimes");
            return (Criteria) this;
        }

        public Criteria andDelivertimesLessThanOrEqualTo(Integer value) {
            addCriterion("DELIVERTIMES <=", value, "delivertimes");
            return (Criteria) this;
        }

        public Criteria andDelivertimesIn(List<Integer> values) {
            addCriterion("DELIVERTIMES in", values, "delivertimes");
            return (Criteria) this;
        }

        public Criteria andDelivertimesNotIn(List<Integer> values) {
            addCriterion("DELIVERTIMES not in", values, "delivertimes");
            return (Criteria) this;
        }

        public Criteria andDelivertimesBetween(Integer value1, Integer value2) {
            addCriterion("DELIVERTIMES between", value1, value2, "delivertimes");
            return (Criteria) this;
        }

        public Criteria andDelivertimesNotBetween(Integer value1, Integer value2) {
            addCriterion("DELIVERTIMES not between", value1, value2, "delivertimes");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeIsNull() {
            addCriterion("EXPECTEDTIME is null");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeIsNotNull() {
            addCriterion("EXPECTEDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeEqualTo(Date value) {
            addCriterion("EXPECTEDTIME =", value, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeNotEqualTo(Date value) {
            addCriterion("EXPECTEDTIME <>", value, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeGreaterThan(Date value) {
            addCriterion("EXPECTEDTIME >", value, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EXPECTEDTIME >=", value, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeLessThan(Date value) {
            addCriterion("EXPECTEDTIME <", value, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeLessThanOrEqualTo(Date value) {
            addCriterion("EXPECTEDTIME <=", value, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeIn(List<Date> values) {
            addCriterion("EXPECTEDTIME in", values, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeNotIn(List<Date> values) {
            addCriterion("EXPECTEDTIME not in", values, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeBetween(Date value1, Date value2) {
            addCriterion("EXPECTEDTIME between", value1, value2, "expectedtime");
            return (Criteria) this;
        }

        public Criteria andExpectedtimeNotBetween(Date value1, Date value2) {
            addCriterion("EXPECTEDTIME not between", value1, value2, "expectedtime");
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

        public Criteria andCmanagerIsNull() {
            addCriterion("CMANAGER is null");
            return (Criteria) this;
        }

        public Criteria andCmanagerIsNotNull() {
            addCriterion("CMANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andCmanagerEqualTo(String value) {
            addCriterion("CMANAGER =", value, "cmanager");
            return (Criteria) this;
        }

        public Criteria andCmanagerNotEqualTo(String value) {
            addCriterion("CMANAGER <>", value, "cmanager");
            return (Criteria) this;
        }

        public Criteria andCmanagerGreaterThan(String value) {
            addCriterion("CMANAGER >", value, "cmanager");
            return (Criteria) this;
        }

        public Criteria andCmanagerGreaterThanOrEqualTo(String value) {
            addCriterion("CMANAGER >=", value, "cmanager");
            return (Criteria) this;
        }

        public Criteria andCmanagerLessThan(String value) {
            addCriterion("CMANAGER <", value, "cmanager");
            return (Criteria) this;
        }

        public Criteria andCmanagerLessThanOrEqualTo(String value) {
            addCriterion("CMANAGER <=", value, "cmanager");
            return (Criteria) this;
        }

        public Criteria andCmanagerLike(String value) {
            addCriterion("CMANAGER like", value, "cmanager");
            return (Criteria) this;
        }

        public Criteria andCmanagerNotLike(String value) {
            addCriterion("CMANAGER not like", value, "cmanager");
            return (Criteria) this;
        }

        public Criteria andCmanagerIn(List<String> values) {
            addCriterion("CMANAGER in", values, "cmanager");
            return (Criteria) this;
        }

        public Criteria andCmanagerNotIn(List<String> values) {
            addCriterion("CMANAGER not in", values, "cmanager");
            return (Criteria) this;
        }

        public Criteria andCmanagerBetween(String value1, String value2) {
            addCriterion("CMANAGER between", value1, value2, "cmanager");
            return (Criteria) this;
        }

        public Criteria andCmanagerNotBetween(String value1, String value2) {
            addCriterion("CMANAGER not between", value1, value2, "cmanager");
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

        public Criteria andOthermemoIsNull() {
            addCriterion("OTHERMEMO is null");
            return (Criteria) this;
        }

        public Criteria andOthermemoIsNotNull() {
            addCriterion("OTHERMEMO is not null");
            return (Criteria) this;
        }

        public Criteria andOthermemoEqualTo(String value) {
            addCriterion("OTHERMEMO =", value, "othermemo");
            return (Criteria) this;
        }

        public Criteria andOthermemoNotEqualTo(String value) {
            addCriterion("OTHERMEMO <>", value, "othermemo");
            return (Criteria) this;
        }

        public Criteria andOthermemoGreaterThan(String value) {
            addCriterion("OTHERMEMO >", value, "othermemo");
            return (Criteria) this;
        }

        public Criteria andOthermemoGreaterThanOrEqualTo(String value) {
            addCriterion("OTHERMEMO >=", value, "othermemo");
            return (Criteria) this;
        }

        public Criteria andOthermemoLessThan(String value) {
            addCriterion("OTHERMEMO <", value, "othermemo");
            return (Criteria) this;
        }

        public Criteria andOthermemoLessThanOrEqualTo(String value) {
            addCriterion("OTHERMEMO <=", value, "othermemo");
            return (Criteria) this;
        }

        public Criteria andOthermemoLike(String value) {
            addCriterion("OTHERMEMO like", value, "othermemo");
            return (Criteria) this;
        }

        public Criteria andOthermemoNotLike(String value) {
            addCriterion("OTHERMEMO not like", value, "othermemo");
            return (Criteria) this;
        }

        public Criteria andOthermemoIn(List<String> values) {
            addCriterion("OTHERMEMO in", values, "othermemo");
            return (Criteria) this;
        }

        public Criteria andOthermemoNotIn(List<String> values) {
            addCriterion("OTHERMEMO not in", values, "othermemo");
            return (Criteria) this;
        }

        public Criteria andOthermemoBetween(String value1, String value2) {
            addCriterion("OTHERMEMO between", value1, value2, "othermemo");
            return (Criteria) this;
        }

        public Criteria andOthermemoNotBetween(String value1, String value2) {
            addCriterion("OTHERMEMO not between", value1, value2, "othermemo");
            return (Criteria) this;
        }

        public Criteria andFirstvisittimeIsNull() {
            addCriterion("FIRSTVISITTIME is null");
            return (Criteria) this;
        }

        public Criteria andFirstvisittimeIsNotNull() {
            addCriterion("FIRSTVISITTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstvisittimeEqualTo(Date value) {
            addCriterion("FIRSTVISITTIME =", value, "firstvisittime");
            return (Criteria) this;
        }

        public Criteria andFirstvisittimeNotEqualTo(Date value) {
            addCriterion("FIRSTVISITTIME <>", value, "firstvisittime");
            return (Criteria) this;
        }

        public Criteria andFirstvisittimeGreaterThan(Date value) {
            addCriterion("FIRSTVISITTIME >", value, "firstvisittime");
            return (Criteria) this;
        }

        public Criteria andFirstvisittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FIRSTVISITTIME >=", value, "firstvisittime");
            return (Criteria) this;
        }

        public Criteria andFirstvisittimeLessThan(Date value) {
            addCriterion("FIRSTVISITTIME <", value, "firstvisittime");
            return (Criteria) this;
        }

        public Criteria andFirstvisittimeLessThanOrEqualTo(Date value) {
            addCriterion("FIRSTVISITTIME <=", value, "firstvisittime");
            return (Criteria) this;
        }

        public Criteria andFirstvisittimeIn(List<Date> values) {
            addCriterion("FIRSTVISITTIME in", values, "firstvisittime");
            return (Criteria) this;
        }

        public Criteria andFirstvisittimeNotIn(List<Date> values) {
            addCriterion("FIRSTVISITTIME not in", values, "firstvisittime");
            return (Criteria) this;
        }

        public Criteria andFirstvisittimeBetween(Date value1, Date value2) {
            addCriterion("FIRSTVISITTIME between", value1, value2, "firstvisittime");
            return (Criteria) this;
        }

        public Criteria andFirstvisittimeNotBetween(Date value1, Date value2) {
            addCriterion("FIRSTVISITTIME not between", value1, value2, "firstvisittime");
            return (Criteria) this;
        }

        public Criteria andLastvisitimeIsNull() {
            addCriterion("LASTVISITIME is null");
            return (Criteria) this;
        }

        public Criteria andLastvisitimeIsNotNull() {
            addCriterion("LASTVISITIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastvisitimeEqualTo(Date value) {
            addCriterion("LASTVISITIME =", value, "lastvisitime");
            return (Criteria) this;
        }

        public Criteria andLastvisitimeNotEqualTo(Date value) {
            addCriterion("LASTVISITIME <>", value, "lastvisitime");
            return (Criteria) this;
        }

        public Criteria andLastvisitimeGreaterThan(Date value) {
            addCriterion("LASTVISITIME >", value, "lastvisitime");
            return (Criteria) this;
        }

        public Criteria andLastvisitimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTVISITIME >=", value, "lastvisitime");
            return (Criteria) this;
        }

        public Criteria andLastvisitimeLessThan(Date value) {
            addCriterion("LASTVISITIME <", value, "lastvisitime");
            return (Criteria) this;
        }

        public Criteria andLastvisitimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTVISITIME <=", value, "lastvisitime");
            return (Criteria) this;
        }

        public Criteria andLastvisitimeIn(List<Date> values) {
            addCriterion("LASTVISITIME in", values, "lastvisitime");
            return (Criteria) this;
        }

        public Criteria andLastvisitimeNotIn(List<Date> values) {
            addCriterion("LASTVISITIME not in", values, "lastvisitime");
            return (Criteria) this;
        }

        public Criteria andLastvisitimeBetween(Date value1, Date value2) {
            addCriterion("LASTVISITIME between", value1, value2, "lastvisitime");
            return (Criteria) this;
        }

        public Criteria andLastvisitimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTVISITIME not between", value1, value2, "lastvisitime");
            return (Criteria) this;
        }

        public Criteria andTotcostIsNull() {
            addCriterion("TOTCOST is null");
            return (Criteria) this;
        }

        public Criteria andTotcostIsNotNull() {
            addCriterion("TOTCOST is not null");
            return (Criteria) this;
        }

        public Criteria andTotcostEqualTo(BigDecimal value) {
            addCriterion("TOTCOST =", value, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostNotEqualTo(BigDecimal value) {
            addCriterion("TOTCOST <>", value, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostGreaterThan(BigDecimal value) {
            addCriterion("TOTCOST >", value, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTCOST >=", value, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostLessThan(BigDecimal value) {
            addCriterion("TOTCOST <", value, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTCOST <=", value, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostIn(List<BigDecimal> values) {
            addCriterion("TOTCOST in", values, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostNotIn(List<BigDecimal> values) {
            addCriterion("TOTCOST not in", values, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTCOST between", value1, value2, "totcost");
            return (Criteria) this;
        }

        public Criteria andTotcostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTCOST not between", value1, value2, "totcost");
            return (Criteria) this;
        }

        public Criteria andIntegrationIsNull() {
            addCriterion("INTEGRATION is null");
            return (Criteria) this;
        }

        public Criteria andIntegrationIsNotNull() {
            addCriterion("INTEGRATION is not null");
            return (Criteria) this;
        }

        public Criteria andIntegrationEqualTo(BigDecimal value) {
            addCriterion("INTEGRATION =", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationNotEqualTo(BigDecimal value) {
            addCriterion("INTEGRATION <>", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationGreaterThan(BigDecimal value) {
            addCriterion("INTEGRATION >", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INTEGRATION >=", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationLessThan(BigDecimal value) {
            addCriterion("INTEGRATION <", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INTEGRATION <=", value, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationIn(List<BigDecimal> values) {
            addCriterion("INTEGRATION in", values, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationNotIn(List<BigDecimal> values) {
            addCriterion("INTEGRATION not in", values, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTEGRATION between", value1, value2, "integration");
            return (Criteria) this;
        }

        public Criteria andIntegrationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INTEGRATION not between", value1, value2, "integration");
            return (Criteria) this;
        }

        public Criteria andExtfield01IsNull() {
            addCriterion("EXTFIELD01 is null");
            return (Criteria) this;
        }

        public Criteria andExtfield01IsNotNull() {
            addCriterion("EXTFIELD01 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfield01EqualTo(String value) {
            addCriterion("EXTFIELD01 =", value, "extfield01");
            return (Criteria) this;
        }

        public Criteria andExtfield01NotEqualTo(String value) {
            addCriterion("EXTFIELD01 <>", value, "extfield01");
            return (Criteria) this;
        }

        public Criteria andExtfield01GreaterThan(String value) {
            addCriterion("EXTFIELD01 >", value, "extfield01");
            return (Criteria) this;
        }

        public Criteria andExtfield01GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFIELD01 >=", value, "extfield01");
            return (Criteria) this;
        }

        public Criteria andExtfield01LessThan(String value) {
            addCriterion("EXTFIELD01 <", value, "extfield01");
            return (Criteria) this;
        }

        public Criteria andExtfield01LessThanOrEqualTo(String value) {
            addCriterion("EXTFIELD01 <=", value, "extfield01");
            return (Criteria) this;
        }

        public Criteria andExtfield01Like(String value) {
            addCriterion("EXTFIELD01 like", value, "extfield01");
            return (Criteria) this;
        }

        public Criteria andExtfield01NotLike(String value) {
            addCriterion("EXTFIELD01 not like", value, "extfield01");
            return (Criteria) this;
        }

        public Criteria andExtfield01In(List<String> values) {
            addCriterion("EXTFIELD01 in", values, "extfield01");
            return (Criteria) this;
        }

        public Criteria andExtfield01NotIn(List<String> values) {
            addCriterion("EXTFIELD01 not in", values, "extfield01");
            return (Criteria) this;
        }

        public Criteria andExtfield01Between(String value1, String value2) {
            addCriterion("EXTFIELD01 between", value1, value2, "extfield01");
            return (Criteria) this;
        }

        public Criteria andExtfield01NotBetween(String value1, String value2) {
            addCriterion("EXTFIELD01 not between", value1, value2, "extfield01");
            return (Criteria) this;
        }

        public Criteria andExtfield02IsNull() {
            addCriterion("EXTFIELD02 is null");
            return (Criteria) this;
        }

        public Criteria andExtfield02IsNotNull() {
            addCriterion("EXTFIELD02 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfield02EqualTo(String value) {
            addCriterion("EXTFIELD02 =", value, "extfield02");
            return (Criteria) this;
        }

        public Criteria andExtfield02NotEqualTo(String value) {
            addCriterion("EXTFIELD02 <>", value, "extfield02");
            return (Criteria) this;
        }

        public Criteria andExtfield02GreaterThan(String value) {
            addCriterion("EXTFIELD02 >", value, "extfield02");
            return (Criteria) this;
        }

        public Criteria andExtfield02GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFIELD02 >=", value, "extfield02");
            return (Criteria) this;
        }

        public Criteria andExtfield02LessThan(String value) {
            addCriterion("EXTFIELD02 <", value, "extfield02");
            return (Criteria) this;
        }

        public Criteria andExtfield02LessThanOrEqualTo(String value) {
            addCriterion("EXTFIELD02 <=", value, "extfield02");
            return (Criteria) this;
        }

        public Criteria andExtfield02Like(String value) {
            addCriterion("EXTFIELD02 like", value, "extfield02");
            return (Criteria) this;
        }

        public Criteria andExtfield02NotLike(String value) {
            addCriterion("EXTFIELD02 not like", value, "extfield02");
            return (Criteria) this;
        }

        public Criteria andExtfield02In(List<String> values) {
            addCriterion("EXTFIELD02 in", values, "extfield02");
            return (Criteria) this;
        }

        public Criteria andExtfield02NotIn(List<String> values) {
            addCriterion("EXTFIELD02 not in", values, "extfield02");
            return (Criteria) this;
        }

        public Criteria andExtfield02Between(String value1, String value2) {
            addCriterion("EXTFIELD02 between", value1, value2, "extfield02");
            return (Criteria) this;
        }

        public Criteria andExtfield02NotBetween(String value1, String value2) {
            addCriterion("EXTFIELD02 not between", value1, value2, "extfield02");
            return (Criteria) this;
        }

        public Criteria andExtfield03IsNull() {
            addCriterion("EXTFIELD03 is null");
            return (Criteria) this;
        }

        public Criteria andExtfield03IsNotNull() {
            addCriterion("EXTFIELD03 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfield03EqualTo(String value) {
            addCriterion("EXTFIELD03 =", value, "extfield03");
            return (Criteria) this;
        }

        public Criteria andExtfield03NotEqualTo(String value) {
            addCriterion("EXTFIELD03 <>", value, "extfield03");
            return (Criteria) this;
        }

        public Criteria andExtfield03GreaterThan(String value) {
            addCriterion("EXTFIELD03 >", value, "extfield03");
            return (Criteria) this;
        }

        public Criteria andExtfield03GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFIELD03 >=", value, "extfield03");
            return (Criteria) this;
        }

        public Criteria andExtfield03LessThan(String value) {
            addCriterion("EXTFIELD03 <", value, "extfield03");
            return (Criteria) this;
        }

        public Criteria andExtfield03LessThanOrEqualTo(String value) {
            addCriterion("EXTFIELD03 <=", value, "extfield03");
            return (Criteria) this;
        }

        public Criteria andExtfield03Like(String value) {
            addCriterion("EXTFIELD03 like", value, "extfield03");
            return (Criteria) this;
        }

        public Criteria andExtfield03NotLike(String value) {
            addCriterion("EXTFIELD03 not like", value, "extfield03");
            return (Criteria) this;
        }

        public Criteria andExtfield03In(List<String> values) {
            addCriterion("EXTFIELD03 in", values, "extfield03");
            return (Criteria) this;
        }

        public Criteria andExtfield03NotIn(List<String> values) {
            addCriterion("EXTFIELD03 not in", values, "extfield03");
            return (Criteria) this;
        }

        public Criteria andExtfield03Between(String value1, String value2) {
            addCriterion("EXTFIELD03 between", value1, value2, "extfield03");
            return (Criteria) this;
        }

        public Criteria andExtfield03NotBetween(String value1, String value2) {
            addCriterion("EXTFIELD03 not between", value1, value2, "extfield03");
            return (Criteria) this;
        }

        public Criteria andHospitalidIsNull() {
            addCriterion("HOSPITALID is null");
            return (Criteria) this;
        }

        public Criteria andHospitalidIsNotNull() {
            addCriterion("HOSPITALID is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalidEqualTo(String value) {
            addCriterion("HOSPITALID =", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotEqualTo(String value) {
            addCriterion("HOSPITALID <>", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidGreaterThan(String value) {
            addCriterion("HOSPITALID >", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidGreaterThanOrEqualTo(String value) {
            addCriterion("HOSPITALID >=", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidLessThan(String value) {
            addCriterion("HOSPITALID <", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidLessThanOrEqualTo(String value) {
            addCriterion("HOSPITALID <=", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidLike(String value) {
            addCriterion("HOSPITALID like", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotLike(String value) {
            addCriterion("HOSPITALID not like", value, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidIn(List<String> values) {
            addCriterion("HOSPITALID in", values, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotIn(List<String> values) {
            addCriterion("HOSPITALID not in", values, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidBetween(String value1, String value2) {
            addCriterion("HOSPITALID between", value1, value2, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalidNotBetween(String value1, String value2) {
            addCriterion("HOSPITALID not between", value1, value2, "hospitalid");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIsNull() {
            addCriterion("HOSPITALNAME is null");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIsNotNull() {
            addCriterion("HOSPITALNAME is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalnameEqualTo(String value) {
            addCriterion("HOSPITALNAME =", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotEqualTo(String value) {
            addCriterion("HOSPITALNAME <>", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameGreaterThan(String value) {
            addCriterion("HOSPITALNAME >", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameGreaterThanOrEqualTo(String value) {
            addCriterion("HOSPITALNAME >=", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLessThan(String value) {
            addCriterion("HOSPITALNAME <", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLessThanOrEqualTo(String value) {
            addCriterion("HOSPITALNAME <=", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameLike(String value) {
            addCriterion("HOSPITALNAME like", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotLike(String value) {
            addCriterion("HOSPITALNAME not like", value, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameIn(List<String> values) {
            addCriterion("HOSPITALNAME in", values, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotIn(List<String> values) {
            addCriterion("HOSPITALNAME not in", values, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameBetween(String value1, String value2) {
            addCriterion("HOSPITALNAME between", value1, value2, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andHospitalnameNotBetween(String value1, String value2) {
            addCriterion("HOSPITALNAME not between", value1, value2, "hospitalname");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreateoperIsNull() {
            addCriterion("CREATEOPER is null");
            return (Criteria) this;
        }

        public Criteria andCreateoperIsNotNull() {
            addCriterion("CREATEOPER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateoperEqualTo(String value) {
            addCriterion("CREATEOPER =", value, "createoper");
            return (Criteria) this;
        }

        public Criteria andCreateoperNotEqualTo(String value) {
            addCriterion("CREATEOPER <>", value, "createoper");
            return (Criteria) this;
        }

        public Criteria andCreateoperGreaterThan(String value) {
            addCriterion("CREATEOPER >", value, "createoper");
            return (Criteria) this;
        }

        public Criteria andCreateoperGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEOPER >=", value, "createoper");
            return (Criteria) this;
        }

        public Criteria andCreateoperLessThan(String value) {
            addCriterion("CREATEOPER <", value, "createoper");
            return (Criteria) this;
        }

        public Criteria andCreateoperLessThanOrEqualTo(String value) {
            addCriterion("CREATEOPER <=", value, "createoper");
            return (Criteria) this;
        }

        public Criteria andCreateoperLike(String value) {
            addCriterion("CREATEOPER like", value, "createoper");
            return (Criteria) this;
        }

        public Criteria andCreateoperNotLike(String value) {
            addCriterion("CREATEOPER not like", value, "createoper");
            return (Criteria) this;
        }

        public Criteria andCreateoperIn(List<String> values) {
            addCriterion("CREATEOPER in", values, "createoper");
            return (Criteria) this;
        }

        public Criteria andCreateoperNotIn(List<String> values) {
            addCriterion("CREATEOPER not in", values, "createoper");
            return (Criteria) this;
        }

        public Criteria andCreateoperBetween(String value1, String value2) {
            addCriterion("CREATEOPER between", value1, value2, "createoper");
            return (Criteria) this;
        }

        public Criteria andCreateoperNotBetween(String value1, String value2) {
            addCriterion("CREATEOPER not between", value1, value2, "createoper");
            return (Criteria) this;
        }

        public Criteria andLastmodifiytimeIsNull() {
            addCriterion("LASTMODIFIYTIME is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiytimeIsNotNull() {
            addCriterion("LASTMODIFIYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiytimeEqualTo(Date value) {
            addCriterion("LASTMODIFIYTIME =", value, "lastmodifiytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifiytimeNotEqualTo(Date value) {
            addCriterion("LASTMODIFIYTIME <>", value, "lastmodifiytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifiytimeGreaterThan(Date value) {
            addCriterion("LASTMODIFIYTIME >", value, "lastmodifiytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifiytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTMODIFIYTIME >=", value, "lastmodifiytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifiytimeLessThan(Date value) {
            addCriterion("LASTMODIFIYTIME <", value, "lastmodifiytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifiytimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTMODIFIYTIME <=", value, "lastmodifiytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifiytimeIn(List<Date> values) {
            addCriterion("LASTMODIFIYTIME in", values, "lastmodifiytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifiytimeNotIn(List<Date> values) {
            addCriterion("LASTMODIFIYTIME not in", values, "lastmodifiytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifiytimeBetween(Date value1, Date value2) {
            addCriterion("LASTMODIFIYTIME between", value1, value2, "lastmodifiytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifiytimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTMODIFIYTIME not between", value1, value2, "lastmodifiytime");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyoperidIsNull() {
            addCriterion("LASTMODIFIYOPERID is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyoperidIsNotNull() {
            addCriterion("LASTMODIFIYOPERID is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyoperidEqualTo(String value) {
            addCriterion("LASTMODIFIYOPERID =", value, "lastmodifiyoperid");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyoperidNotEqualTo(String value) {
            addCriterion("LASTMODIFIYOPERID <>", value, "lastmodifiyoperid");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyoperidGreaterThan(String value) {
            addCriterion("LASTMODIFIYOPERID >", value, "lastmodifiyoperid");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyoperidGreaterThanOrEqualTo(String value) {
            addCriterion("LASTMODIFIYOPERID >=", value, "lastmodifiyoperid");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyoperidLessThan(String value) {
            addCriterion("LASTMODIFIYOPERID <", value, "lastmodifiyoperid");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyoperidLessThanOrEqualTo(String value) {
            addCriterion("LASTMODIFIYOPERID <=", value, "lastmodifiyoperid");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyoperidLike(String value) {
            addCriterion("LASTMODIFIYOPERID like", value, "lastmodifiyoperid");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyoperidNotLike(String value) {
            addCriterion("LASTMODIFIYOPERID not like", value, "lastmodifiyoperid");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyoperidIn(List<String> values) {
            addCriterion("LASTMODIFIYOPERID in", values, "lastmodifiyoperid");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyoperidNotIn(List<String> values) {
            addCriterion("LASTMODIFIYOPERID not in", values, "lastmodifiyoperid");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyoperidBetween(String value1, String value2) {
            addCriterion("LASTMODIFIYOPERID between", value1, value2, "lastmodifiyoperid");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyoperidNotBetween(String value1, String value2) {
            addCriterion("LASTMODIFIYOPERID not between", value1, value2, "lastmodifiyoperid");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyopernameIsNull() {
            addCriterion("LASTMODIFIYOPERNAME is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyopernameIsNotNull() {
            addCriterion("LASTMODIFIYOPERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyopernameEqualTo(String value) {
            addCriterion("LASTMODIFIYOPERNAME =", value, "lastmodifiyopername");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyopernameNotEqualTo(String value) {
            addCriterion("LASTMODIFIYOPERNAME <>", value, "lastmodifiyopername");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyopernameGreaterThan(String value) {
            addCriterion("LASTMODIFIYOPERNAME >", value, "lastmodifiyopername");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyopernameGreaterThanOrEqualTo(String value) {
            addCriterion("LASTMODIFIYOPERNAME >=", value, "lastmodifiyopername");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyopernameLessThan(String value) {
            addCriterion("LASTMODIFIYOPERNAME <", value, "lastmodifiyopername");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyopernameLessThanOrEqualTo(String value) {
            addCriterion("LASTMODIFIYOPERNAME <=", value, "lastmodifiyopername");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyopernameLike(String value) {
            addCriterion("LASTMODIFIYOPERNAME like", value, "lastmodifiyopername");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyopernameNotLike(String value) {
            addCriterion("LASTMODIFIYOPERNAME not like", value, "lastmodifiyopername");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyopernameIn(List<String> values) {
            addCriterion("LASTMODIFIYOPERNAME in", values, "lastmodifiyopername");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyopernameNotIn(List<String> values) {
            addCriterion("LASTMODIFIYOPERNAME not in", values, "lastmodifiyopername");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyopernameBetween(String value1, String value2) {
            addCriterion("LASTMODIFIYOPERNAME between", value1, value2, "lastmodifiyopername");
            return (Criteria) this;
        }

        public Criteria andLastmodifiyopernameNotBetween(String value1, String value2) {
            addCriterion("LASTMODIFIYOPERNAME not between", value1, value2, "lastmodifiyopername");
            return (Criteria) this;
        }

        public Criteria andValidflagIsNull() {
            addCriterion("VALIDFLAG is null");
            return (Criteria) this;
        }

        public Criteria andValidflagIsNotNull() {
            addCriterion("VALIDFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andValidflagEqualTo(String value) {
            addCriterion("VALIDFLAG =", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotEqualTo(String value) {
            addCriterion("VALIDFLAG <>", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagGreaterThan(String value) {
            addCriterion("VALIDFLAG >", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagGreaterThanOrEqualTo(String value) {
            addCriterion("VALIDFLAG >=", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagLessThan(String value) {
            addCriterion("VALIDFLAG <", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagLessThanOrEqualTo(String value) {
            addCriterion("VALIDFLAG <=", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagLike(String value) {
            addCriterion("VALIDFLAG like", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotLike(String value) {
            addCriterion("VALIDFLAG not like", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagIn(List<String> values) {
            addCriterion("VALIDFLAG in", values, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotIn(List<String> values) {
            addCriterion("VALIDFLAG not in", values, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagBetween(String value1, String value2) {
            addCriterion("VALIDFLAG between", value1, value2, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotBetween(String value1, String value2) {
            addCriterion("VALIDFLAG not between", value1, value2, "validflag");
            return (Criteria) this;
        }

        public Criteria andSexcodeIsNull() {
            addCriterion("SEXCODE is null");
            return (Criteria) this;
        }

        public Criteria andSexcodeIsNotNull() {
            addCriterion("SEXCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSexcodeEqualTo(String value) {
            addCriterion("SEXCODE =", value, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeNotEqualTo(String value) {
            addCriterion("SEXCODE <>", value, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeGreaterThan(String value) {
            addCriterion("SEXCODE >", value, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SEXCODE >=", value, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeLessThan(String value) {
            addCriterion("SEXCODE <", value, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeLessThanOrEqualTo(String value) {
            addCriterion("SEXCODE <=", value, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeLike(String value) {
            addCriterion("SEXCODE like", value, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeNotLike(String value) {
            addCriterion("SEXCODE not like", value, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeIn(List<String> values) {
            addCriterion("SEXCODE in", values, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeNotIn(List<String> values) {
            addCriterion("SEXCODE not in", values, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeBetween(String value1, String value2) {
            addCriterion("SEXCODE between", value1, value2, "sexcode");
            return (Criteria) this;
        }

        public Criteria andSexcodeNotBetween(String value1, String value2) {
            addCriterion("SEXCODE not between", value1, value2, "sexcode");
            return (Criteria) this;
        }

        public Criteria andIdtypecodeIsNull() {
            addCriterion("IDTYPECODE is null");
            return (Criteria) this;
        }

        public Criteria andIdtypecodeIsNotNull() {
            addCriterion("IDTYPECODE is not null");
            return (Criteria) this;
        }

        public Criteria andIdtypecodeEqualTo(String value) {
            addCriterion("IDTYPECODE =", value, "idtypecode");
            return (Criteria) this;
        }

        public Criteria andIdtypecodeNotEqualTo(String value) {
            addCriterion("IDTYPECODE <>", value, "idtypecode");
            return (Criteria) this;
        }

        public Criteria andIdtypecodeGreaterThan(String value) {
            addCriterion("IDTYPECODE >", value, "idtypecode");
            return (Criteria) this;
        }

        public Criteria andIdtypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("IDTYPECODE >=", value, "idtypecode");
            return (Criteria) this;
        }

        public Criteria andIdtypecodeLessThan(String value) {
            addCriterion("IDTYPECODE <", value, "idtypecode");
            return (Criteria) this;
        }

        public Criteria andIdtypecodeLessThanOrEqualTo(String value) {
            addCriterion("IDTYPECODE <=", value, "idtypecode");
            return (Criteria) this;
        }

        public Criteria andIdtypecodeLike(String value) {
            addCriterion("IDTYPECODE like", value, "idtypecode");
            return (Criteria) this;
        }

        public Criteria andIdtypecodeNotLike(String value) {
            addCriterion("IDTYPECODE not like", value, "idtypecode");
            return (Criteria) this;
        }

        public Criteria andIdtypecodeIn(List<String> values) {
            addCriterion("IDTYPECODE in", values, "idtypecode");
            return (Criteria) this;
        }

        public Criteria andIdtypecodeNotIn(List<String> values) {
            addCriterion("IDTYPECODE not in", values, "idtypecode");
            return (Criteria) this;
        }

        public Criteria andIdtypecodeBetween(String value1, String value2) {
            addCriterion("IDTYPECODE between", value1, value2, "idtypecode");
            return (Criteria) this;
        }

        public Criteria andIdtypecodeNotBetween(String value1, String value2) {
            addCriterion("IDTYPECODE not between", value1, value2, "idtypecode");
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

        public Criteria andGuardian1IsNull() {
            addCriterion("GUARDIAN1 is null");
            return (Criteria) this;
        }

        public Criteria andGuardian1IsNotNull() {
            addCriterion("GUARDIAN1 is not null");
            return (Criteria) this;
        }

        public Criteria andGuardian1EqualTo(String value) {
            addCriterion("GUARDIAN1 =", value, "guardian1");
            return (Criteria) this;
        }

        public Criteria andGuardian1NotEqualTo(String value) {
            addCriterion("GUARDIAN1 <>", value, "guardian1");
            return (Criteria) this;
        }

        public Criteria andGuardian1GreaterThan(String value) {
            addCriterion("GUARDIAN1 >", value, "guardian1");
            return (Criteria) this;
        }

        public Criteria andGuardian1GreaterThanOrEqualTo(String value) {
            addCriterion("GUARDIAN1 >=", value, "guardian1");
            return (Criteria) this;
        }

        public Criteria andGuardian1LessThan(String value) {
            addCriterion("GUARDIAN1 <", value, "guardian1");
            return (Criteria) this;
        }

        public Criteria andGuardian1LessThanOrEqualTo(String value) {
            addCriterion("GUARDIAN1 <=", value, "guardian1");
            return (Criteria) this;
        }

        public Criteria andGuardian1Like(String value) {
            addCriterion("GUARDIAN1 like", value, "guardian1");
            return (Criteria) this;
        }

        public Criteria andGuardian1NotLike(String value) {
            addCriterion("GUARDIAN1 not like", value, "guardian1");
            return (Criteria) this;
        }

        public Criteria andGuardian1In(List<String> values) {
            addCriterion("GUARDIAN1 in", values, "guardian1");
            return (Criteria) this;
        }

        public Criteria andGuardian1NotIn(List<String> values) {
            addCriterion("GUARDIAN1 not in", values, "guardian1");
            return (Criteria) this;
        }

        public Criteria andGuardian1Between(String value1, String value2) {
            addCriterion("GUARDIAN1 between", value1, value2, "guardian1");
            return (Criteria) this;
        }

        public Criteria andGuardian1NotBetween(String value1, String value2) {
            addCriterion("GUARDIAN1 not between", value1, value2, "guardian1");
            return (Criteria) this;
        }

        public Criteria andGuardian1phoneIsNull() {
            addCriterion("GUARDIAN1PHONE is null");
            return (Criteria) this;
        }

        public Criteria andGuardian1phoneIsNotNull() {
            addCriterion("GUARDIAN1PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andGuardian1phoneEqualTo(String value) {
            addCriterion("GUARDIAN1PHONE =", value, "guardian1phone");
            return (Criteria) this;
        }

        public Criteria andGuardian1phoneNotEqualTo(String value) {
            addCriterion("GUARDIAN1PHONE <>", value, "guardian1phone");
            return (Criteria) this;
        }

        public Criteria andGuardian1phoneGreaterThan(String value) {
            addCriterion("GUARDIAN1PHONE >", value, "guardian1phone");
            return (Criteria) this;
        }

        public Criteria andGuardian1phoneGreaterThanOrEqualTo(String value) {
            addCriterion("GUARDIAN1PHONE >=", value, "guardian1phone");
            return (Criteria) this;
        }

        public Criteria andGuardian1phoneLessThan(String value) {
            addCriterion("GUARDIAN1PHONE <", value, "guardian1phone");
            return (Criteria) this;
        }

        public Criteria andGuardian1phoneLessThanOrEqualTo(String value) {
            addCriterion("GUARDIAN1PHONE <=", value, "guardian1phone");
            return (Criteria) this;
        }

        public Criteria andGuardian1phoneLike(String value) {
            addCriterion("GUARDIAN1PHONE like", value, "guardian1phone");
            return (Criteria) this;
        }

        public Criteria andGuardian1phoneNotLike(String value) {
            addCriterion("GUARDIAN1PHONE not like", value, "guardian1phone");
            return (Criteria) this;
        }

        public Criteria andGuardian1phoneIn(List<String> values) {
            addCriterion("GUARDIAN1PHONE in", values, "guardian1phone");
            return (Criteria) this;
        }

        public Criteria andGuardian1phoneNotIn(List<String> values) {
            addCriterion("GUARDIAN1PHONE not in", values, "guardian1phone");
            return (Criteria) this;
        }

        public Criteria andGuardian1phoneBetween(String value1, String value2) {
            addCriterion("GUARDIAN1PHONE between", value1, value2, "guardian1phone");
            return (Criteria) this;
        }

        public Criteria andGuardian1phoneNotBetween(String value1, String value2) {
            addCriterion("GUARDIAN1PHONE not between", value1, value2, "guardian1phone");
            return (Criteria) this;
        }

        public Criteria andGuardian2IsNull() {
            addCriterion("GUARDIAN2 is null");
            return (Criteria) this;
        }

        public Criteria andGuardian2IsNotNull() {
            addCriterion("GUARDIAN2 is not null");
            return (Criteria) this;
        }

        public Criteria andGuardian2EqualTo(String value) {
            addCriterion("GUARDIAN2 =", value, "guardian2");
            return (Criteria) this;
        }

        public Criteria andGuardian2NotEqualTo(String value) {
            addCriterion("GUARDIAN2 <>", value, "guardian2");
            return (Criteria) this;
        }

        public Criteria andGuardian2GreaterThan(String value) {
            addCriterion("GUARDIAN2 >", value, "guardian2");
            return (Criteria) this;
        }

        public Criteria andGuardian2GreaterThanOrEqualTo(String value) {
            addCriterion("GUARDIAN2 >=", value, "guardian2");
            return (Criteria) this;
        }

        public Criteria andGuardian2LessThan(String value) {
            addCriterion("GUARDIAN2 <", value, "guardian2");
            return (Criteria) this;
        }

        public Criteria andGuardian2LessThanOrEqualTo(String value) {
            addCriterion("GUARDIAN2 <=", value, "guardian2");
            return (Criteria) this;
        }

        public Criteria andGuardian2Like(String value) {
            addCriterion("GUARDIAN2 like", value, "guardian2");
            return (Criteria) this;
        }

        public Criteria andGuardian2NotLike(String value) {
            addCriterion("GUARDIAN2 not like", value, "guardian2");
            return (Criteria) this;
        }

        public Criteria andGuardian2In(List<String> values) {
            addCriterion("GUARDIAN2 in", values, "guardian2");
            return (Criteria) this;
        }

        public Criteria andGuardian2NotIn(List<String> values) {
            addCriterion("GUARDIAN2 not in", values, "guardian2");
            return (Criteria) this;
        }

        public Criteria andGuardian2Between(String value1, String value2) {
            addCriterion("GUARDIAN2 between", value1, value2, "guardian2");
            return (Criteria) this;
        }

        public Criteria andGuardian2NotBetween(String value1, String value2) {
            addCriterion("GUARDIAN2 not between", value1, value2, "guardian2");
            return (Criteria) this;
        }

        public Criteria andGuardian2phoneIsNull() {
            addCriterion("GUARDIAN2PHONE is null");
            return (Criteria) this;
        }

        public Criteria andGuardian2phoneIsNotNull() {
            addCriterion("GUARDIAN2PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andGuardian2phoneEqualTo(String value) {
            addCriterion("GUARDIAN2PHONE =", value, "guardian2phone");
            return (Criteria) this;
        }

        public Criteria andGuardian2phoneNotEqualTo(String value) {
            addCriterion("GUARDIAN2PHONE <>", value, "guardian2phone");
            return (Criteria) this;
        }

        public Criteria andGuardian2phoneGreaterThan(String value) {
            addCriterion("GUARDIAN2PHONE >", value, "guardian2phone");
            return (Criteria) this;
        }

        public Criteria andGuardian2phoneGreaterThanOrEqualTo(String value) {
            addCriterion("GUARDIAN2PHONE >=", value, "guardian2phone");
            return (Criteria) this;
        }

        public Criteria andGuardian2phoneLessThan(String value) {
            addCriterion("GUARDIAN2PHONE <", value, "guardian2phone");
            return (Criteria) this;
        }

        public Criteria andGuardian2phoneLessThanOrEqualTo(String value) {
            addCriterion("GUARDIAN2PHONE <=", value, "guardian2phone");
            return (Criteria) this;
        }

        public Criteria andGuardian2phoneLike(String value) {
            addCriterion("GUARDIAN2PHONE like", value, "guardian2phone");
            return (Criteria) this;
        }

        public Criteria andGuardian2phoneNotLike(String value) {
            addCriterion("GUARDIAN2PHONE not like", value, "guardian2phone");
            return (Criteria) this;
        }

        public Criteria andGuardian2phoneIn(List<String> values) {
            addCriterion("GUARDIAN2PHONE in", values, "guardian2phone");
            return (Criteria) this;
        }

        public Criteria andGuardian2phoneNotIn(List<String> values) {
            addCriterion("GUARDIAN2PHONE not in", values, "guardian2phone");
            return (Criteria) this;
        }

        public Criteria andGuardian2phoneBetween(String value1, String value2) {
            addCriterion("GUARDIAN2PHONE between", value1, value2, "guardian2phone");
            return (Criteria) this;
        }

        public Criteria andGuardian2phoneNotBetween(String value1, String value2) {
            addCriterion("GUARDIAN2PHONE not between", value1, value2, "guardian2phone");
            return (Criteria) this;
        }

        public Criteria andPatientlevelcodeIsNull() {
            addCriterion("PATIENTLEVELCODE is null");
            return (Criteria) this;
        }

        public Criteria andPatientlevelcodeIsNotNull() {
            addCriterion("PATIENTLEVELCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPatientlevelcodeEqualTo(String value) {
            addCriterion("PATIENTLEVELCODE =", value, "patientlevelcode");
            return (Criteria) this;
        }

        public Criteria andPatientlevelcodeNotEqualTo(String value) {
            addCriterion("PATIENTLEVELCODE <>", value, "patientlevelcode");
            return (Criteria) this;
        }

        public Criteria andPatientlevelcodeGreaterThan(String value) {
            addCriterion("PATIENTLEVELCODE >", value, "patientlevelcode");
            return (Criteria) this;
        }

        public Criteria andPatientlevelcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENTLEVELCODE >=", value, "patientlevelcode");
            return (Criteria) this;
        }

        public Criteria andPatientlevelcodeLessThan(String value) {
            addCriterion("PATIENTLEVELCODE <", value, "patientlevelcode");
            return (Criteria) this;
        }

        public Criteria andPatientlevelcodeLessThanOrEqualTo(String value) {
            addCriterion("PATIENTLEVELCODE <=", value, "patientlevelcode");
            return (Criteria) this;
        }

        public Criteria andPatientlevelcodeLike(String value) {
            addCriterion("PATIENTLEVELCODE like", value, "patientlevelcode");
            return (Criteria) this;
        }

        public Criteria andPatientlevelcodeNotLike(String value) {
            addCriterion("PATIENTLEVELCODE not like", value, "patientlevelcode");
            return (Criteria) this;
        }

        public Criteria andPatientlevelcodeIn(List<String> values) {
            addCriterion("PATIENTLEVELCODE in", values, "patientlevelcode");
            return (Criteria) this;
        }

        public Criteria andPatientlevelcodeNotIn(List<String> values) {
            addCriterion("PATIENTLEVELCODE not in", values, "patientlevelcode");
            return (Criteria) this;
        }

        public Criteria andPatientlevelcodeBetween(String value1, String value2) {
            addCriterion("PATIENTLEVELCODE between", value1, value2, "patientlevelcode");
            return (Criteria) this;
        }

        public Criteria andPatientlevelcodeNotBetween(String value1, String value2) {
            addCriterion("PATIENTLEVELCODE not between", value1, value2, "patientlevelcode");
            return (Criteria) this;
        }

        public Criteria andPatienttypecodeIsNull() {
            addCriterion("PATIENTTYPECODE is null");
            return (Criteria) this;
        }

        public Criteria andPatienttypecodeIsNotNull() {
            addCriterion("PATIENTTYPECODE is not null");
            return (Criteria) this;
        }

        public Criteria andPatienttypecodeEqualTo(String value) {
            addCriterion("PATIENTTYPECODE =", value, "patienttypecode");
            return (Criteria) this;
        }

        public Criteria andPatienttypecodeNotEqualTo(String value) {
            addCriterion("PATIENTTYPECODE <>", value, "patienttypecode");
            return (Criteria) this;
        }

        public Criteria andPatienttypecodeGreaterThan(String value) {
            addCriterion("PATIENTTYPECODE >", value, "patienttypecode");
            return (Criteria) this;
        }

        public Criteria andPatienttypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENTTYPECODE >=", value, "patienttypecode");
            return (Criteria) this;
        }

        public Criteria andPatienttypecodeLessThan(String value) {
            addCriterion("PATIENTTYPECODE <", value, "patienttypecode");
            return (Criteria) this;
        }

        public Criteria andPatienttypecodeLessThanOrEqualTo(String value) {
            addCriterion("PATIENTTYPECODE <=", value, "patienttypecode");
            return (Criteria) this;
        }

        public Criteria andPatienttypecodeLike(String value) {
            addCriterion("PATIENTTYPECODE like", value, "patienttypecode");
            return (Criteria) this;
        }

        public Criteria andPatienttypecodeNotLike(String value) {
            addCriterion("PATIENTTYPECODE not like", value, "patienttypecode");
            return (Criteria) this;
        }

        public Criteria andPatienttypecodeIn(List<String> values) {
            addCriterion("PATIENTTYPECODE in", values, "patienttypecode");
            return (Criteria) this;
        }

        public Criteria andPatienttypecodeNotIn(List<String> values) {
            addCriterion("PATIENTTYPECODE not in", values, "patienttypecode");
            return (Criteria) this;
        }

        public Criteria andPatienttypecodeBetween(String value1, String value2) {
            addCriterion("PATIENTTYPECODE between", value1, value2, "patienttypecode");
            return (Criteria) this;
        }

        public Criteria andPatienttypecodeNotBetween(String value1, String value2) {
            addCriterion("PATIENTTYPECODE not between", value1, value2, "patienttypecode");
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

        public Criteria andMemo2IsNull() {
            addCriterion("MEMO2 is null");
            return (Criteria) this;
        }

        public Criteria andMemo2IsNotNull() {
            addCriterion("MEMO2 is not null");
            return (Criteria) this;
        }

        public Criteria andMemo2EqualTo(String value) {
            addCriterion("MEMO2 =", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2NotEqualTo(String value) {
            addCriterion("MEMO2 <>", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2GreaterThan(String value) {
            addCriterion("MEMO2 >", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2GreaterThanOrEqualTo(String value) {
            addCriterion("MEMO2 >=", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2LessThan(String value) {
            addCriterion("MEMO2 <", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2LessThanOrEqualTo(String value) {
            addCriterion("MEMO2 <=", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2Like(String value) {
            addCriterion("MEMO2 like", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2NotLike(String value) {
            addCriterion("MEMO2 not like", value, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2In(List<String> values) {
            addCriterion("MEMO2 in", values, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2NotIn(List<String> values) {
            addCriterion("MEMO2 not in", values, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2Between(String value1, String value2) {
            addCriterion("MEMO2 between", value1, value2, "memo2");
            return (Criteria) this;
        }

        public Criteria andMemo2NotBetween(String value1, String value2) {
            addCriterion("MEMO2 not between", value1, value2, "memo2");
            return (Criteria) this;
        }

        public Criteria andCreateopernameIsNull() {
            addCriterion("CREATEOPERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCreateopernameIsNotNull() {
            addCriterion("CREATEOPERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateopernameEqualTo(String value) {
            addCriterion("CREATEOPERNAME =", value, "createopername");
            return (Criteria) this;
        }

        public Criteria andCreateopernameNotEqualTo(String value) {
            addCriterion("CREATEOPERNAME <>", value, "createopername");
            return (Criteria) this;
        }

        public Criteria andCreateopernameGreaterThan(String value) {
            addCriterion("CREATEOPERNAME >", value, "createopername");
            return (Criteria) this;
        }

        public Criteria andCreateopernameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEOPERNAME >=", value, "createopername");
            return (Criteria) this;
        }

        public Criteria andCreateopernameLessThan(String value) {
            addCriterion("CREATEOPERNAME <", value, "createopername");
            return (Criteria) this;
        }

        public Criteria andCreateopernameLessThanOrEqualTo(String value) {
            addCriterion("CREATEOPERNAME <=", value, "createopername");
            return (Criteria) this;
        }

        public Criteria andCreateopernameLike(String value) {
            addCriterion("CREATEOPERNAME like", value, "createopername");
            return (Criteria) this;
        }

        public Criteria andCreateopernameNotLike(String value) {
            addCriterion("CREATEOPERNAME not like", value, "createopername");
            return (Criteria) this;
        }

        public Criteria andCreateopernameIn(List<String> values) {
            addCriterion("CREATEOPERNAME in", values, "createopername");
            return (Criteria) this;
        }

        public Criteria andCreateopernameNotIn(List<String> values) {
            addCriterion("CREATEOPERNAME not in", values, "createopername");
            return (Criteria) this;
        }

        public Criteria andCreateopernameBetween(String value1, String value2) {
            addCriterion("CREATEOPERNAME between", value1, value2, "createopername");
            return (Criteria) this;
        }

        public Criteria andCreateopernameNotBetween(String value1, String value2) {
            addCriterion("CREATEOPERNAME not between", value1, value2, "createopername");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1idIsNull() {
            addCriterion("GUARDIANINFO1ID is null");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1idIsNotNull() {
            addCriterion("GUARDIANINFO1ID is not null");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1idEqualTo(String value) {
            addCriterion("GUARDIANINFO1ID =", value, "guardianinfo1id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1idNotEqualTo(String value) {
            addCriterion("GUARDIANINFO1ID <>", value, "guardianinfo1id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1idGreaterThan(String value) {
            addCriterion("GUARDIANINFO1ID >", value, "guardianinfo1id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1idGreaterThanOrEqualTo(String value) {
            addCriterion("GUARDIANINFO1ID >=", value, "guardianinfo1id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1idLessThan(String value) {
            addCriterion("GUARDIANINFO1ID <", value, "guardianinfo1id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1idLessThanOrEqualTo(String value) {
            addCriterion("GUARDIANINFO1ID <=", value, "guardianinfo1id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1idLike(String value) {
            addCriterion("GUARDIANINFO1ID like", value, "guardianinfo1id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1idNotLike(String value) {
            addCriterion("GUARDIANINFO1ID not like", value, "guardianinfo1id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1idIn(List<String> values) {
            addCriterion("GUARDIANINFO1ID in", values, "guardianinfo1id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1idNotIn(List<String> values) {
            addCriterion("GUARDIANINFO1ID not in", values, "guardianinfo1id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1idBetween(String value1, String value2) {
            addCriterion("GUARDIANINFO1ID between", value1, value2, "guardianinfo1id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1idNotBetween(String value1, String value2) {
            addCriterion("GUARDIANINFO1ID not between", value1, value2, "guardianinfo1id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1nameIsNull() {
            addCriterion("GUARDIANINFO1NAME is null");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1nameIsNotNull() {
            addCriterion("GUARDIANINFO1NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1nameEqualTo(String value) {
            addCriterion("GUARDIANINFO1NAME =", value, "guardianinfo1name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1nameNotEqualTo(String value) {
            addCriterion("GUARDIANINFO1NAME <>", value, "guardianinfo1name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1nameGreaterThan(String value) {
            addCriterion("GUARDIANINFO1NAME >", value, "guardianinfo1name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1nameGreaterThanOrEqualTo(String value) {
            addCriterion("GUARDIANINFO1NAME >=", value, "guardianinfo1name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1nameLessThan(String value) {
            addCriterion("GUARDIANINFO1NAME <", value, "guardianinfo1name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1nameLessThanOrEqualTo(String value) {
            addCriterion("GUARDIANINFO1NAME <=", value, "guardianinfo1name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1nameLike(String value) {
            addCriterion("GUARDIANINFO1NAME like", value, "guardianinfo1name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1nameNotLike(String value) {
            addCriterion("GUARDIANINFO1NAME not like", value, "guardianinfo1name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1nameIn(List<String> values) {
            addCriterion("GUARDIANINFO1NAME in", values, "guardianinfo1name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1nameNotIn(List<String> values) {
            addCriterion("GUARDIANINFO1NAME not in", values, "guardianinfo1name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1nameBetween(String value1, String value2) {
            addCriterion("GUARDIANINFO1NAME between", value1, value2, "guardianinfo1name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo1nameNotBetween(String value1, String value2) {
            addCriterion("GUARDIANINFO1NAME not between", value1, value2, "guardianinfo1name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2idIsNull() {
            addCriterion("GUARDIANINFO2ID is null");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2idIsNotNull() {
            addCriterion("GUARDIANINFO2ID is not null");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2idEqualTo(String value) {
            addCriterion("GUARDIANINFO2ID =", value, "guardianinfo2id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2idNotEqualTo(String value) {
            addCriterion("GUARDIANINFO2ID <>", value, "guardianinfo2id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2idGreaterThan(String value) {
            addCriterion("GUARDIANINFO2ID >", value, "guardianinfo2id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2idGreaterThanOrEqualTo(String value) {
            addCriterion("GUARDIANINFO2ID >=", value, "guardianinfo2id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2idLessThan(String value) {
            addCriterion("GUARDIANINFO2ID <", value, "guardianinfo2id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2idLessThanOrEqualTo(String value) {
            addCriterion("GUARDIANINFO2ID <=", value, "guardianinfo2id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2idLike(String value) {
            addCriterion("GUARDIANINFO2ID like", value, "guardianinfo2id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2idNotLike(String value) {
            addCriterion("GUARDIANINFO2ID not like", value, "guardianinfo2id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2idIn(List<String> values) {
            addCriterion("GUARDIANINFO2ID in", values, "guardianinfo2id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2idNotIn(List<String> values) {
            addCriterion("GUARDIANINFO2ID not in", values, "guardianinfo2id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2idBetween(String value1, String value2) {
            addCriterion("GUARDIANINFO2ID between", value1, value2, "guardianinfo2id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2idNotBetween(String value1, String value2) {
            addCriterion("GUARDIANINFO2ID not between", value1, value2, "guardianinfo2id");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2nameIsNull() {
            addCriterion("GUARDIANINFO2NAME is null");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2nameIsNotNull() {
            addCriterion("GUARDIANINFO2NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2nameEqualTo(String value) {
            addCriterion("GUARDIANINFO2NAME =", value, "guardianinfo2name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2nameNotEqualTo(String value) {
            addCriterion("GUARDIANINFO2NAME <>", value, "guardianinfo2name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2nameGreaterThan(String value) {
            addCriterion("GUARDIANINFO2NAME >", value, "guardianinfo2name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2nameGreaterThanOrEqualTo(String value) {
            addCriterion("GUARDIANINFO2NAME >=", value, "guardianinfo2name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2nameLessThan(String value) {
            addCriterion("GUARDIANINFO2NAME <", value, "guardianinfo2name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2nameLessThanOrEqualTo(String value) {
            addCriterion("GUARDIANINFO2NAME <=", value, "guardianinfo2name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2nameLike(String value) {
            addCriterion("GUARDIANINFO2NAME like", value, "guardianinfo2name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2nameNotLike(String value) {
            addCriterion("GUARDIANINFO2NAME not like", value, "guardianinfo2name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2nameIn(List<String> values) {
            addCriterion("GUARDIANINFO2NAME in", values, "guardianinfo2name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2nameNotIn(List<String> values) {
            addCriterion("GUARDIANINFO2NAME not in", values, "guardianinfo2name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2nameBetween(String value1, String value2) {
            addCriterion("GUARDIANINFO2NAME between", value1, value2, "guardianinfo2name");
            return (Criteria) this;
        }

        public Criteria andGuardianinfo2nameNotBetween(String value1, String value2) {
            addCriterion("GUARDIANINFO2NAME not between", value1, value2, "guardianinfo2name");
            return (Criteria) this;
        }

        public Criteria andIntroduceridIsNull() {
            addCriterion("INTRODUCERID is null");
            return (Criteria) this;
        }

        public Criteria andIntroduceridIsNotNull() {
            addCriterion("INTRODUCERID is not null");
            return (Criteria) this;
        }

        public Criteria andIntroduceridEqualTo(String value) {
            addCriterion("INTRODUCERID =", value, "introducerid");
            return (Criteria) this;
        }

        public Criteria andIntroduceridNotEqualTo(String value) {
            addCriterion("INTRODUCERID <>", value, "introducerid");
            return (Criteria) this;
        }

        public Criteria andIntroduceridGreaterThan(String value) {
            addCriterion("INTRODUCERID >", value, "introducerid");
            return (Criteria) this;
        }

        public Criteria andIntroduceridGreaterThanOrEqualTo(String value) {
            addCriterion("INTRODUCERID >=", value, "introducerid");
            return (Criteria) this;
        }

        public Criteria andIntroduceridLessThan(String value) {
            addCriterion("INTRODUCERID <", value, "introducerid");
            return (Criteria) this;
        }

        public Criteria andIntroduceridLessThanOrEqualTo(String value) {
            addCriterion("INTRODUCERID <=", value, "introducerid");
            return (Criteria) this;
        }

        public Criteria andIntroduceridLike(String value) {
            addCriterion("INTRODUCERID like", value, "introducerid");
            return (Criteria) this;
        }

        public Criteria andIntroduceridNotLike(String value) {
            addCriterion("INTRODUCERID not like", value, "introducerid");
            return (Criteria) this;
        }

        public Criteria andIntroduceridIn(List<String> values) {
            addCriterion("INTRODUCERID in", values, "introducerid");
            return (Criteria) this;
        }

        public Criteria andIntroduceridNotIn(List<String> values) {
            addCriterion("INTRODUCERID not in", values, "introducerid");
            return (Criteria) this;
        }

        public Criteria andIntroduceridBetween(String value1, String value2) {
            addCriterion("INTRODUCERID between", value1, value2, "introducerid");
            return (Criteria) this;
        }

        public Criteria andIntroduceridNotBetween(String value1, String value2) {
            addCriterion("INTRODUCERID not between", value1, value2, "introducerid");
            return (Criteria) this;
        }

        public Criteria andIntroducernameIsNull() {
            addCriterion("INTRODUCERNAME is null");
            return (Criteria) this;
        }

        public Criteria andIntroducernameIsNotNull() {
            addCriterion("INTRODUCERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andIntroducernameEqualTo(String value) {
            addCriterion("INTRODUCERNAME =", value, "introducername");
            return (Criteria) this;
        }

        public Criteria andIntroducernameNotEqualTo(String value) {
            addCriterion("INTRODUCERNAME <>", value, "introducername");
            return (Criteria) this;
        }

        public Criteria andIntroducernameGreaterThan(String value) {
            addCriterion("INTRODUCERNAME >", value, "introducername");
            return (Criteria) this;
        }

        public Criteria andIntroducernameGreaterThanOrEqualTo(String value) {
            addCriterion("INTRODUCERNAME >=", value, "introducername");
            return (Criteria) this;
        }

        public Criteria andIntroducernameLessThan(String value) {
            addCriterion("INTRODUCERNAME <", value, "introducername");
            return (Criteria) this;
        }

        public Criteria andIntroducernameLessThanOrEqualTo(String value) {
            addCriterion("INTRODUCERNAME <=", value, "introducername");
            return (Criteria) this;
        }

        public Criteria andIntroducernameLike(String value) {
            addCriterion("INTRODUCERNAME like", value, "introducername");
            return (Criteria) this;
        }

        public Criteria andIntroducernameNotLike(String value) {
            addCriterion("INTRODUCERNAME not like", value, "introducername");
            return (Criteria) this;
        }

        public Criteria andIntroducernameIn(List<String> values) {
            addCriterion("INTRODUCERNAME in", values, "introducername");
            return (Criteria) this;
        }

        public Criteria andIntroducernameNotIn(List<String> values) {
            addCriterion("INTRODUCERNAME not in", values, "introducername");
            return (Criteria) this;
        }

        public Criteria andIntroducernameBetween(String value1, String value2) {
            addCriterion("INTRODUCERNAME between", value1, value2, "introducername");
            return (Criteria) this;
        }

        public Criteria andIntroducernameNotBetween(String value1, String value2) {
            addCriterion("INTRODUCERNAME not between", value1, value2, "introducername");
            return (Criteria) this;
        }

        public Criteria andMmwyflagIsNull() {
            addCriterion("MMWYFLAG is null");
            return (Criteria) this;
        }

        public Criteria andMmwyflagIsNotNull() {
            addCriterion("MMWYFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andMmwyflagEqualTo(String value) {
            addCriterion("MMWYFLAG =", value, "mmwyflag");
            return (Criteria) this;
        }

        public Criteria andMmwyflagNotEqualTo(String value) {
            addCriterion("MMWYFLAG <>", value, "mmwyflag");
            return (Criteria) this;
        }

        public Criteria andMmwyflagGreaterThan(String value) {
            addCriterion("MMWYFLAG >", value, "mmwyflag");
            return (Criteria) this;
        }

        public Criteria andMmwyflagGreaterThanOrEqualTo(String value) {
            addCriterion("MMWYFLAG >=", value, "mmwyflag");
            return (Criteria) this;
        }

        public Criteria andMmwyflagLessThan(String value) {
            addCriterion("MMWYFLAG <", value, "mmwyflag");
            return (Criteria) this;
        }

        public Criteria andMmwyflagLessThanOrEqualTo(String value) {
            addCriterion("MMWYFLAG <=", value, "mmwyflag");
            return (Criteria) this;
        }

        public Criteria andMmwyflagLike(String value) {
            addCriterion("MMWYFLAG like", value, "mmwyflag");
            return (Criteria) this;
        }

        public Criteria andMmwyflagNotLike(String value) {
            addCriterion("MMWYFLAG not like", value, "mmwyflag");
            return (Criteria) this;
        }

        public Criteria andMmwyflagIn(List<String> values) {
            addCriterion("MMWYFLAG in", values, "mmwyflag");
            return (Criteria) this;
        }

        public Criteria andMmwyflagNotIn(List<String> values) {
            addCriterion("MMWYFLAG not in", values, "mmwyflag");
            return (Criteria) this;
        }

        public Criteria andMmwyflagBetween(String value1, String value2) {
            addCriterion("MMWYFLAG between", value1, value2, "mmwyflag");
            return (Criteria) this;
        }

        public Criteria andMmwyflagNotBetween(String value1, String value2) {
            addCriterion("MMWYFLAG not between", value1, value2, "mmwyflag");
            return (Criteria) this;
        }

        public Criteria andMmwyeventidIsNull() {
            addCriterion("MMWYEVENTID is null");
            return (Criteria) this;
        }

        public Criteria andMmwyeventidIsNotNull() {
            addCriterion("MMWYEVENTID is not null");
            return (Criteria) this;
        }

        public Criteria andMmwyeventidEqualTo(String value) {
            addCriterion("MMWYEVENTID =", value, "mmwyeventid");
            return (Criteria) this;
        }

        public Criteria andMmwyeventidNotEqualTo(String value) {
            addCriterion("MMWYEVENTID <>", value, "mmwyeventid");
            return (Criteria) this;
        }

        public Criteria andMmwyeventidGreaterThan(String value) {
            addCriterion("MMWYEVENTID >", value, "mmwyeventid");
            return (Criteria) this;
        }

        public Criteria andMmwyeventidGreaterThanOrEqualTo(String value) {
            addCriterion("MMWYEVENTID >=", value, "mmwyeventid");
            return (Criteria) this;
        }

        public Criteria andMmwyeventidLessThan(String value) {
            addCriterion("MMWYEVENTID <", value, "mmwyeventid");
            return (Criteria) this;
        }

        public Criteria andMmwyeventidLessThanOrEqualTo(String value) {
            addCriterion("MMWYEVENTID <=", value, "mmwyeventid");
            return (Criteria) this;
        }

        public Criteria andMmwyeventidLike(String value) {
            addCriterion("MMWYEVENTID like", value, "mmwyeventid");
            return (Criteria) this;
        }

        public Criteria andMmwyeventidNotLike(String value) {
            addCriterion("MMWYEVENTID not like", value, "mmwyeventid");
            return (Criteria) this;
        }

        public Criteria andMmwyeventidIn(List<String> values) {
            addCriterion("MMWYEVENTID in", values, "mmwyeventid");
            return (Criteria) this;
        }

        public Criteria andMmwyeventidNotIn(List<String> values) {
            addCriterion("MMWYEVENTID not in", values, "mmwyeventid");
            return (Criteria) this;
        }

        public Criteria andMmwyeventidBetween(String value1, String value2) {
            addCriterion("MMWYEVENTID between", value1, value2, "mmwyeventid");
            return (Criteria) this;
        }

        public Criteria andMmwyeventidNotBetween(String value1, String value2) {
            addCriterion("MMWYEVENTID not between", value1, value2, "mmwyeventid");
            return (Criteria) this;
        }

        public Criteria andMmwyeventnameIsNull() {
            addCriterion("MMWYEVENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andMmwyeventnameIsNotNull() {
            addCriterion("MMWYEVENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMmwyeventnameEqualTo(String value) {
            addCriterion("MMWYEVENTNAME =", value, "mmwyeventname");
            return (Criteria) this;
        }

        public Criteria andMmwyeventnameNotEqualTo(String value) {
            addCriterion("MMWYEVENTNAME <>", value, "mmwyeventname");
            return (Criteria) this;
        }

        public Criteria andMmwyeventnameGreaterThan(String value) {
            addCriterion("MMWYEVENTNAME >", value, "mmwyeventname");
            return (Criteria) this;
        }

        public Criteria andMmwyeventnameGreaterThanOrEqualTo(String value) {
            addCriterion("MMWYEVENTNAME >=", value, "mmwyeventname");
            return (Criteria) this;
        }

        public Criteria andMmwyeventnameLessThan(String value) {
            addCriterion("MMWYEVENTNAME <", value, "mmwyeventname");
            return (Criteria) this;
        }

        public Criteria andMmwyeventnameLessThanOrEqualTo(String value) {
            addCriterion("MMWYEVENTNAME <=", value, "mmwyeventname");
            return (Criteria) this;
        }

        public Criteria andMmwyeventnameLike(String value) {
            addCriterion("MMWYEVENTNAME like", value, "mmwyeventname");
            return (Criteria) this;
        }

        public Criteria andMmwyeventnameNotLike(String value) {
            addCriterion("MMWYEVENTNAME not like", value, "mmwyeventname");
            return (Criteria) this;
        }

        public Criteria andMmwyeventnameIn(List<String> values) {
            addCriterion("MMWYEVENTNAME in", values, "mmwyeventname");
            return (Criteria) this;
        }

        public Criteria andMmwyeventnameNotIn(List<String> values) {
            addCriterion("MMWYEVENTNAME not in", values, "mmwyeventname");
            return (Criteria) this;
        }

        public Criteria andMmwyeventnameBetween(String value1, String value2) {
            addCriterion("MMWYEVENTNAME between", value1, value2, "mmwyeventname");
            return (Criteria) this;
        }

        public Criteria andMmwyeventnameNotBetween(String value1, String value2) {
            addCriterion("MMWYEVENTNAME not between", value1, value2, "mmwyeventname");
            return (Criteria) this;
        }

        public Criteria andPatientlabelIsNull() {
            addCriterion("PATIENTLABEL is null");
            return (Criteria) this;
        }

        public Criteria andPatientlabelIsNotNull() {
            addCriterion("PATIENTLABEL is not null");
            return (Criteria) this;
        }

        public Criteria andPatientlabelEqualTo(String value) {
            addCriterion("PATIENTLABEL =", value, "patientlabel");
            return (Criteria) this;
        }

        public Criteria andPatientlabelNotEqualTo(String value) {
            addCriterion("PATIENTLABEL <>", value, "patientlabel");
            return (Criteria) this;
        }

        public Criteria andPatientlabelGreaterThan(String value) {
            addCriterion("PATIENTLABEL >", value, "patientlabel");
            return (Criteria) this;
        }

        public Criteria andPatientlabelGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENTLABEL >=", value, "patientlabel");
            return (Criteria) this;
        }

        public Criteria andPatientlabelLessThan(String value) {
            addCriterion("PATIENTLABEL <", value, "patientlabel");
            return (Criteria) this;
        }

        public Criteria andPatientlabelLessThanOrEqualTo(String value) {
            addCriterion("PATIENTLABEL <=", value, "patientlabel");
            return (Criteria) this;
        }

        public Criteria andPatientlabelLike(String value) {
            addCriterion("PATIENTLABEL like", value, "patientlabel");
            return (Criteria) this;
        }

        public Criteria andPatientlabelNotLike(String value) {
            addCriterion("PATIENTLABEL not like", value, "patientlabel");
            return (Criteria) this;
        }

        public Criteria andPatientlabelIn(List<String> values) {
            addCriterion("PATIENTLABEL in", values, "patientlabel");
            return (Criteria) this;
        }

        public Criteria andPatientlabelNotIn(List<String> values) {
            addCriterion("PATIENTLABEL not in", values, "patientlabel");
            return (Criteria) this;
        }

        public Criteria andPatientlabelBetween(String value1, String value2) {
            addCriterion("PATIENTLABEL between", value1, value2, "patientlabel");
            return (Criteria) this;
        }

        public Criteria andPatientlabelNotBetween(String value1, String value2) {
            addCriterion("PATIENTLABEL not between", value1, value2, "patientlabel");
            return (Criteria) this;
        }

        public Criteria andMmwyidIsNull() {
            addCriterion("MMWYID is null");
            return (Criteria) this;
        }

        public Criteria andMmwyidIsNotNull() {
            addCriterion("MMWYID is not null");
            return (Criteria) this;
        }

        public Criteria andMmwyidEqualTo(String value) {
            addCriterion("MMWYID =", value, "mmwyid");
            return (Criteria) this;
        }

        public Criteria andMmwyidNotEqualTo(String value) {
            addCriterion("MMWYID <>", value, "mmwyid");
            return (Criteria) this;
        }

        public Criteria andMmwyidGreaterThan(String value) {
            addCriterion("MMWYID >", value, "mmwyid");
            return (Criteria) this;
        }

        public Criteria andMmwyidGreaterThanOrEqualTo(String value) {
            addCriterion("MMWYID >=", value, "mmwyid");
            return (Criteria) this;
        }

        public Criteria andMmwyidLessThan(String value) {
            addCriterion("MMWYID <", value, "mmwyid");
            return (Criteria) this;
        }

        public Criteria andMmwyidLessThanOrEqualTo(String value) {
            addCriterion("MMWYID <=", value, "mmwyid");
            return (Criteria) this;
        }

        public Criteria andMmwyidLike(String value) {
            addCriterion("MMWYID like", value, "mmwyid");
            return (Criteria) this;
        }

        public Criteria andMmwyidNotLike(String value) {
            addCriterion("MMWYID not like", value, "mmwyid");
            return (Criteria) this;
        }

        public Criteria andMmwyidIn(List<String> values) {
            addCriterion("MMWYID in", values, "mmwyid");
            return (Criteria) this;
        }

        public Criteria andMmwyidNotIn(List<String> values) {
            addCriterion("MMWYID not in", values, "mmwyid");
            return (Criteria) this;
        }

        public Criteria andMmwyidBetween(String value1, String value2) {
            addCriterion("MMWYID between", value1, value2, "mmwyid");
            return (Criteria) this;
        }

        public Criteria andMmwyidNotBetween(String value1, String value2) {
            addCriterion("MMWYID not between", value1, value2, "mmwyid");
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

        public Criteria andDeliverydateIsNull() {
            addCriterion("DELIVERYDATE is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNotNull() {
            addCriterion("DELIVERYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateEqualTo(Date value) {
            addCriterion("DELIVERYDATE =", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotEqualTo(Date value) {
            addCriterion("DELIVERYDATE <>", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThan(Date value) {
            addCriterion("DELIVERYDATE >", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIVERYDATE >=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThan(Date value) {
            addCriterion("DELIVERYDATE <", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThanOrEqualTo(Date value) {
            addCriterion("DELIVERYDATE <=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIn(List<Date> values) {
            addCriterion("DELIVERYDATE in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotIn(List<Date> values) {
            addCriterion("DELIVERYDATE not in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateBetween(Date value1, Date value2) {
            addCriterion("DELIVERYDATE between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotBetween(Date value1, Date value2) {
            addCriterion("DELIVERYDATE not between", value1, value2, "deliverydate");
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

        public Criteria andRoleidIsNull() {
            addCriterion("ROLEID is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("ROLEID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(String value) {
            addCriterion("ROLEID =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(String value) {
            addCriterion("ROLEID <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(String value) {
            addCriterion("ROLEID >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(String value) {
            addCriterion("ROLEID >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(String value) {
            addCriterion("ROLEID <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(String value) {
            addCriterion("ROLEID <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLike(String value) {
            addCriterion("ROLEID like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotLike(String value) {
            addCriterion("ROLEID not like", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<String> values) {
            addCriterion("ROLEID in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<String> values) {
            addCriterion("ROLEID not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(String value1, String value2) {
            addCriterion("ROLEID between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(String value1, String value2) {
            addCriterion("ROLEID not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNull() {
            addCriterion("ROLENAME is null");
            return (Criteria) this;
        }

        public Criteria andRolenameIsNotNull() {
            addCriterion("ROLENAME is not null");
            return (Criteria) this;
        }

        public Criteria andRolenameEqualTo(String value) {
            addCriterion("ROLENAME =", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotEqualTo(String value) {
            addCriterion("ROLENAME <>", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThan(String value) {
            addCriterion("ROLENAME >", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameGreaterThanOrEqualTo(String value) {
            addCriterion("ROLENAME >=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThan(String value) {
            addCriterion("ROLENAME <", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLessThanOrEqualTo(String value) {
            addCriterion("ROLENAME <=", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameLike(String value) {
            addCriterion("ROLENAME like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotLike(String value) {
            addCriterion("ROLENAME not like", value, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameIn(List<String> values) {
            addCriterion("ROLENAME in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotIn(List<String> values) {
            addCriterion("ROLENAME not in", values, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameBetween(String value1, String value2) {
            addCriterion("ROLENAME between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andRolenameNotBetween(String value1, String value2) {
            addCriterion("ROLENAME not between", value1, value2, "rolename");
            return (Criteria) this;
        }

        public Criteria andChannel4codeIsNull() {
            addCriterion("CHANNEL4CODE is null");
            return (Criteria) this;
        }

        public Criteria andChannel4codeIsNotNull() {
            addCriterion("CHANNEL4CODE is not null");
            return (Criteria) this;
        }

        public Criteria andChannel4codeEqualTo(String value) {
            addCriterion("CHANNEL4CODE =", value, "channel4code");
            return (Criteria) this;
        }

        public Criteria andChannel4codeNotEqualTo(String value) {
            addCriterion("CHANNEL4CODE <>", value, "channel4code");
            return (Criteria) this;
        }

        public Criteria andChannel4codeGreaterThan(String value) {
            addCriterion("CHANNEL4CODE >", value, "channel4code");
            return (Criteria) this;
        }

        public Criteria andChannel4codeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL4CODE >=", value, "channel4code");
            return (Criteria) this;
        }

        public Criteria andChannel4codeLessThan(String value) {
            addCriterion("CHANNEL4CODE <", value, "channel4code");
            return (Criteria) this;
        }

        public Criteria andChannel4codeLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL4CODE <=", value, "channel4code");
            return (Criteria) this;
        }

        public Criteria andChannel4codeLike(String value) {
            addCriterion("CHANNEL4CODE like", value, "channel4code");
            return (Criteria) this;
        }

        public Criteria andChannel4codeNotLike(String value) {
            addCriterion("CHANNEL4CODE not like", value, "channel4code");
            return (Criteria) this;
        }

        public Criteria andChannel4codeIn(List<String> values) {
            addCriterion("CHANNEL4CODE in", values, "channel4code");
            return (Criteria) this;
        }

        public Criteria andChannel4codeNotIn(List<String> values) {
            addCriterion("CHANNEL4CODE not in", values, "channel4code");
            return (Criteria) this;
        }

        public Criteria andChannel4codeBetween(String value1, String value2) {
            addCriterion("CHANNEL4CODE between", value1, value2, "channel4code");
            return (Criteria) this;
        }

        public Criteria andChannel4codeNotBetween(String value1, String value2) {
            addCriterion("CHANNEL4CODE not between", value1, value2, "channel4code");
            return (Criteria) this;
        }

        public Criteria andChannel4IsNull() {
            addCriterion("CHANNEL4 is null");
            return (Criteria) this;
        }

        public Criteria andChannel4IsNotNull() {
            addCriterion("CHANNEL4 is not null");
            return (Criteria) this;
        }

        public Criteria andChannel4EqualTo(String value) {
            addCriterion("CHANNEL4 =", value, "channel4");
            return (Criteria) this;
        }

        public Criteria andChannel4NotEqualTo(String value) {
            addCriterion("CHANNEL4 <>", value, "channel4");
            return (Criteria) this;
        }

        public Criteria andChannel4GreaterThan(String value) {
            addCriterion("CHANNEL4 >", value, "channel4");
            return (Criteria) this;
        }

        public Criteria andChannel4GreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL4 >=", value, "channel4");
            return (Criteria) this;
        }

        public Criteria andChannel4LessThan(String value) {
            addCriterion("CHANNEL4 <", value, "channel4");
            return (Criteria) this;
        }

        public Criteria andChannel4LessThanOrEqualTo(String value) {
            addCriterion("CHANNEL4 <=", value, "channel4");
            return (Criteria) this;
        }

        public Criteria andChannel4Like(String value) {
            addCriterion("CHANNEL4 like", value, "channel4");
            return (Criteria) this;
        }

        public Criteria andChannel4NotLike(String value) {
            addCriterion("CHANNEL4 not like", value, "channel4");
            return (Criteria) this;
        }

        public Criteria andChannel4In(List<String> values) {
            addCriterion("CHANNEL4 in", values, "channel4");
            return (Criteria) this;
        }

        public Criteria andChannel4NotIn(List<String> values) {
            addCriterion("CHANNEL4 not in", values, "channel4");
            return (Criteria) this;
        }

        public Criteria andChannel4Between(String value1, String value2) {
            addCriterion("CHANNEL4 between", value1, value2, "channel4");
            return (Criteria) this;
        }

        public Criteria andChannel4NotBetween(String value1, String value2) {
            addCriterion("CHANNEL4 not between", value1, value2, "channel4");
            return (Criteria) this;
        }

        public Criteria andGhcflagIsNull() {
            addCriterion("GHCFLAG is null");
            return (Criteria) this;
        }

        public Criteria andGhcflagIsNotNull() {
            addCriterion("GHCFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andGhcflagEqualTo(String value) {
            addCriterion("GHCFLAG =", value, "ghcflag");
            return (Criteria) this;
        }

        public Criteria andGhcflagNotEqualTo(String value) {
            addCriterion("GHCFLAG <>", value, "ghcflag");
            return (Criteria) this;
        }

        public Criteria andGhcflagGreaterThan(String value) {
            addCriterion("GHCFLAG >", value, "ghcflag");
            return (Criteria) this;
        }

        public Criteria andGhcflagGreaterThanOrEqualTo(String value) {
            addCriterion("GHCFLAG >=", value, "ghcflag");
            return (Criteria) this;
        }

        public Criteria andGhcflagLessThan(String value) {
            addCriterion("GHCFLAG <", value, "ghcflag");
            return (Criteria) this;
        }

        public Criteria andGhcflagLessThanOrEqualTo(String value) {
            addCriterion("GHCFLAG <=", value, "ghcflag");
            return (Criteria) this;
        }

        public Criteria andGhcflagLike(String value) {
            addCriterion("GHCFLAG like", value, "ghcflag");
            return (Criteria) this;
        }

        public Criteria andGhcflagNotLike(String value) {
            addCriterion("GHCFLAG not like", value, "ghcflag");
            return (Criteria) this;
        }

        public Criteria andGhcflagIn(List<String> values) {
            addCriterion("GHCFLAG in", values, "ghcflag");
            return (Criteria) this;
        }

        public Criteria andGhcflagNotIn(List<String> values) {
            addCriterion("GHCFLAG not in", values, "ghcflag");
            return (Criteria) this;
        }

        public Criteria andGhcflagBetween(String value1, String value2) {
            addCriterion("GHCFLAG between", value1, value2, "ghcflag");
            return (Criteria) this;
        }

        public Criteria andGhcflagNotBetween(String value1, String value2) {
            addCriterion("GHCFLAG not between", value1, value2, "ghcflag");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanageridIsNull() {
            addCriterion("GHCCLIENTMANAGERID is null");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanageridIsNotNull() {
            addCriterion("GHCCLIENTMANAGERID is not null");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanageridEqualTo(String value) {
            addCriterion("GHCCLIENTMANAGERID =", value, "ghcclientmanagerid");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanageridNotEqualTo(String value) {
            addCriterion("GHCCLIENTMANAGERID <>", value, "ghcclientmanagerid");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanageridGreaterThan(String value) {
            addCriterion("GHCCLIENTMANAGERID >", value, "ghcclientmanagerid");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanageridGreaterThanOrEqualTo(String value) {
            addCriterion("GHCCLIENTMANAGERID >=", value, "ghcclientmanagerid");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanageridLessThan(String value) {
            addCriterion("GHCCLIENTMANAGERID <", value, "ghcclientmanagerid");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanageridLessThanOrEqualTo(String value) {
            addCriterion("GHCCLIENTMANAGERID <=", value, "ghcclientmanagerid");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanageridLike(String value) {
            addCriterion("GHCCLIENTMANAGERID like", value, "ghcclientmanagerid");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanageridNotLike(String value) {
            addCriterion("GHCCLIENTMANAGERID not like", value, "ghcclientmanagerid");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanageridIn(List<String> values) {
            addCriterion("GHCCLIENTMANAGERID in", values, "ghcclientmanagerid");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanageridNotIn(List<String> values) {
            addCriterion("GHCCLIENTMANAGERID not in", values, "ghcclientmanagerid");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanageridBetween(String value1, String value2) {
            addCriterion("GHCCLIENTMANAGERID between", value1, value2, "ghcclientmanagerid");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanageridNotBetween(String value1, String value2) {
            addCriterion("GHCCLIENTMANAGERID not between", value1, value2, "ghcclientmanagerid");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanagernameIsNull() {
            addCriterion("GHCCLIENTMANAGERNAME is null");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanagernameIsNotNull() {
            addCriterion("GHCCLIENTMANAGERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanagernameEqualTo(String value) {
            addCriterion("GHCCLIENTMANAGERNAME =", value, "ghcclientmanagername");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanagernameNotEqualTo(String value) {
            addCriterion("GHCCLIENTMANAGERNAME <>", value, "ghcclientmanagername");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanagernameGreaterThan(String value) {
            addCriterion("GHCCLIENTMANAGERNAME >", value, "ghcclientmanagername");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanagernameGreaterThanOrEqualTo(String value) {
            addCriterion("GHCCLIENTMANAGERNAME >=", value, "ghcclientmanagername");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanagernameLessThan(String value) {
            addCriterion("GHCCLIENTMANAGERNAME <", value, "ghcclientmanagername");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanagernameLessThanOrEqualTo(String value) {
            addCriterion("GHCCLIENTMANAGERNAME <=", value, "ghcclientmanagername");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanagernameLike(String value) {
            addCriterion("GHCCLIENTMANAGERNAME like", value, "ghcclientmanagername");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanagernameNotLike(String value) {
            addCriterion("GHCCLIENTMANAGERNAME not like", value, "ghcclientmanagername");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanagernameIn(List<String> values) {
            addCriterion("GHCCLIENTMANAGERNAME in", values, "ghcclientmanagername");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanagernameNotIn(List<String> values) {
            addCriterion("GHCCLIENTMANAGERNAME not in", values, "ghcclientmanagername");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanagernameBetween(String value1, String value2) {
            addCriterion("GHCCLIENTMANAGERNAME between", value1, value2, "ghcclientmanagername");
            return (Criteria) this;
        }

        public Criteria andGhcclientmanagernameNotBetween(String value1, String value2) {
            addCriterion("GHCCLIENTMANAGERNAME not between", value1, value2, "ghcclientmanagername");
            return (Criteria) this;
        }

        public Criteria andMmwyregistertypeIsNull() {
            addCriterion("MMWYREGISTERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andMmwyregistertypeIsNotNull() {
            addCriterion("MMWYREGISTERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMmwyregistertypeEqualTo(String value) {
            addCriterion("MMWYREGISTERTYPE =", value, "mmwyregistertype");
            return (Criteria) this;
        }

        public Criteria andMmwyregistertypeNotEqualTo(String value) {
            addCriterion("MMWYREGISTERTYPE <>", value, "mmwyregistertype");
            return (Criteria) this;
        }

        public Criteria andMmwyregistertypeGreaterThan(String value) {
            addCriterion("MMWYREGISTERTYPE >", value, "mmwyregistertype");
            return (Criteria) this;
        }

        public Criteria andMmwyregistertypeGreaterThanOrEqualTo(String value) {
            addCriterion("MMWYREGISTERTYPE >=", value, "mmwyregistertype");
            return (Criteria) this;
        }

        public Criteria andMmwyregistertypeLessThan(String value) {
            addCriterion("MMWYREGISTERTYPE <", value, "mmwyregistertype");
            return (Criteria) this;
        }

        public Criteria andMmwyregistertypeLessThanOrEqualTo(String value) {
            addCriterion("MMWYREGISTERTYPE <=", value, "mmwyregistertype");
            return (Criteria) this;
        }

        public Criteria andMmwyregistertypeLike(String value) {
            addCriterion("MMWYREGISTERTYPE like", value, "mmwyregistertype");
            return (Criteria) this;
        }

        public Criteria andMmwyregistertypeNotLike(String value) {
            addCriterion("MMWYREGISTERTYPE not like", value, "mmwyregistertype");
            return (Criteria) this;
        }

        public Criteria andMmwyregistertypeIn(List<String> values) {
            addCriterion("MMWYREGISTERTYPE in", values, "mmwyregistertype");
            return (Criteria) this;
        }

        public Criteria andMmwyregistertypeNotIn(List<String> values) {
            addCriterion("MMWYREGISTERTYPE not in", values, "mmwyregistertype");
            return (Criteria) this;
        }

        public Criteria andMmwyregistertypeBetween(String value1, String value2) {
            addCriterion("MMWYREGISTERTYPE between", value1, value2, "mmwyregistertype");
            return (Criteria) this;
        }

        public Criteria andMmwyregistertypeNotBetween(String value1, String value2) {
            addCriterion("MMWYREGISTERTYPE not between", value1, value2, "mmwyregistertype");
            return (Criteria) this;
        }

        public Criteria andMmwyshareroleIsNull() {
            addCriterion("MMWYSHAREROLE is null");
            return (Criteria) this;
        }

        public Criteria andMmwyshareroleIsNotNull() {
            addCriterion("MMWYSHAREROLE is not null");
            return (Criteria) this;
        }

        public Criteria andMmwyshareroleEqualTo(String value) {
            addCriterion("MMWYSHAREROLE =", value, "mmwysharerole");
            return (Criteria) this;
        }

        public Criteria andMmwyshareroleNotEqualTo(String value) {
            addCriterion("MMWYSHAREROLE <>", value, "mmwysharerole");
            return (Criteria) this;
        }

        public Criteria andMmwyshareroleGreaterThan(String value) {
            addCriterion("MMWYSHAREROLE >", value, "mmwysharerole");
            return (Criteria) this;
        }

        public Criteria andMmwyshareroleGreaterThanOrEqualTo(String value) {
            addCriterion("MMWYSHAREROLE >=", value, "mmwysharerole");
            return (Criteria) this;
        }

        public Criteria andMmwyshareroleLessThan(String value) {
            addCriterion("MMWYSHAREROLE <", value, "mmwysharerole");
            return (Criteria) this;
        }

        public Criteria andMmwyshareroleLessThanOrEqualTo(String value) {
            addCriterion("MMWYSHAREROLE <=", value, "mmwysharerole");
            return (Criteria) this;
        }

        public Criteria andMmwyshareroleLike(String value) {
            addCriterion("MMWYSHAREROLE like", value, "mmwysharerole");
            return (Criteria) this;
        }

        public Criteria andMmwyshareroleNotLike(String value) {
            addCriterion("MMWYSHAREROLE not like", value, "mmwysharerole");
            return (Criteria) this;
        }

        public Criteria andMmwyshareroleIn(List<String> values) {
            addCriterion("MMWYSHAREROLE in", values, "mmwysharerole");
            return (Criteria) this;
        }

        public Criteria andMmwyshareroleNotIn(List<String> values) {
            addCriterion("MMWYSHAREROLE not in", values, "mmwysharerole");
            return (Criteria) this;
        }

        public Criteria andMmwyshareroleBetween(String value1, String value2) {
            addCriterion("MMWYSHAREROLE between", value1, value2, "mmwysharerole");
            return (Criteria) this;
        }

        public Criteria andMmwyshareroleNotBetween(String value1, String value2) {
            addCriterion("MMWYSHAREROLE not between", value1, value2, "mmwysharerole");
            return (Criteria) this;
        }

        public Criteria andClientwechataddIsNull() {
            addCriterion("CLIENTWECHATADD is null");
            return (Criteria) this;
        }

        public Criteria andClientwechataddIsNotNull() {
            addCriterion("CLIENTWECHATADD is not null");
            return (Criteria) this;
        }

        public Criteria andClientwechataddEqualTo(String value) {
            addCriterion("CLIENTWECHATADD =", value, "clientwechatadd");
            return (Criteria) this;
        }

        public Criteria andClientwechataddNotEqualTo(String value) {
            addCriterion("CLIENTWECHATADD <>", value, "clientwechatadd");
            return (Criteria) this;
        }

        public Criteria andClientwechataddGreaterThan(String value) {
            addCriterion("CLIENTWECHATADD >", value, "clientwechatadd");
            return (Criteria) this;
        }

        public Criteria andClientwechataddGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENTWECHATADD >=", value, "clientwechatadd");
            return (Criteria) this;
        }

        public Criteria andClientwechataddLessThan(String value) {
            addCriterion("CLIENTWECHATADD <", value, "clientwechatadd");
            return (Criteria) this;
        }

        public Criteria andClientwechataddLessThanOrEqualTo(String value) {
            addCriterion("CLIENTWECHATADD <=", value, "clientwechatadd");
            return (Criteria) this;
        }

        public Criteria andClientwechataddLike(String value) {
            addCriterion("CLIENTWECHATADD like", value, "clientwechatadd");
            return (Criteria) this;
        }

        public Criteria andClientwechataddNotLike(String value) {
            addCriterion("CLIENTWECHATADD not like", value, "clientwechatadd");
            return (Criteria) this;
        }

        public Criteria andClientwechataddIn(List<String> values) {
            addCriterion("CLIENTWECHATADD in", values, "clientwechatadd");
            return (Criteria) this;
        }

        public Criteria andClientwechataddNotIn(List<String> values) {
            addCriterion("CLIENTWECHATADD not in", values, "clientwechatadd");
            return (Criteria) this;
        }

        public Criteria andClientwechataddBetween(String value1, String value2) {
            addCriterion("CLIENTWECHATADD between", value1, value2, "clientwechatadd");
            return (Criteria) this;
        }

        public Criteria andClientwechataddNotBetween(String value1, String value2) {
            addCriterion("CLIENTWECHATADD not between", value1, value2, "clientwechatadd");
            return (Criteria) this;
        }

        public Criteria andConsultwechataddIsNull() {
            addCriterion("CONSULTWECHATADD is null");
            return (Criteria) this;
        }

        public Criteria andConsultwechataddIsNotNull() {
            addCriterion("CONSULTWECHATADD is not null");
            return (Criteria) this;
        }

        public Criteria andConsultwechataddEqualTo(String value) {
            addCriterion("CONSULTWECHATADD =", value, "consultwechatadd");
            return (Criteria) this;
        }

        public Criteria andConsultwechataddNotEqualTo(String value) {
            addCriterion("CONSULTWECHATADD <>", value, "consultwechatadd");
            return (Criteria) this;
        }

        public Criteria andConsultwechataddGreaterThan(String value) {
            addCriterion("CONSULTWECHATADD >", value, "consultwechatadd");
            return (Criteria) this;
        }

        public Criteria andConsultwechataddGreaterThanOrEqualTo(String value) {
            addCriterion("CONSULTWECHATADD >=", value, "consultwechatadd");
            return (Criteria) this;
        }

        public Criteria andConsultwechataddLessThan(String value) {
            addCriterion("CONSULTWECHATADD <", value, "consultwechatadd");
            return (Criteria) this;
        }

        public Criteria andConsultwechataddLessThanOrEqualTo(String value) {
            addCriterion("CONSULTWECHATADD <=", value, "consultwechatadd");
            return (Criteria) this;
        }

        public Criteria andConsultwechataddLike(String value) {
            addCriterion("CONSULTWECHATADD like", value, "consultwechatadd");
            return (Criteria) this;
        }

        public Criteria andConsultwechataddNotLike(String value) {
            addCriterion("CONSULTWECHATADD not like", value, "consultwechatadd");
            return (Criteria) this;
        }

        public Criteria andConsultwechataddIn(List<String> values) {
            addCriterion("CONSULTWECHATADD in", values, "consultwechatadd");
            return (Criteria) this;
        }

        public Criteria andConsultwechataddNotIn(List<String> values) {
            addCriterion("CONSULTWECHATADD not in", values, "consultwechatadd");
            return (Criteria) this;
        }

        public Criteria andConsultwechataddBetween(String value1, String value2) {
            addCriterion("CONSULTWECHATADD between", value1, value2, "consultwechatadd");
            return (Criteria) this;
        }

        public Criteria andConsultwechataddNotBetween(String value1, String value2) {
            addCriterion("CONSULTWECHATADD not between", value1, value2, "consultwechatadd");
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