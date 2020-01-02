package com.slionh.patientview.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BdComDictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdComDictionaryExample() {
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

        public Criteria andDictionaryIdIsNull() {
            addCriterion("DICTIONARY_ID is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdIsNotNull() {
            addCriterion("DICTIONARY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdEqualTo(String value) {
            addCriterion("DICTIONARY_ID =", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdNotEqualTo(String value) {
            addCriterion("DICTIONARY_ID <>", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdGreaterThan(String value) {
            addCriterion("DICTIONARY_ID >", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdGreaterThanOrEqualTo(String value) {
            addCriterion("DICTIONARY_ID >=", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdLessThan(String value) {
            addCriterion("DICTIONARY_ID <", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdLessThanOrEqualTo(String value) {
            addCriterion("DICTIONARY_ID <=", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdLike(String value) {
            addCriterion("DICTIONARY_ID like", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdNotLike(String value) {
            addCriterion("DICTIONARY_ID not like", value, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdIn(List<String> values) {
            addCriterion("DICTIONARY_ID in", values, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdNotIn(List<String> values) {
            addCriterion("DICTIONARY_ID not in", values, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdBetween(String value1, String value2) {
            addCriterion("DICTIONARY_ID between", value1, value2, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryIdNotBetween(String value1, String value2) {
            addCriterion("DICTIONARY_ID not between", value1, value2, "dictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeIsNull() {
            addCriterion("DICTIONARY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeIsNotNull() {
            addCriterion("DICTIONARY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeEqualTo(String value) {
            addCriterion("DICTIONARY_TYPE =", value, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNotEqualTo(String value) {
            addCriterion("DICTIONARY_TYPE <>", value, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeGreaterThan(String value) {
            addCriterion("DICTIONARY_TYPE >", value, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DICTIONARY_TYPE >=", value, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeLessThan(String value) {
            addCriterion("DICTIONARY_TYPE <", value, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeLessThanOrEqualTo(String value) {
            addCriterion("DICTIONARY_TYPE <=", value, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeLike(String value) {
            addCriterion("DICTIONARY_TYPE like", value, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNotLike(String value) {
            addCriterion("DICTIONARY_TYPE not like", value, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeIn(List<String> values) {
            addCriterion("DICTIONARY_TYPE in", values, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNotIn(List<String> values) {
            addCriterion("DICTIONARY_TYPE not in", values, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeBetween(String value1, String value2) {
            addCriterion("DICTIONARY_TYPE between", value1, value2, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryTypeNotBetween(String value1, String value2) {
            addCriterion("DICTIONARY_TYPE not between", value1, value2, "dictionaryType");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeIsNull() {
            addCriterion("DICTIONARY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeIsNotNull() {
            addCriterion("DICTIONARY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeEqualTo(String value) {
            addCriterion("DICTIONARY_CODE =", value, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeNotEqualTo(String value) {
            addCriterion("DICTIONARY_CODE <>", value, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeGreaterThan(String value) {
            addCriterion("DICTIONARY_CODE >", value, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DICTIONARY_CODE >=", value, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeLessThan(String value) {
            addCriterion("DICTIONARY_CODE <", value, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeLessThanOrEqualTo(String value) {
            addCriterion("DICTIONARY_CODE <=", value, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeLike(String value) {
            addCriterion("DICTIONARY_CODE like", value, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeNotLike(String value) {
            addCriterion("DICTIONARY_CODE not like", value, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeIn(List<String> values) {
            addCriterion("DICTIONARY_CODE in", values, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeNotIn(List<String> values) {
            addCriterion("DICTIONARY_CODE not in", values, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeBetween(String value1, String value2) {
            addCriterion("DICTIONARY_CODE between", value1, value2, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryCodeNotBetween(String value1, String value2) {
            addCriterion("DICTIONARY_CODE not between", value1, value2, "dictionaryCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameIsNull() {
            addCriterion("DICTIONARY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameIsNotNull() {
            addCriterion("DICTIONARY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameEqualTo(String value) {
            addCriterion("DICTIONARY_NAME =", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameNotEqualTo(String value) {
            addCriterion("DICTIONARY_NAME <>", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameGreaterThan(String value) {
            addCriterion("DICTIONARY_NAME >", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameGreaterThanOrEqualTo(String value) {
            addCriterion("DICTIONARY_NAME >=", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameLessThan(String value) {
            addCriterion("DICTIONARY_NAME <", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameLessThanOrEqualTo(String value) {
            addCriterion("DICTIONARY_NAME <=", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameLike(String value) {
            addCriterion("DICTIONARY_NAME like", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameNotLike(String value) {
            addCriterion("DICTIONARY_NAME not like", value, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameIn(List<String> values) {
            addCriterion("DICTIONARY_NAME in", values, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameNotIn(List<String> values) {
            addCriterion("DICTIONARY_NAME not in", values, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameBetween(String value1, String value2) {
            addCriterion("DICTIONARY_NAME between", value1, value2, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDictionaryNameNotBetween(String value1, String value2) {
            addCriterion("DICTIONARY_NAME not between", value1, value2, "dictionaryName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andUserDefineCodeIsNull() {
            addCriterion("USER_DEFINE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andUserDefineCodeIsNotNull() {
            addCriterion("USER_DEFINE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andUserDefineCodeEqualTo(String value) {
            addCriterion("USER_DEFINE_CODE =", value, "userDefineCode");
            return (Criteria) this;
        }

        public Criteria andUserDefineCodeNotEqualTo(String value) {
            addCriterion("USER_DEFINE_CODE <>", value, "userDefineCode");
            return (Criteria) this;
        }

        public Criteria andUserDefineCodeGreaterThan(String value) {
            addCriterion("USER_DEFINE_CODE >", value, "userDefineCode");
            return (Criteria) this;
        }

        public Criteria andUserDefineCodeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE_CODE >=", value, "userDefineCode");
            return (Criteria) this;
        }

        public Criteria andUserDefineCodeLessThan(String value) {
            addCriterion("USER_DEFINE_CODE <", value, "userDefineCode");
            return (Criteria) this;
        }

        public Criteria andUserDefineCodeLessThanOrEqualTo(String value) {
            addCriterion("USER_DEFINE_CODE <=", value, "userDefineCode");
            return (Criteria) this;
        }

        public Criteria andUserDefineCodeLike(String value) {
            addCriterion("USER_DEFINE_CODE like", value, "userDefineCode");
            return (Criteria) this;
        }

        public Criteria andUserDefineCodeNotLike(String value) {
            addCriterion("USER_DEFINE_CODE not like", value, "userDefineCode");
            return (Criteria) this;
        }

        public Criteria andUserDefineCodeIn(List<String> values) {
            addCriterion("USER_DEFINE_CODE in", values, "userDefineCode");
            return (Criteria) this;
        }

        public Criteria andUserDefineCodeNotIn(List<String> values) {
            addCriterion("USER_DEFINE_CODE not in", values, "userDefineCode");
            return (Criteria) this;
        }

        public Criteria andUserDefineCodeBetween(String value1, String value2) {
            addCriterion("USER_DEFINE_CODE between", value1, value2, "userDefineCode");
            return (Criteria) this;
        }

        public Criteria andUserDefineCodeNotBetween(String value1, String value2) {
            addCriterion("USER_DEFINE_CODE not between", value1, value2, "userDefineCode");
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

        public Criteria andFivestrokeCodeIsNull() {
            addCriterion("FIVESTROKE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFivestrokeCodeIsNotNull() {
            addCriterion("FIVESTROKE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFivestrokeCodeEqualTo(String value) {
            addCriterion("FIVESTROKE_CODE =", value, "fivestrokeCode");
            return (Criteria) this;
        }

        public Criteria andFivestrokeCodeNotEqualTo(String value) {
            addCriterion("FIVESTROKE_CODE <>", value, "fivestrokeCode");
            return (Criteria) this;
        }

        public Criteria andFivestrokeCodeGreaterThan(String value) {
            addCriterion("FIVESTROKE_CODE >", value, "fivestrokeCode");
            return (Criteria) this;
        }

        public Criteria andFivestrokeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FIVESTROKE_CODE >=", value, "fivestrokeCode");
            return (Criteria) this;
        }

        public Criteria andFivestrokeCodeLessThan(String value) {
            addCriterion("FIVESTROKE_CODE <", value, "fivestrokeCode");
            return (Criteria) this;
        }

        public Criteria andFivestrokeCodeLessThanOrEqualTo(String value) {
            addCriterion("FIVESTROKE_CODE <=", value, "fivestrokeCode");
            return (Criteria) this;
        }

        public Criteria andFivestrokeCodeLike(String value) {
            addCriterion("FIVESTROKE_CODE like", value, "fivestrokeCode");
            return (Criteria) this;
        }

        public Criteria andFivestrokeCodeNotLike(String value) {
            addCriterion("FIVESTROKE_CODE not like", value, "fivestrokeCode");
            return (Criteria) this;
        }

        public Criteria andFivestrokeCodeIn(List<String> values) {
            addCriterion("FIVESTROKE_CODE in", values, "fivestrokeCode");
            return (Criteria) this;
        }

        public Criteria andFivestrokeCodeNotIn(List<String> values) {
            addCriterion("FIVESTROKE_CODE not in", values, "fivestrokeCode");
            return (Criteria) this;
        }

        public Criteria andFivestrokeCodeBetween(String value1, String value2) {
            addCriterion("FIVESTROKE_CODE between", value1, value2, "fivestrokeCode");
            return (Criteria) this;
        }

        public Criteria andFivestrokeCodeNotBetween(String value1, String value2) {
            addCriterion("FIVESTROKE_CODE not between", value1, value2, "fivestrokeCode");
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