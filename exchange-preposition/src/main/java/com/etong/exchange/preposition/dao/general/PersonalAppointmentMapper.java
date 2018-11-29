package com.etong.exchange.preposition.dao.general;

import com.etong.exchange.preposition.entity.PersonalAppointment;
import com.etong.exchange.preposition.entity.custom.PersonalAppointmentDTO;
import com.etong.exchange.preposition.entity.example.PersonalAppointmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonalAppointmentMapper {
    int countByExample(PersonalAppointmentExample example);

    int deleteByExample(PersonalAppointmentExample example);

    int deleteByPrimaryKey(String id);

    int insert(PersonalAppointmentDTO record);

    int insertSelective(PersonalAppointmentDTO record);

    List<PersonalAppointment> selectByExample(PersonalAppointmentExample example);

    PersonalAppointment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PersonalAppointmentDTO record, @Param("example") PersonalAppointmentExample example);

    int updateByExample(@Param("record") PersonalAppointmentDTO record, @Param("example") PersonalAppointmentExample example);

    int updateByPrimaryKeySelective(PersonalAppointmentDTO record);

    int updateByPrimaryKey(PersonalAppointmentDTO record);
}