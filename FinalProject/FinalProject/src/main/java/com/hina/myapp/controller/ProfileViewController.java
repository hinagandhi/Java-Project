package com.hina.myapp.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hina.myapp.dao.educationDAO;
import com.hina.myapp.dao.facultyDAO;
import com.hina.myapp.dao.industrialExperienceDAO;
import com.hina.myapp.dao.researchExperienceDAO;
import com.hina.myapp.pojo.Education;
import com.hina.myapp.pojo.Faculty;
import com.hina.myapp.pojo.industrialExperience;
import com.hina.myapp.pojo.researchExperience;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ProfileViewController {
	 @Autowired
	 @Qualifier("facultydao")
	 facultyDAO facultydao;
	@RequestMapping(value = "/profileView.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		int facultyId = Integer.valueOf(request.getParameter("var"));
	//	facultyDAO facultydao = new facultyDAO();
		Faculty faculty = facultydao.getFacDetails(facultyId);
		educationDAO edu1 = new educationDAO();
	    ArrayList<Education> list = (ArrayList<Education>) edu1.getEduDetails(faculty);
	    researchExperienceDAO res = new researchExperienceDAO();
		ArrayList<researchExperience> researchList = (ArrayList<researchExperience>) res.getResearchDetails(faculty);
	    industrialExperienceDAO indusExp = new industrialExperienceDAO();
		ArrayList<industrialExperience> industrialExperience = (ArrayList<industrialExperience>) indusExp.getIndusDetails(faculty);
		mv.addObject("indusList",industrialExperience);
		mv.addObject("researchList",researchList);
		mv.addObject("education",list);
		mv.addObject("faculty",faculty);
		mv.setViewName("facultyDashboardView");
		return mv;
}}
