package com.hina.myapp.dao;

import com.hina.myapp.pojo.Students;

import org.hibernate.HibernateException;
import org.hibernate.Query;

public class StudentsDAO extends DAO {
	public StudentsDAO() {

	}

	public Students authenticateUser(String email, String password)
	 {
		 Students student = null;
		 try {
				begin();
				Query q = getSession().createQuery("FROM Students  WHERE email = :email AND password = :password");
				q.setParameter("email", email);
				q.setParameter("password", password);
				student = (Students) q.uniqueResult();
				commit();
				return student;
			} catch (HibernateException e) {
				rollback();

			}
			return student;
	 }
	public Students getStudDetails(int studentId) {
		Students student =null;
		try {
			begin();
			Query q = getSession().createQuery("FROM Students  WHERE studentId =:studentId");
			q.setParameter("studentId", studentId);
			student = (Students) q.uniqueResult();
			commit();
			return student;
		} catch (HibernateException e) {
			rollback();

		}
		return student;
	}
	public Students validating(String email) {
		Students student =null;
		try {
			begin();
			Query q = getSession().createQuery("FROM Students  WHERE email =:email");
			q.setParameter("email", email);
			student = (Students) q.uniqueResult();
			commit();
			return student;
		} catch (HibernateException e) {
			rollback();

		}
		return student;
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

