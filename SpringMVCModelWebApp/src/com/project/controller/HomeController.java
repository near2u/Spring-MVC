package com.project.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class HomeController {

	/************Using @ModelAttribute******************/
	@RequestMapping(value="/")
	public String welcome(Model model) {
		
			
		return "welcome";
	}
	
	
	@ModelAttribute
	public void modelAtt(Model model) {
		
		model.addAttribute("welcomeMsg", "WElcome to the spring world using @modelAttribute");
		model.addAttribute("greetMsg", "Hello!!");
	}
	/*********************Using Map Classs******************/
	/*@RequestMapping(value="/")
	public String welcome(Map<String, String> map) {
		
		
		map.put("welcomeMsg", "WElcome to the spring world using /MAP");
		map.put("greetMsg", "Hello!!");
		return "welcome";
	}*/
	
	/*********Using Model Class****************/
	
	/*@RequestMapping(value="/")
	public String welcome(Model model) {
		
		
		model.addAttribute("welcomeMsg", "WElcome to the spring world");
		model.addAttribute("greetMsg", "Hello!!");
		return "welcome";
	}*/
}
