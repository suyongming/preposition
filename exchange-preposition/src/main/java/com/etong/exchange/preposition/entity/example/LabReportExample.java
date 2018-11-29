package com.etong.exchange.preposition.entity.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LabReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LabReportExample() {
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
     * 检验报告
     *
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

        public Criteria andReportNameIsNull() {
            addCriterion("REPORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReportNameIsNotNull() {
            addCriterion("REPORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReportNameEqualTo(String value) {
            addCriterion("REPORT_NAME =", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotEqualTo(String value) {
            addCriterion("REPORT_NAME <>", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameGreaterThan(String value) {
            addCriterion("REPORT_NAME >", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_NAME >=", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLessThan(String value) {
            addCriterion("REPORT_NAME <", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLessThanOrEqualTo(String value) {
            addCriterion("REPORT_NAME <=", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLike(String value) {
            addCriterion("REPORT_NAME like", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotLike(String value) {
            addCriterion("REPORT_NAME not like", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameIn(List<String> values) {
            addCriterion("REPORT_NAME in", values, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotIn(List<String> values) {
            addCriterion("REPORT_NAME not in", values, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameBetween(String value1, String value2) {
            addCriterion("REPORT_NAME between", value1, value2, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotBetween(String value1, String value2) {
            addCriterion("REPORT_NAME not between", value1, value2, "reportName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorCodeIsNull() {
            addCriterion("EXAM_DOCTOR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andExamDoctorCodeIsNotNull() {
            addCriterion("EXAM_DOCTOR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andExamDoctorCodeEqualTo(String value) {
            addCriterion("EXAM_DOCTOR_CODE =", value, "examDoctorCode");
            return (Criteria) this;
        }

        public Criteria andExamDoctorCodeNotEqualTo(String value) {
            addCriterion("EXAM_DOCTOR_CODE <>", value, "examDoctorCode");
            return (Criteria) this;
        }

        public Criteria andExamDoctorCodeGreaterThan(String value) {
            addCriterion("EXAM_DOCTOR_CODE >", value, "examDoctorCode");
            return (Criteria) this;
        }

        public Criteria andExamDoctorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_DOCTOR_CODE >=", value, "examDoctorCode");
            return (Criteria) this;
        }

        public Criteria andExamDoctorCodeLessThan(String value) {
            addCriterion("EXAM_DOCTOR_CODE <", value, "examDoctorCode");
            return (Criteria) this;
        }

        public Criteria andExamDoctorCodeLessThanOrEqualTo(String value) {
            addCriterion("EXAM_DOCTOR_CODE <=", value, "examDoctorCode");
            return (Criteria) this;
        }

        public Criteria andExamDoctorCodeLike(String value) {
            addCriterion("EXAM_DOCTOR_CODE like", value, "examDoctorCode");
            return (Criteria) this;
        }

        public Criteria andExamDoctorCodeNotLike(String value) {
            addCriterion("EXAM_DOCTOR_CODE not like", value, "examDoctorCode");
            return (Criteria) this;
        }

        public Criteria andExamDoctorCodeIn(List<String> values) {
            addCriterion("EXAM_DOCTOR_CODE in", values, "examDoctorCode");
            return (Criteria) this;
        }

        public Criteria andExamDoctorCodeNotIn(List<String> values) {
            addCriterion("EXAM_DOCTOR_CODE not in", values, "examDoctorCode");
            return (Criteria) this;
        }

        public Criteria andExamDoctorCodeBetween(String value1, String value2) {
            addCriterion("EXAM_DOCTOR_CODE between", value1, value2, "examDoctorCode");
            return (Criteria) this;
        }

        public Criteria andExamDoctorCodeNotBetween(String value1, String value2) {
            addCriterion("EXAM_DOCTOR_CODE not between", value1, value2, "examDoctorCode");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameIsNull() {
            addCriterion("EXAM_DOCTOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameIsNotNull() {
            addCriterion("EXAM_DOCTOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameEqualTo(String value) {
            addCriterion("EXAM_DOCTOR_NAME =", value, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameNotEqualTo(String value) {
            addCriterion("EXAM_DOCTOR_NAME <>", value, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameGreaterThan(String value) {
            addCriterion("EXAM_DOCTOR_NAME >", value, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_DOCTOR_NAME >=", value, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameLessThan(String value) {
            addCriterion("EXAM_DOCTOR_NAME <", value, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("EXAM_DOCTOR_NAME <=", value, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameLike(String value) {
            addCriterion("EXAM_DOCTOR_NAME like", value, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameNotLike(String value) {
            addCriterion("EXAM_DOCTOR_NAME not like", value, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameIn(List<String> values) {
            addCriterion("EXAM_DOCTOR_NAME in", values, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameNotIn(List<String> values) {
            addCriterion("EXAM_DOCTOR_NAME not in", values, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameBetween(String value1, String value2) {
            addCriterion("EXAM_DOCTOR_NAME between", value1, value2, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamDoctorNameNotBetween(String value1, String value2) {
            addCriterion("EXAM_DOCTOR_NAME not between", value1, value2, "examDoctorName");
            return (Criteria) this;
        }

        public Criteria andExamTimeIsNull() {
            addCriterion("EXAM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andExamTimeIsNotNull() {
            addCriterion("EXAM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andExamTimeEqualTo(String value) {
            addCriterion("EXAM_TIME =", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotEqualTo(String value) {
            addCriterion("EXAM_TIME <>", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeGreaterThan(String value) {
            addCriterion("EXAM_TIME >", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeGreaterThanOrEqualTo(String value) {
            addCriterion("EXAM_TIME >=", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLessThan(String value) {
            addCriterion("EXAM_TIME <", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLessThanOrEqualTo(String value) {
            addCriterion("EXAM_TIME <=", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeLike(String value) {
            addCriterion("EXAM_TIME like", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotLike(String value) {
            addCriterion("EXAM_TIME not like", value, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeIn(List<String> values) {
            addCriterion("EXAM_TIME in", values, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotIn(List<String> values) {
            addCriterion("EXAM_TIME not in", values, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeBetween(String value1, String value2) {
            addCriterion("EXAM_TIME between", value1, value2, "examTime");
            return (Criteria) this;
        }

        public Criteria andExamTimeNotBetween(String value1, String value2) {
            addCriterion("EXAM_TIME not between", value1, value2, "examTime");
            return (Criteria) this;
        }

        public Criteria andReportDoctorCodeIsNull() {
            addCriterion("REPORT_DOCTOR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReportDoctorCodeIsNotNull() {
            addCriterion("REPORT_DOCTOR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReportDoctorCodeEqualTo(String value) {
            addCriterion("REPORT_DOCTOR_CODE =", value, "reportDoctorCode");
            return (Criteria) this;
        }

        public Criteria andReportDoctorCodeNotEqualTo(String value) {
            addCriterion("REPORT_DOCTOR_CODE <>", value, "reportDoctorCode");
            return (Criteria) this;
        }

        public Criteria andReportDoctorCodeGreaterThan(String value) {
            addCriterion("REPORT_DOCTOR_CODE >", value, "reportDoctorCode");
            return (Criteria) this;
        }

        public Criteria andReportDoctorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_DOCTOR_CODE >=", value, "reportDoctorCode");
            return (Criteria) this;
        }

        public Criteria andReportDoctorCodeLessThan(String value) {
            addCriterion("REPORT_DOCTOR_CODE <", value, "reportDoctorCode");
            return (Criteria) this;
        }

        public Criteria andReportDoctorCodeLessThanOrEqualTo(String value) {
            addCriterion("REPORT_DOCTOR_CODE <=", value, "reportDoctorCode");
            return (Criteria) this;
        }

        public Criteria andReportDoctorCodeLike(String value) {
            addCriterion("REPORT_DOCTOR_CODE like", value, "reportDoctorCode");
            return (Criteria) this;
        }

        public Criteria andReportDoctorCodeNotLike(String value) {
            addCriterion("REPORT_DOCTOR_CODE not like", value, "reportDoctorCode");
            return (Criteria) this;
        }

        public Criteria andReportDoctorCodeIn(List<String> values) {
            addCriterion("REPORT_DOCTOR_CODE in", values, "reportDoctorCode");
            return (Criteria) this;
        }

        public Criteria andReportDoctorCodeNotIn(List<String> values) {
            addCriterion("REPORT_DOCTOR_CODE not in", values, "reportDoctorCode");
            return (Criteria) this;
        }

        public Criteria andReportDoctorCodeBetween(String value1, String value2) {
            addCriterion("REPORT_DOCTOR_CODE between", value1, value2, "reportDoctorCode");
            return (Criteria) this;
        }

        public Criteria andReportDoctorCodeNotBetween(String value1, String value2) {
            addCriterion("REPORT_DOCTOR_CODE not between", value1, value2, "reportDoctorCode");
            return (Criteria) this;
        }

        public Criteria andReportDoctorNameIsNull() {
            addCriterion("REPORT_DOCTOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReportDoctorNameIsNotNull() {
            addCriterion("REPORT_DOCTOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReportDoctorNameEqualTo(String value) {
            addCriterion("REPORT_DOCTOR_NAME =", value, "reportDoctorName");
            return (Criteria) this;
        }

        public Criteria andReportDoctorNameNotEqualTo(String value) {
            addCriterion("REPORT_DOCTOR_NAME <>", value, "reportDoctorName");
            return (Criteria) this;
        }

        public Criteria andReportDoctorNameGreaterThan(String value) {
            addCriterion("REPORT_DOCTOR_NAME >", value, "reportDoctorName");
            return (Criteria) this;
        }

        public Criteria andReportDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_DOCTOR_NAME >=", value, "reportDoctorName");
            return (Criteria) this;
        }

        public Criteria andReportDoctorNameLessThan(String value) {
            addCriterion("REPORT_DOCTOR_NAME <", value, "reportDoctorName");
            return (Criteria) this;
        }

        public Criteria andReportDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("REPORT_DOCTOR_NAME <=", value, "reportDoctorName");
            return (Criteria) this;
        }

        public Criteria andReportDoctorNameLike(String value) {
            addCriterion("REPORT_DOCTOR_NAME like", value, "reportDoctorName");
            return (Criteria) this;
        }

        public Criteria andReportDoctorNameNotLike(String value) {
            addCriterion("REPORT_DOCTOR_NAME not like", value, "reportDoctorName");
            return (Criteria) this;
        }

        public Criteria andReportDoctorNameIn(List<String> values) {
            addCriterion("REPORT_DOCTOR_NAME in", values, "reportDoctorName");
            return (Criteria) this;
        }

        public Criteria andReportDoctorNameNotIn(List<String> values) {
            addCriterion("REPORT_DOCTOR_NAME not in", values, "reportDoctorName");
            return (Criteria) this;
        }

        public Criteria andReportDoctorNameBetween(String value1, String value2) {
            addCriterion("REPORT_DOCTOR_NAME between", value1, value2, "reportDoctorName");
            return (Criteria) this;
        }

        public Criteria andReportDoctorNameNotBetween(String value1, String value2) {
            addCriterion("REPORT_DOCTOR_NAME not between", value1, value2, "reportDoctorName");
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

        public Criteria andSpecimenCodeIsNull() {
            addCriterion("SPECIMEN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSpecimenCodeIsNotNull() {
            addCriterion("SPECIMEN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSpecimenCodeEqualTo(String value) {
            addCriterion("SPECIMEN_CODE =", value, "specimenCode");
            return (Criteria) this;
        }

        public Criteria andSpecimenCodeNotEqualTo(String value) {
            addCriterion("SPECIMEN_CODE <>", value, "specimenCode");
            return (Criteria) this;
        }

        public Criteria andSpecimenCodeGreaterThan(String value) {
            addCriterion("SPECIMEN_CODE >", value, "specimenCode");
            return (Criteria) this;
        }

        public Criteria andSpecimenCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIMEN_CODE >=", value, "specimenCode");
            return (Criteria) this;
        }

        public Criteria andSpecimenCodeLessThan(String value) {
            addCriterion("SPECIMEN_CODE <", value, "specimenCode");
            return (Criteria) this;
        }

        public Criteria andSpecimenCodeLessThanOrEqualTo(String value) {
            addCriterion("SPECIMEN_CODE <=", value, "specimenCode");
            return (Criteria) this;
        }

        public Criteria andSpecimenCodeLike(String value) {
            addCriterion("SPECIMEN_CODE like", value, "specimenCode");
            return (Criteria) this;
        }

        public Criteria andSpecimenCodeNotLike(String value) {
            addCriterion("SPECIMEN_CODE not like", value, "specimenCode");
            return (Criteria) this;
        }

        public Criteria andSpecimenCodeIn(List<String> values) {
            addCriterion("SPECIMEN_CODE in", values, "specimenCode");
            return (Criteria) this;
        }

        public Criteria andSpecimenCodeNotIn(List<String> values) {
            addCriterion("SPECIMEN_CODE not in", values, "specimenCode");
            return (Criteria) this;
        }

        public Criteria andSpecimenCodeBetween(String value1, String value2) {
            addCriterion("SPECIMEN_CODE between", value1, value2, "specimenCode");
            return (Criteria) this;
        }

        public Criteria andSpecimenCodeNotBetween(String value1, String value2) {
            addCriterion("SPECIMEN_CODE not between", value1, value2, "specimenCode");
            return (Criteria) this;
        }

        public Criteria andSpecimenNameIsNull() {
            addCriterion("SPECIMEN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSpecimenNameIsNotNull() {
            addCriterion("SPECIMEN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSpecimenNameEqualTo(String value) {
            addCriterion("SPECIMEN_NAME =", value, "specimenName");
            return (Criteria) this;
        }

        public Criteria andSpecimenNameNotEqualTo(String value) {
            addCriterion("SPECIMEN_NAME <>", value, "specimenName");
            return (Criteria) this;
        }

        public Criteria andSpecimenNameGreaterThan(String value) {
            addCriterion("SPECIMEN_NAME >", value, "specimenName");
            return (Criteria) this;
        }

        public Criteria andSpecimenNameGreaterThanOrEqualTo(String value) {
            addCriterion("SPECIMEN_NAME >=", value, "specimenName");
            return (Criteria) this;
        }

        public Criteria andSpecimenNameLessThan(String value) {
            addCriterion("SPECIMEN_NAME <", value, "specimenName");
            return (Criteria) this;
        }

        public Criteria andSpecimenNameLessThanOrEqualTo(String value) {
            addCriterion("SPECIMEN_NAME <=", value, "specimenName");
            return (Criteria) this;
        }

        public Criteria andSpecimenNameLike(String value) {
            addCriterion("SPECIMEN_NAME like", value, "specimenName");
            return (Criteria) this;
        }

        public Criteria andSpecimenNameNotLike(String value) {
            addCriterion("SPECIMEN_NAME not like", value, "specimenName");
            return (Criteria) this;
        }

        public Criteria andSpecimenNameIn(List<String> values) {
            addCriterion("SPECIMEN_NAME in", values, "specimenName");
            return (Criteria) this;
        }

        public Criteria andSpecimenNameNotIn(List<String> values) {
            addCriterion("SPECIMEN_NAME not in", values, "specimenName");
            return (Criteria) this;
        }

        public Criteria andSpecimenNameBetween(String value1, String value2) {
            addCriterion("SPECIMEN_NAME between", value1, value2, "specimenName");
            return (Criteria) this;
        }

        public Criteria andSpecimenNameNotBetween(String value1, String value2) {
            addCriterion("SPECIMEN_NAME not between", value1, value2, "specimenName");
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

        public Criteria andExamOpinionIsNull() {
            addCriterion("exam_opinion is null");
            return (Criteria) this;
        }

        public Criteria andExamOpinionIsNotNull() {
            addCriterion("exam_opinion is not null");
            return (Criteria) this;
        }

        public Criteria andExamOpinionEqualTo(String value) {
            addCriterion("exam_opinion =", value, "examOpinion");
            return (Criteria) this;
        }

        public Criteria andExamOpinionNotEqualTo(String value) {
            addCriterion("exam_opinion <>", value, "examOpinion");
            return (Criteria) this;
        }

        public Criteria andExamOpinionGreaterThan(String value) {
            addCriterion("exam_opinion >", value, "examOpinion");
            return (Criteria) this;
        }

        public Criteria andExamOpinionGreaterThanOrEqualTo(String value) {
            addCriterion("exam_opinion >=", value, "examOpinion");
            return (Criteria) this;
        }

        public Criteria andExamOpinionLessThan(String value) {
            addCriterion("exam_opinion <", value, "examOpinion");
            return (Criteria) this;
        }

        public Criteria andExamOpinionLessThanOrEqualTo(String value) {
            addCriterion("exam_opinion <=", value, "examOpinion");
            return (Criteria) this;
        }

        public Criteria andExamOpinionLike(String value) {
            addCriterion("exam_opinion like", value, "examOpinion");
            return (Criteria) this;
        }

        public Criteria andExamOpinionNotLike(String value) {
            addCriterion("exam_opinion not like", value, "examOpinion");
            return (Criteria) this;
        }

        public Criteria andExamOpinionIn(List<String> values) {
            addCriterion("exam_opinion in", values, "examOpinion");
            return (Criteria) this;
        }

        public Criteria andExamOpinionNotIn(List<String> values) {
            addCriterion("exam_opinion not in", values, "examOpinion");
            return (Criteria) this;
        }

        public Criteria andExamOpinionBetween(String value1, String value2) {
            addCriterion("exam_opinion between", value1, value2, "examOpinion");
            return (Criteria) this;
        }

        public Criteria andExamOpinionNotBetween(String value1, String value2) {
            addCriterion("exam_opinion not between", value1, value2, "examOpinion");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIsNull() {
            addCriterion("department_code is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIsNotNull() {
            addCriterion("department_code is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeEqualTo(String value) {
            addCriterion("department_code =", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotEqualTo(String value) {
            addCriterion("department_code <>", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeGreaterThan(String value) {
            addCriterion("department_code >", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeGreaterThanOrEqualTo(String value) {
            addCriterion("department_code >=", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLessThan(String value) {
            addCriterion("department_code <", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLessThanOrEqualTo(String value) {
            addCriterion("department_code <=", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeLike(String value) {
            addCriterion("department_code like", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotLike(String value) {
            addCriterion("department_code not like", value, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeIn(List<String> values) {
            addCriterion("department_code in", values, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotIn(List<String> values) {
            addCriterion("department_code not in", values, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeBetween(String value1, String value2) {
            addCriterion("department_code between", value1, value2, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentCodeNotBetween(String value1, String value2) {
            addCriterion("department_code not between", value1, value2, "departmentCode");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("department_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("department_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("department_name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("department_name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("department_name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("department_name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("department_name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("department_name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("department_name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("department_name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("department_name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("department_name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("department_name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 检验报告
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