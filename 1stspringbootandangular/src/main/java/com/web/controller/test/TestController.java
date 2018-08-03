package com.web.controller.test;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping(value = { "test/index" })
	public ModelAndView index(HttpServletRequest req, Model model) {
		return new ModelAndView("index.jsp");
	}

}
