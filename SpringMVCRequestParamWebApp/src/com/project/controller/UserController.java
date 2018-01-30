package com.project.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.User;


@Controller
public class UserController {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String redirect() {
		return "register";
	}
	
	@RequestMapping(value="/registerUser",method=RequestMethod.POST)
	public ModelAndView registerUser(@RequestParam Map<String, String> requestMap) {
		//@RequestParam("name") String name, @RequestParam(required=false, value= "email") String email, @RequestParam("age") int age, @RequestParam( "country")String country 
		System.out.println("In the method");
		User newUser = new User(requestMap.get("name"), requestMap.get("email"), Integer.parseInt(requestMap.get("age")), requestMap.get("country"));
		
		ModelAndView  mav = new ModelAndView("success");
		mav.addObject("newUser", newUser);
		return mav;
		
	}
}
