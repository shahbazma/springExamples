package com.sbz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="/" ,method = RequestMethod.GET)
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Welcome Hi!");
		mv.setViewName("index");
		return mv;

	}
	
	@RequestMapping(value="/hello" ,method = RequestMethod.GET)
	public ModelAndView sayHello2() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", "Welcome Hi!");
		mv.setViewName("hello");
		return mv;

	}

}
