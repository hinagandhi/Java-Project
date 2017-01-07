package com.hina.myapp.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hina.myapp.dao.StudentsDAO;
import com.hina.myapp.dao.batchDAO;
import com.hina.myapp.pojo.Batch;
import com.hina.myapp.pojo.Students;


/**
 * Handles requests for the application home page.
 */
@Controller
public class BlackboardController {
	 @Autowired
	 @Qualifier("batchdao")
	 batchDAO batchdao;
	@RequestMapping(value = "/blackboard.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mv = new ModelAndView();
	//	batchDAO batchdao = new batchDAO();
	    int studentId = Integer.valueOf(request.getParameter("stud"));
	    StudentsDAO studentsdao = new StudentsDAO();
	    Students student = studentsdao.getStudDetails(studentId);
		Set<Students> students = new HashSet<Students>();
		students.add(student);
		List<Batch> batches  = batchdao.getBatchesOfStudent(studentId);
		mv.addObject("student",student);
		mv.addObject("batchesStud",batches);
		mv.setViewName("Blackboard");
		return mv;
	}
}