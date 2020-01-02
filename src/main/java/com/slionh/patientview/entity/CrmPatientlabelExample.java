package com.slionh.patientview.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CrmPatientlabelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CrmPatientlabelExample() {
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

        public Criteria andPatientlabelIdIsNull() {
            addCriterion("PATIENTLABEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andPatientlabelIdIsNotNull() {
            addCriterion("PATIENTLABEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPatientlabelIdEqualTo(String value) {
            addCriterion("PATIENTLABEL_ID =", value, "patientlabelId");
            return (Criteria) this;
        }

        public Criteria andPatientlabelIdNotEqualTo(String value) {
            addCriterion("PATIENTLABEL_ID <>", value, "patientlabelId");
            return (Criteria) this;
        }

        public Criteria andPatientlabelIdGreaterThan(String value) {
            addCriterion("PATIENTLABEL_ID >", value, "patientlabelId");
            return (Criteria) this;
        }

        public Criteria andPatientlabelIdGreaterThanOrEqualTo(String value) {
            addCriterion("PATIENTLABEL_ID >=", value, "patientlabelId");
            return (Criteria) this;
        }

        public Criteria andPatientlabelIdLessThan(String value) {
            addCriterion("PATIENTLABEL_ID <", value, "patientlabelId");
            return (Criteria) this;
        }

        public Criteria andPatientlabelIdLessThanOrEqualTo(String value) {
            addCriterion("PATIENTLABEL_ID <=", value, "patientlabelId");
            return (Criteria) this;
        }

        public Criteria andPatientlabelIdLike(String value) {
            addCriterion("PATIENTLABEL_ID like", value, "patientlabelId");
            return (Criteria) this;
        }

        public Criteria andPatientlabelIdNotLike(String value) {
            addCriterion("PATIENTLABEL_ID not like", value, "patientlabelId");
            return (Criteria) this;
        }

        public Criteria andPatientlabelIdIn(List<String> values) {
            addCriterion("PATIENTLABEL_ID in", values, "patientlabelId");
            return (Criteria) this;
        }

        public Criteria andPatientlabelIdNotIn(List<String> values) {
            addCriterion("PATIENTLABEL_ID not in", values, "patientlabelId");
            return (Criteria) this;
        }

        public Criteria andPatientlabelIdBetween(String value1, String value2) {
            addCriterion("PATIENTLABEL_ID between", value1, value2, "patientlabelId");
            return (Criteria) this;
        }

        public Criteria andPatientlabelIdNotBetween(String value1, String value2) {
            addCriterion("PATIENTLABEL_ID not between", value1, value2, "patientlabelId");
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

        public Criteria andLabelTypeIsNull() {
            addCriterion("LABEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLabelTypeIsNotNull() {
            addCriterion("LABEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLabelTypeEqualTo(String value) {
            addCriterion("LABEL_TYPE =", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeNotEqualTo(String value) {
            addCriterion("LABEL_TYPE <>", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeGreaterThan(String value) {
            addCriterion("LABEL_TYPE >", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("LABEL_TYPE >=", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeLessThan(String value) {
            addCriterion("LABEL_TYPE <", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeLessThanOrEqualTo(String value) {
            addCriterion("LABEL_TYPE <=", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeLike(String value) {
            addCriterion("LABEL_TYPE like", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeNotLike(String value) {
            addCriterion("LABEL_TYPE not like", value, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeIn(List<String> values) {
            addCriterion("LABEL_TYPE in", values, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeNotIn(List<String> values) {
            addCriterion("LABEL_TYPE not in", values, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeBetween(String value1, String value2) {
            addCriterion("LABEL_TYPE between", value1, value2, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelTypeNotBetween(String value1, String value2) {
            addCriterion("LABEL_TYPE not between", value1, value2, "labelType");
            return (Criteria) this;
        }

        public Criteria andLabelIdIsNull() {
            addCriterion("LABEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andLabelIdIsNotNull() {
            addCriterion("LABEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLabelIdEqualTo(String value) {
            addCriterion("LABEL_ID =", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotEqualTo(String value) {
            addCriterion("LABEL_ID <>", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThan(String value) {
            addCriterion("LABEL_ID >", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdGreaterThanOrEqualTo(String value) {
            addCriterion("LABEL_ID >=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThan(String value) {
            addCriterion("LABEL_ID <", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLessThanOrEqualTo(String value) {
            addCriterion("LABEL_ID <=", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdLike(String value) {
            addCriterion("LABEL_ID like", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotLike(String value) {
            addCriterion("LABEL_ID not like", value, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdIn(List<String> values) {
            addCriterion("LABEL_ID in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotIn(List<String> values) {
            addCriterion("LABEL_ID not in", values, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdBetween(String value1, String value2) {
            addCriterion("LABEL_ID between", value1, value2, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelIdNotBetween(String value1, String value2) {
            addCriterion("LABEL_ID not between", value1, value2, "labelId");
            return (Criteria) this;
        }

        public Criteria andLabelSpeciesIsNull() {
            addCriterion("LABEL_SPECIES is null");
            return (Criteria) this;
        }

        public Criteria andLabelSpeciesIsNotNull() {
            addCriterion("LABEL_SPECIES is not null");
            return (Criteria) this;
        }

        public Criteria andLabelSpeciesEqualTo(String value) {
            addCriterion("LABEL_SPECIES =", value, "labelSpecies");
            return (Criteria) this;
        }

        public Criteria andLabelSpeciesNotEqualTo(String value) {
            addCriterion("LABEL_SPECIES <>", value, "labelSpecies");
            return (Criteria) this;
        }

        public Criteria andLabelSpeciesGreaterThan(String value) {
            addCriterion("LABEL_SPECIES >", value, "labelSpecies");
            return (Criteria) this;
        }

        public Criteria andLabelSpeciesGreaterThanOrEqualTo(String value) {
            addCriterion("LABEL_SPECIES >=", value, "labelSpecies");
            return (Criteria) this;
        }

        public Criteria andLabelSpeciesLessThan(String value) {
            addCriterion("LABEL_SPECIES <", value, "labelSpecies");
            return (Criteria) this;
        }

        public Criteria andLabelSpeciesLessThanOrEqualTo(String value) {
            addCriterion("LABEL_SPECIES <=", value, "labelSpecies");
            return (Criteria) this;
        }

        public Criteria andLabelSpeciesLike(String value) {
            addCriterion("LABEL_SPECIES like", value, "labelSpecies");
            return (Criteria) this;
        }

        public Criteria andLabelSpeciesNotLike(String value) {
            addCriterion("LABEL_SPECIES not like", value, "labelSpecies");
            return (Criteria) this;
        }

        public Criteria andLabelSpeciesIn(List<String> values) {
            addCriterion("LABEL_SPECIES in", values, "labelSpecies");
            return (Criteria) this;
        }

        public Criteria andLabelSpeciesNotIn(List<String> values) {
            addCriterion("LABEL_SPECIES not in", values, "labelSpecies");
            return (Criteria) this;
        }

        public Criteria andLabelSpeciesBetween(String value1, String value2) {
            addCriterion("LABEL_SPECIES between", value1, value2, "labelSpecies");
            return (Criteria) this;
        }

        public Criteria andLabelSpeciesNotBetween(String value1, String value2) {
            addCriterion("LABEL_SPECIES not between", value1, value2, "labelSpecies");
            return (Criteria) this;
        }

        public Criteria andLabelContentIsNull() {
            addCriterion("LABEL_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andLabelContentIsNotNull() {
            addCriterion("LABEL_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andLabelContentEqualTo(String value) {
            addCriterion("LABEL_CONTENT =", value, "labelContent");
            return (Criteria) this;
        }

        public Criteria andLabelContentNotEqualTo(String value) {
            addCriterion("LABEL_CONTENT <>", value, "labelContent");
            return (Criteria) this;
        }

        public Criteria andLabelContentGreaterThan(String value) {
            addCriterion("LABEL_CONTENT >", value, "labelContent");
            return (Criteria) this;
        }

        public Criteria andLabelContentGreaterThanOrEqualTo(String value) {
            addCriterion("LABEL_CONTENT >=", value, "labelContent");
            return (Criteria) this;
        }

        public Criteria andLabelContentLessThan(String value) {
            addCriterion("LABEL_CONTENT <", value, "labelContent");
            return (Criteria) this;
        }

        public Criteria andLabelContentLessThanOrEqualTo(String value) {
            addCriterion("LABEL_CONTENT <=", value, "labelContent");
            return (Criteria) this;
        }

        public Criteria andLabelContentLike(String value) {
            addCriterion("LABEL_CONTENT like", value, "labelContent");
            return (Criteria) this;
        }

        public Criteria andLabelContentNotLike(String value) {
            addCriterion("LABEL_CONTENT not like", value, "labelContent");
            return (Criteria) this;
        }

        public Criteria andLabelContentIn(List<String> values) {
            addCriterion("LABEL_CONTENT in", values, "labelContent");
            return (Criteria) this;
        }

        public Criteria andLabelContentNotIn(List<String> values) {
            addCriterion("LABEL_CONTENT not in", values, "labelContent");
            return (Criteria) this;
        }

        public Criteria andLabelContentBetween(String value1, String value2) {
            addCriterion("LABEL_CONTENT between", value1, value2, "labelContent");
            return (Criteria) this;
        }

        public Criteria andLabelContentNotBetween(String value1, String value2) {
            addCriterion("LABEL_CONTENT not between", value1, value2, "labelContent");
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

        public Criteria andExtfiled1IsNull() {
            addCriterion("EXTFILED1 is null");
            return (Criteria) this;
        }

        public Criteria andExtfiled1IsNotNull() {
            addCriterion("EXTFILED1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfiled1EqualTo(String value) {
            addCriterion("EXTFILED1 =", value, "extfiled1");
            return (Criteria) this;
        }

        public Criteria andExtfiled1NotEqualTo(String value) {
            addCriterion("EXTFILED1 <>", value, "extfiled1");
            return (Criteria) this;
        }

        public Criteria andExtfiled1GreaterThan(String value) {
            addCriterion("EXTFILED1 >", value, "extfiled1");
            return (Criteria) this;
        }

        public Criteria andExtfiled1GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFILED1 >=", value, "extfiled1");
            return (Criteria) this;
        }

        public Criteria andExtfiled1LessThan(String value) {
            addCriterion("EXTFILED1 <", value, "extfiled1");
            return (Criteria) this;
        }

        public Criteria andExtfiled1LessThanOrEqualTo(String value) {
            addCriterion("EXTFILED1 <=", value, "extfiled1");
            return (Criteria) this;
        }

        public Criteria andExtfiled1Like(String value) {
            addCriterion("EXTFILED1 like", value, "extfiled1");
            return (Criteria) this;
        }

        public Criteria andExtfiled1NotLike(String value) {
            addCriterion("EXTFILED1 not like", value, "extfiled1");
            return (Criteria) this;
        }

        public Criteria andExtfiled1In(List<String> values) {
            addCriterion("EXTFILED1 in", values, "extfiled1");
            return (Criteria) this;
        }

        public Criteria andExtfiled1NotIn(List<String> values) {
            addCriterion("EXTFILED1 not in", values, "extfiled1");
            return (Criteria) this;
        }

        public Criteria andExtfiled1Between(String value1, String value2) {
            addCriterion("EXTFILED1 between", value1, value2, "extfiled1");
            return (Criteria) this;
        }

        public Criteria andExtfiled1NotBetween(String value1, String value2) {
            addCriterion("EXTFILED1 not between", value1, value2, "extfiled1");
            return (Criteria) this;
        }

        public Criteria andExtfiled2IsNull() {
            addCriterion("EXTFILED2 is null");
            return (Criteria) this;
        }

        public Criteria andExtfiled2IsNotNull() {
            addCriterion("EXTFILED2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfiled2EqualTo(String value) {
            addCriterion("EXTFILED2 =", value, "extfiled2");
            return (Criteria) this;
        }

        public Criteria andExtfiled2NotEqualTo(String value) {
            addCriterion("EXTFILED2 <>", value, "extfiled2");
            return (Criteria) this;
        }

        public Criteria andExtfiled2GreaterThan(String value) {
            addCriterion("EXTFILED2 >", value, "extfiled2");
            return (Criteria) this;
        }

        public Criteria andExtfiled2GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFILED2 >=", value, "extfiled2");
            return (Criteria) this;
        }

        public Criteria andExtfiled2LessThan(String value) {
            addCriterion("EXTFILED2 <", value, "extfiled2");
            return (Criteria) this;
        }

        public Criteria andExtfiled2LessThanOrEqualTo(String value) {
            addCriterion("EXTFILED2 <=", value, "extfiled2");
            return (Criteria) this;
        }

        public Criteria andExtfiled2Like(String value) {
            addCriterion("EXTFILED2 like", value, "extfiled2");
            return (Criteria) this;
        }

        public Criteria andExtfiled2NotLike(String value) {
            addCriterion("EXTFILED2 not like", value, "extfiled2");
            return (Criteria) this;
        }

        public Criteria andExtfiled2In(List<String> values) {
            addCriterion("EXTFILED2 in", values, "extfiled2");
            return (Criteria) this;
        }

        public Criteria andExtfiled2NotIn(List<String> values) {
            addCriterion("EXTFILED2 not in", values, "extfiled2");
            return (Criteria) this;
        }

        public Criteria andExtfiled2Between(String value1, String value2) {
            addCriterion("EXTFILED2 between", value1, value2, "extfiled2");
            return (Criteria) this;
        }

        public Criteria andExtfiled2NotBetween(String value1, String value2) {
            addCriterion("EXTFILED2 not between", value1, value2, "extfiled2");
            return (Criteria) this;
        }

        public Criteria andExtfiled3IsNull() {
            addCriterion("EXTFILED3 is null");
            return (Criteria) this;
        }

        public Criteria andExtfiled3IsNotNull() {
            addCriterion("EXTFILED3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtfiled3EqualTo(String value) {
            addCriterion("EXTFILED3 =", value, "extfiled3");
            return (Criteria) this;
        }

        public Criteria andExtfiled3NotEqualTo(String value) {
            addCriterion("EXTFILED3 <>", value, "extfiled3");
            return (Criteria) this;
        }

        public Criteria andExtfiled3GreaterThan(String value) {
            addCriterion("EXTFILED3 >", value, "extfiled3");
            return (Criteria) this;
        }

        public Criteria andExtfiled3GreaterThanOrEqualTo(String value) {
            addCriterion("EXTFILED3 >=", value, "extfiled3");
            return (Criteria) this;
        }

        public Criteria andExtfiled3LessThan(String value) {
            addCriterion("EXTFILED3 <", value, "extfiled3");
            return (Criteria) this;
        }

        public Criteria andExtfiled3LessThanOrEqualTo(String value) {
            addCriterion("EXTFILED3 <=", value, "extfiled3");
            return (Criteria) this;
        }

        public Criteria andExtfiled3Like(String value) {
            addCriterion("EXTFILED3 like", value, "extfiled3");
            return (Criteria) this;
        }

        public Criteria andExtfiled3NotLike(String value) {
            addCriterion("EXTFILED3 not like", value, "extfiled3");
            return (Criteria) this;
        }

        public Criteria andExtfiled3In(List<String> values) {
            addCriterion("EXTFILED3 in", values, "extfiled3");
            return (Criteria) this;
        }

        public Criteria andExtfiled3NotIn(List<String> values) {
            addCriterion("EXTFILED3 not in", values, "extfiled3");
            return (Criteria) this;
        }

        public Criteria andExtfiled3Between(String value1, String value2) {
            addCriterion("EXTFILED3 between", value1, value2, "extfiled3");
            return (Criteria) this;
        }

        public Criteria andExtfiled3NotBetween(String value1, String value2) {
            addCriterion("EXTFILED3 not between", value1, value2, "extfiled3");
            return (Criteria) this;
        }

        public Criteria andLabelStateIsNull() {
            addCriterion("LABEL_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLabelStateIsNotNull() {
            addCriterion("LABEL_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLabelStateEqualTo(String value) {
            addCriterion("LABEL_STATE =", value, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateNotEqualTo(String value) {
            addCriterion("LABEL_STATE <>", value, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateGreaterThan(String value) {
            addCriterion("LABEL_STATE >", value, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateGreaterThanOrEqualTo(String value) {
            addCriterion("LABEL_STATE >=", value, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateLessThan(String value) {
            addCriterion("LABEL_STATE <", value, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateLessThanOrEqualTo(String value) {
            addCriterion("LABEL_STATE <=", value, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateLike(String value) {
            addCriterion("LABEL_STATE like", value, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateNotLike(String value) {
            addCriterion("LABEL_STATE not like", value, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateIn(List<String> values) {
            addCriterion("LABEL_STATE in", values, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateNotIn(List<String> values) {
            addCriterion("LABEL_STATE not in", values, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateBetween(String value1, String value2) {
            addCriterion("LABEL_STATE between", value1, value2, "labelState");
            return (Criteria) this;
        }

        public Criteria andLabelStateNotBetween(String value1, String value2) {
            addCriterion("LABEL_STATE not between", value1, value2, "labelState");
            return (Criteria) this;
        }

        public Criteria andOperDeptIsNull() {
            addCriterion("OPER_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andOperDeptIsNotNull() {
            addCriterion("OPER_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andOperDeptEqualTo(String value) {
            addCriterion("OPER_DEPT =", value, "operDept");
            return (Criteria) this;
        }

        public Criteria andOperDeptNotEqualTo(String value) {
            addCriterion("OPER_DEPT <>", value, "operDept");
            return (Criteria) this;
        }

        public Criteria andOperDeptGreaterThan(String value) {
            addCriterion("OPER_DEPT >", value, "operDept");
            return (Criteria) this;
        }

        public Criteria andOperDeptGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_DEPT >=", value, "operDept");
            return (Criteria) this;
        }

        public Criteria andOperDeptLessThan(String value) {
            addCriterion("OPER_DEPT <", value, "operDept");
            return (Criteria) this;
        }

        public Criteria andOperDeptLessThanOrEqualTo(String value) {
            addCriterion("OPER_DEPT <=", value, "operDept");
            return (Criteria) this;
        }

        public Criteria andOperDeptLike(String value) {
            addCriterion("OPER_DEPT like", value, "operDept");
            return (Criteria) this;
        }

        public Criteria andOperDeptNotLike(String value) {
            addCriterion("OPER_DEPT not like", value, "operDept");
            return (Criteria) this;
        }

        public Criteria andOperDeptIn(List<String> values) {
            addCriterion("OPER_DEPT in", values, "operDept");
            return (Criteria) this;
        }

        public Criteria andOperDeptNotIn(List<String> values) {
            addCriterion("OPER_DEPT not in", values, "operDept");
            return (Criteria) this;
        }

        public Criteria andOperDeptBetween(String value1, String value2) {
            addCriterion("OPER_DEPT between", value1, value2, "operDept");
            return (Criteria) this;
        }

        public Criteria andOperDeptNotBetween(String value1, String value2) {
            addCriterion("OPER_DEPT not between", value1, value2, "operDept");
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

        public Criteria andOperNameIsNull() {
            addCriterion("OPER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOperNameIsNotNull() {
            addCriterion("OPER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperNameEqualTo(String value) {
            addCriterion("OPER_NAME =", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameNotEqualTo(String value) {
            addCriterion("OPER_NAME <>", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameGreaterThan(String value) {
            addCriterion("OPER_NAME >", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_NAME >=", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameLessThan(String value) {
            addCriterion("OPER_NAME <", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameLessThanOrEqualTo(String value) {
            addCriterion("OPER_NAME <=", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameLike(String value) {
            addCriterion("OPER_NAME like", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameNotLike(String value) {
            addCriterion("OPER_NAME not like", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameIn(List<String> values) {
            addCriterion("OPER_NAME in", values, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameNotIn(List<String> values) {
            addCriterion("OPER_NAME not in", values, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameBetween(String value1, String value2) {
            addCriterion("OPER_NAME between", value1, value2, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameNotBetween(String value1, String value2) {
            addCriterion("OPER_NAME not between", value1, value2, "operName");
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