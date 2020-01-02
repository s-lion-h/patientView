package com.slionh.patientview.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrmCouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmCouponExample() {
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

        public Criteria andAccountnoIsNull() {
            addCriterion("ACCOUNTNO is null");
            return (Criteria) this;
        }

        public Criteria andAccountnoIsNotNull() {
            addCriterion("ACCOUNTNO is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnoEqualTo(String value) {
            addCriterion("ACCOUNTNO =", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotEqualTo(String value) {
            addCriterion("ACCOUNTNO <>", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThan(String value) {
            addCriterion("ACCOUNTNO >", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO >=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThan(String value) {
            addCriterion("ACCOUNTNO <", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTNO <=", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoLike(String value) {
            addCriterion("ACCOUNTNO like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotLike(String value) {
            addCriterion("ACCOUNTNO not like", value, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoIn(List<String> values) {
            addCriterion("ACCOUNTNO in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotIn(List<String> values) {
            addCriterion("ACCOUNTNO not in", values, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO between", value1, value2, "accountno");
            return (Criteria) this;
        }

        public Criteria andAccountnoNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTNO not between", value1, value2, "accountno");
            return (Criteria) this;
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

        public Criteria andPatientnameIsNull() {
            addCriterion("PATIENTNAME is null");
            return (Criteria) this;
        }

        public Criteria andPatientnameIsNotNull() {
            addCriterion("PATIENTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPatientnameEqualTo(String value) {
            addCriterion("PATIENTNAME =", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotEqualTo(String value) {
            addCriterion("PATIENTNAME <>", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameGreaterThan(String value) {
            addCriterion("PATIENTNAME >", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENTNAME >=", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameLessThan(String value) {
            addCriterion("PATIENTNAME <", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameLessThanOrEqualTo(String value) {
            addCriterion("PATIENTNAME <=", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameLike(String value) {
            addCriterion("PATIENTNAME like", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotLike(String value) {
            addCriterion("PATIENTNAME not like", value, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameIn(List<String> values) {
            addCriterion("PATIENTNAME in", values, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotIn(List<String> values) {
            addCriterion("PATIENTNAME not in", values, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameBetween(String value1, String value2) {
            addCriterion("PATIENTNAME between", value1, value2, "patientname");
            return (Criteria) this;
        }

        public Criteria andPatientnameNotBetween(String value1, String value2) {
            addCriterion("PATIENTNAME not between", value1, value2, "patientname");
            return (Criteria) this;
        }

        public Criteria andCouponvacancyIsNull() {
            addCriterion("COUPONVACANCY is null");
            return (Criteria) this;
        }

        public Criteria andCouponvacancyIsNotNull() {
            addCriterion("COUPONVACANCY is not null");
            return (Criteria) this;
        }

        public Criteria andCouponvacancyEqualTo(BigDecimal value) {
            addCriterion("COUPONVACANCY =", value, "couponvacancy");
            return (Criteria) this;
        }

        public Criteria andCouponvacancyNotEqualTo(BigDecimal value) {
            addCriterion("COUPONVACANCY <>", value, "couponvacancy");
            return (Criteria) this;
        }

        public Criteria andCouponvacancyGreaterThan(BigDecimal value) {
            addCriterion("COUPONVACANCY >", value, "couponvacancy");
            return (Criteria) this;
        }

        public Criteria andCouponvacancyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPONVACANCY >=", value, "couponvacancy");
            return (Criteria) this;
        }

        public Criteria andCouponvacancyLessThan(BigDecimal value) {
            addCriterion("COUPONVACANCY <", value, "couponvacancy");
            return (Criteria) this;
        }

        public Criteria andCouponvacancyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPONVACANCY <=", value, "couponvacancy");
            return (Criteria) this;
        }

        public Criteria andCouponvacancyIn(List<BigDecimal> values) {
            addCriterion("COUPONVACANCY in", values, "couponvacancy");
            return (Criteria) this;
        }

        public Criteria andCouponvacancyNotIn(List<BigDecimal> values) {
            addCriterion("COUPONVACANCY not in", values, "couponvacancy");
            return (Criteria) this;
        }

        public Criteria andCouponvacancyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPONVACANCY between", value1, value2, "couponvacancy");
            return (Criteria) this;
        }

        public Criteria andCouponvacancyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPONVACANCY not between", value1, value2, "couponvacancy");
            return (Criteria) this;
        }

        public Criteria andDonatecouponvacancyIsNull() {
            addCriterion("DONATECOUPONVACANCY is null");
            return (Criteria) this;
        }

        public Criteria andDonatecouponvacancyIsNotNull() {
            addCriterion("DONATECOUPONVACANCY is not null");
            return (Criteria) this;
        }

        public Criteria andDonatecouponvacancyEqualTo(BigDecimal value) {
            addCriterion("DONATECOUPONVACANCY =", value, "donatecouponvacancy");
            return (Criteria) this;
        }

        public Criteria andDonatecouponvacancyNotEqualTo(BigDecimal value) {
            addCriterion("DONATECOUPONVACANCY <>", value, "donatecouponvacancy");
            return (Criteria) this;
        }

        public Criteria andDonatecouponvacancyGreaterThan(BigDecimal value) {
            addCriterion("DONATECOUPONVACANCY >", value, "donatecouponvacancy");
            return (Criteria) this;
        }

        public Criteria andDonatecouponvacancyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DONATECOUPONVACANCY >=", value, "donatecouponvacancy");
            return (Criteria) this;
        }

        public Criteria andDonatecouponvacancyLessThan(BigDecimal value) {
            addCriterion("DONATECOUPONVACANCY <", value, "donatecouponvacancy");
            return (Criteria) this;
        }

        public Criteria andDonatecouponvacancyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DONATECOUPONVACANCY <=", value, "donatecouponvacancy");
            return (Criteria) this;
        }

        public Criteria andDonatecouponvacancyIn(List<BigDecimal> values) {
            addCriterion("DONATECOUPONVACANCY in", values, "donatecouponvacancy");
            return (Criteria) this;
        }

        public Criteria andDonatecouponvacancyNotIn(List<BigDecimal> values) {
            addCriterion("DONATECOUPONVACANCY not in", values, "donatecouponvacancy");
            return (Criteria) this;
        }

        public Criteria andDonatecouponvacancyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DONATECOUPONVACANCY between", value1, value2, "donatecouponvacancy");
            return (Criteria) this;
        }

        public Criteria andDonatecouponvacancyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DONATECOUPONVACANCY not between", value1, value2, "donatecouponvacancy");
            return (Criteria) this;
        }

        public Criteria andCouponaccumulateIsNull() {
            addCriterion("COUPONACCUMULATE is null");
            return (Criteria) this;
        }

        public Criteria andCouponaccumulateIsNotNull() {
            addCriterion("COUPONACCUMULATE is not null");
            return (Criteria) this;
        }

        public Criteria andCouponaccumulateEqualTo(BigDecimal value) {
            addCriterion("COUPONACCUMULATE =", value, "couponaccumulate");
            return (Criteria) this;
        }

        public Criteria andCouponaccumulateNotEqualTo(BigDecimal value) {
            addCriterion("COUPONACCUMULATE <>", value, "couponaccumulate");
            return (Criteria) this;
        }

        public Criteria andCouponaccumulateGreaterThan(BigDecimal value) {
            addCriterion("COUPONACCUMULATE >", value, "couponaccumulate");
            return (Criteria) this;
        }

        public Criteria andCouponaccumulateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPONACCUMULATE >=", value, "couponaccumulate");
            return (Criteria) this;
        }

        public Criteria andCouponaccumulateLessThan(BigDecimal value) {
            addCriterion("COUPONACCUMULATE <", value, "couponaccumulate");
            return (Criteria) this;
        }

        public Criteria andCouponaccumulateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPONACCUMULATE <=", value, "couponaccumulate");
            return (Criteria) this;
        }

        public Criteria andCouponaccumulateIn(List<BigDecimal> values) {
            addCriterion("COUPONACCUMULATE in", values, "couponaccumulate");
            return (Criteria) this;
        }

        public Criteria andCouponaccumulateNotIn(List<BigDecimal> values) {
            addCriterion("COUPONACCUMULATE not in", values, "couponaccumulate");
            return (Criteria) this;
        }

        public Criteria andCouponaccumulateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPONACCUMULATE between", value1, value2, "couponaccumulate");
            return (Criteria) this;
        }

        public Criteria andCouponaccumulateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPONACCUMULATE not between", value1, value2, "couponaccumulate");
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

        public Criteria andPatientlevelEqualTo(Short value) {
            addCriterion("PATIENTLEVEL =", value, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelNotEqualTo(Short value) {
            addCriterion("PATIENTLEVEL <>", value, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelGreaterThan(Short value) {
            addCriterion("PATIENTLEVEL >", value, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelGreaterThanOrEqualTo(Short value) {
            addCriterion("PATIENTLEVEL >=", value, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelLessThan(Short value) {
            addCriterion("PATIENTLEVEL <", value, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelLessThanOrEqualTo(Short value) {
            addCriterion("PATIENTLEVEL <=", value, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelIn(List<Short> values) {
            addCriterion("PATIENTLEVEL in", values, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelNotIn(List<Short> values) {
            addCriterion("PATIENTLEVEL not in", values, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelBetween(Short value1, Short value2) {
            addCriterion("PATIENTLEVEL between", value1, value2, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andPatientlevelNotBetween(Short value1, Short value2) {
            addCriterion("PATIENTLEVEL not between", value1, value2, "patientlevel");
            return (Criteria) this;
        }

        public Criteria andLevelaccumulateIsNull() {
            addCriterion("LEVELACCUMULATE is null");
            return (Criteria) this;
        }

        public Criteria andLevelaccumulateIsNotNull() {
            addCriterion("LEVELACCUMULATE is not null");
            return (Criteria) this;
        }

        public Criteria andLevelaccumulateEqualTo(BigDecimal value) {
            addCriterion("LEVELACCUMULATE =", value, "levelaccumulate");
            return (Criteria) this;
        }

        public Criteria andLevelaccumulateNotEqualTo(BigDecimal value) {
            addCriterion("LEVELACCUMULATE <>", value, "levelaccumulate");
            return (Criteria) this;
        }

        public Criteria andLevelaccumulateGreaterThan(BigDecimal value) {
            addCriterion("LEVELACCUMULATE >", value, "levelaccumulate");
            return (Criteria) this;
        }

        public Criteria andLevelaccumulateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LEVELACCUMULATE >=", value, "levelaccumulate");
            return (Criteria) this;
        }

        public Criteria andLevelaccumulateLessThan(BigDecimal value) {
            addCriterion("LEVELACCUMULATE <", value, "levelaccumulate");
            return (Criteria) this;
        }

        public Criteria andLevelaccumulateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LEVELACCUMULATE <=", value, "levelaccumulate");
            return (Criteria) this;
        }

        public Criteria andLevelaccumulateIn(List<BigDecimal> values) {
            addCriterion("LEVELACCUMULATE in", values, "levelaccumulate");
            return (Criteria) this;
        }

        public Criteria andLevelaccumulateNotIn(List<BigDecimal> values) {
            addCriterion("LEVELACCUMULATE not in", values, "levelaccumulate");
            return (Criteria) this;
        }

        public Criteria andLevelaccumulateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEVELACCUMULATE between", value1, value2, "levelaccumulate");
            return (Criteria) this;
        }

        public Criteria andLevelaccumulateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LEVELACCUMULATE not between", value1, value2, "levelaccumulate");
            return (Criteria) this;
        }

        public Criteria andPeriodaccumulateIsNull() {
            addCriterion("PERIODACCUMULATE is null");
            return (Criteria) this;
        }

        public Criteria andPeriodaccumulateIsNotNull() {
            addCriterion("PERIODACCUMULATE is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodaccumulateEqualTo(BigDecimal value) {
            addCriterion("PERIODACCUMULATE =", value, "periodaccumulate");
            return (Criteria) this;
        }

        public Criteria andPeriodaccumulateNotEqualTo(BigDecimal value) {
            addCriterion("PERIODACCUMULATE <>", value, "periodaccumulate");
            return (Criteria) this;
        }

        public Criteria andPeriodaccumulateGreaterThan(BigDecimal value) {
            addCriterion("PERIODACCUMULATE >", value, "periodaccumulate");
            return (Criteria) this;
        }

        public Criteria andPeriodaccumulateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PERIODACCUMULATE >=", value, "periodaccumulate");
            return (Criteria) this;
        }

        public Criteria andPeriodaccumulateLessThan(BigDecimal value) {
            addCriterion("PERIODACCUMULATE <", value, "periodaccumulate");
            return (Criteria) this;
        }

        public Criteria andPeriodaccumulateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PERIODACCUMULATE <=", value, "periodaccumulate");
            return (Criteria) this;
        }

        public Criteria andPeriodaccumulateIn(List<BigDecimal> values) {
            addCriterion("PERIODACCUMULATE in", values, "periodaccumulate");
            return (Criteria) this;
        }

        public Criteria andPeriodaccumulateNotIn(List<BigDecimal> values) {
            addCriterion("PERIODACCUMULATE not in", values, "periodaccumulate");
            return (Criteria) this;
        }

        public Criteria andPeriodaccumulateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PERIODACCUMULATE between", value1, value2, "periodaccumulate");
            return (Criteria) this;
        }

        public Criteria andPeriodaccumulateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PERIODACCUMULATE not between", value1, value2, "periodaccumulate");
            return (Criteria) this;
        }

        public Criteria andLevelbeginIsNull() {
            addCriterion("LEVELBEGIN is null");
            return (Criteria) this;
        }

        public Criteria andLevelbeginIsNotNull() {
            addCriterion("LEVELBEGIN is not null");
            return (Criteria) this;
        }

        public Criteria andLevelbeginEqualTo(Date value) {
            addCriterion("LEVELBEGIN =", value, "levelbegin");
            return (Criteria) this;
        }

        public Criteria andLevelbeginNotEqualTo(Date value) {
            addCriterion("LEVELBEGIN <>", value, "levelbegin");
            return (Criteria) this;
        }

        public Criteria andLevelbeginGreaterThan(Date value) {
            addCriterion("LEVELBEGIN >", value, "levelbegin");
            return (Criteria) this;
        }

        public Criteria andLevelbeginGreaterThanOrEqualTo(Date value) {
            addCriterion("LEVELBEGIN >=", value, "levelbegin");
            return (Criteria) this;
        }

        public Criteria andLevelbeginLessThan(Date value) {
            addCriterion("LEVELBEGIN <", value, "levelbegin");
            return (Criteria) this;
        }

        public Criteria andLevelbeginLessThanOrEqualTo(Date value) {
            addCriterion("LEVELBEGIN <=", value, "levelbegin");
            return (Criteria) this;
        }

        public Criteria andLevelbeginIn(List<Date> values) {
            addCriterion("LEVELBEGIN in", values, "levelbegin");
            return (Criteria) this;
        }

        public Criteria andLevelbeginNotIn(List<Date> values) {
            addCriterion("LEVELBEGIN not in", values, "levelbegin");
            return (Criteria) this;
        }

        public Criteria andLevelbeginBetween(Date value1, Date value2) {
            addCriterion("LEVELBEGIN between", value1, value2, "levelbegin");
            return (Criteria) this;
        }

        public Criteria andLevelbeginNotBetween(Date value1, Date value2) {
            addCriterion("LEVELBEGIN not between", value1, value2, "levelbegin");
            return (Criteria) this;
        }

        public Criteria andLevelendIsNull() {
            addCriterion("LEVELEND is null");
            return (Criteria) this;
        }

        public Criteria andLevelendIsNotNull() {
            addCriterion("LEVELEND is not null");
            return (Criteria) this;
        }

        public Criteria andLevelendEqualTo(Date value) {
            addCriterion("LEVELEND =", value, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendNotEqualTo(Date value) {
            addCriterion("LEVELEND <>", value, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendGreaterThan(Date value) {
            addCriterion("LEVELEND >", value, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendGreaterThanOrEqualTo(Date value) {
            addCriterion("LEVELEND >=", value, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendLessThan(Date value) {
            addCriterion("LEVELEND <", value, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendLessThanOrEqualTo(Date value) {
            addCriterion("LEVELEND <=", value, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendIn(List<Date> values) {
            addCriterion("LEVELEND in", values, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendNotIn(List<Date> values) {
            addCriterion("LEVELEND not in", values, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendBetween(Date value1, Date value2) {
            addCriterion("LEVELEND between", value1, value2, "levelend");
            return (Criteria) this;
        }

        public Criteria andLevelendNotBetween(Date value1, Date value2) {
            addCriterion("LEVELEND not between", value1, value2, "levelend");
            return (Criteria) this;
        }

        public Criteria andLastoperdateIsNull() {
            addCriterion("LASTOPERDATE is null");
            return (Criteria) this;
        }

        public Criteria andLastoperdateIsNotNull() {
            addCriterion("LASTOPERDATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastoperdateEqualTo(Date value) {
            addCriterion("LASTOPERDATE =", value, "lastoperdate");
            return (Criteria) this;
        }

        public Criteria andLastoperdateNotEqualTo(Date value) {
            addCriterion("LASTOPERDATE <>", value, "lastoperdate");
            return (Criteria) this;
        }

        public Criteria andLastoperdateGreaterThan(Date value) {
            addCriterion("LASTOPERDATE >", value, "lastoperdate");
            return (Criteria) this;
        }

        public Criteria andLastoperdateGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTOPERDATE >=", value, "lastoperdate");
            return (Criteria) this;
        }

        public Criteria andLastoperdateLessThan(Date value) {
            addCriterion("LASTOPERDATE <", value, "lastoperdate");
            return (Criteria) this;
        }

        public Criteria andLastoperdateLessThanOrEqualTo(Date value) {
            addCriterion("LASTOPERDATE <=", value, "lastoperdate");
            return (Criteria) this;
        }

        public Criteria andLastoperdateIn(List<Date> values) {
            addCriterion("LASTOPERDATE in", values, "lastoperdate");
            return (Criteria) this;
        }

        public Criteria andLastoperdateNotIn(List<Date> values) {
            addCriterion("LASTOPERDATE not in", values, "lastoperdate");
            return (Criteria) this;
        }

        public Criteria andLastoperdateBetween(Date value1, Date value2) {
            addCriterion("LASTOPERDATE between", value1, value2, "lastoperdate");
            return (Criteria) this;
        }

        public Criteria andLastoperdateNotBetween(Date value1, Date value2) {
            addCriterion("LASTOPERDATE not between", value1, value2, "lastoperdate");
            return (Criteria) this;
        }

        public Criteria andLastopercodeIsNull() {
            addCriterion("LASTOPERCODE is null");
            return (Criteria) this;
        }

        public Criteria andLastopercodeIsNotNull() {
            addCriterion("LASTOPERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andLastopercodeEqualTo(String value) {
            addCriterion("LASTOPERCODE =", value, "lastopercode");
            return (Criteria) this;
        }

        public Criteria andLastopercodeNotEqualTo(String value) {
            addCriterion("LASTOPERCODE <>", value, "lastopercode");
            return (Criteria) this;
        }

        public Criteria andLastopercodeGreaterThan(String value) {
            addCriterion("LASTOPERCODE >", value, "lastopercode");
            return (Criteria) this;
        }

        public Criteria andLastopercodeGreaterThanOrEqualTo(String value) {
            addCriterion("LASTOPERCODE >=", value, "lastopercode");
            return (Criteria) this;
        }

        public Criteria andLastopercodeLessThan(String value) {
            addCriterion("LASTOPERCODE <", value, "lastopercode");
            return (Criteria) this;
        }

        public Criteria andLastopercodeLessThanOrEqualTo(String value) {
            addCriterion("LASTOPERCODE <=", value, "lastopercode");
            return (Criteria) this;
        }

        public Criteria andLastopercodeLike(String value) {
            addCriterion("LASTOPERCODE like", value, "lastopercode");
            return (Criteria) this;
        }

        public Criteria andLastopercodeNotLike(String value) {
            addCriterion("LASTOPERCODE not like", value, "lastopercode");
            return (Criteria) this;
        }

        public Criteria andLastopercodeIn(List<String> values) {
            addCriterion("LASTOPERCODE in", values, "lastopercode");
            return (Criteria) this;
        }

        public Criteria andLastopercodeNotIn(List<String> values) {
            addCriterion("LASTOPERCODE not in", values, "lastopercode");
            return (Criteria) this;
        }

        public Criteria andLastopercodeBetween(String value1, String value2) {
            addCriterion("LASTOPERCODE between", value1, value2, "lastopercode");
            return (Criteria) this;
        }

        public Criteria andLastopercodeNotBetween(String value1, String value2) {
            addCriterion("LASTOPERCODE not between", value1, value2, "lastopercode");
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