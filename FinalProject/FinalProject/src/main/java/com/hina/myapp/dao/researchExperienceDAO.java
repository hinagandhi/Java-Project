package com.hina.myapp.dao;

import com.hina.myapp.pojo.Faculty;
import com.hina.myapp.pojo.researchExperience;

import java.util.List;
import org.hibernate.Query;

import org.hibernate.HibernateException;

public class researchExperienceDAO extends DAO {
	public researchExperienceDAO() {

	}

	
	  @SuppressWarnings("unchecked")
	public List<researchExperience> getResearchDetails(Faculty facultyResearchExp) { 
		  List<researchExperience> research = null;
	  try {
	  begin(); 
	  Query q =  getSession().createQuery("FROM researchExperience WHERE facultyResearchExp = :facultyResearchExp"); 
	  q.setParameter("facultyResearchExp",facultyResearchExp);
	  research =  q.list();
		commit();
		return research;
	  }
	  catch (HibernateException e) { rollback();
	  
	  } return research;
	  }
	
	public researchExperience create(String field, String publication, Faculty fac) {
		researchExperience researchExp = new researchExperience();
		try {
			begin();
			researchExp.setPublication(publication);
			researchExp.setReserachArea(field);
			researchExp.setFacultyResearchExp(fac);
			getSession().save(researchExp);

			commit();
			return researchExp;
		} catch (HibernateException e) {
			rollback();

		}

		return researchExp;
	}

}