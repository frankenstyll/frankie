package com.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value = { "/", "/home" })
	public ModelAndView index(HttpServletRequest request,Model model) {
		
		return new ModelAndView("redirect:");
	}
}
