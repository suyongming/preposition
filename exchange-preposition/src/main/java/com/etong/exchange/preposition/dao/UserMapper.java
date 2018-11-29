package com.etong.exchange.preposition.dao;

import com.etong.exchange.preposition.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    User getUser(String password);

    List<User> findAll();

    int addUser(User user);
}
