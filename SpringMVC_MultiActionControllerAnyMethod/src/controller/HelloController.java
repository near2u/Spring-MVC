package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class HelloController extends MultiActionController{

	
	public ModelAndView vishalempsavekawade(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.out.println("In the employee save");
		ModelAndView mav = new ModelAndView("success");
		return mav;
	
	}
	
	public ModelAndView vishalempupdatekawade(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.out.println("In the employee update");
		ModelAndView mav = new ModelAndView("success");
		return mav;
	}
	
}
