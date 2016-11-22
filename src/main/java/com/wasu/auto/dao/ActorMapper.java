package com.wasu.auto.dao;

import com.wasu.auto.model.Actor;
import com.wasu.auto.model.ActorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActorMapper {
    int countByExample(ActorExample example);

    int deleteByExample(ActorExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Actor record);

    int insertSelective(Actor record);

    List<Actor> selectByExample(ActorExample example);

    Actor selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Actor record, @Param("example") ActorExample example);

    int updateByExample(@Param("record") Actor record, @Param("example") ActorExample example);

    int updateByPrimaryKeySelective(Actor record);

    int updateByPrimaryKey(Actor record);
}