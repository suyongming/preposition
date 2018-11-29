package com.etong.exchange.preposition.dao.general;

import com.etong.exchange.preposition.entity.MedicalReport;
import com.etong.exchange.preposition.entity.custom.MedicalReportDTO;
import com.etong.exchange.preposition.entity.example.MedicalReportExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicalReportMapper {
    int countByExample(MedicalReportExample example);

    int deleteByExample(MedicalReportExample example);

    int deleteByPrimaryKey(String id);

    int insert(MedicalReport record);

    int insertSelective(MedicalReport record);

    List<MedicalReport> selectByExample(MedicalReportExample example);

    MedicalReport selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MedicalReport record, @Param("example") MedicalReportExample example);

    int updateByExample(@Param("record") MedicalReport record, @Param("example") MedicalReportExample example);

    int updateByPrimaryKeySelective(MedicalReport record);

    int updateByPrimaryKey(MedicalReport record);
}