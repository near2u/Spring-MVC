package com.hello.controller;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hello.service.MessageService;



@Controller
@RequestMapping(value="/")
public class HelloController {
	
	
	MessageService messageService;
	
	@RequestMapping( method=RequestMethod.GET)
	public ModelAndView welcome() {
	
		return new ModelAndView("welcomePage", "welcomeMsg", messageService.welcomeMessage());
		
		
	}
	

	@RequestMapping(value="/welcomeAgain", method=RequestMethod.GET)
	public ModelAndView welcomeAgain() {
	
		return new ModelAndView("welcomePage", "welcomeMsg", messageService.welcomeAgainMessage());
		
		
	}
	
	

}
