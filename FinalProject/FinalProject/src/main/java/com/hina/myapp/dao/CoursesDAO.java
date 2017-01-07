package com.hina.myapp.dao;

import com.hina.myapp.pojo.Courses;



import org.hibernate.HibernateException;
import org.hibernate.Query;

public class CoursesDAO extends DAO {
	public CoursesDAO() {

	}
	 @SuppressWarnings("unchecked")
	public Courses getCourseDetails(String courseName) { 
		  try {
			  Courses course = null;
				begin();
				Query q = getSession().createQuery("FROM Courses WHERE courseName =:courseName");
				q.setParameter("courseName", courseName);
				 course = (Courses) q.uniqueResult();
				commit();
				return course;
			} catch (HibernateException e) {
				rollback();
			}
			return null;
			}
	 
	public Courses create(String name) {
		Courses co = new Courses();
		try {
			begin();
			co.setCourseName(name);
			getSession().save(co);

			commit();
			return co;
		} catch (HibernateException e) {
			rollback();

		}

		return co;
	}

}