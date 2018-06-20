package com.yunnuy.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@GetMapping("/")
	public ModelAndView index(String name) {
		ModelAndView mv = new ModelAndView("/index.html");
		mv.addObject("welcome", "welcome to use crud");
		return mv;
	}
}
