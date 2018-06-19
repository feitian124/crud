package com.yunnuy.crud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yunnuy.crud.dao.UserDao;
import com.yunnuy.crud.model.User;
import com.yunnuy.crud.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> select(String name) {
		return userDao.select(name);
	}

}
