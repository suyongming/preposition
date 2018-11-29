package com.etong.exchange.preposition.dao.general;

import com.etong.exchange.preposition.entity.LabReport;
import com.etong.exchange.preposition.entity.example.LabReportExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LabReportMapper {
    int countByExample(LabReportExample example);

    int deleteByExample(LabReportExample example);

    int deleteByPrimaryKey(String id);

    int insert(LabReport record);

    int insertSelective(LabReport record);

    List<LabReport> selectByExample(LabReportExample example);

    LabReport selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") LabReport record, @Param("example") LabReportExample example);

    int updateByExample(@Param("record") LabReport record, @Param("example") LabReportExample example);

    int updateByPrimaryKeySelective(LabReport record);

    int updateByPrimaryKey(LabReport record);
}