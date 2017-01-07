package com.hina.myapp.controller;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hina.myapp.dao.CoursesDAO;
import com.hina.myapp.dao.SubjectsDAO;
import com.hina.myapp.dao.facultyDAO;
import com.hina.myapp.pojo.Courses;
import com.hina.myapp.pojo.Faculty;
import com.hina.myapp.pojo.Subjects;
/**
 * Handles requests for the application home page.
 */
@Controller
public class CoursesAddController {
	 @Autowired
	 @Qualifier("facultydao")
	 facultyDAO facultydao;
	@RequestMapping(value = "/addBusinessCourses.htm")
	public ModelAndView homePage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ModelAndView mv = new ModelAndView();
		Faculty f=null;
		if(request.getParameter("check") == null)
		{
	  ArrayList<String> choices = new ArrayList();
	  ArrayList<String> alreadyPresent= new ArrayList();
	  ArrayList<String> notPresent = new ArrayList();
	 
		Courses c1= null;
		int size=0;
		for(int i=1;i<=5;i++)
		{
			if(request.getParameter("inlineCheckbox"+i+"")!= null )
			{choices.add(request.getParameter("inlineCheckbox"+i+""));
		}
		}
		
		HttpSession session = request.getSession();
		String email1 = (String)session.getAttribute("email");
		//facultyDAO facultydao = new facultyDAO();
	     f = facultydao.getFac(email1);
		String course = request.getParameter("courseName");
	/*	if(!course.equalsIgnoreCase("low")|| !course.equalsIgnoreCase("high"))
		{
			JSONObject obj = new JSONObject();
	        obj.put("messages", "you can enter only high or low ");
	        response.setContentType("application/json");
	        response.getWriter().print(obj);
	        return null;
		}*/
		CoursesDAO coursesdao = new CoursesDAO();
		Courses c = coursesdao.getCourseDetails(course);
		if(c == null)
		{
		coursesdao.create(course);
		c1 = coursesdao.getCourseDetails(course);
		}
		SubjectsDAO subjectsdao = new SubjectsDAO();
		ArrayList<Subjects> subjects = new ArrayList();
		subjects = (ArrayList<Subjects>) subjectsdao.getSubjectDetails(f);
			 size = choices.size();
		if(size <= 3)
		{
			if(!subjects.isEmpty())
			{
				for(int i=0;i<choices.size();i++)
				{
					String x = subjects.get(i).getSubjectName();
					if(isPresent(x,choices))
					alreadyPresent.add(x);
					else
						notPresent.add(x);
					}
		session.setAttribute("faculty", f);
	    mv.addObject("subjects",subjects);
	//	session.setAttribute("email",email);
		mv.setViewName("Courses");
			}
			else if(choices.size()> 3)
			{
			mv.setViewName("home");	
			}
			else
			{
		for(int j=0;j<choices.size();j++)
		{
			if(c != null && !isPresent(choices.get(j),alreadyPresent))
			{
		subjectsdao.create(choices.get(j), c, f);
			}
			else if(c1!=null && !isPresent(choices.get(j),alreadyPresent) )
				subjectsdao.create(choices.get(j), c1,f);	
			
		}
		
		}
	
			
			subjects = (ArrayList<Subjects>) subjectsdao.getSubjectDetails(f);
			//session.setAttribute("email", );
		//	session faculty = session.getAttribute("faculty");
			session.setAttribute("faculty", f);
			mv.addObject("subjects",subjects);
			mv.setViewName("Courses");
		}
		else
		{
			session.setAttribute("faculty", f);
	    mv.addObject("choices",choices);	
		mv.setViewName("Courses");	
		}
		}
		else
		{
		SubjectsDAO subs = new SubjectsDAO();
		HttpSession session = request.getSession();
		String email = (String)session.getAttribute("email");
		facultyDAO facdao = new facultyDAO();
		Faculty faculty = facdao.getFac(email);
		int duration = Integer.valueOf(request.getParameter("courseduration"));
		String subject = request.getParameter("subjects");
		int id = subs.getSubjectId(faculty, subject);
		String level = request.getParameter("courseLevel");
		subs.updateField(level,duration,id);
		session.setAttribute("faculty", faculty);
		}
		return mv;
	}
	public boolean isPresent(String course, ArrayList<String> list)
	{
		for(int i =0;i<list.size();i++)
		{
			if(course.equalsIgnoreCase(list.get(i)))
				return true;
		}
	return false;
	}
	
}

