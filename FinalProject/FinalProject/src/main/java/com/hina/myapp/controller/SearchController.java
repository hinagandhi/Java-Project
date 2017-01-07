package com.hina.myapp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hina.myapp.dao.SubjectsDAO;
import com.hina.myapp.pojo.Subjects;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SearchController {

	@RequestMapping(value = "/search.htm", method = RequestMethod.GET)
	public ModelAndView homePage(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String searchCriteria = request.getParameter("criteria");
		String a1 =null;
		if(searchCriteria == null)
		{
			HttpSession session = request.getSession();
			 a1 = (String)session.getAttribute("searchCriteria");
		}
		String c = request.getParameter("criteria1");
		if(searchCriteria!= null && !searchCriteria.isEmpty()&&  c == null )
		{SubjectsDAO subjectsdao = new SubjectsDAO();
		List<Subjects> searchedResult = subjectsdao.getSearchResults(searchCriteria);
		HttpSession session = request.getSession();
		session.setAttribute("searchCriteria", searchCriteria);
		mv.addObject("searchedResult",searchedResult);
		mv.setViewName("SearchedResult");}
		if(request.getParameter("criteria1") == null)
		{
			mv.setViewName("SearchedResult");
			return mv;
		}
		else if(request.getParameter("criteria1").equalsIgnoreCase("find") )
		{
			String search = request.getParameter("thisCheck");
			HttpSession session = request.getSession();
			String name = a1;
			if(search.equals("1") || search.equals("2") || search.equals("3"))
			{
				int a = Integer.valueOf(search);
				SubjectsDAO subs = new SubjectsDAO();
				List<Subjects> list =  subs.getSearchedResult(name, a);
				JSONObject obj = new JSONObject();
			     JSONArray  searchedlist = new JSONArray();
			     for(int i= 0;i< list.size();i++)
			     {
			     JSONObject items = new JSONObject();
			     items.put("course",list.get(i).getSubjectName());
			     items.put("courseDuration", list.get(i).getCourseDuration());
			     items.put("faculty", list.get(i).getFaculty().getFirstName()+" "+list.get(i).getFaculty().getLastName());
			     searchedlist.put(items);
			     }
			        obj.put("searchedlist", searchedlist);
			        try {
						response.getWriter().print(obj);
						return null;
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			       }
				
		}
		else
		{
			mv.setViewName("SearchedResult");
		}
		return mv;
	
	}
}
