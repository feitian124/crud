package com.yunnuy.crud.dao;

import java.util.List;

import org.beetl.sql.core.mapper.BaseMapper;

import com.yunnuy.crud.model.User;

public interface UserDao extends BaseMapper<User> {
    List<User> select(String name);
}