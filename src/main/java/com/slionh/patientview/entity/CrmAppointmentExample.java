package com.slionh.patientview.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrmAppointmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmAppointmentExample() {
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

        public Criteria andAppointidIsNull() {
            addCriterion("APPOINTID is null");
            return (Criteria) this;
        }

        public Criteria andAppointidIsNotNull() {
            addCriterion("APPOINTID is not null");
            return (Criteria) this;
        }

        public Criteria andAppointidEqualTo(String value) {
            addCriterion("APPOINTID =", value, "appointid");
            return (Criteria) this;
        }

        public Criteria andAppointidNotEqualTo(String value) {
            addCriterion("APPOINTID <>", value, "appointid");
            return (Criteria) this;
        }

        public Criteria andAppointidGreaterThan(String value) {
            addCriterion("APPOINTID >", value, "appointid");
            return (Criteria) this;
        }

        public Criteria andAppointidGreaterThanOrEqualTo(String value) {
            addCriterion("APPOINTID >=", value, "appointid");
            return (Criteria) this;
        }

        public Criteria andAppointidLessThan(String value) {
            addCriterion("APPOINTID <", value, "appointid");
            return (Criteria) this;
        }

        public Criteria andAppointidLessThanOrEqualTo(String value) {
            addCriterion("APPOINTID <=", value, "appointid");
            return (Criteria) this;
        }

        public Criteria andAppointidLike(String value) {
            addCriterion("APPOINTID like", value, "appointid");
            return (Criteria) this;
        }

        public Criteria andAppointidNotLike(String value) {
            addCriterion("APPOINTID not like", value, "appointid");
            return (Criteria) this;
        }

        public Criteria andAppointidIn(List<String> values) {
            addCriterion("APPOINTID in", values, "appointid");
            return (Criteria) this;
        }

        public Criteria andAppointidNotIn(List<String> values) {
            addCriterion("APPOINTID not in", values, "appointid");
            return (Criteria) this;
        }

        public Criteria andAppointidBetween(String value1, String value2) {
            addCriterion("APPOINTID between", value1, value2, "appointid");
            return (Criteria) this;
        }

        public Criteria andAppointidNotBetween(String value1, String value2) {
            addCriterion("APPOINTID not between", value1, value2, "appointid");
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

        public Criteria andConsultidIsNull() {
            addCriterion("CONSULTID is null");
            return (Criteria) this;
        }

        public Criteria andConsultidIsNotNull() {
            addCriterion("CONSULTID is not null");
            return (Criteria) this;
        }

        public Criteria andConsultidEqualTo(String value) {
            addCriterion("CONSULTID =", value, "consultid");
            return (Criteria) this;
        }

        public Criteria andConsultidNotEqualTo(String value) {
            addCriterion("CONSULTID <>", value, "consultid");
            return (Criteria) this;
        }

        public Criteria andConsultidGreaterThan(String value) {
            addCriterion("CONSULTID >", value, "consultid");
            return (Criteria) this;
        }

        public Criteria andConsultidGreaterThanOrEqualTo(String value) {
            addCriterion("CONSULTID >=", value, "consultid");
            return (Criteria) this;
        }

        public Criteria andConsultidLessThan(String value) {
            addCriterion("CONSULTID <", value, "consultid");
            return (Criteria) this;
        }

        public Criteria andConsultidLessThanOrEqualTo(String value) {
            addCriterion("CONSULTID <=", value, "consultid");
            return (Criteria) this;
        }

        public Criteria andConsultidLike(String value) {
            addCriterion("CONSULTID like", value, "consultid");
            return (Criteria) this;
        }

        public Criteria andConsultidNotLike(String value) {
            addCriterion("CONSULTID not like", value, "consultid");
            return (Criteria) this;
        }

        public Criteria andConsultidIn(List<String> values) {
            addCriterion("CONSULTID in", values, "consultid");
            return (Criteria) this;
        }

        public Criteria andConsultidNotIn(List<String> values) {
            addCriterion("CONSULTID not in", values, "consultid");
            return (Criteria) this;
        }

        public Criteria andConsultidBetween(String value1, String value2) {
            addCriterion("CONSULTID between", value1, value2, "consultid");
            return (Criteria) this;
        }

        public Criteria andConsultidNotBetween(String value1, String value2) {
            addCriterion("CONSULTID not between", value1, value2, "consultid");
            return (Criteria) this;
        }

        public Criteria andAppointdateIsNull() {
            addCriterion("APPOINTDATE is null");
            return (Criteria) this;
        }

        public Criteria andAppointdateIsNotNull() {
            addCriterion("APPOINTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAppointdateEqualTo(Date value) {
            addCriterion("APPOINTDATE =", value, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateNotEqualTo(Date value) {
            addCriterion("APPOINTDATE <>", value, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateGreaterThan(Date value) {
            addCriterion("APPOINTDATE >", value, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPOINTDATE >=", value, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateLessThan(Date value) {
            addCriterion("APPOINTDATE <", value, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateLessThanOrEqualTo(Date value) {
            addCriterion("APPOINTDATE <=", value, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateIn(List<Date> values) {
            addCriterion("APPOINTDATE in", values, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateNotIn(List<Date> values) {
            addCriterion("APPOINTDATE not in", values, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateBetween(Date value1, Date value2) {
            addCriterion("APPOINTDATE between", value1, value2, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointdateNotBetween(Date value1, Date value2) {
            addCriterion("APPOINTDATE not between", value1, value2, "appointdate");
            return (Criteria) this;
        }

        public Criteria andAppointtypeIsNull() {
            addCriterion("APPOINTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAppointtypeIsNotNull() {
            addCriterion("APPOINTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAppointtypeEqualTo(String value) {
            addCriterion("APPOINTTYPE =", value, "appointtype");
            return (Criteria) this;
        }

        public Criteria andAppointtypeNotEqualTo(String value) {
            addCriterion("APPOINTTYPE <>", value, "appointtype");
            return (Criteria) this;
        }

        public Criteria andAppointtypeGreaterThan(String value) {
            addCriterion("APPOINTTYPE >", value, "appointtype");
            return (Criteria) this;
        }

        public Criteria andAppointtypeGreaterThanOrEqualTo(String value) {
            addCriterion("APPOINTTYPE >=", value, "appointtype");
            return (Criteria) this;
        }

        public Criteria andAppointtypeLessThan(String value) {
            addCriterion("APPOINTTYPE <", value, "appointtype");
            return (Criteria) this;
        }

        public Criteria andAppointtypeLessThanOrEqualTo(String value) {
            addCriterion("APPOINTTYPE <=", value, "appointtype");
            return (Criteria) this;
        }

        public Criteria andAppointtypeLike(String value) {
            addCriterion("APPOINTTYPE like", value, "appointtype");
            return (Criteria) this;
        }

        public Criteria andAppointtypeNotLike(String value) {
            addCriterion("APPOINTTYPE not like", value, "appointtype");
            return (Criteria) this;
        }

        public Criteria andAppointtypeIn(List<String> values) {
            addCriterion("APPOINTTYPE in", values, "appointtype");
            return (Criteria) this;
        }

        public Criteria andAppointtypeNotIn(List<String> values) {
            addCriterion("APPOINTTYPE not in", values, "appointtype");
            return (Criteria) this;
        }

        public Criteria andAppointtypeBetween(String value1, String value2) {
            addCriterion("APPOINTTYPE between", value1, value2, "appointtype");
            return (Criteria) this;
        }

        public Criteria andAppointtypeNotBetween(String value1, String value2) {
            addCriterion("APPOINTTYPE not between", value1, value2, "appointtype");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("DEPTID is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("DEPTID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(String value) {
            addCriterion("DEPTID =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(String value) {
            addCriterion("DEPTID <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(String value) {
            addCriterion("DEPTID >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTID >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(String value) {
            addCriterion("DEPTID <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(String value) {
            addCriterion("DEPTID <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLike(String value) {
            addCriterion("DEPTID like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotLike(String value) {
            addCriterion("DEPTID not like", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<String> values) {
            addCriterion("DEPTID in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<String> values) {
            addCriterion("DEPTID not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(String value1, String value2) {
            addCriterion("DEPTID between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(String value1, String value2) {
            addCriterion("DEPTID not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNull() {
            addCriterion("DEPTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNotNull() {
            addCriterion("DEPTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnameEqualTo(String value) {
            addCriterion("DEPTNAME =", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotEqualTo(String value) {
            addCriterion("DEPTNAME <>", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThan(String value) {
            addCriterion("DEPTNAME >", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTNAME >=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThan(String value) {
            addCriterion("DEPTNAME <", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThanOrEqualTo(String value) {
            addCriterion("DEPTNAME <=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLike(String value) {
            addCriterion("DEPTNAME like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotLike(String value) {
            addCriterion("DEPTNAME not like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIn(List<String> values) {
            addCriterion("DEPTNAME in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotIn(List<String> values) {
            addCriterion("DEPTNAME not in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameBetween(String value1, String value2) {
            addCriterion("DEPTNAME between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotBetween(String value1, String value2) {
            addCriterion("DEPTNAME not between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDoctidIsNull() {
            addCriterion("DOCTID is null");
            return (Criteria) this;
        }

        public Criteria andDoctidIsNotNull() {
            addCriterion("DOCTID is not null");
            return (Criteria) this;
        }

        public Criteria andDoctidEqualTo(String value) {
            addCriterion("DOCTID =", value, "doctid");
            return (Criteria) this;
        }

        public Criteria andDoctidNotEqualTo(String value) {
            addCriterion("DOCTID <>", value, "doctid");
            return (Criteria) this;
        }

        public Criteria andDoctidGreaterThan(String value) {
            addCriterion("DOCTID >", value, "doctid");
            return (Criteria) this;
        }

        public Criteria andDoctidGreaterThanOrEqualTo(String value) {
            addCriterion("DOCTID >=", value, "doctid");
            return (Criteria) this;
        }

        public Criteria andDoctidLessThan(String value) {
            addCriterion("DOCTID <", value, "doctid");
            return (Criteria) this;
        }

        public Criteria andDoctidLessThanOrEqualTo(String value) {
            addCriterion("DOCTID <=", value, "doctid");
            return (Criteria) this;
        }

        public Criteria andDoctidLike(String value) {
            addCriterion("DOCTID like", value, "doctid");
            return (Criteria) this;
        }

        public Criteria andDoctidNotLike(String value) {
            addCriterion("DOCTID not like", value, "doctid");
            return (Criteria) this;
        }

        public Criteria andDoctidIn(List<String> values) {
            addCriterion("DOCTID in", values, "doctid");
            return (Criteria) this;
        }

        public Criteria andDoctidNotIn(List<String> values) {
            addCriterion("DOCTID not in", values, "doctid");
            return (Criteria) this;
        }

        public Criteria andDoctidBetween(String value1, String value2) {
            addCriterion("DOCTID between", value1, value2, "doctid");
            return (Criteria) this;
        }

        public Criteria andDoctidNotBetween(String value1, String value2) {
            addCriterion("DOCTID not between", value1, value2, "doctid");
            return (Criteria) this;
        }

        public Criteria andDoctnameIsNull() {
            addCriterion("DOCTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDoctnameIsNotNull() {
            addCriterion("DOCTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDoctnameEqualTo(String value) {
            addCriterion("DOCTNAME =", value, "doctname");
            return (Criteria) this;
        }

        public Criteria andDoctnameNotEqualTo(String value) {
            addCriterion("DOCTNAME <>", value, "doctname");
            return (Criteria) this;
        }

        public Criteria andDoctnameGreaterThan(String value) {
            addCriterion("DOCTNAME >", value, "doctname");
            return (Criteria) this;
        }

        public Criteria andDoctnameGreaterThanOrEqualTo(String value) {
            addCriterion("DOCTNAME >=", value, "doctname");
            return (Criteria) this;
        }

        public Criteria andDoctnameLessThan(String value) {
            addCriterion("DOCTNAME <", value, "doctname");
            return (Criteria) this;
        }

        public Criteria andDoctnameLessThanOrEqualTo(String value) {
            addCriterion("DOCTNAME <=", value, "doctname");
            return (Criteria) this;
        }

        public Criteria andDoctnameLike(String value) {
            addCriterion("DOCTNAME like", value, "doctname");
            return (Criteria) this;
        }

        public Criteria andDoctnameNotLike(String value) {
            addCriterion("DOCTNAME not like", value, "doctname");
            return (Criteria) this;
        }

        public Criteria andDoctnameIn(List<String> values) {
            addCriterion("DOCTNAME in", values, "doctname");
            return (Criteria) this;
        }

        public Criteria andDoctnameNotIn(List<String> values) {
            addCriterion("DOCTNAME not in", values, "doctname");
            return (Criteria) this;
        }

        public Criteria andDoctnameBetween(String value1, String value2) {
            addCriterion("DOCTNAME between", value1, value2, "doctname");
            return (Criteria) this;
        }

        public Criteria andDoctnameNotBetween(String value1, String value2) {
            addCriterion("DOCTNAME not between", value1, value2, "doctname");
            return (Criteria) this;
        }

        public Criteria andAppointitemIsNull() {
            addCriterion("APPOINTITEM is null");
            return (Criteria) this;
        }

        public Criteria andAppointitemIsNotNull() {
            addCriterion("APPOINTITEM is not null");
            return (Criteria) this;
        }

        public Criteria andAppointitemEqualTo(String value) {
            addCriterion("APPOINTITEM =", value, "appointitem");
            return (Criteria) this;
        }

        public Criteria andAppointitemNotEqualTo(String value) {
            addCriterion("APPOINTITEM <>", value, "appointitem");
            return (Criteria) this;
        }

        public Criteria andAppointitemGreaterThan(String value) {
            addCriterion("APPOINTITEM >", value, "appointitem");
            return (Criteria) this;
        }

        public Criteria andAppointitemGreaterThanOrEqualTo(String value) {
            addCriterion("APPOINTITEM >=", value, "appointitem");
            return (Criteria) this;
        }

        public Criteria andAppointitemLessThan(String value) {
            addCriterion("APPOINTITEM <", value, "appointitem");
            return (Criteria) this;
        }

        public Criteria andAppointitemLessThanOrEqualTo(String value) {
            addCriterion("APPOINTITEM <=", value, "appointitem");
            return (Criteria) this;
        }

        public Criteria andAppointitemLike(String value) {
            addCriterion("APPOINTITEM like", value, "appointitem");
            return (Criteria) this;
        }

        public Criteria andAppointitemNotLike(String value) {
            addCriterion("APPOINTITEM not like", value, "appointitem");
            return (Criteria) this;
        }

        public Criteria andAppointitemIn(List<String> values) {
            addCriterion("APPOINTITEM in", values, "appointitem");
            return (Criteria) this;
        }

        public Criteria andAppointitemNotIn(List<String> values) {
            addCriterion("APPOINTITEM not in", values, "appointitem");
            return (Criteria) this;
        }

        public Criteria andAppointitemBetween(String value1, String value2) {
            addCriterion("APPOINTITEM between", value1, value2, "appointitem");
            return (Criteria) this;
        }

        public Criteria andAppointitemNotBetween(String value1, String value2) {
            addCriterion("APPOINTITEM not between", value1, value2, "appointitem");
            return (Criteria) this;
        }

        public Criteria andAppointmarketingIsNull() {
            addCriterion("APPOINTMARKETING is null");
            return (Criteria) this;
        }

        public Criteria andAppointmarketingIsNotNull() {
            addCriterion("APPOINTMARKETING is not null");
            return (Criteria) this;
        }

        public Criteria andAppointmarketingEqualTo(String value) {
            addCriterion("APPOINTMARKETING =", value, "appointmarketing");
            return (Criteria) this;
        }

        public Criteria andAppointmarketingNotEqualTo(String value) {
            addCriterion("APPOINTMARKETING <>", value, "appointmarketing");
            return (Criteria) this;
        }

        public Criteria andAppointmarketingGreaterThan(String value) {
            addCriterion("APPOINTMARKETING >", value, "appointmarketing");
            return (Criteria) this;
        }

        public Criteria andAppointmarketingGreaterThanOrEqualTo(String value) {
            addCriterion("APPOINTMARKETING >=", value, "appointmarketing");
            return (Criteria) this;
        }

        public Criteria andAppointmarketingLessThan(String value) {
            addCriterion("APPOINTMARKETING <", value, "appointmarketing");
            return (Criteria) this;
        }

        public Criteria andAppointmarketingLessThanOrEqualTo(String value) {
            addCriterion("APPOINTMARKETING <=", value, "appointmarketing");
            return (Criteria) this;
        }

        public Criteria andAppointmarketingLike(String value) {
            addCriterion("APPOINTMARKETING like", value, "appointmarketing");
            return (Criteria) this;
        }

        public Criteria andAppointmarketingNotLike(String value) {
            addCriterion("APPOINTMARKETING not like", value, "appointmarketing");
            return (Criteria) this;
        }

        public Criteria andAppointmarketingIn(List<String> values) {
            addCriterion("APPOINTMARKETING in", values, "appointmarketing");
            return (Criteria) this;
        }

        public Criteria andAppointmarketingNotIn(List<String> values) {
            addCriterion("APPOINTMARKETING not in", values, "appointmarketing");
            return (Criteria) this;
        }

        public Criteria andAppointmarketingBetween(String value1, String value2) {
            addCriterion("APPOINTMARKETING between", value1, value2, "appointmarketing");
            return (Criteria) this;
        }

        public Criteria andAppointmarketingNotBetween(String value1, String value2) {
            addCriterion("APPOINTMARKETING not between", value1, value2, "appointmarketing");
            return (Criteria) this;
        }

        public Criteria andAppointsmsIsNull() {
            addCriterion("APPOINTSMS is null");
            return (Criteria) this;
        }

        public Criteria andAppointsmsIsNotNull() {
            addCriterion("APPOINTSMS is not null");
            return (Criteria) this;
        }

        public Criteria andAppointsmsEqualTo(String value) {
            addCriterion("APPOINTSMS =", value, "appointsms");
            return (Criteria) this;
        }

        public Criteria andAppointsmsNotEqualTo(String value) {
            addCriterion("APPOINTSMS <>", value, "appointsms");
            return (Criteria) this;
        }

        public Criteria andAppointsmsGreaterThan(String value) {
            addCriterion("APPOINTSMS >", value, "appointsms");
            return (Criteria) this;
        }

        public Criteria andAppointsmsGreaterThanOrEqualTo(String value) {
            addCriterion("APPOINTSMS >=", value, "appointsms");
            return (Criteria) this;
        }

        public Criteria andAppointsmsLessThan(String value) {
            addCriterion("APPOINTSMS <", value, "appointsms");
            return (Criteria) this;
        }

        public Criteria andAppointsmsLessThanOrEqualTo(String value) {
            addCriterion("APPOINTSMS <=", value, "appointsms");
            return (Criteria) this;
        }

        public Criteria andAppointsmsLike(String value) {
            addCriterion("APPOINTSMS like", value, "appointsms");
            return (Criteria) this;
        }

        public Criteria andAppointsmsNotLike(String value) {
            addCriterion("APPOINTSMS not like", value, "appointsms");
            return (Criteria) this;
        }

        public Criteria andAppointsmsIn(List<String> values) {
            addCriterion("APPOINTSMS in", values, "appointsms");
            return (Criteria) this;
        }

        public Criteria andAppointsmsNotIn(List<String> values) {
            addCriterion("APPOINTSMS not in", values, "appointsms");
            return (Criteria) this;
        }

        public Criteria andAppointsmsBetween(String value1, String value2) {
            addCriterion("APPOINTSMS between", value1, value2, "appointsms");
            return (Criteria) this;
        }

        public Criteria andAppointsmsNotBetween(String value1, String value2) {
            addCriterion("APPOINTSMS not between", value1, value2, "appointsms");
            return (Criteria) this;
        }

        public Criteria andRemindsmsIsNull() {
            addCriterion("REMINDSMS is null");
            return (Criteria) this;
        }

        public Criteria andRemindsmsIsNotNull() {
            addCriterion("REMINDSMS is not null");
            return (Criteria) this;
        }

        public Criteria andRemindsmsEqualTo(String value) {
            addCriterion("REMINDSMS =", value, "remindsms");
            return (Criteria) this;
        }

        public Criteria andRemindsmsNotEqualTo(String value) {
            addCriterion("REMINDSMS <>", value, "remindsms");
            return (Criteria) this;
        }

        public Criteria andRemindsmsGreaterThan(String value) {
            addCriterion("REMINDSMS >", value, "remindsms");
            return (Criteria) this;
        }

        public Criteria andRemindsmsGreaterThanOrEqualTo(String value) {
            addCriterion("REMINDSMS >=", value, "remindsms");
            return (Criteria) this;
        }

        public Criteria andRemindsmsLessThan(String value) {
            addCriterion("REMINDSMS <", value, "remindsms");
            return (Criteria) this;
        }

        public Criteria andRemindsmsLessThanOrEqualTo(String value) {
            addCriterion("REMINDSMS <=", value, "remindsms");
            return (Criteria) this;
        }

        public Criteria andRemindsmsLike(String value) {
            addCriterion("REMINDSMS like", value, "remindsms");
            return (Criteria) this;
        }

        public Criteria andRemindsmsNotLike(String value) {
            addCriterion("REMINDSMS not like", value, "remindsms");
            return (Criteria) this;
        }

        public Criteria andRemindsmsIn(List<String> values) {
            addCriterion("REMINDSMS in", values, "remindsms");
            return (Criteria) this;
        }

        public Criteria andRemindsmsNotIn(List<String> values) {
            addCriterion("REMINDSMS not in", values, "remindsms");
            return (Criteria) this;
        }

        public Criteria andRemindsmsBetween(String value1, String value2) {
            addCriterion("REMINDSMS between", value1, value2, "remindsms");
            return (Criteria) this;
        }

        public Criteria andRemindsmsNotBetween(String value1, String value2) {
            addCriterion("REMINDSMS not between", value1, value2, "remindsms");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCliniccodeIsNull() {
            addCriterion("CLINICCODE is null");
            return (Criteria) this;
        }

        public Criteria andCliniccodeIsNotNull() {
            addCriterion("CLINICCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCliniccodeEqualTo(String value) {
            addCriterion("CLINICCODE =", value, "cliniccode");
            return (Criteria) this;
        }

        public Criteria andCliniccodeNotEqualTo(String value) {
            addCriterion("CLINICCODE <>", value, "cliniccode");
            return (Criteria) this;
        }

        public Criteria andCliniccodeGreaterThan(String value) {
            addCriterion("CLINICCODE >", value, "cliniccode");
            return (Criteria) this;
        }

        public Criteria andCliniccodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLINICCODE >=", value, "cliniccode");
            return (Criteria) this;
        }

        public Criteria andCliniccodeLessThan(String value) {
            addCriterion("CLINICCODE <", value, "cliniccode");
            return (Criteria) this;
        }

        public Criteria andCliniccodeLessThanOrEqualTo(String value) {
            addCriterion("CLINICCODE <=", value, "cliniccode");
            return (Criteria) this;
        }

        public Criteria andCliniccodeLike(String value) {
            addCriterion("CLINICCODE like", value, "cliniccode");
            return (Criteria) this;
        }

        public Criteria andCliniccodeNotLike(String value) {
            addCriterion("CLINICCODE not like", value, "cliniccode");
            return (Criteria) this;
        }

        public Criteria andCliniccodeIn(List<String> values) {
            addCriterion("CLINICCODE in", values, "cliniccode");
            return (Criteria) this;
        }

        public Criteria andCliniccodeNotIn(List<String> values) {
            addCriterion("CLINICCODE not in", values, "cliniccode");
            return (Criteria) this;
        }

        public Criteria andCliniccodeBetween(String value1, String value2) {
            addCriterion("CLINICCODE between", value1, value2, "cliniccode");
            return (Criteria) this;
        }

        public Criteria andCliniccodeNotBetween(String value1, String value2) {
            addCriterion("CLINICCODE not between", value1, value2, "cliniccode");
            return (Criteria) this;
        }

        public Criteria andTriageoperidIsNull() {
            addCriterion("TRIAGEOPERID is null");
            return (Criteria) this;
        }

        public Criteria andTriageoperidIsNotNull() {
            addCriterion("TRIAGEOPERID is not null");
            return (Criteria) this;
        }

        public Criteria andTriageoperidEqualTo(String value) {
            addCriterion("TRIAGEOPERID =", value, "triageoperid");
            return (Criteria) this;
        }

        public Criteria andTriageoperidNotEqualTo(String value) {
            addCriterion("TRIAGEOPERID <>", value, "triageoperid");
            return (Criteria) this;
        }

        public Criteria andTriageoperidGreaterThan(String value) {
            addCriterion("TRIAGEOPERID >", value, "triageoperid");
            return (Criteria) this;
        }

        public Criteria andTriageoperidGreaterThanOrEqualTo(String value) {
            addCriterion("TRIAGEOPERID >=", value, "triageoperid");
            return (Criteria) this;
        }

        public Criteria andTriageoperidLessThan(String value) {
            addCriterion("TRIAGEOPERID <", value, "triageoperid");
            return (Criteria) this;
        }

        public Criteria andTriageoperidLessThanOrEqualTo(String value) {
            addCriterion("TRIAGEOPERID <=", value, "triageoperid");
            return (Criteria) this;
        }

        public Criteria andTriageoperidLike(String value) {
            addCriterion("TRIAGEOPERID like", value, "triageoperid");
            return (Criteria) this;
        }

        public Criteria andTriageoperidNotLike(String value) {
            addCriterion("TRIAGEOPERID not like", value, "triageoperid");
            return (Criteria) this;
        }

        public Criteria andTriageoperidIn(List<String> values) {
            addCriterion("TRIAGEOPERID in", values, "triageoperid");
            return (Criteria) this;
        }

        public Criteria andTriageoperidNotIn(List<String> values) {
            addCriterion("TRIAGEOPERID not in", values, "triageoperid");
            return (Criteria) this;
        }

        public Criteria andTriageoperidBetween(String value1, String value2) {
            addCriterion("TRIAGEOPERID between", value1, value2, "triageoperid");
            return (Criteria) this;
        }

        public Criteria andTriageoperidNotBetween(String value1, String value2) {
            addCriterion("TRIAGEOPERID not between", value1, value2, "triageoperid");
            return (Criteria) this;
        }

        public Criteria andTriageopernameIsNull() {
            addCriterion("TRIAGEOPERNAME is null");
            return (Criteria) this;
        }

        public Criteria andTriageopernameIsNotNull() {
            addCriterion("TRIAGEOPERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andTriageopernameEqualTo(String value) {
            addCriterion("TRIAGEOPERNAME =", value, "triageopername");
            return (Criteria) this;
        }

        public Criteria andTriageopernameNotEqualTo(String value) {
            addCriterion("TRIAGEOPERNAME <>", value, "triageopername");
            return (Criteria) this;
        }

        public Criteria andTriageopernameGreaterThan(String value) {
            addCriterion("TRIAGEOPERNAME >", value, "triageopername");
            return (Criteria) this;
        }

        public Criteria andTriageopernameGreaterThanOrEqualTo(String value) {
            addCriterion("TRIAGEOPERNAME >=", value, "triageopername");
            return (Criteria) this;
        }

        public Criteria andTriageopernameLessThan(String value) {
            addCriterion("TRIAGEOPERNAME <", value, "triageopername");
            return (Criteria) this;
        }

        public Criteria andTriageopernameLessThanOrEqualTo(String value) {
            addCriterion("TRIAGEOPERNAME <=", value, "triageopername");
            return (Criteria) this;
        }

        public Criteria andTriageopernameLike(String value) {
            addCriterion("TRIAGEOPERNAME like", value, "triageopername");
            return (Criteria) this;
        }

        public Criteria andTriageopernameNotLike(String value) {
            addCriterion("TRIAGEOPERNAME not like", value, "triageopername");
            return (Criteria) this;
        }

        public Criteria andTriageopernameIn(List<String> values) {
            addCriterion("TRIAGEOPERNAME in", values, "triageopername");
            return (Criteria) this;
        }

        public Criteria andTriageopernameNotIn(List<String> values) {
            addCriterion("TRIAGEOPERNAME not in", values, "triageopername");
            return (Criteria) this;
        }

        public Criteria andTriageopernameBetween(String value1, String value2) {
            addCriterion("TRIAGEOPERNAME between", value1, value2, "triageopername");
            return (Criteria) this;
        }

        public Criteria andTriageopernameNotBetween(String value1, String value2) {
            addCriterion("TRIAGEOPERNAME not between", value1, value2, "triageopername");
            return (Criteria) this;
        }

        public Criteria andTriagetimeIsNull() {
            addCriterion("TRIAGETIME is null");
            return (Criteria) this;
        }

        public Criteria andTriagetimeIsNotNull() {
            addCriterion("TRIAGETIME is not null");
            return (Criteria) this;
        }

        public Criteria andTriagetimeEqualTo(Date value) {
            addCriterion("TRIAGETIME =", value, "triagetime");
            return (Criteria) this;
        }

        public Criteria andTriagetimeNotEqualTo(Date value) {
            addCriterion("TRIAGETIME <>", value, "triagetime");
            return (Criteria) this;
        }

        public Criteria andTriagetimeGreaterThan(Date value) {
            addCriterion("TRIAGETIME >", value, "triagetime");
            return (Criteria) this;
        }

        public Criteria andTriagetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TRIAGETIME >=", value, "triagetime");
            return (Criteria) this;
        }

        public Criteria andTriagetimeLessThan(Date value) {
            addCriterion("TRIAGETIME <", value, "triagetime");
            return (Criteria) this;
        }

        public Criteria andTriagetimeLessThanOrEqualTo(Date value) {
            addCriterion("TRIAGETIME <=", value, "triagetime");
            return (Criteria) this;
        }

        public Criteria andTriagetimeIn(List<Date> values) {
            addCriterion("TRIAGETIME in", values, "triagetime");
            return (Criteria) this;
        }

        public Criteria andTriagetimeNotIn(List<Date> values) {
            addCriterion("TRIAGETIME not in", values, "triagetime");
            return (Criteria) this;
        }

        public Criteria andTriagetimeBetween(Date value1, Date value2) {
            addCriterion("TRIAGETIME between", value1, value2, "triagetime");
            return (Criteria) this;
        }

        public Criteria andTriagetimeNotBetween(Date value1, Date value2) {
            addCriterion("TRIAGETIME not between", value1, value2, "triagetime");
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

        public Criteria andCanceltimeIsNull() {
            addCriterion("CANCELTIME is null");
            return (Criteria) this;
        }

        public Criteria andCanceltimeIsNotNull() {
            addCriterion("CANCELTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCanceltimeEqualTo(Date value) {
            addCriterion("CANCELTIME =", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotEqualTo(Date value) {
            addCriterion("CANCELTIME <>", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeGreaterThan(Date value) {
            addCriterion("CANCELTIME >", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CANCELTIME >=", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeLessThan(Date value) {
            addCriterion("CANCELTIME <", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeLessThanOrEqualTo(Date value) {
            addCriterion("CANCELTIME <=", value, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeIn(List<Date> values) {
            addCriterion("CANCELTIME in", values, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotIn(List<Date> values) {
            addCriterion("CANCELTIME not in", values, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeBetween(Date value1, Date value2) {
            addCriterion("CANCELTIME between", value1, value2, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceltimeNotBetween(Date value1, Date value2) {
            addCriterion("CANCELTIME not between", value1, value2, "canceltime");
            return (Criteria) this;
        }

        public Criteria andCanceloperidIsNull() {
            addCriterion("CANCELOPERID is null");
            return (Criteria) this;
        }

        public Criteria andCanceloperidIsNotNull() {
            addCriterion("CANCELOPERID is not null");
            return (Criteria) this;
        }

        public Criteria andCanceloperidEqualTo(String value) {
            addCriterion("CANCELOPERID =", value, "canceloperid");
            return (Criteria) this;
        }

        public Criteria andCanceloperidNotEqualTo(String value) {
            addCriterion("CANCELOPERID <>", value, "canceloperid");
            return (Criteria) this;
        }

        public Criteria andCanceloperidGreaterThan(String value) {
            addCriterion("CANCELOPERID >", value, "canceloperid");
            return (Criteria) this;
        }

        public Criteria andCanceloperidGreaterThanOrEqualTo(String value) {
            addCriterion("CANCELOPERID >=", value, "canceloperid");
            return (Criteria) this;
        }

        public Criteria andCanceloperidLessThan(String value) {
            addCriterion("CANCELOPERID <", value, "canceloperid");
            return (Criteria) this;
        }

        public Criteria andCanceloperidLessThanOrEqualTo(String value) {
            addCriterion("CANCELOPERID <=", value, "canceloperid");
            return (Criteria) this;
        }

        public Criteria andCanceloperidLike(String value) {
            addCriterion("CANCELOPERID like", value, "canceloperid");
            return (Criteria) this;
        }

        public Criteria andCanceloperidNotLike(String value) {
            addCriterion("CANCELOPERID not like", value, "canceloperid");
            return (Criteria) this;
        }

        public Criteria andCanceloperidIn(List<String> values) {
            addCriterion("CANCELOPERID in", values, "canceloperid");
            return (Criteria) this;
        }

        public Criteria andCanceloperidNotIn(List<String> values) {
            addCriterion("CANCELOPERID not in", values, "canceloperid");
            return (Criteria) this;
        }

        public Criteria andCanceloperidBetween(String value1, String value2) {
            addCriterion("CANCELOPERID between", value1, value2, "canceloperid");
            return (Criteria) this;
        }

        public Criteria andCanceloperidNotBetween(String value1, String value2) {
            addCriterion("CANCELOPERID not between", value1, value2, "canceloperid");
            return (Criteria) this;
        }

        public Criteria andCancelopernameIsNull() {
            addCriterion("CANCELOPERNAME is null");
            return (Criteria) this;
        }

        public Criteria andCancelopernameIsNotNull() {
            addCriterion("CANCELOPERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCancelopernameEqualTo(String value) {
            addCriterion("CANCELOPERNAME =", value, "cancelopername");
            return (Criteria) this;
        }

        public Criteria andCancelopernameNotEqualTo(String value) {
            addCriterion("CANCELOPERNAME <>", value, "cancelopername");
            return (Criteria) this;
        }

        public Criteria andCancelopernameGreaterThan(String value) {
            addCriterion("CANCELOPERNAME >", value, "cancelopername");
            return (Criteria) this;
        }

        public Criteria andCancelopernameGreaterThanOrEqualTo(String value) {
            addCriterion("CANCELOPERNAME >=", value, "cancelopername");
            return (Criteria) this;
        }

        public Criteria andCancelopernameLessThan(String value) {
            addCriterion("CANCELOPERNAME <", value, "cancelopername");
            return (Criteria) this;
        }

        public Criteria andCancelopernameLessThanOrEqualTo(String value) {
            addCriterion("CANCELOPERNAME <=", value, "cancelopername");
            return (Criteria) this;
        }

        public Criteria andCancelopernameLike(String value) {
            addCriterion("CANCELOPERNAME like", value, "cancelopername");
            return (Criteria) this;
        }

        public Criteria andCancelopernameNotLike(String value) {
            addCriterion("CANCELOPERNAME not like", value, "cancelopername");
            return (Criteria) this;
        }

        public Criteria andCancelopernameIn(List<String> values) {
            addCriterion("CANCELOPERNAME in", values, "cancelopername");
            return (Criteria) this;
        }

        public Criteria andCancelopernameNotIn(List<String> values) {
            addCriterion("CANCELOPERNAME not in", values, "cancelopername");
            return (Criteria) this;
        }

        public Criteria andCancelopernameBetween(String value1, String value2) {
            addCriterion("CANCELOPERNAME between", value1, value2, "cancelopername");
            return (Criteria) this;
        }

        public Criteria andCancelopernameNotBetween(String value1, String value2) {
            addCriterion("CANCELOPERNAME not between", value1, value2, "cancelopername");
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

        public Criteria andCreateoperidIsNull() {
            addCriterion("CREATEOPERID is null");
            return (Criteria) this;
        }

        public Criteria andCreateoperidIsNotNull() {
            addCriterion("CREATEOPERID is not null");
            return (Criteria) this;
        }

        public Criteria andCreateoperidEqualTo(String value) {
            addCriterion("CREATEOPERID =", value, "createoperid");
            return (Criteria) this;
        }

        public Criteria andCreateoperidNotEqualTo(String value) {
            addCriterion("CREATEOPERID <>", value, "createoperid");
            return (Criteria) this;
        }

        public Criteria andCreateoperidGreaterThan(String value) {
            addCriterion("CREATEOPERID >", value, "createoperid");
            return (Criteria) this;
        }

        public Criteria andCreateoperidGreaterThanOrEqualTo(String value) {
            addCriterion("CREATEOPERID >=", value, "createoperid");
            return (Criteria) this;
        }

        public Criteria andCreateoperidLessThan(String value) {
            addCriterion("CREATEOPERID <", value, "createoperid");
            return (Criteria) this;
        }

        public Criteria andCreateoperidLessThanOrEqualTo(String value) {
            addCriterion("CREATEOPERID <=", value, "createoperid");
            return (Criteria) this;
        }

        public Criteria andCreateoperidLike(String value) {
            addCriterion("CREATEOPERID like", value, "createoperid");
            return (Criteria) this;
        }

        public Criteria andCreateoperidNotLike(String value) {
            addCriterion("CREATEOPERID not like", value, "createoperid");
            return (Criteria) this;
        }

        public Criteria andCreateoperidIn(List<String> values) {
            addCriterion("CREATEOPERID in", values, "createoperid");
            return (Criteria) this;
        }

        public Criteria andCreateoperidNotIn(List<String> values) {
            addCriterion("CREATEOPERID not in", values, "createoperid");
            return (Criteria) this;
        }

        public Criteria andCreateoperidBetween(String value1, String value2) {
            addCriterion("CREATEOPERID between", value1, value2, "createoperid");
            return (Criteria) this;
        }

        public Criteria andCreateoperidNotBetween(String value1, String value2) {
            addCriterion("CREATEOPERID not between", value1, value2, "createoperid");
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

        public Criteria andSchemaidIsNull() {
            addCriterion("SCHEMAID is null");
            return (Criteria) this;
        }

        public Criteria andSchemaidIsNotNull() {
            addCriterion("SCHEMAID is not null");
            return (Criteria) this;
        }

        public Criteria andSchemaidEqualTo(String value) {
            addCriterion("SCHEMAID =", value, "schemaid");
            return (Criteria) this;
        }

        public Criteria andSchemaidNotEqualTo(String value) {
            addCriterion("SCHEMAID <>", value, "schemaid");
            return (Criteria) this;
        }

        public Criteria andSchemaidGreaterThan(String value) {
            addCriterion("SCHEMAID >", value, "schemaid");
            return (Criteria) this;
        }

        public Criteria andSchemaidGreaterThanOrEqualTo(String value) {
            addCriterion("SCHEMAID >=", value, "schemaid");
            return (Criteria) this;
        }

        public Criteria andSchemaidLessThan(String value) {
            addCriterion("SCHEMAID <", value, "schemaid");
            return (Criteria) this;
        }

        public Criteria andSchemaidLessThanOrEqualTo(String value) {
            addCriterion("SCHEMAID <=", value, "schemaid");
            return (Criteria) this;
        }

        public Criteria andSchemaidLike(String value) {
            addCriterion("SCHEMAID like", value, "schemaid");
            return (Criteria) this;
        }

        public Criteria andSchemaidNotLike(String value) {
            addCriterion("SCHEMAID not like", value, "schemaid");
            return (Criteria) this;
        }

        public Criteria andSchemaidIn(List<String> values) {
            addCriterion("SCHEMAID in", values, "schemaid");
            return (Criteria) this;
        }

        public Criteria andSchemaidNotIn(List<String> values) {
            addCriterion("SCHEMAID not in", values, "schemaid");
            return (Criteria) this;
        }

        public Criteria andSchemaidBetween(String value1, String value2) {
            addCriterion("SCHEMAID between", value1, value2, "schemaid");
            return (Criteria) this;
        }

        public Criteria andSchemaidNotBetween(String value1, String value2) {
            addCriterion("SCHEMAID not between", value1, value2, "schemaid");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("BEGINTIME is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("BEGINTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(Date value) {
            addCriterion("BEGINTIME =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Date value) {
            addCriterion("BEGINTIME <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Date value) {
            addCriterion("BEGINTIME >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BEGINTIME >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Date value) {
            addCriterion("BEGINTIME <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("BEGINTIME <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Date> values) {
            addCriterion("BEGINTIME in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Date> values) {
            addCriterion("BEGINTIME not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Date value1, Date value2) {
            addCriterion("BEGINTIME between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("BEGINTIME not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("ENDTIME is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("ENDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("ENDTIME =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("ENDTIME <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("ENDTIME >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ENDTIME >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("ENDTIME <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("ENDTIME <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("ENDTIME in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("ENDTIME not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("ENDTIME between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("ENDTIME not between", value1, value2, "endtime");
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

        public Criteria andAppointchilditemIsNull() {
            addCriterion("APPOINTCHILDITEM is null");
            return (Criteria) this;
        }

        public Criteria andAppointchilditemIsNotNull() {
            addCriterion("APPOINTCHILDITEM is not null");
            return (Criteria) this;
        }

        public Criteria andAppointchilditemEqualTo(String value) {
            addCriterion("APPOINTCHILDITEM =", value, "appointchilditem");
            return (Criteria) this;
        }

        public Criteria andAppointchilditemNotEqualTo(String value) {
            addCriterion("APPOINTCHILDITEM <>", value, "appointchilditem");
            return (Criteria) this;
        }

        public Criteria andAppointchilditemGreaterThan(String value) {
            addCriterion("APPOINTCHILDITEM >", value, "appointchilditem");
            return (Criteria) this;
        }

        public Criteria andAppointchilditemGreaterThanOrEqualTo(String value) {
            addCriterion("APPOINTCHILDITEM >=", value, "appointchilditem");
            return (Criteria) this;
        }

        public Criteria andAppointchilditemLessThan(String value) {
            addCriterion("APPOINTCHILDITEM <", value, "appointchilditem");
            return (Criteria) this;
        }

        public Criteria andAppointchilditemLessThanOrEqualTo(String value) {
            addCriterion("APPOINTCHILDITEM <=", value, "appointchilditem");
            return (Criteria) this;
        }

        public Criteria andAppointchilditemLike(String value) {
            addCriterion("APPOINTCHILDITEM like", value, "appointchilditem");
            return (Criteria) this;
        }

        public Criteria andAppointchilditemNotLike(String value) {
            addCriterion("APPOINTCHILDITEM not like", value, "appointchilditem");
            return (Criteria) this;
        }

        public Criteria andAppointchilditemIn(List<String> values) {
            addCriterion("APPOINTCHILDITEM in", values, "appointchilditem");
            return (Criteria) this;
        }

        public Criteria andAppointchilditemNotIn(List<String> values) {
            addCriterion("APPOINTCHILDITEM not in", values, "appointchilditem");
            return (Criteria) this;
        }

        public Criteria andAppointchilditemBetween(String value1, String value2) {
            addCriterion("APPOINTCHILDITEM between", value1, value2, "appointchilditem");
            return (Criteria) this;
        }

        public Criteria andAppointchilditemNotBetween(String value1, String value2) {
            addCriterion("APPOINTCHILDITEM not between", value1, value2, "appointchilditem");
            return (Criteria) this;
        }

        public Criteria andAppointitemnameIsNull() {
            addCriterion("APPOINTITEMNAME is null");
            return (Criteria) this;
        }

        public Criteria andAppointitemnameIsNotNull() {
            addCriterion("APPOINTITEMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAppointitemnameEqualTo(String value) {
            addCriterion("APPOINTITEMNAME =", value, "appointitemname");
            return (Criteria) this;
        }

        public Criteria andAppointitemnameNotEqualTo(String value) {
            addCriterion("APPOINTITEMNAME <>", value, "appointitemname");
            return (Criteria) this;
        }

        public Criteria andAppointitemnameGreaterThan(String value) {
            addCriterion("APPOINTITEMNAME >", value, "appointitemname");
            return (Criteria) this;
        }

        public Criteria andAppointitemnameGreaterThanOrEqualTo(String value) {
            addCriterion("APPOINTITEMNAME >=", value, "appointitemname");
            return (Criteria) this;
        }

        public Criteria andAppointitemnameLessThan(String value) {
            addCriterion("APPOINTITEMNAME <", value, "appointitemname");
            return (Criteria) this;
        }

        public Criteria andAppointitemnameLessThanOrEqualTo(String value) {
            addCriterion("APPOINTITEMNAME <=", value, "appointitemname");
            return (Criteria) this;
        }

        public Criteria andAppointitemnameLike(String value) {
            addCriterion("APPOINTITEMNAME like", value, "appointitemname");
            return (Criteria) this;
        }

        public Criteria andAppointitemnameNotLike(String value) {
            addCriterion("APPOINTITEMNAME not like", value, "appointitemname");
            return (Criteria) this;
        }

        public Criteria andAppointitemnameIn(List<String> values) {
            addCriterion("APPOINTITEMNAME in", values, "appointitemname");
            return (Criteria) this;
        }

        public Criteria andAppointitemnameNotIn(List<String> values) {
            addCriterion("APPOINTITEMNAME not in", values, "appointitemname");
            return (Criteria) this;
        }

        public Criteria andAppointitemnameBetween(String value1, String value2) {
            addCriterion("APPOINTITEMNAME between", value1, value2, "appointitemname");
            return (Criteria) this;
        }

        public Criteria andAppointitemnameNotBetween(String value1, String value2) {
            addCriterion("APPOINTITEMNAME not between", value1, value2, "appointitemname");
            return (Criteria) this;
        }

        public Criteria andReceiveoperidIsNull() {
            addCriterion("RECEIVEOPERID is null");
            return (Criteria) this;
        }

        public Criteria andReceiveoperidIsNotNull() {
            addCriterion("RECEIVEOPERID is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveoperidEqualTo(String value) {
            addCriterion("RECEIVEOPERID =", value, "receiveoperid");
            return (Criteria) this;
        }

        public Criteria andReceiveoperidNotEqualTo(String value) {
            addCriterion("RECEIVEOPERID <>", value, "receiveoperid");
            return (Criteria) this;
        }

        public Criteria andReceiveoperidGreaterThan(String value) {
            addCriterion("RECEIVEOPERID >", value, "receiveoperid");
            return (Criteria) this;
        }

        public Criteria andReceiveoperidGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVEOPERID >=", value, "receiveoperid");
            return (Criteria) this;
        }

        public Criteria andReceiveoperidLessThan(String value) {
            addCriterion("RECEIVEOPERID <", value, "receiveoperid");
            return (Criteria) this;
        }

        public Criteria andReceiveoperidLessThanOrEqualTo(String value) {
            addCriterion("RECEIVEOPERID <=", value, "receiveoperid");
            return (Criteria) this;
        }

        public Criteria andReceiveoperidLike(String value) {
            addCriterion("RECEIVEOPERID like", value, "receiveoperid");
            return (Criteria) this;
        }

        public Criteria andReceiveoperidNotLike(String value) {
            addCriterion("RECEIVEOPERID not like", value, "receiveoperid");
            return (Criteria) this;
        }

        public Criteria andReceiveoperidIn(List<String> values) {
            addCriterion("RECEIVEOPERID in", values, "receiveoperid");
            return (Criteria) this;
        }

        public Criteria andReceiveoperidNotIn(List<String> values) {
            addCriterion("RECEIVEOPERID not in", values, "receiveoperid");
            return (Criteria) this;
        }

        public Criteria andReceiveoperidBetween(String value1, String value2) {
            addCriterion("RECEIVEOPERID between", value1, value2, "receiveoperid");
            return (Criteria) this;
        }

        public Criteria andReceiveoperidNotBetween(String value1, String value2) {
            addCriterion("RECEIVEOPERID not between", value1, value2, "receiveoperid");
            return (Criteria) this;
        }

        public Criteria andReceiveopernameIsNull() {
            addCriterion("RECEIVEOPERNAME is null");
            return (Criteria) this;
        }

        public Criteria andReceiveopernameIsNotNull() {
            addCriterion("RECEIVEOPERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveopernameEqualTo(String value) {
            addCriterion("RECEIVEOPERNAME =", value, "receiveopername");
            return (Criteria) this;
        }

        public Criteria andReceiveopernameNotEqualTo(String value) {
            addCriterion("RECEIVEOPERNAME <>", value, "receiveopername");
            return (Criteria) this;
        }

        public Criteria andReceiveopernameGreaterThan(String value) {
            addCriterion("RECEIVEOPERNAME >", value, "receiveopername");
            return (Criteria) this;
        }

        public Criteria andReceiveopernameGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVEOPERNAME >=", value, "receiveopername");
            return (Criteria) this;
        }

        public Criteria andReceiveopernameLessThan(String value) {
            addCriterion("RECEIVEOPERNAME <", value, "receiveopername");
            return (Criteria) this;
        }

        public Criteria andReceiveopernameLessThanOrEqualTo(String value) {
            addCriterion("RECEIVEOPERNAME <=", value, "receiveopername");
            return (Criteria) this;
        }

        public Criteria andReceiveopernameLike(String value) {
            addCriterion("RECEIVEOPERNAME like", value, "receiveopername");
            return (Criteria) this;
        }

        public Criteria andReceiveopernameNotLike(String value) {
            addCriterion("RECEIVEOPERNAME not like", value, "receiveopername");
            return (Criteria) this;
        }

        public Criteria andReceiveopernameIn(List<String> values) {
            addCriterion("RECEIVEOPERNAME in", values, "receiveopername");
            return (Criteria) this;
        }

        public Criteria andReceiveopernameNotIn(List<String> values) {
            addCriterion("RECEIVEOPERNAME not in", values, "receiveopername");
            return (Criteria) this;
        }

        public Criteria andReceiveopernameBetween(String value1, String value2) {
            addCriterion("RECEIVEOPERNAME between", value1, value2, "receiveopername");
            return (Criteria) this;
        }

        public Criteria andReceiveopernameNotBetween(String value1, String value2) {
            addCriterion("RECEIVEOPERNAME not between", value1, value2, "receiveopername");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIsNull() {
            addCriterion("RECEIVETIME is null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIsNotNull() {
            addCriterion("RECEIVETIME is not null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeEqualTo(Date value) {
            addCriterion("RECEIVETIME =", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotEqualTo(Date value) {
            addCriterion("RECEIVETIME <>", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThan(Date value) {
            addCriterion("RECEIVETIME >", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECEIVETIME >=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThan(Date value) {
            addCriterion("RECEIVETIME <", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThanOrEqualTo(Date value) {
            addCriterion("RECEIVETIME <=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIn(List<Date> values) {
            addCriterion("RECEIVETIME in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotIn(List<Date> values) {
            addCriterion("RECEIVETIME not in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeBetween(Date value1, Date value2) {
            addCriterion("RECEIVETIME between", value1, value2, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotBetween(Date value1, Date value2) {
            addCriterion("RECEIVETIME not between", value1, value2, "receivetime");
            return (Criteria) this;
        }

        public Criteria andIsfirstseeIsNull() {
            addCriterion("ISFIRSTSEE is null");
            return (Criteria) this;
        }

        public Criteria andIsfirstseeIsNotNull() {
            addCriterion("ISFIRSTSEE is not null");
            return (Criteria) this;
        }

        public Criteria andIsfirstseeEqualTo(String value) {
            addCriterion("ISFIRSTSEE =", value, "isfirstsee");
            return (Criteria) this;
        }

        public Criteria andIsfirstseeNotEqualTo(String value) {
            addCriterion("ISFIRSTSEE <>", value, "isfirstsee");
            return (Criteria) this;
        }

        public Criteria andIsfirstseeGreaterThan(String value) {
            addCriterion("ISFIRSTSEE >", value, "isfirstsee");
            return (Criteria) this;
        }

        public Criteria andIsfirstseeGreaterThanOrEqualTo(String value) {
            addCriterion("ISFIRSTSEE >=", value, "isfirstsee");
            return (Criteria) this;
        }

        public Criteria andIsfirstseeLessThan(String value) {
            addCriterion("ISFIRSTSEE <", value, "isfirstsee");
            return (Criteria) this;
        }

        public Criteria andIsfirstseeLessThanOrEqualTo(String value) {
            addCriterion("ISFIRSTSEE <=", value, "isfirstsee");
            return (Criteria) this;
        }

        public Criteria andIsfirstseeLike(String value) {
            addCriterion("ISFIRSTSEE like", value, "isfirstsee");
            return (Criteria) this;
        }

        public Criteria andIsfirstseeNotLike(String value) {
            addCriterion("ISFIRSTSEE not like", value, "isfirstsee");
            return (Criteria) this;
        }

        public Criteria andIsfirstseeIn(List<String> values) {
            addCriterion("ISFIRSTSEE in", values, "isfirstsee");
            return (Criteria) this;
        }

        public Criteria andIsfirstseeNotIn(List<String> values) {
            addCriterion("ISFIRSTSEE not in", values, "isfirstsee");
            return (Criteria) this;
        }

        public Criteria andIsfirstseeBetween(String value1, String value2) {
            addCriterion("ISFIRSTSEE between", value1, value2, "isfirstsee");
            return (Criteria) this;
        }

        public Criteria andIsfirstseeNotBetween(String value1, String value2) {
            addCriterion("ISFIRSTSEE not between", value1, value2, "isfirstsee");
            return (Criteria) this;
        }

        public Criteria andIsrevisitIsNull() {
            addCriterion("ISREVISIT is null");
            return (Criteria) this;
        }

        public Criteria andIsrevisitIsNotNull() {
            addCriterion("ISREVISIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsrevisitEqualTo(String value) {
            addCriterion("ISREVISIT =", value, "isrevisit");
            return (Criteria) this;
        }

        public Criteria andIsrevisitNotEqualTo(String value) {
            addCriterion("ISREVISIT <>", value, "isrevisit");
            return (Criteria) this;
        }

        public Criteria andIsrevisitGreaterThan(String value) {
            addCriterion("ISREVISIT >", value, "isrevisit");
            return (Criteria) this;
        }

        public Criteria andIsrevisitGreaterThanOrEqualTo(String value) {
            addCriterion("ISREVISIT >=", value, "isrevisit");
            return (Criteria) this;
        }

        public Criteria andIsrevisitLessThan(String value) {
            addCriterion("ISREVISIT <", value, "isrevisit");
            return (Criteria) this;
        }

        public Criteria andIsrevisitLessThanOrEqualTo(String value) {
            addCriterion("ISREVISIT <=", value, "isrevisit");
            return (Criteria) this;
        }

        public Criteria andIsrevisitLike(String value) {
            addCriterion("ISREVISIT like", value, "isrevisit");
            return (Criteria) this;
        }

        public Criteria andIsrevisitNotLike(String value) {
            addCriterion("ISREVISIT not like", value, "isrevisit");
            return (Criteria) this;
        }

        public Criteria andIsrevisitIn(List<String> values) {
            addCriterion("ISREVISIT in", values, "isrevisit");
            return (Criteria) this;
        }

        public Criteria andIsrevisitNotIn(List<String> values) {
            addCriterion("ISREVISIT not in", values, "isrevisit");
            return (Criteria) this;
        }

        public Criteria andIsrevisitBetween(String value1, String value2) {
            addCriterion("ISREVISIT between", value1, value2, "isrevisit");
            return (Criteria) this;
        }

        public Criteria andIsrevisitNotBetween(String value1, String value2) {
            addCriterion("ISREVISIT not between", value1, value2, "isrevisit");
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