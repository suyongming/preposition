package com.etong.exchange.preposition.dao;

import com.etong.exchange.preposition.entity.MedicalPrepositionModel;
import com.etong.exchange.preposition.entity.example.MedicalPrepositionModelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicalPrepositionModelMapper {
    int countByExample(MedicalPrepositionModelExample example);

    int deleteByExample(MedicalPrepositionModelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicalPrepositionModel record);

    int insertSelective(MedicalPrepositionModel record);

    List<MedicalPrepositionModel> selectByExample(MedicalPrepositionModelExample example);

    MedicalPrepositionModel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MedicalPrepositionModel record, @Param("example") MedicalPrepositionModelExample example);

    int updateByExample(@Param("record") MedicalPrepositionModel record, @Param("example") MedicalPrepositionModelExample example);

    int updateByPrimaryKeySelective(MedicalPrepositionModel record);

    int updateByPrimaryKey(MedicalPrepositionModel record);
}