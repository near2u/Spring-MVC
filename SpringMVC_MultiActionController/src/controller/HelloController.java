package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class HelloController extends MultiActionController {

	
	public ModelAndView empsave(HttpServletRequest req, HttpServletResponse res) throws Exception
	{
	
		System.out.println("In the employe save method...");
		
		ModelAndView mav = new ModelAndView("success");
		return mav;
		
	}
	
	public ModelAndView vishalempupdatekawade(HttpServletRequest req, HttpServletResponse res) throws Exception
	{
	
		System.out.println("In the employe update method...");
		
		ModelAndView mav = new ModelAndView("success");
		return mav;
	}
	
}
