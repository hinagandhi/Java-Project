package com.hina.myapp.dao;

import com.hina.myapp.pojo.GraduateStudents;
import org.hibernate.HibernateException;

public class GradstudentsDAO extends DAO {
	public GradstudentsDAO() {

	}

	/*public Students getStudents(String email) {
		Students student = null;
		try {
			begin();
			Query q = getSession().createQuery("FROM Faculty  WHERE email = :email");
			q.setParameter("email", email);
			faculty = (Faculty) q.uniqueResult();
			commit();
			return faculty;
		} catch (HibernateException e) {
			rollback();

		}
		return faculty;
	}*/

	public GraduateStudents create(String firstName, String lastName, String emailId, String password, String studentType) {
		GraduateStudents grads = new GraduateStudents();
		try {
			begin();
			grads.setFirstName(firstName);
			grads.setLastName(lastName);
			grads.setEmail(emailId);
			grads.setPassword(password);
			grads.setStudentType(studentType);
			getSession().save(grads);

			commit();
			return grads;
		} catch (HibernateException e) {
			rollback();

		}
		return grads;
	}
 /*public void update(String email, String accountstatus)
 {
	 try
	 {
 begin();
 getSession().createQuery("Update Faculty SET accountStatus :accountStatus WHERE email = :email");
 commit(); 
	 }catch(HibernateException e)
	 {
		 
	 }rollback();
 }*/
		
	}

