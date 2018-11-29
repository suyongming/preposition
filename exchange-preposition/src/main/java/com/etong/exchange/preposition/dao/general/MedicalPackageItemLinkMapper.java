package com.etong.exchange.preposition.dao.general;

import com.etong.exchange.preposition.entity.MedicalPackageItemLink;
import com.etong.exchange.preposition.entity.example.MedicalPackageItemLinkExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicalPackageItemLinkMapper {
    int countByExample(MedicalPackageItemLinkExample example);

    int deleteByExample(MedicalPackageItemLinkExample example);

    int deleteByPrimaryKey(String id);

    int insert(MedicalPackageItemLink record);

    int insertSelective(MedicalPackageItemLink record);

    List<MedicalPackageItemLink> selectByExample(MedicalPackageItemLinkExample example);

    MedicalPackageItemLink selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MedicalPackageItemLink record, @Param("example") MedicalPackageItemLinkExample example);

    int updateByExample(@Param("record") MedicalPackageItemLink record, @Param("example") MedicalPackageItemLinkExample example);

    int updateByPrimaryKeySelective(MedicalPackageItemLink record);

    int updateByPrimaryKey(MedicalPackageItemLink record);

    int deleteByHosCode(String institution_code);
}