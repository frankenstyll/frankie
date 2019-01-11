package com.example.testspringboot;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = { "/", "/home" })
	public String index(Map<String, Object> model) {
		System.out.println("*****************HOME******************");
		return "home";
	}
}
