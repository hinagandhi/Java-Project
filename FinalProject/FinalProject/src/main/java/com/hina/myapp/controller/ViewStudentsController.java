package com.hina.myapp.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class ViewStudentsController {
	// @Autowired
	// facultyDAO facultyDAO;
	@RequestMapping(value = "ViewStudents.htm")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		String facultyId = request.getParameter("faculty");
		int id = Integer.valueOf(facultyId);
		String var = request.getParameter("var");
		int var1 = Integer.valueOf(var);
		batchDAO batchdao = new batchDAO();
	    facultyDAO fac = new facultyDAO();
	    Faculty faculty = fac.getFacDetails(id);
	    List<Batch> batches = batchdao.getBatchSize(faculty,var1);
	    mv.addObject("batches",batches);
	    mv.addObject("facultyId",id);
		mv.setViewName("ViewBatchStudents");
		return mv;
	}
}