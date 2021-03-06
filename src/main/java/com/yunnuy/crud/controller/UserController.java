package com.yunnuy.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yunnuy.crud.model.User;
import com.yunnuy.crud.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping("/select")
	public List<User> select(String name) {
		return userService.select(name);
	}
	
	@GetMapping("/index")
	public List<User> index() {
		return userService.all();
	}
}
