package com.yunnuy.crud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunnuy.crud.base.BaseServiceImpl;
import com.yunnuy.crud.dao.UserDao;
import com.yunnuy.crud.model.User;
import com.yunnuy.crud.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> select(String name) {
		return userDao.select(name);
	}

}
