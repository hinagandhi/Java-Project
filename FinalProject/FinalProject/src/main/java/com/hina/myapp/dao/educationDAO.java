package com.hina.myapp.dao;

import com.hina.myapp.pojo.Faculty;
import com.hina.myapp.pojo.Education;
import org.hibernate.Query;
import org.springframework.stereotype.Component;

import java.util.List;

import org.hibernate.HibernateException;
@Component
public class educationDAO extends DAO {
	public educationDAO() {

	}
	  @SuppressWarnings("unchecked")
	public List<Education> getEduDetails(Faculty facultyEducation) { 
		  List<Education> eduList = null;
		  try {
				begin();
				Query q = getSession().createQuery("FROM Education WHERE facultyEducation =:facultyEducation");
				q.setParameter("facultyEducation", facultyEducation);
				 eduList = q.list();
				commit();
				return eduList;
			} catch (HibernateException e) {
				rollback();
			}
			return eduList;
			}
	 
	public Education create(String college, String majors, String country, String degree, Faculty fac) {
		Education edu = new Education();
		try {
			begin();
			edu.setCollege(college);
			edu.setCountry(country);
			edu.setDegree(degree);
			edu.setMajors(majors);
			edu.setFacultyEducation(fac);
			getSession().save(edu);

			commit();
			return edu;
		} catch (HibernateException e) {
			rollback();

		}

		return edu;
	}

}