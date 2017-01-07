package com.hina.myapp.controller;

import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hina.myapp.dao.StudentsDAO;
import com.hina.myapp.dao.batchDAO;
import com.hina.myapp.dao.facultyDAO;
import com.hina.myapp.pojo.Batch;
import com.hina.myapp.pojo.Faculty;
import com.hina.myapp.pojo.Students;

/**
 * Handles requests for the application home page.
 */
@Controller
public class courseRegistrationController {
	 @Autowired
	 @Qualifier("fac")
	 facultyDAO fac;
	@RequestMapping(value = "courseRegister.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		String subject = request.getParameter("subjectname");
		int faculty = Integer.valueOf(request.getParameter("facultyID"));
		//facultyDAO  fac = new facultyDAO();
		Faculty facdetails = fac.getFacDetails(faculty);
		int studentId = Integer.valueOf(request.getParameter("studentId"));
		batchDAO batchdao = new batchDAO();
		Long result = batchdao.getBatchId(facdetails, subject);
		StudentsDAO studentsdao = new StudentsDAO();
		int batchid=0;
		if(result == 0l)
		{
			/* JSONObject obj = new JSONObject();
			 obj.put("result","No data found");
			 response.setContentType("application/json");
			 response.getWriter().write(obj.toString());*/
			Set<Students> studs = new HashSet<Students>();
			Set<Batch> batche = new HashSet<Batch>();
			Students stud = studentsdao.getStudDetails(studentId);
			stud.setBatch(batche);
			studs.add(stud);
			Batch batches =batchdao.create(subject, facdetails,studs, batche);
		     batchid= batches.getBatchId();  
		     HttpSession session = request.getSession();
		     session.setAttribute("email", stud);
		     session.setAttribute("batches", batches);
		}
		else if(!checkAlreadyPresent(facdetails,studentId,subject))
		{
			
		Batch batch = batchdao.getBatchDetails(facdetails, subject);
		Set<Students> studs = batch.getStudents();
		Students stud = studentsdao.getStudDetails(studentId);
		Set<Batch> batche = new HashSet<Batch>();
		studs.add(stud);
	    batch.setStudents(studs);
	    stud.setBatch(batche);
	    int batchId = batch.getBatchId();
	    batchdao.update(batchId, studs);  
	    HttpSession session = request.getSession();
	     session.setAttribute("email", stud);
	     session.setAttribute("batches", batch);
		}
		else if(checkAlreadyPresent(facdetails,studentId,subject))
		{
			JSONObject obj = new JSONObject();
	        obj.put("messages", "you are already registered");
	        response.setContentType("application/json");
	        response.getWriter().print(obj);
	        }
		else
		{}
		return null;
		}
		

	public boolean checkAlreadyPresent(Faculty facdetails,int studentId, String subject)
	{
		batchDAO batchdao = new batchDAO();
		Batch b = batchdao.getBatchDetails(facdetails, subject);
		Set<Students> s = b.getStudents();
		for(Students t: s)
		{
			if(t.getStudentId() == studentId )
				return true;
		}
	return false;	
	}
	}
