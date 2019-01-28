package com.example.testspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
//	@RequestMapping(value = { "/", "/login" })
//	public String login( Model model) {
//		System.out.println("*****************RESPONSE TO LOGIN PAGE******************");
//        return "page/login";
//    }
	
	@RequestMapping(value = { "/", "/login" })
	public ModelAndView login( Model model) {
		System.out.println("*****************RESPONSE TO LOGIN PAGE******************");
        return new ModelAndView("page/login");
    }
	
	@RequestMapping(value = { "/loginAuthorize" })
	public ModelAndView loginAuthorize(Model model ) {
		System.out.println("*****************LOGINGIN******************");
//		if( null != loginForm) {
//			return new ModelAndView("page/index");
		return new ModelAndView("page/testAngularScript");
//		}else {
//			model.addAttribute("Email or password is not currect");
//			return "page/login";
//		}
	}
	
	@RequestMapping(value = { "/index" })
	public String indexPage(Model model ) {
		return "page/index";
	}
	
	@RequestMapping(value = { "/blank" })
	public String blankPage(Model model ) {
		return "page/blank";
	}
	@RequestMapping(value = { "/buttons" })
	public String buttonsPage(Model model ) {
		return "page/buttons";
	}
	@RequestMapping(value = { "/flot" })
	public String flotPage(Model model ) {
		return "page/flot";
	}
	@RequestMapping(value = { "/forms" })
	public String formsPage(Model model ) {
		return "page/forms";
	}
	@RequestMapping(value = { "/grid" })
	public String gridPage(Model model ) {
		return "page/grid";
	}
	@RequestMapping(value = { "/icons" })
	public String iconsPage(Model model ) {
		return "page/icons";
	}
	@RequestMapping(value = { "/morris" })
	public String morrisPage(Model model ) {
		return "page/morris";
	}
	@RequestMapping(value = { "/motifications" })
	public String motificationsPage(Model model ) {
		return "page/motifications";
	}
	@RequestMapping(value = { "/panels-wells" })
	public String panelsWellsPage(Model model ) {
		return "page/panels-wells";
	}
	@RequestMapping(value = { "/tables" })
	public String tablesPage(Model model ) {
		return "page/tables";
	}
	@RequestMapping(value = { "/typography" })
	public String typographyPage(Model model ) {
		return "page/typography";
	}
	

//	@GetMapping(value = { "/login"})
//	public String login( Model model) {
//		System.out.println("*****************HOME******************");
//        model.addAttribute("name", "NAMEEE");
//        return "login/login";
//    }

}
