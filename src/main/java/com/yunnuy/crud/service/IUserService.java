package com.yunnuy.crud.service;

import java.util.List;

import com.yunnuy.crud.model.User;

public interface IUserService {
	List<User> select(String name);
}
