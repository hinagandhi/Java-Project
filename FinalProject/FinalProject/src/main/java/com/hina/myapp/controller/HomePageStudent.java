package com.hina.myapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hina.myapp.dao.StudentsDAO;
import com.hina.myapp.dao.SubjectsDAO;
import com.hina.myapp.pojo.GraduateStudents;
import com.hina.myapp.pojo.Students;
import com.hina.myapp.pojo.Subjects;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomePageStudent  {
	 @Autowired
	 @Qualifier("subjectsdao")
	 SubjectsDAO subjectsdao;
	@RequestMapping(value = "/homePage.htm", method = RequestMethod.GET)
	public ModelAndView homePage(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		int student1 = Integer.valueOf(request.getParameter("email"));
		StudentsDAO studentdao = new StudentsDAO();
		Students student = studentdao.getStudDetails(student1);
	if(student!= null)
	{
		if(student instanceof GraduateStudents)
		{
	//	SubjectsDAO subjectsdao = new SubjectsDAO();
		List<Subjects> subjects = subjectsdao.getGradSubjects();
		HttpSession session = request.getSession();
		session.setAttribute("subjects", subjects);
		mv.addObject("subjects",subjects);
		}
		HttpSession session = request.getSession();
		session.setAttribute("email", student);
		mv.setViewName("StudentDashboard");
		
	}
	return mv;
}
}
