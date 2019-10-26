package com.neu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SchedulingExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table scheduling
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table scheduling
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table scheduling
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated
     */
    public SchedulingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduling
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table scheduling
     *
     * @mbg.generated
     */
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSchedDateIsNull() {
            addCriterion("SchedDate is null");
            return (Criteria) this;
        }

        public Criteria andSchedDateIsNotNull() {
            addCriterion("SchedDate is not null");
            return (Criteria) this;
        }

        public Criteria andSchedDateEqualTo(Date value) {
            addCriterionForJDBCDate("SchedDate =", value, "schedDate");
            return (Criteria) this;
        }

        public Criteria andSchedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SchedDate <>", value, "schedDate");
            return (Criteria) this;
        }

        public Criteria andSchedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("SchedDate >", value, "schedDate");
            return (Criteria) this;
        }

        public Criteria andSchedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SchedDate >=", value, "schedDate");
            return (Criteria) this;
        }

        public Criteria andSchedDateLessThan(Date value) {
            addCriterionForJDBCDate("SchedDate <", value, "schedDate");
            return (Criteria) this;
        }

        public Criteria andSchedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SchedDate <=", value, "schedDate");
            return (Criteria) this;
        }

        public Criteria andSchedDateIn(List<Date> values) {
            addCriterionForJDBCDate("SchedDate in", values, "schedDate");
            return (Criteria) this;
        }

        public Criteria andSchedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SchedDate not in", values, "schedDate");
            return (Criteria) this;
        }

        public Criteria andSchedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SchedDate between", value1, value2, "schedDate");
            return (Criteria) this;
        }

        public Criteria andSchedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SchedDate not between", value1, value2, "schedDate");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("DeptID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DeptID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("DeptID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("DeptID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("DeptID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("DeptID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("DeptID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("DeptID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("DeptID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("DeptID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("DeptID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("DeptID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("UserID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("UserID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("UserID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("UserID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("UserID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("UserID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("UserID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("UserID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("UserID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andNoonIsNull() {
            addCriterion("Noon is null");
            return (Criteria) this;
        }

        public Criteria andNoonIsNotNull() {
            addCriterion("Noon is not null");
            return (Criteria) this;
        }

        public Criteria andNoonEqualTo(String value) {
            addCriterion("Noon =", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotEqualTo(String value) {
            addCriterion("Noon <>", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonGreaterThan(String value) {
            addCriterion("Noon >", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonGreaterThanOrEqualTo(String value) {
            addCriterion("Noon >=", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonLessThan(String value) {
            addCriterion("Noon <", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonLessThanOrEqualTo(String value) {
            addCriterion("Noon <=", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonLike(String value) {
            addCriterion("Noon like", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotLike(String value) {
            addCriterion("Noon not like", value, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonIn(List<String> values) {
            addCriterion("Noon in", values, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotIn(List<String> values) {
            addCriterion("Noon not in", values, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonBetween(String value1, String value2) {
            addCriterion("Noon between", value1, value2, "noon");
            return (Criteria) this;
        }

        public Criteria andNoonNotBetween(String value1, String value2) {
            addCriterion("Noon not between", value1, value2, "noon");
            return (Criteria) this;
        }

        public Criteria andRuleIDIsNull() {
            addCriterion("RuleID is null");
            return (Criteria) this;
        }

        public Criteria andRuleIDIsNotNull() {
            addCriterion("RuleID is not null");
            return (Criteria) this;
        }

        public Criteria andRuleIDEqualTo(Integer value) {
            addCriterion("RuleID =", value, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDNotEqualTo(Integer value) {
            addCriterion("RuleID <>", value, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDGreaterThan(Integer value) {
            addCriterion("RuleID >", value, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("RuleID >=", value, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDLessThan(Integer value) {
            addCriterion("RuleID <", value, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDLessThanOrEqualTo(Integer value) {
            addCriterion("RuleID <=", value, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDIn(List<Integer> values) {
            addCriterion("RuleID in", values, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDNotIn(List<Integer> values) {
            addCriterion("RuleID not in", values, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDBetween(Integer value1, Integer value2) {
            addCriterion("RuleID between", value1, value2, "ruleID");
            return (Criteria) this;
        }

        public Criteria andRuleIDNotBetween(Integer value1, Integer value2) {
            addCriterion("RuleID not between", value1, value2, "ruleID");
            return (Criteria) this;
        }

        public Criteria andDelMarkIsNull() {
            addCriterion("DelMark is null");
            return (Criteria) this;
        }

        public Criteria andDelMarkIsNotNull() {
            addCriterion("DelMark is not null");
            return (Criteria) this;
        }

        public Criteria andDelMarkEqualTo(Integer value) {
            addCriterion("DelMark =", value, "delMark");
            return (Criteria) this;
        }

        public Criteria andDelMarkNotEqualTo(Integer value) {
            addCriterion("DelMark <>", value, "delMark");
            return (Criteria) this;
        }

        public Criteria andDelMarkGreaterThan(Integer value) {
            addCriterion("DelMark >", value, "delMark");
            return (Criteria) this;
        }

        public Criteria andDelMarkGreaterThanOrEqualTo(Integer value) {
            addCriterion("DelMark >=", value, "delMark");
            return (Criteria) this;
        }

        public Criteria andDelMarkLessThan(Integer value) {
            addCriterion("DelMark <", value, "delMark");
            return (Criteria) this;
        }

        public Criteria andDelMarkLessThanOrEqualTo(Integer value) {
            addCriterion("DelMark <=", value, "delMark");
            return (Criteria) this;
        }

        public Criteria andDelMarkIn(List<Integer> values) {
            addCriterion("DelMark in", values, "delMark");
            return (Criteria) this;
        }

        public Criteria andDelMarkNotIn(List<Integer> values) {
            addCriterion("DelMark not in", values, "delMark");
            return (Criteria) this;
        }

        public Criteria andDelMarkBetween(Integer value1, Integer value2) {
            addCriterion("DelMark between", value1, value2, "delMark");
            return (Criteria) this;
        }

        public Criteria andDelMarkNotBetween(Integer value1, Integer value2) {
            addCriterion("DelMark not between", value1, value2, "delMark");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table scheduling
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table scheduling
     *
     * @mbg.generated
     */
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