package com.slionh.patientview.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrmRevisitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmRevisitExample() {
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

        public Criteria andVisitIdIsNull() {
            addCriterion("VISIT_ID is null");
            return (Criteria) this;
        }

        public Criteria andVisitIdIsNotNull() {
            addCriterion("VISIT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVisitIdEqualTo(String value) {
            addCriterion("VISIT_ID =", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotEqualTo(String value) {
            addCriterion("VISIT_ID <>", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdGreaterThan(String value) {
            addCriterion("VISIT_ID >", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_ID >=", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdLessThan(String value) {
            addCriterion("VISIT_ID <", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdLessThanOrEqualTo(String value) {
            addCriterion("VISIT_ID <=", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdLike(String value) {
            addCriterion("VISIT_ID like", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotLike(String value) {
            addCriterion("VISIT_ID not like", value, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdIn(List<String> values) {
            addCriterion("VISIT_ID in", values, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotIn(List<String> values) {
            addCriterion("VISIT_ID not in", values, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdBetween(String value1, String value2) {
            addCriterion("VISIT_ID between", value1, value2, "visitId");
            return (Criteria) this;
        }

        public Criteria andVisitIdNotBetween(String value1, String value2) {
            addCriterion("VISIT_ID not between", value1, value2, "visitId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNull() {
            addCriterion("PATIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPatientIdIsNotNull() {
            addCriterion("PATIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPatientIdEqualTo(String value) {
            addCriterion("PATIENT_ID =", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotEqualTo(String value) {
            addCriterion("PATIENT_ID <>", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThan(String value) {
            addCriterion("PATIENT_ID >", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENT_ID >=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThan(String value) {
            addCriterion("PATIENT_ID <", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLessThanOrEqualTo(String value) {
            addCriterion("PATIENT_ID <=", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdLike(String value) {
            addCriterion("PATIENT_ID like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotLike(String value) {
            addCriterion("PATIENT_ID not like", value, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdIn(List<String> values) {
            addCriterion("PATIENT_ID in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotIn(List<String> values) {
            addCriterion("PATIENT_ID not in", values, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdBetween(String value1, String value2) {
            addCriterion("PATIENT_ID between", value1, value2, "patientId");
            return (Criteria) this;
        }

        public Criteria andPatientIdNotBetween(String value1, String value2) {
            addCriterion("PATIENT_ID not between", value1, value2, "patientId");
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

        public Criteria andVisitTypeIsNull() {
            addCriterion("VISIT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVisitTypeIsNotNull() {
            addCriterion("VISIT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTypeEqualTo(String value) {
            addCriterion("VISIT_TYPE =", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotEqualTo(String value) {
            addCriterion("VISIT_TYPE <>", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeGreaterThan(String value) {
            addCriterion("VISIT_TYPE >", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_TYPE >=", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeLessThan(String value) {
            addCriterion("VISIT_TYPE <", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeLessThanOrEqualTo(String value) {
            addCriterion("VISIT_TYPE <=", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeLike(String value) {
            addCriterion("VISIT_TYPE like", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotLike(String value) {
            addCriterion("VISIT_TYPE not like", value, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeIn(List<String> values) {
            addCriterion("VISIT_TYPE in", values, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotIn(List<String> values) {
            addCriterion("VISIT_TYPE not in", values, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeBetween(String value1, String value2) {
            addCriterion("VISIT_TYPE between", value1, value2, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitTypeNotBetween(String value1, String value2) {
            addCriterion("VISIT_TYPE not between", value1, value2, "visitType");
            return (Criteria) this;
        }

        public Criteria andVisitDiseaseIsNull() {
            addCriterion("VISIT_DISEASE is null");
            return (Criteria) this;
        }

        public Criteria andVisitDiseaseIsNotNull() {
            addCriterion("VISIT_DISEASE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitDiseaseEqualTo(String value) {
            addCriterion("VISIT_DISEASE =", value, "visitDisease");
            return (Criteria) this;
        }

        public Criteria andVisitDiseaseNotEqualTo(String value) {
            addCriterion("VISIT_DISEASE <>", value, "visitDisease");
            return (Criteria) this;
        }

        public Criteria andVisitDiseaseGreaterThan(String value) {
            addCriterion("VISIT_DISEASE >", value, "visitDisease");
            return (Criteria) this;
        }

        public Criteria andVisitDiseaseGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_DISEASE >=", value, "visitDisease");
            return (Criteria) this;
        }

        public Criteria andVisitDiseaseLessThan(String value) {
            addCriterion("VISIT_DISEASE <", value, "visitDisease");
            return (Criteria) this;
        }

        public Criteria andVisitDiseaseLessThanOrEqualTo(String value) {
            addCriterion("VISIT_DISEASE <=", value, "visitDisease");
            return (Criteria) this;
        }

        public Criteria andVisitDiseaseLike(String value) {
            addCriterion("VISIT_DISEASE like", value, "visitDisease");
            return (Criteria) this;
        }

        public Criteria andVisitDiseaseNotLike(String value) {
            addCriterion("VISIT_DISEASE not like", value, "visitDisease");
            return (Criteria) this;
        }

        public Criteria andVisitDiseaseIn(List<String> values) {
            addCriterion("VISIT_DISEASE in", values, "visitDisease");
            return (Criteria) this;
        }

        public Criteria andVisitDiseaseNotIn(List<String> values) {
            addCriterion("VISIT_DISEASE not in", values, "visitDisease");
            return (Criteria) this;
        }

        public Criteria andVisitDiseaseBetween(String value1, String value2) {
            addCriterion("VISIT_DISEASE between", value1, value2, "visitDisease");
            return (Criteria) this;
        }

        public Criteria andVisitDiseaseNotBetween(String value1, String value2) {
            addCriterion("VISIT_DISEASE not between", value1, value2, "visitDisease");
            return (Criteria) this;
        }

        public Criteria andVisitTitleIsNull() {
            addCriterion("VISIT_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andVisitTitleIsNotNull() {
            addCriterion("VISIT_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTitleEqualTo(String value) {
            addCriterion("VISIT_TITLE =", value, "visitTitle");
            return (Criteria) this;
        }

        public Criteria andVisitTitleNotEqualTo(String value) {
            addCriterion("VISIT_TITLE <>", value, "visitTitle");
            return (Criteria) this;
        }

        public Criteria andVisitTitleGreaterThan(String value) {
            addCriterion("VISIT_TITLE >", value, "visitTitle");
            return (Criteria) this;
        }

        public Criteria andVisitTitleGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_TITLE >=", value, "visitTitle");
            return (Criteria) this;
        }

        public Criteria andVisitTitleLessThan(String value) {
            addCriterion("VISIT_TITLE <", value, "visitTitle");
            return (Criteria) this;
        }

        public Criteria andVisitTitleLessThanOrEqualTo(String value) {
            addCriterion("VISIT_TITLE <=", value, "visitTitle");
            return (Criteria) this;
        }

        public Criteria andVisitTitleLike(String value) {
            addCriterion("VISIT_TITLE like", value, "visitTitle");
            return (Criteria) this;
        }

        public Criteria andVisitTitleNotLike(String value) {
            addCriterion("VISIT_TITLE not like", value, "visitTitle");
            return (Criteria) this;
        }

        public Criteria andVisitTitleIn(List<String> values) {
            addCriterion("VISIT_TITLE in", values, "visitTitle");
            return (Criteria) this;
        }

        public Criteria andVisitTitleNotIn(List<String> values) {
            addCriterion("VISIT_TITLE not in", values, "visitTitle");
            return (Criteria) this;
        }

        public Criteria andVisitTitleBetween(String value1, String value2) {
            addCriterion("VISIT_TITLE between", value1, value2, "visitTitle");
            return (Criteria) this;
        }

        public Criteria andVisitTitleNotBetween(String value1, String value2) {
            addCriterion("VISIT_TITLE not between", value1, value2, "visitTitle");
            return (Criteria) this;
        }

        public Criteria andVisitWayIsNull() {
            addCriterion("VISIT_WAY is null");
            return (Criteria) this;
        }

        public Criteria andVisitWayIsNotNull() {
            addCriterion("VISIT_WAY is not null");
            return (Criteria) this;
        }

        public Criteria andVisitWayEqualTo(String value) {
            addCriterion("VISIT_WAY =", value, "visitWay");
            return (Criteria) this;
        }

        public Criteria andVisitWayNotEqualTo(String value) {
            addCriterion("VISIT_WAY <>", value, "visitWay");
            return (Criteria) this;
        }

        public Criteria andVisitWayGreaterThan(String value) {
            addCriterion("VISIT_WAY >", value, "visitWay");
            return (Criteria) this;
        }

        public Criteria andVisitWayGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_WAY >=", value, "visitWay");
            return (Criteria) this;
        }

        public Criteria andVisitWayLessThan(String value) {
            addCriterion("VISIT_WAY <", value, "visitWay");
            return (Criteria) this;
        }

        public Criteria andVisitWayLessThanOrEqualTo(String value) {
            addCriterion("VISIT_WAY <=", value, "visitWay");
            return (Criteria) this;
        }

        public Criteria andVisitWayLike(String value) {
            addCriterion("VISIT_WAY like", value, "visitWay");
            return (Criteria) this;
        }

        public Criteria andVisitWayNotLike(String value) {
            addCriterion("VISIT_WAY not like", value, "visitWay");
            return (Criteria) this;
        }

        public Criteria andVisitWayIn(List<String> values) {
            addCriterion("VISIT_WAY in", values, "visitWay");
            return (Criteria) this;
        }

        public Criteria andVisitWayNotIn(List<String> values) {
            addCriterion("VISIT_WAY not in", values, "visitWay");
            return (Criteria) this;
        }

        public Criteria andVisitWayBetween(String value1, String value2) {
            addCriterion("VISIT_WAY between", value1, value2, "visitWay");
            return (Criteria) this;
        }

        public Criteria andVisitWayNotBetween(String value1, String value2) {
            addCriterion("VISIT_WAY not between", value1, value2, "visitWay");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNull() {
            addCriterion("VISIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIsNotNull() {
            addCriterion("VISIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andVisitTimeEqualTo(Date value) {
            addCriterion("VISIT_TIME =", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotEqualTo(Date value) {
            addCriterion("VISIT_TIME <>", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThan(Date value) {
            addCriterion("VISIT_TIME >", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("VISIT_TIME >=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThan(Date value) {
            addCriterion("VISIT_TIME <", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeLessThanOrEqualTo(Date value) {
            addCriterion("VISIT_TIME <=", value, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeIn(List<Date> values) {
            addCriterion("VISIT_TIME in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotIn(List<Date> values) {
            addCriterion("VISIT_TIME not in", values, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeBetween(Date value1, Date value2) {
            addCriterion("VISIT_TIME between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitTimeNotBetween(Date value1, Date value2) {
            addCriterion("VISIT_TIME not between", value1, value2, "visitTime");
            return (Criteria) this;
        }

        public Criteria andVisitDeptIsNull() {
            addCriterion("VISIT_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andVisitDeptIsNotNull() {
            addCriterion("VISIT_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andVisitDeptEqualTo(String value) {
            addCriterion("VISIT_DEPT =", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptNotEqualTo(String value) {
            addCriterion("VISIT_DEPT <>", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptGreaterThan(String value) {
            addCriterion("VISIT_DEPT >", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_DEPT >=", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptLessThan(String value) {
            addCriterion("VISIT_DEPT <", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptLessThanOrEqualTo(String value) {
            addCriterion("VISIT_DEPT <=", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptLike(String value) {
            addCriterion("VISIT_DEPT like", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptNotLike(String value) {
            addCriterion("VISIT_DEPT not like", value, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptIn(List<String> values) {
            addCriterion("VISIT_DEPT in", values, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptNotIn(List<String> values) {
            addCriterion("VISIT_DEPT not in", values, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptBetween(String value1, String value2) {
            addCriterion("VISIT_DEPT between", value1, value2, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitDeptNotBetween(String value1, String value2) {
            addCriterion("VISIT_DEPT not between", value1, value2, "visitDept");
            return (Criteria) this;
        }

        public Criteria andVisitOperIsNull() {
            addCriterion("VISIT_OPER is null");
            return (Criteria) this;
        }

        public Criteria andVisitOperIsNotNull() {
            addCriterion("VISIT_OPER is not null");
            return (Criteria) this;
        }

        public Criteria andVisitOperEqualTo(String value) {
            addCriterion("VISIT_OPER =", value, "visitOper");
            return (Criteria) this;
        }

        public Criteria andVisitOperNotEqualTo(String value) {
            addCriterion("VISIT_OPER <>", value, "visitOper");
            return (Criteria) this;
        }

        public Criteria andVisitOperGreaterThan(String value) {
            addCriterion("VISIT_OPER >", value, "visitOper");
            return (Criteria) this;
        }

        public Criteria andVisitOperGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_OPER >=", value, "visitOper");
            return (Criteria) this;
        }

        public Criteria andVisitOperLessThan(String value) {
            addCriterion("VISIT_OPER <", value, "visitOper");
            return (Criteria) this;
        }

        public Criteria andVisitOperLessThanOrEqualTo(String value) {
            addCriterion("VISIT_OPER <=", value, "visitOper");
            return (Criteria) this;
        }

        public Criteria andVisitOperLike(String value) {
            addCriterion("VISIT_OPER like", value, "visitOper");
            return (Criteria) this;
        }

        public Criteria andVisitOperNotLike(String value) {
            addCriterion("VISIT_OPER not like", value, "visitOper");
            return (Criteria) this;
        }

        public Criteria andVisitOperIn(List<String> values) {
            addCriterion("VISIT_OPER in", values, "visitOper");
            return (Criteria) this;
        }

        public Criteria andVisitOperNotIn(List<String> values) {
            addCriterion("VISIT_OPER not in", values, "visitOper");
            return (Criteria) this;
        }

        public Criteria andVisitOperBetween(String value1, String value2) {
            addCriterion("VISIT_OPER between", value1, value2, "visitOper");
            return (Criteria) this;
        }

        public Criteria andVisitOperNotBetween(String value1, String value2) {
            addCriterion("VISIT_OPER not between", value1, value2, "visitOper");
            return (Criteria) this;
        }

        public Criteria andRealVisitTimeIsNull() {
            addCriterion("REAL_VISIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRealVisitTimeIsNotNull() {
            addCriterion("REAL_VISIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRealVisitTimeEqualTo(Date value) {
            addCriterion("REAL_VISIT_TIME =", value, "realVisitTime");
            return (Criteria) this;
        }

        public Criteria andRealVisitTimeNotEqualTo(Date value) {
            addCriterion("REAL_VISIT_TIME <>", value, "realVisitTime");
            return (Criteria) this;
        }

        public Criteria andRealVisitTimeGreaterThan(Date value) {
            addCriterion("REAL_VISIT_TIME >", value, "realVisitTime");
            return (Criteria) this;
        }

        public Criteria andRealVisitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REAL_VISIT_TIME >=", value, "realVisitTime");
            return (Criteria) this;
        }

        public Criteria andRealVisitTimeLessThan(Date value) {
            addCriterion("REAL_VISIT_TIME <", value, "realVisitTime");
            return (Criteria) this;
        }

        public Criteria andRealVisitTimeLessThanOrEqualTo(Date value) {
            addCriterion("REAL_VISIT_TIME <=", value, "realVisitTime");
            return (Criteria) this;
        }

        public Criteria andRealVisitTimeIn(List<Date> values) {
            addCriterion("REAL_VISIT_TIME in", values, "realVisitTime");
            return (Criteria) this;
        }

        public Criteria andRealVisitTimeNotIn(List<Date> values) {
            addCriterion("REAL_VISIT_TIME not in", values, "realVisitTime");
            return (Criteria) this;
        }

        public Criteria andRealVisitTimeBetween(Date value1, Date value2) {
            addCriterion("REAL_VISIT_TIME between", value1, value2, "realVisitTime");
            return (Criteria) this;
        }

        public Criteria andRealVisitTimeNotBetween(Date value1, Date value2) {
            addCriterion("REAL_VISIT_TIME not between", value1, value2, "realVisitTime");
            return (Criteria) this;
        }

        public Criteria andRealVisitDeptIsNull() {
            addCriterion("REAL_VISIT_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andRealVisitDeptIsNotNull() {
            addCriterion("REAL_VISIT_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andRealVisitDeptEqualTo(String value) {
            addCriterion("REAL_VISIT_DEPT =", value, "realVisitDept");
            return (Criteria) this;
        }

        public Criteria andRealVisitDeptNotEqualTo(String value) {
            addCriterion("REAL_VISIT_DEPT <>", value, "realVisitDept");
            return (Criteria) this;
        }

        public Criteria andRealVisitDeptGreaterThan(String value) {
            addCriterion("REAL_VISIT_DEPT >", value, "realVisitDept");
            return (Criteria) this;
        }

        public Criteria andRealVisitDeptGreaterThanOrEqualTo(String value) {
            addCriterion("REAL_VISIT_DEPT >=", value, "realVisitDept");
            return (Criteria) this;
        }

        public Criteria andRealVisitDeptLessThan(String value) {
            addCriterion("REAL_VISIT_DEPT <", value, "realVisitDept");
            return (Criteria) this;
        }

        public Criteria andRealVisitDeptLessThanOrEqualTo(String value) {
            addCriterion("REAL_VISIT_DEPT <=", value, "realVisitDept");
            return (Criteria) this;
        }

        public Criteria andRealVisitDeptLike(String value) {
            addCriterion("REAL_VISIT_DEPT like", value, "realVisitDept");
            return (Criteria) this;
        }

        public Criteria andRealVisitDeptNotLike(String value) {
            addCriterion("REAL_VISIT_DEPT not like", value, "realVisitDept");
            return (Criteria) this;
        }

        public Criteria andRealVisitDeptIn(List<String> values) {
            addCriterion("REAL_VISIT_DEPT in", values, "realVisitDept");
            return (Criteria) this;
        }

        public Criteria andRealVisitDeptNotIn(List<String> values) {
            addCriterion("REAL_VISIT_DEPT not in", values, "realVisitDept");
            return (Criteria) this;
        }

        public Criteria andRealVisitDeptBetween(String value1, String value2) {
            addCriterion("REAL_VISIT_DEPT between", value1, value2, "realVisitDept");
            return (Criteria) this;
        }

        public Criteria andRealVisitDeptNotBetween(String value1, String value2) {
            addCriterion("REAL_VISIT_DEPT not between", value1, value2, "realVisitDept");
            return (Criteria) this;
        }

        public Criteria andRealVisitOperIsNull() {
            addCriterion("REAL_VISIT_OPER is null");
            return (Criteria) this;
        }

        public Criteria andRealVisitOperIsNotNull() {
            addCriterion("REAL_VISIT_OPER is not null");
            return (Criteria) this;
        }

        public Criteria andRealVisitOperEqualTo(String value) {
            addCriterion("REAL_VISIT_OPER =", value, "realVisitOper");
            return (Criteria) this;
        }

        public Criteria andRealVisitOperNotEqualTo(String value) {
            addCriterion("REAL_VISIT_OPER <>", value, "realVisitOper");
            return (Criteria) this;
        }

        public Criteria andRealVisitOperGreaterThan(String value) {
            addCriterion("REAL_VISIT_OPER >", value, "realVisitOper");
            return (Criteria) this;
        }

        public Criteria andRealVisitOperGreaterThanOrEqualTo(String value) {
            addCriterion("REAL_VISIT_OPER >=", value, "realVisitOper");
            return (Criteria) this;
        }

        public Criteria andRealVisitOperLessThan(String value) {
            addCriterion("REAL_VISIT_OPER <", value, "realVisitOper");
            return (Criteria) this;
        }

        public Criteria andRealVisitOperLessThanOrEqualTo(String value) {
            addCriterion("REAL_VISIT_OPER <=", value, "realVisitOper");
            return (Criteria) this;
        }

        public Criteria andRealVisitOperLike(String value) {
            addCriterion("REAL_VISIT_OPER like", value, "realVisitOper");
            return (Criteria) this;
        }

        public Criteria andRealVisitOperNotLike(String value) {
            addCriterion("REAL_VISIT_OPER not like", value, "realVisitOper");
            return (Criteria) this;
        }

        public Criteria andRealVisitOperIn(List<String> values) {
            addCriterion("REAL_VISIT_OPER in", values, "realVisitOper");
            return (Criteria) this;
        }

        public Criteria andRealVisitOperNotIn(List<String> values) {
            addCriterion("REAL_VISIT_OPER not in", values, "realVisitOper");
            return (Criteria) this;
        }

        public Criteria andRealVisitOperBetween(String value1, String value2) {
            addCriterion("REAL_VISIT_OPER between", value1, value2, "realVisitOper");
            return (Criteria) this;
        }

        public Criteria andRealVisitOperNotBetween(String value1, String value2) {
            addCriterion("REAL_VISIT_OPER not between", value1, value2, "realVisitOper");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNull() {
            addCriterion("CUSTOMER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNotNull() {
            addCriterion("CUSTOMER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusEqualTo(String value) {
            addCriterion("CUSTOMER_STATUS =", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotEqualTo(String value) {
            addCriterion("CUSTOMER_STATUS <>", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThan(String value) {
            addCriterion("CUSTOMER_STATUS >", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_STATUS >=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThan(String value) {
            addCriterion("CUSTOMER_STATUS <", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_STATUS <=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLike(String value) {
            addCriterion("CUSTOMER_STATUS like", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotLike(String value) {
            addCriterion("CUSTOMER_STATUS not like", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIn(List<String> values) {
            addCriterion("CUSTOMER_STATUS in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotIn(List<String> values) {
            addCriterion("CUSTOMER_STATUS not in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusBetween(String value1, String value2) {
            addCriterion("CUSTOMER_STATUS between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_STATUS not between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerWhereIsNull() {
            addCriterion("CUSTOMER_WHERE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerWhereIsNotNull() {
            addCriterion("CUSTOMER_WHERE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerWhereEqualTo(String value) {
            addCriterion("CUSTOMER_WHERE =", value, "customerWhere");
            return (Criteria) this;
        }

        public Criteria andCustomerWhereNotEqualTo(String value) {
            addCriterion("CUSTOMER_WHERE <>", value, "customerWhere");
            return (Criteria) this;
        }

        public Criteria andCustomerWhereGreaterThan(String value) {
            addCriterion("CUSTOMER_WHERE >", value, "customerWhere");
            return (Criteria) this;
        }

        public Criteria andCustomerWhereGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_WHERE >=", value, "customerWhere");
            return (Criteria) this;
        }

        public Criteria andCustomerWhereLessThan(String value) {
            addCriterion("CUSTOMER_WHERE <", value, "customerWhere");
            return (Criteria) this;
        }

        public Criteria andCustomerWhereLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_WHERE <=", value, "customerWhere");
            return (Criteria) this;
        }

        public Criteria andCustomerWhereLike(String value) {
            addCriterion("CUSTOMER_WHERE like", value, "customerWhere");
            return (Criteria) this;
        }

        public Criteria andCustomerWhereNotLike(String value) {
            addCriterion("CUSTOMER_WHERE not like", value, "customerWhere");
            return (Criteria) this;
        }

        public Criteria andCustomerWhereIn(List<String> values) {
            addCriterion("CUSTOMER_WHERE in", values, "customerWhere");
            return (Criteria) this;
        }

        public Criteria andCustomerWhereNotIn(List<String> values) {
            addCriterion("CUSTOMER_WHERE not in", values, "customerWhere");
            return (Criteria) this;
        }

        public Criteria andCustomerWhereBetween(String value1, String value2) {
            addCriterion("CUSTOMER_WHERE between", value1, value2, "customerWhere");
            return (Criteria) this;
        }

        public Criteria andCustomerWhereNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_WHERE not between", value1, value2, "customerWhere");
            return (Criteria) this;
        }

        public Criteria andVisitResultIsNull() {
            addCriterion("VISIT_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andVisitResultIsNotNull() {
            addCriterion("VISIT_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andVisitResultEqualTo(String value) {
            addCriterion("VISIT_RESULT =", value, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultNotEqualTo(String value) {
            addCriterion("VISIT_RESULT <>", value, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultGreaterThan(String value) {
            addCriterion("VISIT_RESULT >", value, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_RESULT >=", value, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultLessThan(String value) {
            addCriterion("VISIT_RESULT <", value, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultLessThanOrEqualTo(String value) {
            addCriterion("VISIT_RESULT <=", value, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultLike(String value) {
            addCriterion("VISIT_RESULT like", value, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultNotLike(String value) {
            addCriterion("VISIT_RESULT not like", value, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultIn(List<String> values) {
            addCriterion("VISIT_RESULT in", values, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultNotIn(List<String> values) {
            addCriterion("VISIT_RESULT not in", values, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultBetween(String value1, String value2) {
            addCriterion("VISIT_RESULT between", value1, value2, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitResultNotBetween(String value1, String value2) {
            addCriterion("VISIT_RESULT not between", value1, value2, "visitResult");
            return (Criteria) this;
        }

        public Criteria andVisitEnvironmentIsNull() {
            addCriterion("VISIT_ENVIRONMENT is null");
            return (Criteria) this;
        }

        public Criteria andVisitEnvironmentIsNotNull() {
            addCriterion("VISIT_ENVIRONMENT is not null");
            return (Criteria) this;
        }

        public Criteria andVisitEnvironmentEqualTo(String value) {
            addCriterion("VISIT_ENVIRONMENT =", value, "visitEnvironment");
            return (Criteria) this;
        }

        public Criteria andVisitEnvironmentNotEqualTo(String value) {
            addCriterion("VISIT_ENVIRONMENT <>", value, "visitEnvironment");
            return (Criteria) this;
        }

        public Criteria andVisitEnvironmentGreaterThan(String value) {
            addCriterion("VISIT_ENVIRONMENT >", value, "visitEnvironment");
            return (Criteria) this;
        }

        public Criteria andVisitEnvironmentGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_ENVIRONMENT >=", value, "visitEnvironment");
            return (Criteria) this;
        }

        public Criteria andVisitEnvironmentLessThan(String value) {
            addCriterion("VISIT_ENVIRONMENT <", value, "visitEnvironment");
            return (Criteria) this;
        }

        public Criteria andVisitEnvironmentLessThanOrEqualTo(String value) {
            addCriterion("VISIT_ENVIRONMENT <=", value, "visitEnvironment");
            return (Criteria) this;
        }

        public Criteria andVisitEnvironmentLike(String value) {
            addCriterion("VISIT_ENVIRONMENT like", value, "visitEnvironment");
            return (Criteria) this;
        }

        public Criteria andVisitEnvironmentNotLike(String value) {
            addCriterion("VISIT_ENVIRONMENT not like", value, "visitEnvironment");
            return (Criteria) this;
        }

        public Criteria andVisitEnvironmentIn(List<String> values) {
            addCriterion("VISIT_ENVIRONMENT in", values, "visitEnvironment");
            return (Criteria) this;
        }

        public Criteria andVisitEnvironmentNotIn(List<String> values) {
            addCriterion("VISIT_ENVIRONMENT not in", values, "visitEnvironment");
            return (Criteria) this;
        }

        public Criteria andVisitEnvironmentBetween(String value1, String value2) {
            addCriterion("VISIT_ENVIRONMENT between", value1, value2, "visitEnvironment");
            return (Criteria) this;
        }

        public Criteria andVisitEnvironmentNotBetween(String value1, String value2) {
            addCriterion("VISIT_ENVIRONMENT not between", value1, value2, "visitEnvironment");
            return (Criteria) this;
        }

        public Criteria andVisitServiceIsNull() {
            addCriterion("VISIT_SERVICE is null");
            return (Criteria) this;
        }

        public Criteria andVisitServiceIsNotNull() {
            addCriterion("VISIT_SERVICE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitServiceEqualTo(String value) {
            addCriterion("VISIT_SERVICE =", value, "visitService");
            return (Criteria) this;
        }

        public Criteria andVisitServiceNotEqualTo(String value) {
            addCriterion("VISIT_SERVICE <>", value, "visitService");
            return (Criteria) this;
        }

        public Criteria andVisitServiceGreaterThan(String value) {
            addCriterion("VISIT_SERVICE >", value, "visitService");
            return (Criteria) this;
        }

        public Criteria andVisitServiceGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_SERVICE >=", value, "visitService");
            return (Criteria) this;
        }

        public Criteria andVisitServiceLessThan(String value) {
            addCriterion("VISIT_SERVICE <", value, "visitService");
            return (Criteria) this;
        }

        public Criteria andVisitServiceLessThanOrEqualTo(String value) {
            addCriterion("VISIT_SERVICE <=", value, "visitService");
            return (Criteria) this;
        }

        public Criteria andVisitServiceLike(String value) {
            addCriterion("VISIT_SERVICE like", value, "visitService");
            return (Criteria) this;
        }

        public Criteria andVisitServiceNotLike(String value) {
            addCriterion("VISIT_SERVICE not like", value, "visitService");
            return (Criteria) this;
        }

        public Criteria andVisitServiceIn(List<String> values) {
            addCriterion("VISIT_SERVICE in", values, "visitService");
            return (Criteria) this;
        }

        public Criteria andVisitServiceNotIn(List<String> values) {
            addCriterion("VISIT_SERVICE not in", values, "visitService");
            return (Criteria) this;
        }

        public Criteria andVisitServiceBetween(String value1, String value2) {
            addCriterion("VISIT_SERVICE between", value1, value2, "visitService");
            return (Criteria) this;
        }

        public Criteria andVisitServiceNotBetween(String value1, String value2) {
            addCriterion("VISIT_SERVICE not between", value1, value2, "visitService");
            return (Criteria) this;
        }

        public Criteria andVisitEffectIsNull() {
            addCriterion("VISIT_EFFECT is null");
            return (Criteria) this;
        }

        public Criteria andVisitEffectIsNotNull() {
            addCriterion("VISIT_EFFECT is not null");
            return (Criteria) this;
        }

        public Criteria andVisitEffectEqualTo(String value) {
            addCriterion("VISIT_EFFECT =", value, "visitEffect");
            return (Criteria) this;
        }

        public Criteria andVisitEffectNotEqualTo(String value) {
            addCriterion("VISIT_EFFECT <>", value, "visitEffect");
            return (Criteria) this;
        }

        public Criteria andVisitEffectGreaterThan(String value) {
            addCriterion("VISIT_EFFECT >", value, "visitEffect");
            return (Criteria) this;
        }

        public Criteria andVisitEffectGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_EFFECT >=", value, "visitEffect");
            return (Criteria) this;
        }

        public Criteria andVisitEffectLessThan(String value) {
            addCriterion("VISIT_EFFECT <", value, "visitEffect");
            return (Criteria) this;
        }

        public Criteria andVisitEffectLessThanOrEqualTo(String value) {
            addCriterion("VISIT_EFFECT <=", value, "visitEffect");
            return (Criteria) this;
        }

        public Criteria andVisitEffectLike(String value) {
            addCriterion("VISIT_EFFECT like", value, "visitEffect");
            return (Criteria) this;
        }

        public Criteria andVisitEffectNotLike(String value) {
            addCriterion("VISIT_EFFECT not like", value, "visitEffect");
            return (Criteria) this;
        }

        public Criteria andVisitEffectIn(List<String> values) {
            addCriterion("VISIT_EFFECT in", values, "visitEffect");
            return (Criteria) this;
        }

        public Criteria andVisitEffectNotIn(List<String> values) {
            addCriterion("VISIT_EFFECT not in", values, "visitEffect");
            return (Criteria) this;
        }

        public Criteria andVisitEffectBetween(String value1, String value2) {
            addCriterion("VISIT_EFFECT between", value1, value2, "visitEffect");
            return (Criteria) this;
        }

        public Criteria andVisitEffectNotBetween(String value1, String value2) {
            addCriterion("VISIT_EFFECT not between", value1, value2, "visitEffect");
            return (Criteria) this;
        }

        public Criteria andVisitNextDateIsNull() {
            addCriterion("VISIT_NEXT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andVisitNextDateIsNotNull() {
            addCriterion("VISIT_NEXT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitNextDateEqualTo(Date value) {
            addCriterion("VISIT_NEXT_DATE =", value, "visitNextDate");
            return (Criteria) this;
        }

        public Criteria andVisitNextDateNotEqualTo(Date value) {
            addCriterion("VISIT_NEXT_DATE <>", value, "visitNextDate");
            return (Criteria) this;
        }

        public Criteria andVisitNextDateGreaterThan(Date value) {
            addCriterion("VISIT_NEXT_DATE >", value, "visitNextDate");
            return (Criteria) this;
        }

        public Criteria andVisitNextDateGreaterThanOrEqualTo(Date value) {
            addCriterion("VISIT_NEXT_DATE >=", value, "visitNextDate");
            return (Criteria) this;
        }

        public Criteria andVisitNextDateLessThan(Date value) {
            addCriterion("VISIT_NEXT_DATE <", value, "visitNextDate");
            return (Criteria) this;
        }

        public Criteria andVisitNextDateLessThanOrEqualTo(Date value) {
            addCriterion("VISIT_NEXT_DATE <=", value, "visitNextDate");
            return (Criteria) this;
        }

        public Criteria andVisitNextDateIn(List<Date> values) {
            addCriterion("VISIT_NEXT_DATE in", values, "visitNextDate");
            return (Criteria) this;
        }

        public Criteria andVisitNextDateNotIn(List<Date> values) {
            addCriterion("VISIT_NEXT_DATE not in", values, "visitNextDate");
            return (Criteria) this;
        }

        public Criteria andVisitNextDateBetween(Date value1, Date value2) {
            addCriterion("VISIT_NEXT_DATE between", value1, value2, "visitNextDate");
            return (Criteria) this;
        }

        public Criteria andVisitNextDateNotBetween(Date value1, Date value2) {
            addCriterion("VISIT_NEXT_DATE not between", value1, value2, "visitNextDate");
            return (Criteria) this;
        }

        public Criteria andVisitNextIdIsNull() {
            addCriterion("VISIT_NEXT_ID is null");
            return (Criteria) this;
        }

        public Criteria andVisitNextIdIsNotNull() {
            addCriterion("VISIT_NEXT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVisitNextIdEqualTo(String value) {
            addCriterion("VISIT_NEXT_ID =", value, "visitNextId");
            return (Criteria) this;
        }

        public Criteria andVisitNextIdNotEqualTo(String value) {
            addCriterion("VISIT_NEXT_ID <>", value, "visitNextId");
            return (Criteria) this;
        }

        public Criteria andVisitNextIdGreaterThan(String value) {
            addCriterion("VISIT_NEXT_ID >", value, "visitNextId");
            return (Criteria) this;
        }

        public Criteria andVisitNextIdGreaterThanOrEqualTo(String value) {
            addCriterion("VISIT_NEXT_ID >=", value, "visitNextId");
            return (Criteria) this;
        }

        public Criteria andVisitNextIdLessThan(String value) {
            addCriterion("VISIT_NEXT_ID <", value, "visitNextId");
            return (Criteria) this;
        }

        public Criteria andVisitNextIdLessThanOrEqualTo(String value) {
            addCriterion("VISIT_NEXT_ID <=", value, "visitNextId");
            return (Criteria) this;
        }

        public Criteria andVisitNextIdLike(String value) {
            addCriterion("VISIT_NEXT_ID like", value, "visitNextId");
            return (Criteria) this;
        }

        public Criteria andVisitNextIdNotLike(String value) {
            addCriterion("VISIT_NEXT_ID not like", value, "visitNextId");
            return (Criteria) this;
        }

        public Criteria andVisitNextIdIn(List<String> values) {
            addCriterion("VISIT_NEXT_ID in", values, "visitNextId");
            return (Criteria) this;
        }

        public Criteria andVisitNextIdNotIn(List<String> values) {
            addCriterion("VISIT_NEXT_ID not in", values, "visitNextId");
            return (Criteria) this;
        }

        public Criteria andVisitNextIdBetween(String value1, String value2) {
            addCriterion("VISIT_NEXT_ID between", value1, value2, "visitNextId");
            return (Criteria) this;
        }

        public Criteria andVisitNextIdNotBetween(String value1, String value2) {
            addCriterion("VISIT_NEXT_ID not between", value1, value2, "visitNextId");
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

        public Criteria andCreatedOperIdIsNull() {
            addCriterion("CREATED_OPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCreatedOperIdIsNotNull() {
            addCriterion("CREATED_OPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedOperIdEqualTo(String value) {
            addCriterion("CREATED_OPER_ID =", value, "createdOperId");
            return (Criteria) this;
        }

        public Criteria andCreatedOperIdNotEqualTo(String value) {
            addCriterion("CREATED_OPER_ID <>", value, "createdOperId");
            return (Criteria) this;
        }

        public Criteria andCreatedOperIdGreaterThan(String value) {
            addCriterion("CREATED_OPER_ID >", value, "createdOperId");
            return (Criteria) this;
        }

        public Criteria andCreatedOperIdGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_OPER_ID >=", value, "createdOperId");
            return (Criteria) this;
        }

        public Criteria andCreatedOperIdLessThan(String value) {
            addCriterion("CREATED_OPER_ID <", value, "createdOperId");
            return (Criteria) this;
        }

        public Criteria andCreatedOperIdLessThanOrEqualTo(String value) {
            addCriterion("CREATED_OPER_ID <=", value, "createdOperId");
            return (Criteria) this;
        }

        public Criteria andCreatedOperIdLike(String value) {
            addCriterion("CREATED_OPER_ID like", value, "createdOperId");
            return (Criteria) this;
        }

        public Criteria andCreatedOperIdNotLike(String value) {
            addCriterion("CREATED_OPER_ID not like", value, "createdOperId");
            return (Criteria) this;
        }

        public Criteria andCreatedOperIdIn(List<String> values) {
            addCriterion("CREATED_OPER_ID in", values, "createdOperId");
            return (Criteria) this;
        }

        public Criteria andCreatedOperIdNotIn(List<String> values) {
            addCriterion("CREATED_OPER_ID not in", values, "createdOperId");
            return (Criteria) this;
        }

        public Criteria andCreatedOperIdBetween(String value1, String value2) {
            addCriterion("CREATED_OPER_ID between", value1, value2, "createdOperId");
            return (Criteria) this;
        }

        public Criteria andCreatedOperIdNotBetween(String value1, String value2) {
            addCriterion("CREATED_OPER_ID not between", value1, value2, "createdOperId");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNull() {
            addCriterion("OPER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOperIdIsNotNull() {
            addCriterion("OPER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOperIdEqualTo(String value) {
            addCriterion("OPER_ID =", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotEqualTo(String value) {
            addCriterion("OPER_ID <>", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThan(String value) {
            addCriterion("OPER_ID >", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_ID >=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThan(String value) {
            addCriterion("OPER_ID <", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLessThanOrEqualTo(String value) {
            addCriterion("OPER_ID <=", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdLike(String value) {
            addCriterion("OPER_ID like", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotLike(String value) {
            addCriterion("OPER_ID not like", value, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdIn(List<String> values) {
            addCriterion("OPER_ID in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotIn(List<String> values) {
            addCriterion("OPER_ID not in", values, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdBetween(String value1, String value2) {
            addCriterion("OPER_ID between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andOperIdNotBetween(String value1, String value2) {
            addCriterion("OPER_ID not between", value1, value2, "operId");
            return (Criteria) this;
        }

        public Criteria andOperTimeIsNull() {
            addCriterion("OPER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOperTimeIsNotNull() {
            addCriterion("OPER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOperTimeEqualTo(Date value) {
            addCriterion("OPER_TIME =", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotEqualTo(Date value) {
            addCriterion("OPER_TIME <>", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeGreaterThan(Date value) {
            addCriterion("OPER_TIME >", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OPER_TIME >=", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeLessThan(Date value) {
            addCriterion("OPER_TIME <", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeLessThanOrEqualTo(Date value) {
            addCriterion("OPER_TIME <=", value, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeIn(List<Date> values) {
            addCriterion("OPER_TIME in", values, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotIn(List<Date> values) {
            addCriterion("OPER_TIME not in", values, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeBetween(Date value1, Date value2) {
            addCriterion("OPER_TIME between", value1, value2, "operTime");
            return (Criteria) this;
        }

        public Criteria andOperTimeNotBetween(Date value1, Date value2) {
            addCriterion("OPER_TIME not between", value1, value2, "operTime");
            return (Criteria) this;
        }

        public Criteria andAppointIdIsNull() {
            addCriterion("APPOINT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAppointIdIsNotNull() {
            addCriterion("APPOINT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAppointIdEqualTo(String value) {
            addCriterion("APPOINT_ID =", value, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdNotEqualTo(String value) {
            addCriterion("APPOINT_ID <>", value, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdGreaterThan(String value) {
            addCriterion("APPOINT_ID >", value, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdGreaterThanOrEqualTo(String value) {
            addCriterion("APPOINT_ID >=", value, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdLessThan(String value) {
            addCriterion("APPOINT_ID <", value, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdLessThanOrEqualTo(String value) {
            addCriterion("APPOINT_ID <=", value, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdLike(String value) {
            addCriterion("APPOINT_ID like", value, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdNotLike(String value) {
            addCriterion("APPOINT_ID not like", value, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdIn(List<String> values) {
            addCriterion("APPOINT_ID in", values, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdNotIn(List<String> values) {
            addCriterion("APPOINT_ID not in", values, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdBetween(String value1, String value2) {
            addCriterion("APPOINT_ID between", value1, value2, "appointId");
            return (Criteria) this;
        }

        public Criteria andAppointIdNotBetween(String value1, String value2) {
            addCriterion("APPOINT_ID not between", value1, value2, "appointId");
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

        public Criteria andHospitalNameIsNull() {
            addCriterion("HOSPITAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIsNotNull() {
            addCriterion("HOSPITAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalNameEqualTo(String value) {
            addCriterion("HOSPITAL_NAME =", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotEqualTo(String value) {
            addCriterion("HOSPITAL_NAME <>", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameGreaterThan(String value) {
            addCriterion("HOSPITAL_NAME >", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameGreaterThanOrEqualTo(String value) {
            addCriterion("HOSPITAL_NAME >=", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLessThan(String value) {
            addCriterion("HOSPITAL_NAME <", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLessThanOrEqualTo(String value) {
            addCriterion("HOSPITAL_NAME <=", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameLike(String value) {
            addCriterion("HOSPITAL_NAME like", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotLike(String value) {
            addCriterion("HOSPITAL_NAME not like", value, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameIn(List<String> values) {
            addCriterion("HOSPITAL_NAME in", values, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotIn(List<String> values) {
            addCriterion("HOSPITAL_NAME not in", values, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameBetween(String value1, String value2) {
            addCriterion("HOSPITAL_NAME between", value1, value2, "hospitalName");
            return (Criteria) this;
        }

        public Criteria andHospitalNameNotBetween(String value1, String value2) {
            addCriterion("HOSPITAL_NAME not between", value1, value2, "hospitalName");
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