package com.etong.exchange.preposition.entity.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MedicalReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicalReportExample() {
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

    /**
     * 体检报告
     * 
     * @date 2018-11-13
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andExamNoIsNull() {
            addCriterion("EXAM_NO is null");
            return (Criteria) this;
        }

        public Criteria andExamNoIsNotNull() {
            addCriterion("EXAM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andExamNoEqualTo(String value) {
            addCriterion("EXAM_NO =", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoNotEqualTo(String value) {
            addCriterion("EXAM_NO <>", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoGreaterThan(String value) {
            addCriterion("EXAM_NO >", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_NO >=", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoLessThan(String value) {
            addCriterion("EXAM_NO <", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoLessThanOrEqualTo(String value) {
            addCriterion("EXAM_NO <=", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoLike(String value) {
            addCriterion("EXAM_NO like", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoNotLike(String value) {
            addCriterion("EXAM_NO not like", value, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoIn(List<String> values) {
            addCriterion("EXAM_NO in", values, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoNotIn(List<String> values) {
            addCriterion("EXAM_NO not in", values, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoBetween(String value1, String value2) {
            addCriterion("EXAM_NO between", value1, value2, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamNoNotBetween(String value1, String value2) {
            addCriterion("EXAM_NO not between", value1, value2, "examNo");
            return (Criteria) this;
        }

        public Criteria andExamDateIsNull() {
            addCriterion("EXAM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExamDateIsNotNull() {
            addCriterion("EXAM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExamDateEqualTo(String value) {
            addCriterion("EXAM_DATE =", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotEqualTo(String value) {
            addCriterion("EXAM_DATE <>", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateGreaterThan(String value) {
            addCriterion("EXAM_DATE >", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_DATE >=", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateLessThan(String value) {
            addCriterion("EXAM_DATE <", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateLessThanOrEqualTo(String value) {
            addCriterion("EXAM_DATE <=", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateLike(String value) {
            addCriterion("EXAM_DATE like", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotLike(String value) {
            addCriterion("EXAM_DATE not like", value, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateIn(List<String> values) {
            addCriterion("EXAM_DATE in", values, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotIn(List<String> values) {
            addCriterion("EXAM_DATE not in", values, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateBetween(String value1, String value2) {
            addCriterion("EXAM_DATE between", value1, value2, "examDate");
            return (Criteria) this;
        }

        public Criteria andExamDateNotBetween(String value1, String value2) {
            addCriterion("EXAM_DATE not between", value1, value2, "examDate");
            return (Criteria) this;
        }

        public Criteria andReportNoIsNull() {
            addCriterion("REPORT_NO is null");
            return (Criteria) this;
        }

        public Criteria andReportNoIsNotNull() {
            addCriterion("REPORT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andReportNoEqualTo(String value) {
            addCriterion("REPORT_NO =", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotEqualTo(String value) {
            addCriterion("REPORT_NO <>", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoGreaterThan(String value) {
            addCriterion("REPORT_NO >", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_NO >=", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoLessThan(String value) {
            addCriterion("REPORT_NO <", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoLessThanOrEqualTo(String value) {
            addCriterion("REPORT_NO <=", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoLike(String value) {
            addCriterion("REPORT_NO like", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotLike(String value) {
            addCriterion("REPORT_NO not like", value, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoIn(List<String> values) {
            addCriterion("REPORT_NO in", values, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotIn(List<String> values) {
            addCriterion("REPORT_NO not in", values, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoBetween(String value1, String value2) {
            addCriterion("REPORT_NO between", value1, value2, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportNoNotBetween(String value1, String value2) {
            addCriterion("REPORT_NO not between", value1, value2, "reportNo");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNull() {
            addCriterion("REPORT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReportTimeIsNotNull() {
            addCriterion("REPORT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReportTimeEqualTo(String value) {
            addCriterion("REPORT_TIME =", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotEqualTo(String value) {
            addCriterion("REPORT_TIME <>", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThan(String value) {
            addCriterion("REPORT_TIME >", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_TIME >=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThan(String value) {
            addCriterion("REPORT_TIME <", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLessThanOrEqualTo(String value) {
            addCriterion("REPORT_TIME <=", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeLike(String value) {
            addCriterion("REPORT_TIME like", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotLike(String value) {
            addCriterion("REPORT_TIME not like", value, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeIn(List<String> values) {
            addCriterion("REPORT_TIME in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotIn(List<String> values) {
            addCriterion("REPORT_TIME not in", values, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeBetween(String value1, String value2) {
            addCriterion("REPORT_TIME between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andReportTimeNotBetween(String value1, String value2) {
            addCriterion("REPORT_TIME not between", value1, value2, "reportTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNull() {
            addCriterion("VERIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIsNotNull() {
            addCriterion("VERIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeEqualTo(String value) {
            addCriterion("VERIFY_TIME =", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotEqualTo(String value) {
            addCriterion("VERIFY_TIME <>", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThan(String value) {
            addCriterion("VERIFY_TIME >", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFY_TIME >=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThan(String value) {
            addCriterion("VERIFY_TIME <", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLessThanOrEqualTo(String value) {
            addCriterion("VERIFY_TIME <=", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeLike(String value) {
            addCriterion("VERIFY_TIME like", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotLike(String value) {
            addCriterion("VERIFY_TIME not like", value, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeIn(List<String> values) {
            addCriterion("VERIFY_TIME in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotIn(List<String> values) {
            addCriterion("VERIFY_TIME not in", values, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeBetween(String value1, String value2) {
            addCriterion("VERIFY_TIME between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andVerifyTimeNotBetween(String value1, String value2) {
            addCriterion("VERIFY_TIME not between", value1, value2, "verifyTime");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIsNull() {
            addCriterion("IDENTITY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIsNotNull() {
            addCriterion("IDENTITY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeEqualTo(Integer value) {
            addCriterion("IDENTITY_TYPE =", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotEqualTo(Integer value) {
            addCriterion("IDENTITY_TYPE <>", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeGreaterThan(Integer value) {
            addCriterion("IDENTITY_TYPE >", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("IDENTITY_TYPE >=", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeLessThan(Integer value) {
            addCriterion("IDENTITY_TYPE <", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeLessThanOrEqualTo(Integer value) {
            addCriterion("IDENTITY_TYPE <=", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIn(List<Integer> values) {
            addCriterion("IDENTITY_TYPE in", values, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotIn(List<Integer> values) {
            addCriterion("IDENTITY_TYPE not in", values, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeBetween(Integer value1, Integer value2) {
            addCriterion("IDENTITY_TYPE between", value1, value2, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("IDENTITY_TYPE not between", value1, value2, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNull() {
            addCriterion("IDENTITY is null");
            return (Criteria) this;
        }

        public Criteria andIdentityIsNotNull() {
            addCriterion("IDENTITY is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEqualTo(String value) {
            addCriterion("IDENTITY =", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotEqualTo(String value) {
            addCriterion("IDENTITY <>", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThan(String value) {
            addCriterion("IDENTITY >", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTITY >=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThan(String value) {
            addCriterion("IDENTITY <", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLessThanOrEqualTo(String value) {
            addCriterion("IDENTITY <=", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityLike(String value) {
            addCriterion("IDENTITY like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotLike(String value) {
            addCriterion("IDENTITY not like", value, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityIn(List<String> values) {
            addCriterion("IDENTITY in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotIn(List<String> values) {
            addCriterion("IDENTITY not in", values, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityBetween(String value1, String value2) {
            addCriterion("IDENTITY between", value1, value2, "identity");
            return (Criteria) this;
        }

        public Criteria andIdentityNotBetween(String value1, String value2) {
            addCriterion("IDENTITY not between", value1, value2, "identity");
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

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("AGE like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("AGE not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNull() {
            addCriterion("BIRTH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNotNull() {
            addCriterion("BIRTH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBirthDateEqualTo(String value) {
            addCriterion("BIRTH_DATE =", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotEqualTo(String value) {
            addCriterion("BIRTH_DATE <>", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThan(String value) {
            addCriterion("BIRTH_DATE >", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTH_DATE >=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThan(String value) {
            addCriterion("BIRTH_DATE <", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThanOrEqualTo(String value) {
            addCriterion("BIRTH_DATE <=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLike(String value) {
            addCriterion("BIRTH_DATE like", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotLike(String value) {
            addCriterion("BIRTH_DATE not like", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateIn(List<String> values) {
            addCriterion("BIRTH_DATE in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotIn(List<String> values) {
            addCriterion("BIRTH_DATE not in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateBetween(String value1, String value2) {
            addCriterion("BIRTH_DATE between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotBetween(String value1, String value2) {
            addCriterion("BIRTH_DATE not between", value1, value2, "birthDate");
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

        public Criteria andChiefDoctorCodeIsNull() {
            addCriterion("CHIEF_DOCTOR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorCodeIsNotNull() {
            addCriterion("CHIEF_DOCTOR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorCodeEqualTo(String value) {
            addCriterion("CHIEF_DOCTOR_CODE =", value, "chiefDoctorCode");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorCodeNotEqualTo(String value) {
            addCriterion("CHIEF_DOCTOR_CODE <>", value, "chiefDoctorCode");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorCodeGreaterThan(String value) {
            addCriterion("CHIEF_DOCTOR_CODE >", value, "chiefDoctorCode");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHIEF_DOCTOR_CODE >=", value, "chiefDoctorCode");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorCodeLessThan(String value) {
            addCriterion("CHIEF_DOCTOR_CODE <", value, "chiefDoctorCode");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorCodeLessThanOrEqualTo(String value) {
            addCriterion("CHIEF_DOCTOR_CODE <=", value, "chiefDoctorCode");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorCodeLike(String value) {
            addCriterion("CHIEF_DOCTOR_CODE like", value, "chiefDoctorCode");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorCodeNotLike(String value) {
            addCriterion("CHIEF_DOCTOR_CODE not like", value, "chiefDoctorCode");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorCodeIn(List<String> values) {
            addCriterion("CHIEF_DOCTOR_CODE in", values, "chiefDoctorCode");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorCodeNotIn(List<String> values) {
            addCriterion("CHIEF_DOCTOR_CODE not in", values, "chiefDoctorCode");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorCodeBetween(String value1, String value2) {
            addCriterion("CHIEF_DOCTOR_CODE between", value1, value2, "chiefDoctorCode");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorCodeNotBetween(String value1, String value2) {
            addCriterion("CHIEF_DOCTOR_CODE not between", value1, value2, "chiefDoctorCode");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorNameIsNull() {
            addCriterion("CHIEF_DOCTOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorNameIsNotNull() {
            addCriterion("CHIEF_DOCTOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorNameEqualTo(String value) {
            addCriterion("CHIEF_DOCTOR_NAME =", value, "chiefDoctorName");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorNameNotEqualTo(String value) {
            addCriterion("CHIEF_DOCTOR_NAME <>", value, "chiefDoctorName");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorNameGreaterThan(String value) {
            addCriterion("CHIEF_DOCTOR_NAME >", value, "chiefDoctorName");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHIEF_DOCTOR_NAME >=", value, "chiefDoctorName");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorNameLessThan(String value) {
            addCriterion("CHIEF_DOCTOR_NAME <", value, "chiefDoctorName");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("CHIEF_DOCTOR_NAME <=", value, "chiefDoctorName");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorNameLike(String value) {
            addCriterion("CHIEF_DOCTOR_NAME like", value, "chiefDoctorName");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorNameNotLike(String value) {
            addCriterion("CHIEF_DOCTOR_NAME not like", value, "chiefDoctorName");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorNameIn(List<String> values) {
            addCriterion("CHIEF_DOCTOR_NAME in", values, "chiefDoctorName");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorNameNotIn(List<String> values) {
            addCriterion("CHIEF_DOCTOR_NAME not in", values, "chiefDoctorName");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorNameBetween(String value1, String value2) {
            addCriterion("CHIEF_DOCTOR_NAME between", value1, value2, "chiefDoctorName");
            return (Criteria) this;
        }

        public Criteria andChiefDoctorNameNotBetween(String value1, String value2) {
            addCriterion("CHIEF_DOCTOR_NAME not between", value1, value2, "chiefDoctorName");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorCodeIsNull() {
            addCriterion("VERIFY_DOCTOR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorCodeIsNotNull() {
            addCriterion("VERIFY_DOCTOR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorCodeEqualTo(String value) {
            addCriterion("VERIFY_DOCTOR_CODE =", value, "verifyDoctorCode");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorCodeNotEqualTo(String value) {
            addCriterion("VERIFY_DOCTOR_CODE <>", value, "verifyDoctorCode");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorCodeGreaterThan(String value) {
            addCriterion("VERIFY_DOCTOR_CODE >", value, "verifyDoctorCode");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFY_DOCTOR_CODE >=", value, "verifyDoctorCode");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorCodeLessThan(String value) {
            addCriterion("VERIFY_DOCTOR_CODE <", value, "verifyDoctorCode");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorCodeLessThanOrEqualTo(String value) {
            addCriterion("VERIFY_DOCTOR_CODE <=", value, "verifyDoctorCode");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorCodeLike(String value) {
            addCriterion("VERIFY_DOCTOR_CODE like", value, "verifyDoctorCode");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorCodeNotLike(String value) {
            addCriterion("VERIFY_DOCTOR_CODE not like", value, "verifyDoctorCode");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorCodeIn(List<String> values) {
            addCriterion("VERIFY_DOCTOR_CODE in", values, "verifyDoctorCode");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorCodeNotIn(List<String> values) {
            addCriterion("VERIFY_DOCTOR_CODE not in", values, "verifyDoctorCode");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorCodeBetween(String value1, String value2) {
            addCriterion("VERIFY_DOCTOR_CODE between", value1, value2, "verifyDoctorCode");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorCodeNotBetween(String value1, String value2) {
            addCriterion("VERIFY_DOCTOR_CODE not between", value1, value2, "verifyDoctorCode");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorNameIsNull() {
            addCriterion("VERIFY_DOCTOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorNameIsNotNull() {
            addCriterion("VERIFY_DOCTOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorNameEqualTo(String value) {
            addCriterion("VERIFY_DOCTOR_NAME =", value, "verifyDoctorName");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorNameNotEqualTo(String value) {
            addCriterion("VERIFY_DOCTOR_NAME <>", value, "verifyDoctorName");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorNameGreaterThan(String value) {
            addCriterion("VERIFY_DOCTOR_NAME >", value, "verifyDoctorName");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFY_DOCTOR_NAME >=", value, "verifyDoctorName");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorNameLessThan(String value) {
            addCriterion("VERIFY_DOCTOR_NAME <", value, "verifyDoctorName");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("VERIFY_DOCTOR_NAME <=", value, "verifyDoctorName");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorNameLike(String value) {
            addCriterion("VERIFY_DOCTOR_NAME like", value, "verifyDoctorName");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorNameNotLike(String value) {
            addCriterion("VERIFY_DOCTOR_NAME not like", value, "verifyDoctorName");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorNameIn(List<String> values) {
            addCriterion("VERIFY_DOCTOR_NAME in", values, "verifyDoctorName");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorNameNotIn(List<String> values) {
            addCriterion("VERIFY_DOCTOR_NAME not in", values, "verifyDoctorName");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorNameBetween(String value1, String value2) {
            addCriterion("VERIFY_DOCTOR_NAME between", value1, value2, "verifyDoctorName");
            return (Criteria) this;
        }

        public Criteria andVerifyDoctorNameNotBetween(String value1, String value2) {
            addCriterion("VERIFY_DOCTOR_NAME not between", value1, value2, "verifyDoctorName");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNull() {
            addCriterion("SUMMARY is null");
            return (Criteria) this;
        }

        public Criteria andSummaryIsNotNull() {
            addCriterion("SUMMARY is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryEqualTo(String value) {
            addCriterion("SUMMARY =", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotEqualTo(String value) {
            addCriterion("SUMMARY <>", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThan(String value) {
            addCriterion("SUMMARY >", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryGreaterThanOrEqualTo(String value) {
            addCriterion("SUMMARY >=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThan(String value) {
            addCriterion("SUMMARY <", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLessThanOrEqualTo(String value) {
            addCriterion("SUMMARY <=", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryLike(String value) {
            addCriterion("SUMMARY like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotLike(String value) {
            addCriterion("SUMMARY not like", value, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryIn(List<String> values) {
            addCriterion("SUMMARY in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotIn(List<String> values) {
            addCriterion("SUMMARY not in", values, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryBetween(String value1, String value2) {
            addCriterion("SUMMARY between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSummaryNotBetween(String value1, String value2) {
            addCriterion("SUMMARY not between", value1, value2, "summary");
            return (Criteria) this;
        }

        public Criteria andSuggestionIsNull() {
            addCriterion("SUGGESTION is null");
            return (Criteria) this;
        }

        public Criteria andSuggestionIsNotNull() {
            addCriterion("SUGGESTION is not null");
            return (Criteria) this;
        }

        public Criteria andSuggestionEqualTo(String value) {
            addCriterion("SUGGESTION =", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionNotEqualTo(String value) {
            addCriterion("SUGGESTION <>", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionGreaterThan(String value) {
            addCriterion("SUGGESTION >", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionGreaterThanOrEqualTo(String value) {
            addCriterion("SUGGESTION >=", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionLessThan(String value) {
            addCriterion("SUGGESTION <", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionLessThanOrEqualTo(String value) {
            addCriterion("SUGGESTION <=", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionLike(String value) {
            addCriterion("SUGGESTION like", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionNotLike(String value) {
            addCriterion("SUGGESTION not like", value, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionIn(List<String> values) {
            addCriterion("SUGGESTION in", values, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionNotIn(List<String> values) {
            addCriterion("SUGGESTION not in", values, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionBetween(String value1, String value2) {
            addCriterion("SUGGESTION between", value1, value2, "suggestion");
            return (Criteria) this;
        }

        public Criteria andSuggestionNotBetween(String value1, String value2) {
            addCriterion("SUGGESTION not between", value1, value2, "suggestion");
            return (Criteria) this;
        }

        public Criteria andConclusionIsNull() {
            addCriterion("CONCLUSION is null");
            return (Criteria) this;
        }

        public Criteria andConclusionIsNotNull() {
            addCriterion("CONCLUSION is not null");
            return (Criteria) this;
        }

        public Criteria andConclusionEqualTo(String value) {
            addCriterion("CONCLUSION =", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotEqualTo(String value) {
            addCriterion("CONCLUSION <>", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionGreaterThan(String value) {
            addCriterion("CONCLUSION >", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionGreaterThanOrEqualTo(String value) {
            addCriterion("CONCLUSION >=", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLessThan(String value) {
            addCriterion("CONCLUSION <", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLessThanOrEqualTo(String value) {
            addCriterion("CONCLUSION <=", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLike(String value) {
            addCriterion("CONCLUSION like", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotLike(String value) {
            addCriterion("CONCLUSION not like", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionIn(List<String> values) {
            addCriterion("CONCLUSION in", values, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotIn(List<String> values) {
            addCriterion("CONCLUSION not in", values, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionBetween(String value1, String value2) {
            addCriterion("CONCLUSION between", value1, value2, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotBetween(String value1, String value2) {
            addCriterion("CONCLUSION not between", value1, value2, "conclusion");
            return (Criteria) this;
        }

        public Criteria andPackageCodeIsNull() {
            addCriterion("PACKAGE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPackageCodeIsNotNull() {
            addCriterion("PACKAGE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPackageCodeEqualTo(String value) {
            addCriterion("PACKAGE_CODE =", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeNotEqualTo(String value) {
            addCriterion("PACKAGE_CODE <>", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeGreaterThan(String value) {
            addCriterion("PACKAGE_CODE >", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PACKAGE_CODE >=", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeLessThan(String value) {
            addCriterion("PACKAGE_CODE <", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeLessThanOrEqualTo(String value) {
            addCriterion("PACKAGE_CODE <=", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeLike(String value) {
            addCriterion("PACKAGE_CODE like", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeNotLike(String value) {
            addCriterion("PACKAGE_CODE not like", value, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeIn(List<String> values) {
            addCriterion("PACKAGE_CODE in", values, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeNotIn(List<String> values) {
            addCriterion("PACKAGE_CODE not in", values, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeBetween(String value1, String value2) {
            addCriterion("PACKAGE_CODE between", value1, value2, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageCodeNotBetween(String value1, String value2) {
            addCriterion("PACKAGE_CODE not between", value1, value2, "packageCode");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNull() {
            addCriterion("PACKAGE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNotNull() {
            addCriterion("PACKAGE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNameEqualTo(String value) {
            addCriterion("PACKAGE_NAME =", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotEqualTo(String value) {
            addCriterion("PACKAGE_NAME <>", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThan(String value) {
            addCriterion("PACKAGE_NAME >", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("PACKAGE_NAME >=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThan(String value) {
            addCriterion("PACKAGE_NAME <", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThanOrEqualTo(String value) {
            addCriterion("PACKAGE_NAME <=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLike(String value) {
            addCriterion("PACKAGE_NAME like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotLike(String value) {
            addCriterion("PACKAGE_NAME not like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameIn(List<String> values) {
            addCriterion("PACKAGE_NAME in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotIn(List<String> values) {
            addCriterion("PACKAGE_NAME not in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameBetween(String value1, String value2) {
            addCriterion("PACKAGE_NAME between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotBetween(String value1, String value2) {
            addCriterion("PACKAGE_NAME not between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andItemsIsNull() {
            addCriterion("ITEMS is null");
            return (Criteria) this;
        }

        public Criteria andItemsIsNotNull() {
            addCriterion("ITEMS is not null");
            return (Criteria) this;
        }

        public Criteria andItemsEqualTo(String value) {
            addCriterion("ITEMS =", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotEqualTo(String value) {
            addCriterion("ITEMS <>", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsGreaterThan(String value) {
            addCriterion("ITEMS >", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMS >=", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsLessThan(String value) {
            addCriterion("ITEMS <", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsLessThanOrEqualTo(String value) {
            addCriterion("ITEMS <=", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsLike(String value) {
            addCriterion("ITEMS like", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotLike(String value) {
            addCriterion("ITEMS not like", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsIn(List<String> values) {
            addCriterion("ITEMS in", values, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotIn(List<String> values) {
            addCriterion("ITEMS not in", values, "items");
            return (Criteria) this;
        }

        public Criteria andItemsBetween(String value1, String value2) {
            addCriterion("ITEMS between", value1, value2, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotBetween(String value1, String value2) {
            addCriterion("ITEMS not between", value1, value2, "items");
            return (Criteria) this;
        }

        public Criteria andInstitutionCodeIsNull() {
            addCriterion("INSTITUTION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionCodeIsNotNull() {
            addCriterion("INSTITUTION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionCodeEqualTo(String value) {
            addCriterion("INSTITUTION_CODE =", value, "institutionCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionCodeNotEqualTo(String value) {
            addCriterion("INSTITUTION_CODE <>", value, "institutionCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionCodeGreaterThan(String value) {
            addCriterion("INSTITUTION_CODE >", value, "institutionCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INSTITUTION_CODE >=", value, "institutionCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionCodeLessThan(String value) {
            addCriterion("INSTITUTION_CODE <", value, "institutionCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionCodeLessThanOrEqualTo(String value) {
            addCriterion("INSTITUTION_CODE <=", value, "institutionCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionCodeLike(String value) {
            addCriterion("INSTITUTION_CODE like", value, "institutionCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionCodeNotLike(String value) {
            addCriterion("INSTITUTION_CODE not like", value, "institutionCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionCodeIn(List<String> values) {
            addCriterion("INSTITUTION_CODE in", values, "institutionCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionCodeNotIn(List<String> values) {
            addCriterion("INSTITUTION_CODE not in", values, "institutionCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionCodeBetween(String value1, String value2) {
            addCriterion("INSTITUTION_CODE between", value1, value2, "institutionCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionCodeNotBetween(String value1, String value2) {
            addCriterion("INSTITUTION_CODE not between", value1, value2, "institutionCode");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andGetReportDateIsNull() {
            addCriterion("GET_REPORT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andGetReportDateIsNotNull() {
            addCriterion("GET_REPORT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andGetReportDateEqualTo(Date value) {
            addCriterionForJDBCDate("GET_REPORT_DATE =", value, "getReportDate");
            return (Criteria) this;
        }

        public Criteria andGetReportDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("GET_REPORT_DATE <>", value, "getReportDate");
            return (Criteria) this;
        }

        public Criteria andGetReportDateGreaterThan(Date value) {
            addCriterionForJDBCDate("GET_REPORT_DATE >", value, "getReportDate");
            return (Criteria) this;
        }

        public Criteria andGetReportDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GET_REPORT_DATE >=", value, "getReportDate");
            return (Criteria) this;
        }

        public Criteria andGetReportDateLessThan(Date value) {
            addCriterionForJDBCDate("GET_REPORT_DATE <", value, "getReportDate");
            return (Criteria) this;
        }

        public Criteria andGetReportDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("GET_REPORT_DATE <=", value, "getReportDate");
            return (Criteria) this;
        }

        public Criteria andGetReportDateIn(List<Date> values) {
            addCriterionForJDBCDate("GET_REPORT_DATE in", values, "getReportDate");
            return (Criteria) this;
        }

        public Criteria andGetReportDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("GET_REPORT_DATE not in", values, "getReportDate");
            return (Criteria) this;
        }

        public Criteria andGetReportDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GET_REPORT_DATE between", value1, value2, "getReportDate");
            return (Criteria) this;
        }

        public Criteria andGetReportDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("GET_REPORT_DATE not between", value1, value2, "getReportDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andHealthPrescriptionIsNull() {
            addCriterion("health_prescription is null");
            return (Criteria) this;
        }

        public Criteria andHealthPrescriptionIsNotNull() {
            addCriterion("health_prescription is not null");
            return (Criteria) this;
        }

        public Criteria andHealthPrescriptionEqualTo(String value) {
            addCriterion("health_prescription =", value, "healthPrescription");
            return (Criteria) this;
        }

        public Criteria andHealthPrescriptionNotEqualTo(String value) {
            addCriterion("health_prescription <>", value, "healthPrescription");
            return (Criteria) this;
        }

        public Criteria andHealthPrescriptionGreaterThan(String value) {
            addCriterion("health_prescription >", value, "healthPrescription");
            return (Criteria) this;
        }

        public Criteria andHealthPrescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("health_prescription >=", value, "healthPrescription");
            return (Criteria) this;
        }

        public Criteria andHealthPrescriptionLessThan(String value) {
            addCriterion("health_prescription <", value, "healthPrescription");
            return (Criteria) this;
        }

        public Criteria andHealthPrescriptionLessThanOrEqualTo(String value) {
            addCriterion("health_prescription <=", value, "healthPrescription");
            return (Criteria) this;
        }

        public Criteria andHealthPrescriptionLike(String value) {
            addCriterion("health_prescription like", value, "healthPrescription");
            return (Criteria) this;
        }

        public Criteria andHealthPrescriptionNotLike(String value) {
            addCriterion("health_prescription not like", value, "healthPrescription");
            return (Criteria) this;
        }

        public Criteria andHealthPrescriptionIn(List<String> values) {
            addCriterion("health_prescription in", values, "healthPrescription");
            return (Criteria) this;
        }

        public Criteria andHealthPrescriptionNotIn(List<String> values) {
            addCriterion("health_prescription not in", values, "healthPrescription");
            return (Criteria) this;
        }

        public Criteria andHealthPrescriptionBetween(String value1, String value2) {
            addCriterion("health_prescription between", value1, value2, "healthPrescription");
            return (Criteria) this;
        }

        public Criteria andHealthPrescriptionNotBetween(String value1, String value2) {
            addCriterion("health_prescription not between", value1, value2, "healthPrescription");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 体检报告
     * 
     * @date 2018-11-13
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