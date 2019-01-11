package com.example.testspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = { "/", "/home" })
	public String home( Model model) {
		System.out.println("*****************HOME******************");
        return "home";
    }

	@GetMapping(value = { "/login"})
	public String login( Model model) {
		System.out.println("*****************HOME******************");
        model.addAttribute("name", "NAMEEE");
        return "login/login";
    }

}
