package com.wasu.auto.dao;

import com.wasu.auto.model.actor;
import com.wasu.auto.model.actorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface actorMapper {
    int countByExample(actorExample example);

    int deleteByExample(actorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(actor record);

    int insertSelective(actor record);

    List<actor> selectByExample(actorExample example);

    actor selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") actor record, @Param("example") actorExample example);

    int updateByExample(@Param("record") actor record, @Param("example") actorExample example);

    int updateByPrimaryKeySelective(actor record);

    int updateByPrimaryKey(actor record);
}