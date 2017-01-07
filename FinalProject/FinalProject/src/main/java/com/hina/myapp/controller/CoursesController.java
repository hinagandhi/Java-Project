package com.hina.myapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hina.myapp.dao.SubjectsDAO;
import com.hina.myapp.dao.facultyDAO;
import com.hina.myapp.pojo.Faculty;
import com.hina.myapp.pojo.Subjects;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CoursesController {
	 @Autowired
	 @Qualifier("fac")
	 facultyDAO fac;
	@RequestMapping(value = "/Courses.htm")
	public ModelAndView homePage(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		if(request.getParameter("faculty")!= null)
		{
		String email = request.getParameter("faculty");	
		//facultyDAO  fac = new facultyDAO();
		Faculty fac1 = fac.getFac(email);
		SubjectsDAO sub = new SubjectsDAO();
		List<Subjects> list = sub.getSubjectDetails(fac1);
		HttpSession session = request.getSession();
		session.setAttribute("subList", list);
		session.setAttribute("faculty", fac1);
		mv.setViewName("Courses");
		}
		
		
		else
		{
			String course = request.getParameter("course");
			switch(course)
			{
			case "Business":
			mv.setViewName("BusinessCourse");
			break;
			case "Arts and Humanities":
				mv.setViewName("ArtsandHumanities");
				break;
			case "Computer Science":
			mv.setViewName("ComputerScience");
			break;
			case "Data Science":
				mv.setViewName("DataScience");
				break;
			case "Life Sciences":
				mv.setViewName("LifeSciences");
				break;
			case "Math and Logic":
				mv.setViewName("MathandLogic");
				break;
			case "Social Sciences":
				mv.setViewName("SocialSciences");
				break;	
			}
		}
		return mv;
	}
}
