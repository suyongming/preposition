package com.etong.exchange.preposition.dao.general;

import com.etong.exchange.preposition.entity.LabIndex;
import com.etong.exchange.preposition.entity.example.LabIndexExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LabIndexMapper {
    int countByExample(LabIndexExample example);

    int deleteByExample(LabIndexExample example);

    int deleteByPrimaryKey(String id);

    int insert(LabIndex record);

    int insertSelective(LabIndex record);

    List<LabIndex> selectByExample(LabIndexExample example);

    LabIndex selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LabIndex record, @Param("example") LabIndexExample example);

    int updateByExample(@Param("record") LabIndex record, @Param("example") LabIndexExample example);

    int updateByPrimaryKeySelective(LabIndex record);

    int updateByPrimaryKey(LabIndex record);
}