package com.etong.exchange.preposition.dao.general;

import com.etong.exchange.preposition.entity.MedicalItemCategory;

public interface MedicalItemCategoryMapper {
    int deleteByPrimaryKey(String id);

    int deleteByHosCode(String hosCode);

    int insert(MedicalItemCategory record);

    int insertSelective(MedicalItemCategory record);

    MedicalItemCategory selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MedicalItemCategory record);

    int updateByPrimaryKey(MedicalItemCategory record);
}