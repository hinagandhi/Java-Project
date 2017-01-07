package com.hina.myapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hina.myapp.dao.GradstudentsDAO;
import com.hina.myapp.dao.HighSchoolStudentsDAO;
import com.hina.myapp.dao.StudentsDAO;
import com.hina.myapp.dao.SubjectsDAO;
import com.hina.myapp.dao.facultyDAO;
import com.hina.myapp.pojo.Faculty;
import com.hina.myapp.pojo.GraduateStudents;
import com.hina.myapp.pojo.HighSchoolStudents;
import com.hina.myapp.pojo.Students;
import com.hina.myapp.pojo.Subjects;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SignUpController {
	@RequestMapping(value = "/signUp.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		facultyDAO fd = new facultyDAO();
		StudentsDAO studs = new StudentsDAO();
		if (request.getParameter("registeredUser") == null)
		{
			mv.setViewName("signUp");
		}
		else if(request.getParameter("registeredUser").equalsIgnoreCase("checked"))
			{
				String fname = request.getParameter("studfname");
				String lname = request.getParameter("studlname");
				String email = request.getParameter("emailId");
				String password = request.getParameter("password");
				String studentType = request.getParameter("studentType");
				GradstudentsDAO grads = new GradstudentsDAO();
				if(studentType.equalsIgnoreCase("College Student"))
				{
			
			StudentsDAO studs1 = new StudentsDAO();
			facultyDAO fac1 = new facultyDAO();
			Faculty fd1 = fac1.getFac(email);
			Students ss = studs1.validating(email);
			if(ss == null && fd1 == null)
			{
		GraduateStudents stud=	grads.create(fname, lname, email, password, studentType);
		SubjectsDAO subjectsdao = new SubjectsDAO();
		List<Subjects> subjects = subjectsdao.getGradSubjects();
		HttpSession session = request.getSession();
			session.setAttribute("email",stud);
			session.setAttribute("stud",stud);
			mv.addObject("subjects",subjects);
			mv.setViewName("StudentDashboard");
			}
				else
				{
					mv.addObject("alreadyExists","true");
					mv.setViewName("AuthenticationFailed");
				}
				}
				else
				{
					StudentsDAO studs1 = new StudentsDAO();
					facultyDAO fac1 = new facultyDAO();
					Faculty fd1 = fac1.getFac(email);
					Students ss = studs1.validating(email);
					if(ss == null && fd1 == null){
				HighSchoolStudentsDAO high = new HighSchoolStudentsDAO();
			HighSchoolStudents stud = high.create(fname, lname, email, password, studentType);
			HttpSession session = request.getSession();
			session.setAttribute("student", stud);
				mv.setViewName("StudentDashboard");
					}
				
				else
				{
					mv.addObject("alreadyExists","true");
					mv.setViewName("AuthenticationFailed");
				}
				}}
		
		else if(request.getParameter("registeredUser").equalsIgnoreCase("faculty")){
			String fname = request.getParameter("facfname");
			String lname = request.getParameter("faclname");
			String email = request.getParameter("emailId");
			String password = request.getParameter("password");
			Faculty f = fd.getFac(email);
			Students s = studs.validating(email);
			if(f!=null || s!=null)
			{
				mv.addObject("alreadyExists","true");
				mv.setViewName("AuthenticationFailed");
			}
			else
			{
			Faculty fac = fd.create(fname, lname, email, password);
			String accountStatus = fac.getAccountStatus();
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			session.setAttribute("faculty", fac);
			mv.addObject("username", fname);
			mv.addObject("accountStatus", accountStatus);
			mv.setViewName("facultySignUpEdu");
			}
		}

		return mv;
	}

}
