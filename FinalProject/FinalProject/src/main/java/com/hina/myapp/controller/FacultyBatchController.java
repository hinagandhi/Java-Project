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

import com.hina.myapp.dao.batchDAO;
import com.hina.myapp.dao.facultyDAO;
import com.hina.myapp.pojo.Batch;
import com.hina.myapp.pojo.Faculty;


/**
 * Handles requests for the application home page.
 */
@Controller
public class FacultyBatchController {
	 @Autowired
	 @Qualifier("fac")
	 facultyDAO fac;
	@RequestMapping(value = "/Batches.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		HttpSession session = request.getSession();
		Faculty faculty = (Faculty)session.getAttribute("faculty");
		
		int id = faculty.getFacultyId();
		batchDAO batchdao = new batchDAO();
	  //  facultyDAO fac = new facultyDAO();
	    Faculty faculty1 = fac.getFacDetails(id);
	    List<Batch> batches = batchdao.getBatchDetails(faculty1);
	    mv.addObject("batches",batches);
	    mv.addObject("facultyId",id);
		mv.setViewName("BatchesFaculty");
		return mv;
	}
}