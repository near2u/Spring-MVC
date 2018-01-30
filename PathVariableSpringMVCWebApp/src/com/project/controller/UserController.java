package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping(value="/users")
public class UserController {

	
	@RequestMapping(value="/user/{userName}/{age}")
	public ModelAndView greet(@PathVariable("userName") String userName, @PathVariable("age") int age,@RequestParam("country") String country){
		
		return new ModelAndView("welcomePage", "welcomeMsg", "Hello: "+userName+" you are "+age+" years old and your are from "+country);
	}
}
