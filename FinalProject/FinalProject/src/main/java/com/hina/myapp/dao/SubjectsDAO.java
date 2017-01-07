package com.hina.myapp.dao;

import com.hina.myapp.pojo.Subjects;
import com.hina.myapp.pojo.Courses;
import com.hina.myapp.pojo.Faculty;

import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.springframework.stereotype.Component;
@Component
public class SubjectsDAO extends DAO {
	public SubjectsDAO() {

	}
	  @SuppressWarnings("unchecked")
	public List<Subjects> getSubjectDetails(Faculty faculty) { 
		  List<Subjects> subjects = null;
		  try {
				begin();
				Query q = getSession().createQuery("FROM Subjects WHERE faculty =:faculty");
				q.setParameter("faculty", faculty);
				 subjects = q.list();
				commit();
				return subjects;
			} catch (HibernateException e) {
				rollback();
			}
			return subjects;
			}
	 
	public Subjects create(String name,Courses course, Faculty f) {
		Subjects sub = new Subjects();
		try {
			begin();
			sub.setSubjectName(name);
			sub.setCourses(course);
			sub.setFaculty(f);
			getSession().save(sub);

			commit();
			return sub;
		} catch (HibernateException e) {
			rollback();

		}
  
		return sub;
	}
	public int getSubjectId(Faculty fac, String subjectName)
	{ int id =0;
		try{
			begin();
			Query q1 = getSession().createQuery("SELECT subjectId FROM Subjects WHERE faculty =:fac AND subjectName =:subjectName");
		   q1.setParameter("fac",fac);
		   q1.setParameter("subjectName", subjectName);
		   id = (Integer) q1.uniqueResult();
		   return id;}
		   catch (HibernateException e) {
				rollback();}
		return id;

		}
		
	
	 public void updateField(String levelType, int courseDuration, int subjectId)
     {
    	try{
    		begin();
    		Query q1 = getSession().createQuery("UPDATE Subjects SET levelType =:levelType  WHERE subjectId =:subjectId");		
    		q1.setParameter("levelType", levelType);
    		//q1.setParameter("courseDuration", courseDuration);
    		q1.setParameter("subjectId", subjectId);
    		q1.executeUpdate();
    		Query q2 = getSession().createQuery("UPDATE Subjects SET courseDuration =:courseDuration  WHERE subjectId =:subjectId");		
    		q2.setParameter("courseDuration", courseDuration);
    		//q1.setParameter("courseDuration", courseDuration);
    		q2.setParameter("subjectId", subjectId);
    		q2.executeUpdate();
    		commit();
    	} catch (HibernateException e) {
			rollback();
		}
    	} 
	 public List<Subjects> getGradSubjects()
	 {
		 List<Subjects> subjects = null;
		 try{
			 begin();
			 Query q = getSession().createQuery("FROM Subjects where levelType =:levelType");
		      q.setString("levelType","high");
		      subjects = q.list();
		      return subjects;
		 }catch(HibernateException e)
		 {
			 rollback();
		 }
		 return subjects;
	 }
	 public List<Subjects> getUnderGradSubjects()
	 {
		 List<Subjects> subjects = null;
		 try{
			 begin();
			 Query q = getSession().createQuery("FROM Subjects where levelType =:levelType");
		      q.setString("levelType","low");
		      subjects = q.list();
		      return subjects;
		 }catch(HibernateException e)
		 {
			 rollback();
		 }
		 return subjects;
	 }
	 public List<Subjects> getSearchResults(String criteria)
	 {
		 List<Subjects> searchResult = null;
		 try{
			 begin();
			 Query q = getSession().createQuery("FROM Subjects WHERE subjectName LIKE :criteria");
		      q.setParameter("criteria","%"+criteria+"%");
		      searchResult = q.list();
		      return searchResult;
		 }catch(HibernateException e)
		 { 
			 rollback();
		 }
		 return searchResult; 
	 }
	 public List<Subjects> getSearchedResult(String s,int duration )
	 {
		 List<Subjects> subs = null;
		 try{
			 begin();
			 Query q = getSession().createQuery("FROM Subjects WHERE subjectName LIKE :s AND courseDuration =:duration");
		      q.setParameter("s","%"+s+"%");
		      q.setParameter("duration", duration);
		      subs = q.list();
		      return subs;
		 }catch(HibernateException e)
		 { 
			 rollback();
		 }
		 return subs;
	 }
}

