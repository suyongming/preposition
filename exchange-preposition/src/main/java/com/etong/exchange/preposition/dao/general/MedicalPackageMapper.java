package com.etong.exchange.preposition.dao.general;

import com.etong.exchange.preposition.entity.MedicalPackage;
import com.etong.exchange.preposition.entity.custom.MedicalPackageDTO;
import com.etong.exchange.preposition.entity.example.MedicalPackageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicalPackageMapper {
    int countByExample(MedicalPackageExample example);

    int deleteByExample(MedicalPackageExample example);

    int deleteByPrimaryKey(String id);

    int insert(MedicalPackageDTO record);

    int insertSelective(MedicalPackage record);

    List<MedicalPackage> selectByExample(MedicalPackageExample example);

    MedicalPackage selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MedicalPackage record, @Param("example") MedicalPackageExample example);

    int updateByExample(@Param("record") MedicalPackage record, @Param("example") MedicalPackageExample example);

    int updateByPrimaryKeySelective(MedicalPackage record);

    int updateByPrimaryKey(MedicalPackage record);

    int deleteByHosCode(String institution_code);
}