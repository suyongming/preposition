package com.etong.exchange.preposition.dao.general;

import com.etong.exchange.preposition.entity.MedicalItem;

public interface MedicalItemMapper {
    int deleteByPrimaryKey(String id);

    int deleteByHosCode(String hosCode);

    int insert(MedicalItem record);

    int insertSelective(MedicalItem record);

    MedicalItem selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MedicalItem record);

    int updateByPrimaryKey(MedicalItem record);
}