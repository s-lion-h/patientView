package com.slionh.patientview.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BdComEmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdComEmployeeExample() {
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

        public Criteria andEmployeeIdIsNull() {
            addCriterion("EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(String value) {
            addCriterion("EMPLOYEE_ID =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(String value) {
            addCriterion("EMPLOYEE_ID >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(String value) {
            addCriterion("EMPLOYEE_ID <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_ID <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLike(String value) {
            addCriterion("EMPLOYEE_ID like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotLike(String value) {
            addCriterion("EMPLOYEE_ID not like", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<String> values) {
            addCriterion("EMPLOYEE_ID in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<String> values) {
            addCriterion("EMPLOYEE_ID not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_ID not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeIsNull() {
            addCriterion("EMPLOYEE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeIsNotNull() {
            addCriterion("EMPLOYEE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeEqualTo(String value) {
            addCriterion("EMPLOYEE_CODE =", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotEqualTo(String value) {
            addCriterion("EMPLOYEE_CODE <>", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeGreaterThan(String value) {
            addCriterion("EMPLOYEE_CODE >", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_CODE >=", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeLessThan(String value) {
            addCriterion("EMPLOYEE_CODE <", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_CODE <=", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeLike(String value) {
            addCriterion("EMPLOYEE_CODE like", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotLike(String value) {
            addCriterion("EMPLOYEE_CODE not like", value, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeIn(List<String> values) {
            addCriterion("EMPLOYEE_CODE in", values, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotIn(List<String> values) {
            addCriterion("EMPLOYEE_CODE not in", values, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_CODE between", value1, value2, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeCodeNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_CODE not between", value1, value2, "employeeCode");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNull() {
            addCriterion("EMPLOYEE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIsNotNull() {
            addCriterion("EMPLOYEE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME =", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME <>", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThan(String value) {
            addCriterion("EMPLOYEE_NAME >", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME >=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThan(String value) {
            addCriterion("EMPLOYEE_NAME <", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NAME <=", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameLike(String value) {
            addCriterion("EMPLOYEE_NAME like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotLike(String value) {
            addCriterion("EMPLOYEE_NAME not like", value, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameIn(List<String> values) {
            addCriterion("EMPLOYEE_NAME in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotIn(List<String> values) {
            addCriterion("EMPLOYEE_NAME not in", values, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NAME between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeNameNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NAME not between", value1, value2, "employeeName");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeIsNull() {
            addCriterion("EMPLOYEE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeIsNotNull() {
            addCriterion("EMPLOYEE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeEqualTo(String value) {
            addCriterion("EMPLOYEE_TYPE =", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeNotEqualTo(String value) {
            addCriterion("EMPLOYEE_TYPE <>", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeGreaterThan(String value) {
            addCriterion("EMPLOYEE_TYPE >", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_TYPE >=", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeLessThan(String value) {
            addCriterion("EMPLOYEE_TYPE <", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_TYPE <=", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeLike(String value) {
            addCriterion("EMPLOYEE_TYPE like", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeNotLike(String value) {
            addCriterion("EMPLOYEE_TYPE not like", value, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeIn(List<String> values) {
            addCriterion("EMPLOYEE_TYPE in", values, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeNotIn(List<String> values) {
            addCriterion("EMPLOYEE_TYPE not in", values, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_TYPE between", value1, value2, "employeeType");
            return (Criteria) this;
        }

        public Criteria andEmployeeTypeNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_TYPE not between", value1, value2, "employeeType");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(String value) {
            addCriterion("DEPARTMENT_ID =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(String value) {
            addCriterion("DEPARTMENT_ID <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(String value) {
            addCriterion("DEPARTMENT_ID >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_ID >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(String value) {
            addCriterion("DEPARTMENT_ID <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT_ID <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLike(String value) {
            addCriterion("DEPARTMENT_ID like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotLike(String value) {
            addCriterion("DEPARTMENT_ID not like", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<String> values) {
            addCriterion("DEPARTMENT_ID in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<String> values) {
            addCriterion("DEPARTMENT_ID not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_ID between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT_ID not between", value1, value2, "departmentId");
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

        public Criteria andLevelIdIsNull() {
            addCriterion("LEVEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNotNull() {
            addCriterion("LEVEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLevelIdEqualTo(String value) {
            addCriterion("LEVEL_ID =", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotEqualTo(String value) {
            addCriterion("LEVEL_ID <>", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThan(String value) {
            addCriterion("LEVEL_ID >", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL_ID >=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThan(String value) {
            addCriterion("LEVEL_ID <", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThanOrEqualTo(String value) {
            addCriterion("LEVEL_ID <=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLike(String value) {
            addCriterion("LEVEL_ID like", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotLike(String value) {
            addCriterion("LEVEL_ID not like", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdIn(List<String> values) {
            addCriterion("LEVEL_ID in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotIn(List<String> values) {
            addCriterion("LEVEL_ID not in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdBetween(String value1, String value2) {
            addCriterion("LEVEL_ID between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotBetween(String value1, String value2) {
            addCriterion("LEVEL_ID not between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNull() {
            addCriterion("POST_ID is null");
            return (Criteria) this;
        }

        public Criteria andPostIdIsNotNull() {
            addCriterion("POST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPostIdEqualTo(String value) {
            addCriterion("POST_ID =", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotEqualTo(String value) {
            addCriterion("POST_ID <>", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThan(String value) {
            addCriterion("POST_ID >", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdGreaterThanOrEqualTo(String value) {
            addCriterion("POST_ID >=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThan(String value) {
            addCriterion("POST_ID <", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLessThanOrEqualTo(String value) {
            addCriterion("POST_ID <=", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdLike(String value) {
            addCriterion("POST_ID like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotLike(String value) {
            addCriterion("POST_ID not like", value, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdIn(List<String> values) {
            addCriterion("POST_ID in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotIn(List<String> values) {
            addCriterion("POST_ID not in", values, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdBetween(String value1, String value2) {
            addCriterion("POST_ID between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andPostIdNotBetween(String value1, String value2) {
            addCriterion("POST_ID not between", value1, value2, "postId");
            return (Criteria) this;
        }

        public Criteria andNurseCellIdIsNull() {
            addCriterion("NURSE_CELL_ID is null");
            return (Criteria) this;
        }

        public Criteria andNurseCellIdIsNotNull() {
            addCriterion("NURSE_CELL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNurseCellIdEqualTo(String value) {
            addCriterion("NURSE_CELL_ID =", value, "nurseCellId");
            return (Criteria) this;
        }

        public Criteria andNurseCellIdNotEqualTo(String value) {
            addCriterion("NURSE_CELL_ID <>", value, "nurseCellId");
            return (Criteria) this;
        }

        public Criteria andNurseCellIdGreaterThan(String value) {
            addCriterion("NURSE_CELL_ID >", value, "nurseCellId");
            return (Criteria) this;
        }

        public Criteria andNurseCellIdGreaterThanOrEqualTo(String value) {
            addCriterion("NURSE_CELL_ID >=", value, "nurseCellId");
            return (Criteria) this;
        }

        public Criteria andNurseCellIdLessThan(String value) {
            addCriterion("NURSE_CELL_ID <", value, "nurseCellId");
            return (Criteria) this;
        }

        public Criteria andNurseCellIdLessThanOrEqualTo(String value) {
            addCriterion("NURSE_CELL_ID <=", value, "nurseCellId");
            return (Criteria) this;
        }

        public Criteria andNurseCellIdLike(String value) {
            addCriterion("NURSE_CELL_ID like", value, "nurseCellId");
            return (Criteria) this;
        }

        public Criteria andNurseCellIdNotLike(String value) {
            addCriterion("NURSE_CELL_ID not like", value, "nurseCellId");
            return (Criteria) this;
        }

        public Criteria andNurseCellIdIn(List<String> values) {
            addCriterion("NURSE_CELL_ID in", values, "nurseCellId");
            return (Criteria) this;
        }

        public Criteria andNurseCellIdNotIn(List<String> values) {
            addCriterion("NURSE_CELL_ID not in", values, "nurseCellId");
            return (Criteria) this;
        }

        public Criteria andNurseCellIdBetween(String value1, String value2) {
            addCriterion("NURSE_CELL_ID between", value1, value2, "nurseCellId");
            return (Criteria) this;
        }

        public Criteria andNurseCellIdNotBetween(String value1, String value2) {
            addCriterion("NURSE_CELL_ID not between", value1, value2, "nurseCellId");
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

        public Criteria andInterfaceCodeIsNull() {
            addCriterion("INTERFACE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeIsNotNull() {
            addCriterion("INTERFACE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeEqualTo(String value) {
            addCriterion("INTERFACE_CODE =", value, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeNotEqualTo(String value) {
            addCriterion("INTERFACE_CODE <>", value, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeGreaterThan(String value) {
            addCriterion("INTERFACE_CODE >", value, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INTERFACE_CODE >=", value, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeLessThan(String value) {
            addCriterion("INTERFACE_CODE <", value, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeLessThanOrEqualTo(String value) {
            addCriterion("INTERFACE_CODE <=", value, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeLike(String value) {
            addCriterion("INTERFACE_CODE like", value, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeNotLike(String value) {
            addCriterion("INTERFACE_CODE not like", value, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeIn(List<String> values) {
            addCriterion("INTERFACE_CODE in", values, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeNotIn(List<String> values) {
            addCriterion("INTERFACE_CODE not in", values, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeBetween(String value1, String value2) {
            addCriterion("INTERFACE_CODE between", value1, value2, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andInterfaceCodeNotBetween(String value1, String value2) {
            addCriterion("INTERFACE_CODE not between", value1, value2, "interfaceCode");
            return (Criteria) this;
        }

        public Criteria andTemporaryRegistrationIsNull() {
            addCriterion("TEMPORARY_REGISTRATION is null");
            return (Criteria) this;
        }

        public Criteria andTemporaryRegistrationIsNotNull() {
            addCriterion("TEMPORARY_REGISTRATION is not null");
            return (Criteria) this;
        }

        public Criteria andTemporaryRegistrationEqualTo(String value) {
            addCriterion("TEMPORARY_REGISTRATION =", value, "temporaryRegistration");
            return (Criteria) this;
        }

        public Criteria andTemporaryRegistrationNotEqualTo(String value) {
            addCriterion("TEMPORARY_REGISTRATION <>", value, "temporaryRegistration");
            return (Criteria) this;
        }

        public Criteria andTemporaryRegistrationGreaterThan(String value) {
            addCriterion("TEMPORARY_REGISTRATION >", value, "temporaryRegistration");
            return (Criteria) this;
        }

        public Criteria andTemporaryRegistrationGreaterThanOrEqualTo(String value) {
            addCriterion("TEMPORARY_REGISTRATION >=", value, "temporaryRegistration");
            return (Criteria) this;
        }

        public Criteria andTemporaryRegistrationLessThan(String value) {
            addCriterion("TEMPORARY_REGISTRATION <", value, "temporaryRegistration");
            return (Criteria) this;
        }

        public Criteria andTemporaryRegistrationLessThanOrEqualTo(String value) {
            addCriterion("TEMPORARY_REGISTRATION <=", value, "temporaryRegistration");
            return (Criteria) this;
        }

        public Criteria andTemporaryRegistrationLike(String value) {
            addCriterion("TEMPORARY_REGISTRATION like", value, "temporaryRegistration");
            return (Criteria) this;
        }

        public Criteria andTemporaryRegistrationNotLike(String value) {
            addCriterion("TEMPORARY_REGISTRATION not like", value, "temporaryRegistration");
            return (Criteria) this;
        }

        public Criteria andTemporaryRegistrationIn(List<String> values) {
            addCriterion("TEMPORARY_REGISTRATION in", values, "temporaryRegistration");
            return (Criteria) this;
        }

        public Criteria andTemporaryRegistrationNotIn(List<String> values) {
            addCriterion("TEMPORARY_REGISTRATION not in", values, "temporaryRegistration");
            return (Criteria) this;
        }

        public Criteria andTemporaryRegistrationBetween(String value1, String value2) {
            addCriterion("TEMPORARY_REGISTRATION between", value1, value2, "temporaryRegistration");
            return (Criteria) this;
        }

        public Criteria andTemporaryRegistrationNotBetween(String value1, String value2) {
            addCriterion("TEMPORARY_REGISTRATION not between", value1, value2, "temporaryRegistration");
            return (Criteria) this;
        }

        public Criteria andRegistrationpLevelPermissionIsNull() {
            addCriterion("REGISTRATIONP_LEVEL_PERMISSION is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationpLevelPermissionIsNotNull() {
            addCriterion("REGISTRATIONP_LEVEL_PERMISSION is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationpLevelPermissionEqualTo(String value) {
            addCriterion("REGISTRATIONP_LEVEL_PERMISSION =", value, "registrationpLevelPermission");
            return (Criteria) this;
        }

        public Criteria andRegistrationpLevelPermissionNotEqualTo(String value) {
            addCriterion("REGISTRATIONP_LEVEL_PERMISSION <>", value, "registrationpLevelPermission");
            return (Criteria) this;
        }

        public Criteria andRegistrationpLevelPermissionGreaterThan(String value) {
            addCriterion("REGISTRATIONP_LEVEL_PERMISSION >", value, "registrationpLevelPermission");
            return (Criteria) this;
        }

        public Criteria andRegistrationpLevelPermissionGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTRATIONP_LEVEL_PERMISSION >=", value, "registrationpLevelPermission");
            return (Criteria) this;
        }

        public Criteria andRegistrationpLevelPermissionLessThan(String value) {
            addCriterion("REGISTRATIONP_LEVEL_PERMISSION <", value, "registrationpLevelPermission");
            return (Criteria) this;
        }

        public Criteria andRegistrationpLevelPermissionLessThanOrEqualTo(String value) {
            addCriterion("REGISTRATIONP_LEVEL_PERMISSION <=", value, "registrationpLevelPermission");
            return (Criteria) this;
        }

        public Criteria andRegistrationpLevelPermissionLike(String value) {
            addCriterion("REGISTRATIONP_LEVEL_PERMISSION like", value, "registrationpLevelPermission");
            return (Criteria) this;
        }

        public Criteria andRegistrationpLevelPermissionNotLike(String value) {
            addCriterion("REGISTRATIONP_LEVEL_PERMISSION not like", value, "registrationpLevelPermission");
            return (Criteria) this;
        }

        public Criteria andRegistrationpLevelPermissionIn(List<String> values) {
            addCriterion("REGISTRATIONP_LEVEL_PERMISSION in", values, "registrationpLevelPermission");
            return (Criteria) this;
        }

        public Criteria andRegistrationpLevelPermissionNotIn(List<String> values) {
            addCriterion("REGISTRATIONP_LEVEL_PERMISSION not in", values, "registrationpLevelPermission");
            return (Criteria) this;
        }

        public Criteria andRegistrationpLevelPermissionBetween(String value1, String value2) {
            addCriterion("REGISTRATIONP_LEVEL_PERMISSION between", value1, value2, "registrationpLevelPermission");
            return (Criteria) this;
        }

        public Criteria andRegistrationpLevelPermissionNotBetween(String value1, String value2) {
            addCriterion("REGISTRATIONP_LEVEL_PERMISSION not between", value1, value2, "registrationpLevelPermission");
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