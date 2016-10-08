package com.wasu.auto.dao;

import com.wasu.auto.model.team;
import com.wasu.auto.model.teamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface teamMapper {
    int countByExample(teamExample example);

    int deleteByExample(teamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(team record);

    int insertSelective(team record);

    List<team> selectByExample(teamExample example);

    team selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") team record, @Param("example") teamExample example);

    int updateByExample(@Param("record") team record, @Param("example") teamExample example);

    int updateByPrimaryKeySelective(team record);

    int updateByPrimaryKey(team record);
}