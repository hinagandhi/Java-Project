package com.hina.myapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping(value = "/home.htm", method = RequestMethod.GET)
	public ModelAndView homePageFromLogo() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;

	}
	@RequestMapping(value = "/courseView.htm", method = RequestMethod.GET)
	public ModelAndView displayCourseDescription() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("courseDescription");
		return mv;

}
	@RequestMapping(value = "/setSchedule.htm", method = RequestMethod.GET)
	public ModelAndView displayView(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String a = request.getParameter("batchId");
		int b = Integer.parseInt(a);
		HttpSession session = request.getSession();
		session.setAttribute("batchId", a);
		mv.setViewName("SetSchedule");
		return mv;
	}
	@RequestMapping(value = "/forgotPassword.htm", method = RequestMethod.GET)
	public ModelAndView ForgotPassword(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String a = request.getParameter("email");
		mv.addObject(a);
		mv.setViewName("forgotPassword");
		return mv;
}
}