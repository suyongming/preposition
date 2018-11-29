package com.etong.exchange.preposition.dao;

import com.etong.exchange.preposition.entity.MedicalPreposition;
import com.etong.exchange.preposition.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicalPropositionMapper {

    MedicalPreposition getConfigInfo(String institutionCode);

}
