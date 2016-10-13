package com.wasu.auto.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andChIdIsNull() {
            addCriterion("ch_id is null");
            return (Criteria) this;
        }

        public Criteria andChIdIsNotNull() {
            addCriterion("ch_id is not null");
            return (Criteria) this;
        }

        public Criteria andChIdEqualTo(String value) {
            addCriterion("ch_id =", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdNotEqualTo(String value) {
            addCriterion("ch_id <>", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdGreaterThan(String value) {
            addCriterion("ch_id >", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdGreaterThanOrEqualTo(String value) {
            addCriterion("ch_id >=", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdLessThan(String value) {
            addCriterion("ch_id <", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdLessThanOrEqualTo(String value) {
            addCriterion("ch_id <=", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdLike(String value) {
            addCriterion("ch_id like", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdNotLike(String value) {
            addCriterion("ch_id not like", value, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdIn(List<String> values) {
            addCriterion("ch_id in", values, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdNotIn(List<String> values) {
            addCriterion("ch_id not in", values, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdBetween(String value1, String value2) {
            addCriterion("ch_id between", value1, value2, "chId");
            return (Criteria) this;
        }

        public Criteria andChIdNotBetween(String value1, String value2) {
            addCriterion("ch_id not between", value1, value2, "chId");
            return (Criteria) this;
        }

        public Criteria andChNoIsNull() {
            addCriterion("ch_no is null");
            return (Criteria) this;
        }

        public Criteria andChNoIsNotNull() {
            addCriterion("ch_no is not null");
            return (Criteria) this;
        }

        public Criteria andChNoEqualTo(Integer value) {
            addCriterion("ch_no =", value, "chNo");
            return (Criteria) this;
        }

        public Criteria andChNoNotEqualTo(Integer value) {
            addCriterion("ch_no <>", value, "chNo");
            return (Criteria) this;
        }

        public Criteria andChNoGreaterThan(Integer value) {
            addCriterion("ch_no >", value, "chNo");
            return (Criteria) this;
        }

        public Criteria andChNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("ch_no >=", value, "chNo");
            return (Criteria) this;
        }

        public Criteria andChNoLessThan(Integer value) {
            addCriterion("ch_no <", value, "chNo");
            return (Criteria) this;
        }

        public Criteria andChNoLessThanOrEqualTo(Integer value) {
            addCriterion("ch_no <=", value, "chNo");
            return (Criteria) this;
        }

        public Criteria andChNoIn(List<Integer> values) {
            addCriterion("ch_no in", values, "chNo");
            return (Criteria) this;
        }

        public Criteria andChNoNotIn(List<Integer> values) {
            addCriterion("ch_no not in", values, "chNo");
            return (Criteria) this;
        }

        public Criteria andChNoBetween(Integer value1, Integer value2) {
            addCriterion("ch_no between", value1, value2, "chNo");
            return (Criteria) this;
        }

        public Criteria andChNoNotBetween(Integer value1, Integer value2) {
            addCriterion("ch_no not between", value1, value2, "chNo");
            return (Criteria) this;
        }

        public Criteria andChNameIsNull() {
            addCriterion("ch_name is null");
            return (Criteria) this;
        }

        public Criteria andChNameIsNotNull() {
            addCriterion("ch_name is not null");
            return (Criteria) this;
        }

        public Criteria andChNameEqualTo(String value) {
            addCriterion("ch_name =", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameNotEqualTo(String value) {
            addCriterion("ch_name <>", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameGreaterThan(String value) {
            addCriterion("ch_name >", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameGreaterThanOrEqualTo(String value) {
            addCriterion("ch_name >=", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameLessThan(String value) {
            addCriterion("ch_name <", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameLessThanOrEqualTo(String value) {
            addCriterion("ch_name <=", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameLike(String value) {
            addCriterion("ch_name like", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameNotLike(String value) {
            addCriterion("ch_name not like", value, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameIn(List<String> values) {
            addCriterion("ch_name in", values, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameNotIn(List<String> values) {
            addCriterion("ch_name not in", values, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameBetween(String value1, String value2) {
            addCriterion("ch_name between", value1, value2, "chName");
            return (Criteria) this;
        }

        public Criteria andChNameNotBetween(String value1, String value2) {
            addCriterion("ch_name not between", value1, value2, "chName");
            return (Criteria) this;
        }

        public Criteria andBynameIsNull() {
            addCriterion("byname is null");
            return (Criteria) this;
        }

        public Criteria andBynameIsNotNull() {
            addCriterion("byname is not null");
            return (Criteria) this;
        }

        public Criteria andBynameEqualTo(String value) {
            addCriterion("byname =", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameNotEqualTo(String value) {
            addCriterion("byname <>", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameGreaterThan(String value) {
            addCriterion("byname >", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameGreaterThanOrEqualTo(String value) {
            addCriterion("byname >=", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameLessThan(String value) {
            addCriterion("byname <", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameLessThanOrEqualTo(String value) {
            addCriterion("byname <=", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameLike(String value) {
            addCriterion("byname like", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameNotLike(String value) {
            addCriterion("byname not like", value, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameIn(List<String> values) {
            addCriterion("byname in", values, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameNotIn(List<String> values) {
            addCriterion("byname not in", values, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameBetween(String value1, String value2) {
            addCriterion("byname between", value1, value2, "byname");
            return (Criteria) this;
        }

        public Criteria andBynameNotBetween(String value1, String value2) {
            addCriterion("byname not between", value1, value2, "byname");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNull() {
            addCriterion("region_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("region_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(String value) {
            addCriterion("region_id =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(String value) {
            addCriterion("region_id <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(String value) {
            addCriterion("region_id >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(String value) {
            addCriterion("region_id >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(String value) {
            addCriterion("region_id <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(String value) {
            addCriterion("region_id <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLike(String value) {
            addCriterion("region_id like", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotLike(String value) {
            addCriterion("region_id not like", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<String> values) {
            addCriterion("region_id in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<String> values) {
            addCriterion("region_id not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(String value1, String value2) {
            addCriterion("region_id between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(String value1, String value2) {
            addCriterion("region_id not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andAssetidIsNull() {
            addCriterion("assetId is null");
            return (Criteria) this;
        }

        public Criteria andAssetidIsNotNull() {
            addCriterion("assetId is not null");
            return (Criteria) this;
        }

        public Criteria andAssetidEqualTo(String value) {
            addCriterion("assetId =", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidNotEqualTo(String value) {
            addCriterion("assetId <>", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidGreaterThan(String value) {
            addCriterion("assetId >", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidGreaterThanOrEqualTo(String value) {
            addCriterion("assetId >=", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidLessThan(String value) {
            addCriterion("assetId <", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidLessThanOrEqualTo(String value) {
            addCriterion("assetId <=", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidLike(String value) {
            addCriterion("assetId like", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidNotLike(String value) {
            addCriterion("assetId not like", value, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidIn(List<String> values) {
            addCriterion("assetId in", values, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidNotIn(List<String> values) {
            addCriterion("assetId not in", values, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidBetween(String value1, String value2) {
            addCriterion("assetId between", value1, value2, "assetid");
            return (Criteria) this;
        }

        public Criteria andAssetidNotBetween(String value1, String value2) {
            addCriterion("assetId not between", value1, value2, "assetid");
            return (Criteria) this;
        }

        public Criteria andFolderIsNull() {
            addCriterion("folder is null");
            return (Criteria) this;
        }

        public Criteria andFolderIsNotNull() {
            addCriterion("folder is not null");
            return (Criteria) this;
        }

        public Criteria andFolderEqualTo(String value) {
            addCriterion("folder =", value, "folder");
            return (Criteria) this;
        }

        public Criteria andFolderNotEqualTo(String value) {
            addCriterion("folder <>", value, "folder");
            return (Criteria) this;
        }

        public Criteria andFolderGreaterThan(String value) {
            addCriterion("folder >", value, "folder");
            return (Criteria) this;
        }

        public Criteria andFolderGreaterThanOrEqualTo(String value) {
            addCriterion("folder >=", value, "folder");
            return (Criteria) this;
        }

        public Criteria andFolderLessThan(String value) {
            addCriterion("folder <", value, "folder");
            return (Criteria) this;
        }

        public Criteria andFolderLessThanOrEqualTo(String value) {
            addCriterion("folder <=", value, "folder");
            return (Criteria) this;
        }

        public Criteria andFolderLike(String value) {
            addCriterion("folder like", value, "folder");
            return (Criteria) this;
        }

        public Criteria andFolderNotLike(String value) {
            addCriterion("folder not like", value, "folder");
            return (Criteria) this;
        }

        public Criteria andFolderIn(List<String> values) {
            addCriterion("folder in", values, "folder");
            return (Criteria) this;
        }

        public Criteria andFolderNotIn(List<String> values) {
            addCriterion("folder not in", values, "folder");
            return (Criteria) this;
        }

        public Criteria andFolderBetween(String value1, String value2) {
            addCriterion("folder between", value1, value2, "folder");
            return (Criteria) this;
        }

        public Criteria andFolderNotBetween(String value1, String value2) {
            addCriterion("folder not between", value1, value2, "folder");
            return (Criteria) this;
        }

        public Criteria andIsPlaybackIsNull() {
            addCriterion("is_playback is null");
            return (Criteria) this;
        }

        public Criteria andIsPlaybackIsNotNull() {
            addCriterion("is_playback is not null");
            return (Criteria) this;
        }

        public Criteria andIsPlaybackEqualTo(Integer value) {
            addCriterion("is_playback =", value, "isPlayback");
            return (Criteria) this;
        }

        public Criteria andIsPlaybackNotEqualTo(Integer value) {
            addCriterion("is_playback <>", value, "isPlayback");
            return (Criteria) this;
        }

        public Criteria andIsPlaybackGreaterThan(Integer value) {
            addCriterion("is_playback >", value, "isPlayback");
            return (Criteria) this;
        }

        public Criteria andIsPlaybackGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_playback >=", value, "isPlayback");
            return (Criteria) this;
        }

        public Criteria andIsPlaybackLessThan(Integer value) {
            addCriterion("is_playback <", value, "isPlayback");
            return (Criteria) this;
        }

        public Criteria andIsPlaybackLessThanOrEqualTo(Integer value) {
            addCriterion("is_playback <=", value, "isPlayback");
            return (Criteria) this;
        }

        public Criteria andIsPlaybackIn(List<Integer> values) {
            addCriterion("is_playback in", values, "isPlayback");
            return (Criteria) this;
        }

        public Criteria andIsPlaybackNotIn(List<Integer> values) {
            addCriterion("is_playback not in", values, "isPlayback");
            return (Criteria) this;
        }

        public Criteria andIsPlaybackBetween(Integer value1, Integer value2) {
            addCriterion("is_playback between", value1, value2, "isPlayback");
            return (Criteria) this;
        }

        public Criteria andIsPlaybackNotBetween(Integer value1, Integer value2) {
            addCriterion("is_playback not between", value1, value2, "isPlayback");
            return (Criteria) this;
        }

        public Criteria andIsBoardcastIsNull() {
            addCriterion("is_boardcast is null");
            return (Criteria) this;
        }

        public Criteria andIsBoardcastIsNotNull() {
            addCriterion("is_boardcast is not null");
            return (Criteria) this;
        }

        public Criteria andIsBoardcastEqualTo(Integer value) {
            addCriterion("is_boardcast =", value, "isBoardcast");
            return (Criteria) this;
        }

        public Criteria andIsBoardcastNotEqualTo(Integer value) {
            addCriterion("is_boardcast <>", value, "isBoardcast");
            return (Criteria) this;
        }

        public Criteria andIsBoardcastGreaterThan(Integer value) {
            addCriterion("is_boardcast >", value, "isBoardcast");
            return (Criteria) this;
        }

        public Criteria andIsBoardcastGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_boardcast >=", value, "isBoardcast");
            return (Criteria) this;
        }

        public Criteria andIsBoardcastLessThan(Integer value) {
            addCriterion("is_boardcast <", value, "isBoardcast");
            return (Criteria) this;
        }

        public Criteria andIsBoardcastLessThanOrEqualTo(Integer value) {
            addCriterion("is_boardcast <=", value, "isBoardcast");
            return (Criteria) this;
        }

        public Criteria andIsBoardcastIn(List<Integer> values) {
            addCriterion("is_boardcast in", values, "isBoardcast");
            return (Criteria) this;
        }

        public Criteria andIsBoardcastNotIn(List<Integer> values) {
            addCriterion("is_boardcast not in", values, "isBoardcast");
            return (Criteria) this;
        }

        public Criteria andIsBoardcastBetween(Integer value1, Integer value2) {
            addCriterion("is_boardcast between", value1, value2, "isBoardcast");
            return (Criteria) this;
        }

        public Criteria andIsBoardcastNotBetween(Integer value1, Integer value2) {
            addCriterion("is_boardcast not between", value1, value2, "isBoardcast");
            return (Criteria) this;
        }

        public Criteria andIshdchIsNull() {
            addCriterion("isHdCh is null");
            return (Criteria) this;
        }

        public Criteria andIshdchIsNotNull() {
            addCriterion("isHdCh is not null");
            return (Criteria) this;
        }

        public Criteria andIshdchEqualTo(Integer value) {
            addCriterion("isHdCh =", value, "ishdch");
            return (Criteria) this;
        }

        public Criteria andIshdchNotEqualTo(Integer value) {
            addCriterion("isHdCh <>", value, "ishdch");
            return (Criteria) this;
        }

        public Criteria andIshdchGreaterThan(Integer value) {
            addCriterion("isHdCh >", value, "ishdch");
            return (Criteria) this;
        }

        public Criteria andIshdchGreaterThanOrEqualTo(Integer value) {
            addCriterion("isHdCh >=", value, "ishdch");
            return (Criteria) this;
        }

        public Criteria andIshdchLessThan(Integer value) {
            addCriterion("isHdCh <", value, "ishdch");
            return (Criteria) this;
        }

        public Criteria andIshdchLessThanOrEqualTo(Integer value) {
            addCriterion("isHdCh <=", value, "ishdch");
            return (Criteria) this;
        }

        public Criteria andIshdchIn(List<Integer> values) {
            addCriterion("isHdCh in", values, "ishdch");
            return (Criteria) this;
        }

        public Criteria andIshdchNotIn(List<Integer> values) {
            addCriterion("isHdCh not in", values, "ishdch");
            return (Criteria) this;
        }

        public Criteria andIshdchBetween(Integer value1, Integer value2) {
            addCriterion("isHdCh between", value1, value2, "ishdch");
            return (Criteria) this;
        }

        public Criteria andIshdchNotBetween(Integer value1, Integer value2) {
            addCriterion("isHdCh not between", value1, value2, "ishdch");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andChtypeIsNull() {
            addCriterion("chType is null");
            return (Criteria) this;
        }

        public Criteria andChtypeIsNotNull() {
            addCriterion("chType is not null");
            return (Criteria) this;
        }

        public Criteria andChtypeEqualTo(Integer value) {
            addCriterion("chType =", value, "chtype");
            return (Criteria) this;
        }

        public Criteria andChtypeNotEqualTo(Integer value) {
            addCriterion("chType <>", value, "chtype");
            return (Criteria) this;
        }

        public Criteria andChtypeGreaterThan(Integer value) {
            addCriterion("chType >", value, "chtype");
            return (Criteria) this;
        }

        public Criteria andChtypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("chType >=", value, "chtype");
            return (Criteria) this;
        }

        public Criteria andChtypeLessThan(Integer value) {
            addCriterion("chType <", value, "chtype");
            return (Criteria) this;
        }

        public Criteria andChtypeLessThanOrEqualTo(Integer value) {
            addCriterion("chType <=", value, "chtype");
            return (Criteria) this;
        }

        public Criteria andChtypeIn(List<Integer> values) {
            addCriterion("chType in", values, "chtype");
            return (Criteria) this;
        }

        public Criteria andChtypeNotIn(List<Integer> values) {
            addCriterion("chType not in", values, "chtype");
            return (Criteria) this;
        }

        public Criteria andChtypeBetween(Integer value1, Integer value2) {
            addCriterion("chType between", value1, value2, "chtype");
            return (Criteria) this;
        }

        public Criteria andChtypeNotBetween(Integer value1, Integer value2) {
            addCriterion("chType not between", value1, value2, "chtype");
            return (Criteria) this;
        }

        public Criteria andPlayurlIsNull() {
            addCriterion("playURL is null");
            return (Criteria) this;
        }

        public Criteria andPlayurlIsNotNull() {
            addCriterion("playURL is not null");
            return (Criteria) this;
        }

        public Criteria andPlayurlEqualTo(String value) {
            addCriterion("playURL =", value, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlNotEqualTo(String value) {
            addCriterion("playURL <>", value, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlGreaterThan(String value) {
            addCriterion("playURL >", value, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlGreaterThanOrEqualTo(String value) {
            addCriterion("playURL >=", value, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlLessThan(String value) {
            addCriterion("playURL <", value, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlLessThanOrEqualTo(String value) {
            addCriterion("playURL <=", value, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlLike(String value) {
            addCriterion("playURL like", value, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlNotLike(String value) {
            addCriterion("playURL not like", value, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlIn(List<String> values) {
            addCriterion("playURL in", values, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlNotIn(List<String> values) {
            addCriterion("playURL not in", values, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlBetween(String value1, String value2) {
            addCriterion("playURL between", value1, value2, "playurl");
            return (Criteria) this;
        }

        public Criteria andPlayurlNotBetween(String value1, String value2) {
            addCriterion("playURL not between", value1, value2, "playurl");
            return (Criteria) this;
        }

        public Criteria andChlogourlIsNull() {
            addCriterion("chLogoURL is null");
            return (Criteria) this;
        }

        public Criteria andChlogourlIsNotNull() {
            addCriterion("chLogoURL is not null");
            return (Criteria) this;
        }

        public Criteria andChlogourlEqualTo(String value) {
            addCriterion("chLogoURL =", value, "chlogourl");
            return (Criteria) this;
        }

        public Criteria andChlogourlNotEqualTo(String value) {
            addCriterion("chLogoURL <>", value, "chlogourl");
            return (Criteria) this;
        }

        public Criteria andChlogourlGreaterThan(String value) {
            addCriterion("chLogoURL >", value, "chlogourl");
            return (Criteria) this;
        }

        public Criteria andChlogourlGreaterThanOrEqualTo(String value) {
            addCriterion("chLogoURL >=", value, "chlogourl");
            return (Criteria) this;
        }

        public Criteria andChlogourlLessThan(String value) {
            addCriterion("chLogoURL <", value, "chlogourl");
            return (Criteria) this;
        }

        public Criteria andChlogourlLessThanOrEqualTo(String value) {
            addCriterion("chLogoURL <=", value, "chlogourl");
            return (Criteria) this;
        }

        public Criteria andChlogourlLike(String value) {
            addCriterion("chLogoURL like", value, "chlogourl");
            return (Criteria) this;
        }

        public Criteria andChlogourlNotLike(String value) {
            addCriterion("chLogoURL not like", value, "chlogourl");
            return (Criteria) this;
        }

        public Criteria andChlogourlIn(List<String> values) {
            addCriterion("chLogoURL in", values, "chlogourl");
            return (Criteria) this;
        }

        public Criteria andChlogourlNotIn(List<String> values) {
            addCriterion("chLogoURL not in", values, "chlogourl");
            return (Criteria) this;
        }

        public Criteria andChlogourlBetween(String value1, String value2) {
            addCriterion("chLogoURL between", value1, value2, "chlogourl");
            return (Criteria) this;
        }

        public Criteria andChlogourlNotBetween(String value1, String value2) {
            addCriterion("chLogoURL not between", value1, value2, "chlogourl");
            return (Criteria) this;
        }

        public Criteria andChlogoNameIsNull() {
            addCriterion("chLogo_name is null");
            return (Criteria) this;
        }

        public Criteria andChlogoNameIsNotNull() {
            addCriterion("chLogo_name is not null");
            return (Criteria) this;
        }

        public Criteria andChlogoNameEqualTo(String value) {
            addCriterion("chLogo_name =", value, "chlogoName");
            return (Criteria) this;
        }

        public Criteria andChlogoNameNotEqualTo(String value) {
            addCriterion("chLogo_name <>", value, "chlogoName");
            return (Criteria) this;
        }

        public Criteria andChlogoNameGreaterThan(String value) {
            addCriterion("chLogo_name >", value, "chlogoName");
            return (Criteria) this;
        }

        public Criteria andChlogoNameGreaterThanOrEqualTo(String value) {
            addCriterion("chLogo_name >=", value, "chlogoName");
            return (Criteria) this;
        }

        public Criteria andChlogoNameLessThan(String value) {
            addCriterion("chLogo_name <", value, "chlogoName");
            return (Criteria) this;
        }

        public Criteria andChlogoNameLessThanOrEqualTo(String value) {
            addCriterion("chLogo_name <=", value, "chlogoName");
            return (Criteria) this;
        }

        public Criteria andChlogoNameLike(String value) {
            addCriterion("chLogo_name like", value, "chlogoName");
            return (Criteria) this;
        }

        public Criteria andChlogoNameNotLike(String value) {
            addCriterion("chLogo_name not like", value, "chlogoName");
            return (Criteria) this;
        }

        public Criteria andChlogoNameIn(List<String> values) {
            addCriterion("chLogo_name in", values, "chlogoName");
            return (Criteria) this;
        }

        public Criteria andChlogoNameNotIn(List<String> values) {
            addCriterion("chLogo_name not in", values, "chlogoName");
            return (Criteria) this;
        }

        public Criteria andChlogoNameBetween(String value1, String value2) {
            addCriterion("chLogo_name between", value1, value2, "chlogoName");
            return (Criteria) this;
        }

        public Criteria andChlogoNameNotBetween(String value1, String value2) {
            addCriterion("chLogo_name not between", value1, value2, "chlogoName");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("desc is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("desc is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("desc =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("desc <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("desc >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("desc >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("desc <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("desc <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String value) {
            addCriterion("desc like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String value) {
            addCriterion("desc not like", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("desc in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("desc not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("desc between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("desc not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andHdchidIsNull() {
            addCriterion("hdChId is null");
            return (Criteria) this;
        }

        public Criteria andHdchidIsNotNull() {
            addCriterion("hdChId is not null");
            return (Criteria) this;
        }

        public Criteria andHdchidEqualTo(String value) {
            addCriterion("hdChId =", value, "hdchid");
            return (Criteria) this;
        }

        public Criteria andHdchidNotEqualTo(String value) {
            addCriterion("hdChId <>", value, "hdchid");
            return (Criteria) this;
        }

        public Criteria andHdchidGreaterThan(String value) {
            addCriterion("hdChId >", value, "hdchid");
            return (Criteria) this;
        }

        public Criteria andHdchidGreaterThanOrEqualTo(String value) {
            addCriterion("hdChId >=", value, "hdchid");
            return (Criteria) this;
        }

        public Criteria andHdchidLessThan(String value) {
            addCriterion("hdChId <", value, "hdchid");
            return (Criteria) this;
        }

        public Criteria andHdchidLessThanOrEqualTo(String value) {
            addCriterion("hdChId <=", value, "hdchid");
            return (Criteria) this;
        }

        public Criteria andHdchidLike(String value) {
            addCriterion("hdChId like", value, "hdchid");
            return (Criteria) this;
        }

        public Criteria andHdchidNotLike(String value) {
            addCriterion("hdChId not like", value, "hdchid");
            return (Criteria) this;
        }

        public Criteria andHdchidIn(List<String> values) {
            addCriterion("hdChId in", values, "hdchid");
            return (Criteria) this;
        }

        public Criteria andHdchidNotIn(List<String> values) {
            addCriterion("hdChId not in", values, "hdchid");
            return (Criteria) this;
        }

        public Criteria andHdchidBetween(String value1, String value2) {
            addCriterion("hdChId between", value1, value2, "hdchid");
            return (Criteria) this;
        }

        public Criteria andHdchidNotBetween(String value1, String value2) {
            addCriterion("hdChId not between", value1, value2, "hdchid");
            return (Criteria) this;
        }

        public Criteria andFreqIsNull() {
            addCriterion("freq is null");
            return (Criteria) this;
        }

        public Criteria andFreqIsNotNull() {
            addCriterion("freq is not null");
            return (Criteria) this;
        }

        public Criteria andFreqEqualTo(String value) {
            addCriterion("freq =", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotEqualTo(String value) {
            addCriterion("freq <>", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqGreaterThan(String value) {
            addCriterion("freq >", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqGreaterThanOrEqualTo(String value) {
            addCriterion("freq >=", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqLessThan(String value) {
            addCriterion("freq <", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqLessThanOrEqualTo(String value) {
            addCriterion("freq <=", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqLike(String value) {
            addCriterion("freq like", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotLike(String value) {
            addCriterion("freq not like", value, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqIn(List<String> values) {
            addCriterion("freq in", values, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotIn(List<String> values) {
            addCriterion("freq not in", values, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqBetween(String value1, String value2) {
            addCriterion("freq between", value1, value2, "freq");
            return (Criteria) this;
        }

        public Criteria andFreqNotBetween(String value1, String value2) {
            addCriterion("freq not between", value1, value2, "freq");
            return (Criteria) this;
        }

        public Criteria andModIsNull() {
            addCriterion("mod is null");
            return (Criteria) this;
        }

        public Criteria andModIsNotNull() {
            addCriterion("mod is not null");
            return (Criteria) this;
        }

        public Criteria andModEqualTo(String value) {
            addCriterion("mod =", value, "mod");
            return (Criteria) this;
        }

        public Criteria andModNotEqualTo(String value) {
            addCriterion("mod <>", value, "mod");
            return (Criteria) this;
        }

        public Criteria andModGreaterThan(String value) {
            addCriterion("mod >", value, "mod");
            return (Criteria) this;
        }

        public Criteria andModGreaterThanOrEqualTo(String value) {
            addCriterion("mod >=", value, "mod");
            return (Criteria) this;
        }

        public Criteria andModLessThan(String value) {
            addCriterion("mod <", value, "mod");
            return (Criteria) this;
        }

        public Criteria andModLessThanOrEqualTo(String value) {
            addCriterion("mod <=", value, "mod");
            return (Criteria) this;
        }

        public Criteria andModLike(String value) {
            addCriterion("mod like", value, "mod");
            return (Criteria) this;
        }

        public Criteria andModNotLike(String value) {
            addCriterion("mod not like", value, "mod");
            return (Criteria) this;
        }

        public Criteria andModIn(List<String> values) {
            addCriterion("mod in", values, "mod");
            return (Criteria) this;
        }

        public Criteria andModNotIn(List<String> values) {
            addCriterion("mod not in", values, "mod");
            return (Criteria) this;
        }

        public Criteria andModBetween(String value1, String value2) {
            addCriterion("mod between", value1, value2, "mod");
            return (Criteria) this;
        }

        public Criteria andModNotBetween(String value1, String value2) {
            addCriterion("mod not between", value1, value2, "mod");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(String value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(String value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(String value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(String value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(String value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(String value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLike(String value) {
            addCriterion("rate like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotLike(String value) {
            addCriterion("rate not like", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<String> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<String> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(String value1, String value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(String value1, String value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andCasidIsNull() {
            addCriterion("casid is null");
            return (Criteria) this;
        }

        public Criteria andCasidIsNotNull() {
            addCriterion("casid is not null");
            return (Criteria) this;
        }

        public Criteria andCasidEqualTo(String value) {
            addCriterion("casid =", value, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidNotEqualTo(String value) {
            addCriterion("casid <>", value, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidGreaterThan(String value) {
            addCriterion("casid >", value, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidGreaterThanOrEqualTo(String value) {
            addCriterion("casid >=", value, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidLessThan(String value) {
            addCriterion("casid <", value, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidLessThanOrEqualTo(String value) {
            addCriterion("casid <=", value, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidLike(String value) {
            addCriterion("casid like", value, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidNotLike(String value) {
            addCriterion("casid not like", value, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidIn(List<String> values) {
            addCriterion("casid in", values, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidNotIn(List<String> values) {
            addCriterion("casid not in", values, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidBetween(String value1, String value2) {
            addCriterion("casid between", value1, value2, "casid");
            return (Criteria) this;
        }

        public Criteria andCasidNotBetween(String value1, String value2) {
            addCriterion("casid not between", value1, value2, "casid");
            return (Criteria) this;
        }

        public Criteria andCapidIsNull() {
            addCriterion("capid is null");
            return (Criteria) this;
        }

        public Criteria andCapidIsNotNull() {
            addCriterion("capid is not null");
            return (Criteria) this;
        }

        public Criteria andCapidEqualTo(String value) {
            addCriterion("capid =", value, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidNotEqualTo(String value) {
            addCriterion("capid <>", value, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidGreaterThan(String value) {
            addCriterion("capid >", value, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidGreaterThanOrEqualTo(String value) {
            addCriterion("capid >=", value, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidLessThan(String value) {
            addCriterion("capid <", value, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidLessThanOrEqualTo(String value) {
            addCriterion("capid <=", value, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidLike(String value) {
            addCriterion("capid like", value, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidNotLike(String value) {
            addCriterion("capid not like", value, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidIn(List<String> values) {
            addCriterion("capid in", values, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidNotIn(List<String> values) {
            addCriterion("capid not in", values, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidBetween(String value1, String value2) {
            addCriterion("capid between", value1, value2, "capid");
            return (Criteria) this;
        }

        public Criteria andCapidNotBetween(String value1, String value2) {
            addCriterion("capid not between", value1, value2, "capid");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
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