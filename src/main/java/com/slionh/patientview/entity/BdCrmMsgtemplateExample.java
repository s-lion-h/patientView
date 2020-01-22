package com.slionh.patientview.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BdCrmMsgtemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdCrmMsgtemplateExample() {
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

        public Criteria andMsgtemplateIdIsNull() {
            addCriterion("MSGTEMPLATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateIdIsNotNull() {
            addCriterion("MSGTEMPLATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateIdEqualTo(String value) {
            addCriterion("MSGTEMPLATE_ID =", value, "msgtemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateIdNotEqualTo(String value) {
            addCriterion("MSGTEMPLATE_ID <>", value, "msgtemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateIdGreaterThan(String value) {
            addCriterion("MSGTEMPLATE_ID >", value, "msgtemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateIdGreaterThanOrEqualTo(String value) {
            addCriterion("MSGTEMPLATE_ID >=", value, "msgtemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateIdLessThan(String value) {
            addCriterion("MSGTEMPLATE_ID <", value, "msgtemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateIdLessThanOrEqualTo(String value) {
            addCriterion("MSGTEMPLATE_ID <=", value, "msgtemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateIdLike(String value) {
            addCriterion("MSGTEMPLATE_ID like", value, "msgtemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateIdNotLike(String value) {
            addCriterion("MSGTEMPLATE_ID not like", value, "msgtemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateIdIn(List<String> values) {
            addCriterion("MSGTEMPLATE_ID in", values, "msgtemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateIdNotIn(List<String> values) {
            addCriterion("MSGTEMPLATE_ID not in", values, "msgtemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateIdBetween(String value1, String value2) {
            addCriterion("MSGTEMPLATE_ID between", value1, value2, "msgtemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateIdNotBetween(String value1, String value2) {
            addCriterion("MSGTEMPLATE_ID not between", value1, value2, "msgtemplateId");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTypeIsNull() {
            addCriterion("MSGTEMPLATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTypeIsNotNull() {
            addCriterion("MSGTEMPLATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTypeEqualTo(String value) {
            addCriterion("MSGTEMPLATE_TYPE =", value, "msgtemplateType");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTypeNotEqualTo(String value) {
            addCriterion("MSGTEMPLATE_TYPE <>", value, "msgtemplateType");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTypeGreaterThan(String value) {
            addCriterion("MSGTEMPLATE_TYPE >", value, "msgtemplateType");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MSGTEMPLATE_TYPE >=", value, "msgtemplateType");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTypeLessThan(String value) {
            addCriterion("MSGTEMPLATE_TYPE <", value, "msgtemplateType");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTypeLessThanOrEqualTo(String value) {
            addCriterion("MSGTEMPLATE_TYPE <=", value, "msgtemplateType");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTypeLike(String value) {
            addCriterion("MSGTEMPLATE_TYPE like", value, "msgtemplateType");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTypeNotLike(String value) {
            addCriterion("MSGTEMPLATE_TYPE not like", value, "msgtemplateType");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTypeIn(List<String> values) {
            addCriterion("MSGTEMPLATE_TYPE in", values, "msgtemplateType");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTypeNotIn(List<String> values) {
            addCriterion("MSGTEMPLATE_TYPE not in", values, "msgtemplateType");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTypeBetween(String value1, String value2) {
            addCriterion("MSGTEMPLATE_TYPE between", value1, value2, "msgtemplateType");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTypeNotBetween(String value1, String value2) {
            addCriterion("MSGTEMPLATE_TYPE not between", value1, value2, "msgtemplateType");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateChannelIsNull() {
            addCriterion("MSGTEMPLATE_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateChannelIsNotNull() {
            addCriterion("MSGTEMPLATE_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateChannelEqualTo(String value) {
            addCriterion("MSGTEMPLATE_CHANNEL =", value, "msgtemplateChannel");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateChannelNotEqualTo(String value) {
            addCriterion("MSGTEMPLATE_CHANNEL <>", value, "msgtemplateChannel");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateChannelGreaterThan(String value) {
            addCriterion("MSGTEMPLATE_CHANNEL >", value, "msgtemplateChannel");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateChannelGreaterThanOrEqualTo(String value) {
            addCriterion("MSGTEMPLATE_CHANNEL >=", value, "msgtemplateChannel");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateChannelLessThan(String value) {
            addCriterion("MSGTEMPLATE_CHANNEL <", value, "msgtemplateChannel");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateChannelLessThanOrEqualTo(String value) {
            addCriterion("MSGTEMPLATE_CHANNEL <=", value, "msgtemplateChannel");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateChannelLike(String value) {
            addCriterion("MSGTEMPLATE_CHANNEL like", value, "msgtemplateChannel");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateChannelNotLike(String value) {
            addCriterion("MSGTEMPLATE_CHANNEL not like", value, "msgtemplateChannel");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateChannelIn(List<String> values) {
            addCriterion("MSGTEMPLATE_CHANNEL in", values, "msgtemplateChannel");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateChannelNotIn(List<String> values) {
            addCriterion("MSGTEMPLATE_CHANNEL not in", values, "msgtemplateChannel");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateChannelBetween(String value1, String value2) {
            addCriterion("MSGTEMPLATE_CHANNEL between", value1, value2, "msgtemplateChannel");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateChannelNotBetween(String value1, String value2) {
            addCriterion("MSGTEMPLATE_CHANNEL not between", value1, value2, "msgtemplateChannel");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTitleIsNull() {
            addCriterion("MSGTEMPLATE_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTitleIsNotNull() {
            addCriterion("MSGTEMPLATE_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTitleEqualTo(String value) {
            addCriterion("MSGTEMPLATE_TITLE =", value, "msgtemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTitleNotEqualTo(String value) {
            addCriterion("MSGTEMPLATE_TITLE <>", value, "msgtemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTitleGreaterThan(String value) {
            addCriterion("MSGTEMPLATE_TITLE >", value, "msgtemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTitleGreaterThanOrEqualTo(String value) {
            addCriterion("MSGTEMPLATE_TITLE >=", value, "msgtemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTitleLessThan(String value) {
            addCriterion("MSGTEMPLATE_TITLE <", value, "msgtemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTitleLessThanOrEqualTo(String value) {
            addCriterion("MSGTEMPLATE_TITLE <=", value, "msgtemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTitleLike(String value) {
            addCriterion("MSGTEMPLATE_TITLE like", value, "msgtemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTitleNotLike(String value) {
            addCriterion("MSGTEMPLATE_TITLE not like", value, "msgtemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTitleIn(List<String> values) {
            addCriterion("MSGTEMPLATE_TITLE in", values, "msgtemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTitleNotIn(List<String> values) {
            addCriterion("MSGTEMPLATE_TITLE not in", values, "msgtemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTitleBetween(String value1, String value2) {
            addCriterion("MSGTEMPLATE_TITLE between", value1, value2, "msgtemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateTitleNotBetween(String value1, String value2) {
            addCriterion("MSGTEMPLATE_TITLE not between", value1, value2, "msgtemplateTitle");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateContentIsNull() {
            addCriterion("MSGTEMPLATE_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateContentIsNotNull() {
            addCriterion("MSGTEMPLATE_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateContentEqualTo(String value) {
            addCriterion("MSGTEMPLATE_CONTENT =", value, "msgtemplateContent");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateContentNotEqualTo(String value) {
            addCriterion("MSGTEMPLATE_CONTENT <>", value, "msgtemplateContent");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateContentGreaterThan(String value) {
            addCriterion("MSGTEMPLATE_CONTENT >", value, "msgtemplateContent");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateContentGreaterThanOrEqualTo(String value) {
            addCriterion("MSGTEMPLATE_CONTENT >=", value, "msgtemplateContent");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateContentLessThan(String value) {
            addCriterion("MSGTEMPLATE_CONTENT <", value, "msgtemplateContent");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateContentLessThanOrEqualTo(String value) {
            addCriterion("MSGTEMPLATE_CONTENT <=", value, "msgtemplateContent");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateContentLike(String value) {
            addCriterion("MSGTEMPLATE_CONTENT like", value, "msgtemplateContent");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateContentNotLike(String value) {
            addCriterion("MSGTEMPLATE_CONTENT not like", value, "msgtemplateContent");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateContentIn(List<String> values) {
            addCriterion("MSGTEMPLATE_CONTENT in", values, "msgtemplateContent");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateContentNotIn(List<String> values) {
            addCriterion("MSGTEMPLATE_CONTENT not in", values, "msgtemplateContent");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateContentBetween(String value1, String value2) {
            addCriterion("MSGTEMPLATE_CONTENT between", value1, value2, "msgtemplateContent");
            return (Criteria) this;
        }

        public Criteria andMsgtemplateContentNotBetween(String value1, String value2) {
            addCriterion("MSGTEMPLATE_CONTENT not between", value1, value2, "msgtemplateContent");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNull() {
            addCriterion("SORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNotNull() {
            addCriterion("SORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSortIdEqualTo(Short value) {
            addCriterion("SORT_ID =", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotEqualTo(Short value) {
            addCriterion("SORT_ID <>", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThan(Short value) {
            addCriterion("SORT_ID >", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThanOrEqualTo(Short value) {
            addCriterion("SORT_ID >=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThan(Short value) {
            addCriterion("SORT_ID <", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThanOrEqualTo(Short value) {
            addCriterion("SORT_ID <=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdIn(List<Short> values) {
            addCriterion("SORT_ID in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotIn(List<Short> values) {
            addCriterion("SORT_ID not in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdBetween(Short value1, Short value2) {
            addCriterion("SORT_ID between", value1, value2, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotBetween(Short value1, Short value2) {
            addCriterion("SORT_ID not between", value1, value2, "sortId");
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

        public Criteria andCreateCodeIsNull() {
            addCriterion("CREATE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCreateCodeIsNotNull() {
            addCriterion("CREATE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateCodeEqualTo(String value) {
            addCriterion("CREATE_CODE =", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeNotEqualTo(String value) {
            addCriterion("CREATE_CODE <>", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeGreaterThan(String value) {
            addCriterion("CREATE_CODE >", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_CODE >=", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeLessThan(String value) {
            addCriterion("CREATE_CODE <", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeLessThanOrEqualTo(String value) {
            addCriterion("CREATE_CODE <=", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeLike(String value) {
            addCriterion("CREATE_CODE like", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeNotLike(String value) {
            addCriterion("CREATE_CODE not like", value, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeIn(List<String> values) {
            addCriterion("CREATE_CODE in", values, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeNotIn(List<String> values) {
            addCriterion("CREATE_CODE not in", values, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeBetween(String value1, String value2) {
            addCriterion("CREATE_CODE between", value1, value2, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateCodeNotBetween(String value1, String value2) {
            addCriterion("CREATE_CODE not between", value1, value2, "createCode");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("CREATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("CREATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("CREATE_NAME =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("CREATE_NAME <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("CREATE_NAME >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_NAME >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("CREATE_NAME <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("CREATE_NAME <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("CREATE_NAME like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("CREATE_NAME not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("CREATE_NAME in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("CREATE_NAME not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("CREATE_NAME between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("CREATE_NAME not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
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