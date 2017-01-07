package com.hina.myapp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hina.myapp.dao.StudentsDAO;
import com.hina.myapp.dao.SubjectsDAO;
import com.hina.myapp.dao.educationDAO;
import com.hina.myapp.dao.facultyDAO;
import com.hina.myapp.dao.industrialExperienceDAO;
import com.hina.myapp.dao.researchExperienceDAO;
import com.hina.myapp.pojo.Education;
import com.hina.myapp.pojo.Faculty;
import com.hina.myapp.pojo.GraduateStudents;
import com.hina.myapp.pojo.Students;
import com.hina.myapp.pojo.Subjects;
import com.hina.myapp.pojo.industrialExperience;
import com.hina.myapp.pojo.researchExperience;

/**
 * Handles requests for the application home page.
 */
@Controller
public class loginController {
	// @Autowired
	// facultyDAO facultyDAO;
	@RequestMapping(value = "/login.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		if (request.getParameter("registeredUser") == null) {

			mv.setViewName("login");
		} else if (request.getParameter("registeredUser").equalsIgnoreCase("checked")) {
			String username = request.getParameter("emailId");
			String password = request.getParameter("password");
			facultyDAO fc = new facultyDAO();
			StudentsDAO sd = new StudentsDAO();
			Faculty f = fc.authenticateUser(username, password);
			Students s = sd.authenticateUser(username, password) ;
			if(f!=null && s == null)
			{
			HttpSession session = request.getSession();
			session.setAttribute("faculty", f);
			session.setAttribute("email", f.getEmail());
			 String accountstatus = f.getAccountStatus();
			if(accountstatus.equalsIgnoreCase("inactive"))
			{
			if (f.getEmail().equalsIgnoreCase(username) && f.getPassword().equalsIgnoreCase(password)) {
				mv.addObject("username", f.getFirstName());
				mv.setViewName("facultySignUpEdu");
			}
			}
		else
		{
			mv.addObject("username", f.getFirstName());
			mv.addObject("faculty",f);
			educationDAO edu = new educationDAO();
		    ArrayList<Education> list = (ArrayList<Education>) edu.getEduDetails(f);
		    researchExperienceDAO res = new researchExperienceDAO();
			ArrayList<researchExperience> researchList = (ArrayList<researchExperience>) res.getResearchDetails(f);
		    industrialExperienceDAO indusExp = new industrialExperienceDAO();
			ArrayList<industrialExperience> industrialExperience = (ArrayList<industrialExperience>) indusExp.getIndusDetails(f);
			mv.addObject("indusList",industrialExperience);
			mv.addObject("researchList",researchList);
			mv.addObject("education",list);
			mv.setViewName("facultyDashboard");
			}
		}
		
		else{
			String username1 = request.getParameter("emailId");
			String password1 = request.getParameter("password"); 
			StudentsDAO studentsdao = new StudentsDAO();
			Students student = studentsdao.authenticateUser(username1, password1);
		if(student!= null)
		{
			if(student instanceof GraduateStudents)
			{
			SubjectsDAO subjectsdao = new SubjectsDAO();
			List<Subjects> subjects = subjectsdao.getGradSubjects();
			HttpSession session = request.getSession();
			session.setAttribute("subjects", subjects);
			mv.addObject("subjects",subjects);
			}
			else
			{
				SubjectsDAO subjectsdao = new SubjectsDAO();
				List<Subjects> subjects = subjectsdao.getUnderGradSubjects();
				HttpSession session = request.getSession();
				session.setAttribute("subjects", subjects);
				mv.addObject("subjects",subjects);
			}
			HttpSession session = request.getSession();
			session.setAttribute("student", student);
			mv.setViewName("StudentDashboard");}
		else
		{
			mv.setViewName("AuthenticationFailed");
		}
		}
			return mv;	
	}
		return mv;
}}
