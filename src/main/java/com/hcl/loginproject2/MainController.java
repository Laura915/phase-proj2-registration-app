package com.hcl.loginproject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
public class MainController {
	@Autowired
	LoginService Service;
	
	@RequestMapping(value="/register", method = RequestMethod.GET)
	public String showRegisterPage(ModelMap model){
		return "register";
	}
	@RequestMapping(value="/register", method = RequestMethod.POST)
    public String resgisterUser(Model model, @ModelAttribute User user) {
		Service.saveUser(user.getName(), user.getUsername(), user.getPassword());
		model.addAttribute("name", user.getName());
		return "welcome";
		
	} 
	
}


