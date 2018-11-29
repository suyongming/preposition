package com.etong.exchange.preposition.entity.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LabIndexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LabIndexExample() {
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
     * 检验指标
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

        public Criteria andIndexCodeIsNull() {
            addCriterion("INDEX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIndexCodeIsNotNull() {
            addCriterion("INDEX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIndexCodeEqualTo(String value) {
            addCriterion("INDEX_CODE =", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeNotEqualTo(String value) {
            addCriterion("INDEX_CODE <>", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeGreaterThan(String value) {
            addCriterion("INDEX_CODE >", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INDEX_CODE >=", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeLessThan(String value) {
            addCriterion("INDEX_CODE <", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeLessThanOrEqualTo(String value) {
            addCriterion("INDEX_CODE <=", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeLike(String value) {
            addCriterion("INDEX_CODE like", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeNotLike(String value) {
            addCriterion("INDEX_CODE not like", value, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeIn(List<String> values) {
            addCriterion("INDEX_CODE in", values, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeNotIn(List<String> values) {
            addCriterion("INDEX_CODE not in", values, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeBetween(String value1, String value2) {
            addCriterion("INDEX_CODE between", value1, value2, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexCodeNotBetween(String value1, String value2) {
            addCriterion("INDEX_CODE not between", value1, value2, "indexCode");
            return (Criteria) this;
        }

        public Criteria andIndexNameIsNull() {
            addCriterion("INDEX_NAME is null");
            return (Criteria) this;
        }

        public Criteria andIndexNameIsNotNull() {
            addCriterion("INDEX_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andIndexNameEqualTo(String value) {
            addCriterion("INDEX_NAME =", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotEqualTo(String value) {
            addCriterion("INDEX_NAME <>", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameGreaterThan(String value) {
            addCriterion("INDEX_NAME >", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameGreaterThanOrEqualTo(String value) {
            addCriterion("INDEX_NAME >=", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLessThan(String value) {
            addCriterion("INDEX_NAME <", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLessThanOrEqualTo(String value) {
            addCriterion("INDEX_NAME <=", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameLike(String value) {
            addCriterion("INDEX_NAME like", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotLike(String value) {
            addCriterion("INDEX_NAME not like", value, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameIn(List<String> values) {
            addCriterion("INDEX_NAME in", values, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotIn(List<String> values) {
            addCriterion("INDEX_NAME not in", values, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameBetween(String value1, String value2) {
            addCriterion("INDEX_NAME between", value1, value2, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexNameNotBetween(String value1, String value2) {
            addCriterion("INDEX_NAME not between", value1, value2, "indexName");
            return (Criteria) this;
        }

        public Criteria andIndexResultIsNull() {
            addCriterion("INDEX_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andIndexResultIsNotNull() {
            addCriterion("INDEX_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andIndexResultEqualTo(String value) {
            addCriterion("INDEX_RESULT =", value, "indexResult");
            return (Criteria) this;
        }

        public Criteria andIndexResultNotEqualTo(String value) {
            addCriterion("INDEX_RESULT <>", value, "indexResult");
            return (Criteria) this;
        }

        public Criteria andIndexResultGreaterThan(String value) {
            addCriterion("INDEX_RESULT >", value, "indexResult");
            return (Criteria) this;
        }

        public Criteria andIndexResultGreaterThanOrEqualTo(String value) {
            addCriterion("INDEX_RESULT >=", value, "indexResult");
            return (Criteria) this;
        }

        public Criteria andIndexResultLessThan(String value) {
            addCriterion("INDEX_RESULT <", value, "indexResult");
            return (Criteria) this;
        }

        public Criteria andIndexResultLessThanOrEqualTo(String value) {
            addCriterion("INDEX_RESULT <=", value, "indexResult");
            return (Criteria) this;
        }

        public Criteria andIndexResultLike(String value) {
            addCriterion("INDEX_RESULT like", value, "indexResult");
            return (Criteria) this;
        }

        public Criteria andIndexResultNotLike(String value) {
            addCriterion("INDEX_RESULT not like", value, "indexResult");
            return (Criteria) this;
        }

        public Criteria andIndexResultIn(List<String> values) {
            addCriterion("INDEX_RESULT in", values, "indexResult");
            return (Criteria) this;
        }

        public Criteria andIndexResultNotIn(List<String> values) {
            addCriterion("INDEX_RESULT not in", values, "indexResult");
            return (Criteria) this;
        }

        public Criteria andIndexResultBetween(String value1, String value2) {
            addCriterion("INDEX_RESULT between", value1, value2, "indexResult");
            return (Criteria) this;
        }

        public Criteria andIndexResultNotBetween(String value1, String value2) {
            addCriterion("INDEX_RESULT not between", value1, value2, "indexResult");
            return (Criteria) this;
        }

        public Criteria andReferenceRangeIsNull() {
            addCriterion("REFERENCE_RANGE is null");
            return (Criteria) this;
        }

        public Criteria andReferenceRangeIsNotNull() {
            addCriterion("REFERENCE_RANGE is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceRangeEqualTo(String value) {
            addCriterion("REFERENCE_RANGE =", value, "referenceRange");
            return (Criteria) this;
        }

        public Criteria andReferenceRangeNotEqualTo(String value) {
            addCriterion("REFERENCE_RANGE <>", value, "referenceRange");
            return (Criteria) this;
        }

        public Criteria andReferenceRangeGreaterThan(String value) {
            addCriterion("REFERENCE_RANGE >", value, "referenceRange");
            return (Criteria) this;
        }

        public Criteria andReferenceRangeGreaterThanOrEqualTo(String value) {
            addCriterion("REFERENCE_RANGE >=", value, "referenceRange");
            return (Criteria) this;
        }

        public Criteria andReferenceRangeLessThan(String value) {
            addCriterion("REFERENCE_RANGE <", value, "referenceRange");
            return (Criteria) this;
        }

        public Criteria andReferenceRangeLessThanOrEqualTo(String value) {
            addCriterion("REFERENCE_RANGE <=", value, "referenceRange");
            return (Criteria) this;
        }

        public Criteria andReferenceRangeLike(String value) {
            addCriterion("REFERENCE_RANGE like", value, "referenceRange");
            return (Criteria) this;
        }

        public Criteria andReferenceRangeNotLike(String value) {
            addCriterion("REFERENCE_RANGE not like", value, "referenceRange");
            return (Criteria) this;
        }

        public Criteria andReferenceRangeIn(List<String> values) {
            addCriterion("REFERENCE_RANGE in", values, "referenceRange");
            return (Criteria) this;
        }

        public Criteria andReferenceRangeNotIn(List<String> values) {
            addCriterion("REFERENCE_RANGE not in", values, "referenceRange");
            return (Criteria) this;
        }

        public Criteria andReferenceRangeBetween(String value1, String value2) {
            addCriterion("REFERENCE_RANGE between", value1, value2, "referenceRange");
            return (Criteria) this;
        }

        public Criteria andReferenceRangeNotBetween(String value1, String value2) {
            addCriterion("REFERENCE_RANGE not between", value1, value2, "referenceRange");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitIsNull() {
            addCriterion("MEASURE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitIsNotNull() {
            addCriterion("MEASURE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitEqualTo(String value) {
            addCriterion("MEASURE_UNIT =", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitNotEqualTo(String value) {
            addCriterion("MEASURE_UNIT <>", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitGreaterThan(String value) {
            addCriterion("MEASURE_UNIT >", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitGreaterThanOrEqualTo(String value) {
            addCriterion("MEASURE_UNIT >=", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitLessThan(String value) {
            addCriterion("MEASURE_UNIT <", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitLessThanOrEqualTo(String value) {
            addCriterion("MEASURE_UNIT <=", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitLike(String value) {
            addCriterion("MEASURE_UNIT like", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitNotLike(String value) {
            addCriterion("MEASURE_UNIT not like", value, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitIn(List<String> values) {
            addCriterion("MEASURE_UNIT in", values, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitNotIn(List<String> values) {
            addCriterion("MEASURE_UNIT not in", values, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitBetween(String value1, String value2) {
            addCriterion("MEASURE_UNIT between", value1, value2, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andMeasureUnitNotBetween(String value1, String value2) {
            addCriterion("MEASURE_UNIT not between", value1, value2, "measureUnit");
            return (Criteria) this;
        }

        public Criteria andUnusualPromptIsNull() {
            addCriterion("UNUSUAL_PROMPT is null");
            return (Criteria) this;
        }

        public Criteria andUnusualPromptIsNotNull() {
            addCriterion("UNUSUAL_PROMPT is not null");
            return (Criteria) this;
        }

        public Criteria andUnusualPromptEqualTo(String value) {
            addCriterion("UNUSUAL_PROMPT =", value, "unusualPrompt");
            return (Criteria) this;
        }

        public Criteria andUnusualPromptNotEqualTo(String value) {
            addCriterion("UNUSUAL_PROMPT <>", value, "unusualPrompt");
            return (Criteria) this;
        }

        public Criteria andUnusualPromptGreaterThan(String value) {
            addCriterion("UNUSUAL_PROMPT >", value, "unusualPrompt");
            return (Criteria) this;
        }

        public Criteria andUnusualPromptGreaterThanOrEqualTo(String value) {
            addCriterion("UNUSUAL_PROMPT >=", value, "unusualPrompt");
            return (Criteria) this;
        }

        public Criteria andUnusualPromptLessThan(String value) {
            addCriterion("UNUSUAL_PROMPT <", value, "unusualPrompt");
            return (Criteria) this;
        }

        public Criteria andUnusualPromptLessThanOrEqualTo(String value) {
            addCriterion("UNUSUAL_PROMPT <=", value, "unusualPrompt");
            return (Criteria) this;
        }

        public Criteria andUnusualPromptLike(String value) {
            addCriterion("UNUSUAL_PROMPT like", value, "unusualPrompt");
            return (Criteria) this;
        }

        public Criteria andUnusualPromptNotLike(String value) {
            addCriterion("UNUSUAL_PROMPT not like", value, "unusualPrompt");
            return (Criteria) this;
        }

        public Criteria andUnusualPromptIn(List<String> values) {
            addCriterion("UNUSUAL_PROMPT in", values, "unusualPrompt");
            return (Criteria) this;
        }

        public Criteria andUnusualPromptNotIn(List<String> values) {
            addCriterion("UNUSUAL_PROMPT not in", values, "unusualPrompt");
            return (Criteria) this;
        }

        public Criteria andUnusualPromptBetween(String value1, String value2) {
            addCriterion("UNUSUAL_PROMPT between", value1, value2, "unusualPrompt");
            return (Criteria) this;
        }

        public Criteria andUnusualPromptNotBetween(String value1, String value2) {
            addCriterion("UNUSUAL_PROMPT not between", value1, value2, "unusualPrompt");
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
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 检验指标
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