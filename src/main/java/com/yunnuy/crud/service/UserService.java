package com.yunnuy.crud.service;

import java.util.List;

import com.yunnuy.crud.base.BaseService;
import com.yunnuy.crud.model.User;

public interface UserService extends BaseService<User> {
	List<User> select(String name);
}
