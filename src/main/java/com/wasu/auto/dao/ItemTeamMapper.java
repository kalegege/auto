package com.wasu.auto.dao;

import com.wasu.auto.model.ItemTeam;
import com.wasu.auto.model.ItemTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ItemTeamMapper {
    int countByExample(ItemTeamExample example);

    int deleteByExample(ItemTeamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ItemTeam record);

    int insertSelective(ItemTeam record);

    List<ItemTeam> selectByExample(ItemTeamExample example);

    ItemTeam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ItemTeam record, @Param("example") ItemTeamExample example);

    int updateByExample(@Param("record") ItemTeam record, @Param("example") ItemTeamExample example);

    int updateByPrimaryKeySelective(ItemTeam record);

    int updateByPrimaryKey(ItemTeam record);
}