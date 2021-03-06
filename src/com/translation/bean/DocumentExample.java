package com.translation.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentExample {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table document
     *
     * @ibatorgenerated Thu Apr 09 21:28:14 CST 2015
     */
    protected String orderByClause;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table document
     *
     * @ibatorgenerated Thu Apr 09 21:28:14 CST 2015
     */
    protected List oredCriteria;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table document
     *
     * @ibatorgenerated Thu Apr 09 21:28:14 CST 2015
     */
    public DocumentExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table document
     *
     * @ibatorgenerated Thu Apr 09 21:28:14 CST 2015
     */
    protected DocumentExample(DocumentExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table document
     *
     * @ibatorgenerated Thu Apr 09 21:28:14 CST 2015
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table document
     *
     * @ibatorgenerated Thu Apr 09 21:28:14 CST 2015
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table document
     *
     * @ibatorgenerated Thu Apr 09 21:28:14 CST 2015
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table document
     *
     * @ibatorgenerated Thu Apr 09 21:28:14 CST 2015
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table document
     *
     * @ibatorgenerated Thu Apr 09 21:28:14 CST 2015
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table document
     *
     * @ibatorgenerated Thu Apr 09 21:28:14 CST 2015
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table document
     *
     * @ibatorgenerated Thu Apr 09 21:28:14 CST 2015
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table document
     *
     * @ibatorgenerated Thu Apr 09 21:28:14 CST 2015
     */
    public static class Criteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andDocidIsNull() {
            addCriterion("docid is null");
            return this;
        }

        public Criteria andDocidIsNotNull() {
            addCriterion("docid is not null");
            return this;
        }

        public Criteria andDocidEqualTo(Integer value) {
            addCriterion("docid =", value, "docid");
            return this;
        }

        public Criteria andDocidNotEqualTo(Integer value) {
            addCriterion("docid <>", value, "docid");
            return this;
        }

        public Criteria andDocidGreaterThan(Integer value) {
            addCriterion("docid >", value, "docid");
            return this;
        }

        public Criteria andDocidGreaterThanOrEqualTo(Integer value) {
            addCriterion("docid >=", value, "docid");
            return this;
        }

        public Criteria andDocidLessThan(Integer value) {
            addCriterion("docid <", value, "docid");
            return this;
        }

        public Criteria andDocidLessThanOrEqualTo(Integer value) {
            addCriterion("docid <=", value, "docid");
            return this;
        }

        public Criteria andDocidIn(List values) {
            addCriterion("docid in", values, "docid");
            return this;
        }

        public Criteria andDocidNotIn(List values) {
            addCriterion("docid not in", values, "docid");
            return this;
        }

        public Criteria andDocidBetween(Integer value1, Integer value2) {
            addCriterion("docid between", value1, value2, "docid");
            return this;
        }

        public Criteria andDocidNotBetween(Integer value1, Integer value2) {
            addCriterion("docid not between", value1, value2, "docid");
            return this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return this;
        }

        public Criteria andUseridIn(List values) {
            addCriterion("userid in", values, "userid");
            return this;
        }

        public Criteria andUseridNotIn(List values) {
            addCriterion("userid not in", values, "userid");
            return this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return this;
        }

        public Criteria andTitleIn(List values) {
            addCriterion("title in", values, "title");
            return this;
        }

        public Criteria andTitleNotIn(List values) {
            addCriterion("title not in", values, "title");
            return this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return this;
        }

        public Criteria andContentIn(List values) {
            addCriterion("content in", values, "content");
            return this;
        }

        public Criteria andContentNotIn(List values) {
            addCriterion("content not in", values, "content");
            return this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return this;
        }

        public Criteria andCreattimeIsNull() {
            addCriterion("creattime is null");
            return this;
        }

        public Criteria andCreattimeIsNotNull() {
            addCriterion("creattime is not null");
            return this;
        }

        public Criteria andCreattimeEqualTo(Date value) {
            addCriterion("creattime =", value, "creattime");
            return this;
        }

        public Criteria andCreattimeNotEqualTo(Date value) {
            addCriterion("creattime <>", value, "creattime");
            return this;
        }

        public Criteria andCreattimeGreaterThan(Date value) {
            addCriterion("creattime >", value, "creattime");
            return this;
        }

        public Criteria andCreattimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creattime >=", value, "creattime");
            return this;
        }

        public Criteria andCreattimeLessThan(Date value) {
            addCriterion("creattime <", value, "creattime");
            return this;
        }

        public Criteria andCreattimeLessThanOrEqualTo(Date value) {
            addCriterion("creattime <=", value, "creattime");
            return this;
        }

        public Criteria andCreattimeIn(List values) {
            addCriterion("creattime in", values, "creattime");
            return this;
        }

        public Criteria andCreattimeNotIn(List values) {
            addCriterion("creattime not in", values, "creattime");
            return this;
        }

        public Criteria andCreattimeBetween(Date value1, Date value2) {
            addCriterion("creattime between", value1, value2, "creattime");
            return this;
        }

        public Criteria andCreattimeNotBetween(Date value1, Date value2) {
            addCriterion("creattime not between", value1, value2, "creattime");
            return this;
        }

        public Criteria andEdittimeIsNull() {
            addCriterion("edittime is null");
            return this;
        }

        public Criteria andEdittimeIsNotNull() {
            addCriterion("edittime is not null");
            return this;
        }

        public Criteria andEdittimeEqualTo(Date value) {
            addCriterion("edittime =", value, "edittime");
            return this;
        }

        public Criteria andEdittimeNotEqualTo(Date value) {
            addCriterion("edittime <>", value, "edittime");
            return this;
        }

        public Criteria andEdittimeGreaterThan(Date value) {
            addCriterion("edittime >", value, "edittime");
            return this;
        }

        public Criteria andEdittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("edittime >=", value, "edittime");
            return this;
        }

        public Criteria andEdittimeLessThan(Date value) {
            addCriterion("edittime <", value, "edittime");
            return this;
        }

        public Criteria andEdittimeLessThanOrEqualTo(Date value) {
            addCriterion("edittime <=", value, "edittime");
            return this;
        }

        public Criteria andEdittimeIn(List values) {
            addCriterion("edittime in", values, "edittime");
            return this;
        }

        public Criteria andEdittimeNotIn(List values) {
            addCriterion("edittime not in", values, "edittime");
            return this;
        }

        public Criteria andEdittimeBetween(Date value1, Date value2) {
            addCriterion("edittime between", value1, value2, "edittime");
            return this;
        }

        public Criteria andEdittimeNotBetween(Date value1, Date value2) {
            addCriterion("edittime not between", value1, value2, "edittime");
            return this;
        }

        public Criteria andPointIsNull() {
            addCriterion("point is null");
            return this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("point is not null");
            return this;
        }

        public Criteria andPointEqualTo(Integer value) {
            addCriterion("point =", value, "point");
            return this;
        }

        public Criteria andPointNotEqualTo(Integer value) {
            addCriterion("point <>", value, "point");
            return this;
        }

        public Criteria andPointGreaterThan(Integer value) {
            addCriterion("point >", value, "point");
            return this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("point >=", value, "point");
            return this;
        }

        public Criteria andPointLessThan(Integer value) {
            addCriterion("point <", value, "point");
            return this;
        }

        public Criteria andPointLessThanOrEqualTo(Integer value) {
            addCriterion("point <=", value, "point");
            return this;
        }

        public Criteria andPointIn(List values) {
            addCriterion("point in", values, "point");
            return this;
        }

        public Criteria andPointNotIn(List values) {
            addCriterion("point not in", values, "point");
            return this;
        }

        public Criteria andPointBetween(Integer value1, Integer value2) {
            addCriterion("point between", value1, value2, "point");
            return this;
        }

        public Criteria andPointNotBetween(Integer value1, Integer value2) {
            addCriterion("point not between", value1, value2, "point");
            return this;
        }

        public Criteria andDelflagIsNull() {
            addCriterion("delflag is null");
            return this;
        }

        public Criteria andDelflagIsNotNull() {
            addCriterion("delflag is not null");
            return this;
        }

        public Criteria andDelflagEqualTo(String value) {
            addCriterion("delflag =", value, "delflag");
            return this;
        }

        public Criteria andDelflagNotEqualTo(String value) {
            addCriterion("delflag <>", value, "delflag");
            return this;
        }

        public Criteria andDelflagGreaterThan(String value) {
            addCriterion("delflag >", value, "delflag");
            return this;
        }

        public Criteria andDelflagGreaterThanOrEqualTo(String value) {
            addCriterion("delflag >=", value, "delflag");
            return this;
        }

        public Criteria andDelflagLessThan(String value) {
            addCriterion("delflag <", value, "delflag");
            return this;
        }

        public Criteria andDelflagLessThanOrEqualTo(String value) {
            addCriterion("delflag <=", value, "delflag");
            return this;
        }

        public Criteria andDelflagLike(String value) {
            addCriterion("delflag like", value, "delflag");
            return this;
        }

        public Criteria andDelflagNotLike(String value) {
            addCriterion("delflag not like", value, "delflag");
            return this;
        }

        public Criteria andDelflagIn(List values) {
            addCriterion("delflag in", values, "delflag");
            return this;
        }

        public Criteria andDelflagNotIn(List values) {
            addCriterion("delflag not in", values, "delflag");
            return this;
        }

        public Criteria andDelflagBetween(String value1, String value2) {
            addCriterion("delflag between", value1, value2, "delflag");
            return this;
        }

        public Criteria andDelflagNotBetween(String value1, String value2) {
            addCriterion("delflag not between", value1, value2, "delflag");
            return this;
        }
    }
}