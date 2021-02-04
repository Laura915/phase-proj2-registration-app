package com.hcl.loginproject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class MainController {
	@Autowired
	LoginService service;
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String showRegisterPage(ModelMap model){
		return "register";
	}
	
}


