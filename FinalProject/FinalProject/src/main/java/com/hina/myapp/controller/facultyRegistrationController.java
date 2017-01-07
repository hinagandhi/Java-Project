package com.hina.myapp.controller;

import com.hina.myapp.dao.educationDAO;
import com.hina.myapp.dao.facultyDAO;
import com.hina.myapp.dao.industrialExperienceDAO;
import com.hina.myapp.dao.researchExperienceDAO;
import com.hina.myapp.dao.teachingExperienceDAO;
import com.hina.myapp.pojo.Education;
import com.hina.myapp.pojo.Faculty;
import com.hina.myapp.pojo.industrialExperience;
import com.hina.myapp.pojo.researchExperience;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class facultyRegistrationController {
	private static int countTeach = 0;
    private static int countResearch = 0;
    private static int countIndustrial=0;
    Faculty f1=null;
    private static final String FILE_UPLOAD_DIRECTORY= "Profile Pics";
    private static final int MAX_FILE_SIZE = 1024 * 1024 * 5;
    private static final int THRESHOLD_SIZE= 1024 * 1024 * 3;
    private static final int MAX_REQUEST_SIZE= 1024 * 1024 * 50;
	 @Autowired
	 @Qualifier("edu")
	 educationDAO edu;
	@RequestMapping(value = "/facultySignUpEdu.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();	
		facultyDAO fd = new facultyDAO();
		
		  if (request.getParameter("check") == null && request.getParameter("var")==null) {
			String firsthighestdegree = request.getParameter("firsthighestdegree");
			String universityname = request.getParameter("universityname");
			String majors1 = request.getParameter("highestmajor");
			String place1 = request.getParameter("place1");
			String secondhighestdegree = request.getParameter("secondhighestdegree");
			String majors = request.getParameter("secondhighestmajor");
			String universityname2 = request.getParameter("universityname2");
			String place2 = request.getParameter("place2");
			String email = (String) request.getSession().getAttribute("email");
			Faculty f = fd.getFac(email);
			f.setAccountStatus("active");
			String accountstatus = "active";
			fd.update(email, accountstatus);
			//educationDAO edu = new educationDAO();
			edu.create(universityname, majors1, place1, firsthighestdegree, f);
			if(secondhighestdegree != null && majors != null && universityname2 != null )
			{
			if (!secondhighestdegree.isEmpty() && !majors.isEmpty() && !universityname2.isEmpty()) {
				edu.create(universityname2, majors, place2, secondhighestdegree, f);
			}
			}
			teachingExperienceDAO teachExp = new teachingExperienceDAO();
			if(request.getParameter("group1")!=null)
			{
			if(request.getParameter("group1").equalsIgnoreCase("Yes"))
			{
			String institute1 = request.getParameter("institutionName1");
			String teachingPosition1 = request.getParameter("teachingPosition1");
		//	int yearsOfTeaching1 = Integer.valueOf(request.getParameter("yearsOfTeaching1"));
			teachExp.create(institute1, teachingPosition1, f);
			}
			}
			for (int i = 2; i <= countTeach; i++) {
				String institute = request.getParameter("institutionName"+i+"");
				String teachingPosition = request.getParameter("teachingPosition"+i+"");
				//int yearsOfTeaching = Integer.valueOf(request.getParameter("yearsOfTeaching"+i+""));
				teachExp.create(institute, teachingPosition,f);

			}
			researchExperienceDAO researchExp = new researchExperienceDAO();
			if(request.getParameter("group2")!=null)
			{
			if(request.getParameter("group2").equalsIgnoreCase("RYes"))
			{
			String field1 = request.getParameter("field1");
			String publication1 = request.getParameter("publications1");
			researchExp.create(field1, publication1,f);
			}
			}
			for (int j = 2; j <= countResearch; j++) {
				String field = request.getParameter("field"+j+"");
				String publication = request.getParameter("publications"+j+"");
			//	int yearsOfTeaching = Integer.valueOf(request.getParameter("yearsOfTeaching"+i+""));
				researchExp.create(field, publication, f);
			}
			industrialExperienceDAO industrialExp = new industrialExperienceDAO();
			if(request.getParameter("group3")!=null)
			{
			if(request.getParameter("group3").equalsIgnoreCase("IYes"))
			{
			String industryName1 = request.getParameter("industryName1");
			String position1 = request.getParameter("position1");
			int years = Integer.valueOf(request.getParameter("yearsOfWorkExperience1"));
			industrialExp.create(industryName1, position1,years,f);
			}
			}
			for (int k = 2; k <= countIndustrial; k++) {
				String industryName = request.getParameter("industryName"+k+"");
				String position = request.getParameter("position"+k+"");
				int yearsOfIndus = Integer.valueOf(request.getParameter("yearsOfWorkExperience"+k+""));
				industrialExp.create(industryName, position,yearsOfIndus, f);
			}
			if(request.getParameter("uploadImage") != null )
			{      
				 
			}
			HttpSession session = request.getSession();
			String email1 = (String)session.getAttribute("email");		
			facultyDAO fc = new facultyDAO();
		      f1 = fc.getFac(email1);
			educationDAO edu1 = new educationDAO();
		    ArrayList<Education> list = (ArrayList<Education>) edu1.getEduDetails(f);
		    researchExperienceDAO res = new researchExperienceDAO();
			ArrayList<researchExperience> researchList = (ArrayList<researchExperience>) res.getResearchDetails(f);
		    industrialExperienceDAO indusExp = new industrialExperienceDAO();
			ArrayList<industrialExperience> industrialExperience = (ArrayList<industrialExperience>) indusExp.getIndusDetails(f);
			
			session.setAttribute("faculty", f1);
			mv.addObject("indusList",industrialExperience);
			mv.addObject("researchList",researchList);
			mv.addObject("education",list);
			mv.setViewName("facultyDashboard");
			mv.addObject("faculty",f1);
			mv.setViewName("facultyDashboard");
		} 
		  else  if(request.getParameter("check") == null &&( request.getParameter("var").equalsIgnoreCase("view")|| request.getParameter("var")!=null))
			{  String id = request.getParameter("facId");
			int facId = Integer.parseInt(id);
				facultyDAO fc = new facultyDAO();
			     Faculty f1 = fc.getFacDetails(facId);
			//	educationDAO edu1 = new educationDAO();
			    ArrayList<Education> list = (ArrayList<Education>) edu.getEduDetails(f1);
			    researchExperienceDAO res = new researchExperienceDAO();
				ArrayList<researchExperience> researchList = (ArrayList<researchExperience>) res.getResearchDetails(f1);
			    industrialExperienceDAO indusExp = new industrialExperienceDAO();
				ArrayList<industrialExperience> industrialExperience = (ArrayList<industrialExperience>) indusExp.getIndusDetails(f1);
				HttpSession session = request.getSession();
				session.setAttribute("faculty", f1);
				mv.addObject("indusList",industrialExperience);
				mv.addObject("researchList",researchList);
				mv.addObject("education",list);
				mv.setViewName("facultyDashboard");
				mv.addObject("faculty",f1);
				mv.setViewName("facultyDashboard");
			}
		else 
		
		{
			if(request.getParameter("count")!=null && !request.getParameter("count").isEmpty() )
			{
			int a = Integer.valueOf(request.getParameter("count"));
			countTeach = a;
			}
			if(request.getParameter("countR")!= null && !request.getParameter("countR").isEmpty() )
			{
			int b = Integer.valueOf(request.getParameter("countR"));
			countResearch = b;
			}
			if(request.getParameter("countI")!= null && !request.getParameter("countI").isEmpty()){
			int c = Integer.valueOf(request.getParameter("countI"));
			countIndustrial = c;}
		//	mv.setViewName("home");
		}
		
		
		return mv;
	}

}
