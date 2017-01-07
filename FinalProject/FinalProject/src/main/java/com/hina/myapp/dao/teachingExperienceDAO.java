package com.hina.myapp.dao;

import com.hina.myapp.pojo.Faculty;
import com.hina.myapp.pojo.teachingExperience;
import org.hibernate.HibernateException;

public class teachingExperienceDAO extends DAO {
	public teachingExperienceDAO() {

	}

	/*
	 * public Education getEduDetails(int id) { Education edu = null; try {
	 * begin(); Query q = getSession().createQuery(
	 * "FROM education WHERE educationId = :id"); q.setParameter("educationId",
	 * id); faculty = (Faculty) q.uniqueResult(); commit(); return faculty; }
	 * catch (HibernateException e) { rollback();
	 * 
	 * } return faculty; }
	 */
	public teachingExperience create(String institute, String teachingPosition,  Faculty fac) {
		teachingExperience teachExp = new teachingExperience();
		try {
			begin();
			teachExp.setInstituitionName(institute);
			teachExp.setPosition(teachingPosition);
			teachExp.setFacultyTeachingExp(fac);
			getSession().save(teachExp);

			commit();
			return teachExp;
		} catch (HibernateException e) {
			rollback();

		}

		return teachExp;
	}

}