package com.etong.exchange.preposition.dao.general;

import com.etong.exchange.preposition.entity.MedicalItem;
import com.etong.exchange.preposition.entity.MedicalItemCategoryLink;

import java.util.List;
import java.util.Map;

public interface MedicalItemCategoryLinkMapper {
    int deleteByPrimaryKey(String id);

    int deleteByHosCode(String hosCode);

    int insert(MedicalItemCategoryLink record);

    int insertSelective(MedicalItemCategoryLink record);

    MedicalItemCategoryLink selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MedicalItemCategoryLink record);

    int updateByPrimaryKey(MedicalItemCategoryLink record);

    int insertByItemsOfCategory(Map conditions);
}