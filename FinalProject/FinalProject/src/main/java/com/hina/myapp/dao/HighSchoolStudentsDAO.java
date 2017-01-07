package com.hina.myapp.dao;

import com.hina.myapp.pojo.HighSchoolStudents;
import org.hibernate.HibernateException;

public class HighSchoolStudentsDAO extends DAO {
	public HighSchoolStudentsDAO() {

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

	public HighSchoolStudents create(String firstName, String lastName, String emailId, String password, String studentType) {
		HighSchoolStudents highschool = new HighSchoolStudents();
		try {
			begin();
			highschool.setFirstName(firstName);
			highschool.setLastName(lastName);
			highschool.setEmail(emailId);
			highschool.setPassword(password);
			highschool.setStudentType(studentType);
			getSession().save(highschool);

			commit();
			return highschool;
		} catch (HibernateException e) {
			rollback();

		}
		return highschool;
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

