package com.etong.exchange.preposition.entity;

import com.etong.exchange.preposition.entity.custom.BaseModel;
import lombok.Data;

import java.util.List;

@Data
public class MedicalItemCategory extends BaseModel {
    private String code;// 分类代码

    private String name;// 分类名称

    private String avatar;// 分类图标

    private Integer sort;// 排序字段

    private List<MedicalItem> items;

    private Integer type;// 0：全部项目；1：推荐加项包

    private Integer itemShow;//加项预约显示：0：显示；1：不显示

    private Integer genderFilter;//性别过滤：1-男、不限，2-女、不限
}
