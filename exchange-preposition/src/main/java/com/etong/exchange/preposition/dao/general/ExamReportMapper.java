package com.etong.exchange.preposition.dao.general;

import com.etong.exchange.preposition.entity.ExamReport;
import com.etong.exchange.preposition.entity.example.ExamReportExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExamReportMapper {
    int countByExample(ExamReportExample example);

    int deleteByExample(ExamReportExample example);

    int deleteByPrimaryKey(String id);

    int insert(ExamReport record);

    int insertSelective(ExamReport record);

    List<ExamReport> selectByExample(ExamReportExample example);

    ExamReport selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ExamReport record, @Param("example") ExamReportExample example);

    int updateByExample(@Param("record") ExamReport record, @Param("example") ExamReportExample example);

    int updateByPrimaryKeySelective(ExamReport record);

    int updateByPrimaryKey(ExamReport record);
}