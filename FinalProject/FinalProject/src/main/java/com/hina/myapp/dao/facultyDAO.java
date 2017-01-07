package com.hina.myapp.dao;

import com.hina.myapp.pojo.Faculty;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.stereotype.Component;
@Component
public class facultyDAO extends DAO {
	public facultyDAO() {

	}

	public Faculty getFac(String email) {
		Faculty faculty = null;
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
	}
	public Faculty getFacDetails(int facultyId) {
		Faculty faculty = null;
		try {
			begin();
			Query q = getSession().createQuery("FROM Faculty  WHERE facultyId = :facultyId");
			q.setParameter("facultyId", facultyId);
			faculty = (Faculty) q.uniqueResult();
			commit();
			return faculty;
		} catch (HibernateException e) {
			rollback();

		}
		return faculty;
	}
 public Faculty authenticateUser(String email, String password)
 {
	 Faculty faculty = null;
	 try {
			begin();
			Query q = getSession().createQuery("FROM Faculty  WHERE email = :email AND password = :password");
			q.setParameter("email", email);
			q.setParameter("password", password);
			faculty = (Faculty) q.uniqueResult();
			commit();
			return faculty;
		} catch (HibernateException e) {
			rollback();

		}
		return faculty;
 }
	public Faculty create(String firstName, String lastName, String emailId, String password) {
		Faculty faculty = new Faculty();
		try {
			begin();
			faculty.setFirstName(firstName);
			faculty.setLastName(lastName);
			faculty.setEmail(emailId);
			faculty.setPassword(password);
			faculty.setAccountStatus("inactive");
			getSession().save(faculty);

			commit();
			return faculty;
		} catch (HibernateException e) {
			rollback();

		}
		return faculty;
	}
 public void update(String email, String accountstatus)
 {
	 try
	 {
 begin();
 getSession().createQuery("Update Faculty SET accountStatus :accountStatus WHERE email = :email");
 commit(); 
	 }catch(HibernateException e)
	 {
		 
	 }rollback();
 }
		
	}

