package com.sbz.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sbz.model.Employee;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("login");
	}
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public ModelAndView showForm() {
//		return new ModelAndView("index", "employee", new Employee());
//	}

//	@RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
//	public String addEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult result, ModelMap model) {
//		if (result.hasErrors()) {
//			return "error";
//		}
//		model.addAttribute("name", employee.getName());
//		model.addAttribute("contactNumber", employee.getContactNumber());
//		model.addAttribute("place", employee.getPlace());
//		return "employeeView";
//	}

}
