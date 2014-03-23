package com.yzu.recruit.dataaccess.model.gen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobRecruitEntityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table JobRecruit
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table JobRecruit
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table JobRecruit
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobRecruit
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    public JobRecruitEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobRecruit
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobRecruit
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobRecruit
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobRecruit
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobRecruit
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobRecruit
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobRecruit
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobRecruit
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
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
     * This method corresponds to the database table JobRecruit
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table JobRecruit
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table JobRecruit
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
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

        public Criteria andJobrecruitidIsNull() {
            addCriterion("JobRecruitID is null");
            return (Criteria) this;
        }

        public Criteria andJobrecruitidIsNotNull() {
            addCriterion("JobRecruitID is not null");
            return (Criteria) this;
        }

        public Criteria andJobrecruitidEqualTo(Integer value) {
            addCriterion("JobRecruitID =", value, "jobrecruitid");
            return (Criteria) this;
        }

        public Criteria andJobrecruitidNotEqualTo(Integer value) {
            addCriterion("JobRecruitID <>", value, "jobrecruitid");
            return (Criteria) this;
        }

        public Criteria andJobrecruitidGreaterThan(Integer value) {
            addCriterion("JobRecruitID >", value, "jobrecruitid");
            return (Criteria) this;
        }

        public Criteria andJobrecruitidGreaterThanOrEqualTo(Integer value) {
            addCriterion("JobRecruitID >=", value, "jobrecruitid");
            return (Criteria) this;
        }

        public Criteria andJobrecruitidLessThan(Integer value) {
            addCriterion("JobRecruitID <", value, "jobrecruitid");
            return (Criteria) this;
        }

        public Criteria andJobrecruitidLessThanOrEqualTo(Integer value) {
            addCriterion("JobRecruitID <=", value, "jobrecruitid");
            return (Criteria) this;
        }

        public Criteria andJobrecruitidIn(List<Integer> values) {
            addCriterion("JobRecruitID in", values, "jobrecruitid");
            return (Criteria) this;
        }

        public Criteria andJobrecruitidNotIn(List<Integer> values) {
            addCriterion("JobRecruitID not in", values, "jobrecruitid");
            return (Criteria) this;
        }

        public Criteria andJobrecruitidBetween(Integer value1, Integer value2) {
            addCriterion("JobRecruitID between", value1, value2, "jobrecruitid");
            return (Criteria) this;
        }

        public Criteria andJobrecruitidNotBetween(Integer value1, Integer value2) {
            addCriterion("JobRecruitID not between", value1, value2, "jobrecruitid");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("StartTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("StartTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("StartTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("StartTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("StartTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("StartTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("StartTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("StartTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("StartTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("StartTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeIsNull() {
            addCriterion("ExpireTime is null");
            return (Criteria) this;
        }

        public Criteria andExpiretimeIsNotNull() {
            addCriterion("ExpireTime is not null");
            return (Criteria) this;
        }

        public Criteria andExpiretimeEqualTo(Date value) {
            addCriterion("ExpireTime =", value, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeNotEqualTo(Date value) {
            addCriterion("ExpireTime <>", value, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeGreaterThan(Date value) {
            addCriterion("ExpireTime >", value, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ExpireTime >=", value, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeLessThan(Date value) {
            addCriterion("ExpireTime <", value, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeLessThanOrEqualTo(Date value) {
            addCriterion("ExpireTime <=", value, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeIn(List<Date> values) {
            addCriterion("ExpireTime in", values, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeNotIn(List<Date> values) {
            addCriterion("ExpireTime not in", values, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeBetween(Date value1, Date value2) {
            addCriterion("ExpireTime between", value1, value2, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeNotBetween(Date value1, Date value2) {
            addCriterion("ExpireTime not between", value1, value2, "expiretime");
            return (Criteria) this;
        }

        public Criteria andPersonIsNull() {
            addCriterion("Person is null");
            return (Criteria) this;
        }

        public Criteria andPersonIsNotNull() {
            addCriterion("Person is not null");
            return (Criteria) this;
        }

        public Criteria andPersonEqualTo(String value) {
            addCriterion("Person =", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotEqualTo(String value) {
            addCriterion("Person <>", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThan(String value) {
            addCriterion("Person >", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonGreaterThanOrEqualTo(String value) {
            addCriterion("Person >=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThan(String value) {
            addCriterion("Person <", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLessThanOrEqualTo(String value) {
            addCriterion("Person <=", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonLike(String value) {
            addCriterion("Person like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotLike(String value) {
            addCriterion("Person not like", value, "person");
            return (Criteria) this;
        }

        public Criteria andPersonIn(List<String> values) {
            addCriterion("Person in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotIn(List<String> values) {
            addCriterion("Person not in", values, "person");
            return (Criteria) this;
        }

        public Criteria andPersonBetween(String value1, String value2) {
            addCriterion("Person between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andPersonNotBetween(String value1, String value2) {
            addCriterion("Person not between", value1, value2, "person");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("Type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("Type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("Type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("DepartmentID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("DepartmentID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("DepartmentID =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("DepartmentID <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("DepartmentID >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DepartmentID >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("DepartmentID <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("DepartmentID <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("DepartmentID in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("DepartmentID not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("DepartmentID between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("DepartmentID not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteIsNull() {
            addCriterion("MarkForDelete is null");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteIsNotNull() {
            addCriterion("MarkForDelete is not null");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteEqualTo(Boolean value) {
            addCriterion("MarkForDelete =", value, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteNotEqualTo(Boolean value) {
            addCriterion("MarkForDelete <>", value, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteGreaterThan(Boolean value) {
            addCriterion("MarkForDelete >", value, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("MarkForDelete >=", value, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteLessThan(Boolean value) {
            addCriterion("MarkForDelete <", value, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("MarkForDelete <=", value, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteIn(List<Boolean> values) {
            addCriterion("MarkForDelete in", values, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteNotIn(List<Boolean> values) {
            addCriterion("MarkForDelete not in", values, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("MarkForDelete between", value1, value2, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andMarkfordeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("MarkForDelete not between", value1, value2, "markfordelete");
            return (Criteria) this;
        }

        public Criteria andJobidIsNull() {
            addCriterion("JobID is null");
            return (Criteria) this;
        }

        public Criteria andJobidIsNotNull() {
            addCriterion("JobID is not null");
            return (Criteria) this;
        }

        public Criteria andJobidEqualTo(Integer value) {
            addCriterion("JobID =", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotEqualTo(Integer value) {
            addCriterion("JobID <>", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThan(Integer value) {
            addCriterion("JobID >", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThanOrEqualTo(Integer value) {
            addCriterion("JobID >=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThan(Integer value) {
            addCriterion("JobID <", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThanOrEqualTo(Integer value) {
            addCriterion("JobID <=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidIn(List<Integer> values) {
            addCriterion("JobID in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotIn(List<Integer> values) {
            addCriterion("JobID not in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidBetween(Integer value1, Integer value2) {
            addCriterion("JobID between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotBetween(Integer value1, Integer value2) {
            addCriterion("JobID not between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andApproveIsNull() {
            addCriterion("Approve is null");
            return (Criteria) this;
        }

        public Criteria andApproveIsNotNull() {
            addCriterion("Approve is not null");
            return (Criteria) this;
        }

        public Criteria andApproveEqualTo(Boolean value) {
            addCriterion("Approve =", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveNotEqualTo(Boolean value) {
            addCriterion("Approve <>", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveGreaterThan(Boolean value) {
            addCriterion("Approve >", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Approve >=", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveLessThan(Boolean value) {
            addCriterion("Approve <", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveLessThanOrEqualTo(Boolean value) {
            addCriterion("Approve <=", value, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveIn(List<Boolean> values) {
            addCriterion("Approve in", values, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveNotIn(List<Boolean> values) {
            addCriterion("Approve not in", values, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveBetween(Boolean value1, Boolean value2) {
            addCriterion("Approve between", value1, value2, "approve");
            return (Criteria) this;
        }

        public Criteria andApproveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Approve not between", value1, value2, "approve");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("Timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("Timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Date value) {
            addCriterion("Timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Date value) {
            addCriterion("Timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Date value) {
            addCriterion("Timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("Timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Date value) {
            addCriterion("Timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Date value) {
            addCriterion("Timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Date> values) {
            addCriterion("Timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Date> values) {
            addCriterion("Timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Date value1, Date value2) {
            addCriterion("Timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Date value1, Date value2) {
            addCriterion("Timestamp not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("City is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("City is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("City =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("City <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("City >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("City >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("City <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("City <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("City like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("City not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("City in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("City not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("City between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("City not between", value1, value2, "city");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table JobRecruit
     *
     * @mbggenerated do_not_delete_during_merge Sun Mar 23 11:29:29 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table JobRecruit
     *
     * @mbggenerated Sun Mar 23 11:29:29 CST 2014
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