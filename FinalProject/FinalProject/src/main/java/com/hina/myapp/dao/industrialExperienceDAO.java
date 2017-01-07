package com.hina.myapp.dao;

import com.hina.myapp.pojo.Faculty;
import com.hina.myapp.pojo.industrialExperience;

import java.util.List;

import org.hibernate.Query;

import org.hibernate.HibernateException;

public class industrialExperienceDAO extends DAO {
	public industrialExperienceDAO() {

	}

	  public List<industrialExperience> getIndusDetails(Faculty facultyIndExp)
	  {
	  List<industrialExperience> indusExp = null;
	  try {
	  begin();
	  Query q = getSession().createQuery("FROM industrialExperience WHERE facultyIndExp = :facultyIndExp");
	  q.setParameter("facultyIndExp",facultyIndExp);
	  indusExp = q.list();
	  commit(); 
	  return indusExp;
	  }
	  catch (HibernateException e) { rollback();
	  
	  } return indusExp; 
	  }
	 
	public industrialExperience create(String industryName, String position,int yearsOfExperience, Faculty fac) {
		industrialExperience industrialExp = new industrialExperience();
		try {
			begin();
			industrialExp.setIndustryName(industryName);
			industrialExp.setPosition(position);
			industrialExp.setYearsOfExperience(yearsOfExperience);
			industrialExp.setFacultyIndExp(fac);
			getSession().save(industrialExp);

			commit();
			return industrialExp;
		} catch (HibernateException e) {
			rollback();

		}

		return industrialExp;
	}

}